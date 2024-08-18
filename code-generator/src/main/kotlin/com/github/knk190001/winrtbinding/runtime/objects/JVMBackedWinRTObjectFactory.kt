package com.github.knk190001.winrtbinding.runtime.objects

import com.github.knk190001.winrtbinding.generator.guidToSignatureFormat
import com.github.knk190001.winrtbinding.runtime.abi.IABI
import com.github.knk190001.winrtbinding.runtime.abi.INativeHandleProvider
import com.github.knk190001.winrtbinding.runtime.abi.IParameterizedABI
import com.github.knk190001.winrtbinding.runtime.abi.IParameterizedNativeHandleProvider
import com.github.knk190001.winrtbinding.runtime.abiOf
import com.github.knk190001.winrtbinding.runtime.annotations.AggregateImplements
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.ObjectImplements
import com.github.knk190001.winrtbinding.runtime.base.ICompositionReference
import com.github.knk190001.winrtbinding.runtime.base.ReferenceManager
import com.github.knk190001.winrtbinding.runtime.com.IInspectable
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.TrustLevel
import com.github.knk190001.winrtbinding.runtime.interop.GUIDABI
import com.github.knk190001.winrtbinding.runtime.interop.ObjectPtr
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.vtbl
import com.github.knk190001.winrtbinding.runtime.transformParameterizedHandle
import com.sun.jna.platform.win32.WinNT
import java.lang.foreign.*
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.ref.WeakReference
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.KMutableProperty
import kotlin.reflect.KType
import kotlin.reflect.full.*
import kotlin.reflect.jvm.javaMethod
import kotlin.reflect.jvm.jvmErasure

object JVMBackedWinRTObjectFactory {
    private object RootObjectMethods {
        private val queryInterfaceHandle = lookup.unreflect(::queryInterface.javaMethod)
        private val addRefHandle = lookup.unreflect(::addRef.javaMethod)
        private val releaseHandle = lookup.unreflect(::release.javaMethod)
        private val getIidsHandle = lookup.unreflect(::getIids.javaMethod)
        private val getRuntimeClassNameHandle = lookup.unreflect(::getRuntimeClassName.javaMethod)
        private val getTrustLevelHandle = lookup.unreflect(::getTrustLevel.javaMethod)

        val queryInterfaceStub: MemorySegment = linker.upcallStub(
            queryInterfaceHandle,
            FunctionDescriptor.of(
                ValueLayout.JAVA_INT,
                ValueLayout.ADDRESS.withTargetLayout(JVMBackedObjectStruct.approximateLayout),
                ValueLayout.ADDRESS.withTargetLayout(GUIDABI.layout),
                ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
            ),
            globalArena
        )

        val addRefStub: MemorySegment = linker.upcallStub(
            addRefHandle,
            FunctionDescriptor.of(
                ValueLayout.JAVA_INT,
                ValueLayout.ADDRESS.withTargetLayout(JVMBackedObjectStruct.approximateLayout)
            ),
            globalArena
        )

        val releaseStub: MemorySegment = linker.upcallStub(
            releaseHandle,
            FunctionDescriptor.of(
                ValueLayout.JAVA_INT,
                ValueLayout.ADDRESS.withTargetLayout(JVMBackedObjectStruct.approximateLayout)
            ),
            globalArena
        )
        val getIidsStub: MemorySegment = linker.upcallStub(
            getIidsHandle,
            FunctionDescriptor.of(
                ValueLayout.JAVA_INT,
                ValueLayout.ADDRESS.withTargetLayout(JVMBackedObjectStruct.approximateLayout),
                ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG),
                ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
            ),
            globalArena
        )

        val getRuntimeClassNameStub: MemorySegment = linker.upcallStub(
            getRuntimeClassNameHandle,
            FunctionDescriptor.of(
                ValueLayout.JAVA_INT,
                ValueLayout.ADDRESS.withTargetLayout(JVMBackedObjectStruct.approximateLayout),
                ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
            ),
            globalArena
        )
        val getTrustLevelStub: MemorySegment = linker.upcallStub(
            getTrustLevelHandle,
            FunctionDescriptor.of(
                ValueLayout.JAVA_INT,
                ValueLayout.ADDRESS.withTargetLayout(JVMBackedObjectStruct.approximateLayout),
                ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
            ),
            globalArena
        )

