package com.github.knk190001.winrtbinding.runtime.interop

import com.github.knk190001.winrtbinding.generator.guidToSignatureFormat
import com.github.knk190001.winrtbinding.runtime.annotations.GenericType
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.base.Delegate
import com.github.knk190001.winrtbinding.runtime.com.*
import com.sun.jna.Structure
import com.sun.jna.platform.win32.Guid.IID
import memeid.UUID
import kotlin.reflect.KClass
import kotlin.reflect.KType
import kotlin.reflect.full.*
import kotlin.reflect.jvm.jvmErasure
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
            typeOf<Any>() -> return "cinterface(IInspectable)"
            typeOf<String>() -> return "string"
            else -> {}
        }
        if (type.isValueType()) {
            return when (type) {
                typeOf<Byte>() -> "i1"
                typeOf<UByte>() -> "u1"
                typeOf<Short>() -> "i2"
                typeOf<UShort>() -> "u2"
                typeOf<Int>() -> "i4"
                typeOf<UInt>() -> "u4"
                typeOf<Long>() -> "i8"
                typeOf<ULong>() -> "u8"
                typeOf<Float>() -> "f4"
                typeOf<Double>() -> "f8"
                typeOf<Boolean>() -> "b1"
                typeOf<Char>() -> "c2"
                typeOf<IID>() -> "g16"
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
    return guidOf(typeOf<T>())
}

fun guidOf(type: KType): IID {
    if (!type.jvmErasure.hasAnnotation<GenericType>()) {
        return IID(type.annotationOfType<GuidAnnotation>()!!.guid)
    }
    return RuntimeGuidGenerator.createIID(type)
}

private fun KType.isValueType(): Boolean {
    if (classifier !is KClass<*>) return false
    when (classifier as KClass<*>) {
        Byte::class -> return true
        UByte::class -> return true
        Short::class -> return true
        UShort::class -> return true
        Int::class -> return true
        UInt::class -> return true
        Long::class -> return true
        ULong::class -> return true
        Float::class -> return true
        Double::class -> return true
        Boolean::class -> return true
        Char::class -> return true
        IID::class -> return true
        else -> {}
    }
    return (classifier as KClass<*>).isSubclassOf(Enum::class) ||
            (classifier as KClass<*>).isSubclassOf(Structure::class)
}