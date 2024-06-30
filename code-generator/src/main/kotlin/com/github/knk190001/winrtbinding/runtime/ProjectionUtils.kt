package com.github.knk190001.winrtbinding.runtime

import com.github.knk190001.winrtbinding.generator.mapFirst
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.NativeFunctionMarker
import com.github.knk190001.winrtbinding.runtime.annotations.ReceiveArray
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.base.IBaseABI
import com.github.knk190001.winrtbinding.runtime.base.IParameterizedABI
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
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
import kotlin.Int
import kotlin.String
import kotlin.reflect.*
import kotlin.reflect.full.*
import kotlin.reflect.jvm.isAccessible
import kotlin.reflect.jvm.jvmErasure
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

    }
}

private val winRTOptions = mapOf<String, Any?>(
    Library.OPTION_TYPE_MAPPER to typeMapper,
    Library.OPTION_CALLING_CONVENTION to ALT_CONVENTION
)

fun JnaFunction.invokeHR(params: Array<Any?>): HRESULT {
    println("Invoke HR: $this")
    return this.invoke(HRESULT::class.java, params, winRTOptions) as HRESULT
}

fun Guid.GUID.ByReference.getValue(): Guid.GUID {
    return this
}

fun Unknown.ByReference.setValue(unknown: Unknown) {
    this.pointer = unknown.pointer
}

typealias JNAPointer = Pointer

val iUnknownIID = IUnknown.IID_IUNKNOWN

interface FromNativePolyfill<T> {
    fun fromNative(segment: MemoryAddress): T
}

val String.Companion.ABI: IABI<String, MemoryAddress>
    get() = StringABI

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
    if (kClass == MemorySegment::class) return ValueLayout.ADDRESS
    if (kClass == String::class) return ValueLayout.ADDRESS
    val abi = abiOf(kClass)
    return abi.layout
}


inline fun <reified T> arrayFromNative(size: Int, address: MemoryAddress): Array<T> {
    return arrayFromNative(typeOf<T>(), size, address)
}

@Suppress("UNCHECKED_CAST")
fun <T> arrayFromNative(type: KType, size: Int, address: MemoryAddress): Array<T> {
    val kClass = type.jvmErasure
    val array = java.lang.reflect.Array.newInstance(kClass.java, size) as Array<T>
    readArrayFromPtr(type, address, array)
    return array
}

@Suppress("UNCHECKED_CAST")
fun <T> readArrayFromPtr(type: KType, address: MemoryAddress, into: Array<T>) {
    if (address.toRawLongValue() == 0L) {
        return
    }
    val kClass = type.jvmErasure
    val abi = abiOf(kClass)
    val layout = abi.layout
    val resizedSegment = MemorySegment.ofAddress(address, layout.byteSize() * into.size, MemorySession.global())
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
        is ValueLayout.OfAddress -> segment[ValueLayout.ADDRESS, 0]
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
fun arrayToNative(type: KType, array: Array<*>): MemoryAddress {
    val abi = abiOf(type.jvmErasure) as IBaseABI<Any?, Any?>
    val nativeArray = MemorySession.global().allocateArray(abi.layout, array.size.toLong())

    val nativeValues = array.map {
        if (abi.layout == ValueLayout.ADDRESS && it == null) Pointer.NULL else marshalToNative(it, type)
    }

    array.indices
        .filter { array[it] != null }
        .associateWith { it * abi.layout.byteSize() }
        .mapValues { nativeArray.address().addOffset(it.value) }
        .mapKeys { nativeValues[it.key] }
        .forEach(abi::copyTo)
    return nativeArray.address()
}

fun booleanFromNative(segment: MemorySegment): Boolean {
    val value = segment.get(ValueLayout.JAVA_BYTE, 0)
    return value != 0.toByte()
}

fun KType.javaForeignType(): Class<*> {
    val kClass = this.classifier as KClass<*>
    kClass.findAnnotation<ABIMarker>()
        ?: return when (kClass) {
            UShort::class -> Short::class.javaPrimitiveType!!
            UInt::class -> Int::class.javaPrimitiveType!!
            ULong::class -> Long::class.javaPrimitiveType!!
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
            MemorySegment::class -> MemorySegment::class.java
            MemoryAddress::class -> MemoryAddress::class.java
            UIntByReference::class -> MemoryAddress::class.java
            else -> throw NotImplementedError("Type: $kClass is not handled")
        }
    if (kClass.java.isEnum) {
        return Int::class.javaPrimitiveType!!
    }
    if (isSubtypeOf(typeOf<Structure>())) {
        return MemorySegment::class.java
    }

    return MemoryAddress::class.java
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
    val returnSizeParam = if(hasAnnotation<ReceiveArray>()) listOf(ValueLayout.ADDRESS) else emptyList()
    val returnParam =
        if(returnType.jvmErasure == Unit::class) emptyList()
        else returnSizeParam + listOf(ValueLayout.ADDRESS)
    val thisParam = listOf(ValueLayout.ADDRESS)
    val foreignParameterTypes = (parameters.drop(1).flatMap {
        if (it.type.isSubtypeOf(typeOf<Array<*>>())) {
            listOf(ValueLayout.JAVA_INT,ValueLayout.ADDRESS)
        }else if(it.hasAnnotation<ReceiveArray>()){
            listOf(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        } else { listOf(layoutOf(it.type.jvmErasure)) }
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
    //    Object getValue(long offset, Class<?> type, Object currentValue) {
    return getValueFn.call(this, offset, T::class.java, currentValue) as T?
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

fun MemoryAddress.toPointer(): Pointer {
    return Pointer(this.toRawLongValue())
}

fun Pointer.toMemoryAddress(): MemoryAddress {
    return MemoryAddress.ofLong(Pointer.nativeValue(this))
}

fun Callback.toFunctionPointer(): Pointer {
    return CallbackReference.getFunctionPointer(this)
}

fun <T> readReceiveArrayIntoList(type: KType, size: IntByReference, ptr: PointerByReference, list: MutableList<T>) {
    val abi = abiOf(type.jvmErasure)
    val bufferSize = abi.layout.byteSize() * size.value
    val segment = MemorySegment.ofAddress(ptr.value.toMemoryAddress(), bufferSize, MemorySession.global())
    segment.elements(abi.layout).toList()
        .map {
            @Suppress("UNCHECKED_CAST")
            it as T
        }
        .forEach(list::add)

}
fun <T> readReceiveArrayIntoList(type: KType, size: ULongByReference, ptr: PointerByReference, list: MutableList<T>) {
    val abi = abiOf(type.jvmErasure)
    val bufferSize = abi.layout.byteSize() * size.getValue().toLong()
    val segment = MemorySegment.ofAddress(ptr.value.toMemoryAddress(), bufferSize, MemorySession.global())
    segment.elements(abi.layout).toList()
        .map {
            @Suppress("UNCHECKED_CAST")
            it as T
        }
        .forEach(list::add)

}

fun <T> writeListIntoBuffer(type: KType, size:MemoryAddress, buffer:MemoryAddress, list: MutableList<T>) {
    val abi = abiOf(type.jvmErasure) as IBaseABI<T, Any?>
    val array = MemorySegment.allocateNative(abi.layout.byteSize() * list.size, MemorySession.global())

    size[ValueLayout.JAVA_INT, 0] = list.size
    buffer[ValueLayout.ADDRESS, 0] = array

    list.mapIndexed { idx, it -> idx to it}
        .mapFirst { it * abi.layout.byteSize() }
        .mapFirst { buffer.address().toRawLongValue() + it }
        .forEach { (index, it) -> abi.copyTo(it, MemoryAddress.ofLong(index)) }
}
