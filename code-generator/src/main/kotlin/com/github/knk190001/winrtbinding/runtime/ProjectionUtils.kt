package com.github.knk190001.winrtbinding.runtime

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.NativeFunctionMarker
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.base.IBaseABI
import com.github.knk190001.winrtbinding.runtime.base.IParameterizedABI
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.interop.*
import com.sun.jna.*
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.platform.win32.COM.IUnknown
import com.sun.jna.platform.win32.COM.Unknown
import com.sun.jna.platform.win32.Guid
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
import kotlin.Any
import kotlin.Int
import kotlin.String
import kotlin.reflect.*
import kotlin.reflect.full.*
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType
import kotlin.reflect.jvm.isAccessible
import com.sun.jna.Function as JnaFunction

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

            override fun nativeType(): Class<*>? {
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

            override fun nativeType(): Class<*>? {
                return FloatArray::class.java
            }

        }

        addTypeConverter(Boolean::class.javaPrimitiveType, booleanConverter)
        addTypeConverter(String::class.java, stringConverter)
        addTypeConverter(Array<Long>::class.java, boxedLongConverter)
        addTypeConverter(Array<Float>::class.java, boxedFloatArrayConverter)

    }
}

private val winRTOptions = mapOf<String, Any?>(
    Library.OPTION_TYPE_MAPPER to typeMapper,
    Library.OPTION_CALLING_CONVENTION to ALT_CONVENTION
)

fun JnaFunction.invokeHR(params: Array<Any?>): HRESULT {
    return this.invoke(HRESULT::class.java, params, winRTOptions) as HRESULT
}

inline fun <A : IWinRTInterface, reified T : A> Array<A>.interfaceOfType(): T {
    //Loop through the array and return the first interface that matches the type
    this.forEach {
        if (it is T) {
            return it
        }
    }
    throw IllegalArgumentException("No interface of type ${T::class.java.name} found in the array")
}

inline fun <reified T : IWinRTInterface, reified R : T> Array<T?>.castToImpl(): Array<T?> {
    @Suppress("UNCHECKED_CAST")
    return this.map {
        if (it is IWinRTObject) {
            it.interfaces.interfaceOfType() as R
        } else {
            it as R
        }
    }.toTypedArray() as Array<T?>
}

inline fun <reified T : IWinRTInterface, reified R : T> T.castToImpl(): R {
    return if (this is IWinRTObject) {
        this.interfaces.first {
            it is R
        } as R
    } else {
        this as R
    }
}

fun Guid.GUID.ByReference.getValue(): Guid.GUID {
    return this
}

fun Unknown.ByReference.setValue(unknown: Unknown) {
    this.pointer = unknown.pointer
}

typealias JNAPointer = com.sun.jna.Pointer

val iUnknownIID = IUnknown.IID_IUNKNOWN;

interface FromNativePolyfill<T> {
    fun fromNative(segment: MemoryAddress): T
}

val String.Companion.ABI: FromNativePolyfill<String>
    get() = object : FromNativePolyfill<String> {
        override fun fromNative(segment: MemoryAddress): String {
            val handle = HANDLE(Pointer(segment.toRawLongValue()))
            return handle.handleToString()
        }
    }

fun guidFromNative(segment: MemorySegment): Guid.GUID {
    val address = segment.get(ValueLayout.ADDRESS, 0)
    return Guid.GUID(Pointer(address.toRawLongValue()))
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
    if (kClass == MemoryAddress::class) return ValueLayout.ADDRESS
    val abi = abiOf(kClass)
    return abi.layout
}


inline fun <reified T> arrayFromNative(size: Int, segment: MemorySegment): Array<T> {
    return arrayFromNative(typeOf<T>(), size, segment)
}

@Suppress("UNCHECKED_CAST")
fun <T> arrayFromNative(type: KType, size: Int, segment: MemorySegment): Array<T> {
    val kClass = type.classifier as KClass<*>
    val abi = abiOf(kClass)
    val layout = abi.layout
    val resizedSegment = MemorySegment.ofAddress(segment.address(), layout.byteSize() * size, MemorySession.global())
    val array = java.lang.reflect.Array.newInstance(kClass.java, size) as Array<T>
    (0 until size).map {
        when (abi) {
            is IABI<*, *> -> {
                (abi as IABI<Any, Any>).fromNative(resizedSegment.asSlice(layout.byteSize() * it))
            }

            is IParameterizedABI<*,*> -> {
                (abi as IParameterizedABI<Any, Any>).fromNative(type, resizedSegment.asSlice(layout.byteSize() * it))
            }
        } as T
    }.forEachIndexed { index, value ->
        array[index] = value
    }
    return array
}