        val queryInterfaceDCH = linker.downcallHandle(
            FunctionDescriptor.of(
                ValueLayout.JAVA_INT,
                ValueLayout.ADDRESS,
                ValueLayout.ADDRESS,
                ValueLayout.ADDRESS
            )
        )

        @JvmStatic
        fun queryInterface(thisPtr: MemorySegment, refiid: MemorySegment, ppvObject: MemorySegment): Int {
            val objectStruct = JVMBackedObjectStruct(thisPtr)
            val requestedIID = GUIDABI.fromNative(refiid)
            val reference = ReferenceManager.getBackingObject(thisPtr.address()) as? ICompositionReference
            updateInner(objectStruct, reference)
            println(
                "QueryInterface on ${objectStruct.className} at 0x${
                    objectStruct.segment.address().toString(16)
                }: " + requestedIID.toGuidString().guidToSignatureFormat()
            )
            ppvObject.set(ValueLayout.ADDRESS, 0L, MemorySegment.NULL)

            if (requestedIID == IUnknown.ABI.IID || requestedIID == IInspectable.ABI.IID) {
                objectStruct.incrementRefCountAtomic()
                ppvObject.set(ValueLayout.ADDRESS, 0L, thisPtr)
                return 0
            }

            if (requestedIID !in objectStruct.metadata!!.interfaces) {
                if (objectStruct.inner == MemorySegment.NULL) return WinNT.E_NOTIMPL
                return queryInterfaceInner(objectStruct, refiid, ppvObject)
            }

