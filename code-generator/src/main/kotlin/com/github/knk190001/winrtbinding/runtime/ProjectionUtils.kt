package com.github.knk190001.winrtbinding.runtime

import com.github.knk190001.winrtbinding.generator.mapFirst
import com.github.knk190001.winrtbinding.runtime.abi.*
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.NativeFunctionMarker
import com.github.knk190001.winrtbinding.runtime.annotations.ReceiveArray
import com.github.knk190001.winrtbinding.runtime.com.IAgileObject
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.interop.*
import com.sun.jna.*
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.Guid.REFIID
import com.sun.jna.platform.win32.Win32Exception
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.platform.win32.WinNT
import com.sun.jna.platform.win32.WinNT.HANDLE
import com.sun.jna.platform.win32.WinNT.HRESULT
import com.sun.jna.ptr.IntByReference
import com.sun.jna.ptr.PointerByReference
import com.sun.jna.win32.StdCallLibrary
import java.lang.foreign.*
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Int
import kotlin.String
import kotlin.math.max
import kotlin.reflect.*
import kotlin.reflect.full.*
import kotlin.reflect.jvm.isAccessible
import kotlin.reflect.jvm.jvmErasure

val WinRT = JNAApiInterface.INSTANCE

interface JNAApiInterface : StdCallLibrary {
    fun RoActivateInstance(filter: HANDLE, pref: PointerByReference): HRESULT
    fun RoGetActivationFactory(
        activatableClassId: HANDLE,
        iid: Guid.REFIID,
        factory: PointerByReference
    ): HRESULT

    fun RoInitialize(initType: Int): HRESULT
    fun RoGetParameterizedTypeInstanceIID(
        nameElementCount: WinDef.UINT,
        nameElements: Pointer,
        metadataLocator: Pointer?,
        iid: Guid.GUID.ByReference,
        pExtra: Pointer?
    ): HRESULT

    fun WindowsCreateString(sourceString: WString, length: Int, string: WinNT.HANDLEByReference): HRESULT
    fun WindowsDeleteString(hstring: HANDLE?): Int

    fun WindowsGetStringRawBuffer(str: HANDLE, length: IntByReference): WString

    companion object {
        val INSTANCE = Native.load(
            "combase",
            JNAApiInterface::class.java
        ) as JNAApiInterface
    }
}

fun checkHR(hr: HRESULT) {
    if (hr.toInt() != 0) {
        System.err.println("Native Error: 0x${hr.toInt().toUInt().toString(16)}")
        throw Win32Exception(hr)
    }
}

fun String.toHandle(): HANDLE {
    val wString = WString(this)
    val handleByReference = WinNT.HANDLEByReference()
    val hr = JNAApiInterface.INSTANCE.WindowsCreateString(wString, this.length, handleByReference)
    return handleByReference.value
}

fun HANDLE.handleToString(): String {
    val ibr = IntByReference()
    val wstr = JNAApiInterface.INSTANCE.WindowsGetStringRawBuffer(this, ibr)
    return wstr.toString()
}

private val typeMapper = WinRTTypeMapper()