fun booleanFromNative(segment: MemorySegment): Boolean {
    val value = segment.get(ValueLayout.JAVA_BYTE, 0)
    return value != 0.toByte()
}

fun KType.javaForeignType(): Class<*> {
    val kClass = this.classifier as KClass<*>
    val abiAnnotation = kClass.findAnnotation<ABIMarker>()
    if (abiAnnotation == null) {
        return when (kClass) {
            WinDef.USHORT::class -> Short::class.javaPrimitiveType!!
            WinDef.UINT::class -> Int::class.javaPrimitiveType!!
            WinDef.ULONG::class -> Long::class.javaPrimitiveType!!
            Float::class -> Float::class.javaPrimitiveType!!
            Double::class -> Double::class.javaPrimitiveType!!
            Boolean::class -> Byte::class.javaPrimitiveType!!
            Short::class -> Short::class.javaPrimitiveType!!
            Int::class -> Int::class.javaPrimitiveType!!
            Long::class -> Long::class.javaPrimitiveType!!
            Unit::class -> throw IllegalArgumentException("The foreign type of <Unit> doesn't exist")
            String::class -> MemoryAddress::class.java
            IUnknown::class -> MemoryAddress::class.java
            Byte::class -> Byte::class.javaPrimitiveType!!
            Guid.GUID::class -> MemorySegment::class.java
            Char::class -> Char::class.javaPrimitiveType!!
            else -> throw NotImplementedError("Type: $kClass is not handled")
        }
    }
    if (kClass.java.isEnum) {
        return Int::class.javaPrimitiveType!!
    }
    if (isSubtypeOf(typeOf<Structure>())) {
        return MemorySegment::class.java
    }

    return MemoryAddress::class.java
}

fun MethodType.toFunctionDescriptor(): FunctionDescriptor {
    val parameters = parameterList()
    val returnType = returnType()

    val foreignParameterTypes = parameters.drop(1).map {
        layoutOf(it.kotlin)
    }.toTypedArray()

    val foreignReturnType = layoutOf(returnType.kotlin)
    return FunctionDescriptor.of(foreignReturnType, ValueLayout.ADDRESS, *foreignParameterTypes)
}

val getValueFn = Pointer::class.functions.single {
    it.name == "getValue"
}.apply {
    isAccessible = true
}

inline fun <reified T> Pointer.getValue(offset: Long, currentValue: T): T? {
    //    Object getValue(long offset, Class<?> type, Object currentValue) {
    return getValueFn.call(offset, T::class.java, currentValue) as T?
}

val ptr: JNAPointer? = Pointer.NULL

fun transformParameterizedHandle(ktype: KType): Pair<MethodHandle, FunctionDescriptor> {
    val kClass = ktype.classifier as KClass<*>
    val nativeHandleProperty = kClass.companionObject!!.declaredMemberProperties
        .single { it.getter.hasAnnotation<NativeFunctionMarker>() }

    val handle = (nativeHandleProperty as KProperty1<Any, MethodHandle>).get(kClass.companionObject!!.objectInstance!!)
    val funInterface = handle.type().parameterType(1)
    val delegateMethod = funInterface.kotlin.declaredFunctions.single()
    val reifiedTypeParameters = ktype.arguments.map { it.type }
    val reifiedTypeMap = kClass.typeParameters.zip(reifiedTypeParameters).associate { (typeParam, reifiedType) ->
        typeParam.name to reifiedType
    }

    val reifiedParameters = delegateMethod.parameters.map {
        if (it.type !is KTypeParameter) {
            it.type
        } else {
            reifiedTypeMap[(it.type as KTypeParameter).name]
        }
    }.drop(1)
    val handleTypes =
        (listOf(
            funInterface,
            MemoryAddress::class.java
        ) + reifiedParameters.map { it!!.javaForeignType() }).toTypedArray()

    val descriptorTypes = reifiedParameters
        .map { layoutOf(it!!.classifier as KClass<*>) }
        .toTypedArray()
    return MethodHandles.explicitCastArguments(
        handle.bindTo(ktype),
        MethodType.methodType(Int::class.javaPrimitiveType, handleTypes)
    ) to FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, *descriptorTypes)
}