            objectStruct.incrementRefCountAtomic()
            ppvObject.set(ValueLayout.ADDRESS, 0L, objectStruct[requestedIID].segment)
            return 0
        }

        private fun updateInner(objectStruct: JVMBackedObjectStruct, reference: ICompositionReference?) {
            if (objectStruct.inner == MemorySegment.NULL && reference != null) {
                objectStruct.inner = reference.inner ?: MemorySegment.NULL
            }
        }

        private fun queryInterfaceInner(
            objectStruct: JVMBackedObjectStruct,
            refiid: MemorySegment,
            ppvObject: MemorySegment
        ): Int {
            val queryInterfaceFnPtr = ObjectPtr(objectStruct.inner).vtbl.queryInterface
            val result = queryInterfaceDCH.invoke(queryInterfaceFnPtr, objectStruct.inner, refiid, ppvObject) as Int
            return if (result != 0) WinNT.E_NOTIMPL else 0
        }

        @JvmStatic
        fun addRef(thisPtr: MemorySegment): Int {
            val objectStruct = JVMBackedObjectStruct(thisPtr)
            println("AddRef on ${objectStruct.className} at 0x${objectStruct.segment.address().toString(16)}")
            val refCount = objectStruct.incrementRefCountAtomic() + 1
            println("RefCount: $refCount")
            if (refCount == 2) ReferenceManager.setStrong(thisPtr.address())
            return refCount

        }

        @JvmStatic
        fun release(thisPtr: MemorySegment): Int {
            val objectStruct = JVMBackedObjectStruct(thisPtr)
            println("Release on ${objectStruct.className} at 0x${objectStruct.segment.address().toString(16)}")
            val refCount = objectStruct.decrementRefCountAtomic() - 1
            println("RefCount: $refCount")
            if (refCount == 1) ReferenceManager.setWeak(thisPtr.address())
            return refCount
        }

        @JvmStatic
        fun getIids(thisPtr: MemorySegment, iidCount: MemorySegment, result: MemorySegment): Int {
            val objectStruct = JVMBackedObjectStruct(thisPtr)
            val metadata = objectStruct.metadata!!
            val interfaceCount = metadata.interfaces.size
            val resultLayout = MemoryLayout.sequenceLayout(interfaceCount.toLong(), GUIDABI.layout)
            val resultBuffer = Arena.global().allocate(resultLayout)
            val resultSliceHandle = resultLayout.sliceHandle(
                MemoryLayout.PathElement.sequenceElement()
            )


            objectStruct.metadata.interfaces
                .map(GUIDABI::toNative)
                .forEachIndexed { index, guid ->
                    val slice = resultSliceHandle.invoke(resultBuffer, 0L, index.toLong()) as MemorySegment
                    slice.copyFrom(guid)
                }

            iidCount.set(ValueLayout.JAVA_LONG, 0L, interfaceCount.toLong())
            result.set(ValueLayout.ADDRESS, 0L, resultBuffer)
            return 0
        }

        @JvmStatic
        fun getRuntimeClassName(thisPtr: MemorySegment, result: MemorySegment): Int {
            val objectStruct = JVMBackedObjectStruct(thisPtr)
            result.set(ValueLayout.ADDRESS, 0L, objectStruct.classNameAsHandle)
            return 0
        }

        @JvmStatic
        fun getTrustLevel(thisPtr: MemorySegment, result: MemorySegment): Int {
            result.set(ValueLayout.JAVA_INT, 0L, TrustLevel.PartialTrust.value)
            return 0
        }
    }

    private object InterfaceMethods {
        private val queryInterfaceHandle = lookup.unreflect(::queryInterface.javaMethod)
        private val addRefHandle = lookup.unreflect(::addRef.javaMethod)
        private val releaseHandle = lookup.unreflect(::release.javaMethod)
        private val getIidsHandle = lookup.unreflect(::getIids.javaMethod)
        private val getRuntimeClassNameHandle = lookup.unreflect(::getRuntimeClassName.javaMethod)
        private val getTrustLevelHandle = lookup.unreflect(::getTrustLevel.javaMethod)

        val queryInterfaceStub: MemorySegment = linker.upcallStub(
            queryInterfaceHandle,
            FunctionDescriptor.of(
                ValueLayout.JAVA_INT,
                ValueLayout.ADDRESS.withTargetLayout(JVMBackedInterfaceStruct.layout),
                ValueLayout.ADDRESS.withTargetLayout(GUIDABI.layout),
                ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
            ),
            globalArena
        )

        val addRefStub: MemorySegment = linker.upcallStub(
            addRefHandle,
            FunctionDescriptor.of(
                ValueLayout.JAVA_INT,
                ValueLayout.ADDRESS.withTargetLayout(JVMBackedInterfaceStruct.layout)
            ),
            globalArena
        )

        val releaseStub: MemorySegment = linker.upcallStub(
            releaseHandle,
            FunctionDescriptor.of(
                ValueLayout.JAVA_INT,
                ValueLayout.ADDRESS.withTargetLayout(JVMBackedInterfaceStruct.layout)
            ),
            globalArena
        )

        val getIidsStub: MemorySegment = linker.upcallStub(
            getIidsHandle,
            FunctionDescriptor.of(
                ValueLayout.JAVA_INT,
                ValueLayout.ADDRESS.withTargetLayout(JVMBackedInterfaceStruct.layout),
                ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG),
                ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
            ),
            globalArena
        )

        val getRuntimeClassNameStub: MemorySegment = linker.upcallStub(
            getRuntimeClassNameHandle,
            FunctionDescriptor.of(
                ValueLayout.JAVA_INT,
                ValueLayout.ADDRESS.withTargetLayout(JVMBackedInterfaceStruct.layout),
                ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
            ),
            globalArena
        )

        val getTrustLevelStub: MemorySegment = linker.upcallStub(
            getTrustLevelHandle,
            FunctionDescriptor.of(
                ValueLayout.JAVA_INT,
                ValueLayout.ADDRESS.withTargetLayout(JVMBackedInterfaceStruct.layout),
                ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
            ),
            globalArena
        )

        @JvmStatic
        fun queryInterface(thisPtr: MemorySegment, refiid: MemorySegment, ppvObject: MemorySegment): Int {
            val interfaceStruct = JVMBackedInterfaceStruct(thisPtr)
            return RootObjectMethods.queryInterface(interfaceStruct.rootObjectPtr, refiid, ppvObject)
        }

        @JvmStatic
        fun addRef(thisPtr: MemorySegment): Int {
            val interfaceStruct = JVMBackedInterfaceStruct(thisPtr)
            return RootObjectMethods.addRef(interfaceStruct.rootObjectPtr)
        }

        @JvmStatic
        fun release(thisPtr: MemorySegment): Int {
            val interfaceStruct = JVMBackedInterfaceStruct(thisPtr)
            return RootObjectMethods.release(interfaceStruct.rootObjectPtr)
        }

        @JvmStatic
        fun getIids(thisPtr: MemorySegment, iidCount: MemorySegment, result: MemorySegment): Int {
            val interfaceStruct = JVMBackedInterfaceStruct(thisPtr)
            return RootObjectMethods.getIids(interfaceStruct.rootObjectPtr, iidCount, result)
        }

        @JvmStatic
        fun getRuntimeClassName(thisPtr: MemorySegment, result: MemorySegment): Int {
            val interfaceStruct = JVMBackedInterfaceStruct(thisPtr)
            return RootObjectMethods.getRuntimeClassName(interfaceStruct.rootObjectPtr, result)
        }

        @JvmStatic
        fun getTrustLevel(thisPtr: MemorySegment, result: MemorySegment): Int {
            val interfaceStruct = JVMBackedInterfaceStruct(thisPtr)
            return RootObjectMethods.getTrustLevel(interfaceStruct.rootObjectPtr, result)
        }
    }

    private val linker = Linker.nativeLinker()
    private val lookup = MethodHandles.lookup()
    private val globalArena = Arena.global()

    fun create(obj: IUnknown): MemorySegment {
        val arena = Arena.ofShared()
        val nativeVisibleInterfaces = getNativeVisibleInterfaces(obj)
        val typeVtblHandePairs = nativeVisibleInterfaces.map { getTypeAndHandlesForInterface(obj, it) }
        val guidVtblSizePairs = typeVtblHandePairs.map { (type, handles) ->
            val guid = guidOf(type).toGuidString()
            val methodCount = handles.size.toLong()
            guid to methodCount
        }

        val objectPeer = JVMBackedObjectStruct(guidVtblSizePairs, arena)
        objectPeer.vtbl.queryInterface = RootObjectMethods.queryInterfaceStub
        objectPeer.vtbl.addRef = RootObjectMethods.addRefStub
        objectPeer.vtbl.release = RootObjectMethods.releaseStub
        objectPeer.vtbl.getIids = RootObjectMethods.getIidsStub
        objectPeer.vtbl.getRuntimeClassName = RootObjectMethods.getRuntimeClassNameStub
        objectPeer.vtbl.getTrustLevel = RootObjectMethods.getTrustLevelStub

        objectPeer.refCount = 1
        objectPeer.className = obj::class.qualifiedName!!
        if (!containsClassMetadata(objectPeer.className)) {
            val layout = objectPeer.layout
            val interfaces = typeVtblHandePairs
                .map { it.first }
                .map { guidOf(it) }
                .toSet()

            val classMetadata = ClassMetadata(layout, interfaces)
            addClassMetadata(objectPeer.className, classMetadata)
        }

        if (obj is ICompositionReference) {
            objectPeer.inner = obj.inner ?: MemorySegment.NULL
        }

        typeVtblHandePairs.forEach { (type, handles) ->
            val interfacePeer = objectPeer[guidOf(type)]
            populateInterfaceStruct(obj, interfacePeer, type, handles, objectPeer.segment, arena)
        }

        println("Instantiated ${objectPeer.className} at 0x${objectPeer.segment.address().toString(16)}")

        ReferenceManager.removeOnGC(obj, objectPeer.segment.address())
        ReferenceManager.registerArena(arena, objectPeer.segment.address())
        ReferenceManager.registerBackingObject(obj, objectPeer.segment.address())

        return objectPeer.segment
    }

    private fun populateInterfaceStruct(
        obj: Any,
        interfaceStruct: JVMBackedInterfaceStruct,
        kType: KType,
        indexHandleMap: Map<Int, MethodHandle>,
        rootObjectPointer: MemorySegment,
        arena: Arena
    ): JVMBackedInterfaceStruct {
        val kClass = kType.jvmErasure
        val abi = abiOf(kClass)
        val guid = guidOf(kType)
        val functions = kClass.functionsAndPropertiesSortedByVtblIndex()

        interfaceStruct.rootObjectPtr = rootObjectPointer
        interfaceStruct.iid = guid
        interfaceStruct.methodCount = indexHandleMap.size.toLong()
        interfaceStruct.isParameterized = abi is IParameterizedABI<*, *>

        interfaceStruct.vtbl.queryInterface = InterfaceMethods.queryInterfaceStub
        interfaceStruct.vtbl.addRef = InterfaceMethods.addRefStub
        interfaceStruct.vtbl.release = InterfaceMethods.releaseStub
        interfaceStruct.vtbl.getIids = InterfaceMethods.getIidsStub
        interfaceStruct.vtbl.getRuntimeClassName = InterfaceMethods.getRuntimeClassNameStub
        interfaceStruct.vtbl.getTrustLevel = InterfaceMethods.getTrustLevelStub

        indexHandleMap.forEach { (index, _) ->
            val (typeBound, descriptor) = transformParameterizedHandle(
                kType,
                functions[index],
                indexHandleMap[index]!!,
                interfaceStruct.isParameterized
            )
            val thisBound = typeBound.weakBindTo(obj)
            val upcallStub = linker.upcallStub(thisBound, descriptor, arena)
            interfaceStruct.vtbl[index] = upcallStub
        }
        return interfaceStruct
    }

    private fun MethodHandle.weakBindTo(receiver: Any): MethodHandle {
        val weakRef = WeakReference(receiver)
        val lookup = MethodHandles.lookup()
        val dereferenceHandle = lookup.unreflect(WeakReference<Any>::get.javaMethod)
        val castedHandle = asType(type().changeParameterType(0, Object::class.java))

        return MethodHandles.filterArguments(castedHandle, 0, dereferenceHandle).bindTo(weakRef)
    }

    private fun getNativeVisibleInterfaces(obj: Any): List<KClass<*>> {
        val objectInterfaces = obj::class.findAnnotation<ObjectImplements>()
        if (objectInterfaces != null) return objectInterfaces.interfaces.toList()
        val aggregateInterfaces = obj::class.findAnnotation<AggregateImplements>()!!
        return aggregateInterfaces.interfaces.toList()
    }

    private fun getTypeAndHandlesForInterface(
        obj: Any,
        interfaceClass: KClass<*>
    ): Pair<KType, Map<Int, MethodHandle>> {
        val abi = abiOf(interfaceClass)
        return when (abi) {
            is IParameterizedABI<*, *> -> getTypeAndHandleFromParameterizedABI(obj, abi)
            is IABI<*, *> -> getTypeAndHandleFromABI(interfaceClass, abi)
            else -> throw IllegalArgumentException("ABI must implement IABI or IParameterizedABI")
        }
    }

    private fun getTypeAndHandleFromABI(kClass: KClass<*>, provider: IABI<*, *>): Pair<KType, Map<Int, MethodHandle>> {
        return kClass.createType() to (provider as INativeHandleProvider).handles
    }

    @Suppress("UNCHECKED_CAST")
    private fun getTypeAndHandleFromParameterizedABI(
        obj: Any,
        abi: IParameterizedABI<*, *>
    ): Pair<KType, Map<Int, MethodHandle>> {
        if (abi !is IParameterizedNativeHandleProvider) throw IllegalArgumentException("ABI must implement IParameterizedNativeHandleProvider")
        val castedABI = abi as IParameterizedABI<Any, Any>
        val type = castedABI.getType(obj)
        return type to abi.handles
    }

    private val classMetadata = mutableMapOf<String, ClassMetadata>()

    fun getClassMetadata(className: String): ClassMetadata? {
        return classMetadata[className]
    }

    private fun containsClassMetadata(className: String): Boolean {
        return classMetadata.containsKey(className)
    }

    private fun addClassMetadata(className: String, metadata: ClassMetadata) {
        classMetadata[className] = metadata
    }

    private fun KClass<*>.functionsAndPropertiesSortedByVtblIndex(): List<KFunction<*>> {
        return (declaredFunctions + declaredMemberProperties.flatMap {
            listOfNotNull(it.getter, (it as? KMutableProperty<*>)?.setter)
        }).filter {
            it.hasAnnotation<InterfaceMethod>()
        }.sortedBy {
            it.findAnnotation<InterfaceMethod>()!!.methodIndex
        }
    }

}