class WinRTTypeMapper : DefaultTypeMapper() {
    init {
        val booleanConverter: TypeConverter = object : TypeConverter {
            override fun toNative(value: Any, context: ToNativeContext): Any {
                return if (value as Boolean) {
                    1
                } else {
                    0
                }.toByte()
            }

            override fun fromNative(value: Any, context: FromNativeContext): Boolean {
                return (value as Byte).toInt() != 0
            }

            override fun nativeType(): Class<*>? {
                return Byte::class.javaPrimitiveType
            }

        }

        val stringConverter: TypeConverter = object : TypeConverter {
            override fun toNative(value: Any, context: ToNativeContext): HANDLE {
                val str = value as String
                return str.toHandle()
            }

            override fun fromNative(value: Any, context: FromNativeContext): String {
                val handle = value as HANDLE
                return handle.handleToString()
            }

            override fun nativeType(): Class<*> {
                return Pointer::class.java
            }

        }

        val boxedLongConverter: TypeConverter = object : TypeConverter {
            override fun toNative(value: Any, context: ToNativeContext): LongArray {
                val longs = value as Array<Long>
                return longs.toLongArray()
            }

            override fun fromNative(value: Any, context: FromNativeContext): Array<Long> {
                val array = value as LongArray
                return array.toTypedArray()
            }

            override fun nativeType(): Class<*> {
                return LongArray::class.java
            }

        }
        val boxedFloatArrayConverter: TypeConverter = object : TypeConverter {
            override fun toNative(value: Any, context: ToNativeContext): FloatArray {
                val longs = value as Array<Float>
                return longs.toFloatArray()
            }

            override fun fromNative(value: Any, context: FromNativeContext): Array<Float> {
                val array = value as FloatArray
                return array.toTypedArray()
            }

            override fun nativeType(): Class<*> {
                return FloatArray::class.java
            }

        }

        addTypeConverter(Boolean::class.javaPrimitiveType, booleanConverter)
        addTypeConverter(String::class.java, stringConverter)
        addTypeConverter(Array<Long>::class.java, boxedLongConverter)
        addTypeConverter(Array<Float>::class.java, boxedFloatArrayConverter)
        addTypeConverter(UByte::class.java, abiTypeConverter<UByte, Byte>())
        addTypeConverter(UShort::class.java, abiTypeConverter<UShort, Short>())
        addTypeConverter(UInt::class.java, abiTypeConverter<UInt, Int>())
        addTypeConverter(ULong::class.java, abiTypeConverter<ULong, Long>())
    }
}

inline fun <reified T : Any, reified R : Any> abiTypeConverter(): TypeConverter {
    @Suppress("UNCHECKED_CAST") val abi = abiOf<T>() as IABI<T, R>
    return object : TypeConverter {
        override fun toNative(value: Any, context: ToNativeContext): R {
            return abi.toNative(value as T)
        }

        override fun fromNative(value: Any, context: FromNativeContext): T {
            return abi.fromNative(value as R)
        }

        override fun nativeType(): Class<*> {
            return R::class.java
        }

    }
}

fun Guid.GUID.ByReference.getValue(): Guid.GUID {
    return this
}

typealias JNAPointer = Pointer

val iUnknownIID = IUnknown.ABI.IID
val iAgileObjectIID = IAgileObject.ABI.IID

val String.Companion.ABI: IABI<String?, MemorySegment>
    get() = StringABI

fun guidFromNative(segment: MemorySegment): Guid.IID {
    return Guid.IID(Pointer(segment.address()))
}

inline fun <reified T : Any> abiOf(): IBaseABI<*, *> {
    return abiOf(T::class)
}

fun <T : Any> abiOf(kClass: KClass<T>): IBaseABI<*, *> {
    val abi = abiPolyfillMap[kClass]
    if (abi != null) {
        return abi
    }
    val abiMarker = kClass.findAnnotation<ABIMarker>()
        ?: throw IllegalArgumentException("Type: $kClass doesn't have an ABI")

    val objectInstance = abiMarker.abiClass.objectInstance!!
    return objectInstance as IBaseABI<*, *>
}

inline fun <reified T : Any> layoutOf(): MemoryLayout {
    val abi = abiOf<T>()
    return abi.layout
}

fun <T : Any> layoutOf(kClass: KClass<T>): MemoryLayout {
    if (kClass == MemorySegment::class) return ValueLayout.ADDRESS
    if (kClass == String::class) return ValueLayout.ADDRESS
    val abi = abiOf(kClass)
    return abi.layout
}


inline fun <reified T> arrayFromNative(size: Int, address: MemorySegment): Array<T> {
    return arrayFromNative(typeOf<T>(), size, address)
}

@Suppress("UNCHECKED_CAST")
fun <T> arrayFromNative(type: KType, size: Int, address: MemorySegment): Array<T> {
    val kClass = type.jvmErasure
    val array = java.lang.reflect.Array.newInstance(kClass.java, size) as Array<T>
    readArrayFromPtr(type, address, array)
    return array
}

