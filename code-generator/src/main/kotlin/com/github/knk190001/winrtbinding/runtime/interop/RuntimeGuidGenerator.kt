package com.github.knk190001.winrtbinding.runtime.interop

import com.github.knk190001.winrtbinding.generator.guidToSignatureFormat
import com.github.knk190001.winrtbinding.runtime.annotations.GenericType
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.base.Delegate
import com.github.knk190001.winrtbinding.runtime.com.*
import com.sun.jna.Structure
import com.sun.jna.platform.win32.Guid.IID
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.platform.win32.WinDef.UINT
import com.sun.jna.platform.win32.WinDef.ULONG
import memeid.UUID
import kotlin.reflect.KClass
import kotlin.reflect.KType
import kotlin.reflect.full.*
import kotlin.reflect.typeOf
import com.github.knk190001.winrtbinding.runtime.annotations.Guid as GuidAnnotation

private val wrtPinterfaceNamespaceJava = UUID.fromString("11f47ad5-7b73-42c0-abae-878b1e16adee")

object RuntimeGuidGenerator {
    inline fun <reified T> createIID(): IID {
        return createIID(typeOf<T>())
    }

    fun createIID(type: KType): IID {
        val signature = getSignature(type)
        return UUID.V5.from(wrtPinterfaceNamespaceJava, signature).toString()
            .let { IID(it) }
    }

    fun getSignature(type: KType): String {
        if (type.isMarkedNullable) {
            return getSignature(type.withNullability(false))
        }
        when (type) {
            typeOf<IUnknown>() -> return "cinterface(IInspectable)"
            typeOf<String>() -> return "string"
            else -> {}
        }
        if (type.isValueType()) {
            return when (type) {
                typeOf<Boolean>() -> "b1"
                typeOf<Byte>() -> "i1"
                typeOf<Char>() -> "c2"
                typeOf<Double>() -> "f8"
                typeOf<IID>() -> "g16"
                typeOf<Short>() -> "i2"
                typeOf<Int>() -> "i4"
                typeOf<Long>() -> "i8"
                typeOf<Float>() -> "f4"
                typeOf<WinDef.USHORT>() -> "u2"
                typeOf<UINT>() -> "u4"
                typeOf<ULONG>() -> "u8"
                else -> {
                    if (type.isSubtypeOf(typeOf<Enum<*>>()) || type.isSubtypeOf(typeOf<Structure>())) {
                        return type.annotationOfType<Signature>()!!.signature
                    }
                    throw IllegalArgumentException("Unsupported value type: $type")
                }
            }
        } else {
            if (type.annotationOfType<GenericType>() != null) {
                if (type.annotationOfType<Signature>() != null) {
                    return type.annotationOfType<Signature>()!!.signature
                }

                return "pinterface(${type.annotationOfType<GuidAnnotation>()!!.guid.guidToSignatureFormat()};${
                    type.arguments.joinToString(";") { getSignature(it.type!!) }
                })"
            }
            if (type.isSubtypeOf(typeOf<Delegate>())) {
                return "delegate({${type.annotationOfType<GuidAnnotation>()!!.guid.guidToSignatureFormat()}})"
            }
            if (!type.isSubtypeOf(typeOf<IWinRTObject>())) {
                return type.annotationOfType<Signature>()!!.signature
            }
            return type.annotationOfType<Signature>()!!.signature
        }
    }

}

inline fun <reified T : Annotation> KType.annotationOfType(): T? {
    return (classifier as KClass<*>).findAnnotation<T>()
}

inline fun <reified T> guidOf(): IID {
    if (!T::class.hasAnnotation<GenericType>()) {
        return IID(T::class.findAnnotation<GuidAnnotation>()!!.guid)
    }
    return RuntimeGuidGenerator.createIID<T>()
}

fun guidOf(type: KType): IID {
    return RuntimeGuidGenerator.createIID(type)
}

private fun KType.isValueType(): Boolean {
    if (classifier !is KClass<*>) return false
    when (classifier as KClass<*>) {
        Boolean::class -> return true
        Byte::class -> return true
        Char::class -> return true
        Double::class -> return true
        IID::class -> return true
        Short::class -> return true
        Int::class -> return true
        Long::class -> return true
        UINT::class -> return true
        Float::class -> return true
        WinDef.USHORT::class -> return true
        UINT::class -> return true
        ULONG::class -> return true
        else -> {}
    }
    return (classifier as KClass<*>).isSubclassOf(Enum::class) ||
            (classifier as KClass<*>).isSubclassOf(Structure::class)
}