@Suppress("UNCHECKED_CAST")
fun <T> readArrayFromPtr(type: KType, segment: MemorySegment, into: Array<T>) {
    if (segment.address() == 0L) {
        return
    }
    val kClass = type.jvmErasure
    val abi = abiOf(kClass)
    val layout = abi.layout
    val resizedSegment = segment.reinterpret(layout.byteSize() * into.size)
    into.indices
        .map { resizedSegment.asSlice(layout.byteSize() * it) }
        .map {
            when (abi) {
                is IABI -> (abi as IABI<Any, Any>).fromNative(readLayout(layout, it))
                is IParameterizedABI -> (abi as IParameterizedABI<Any, Any>).fromNative(type, readLayout(layout, it))
            } as T
        }.forEachIndexed { index, value ->
            into[index] = value
        }
}

fun readLayout(layout: MemoryLayout, segment: MemorySegment): Any {
    return when (layout) {
        is GroupLayout -> segment
        is AddressLayout -> segment[ValueLayout.ADDRESS, 0]
        is ValueLayout.OfBoolean -> segment[ValueLayout.JAVA_BYTE, 0]
        is ValueLayout.OfByte -> segment[ValueLayout.JAVA_BYTE, 0]
        is ValueLayout.OfChar -> segment[ValueLayout.JAVA_CHAR, 0]
        is ValueLayout.OfDouble -> segment[ValueLayout.JAVA_DOUBLE, 0]
        is ValueLayout.OfFloat -> segment[ValueLayout.JAVA_FLOAT, 0]
        is ValueLayout.OfInt -> segment[ValueLayout.JAVA_INT, 0]
        is ValueLayout.OfLong -> segment[ValueLayout.JAVA_LONG, 0]
        is ValueLayout.OfShort -> segment[ValueLayout.JAVA_SHORT, 0]
        else -> IllegalArgumentException("Unrecognized layout type: $layout")
    }
}


@Suppress("UNCHECKED_CAST")
fun arrayToNative(type: KType, array: Array<*>): MemorySegment {
    val abi = abiOf(type.jvmErasure) as IBaseABI<Any?, Any?>
    val nativeArray = Arena.global().allocate(abi.layout, array.size.toLong())

    writeArrayTo(type, array, nativeArray)
    return nativeArray
}


fun writeArrayTo(componentType: KType, array: Array<*>, buffer: MemorySegment) {
    val abi = abiOf(componentType.jvmErasure) as IBaseABI<Any?, Any?>
    val nativeValues = array.map {
        if (abi.layout == ValueLayout.ADDRESS && it == null) Pointer.NULL
        else abi.toNative(it)
    }

    array.indices
        .filter { array[it] != null }
        .associateWith { it * abi.layout.byteSize() }
        .mapValues { buffer.address() + it.value }
        .mapValues { MemorySegment.ofAddress(it.value) }
        .mapKeys { nativeValues[it.key] }
        .forEach(abi::copyTo)
}


fun KType.javaForeignType(): Class<*> {
    val kClass = this.classifier as KClass<*>
    kClass.findAnnotation<ABIMarker>()
        ?: return when (kClass) {
            UShort::class -> Short::class.javaPrimitiveType!!
            UByte::class -> Byte::class.javaPrimitiveType!!
            UInt::class -> Int::class.javaPrimitiveType!!
            ULong::class -> Long::class.javaPrimitiveType!!
            Float::class -> Float::class.javaPrimitiveType!!
            Double::class -> Double::class.javaPrimitiveType!!
            Boolean::class -> Byte::class.javaPrimitiveType!!
            Short::class -> Short::class.javaPrimitiveType!!
            Int::class -> Int::class.javaPrimitiveType!!
            Long::class -> Long::class.javaPrimitiveType!!
            Unit::class -> throw IllegalArgumentException("The foreign type of <Unit> doesn't exist")
            String::class -> MemorySegment::class.java
            IUnknown::class -> MemorySegment::class.java
            Byte::class -> Byte::class.javaPrimitiveType!!
            Guid.GUID::class -> MemorySegment::class.java
            Char::class -> Char::class.javaPrimitiveType!!
            MemorySegment::class -> MemorySegment::class.java
            MemorySegment::class -> MemorySegment::class.java
            PointerTo::class -> MemorySegment::class.java
            Any::class -> MemorySegment::class.java
            else -> throw NotImplementedError("Type: $kClass is not handled")
        }
    if (kClass.java.isEnum) {
        return Int::class.javaPrimitiveType!!
    }
    if (isSubtypeOf(typeOf<Structure>())) {
        return MemorySegment::class.java
    }

    return MemorySegment::class.java
}

fun MethodType.toFunctionDescriptor(
    promoteReturnToParameter: Boolean = false,
    addThisObjParam: Boolean = true
): FunctionDescriptor {

    val parameters = parameterList()
    val returnType = returnType()
    val isVoid = returnType == Void.TYPE
    val returnParam = if (promoteReturnToParameter && !isVoid) listOf(ValueLayout.ADDRESS) else emptyList()
    val thisParam = if (addThisObjParam) listOf(ValueLayout.ADDRESS) else emptyList()
    val foreignParameterTypes = (parameters.drop(1).map {
        layoutOf(it.kotlin)
    }.let {
        thisParam + it + returnParam
    }).toTypedArray()

    val foreignReturnType = if (promoteReturnToParameter) ValueLayout.JAVA_INT else layoutOf(returnType.kotlin)
    return FunctionDescriptor.of(foreignReturnType, *foreignParameterTypes)
}

fun KFunction<*>.toFunctionDescriptor(): FunctionDescriptor {
    val returnSizeParam = if (hasAnnotation<ReceiveArray>()) listOf(ValueLayout.ADDRESS) else emptyList()
    val returnParam =
        if (returnType.jvmErasure == Unit::class) emptyList()
        else returnSizeParam + listOf(ValueLayout.ADDRESS)
    val thisParam = listOf(ValueLayout.ADDRESS)
    val foreignParameterTypes = (parameters.drop(1).flatMap {
        if (it.type.isSubtypeOf(typeOf<Array<*>>())) {
            listOf(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        } else if (it.hasAnnotation<ReceiveArray>()) {
            listOf(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        } else {
            listOf(layoutOf(it.type.jvmErasure))
        }
    }.let {
        thisParam + it + returnParam
    }).toTypedArray()

    return FunctionDescriptor.of(ValueLayout.JAVA_INT, *foreignParameterTypes)
}

val getValueFn = Pointer::class.functions.single {
    it.name == "getValue"
}.apply {
    isAccessible = true
}

inline fun <reified T> Pointer.getValue(offset: Long, currentValue: T): T? {
    return getValueFn.call(this, offset, T::class.java, currentValue) as T?
}

val ptr: JNAPointer? = Pointer.NULL

fun transformParameterizedHandle(ktype: KType, bindType: Boolean): Pair<MethodHandle, FunctionDescriptor> {
    val kClass = ktype.classifier as KClass<*>
    val nativeHandleProperty = kClass.companionObject!!.declaredMemberProperties
        .single { it.getter.hasAnnotation<NativeFunctionMarker>() }

    val handle = (nativeHandleProperty as KProperty1<Any, MethodHandle>)
        .get(kClass.companionObject!!.objectInstance!!)
    val bodyIndex = if (bindType) 1 else 0
    val funInterface = handle.type().parameterType(bodyIndex)
    val delegateMethod = funInterface.kotlin.declaredFunctions.single()
    return transformParameterizedHandle(ktype, delegateMethod, handle, bindType, funInterface.kotlin)
}

fun transformParameterizedHandle(
    kType: KType,
    fn: KFunction<*>,
    handle: MethodHandle,
    bindType: Boolean = abiOf(kType.jvmErasure) is IParameterizedNativeHandleProvider,
    receiverType: KClass<*> = kType.jvmErasure
): Pair<MethodHandle, FunctionDescriptor> {
    val kClass = kType.jvmErasure
    val reifiedTypeParameters = kType.arguments.map { it.type }
    val reifiedTypeMap = kClass.typeParameters
        .zip(reifiedTypeParameters)
        .associate { (typeParam, reifiedType) ->
            typeParam.name to reifiedType
        }

    val reifiedParameters = fn.parameters.flatMap {
        val paramType = it.type
        when (paramType.classifier) {
            is KTypeParameter -> listOf(it.type.reify(reifiedTypeMap))
            else -> {
                if (paramType.jvmErasure == Array::class) listOf(typeOf<Int>(), typeOf<MemorySegment>())
                else if (paramType.jvmErasure == MutableList::class && it.hasAnnotation<ReceiveArray>()) listOf(
                    typeOf<MemorySegment>(),
                    typeOf<MemorySegment>()
                )
                else listOf(it.type)
            }
        }
    }.drop(1)

    val descriptorReturnParam =
        if (fn.returnType == typeOf<Unit>()) listOf<Class<*>>()
        else if (fn.hasAnnotation<ReceiveArray>()) listOf(MemorySegment::class.java, MemorySegment::class.java)
        else listOf(MemorySegment::class.java)
    val handleTypes = reifiedParameters.map { it.javaForeignType() }

    val descriptorMethodType =
        MethodType.methodType(
            Int::class.javaPrimitiveType,
            receiverType.java,
            MemorySegment::class.java,
            *(handleTypes + descriptorReturnParam).toTypedArray()
        )

    val bound = if (bindType) {
        handle.bindTo(kType)
    } else {
        handle
    }

    return MethodHandles.explicitCastArguments(bound, descriptorMethodType) to
            descriptorMethodType.toFunctionDescriptor(promoteReturnToParameter = false, addThisObjParam = false)
}


private fun KType.reify(typeMap: Map<String, KType?>): KType {
    return when (classifier) {
        is KTypeParameter -> typeMap[(classifier as KTypeParameter).name]!!
        is KClass<*> -> {
            val kClass = classifier as KClass<*>
            val reifiedArguments = arguments
                .map { it.type!!.reify(typeMap) }
                .map { KTypeProjection(KVariance.INVARIANT, it!!) }
            kClass.createType(reifiedArguments)
        }

        else -> {
            throw NotImplementedError("Classifier: $this is not handled")
        }
    }
}

fun MemorySegment.toPointer(): Pointer {
    return Pointer(this.address())
}

fun Pointer?.toMemorySegment(): MemorySegment {
    if (this == Pointer.NULL) return MemorySegment.NULL
    return MemorySegment.ofAddress(Pointer.nativeValue(this))
}

fun Callback.toFunctionPointer(): Pointer {
    return CallbackReference.getFunctionPointer(this)
}

fun <T> readReceiveArrayIntoList(type: KType, size: IntByReference, ptr: PointerByReference, list: MutableList<T>) {
    val abi = abiOf(type.jvmErasure)
    val bufferSize = abi.layout.byteSize() * size.value
    val segment = ptr.value.toMemorySegment().reinterpret(bufferSize)
    segment.elements(abi.layout).toList()
        .map {
            @Suppress("UNCHECKED_CAST")
            it as T
        }
        .forEach(list::add)

}

@JvmName("readReceiveArrayIntoListULong")
fun <T> readReceiveArrayIntoList(type: KType, size: PointerTo<ULong>, ptr: PointerTo<PointerTo<*>>, list: MutableList<T>) {
    val abi = abiOf(type.jvmErasure)
    val bufferSize = abi.layout.byteSize() * size.value.toLong()
    val segment = ptr.value.segment.reinterpret(bufferSize)
    segment.elements(abi.layout).toList()
        .map {
            @Suppress("UNCHECKED_CAST")
            it as T
        }
        .forEach(list::add)

}

fun <T> readReceiveArrayIntoList(type: KType, size: PointerTo<Int>, ptr: PointerTo<PointerTo<*>>, list: MutableList<T>) {
    val abi = abiOf(type.jvmErasure)
    val bufferSize = abi.layout.byteSize() * size.value.toLong()
    val segment = ptr.value.segment.reinterpret(bufferSize)
    segment.elements(abi.layout).toList()
        .map {
            @Suppress("UNCHECKED_CAST")
            it as T
        }
        .forEach(list::add)

}

fun <T> writeListIntoBuffer(type: KType, size: MemorySegment, buffer: MemorySegment, list: MutableList<T>) {
    val abi = abiOf(type.jvmErasure) as IBaseABI<T, Any?>
    val array = Arena.global().allocate(abi.layout.byteSize() * list.size)

    size[ValueLayout.JAVA_INT, 0] = list.size
    buffer[ValueLayout.ADDRESS, 0] = array

    list.mapIndexed { idx, it -> idx to it }
        .mapFirst { it * abi.layout.byteSize() }
        .mapFirst { buffer.address() + it }
        .forEach { (index, it) -> abi.copyTo(it, MemorySegment.ofAddress(index)) }
}

@Suppress("UNCHECKED_CAST")
inline fun <reified T : Any> IUnknown.cast(): T {
    val refiid = REFIID(guidOf<T>())
    val abi = abiOf<T>()
    val casted = this.QueryInterface(refiid)
    if (abi is IParameterizedABI) {
        return (abi as IParameterizedABI<T, MemorySegment>).fromNative(
            typeOf<T>(),
            casted.iUnknown_Ptr.toMemorySegment()
        )

    } else if (abi is IABI) {
        return (abi as IABI<T, MemorySegment>).fromNative(casted.iUnknown_Ptr.toMemorySegment())
    }
    throw IllegalArgumentException("Unsupported ABI type: $abi")
}

inline fun <reified T : Any> IUnknown.instanceOf(): Boolean {
    val refiid = REFIID(guidOf<T>())

    val obj = try {
        println("Instance of check: ${typeOf<T>().jvmErasure.qualifiedName}")
        this.QueryInterface(refiid)
    } catch (e: Exception) {
        println("Instance of check failed")
        return false
    }
    obj.Release()
    return true
}

fun structLayoutWithPadding(vararg fields: MemoryLayout): StructLayout {
    var totalSize: Long = 0
    var maxAlignment: Long = 1
    val newLayout = fields.flatMap { memoryLayout ->
        val size = memoryLayout.byteSize()
        val alignment = memoryLayout.byteAlignment()

        val paddingSize = if (totalSize % alignment != 0L) {
            alignment - (totalSize % alignment)
        } else 0L
        val padding = if (paddingSize != 0L) {
            MemoryLayout.paddingLayout(paddingSize)
        } else null
        totalSize += size + paddingSize
        maxAlignment = max(alignment, maxAlignment)
        listOfNotNull(memoryLayout, padding)
    }

    val tailPadding = if (totalSize % maxAlignment != 0L) {
        val paddingSize = maxAlignment - (totalSize % maxAlignment)
        MemoryLayout.paddingLayout(paddingSize)
    } else null

    val structLayout = MemoryLayout.structLayout(*(newLayout + listOfNotNull(tailPadding)).toTypedArray())

    return structLayout
}

fun addRefOutgoing(kType: KType, addr: MemorySegment) {
    val address = addr.reinterpret(ValueLayout.ADDRESS.byteSize())
    val abi = abiOf(kType.jvmErasure) as IBaseABI<Any?, Any?>
    if (address == MemorySegment.NULL) return
    if (!kType.isSubtypeOf(typeOf<IUnknown>())) return
    val objAddr = address[ValueLayout.ADDRESS, 0]
    if (objAddr == MemorySegment.NULL) return
    val obj = when (abi) {
        is IParameterizedABI -> {
            abi.fromNative(kType, objAddr)
        }

        is IABI -> {
            abi.fromNative(objAddr)
        }
    }
    if (obj is IUnknown) {
        obj.AddRef()
    }
}

fun <T, R> memoize(fn: (T) -> R): (T) -> R {
    val cache = mutableMapOf<T, R>()
    return { arg ->
        cache.getOrPut(arg) {
            fn(arg)
        }
    }
}

fun CallScope.nativeRepresentation(obj: Any?, type: KType): Any {
    val abi = abiOf(type.jvmErasure) as IBaseABI<Any?, Any>
    if (abi is IParameterizedNativePeerProvider && obj != type.jvmErasure.isInstance(obj)) {
        val nativePeer = abi.makeNativePeer(type, obj) as IUnknown
        nativePeer.AddRef()
        onScopeExit {
            nativePeer.Release()
        }
        return abi.toNative(nativePeer)
    } else if (abi is IAnyABI) {
        val native = abi.box(obj)
        native?.AddRef()
        onScopeExit {
            native?.Release()
        }
        return native?.iUnknown_Ptr.toMemorySegment()
    }
    return abi.toNative(obj)
}

