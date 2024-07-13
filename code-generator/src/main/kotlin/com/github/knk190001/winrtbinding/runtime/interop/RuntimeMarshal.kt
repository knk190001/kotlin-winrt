package com.github.knk190001.winrtbinding.runtime.interop

import com.github.knk190001.winrtbinding.runtime.*
import com.github.knk190001.winrtbinding.runtime.base.IParameterizedNativePeerProvider
import com.github.knk190001.winrtbinding.runtime.base.IStructABI
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Structure
import com.sun.jna.platform.win32.WinNT.HANDLE
import java.lang.foreign.MemoryAddress
import kotlin.reflect.KType
import kotlin.reflect.full.withNullability
import kotlin.reflect.jvm.jvmErasure
import kotlin.reflect.typeOf


interface Marshal<T : Any, R : Any> {
    val fromType: KType
    val toType: KType

    val nativeNullValue: R?
    val managedNullValue: T?

    fun toNative(t: T): R

    fun fromNative(t: R): T

}

val marshals: List<Marshal<*, *>> = listOf(BooleanMarshal(), StringMarshal())

inline fun <reified T : Any> marshalToNative(t: T?): Any? {
    return marshalToNative(t, typeOf<T>())
}

inline fun <reified T : Any> marshalFromNative(t: Any?): T? {
    return marshalFromNative<T>(t, typeOf<T>()) as T?
}

fun <T> marshalFromNative(t: Any?, type: KType): T? {
    if (type.isMarkedNullable) {
        return marshalFromNative(t, type.withNullability(false)) as T?
    }
    if (t is ISpecializable) {
        t.specialize(type)
        return marshalFromNative<T>(t, type)
    }
    @Suppress("UNCHECKED_CAST")
    val marshal: Marshal<*, Any> = marshals.singleOrNull {
        type == it.fromType
    } as Marshal<*, Any>? ?: return t as T

    if (t == null) {
        return marshal.managedNullValue as T?
    }
    return marshal.fromNative(t) as T?
}

fun <T : Any> marshalToNative(t: T?, type: KType): Any? {
    val abi = abiOf(type.jvmErasure)
    if (t is MemoryAddress) {
        return t.toPointer()
    }
    if (t is Array<*>) {
        return arrayToNative(type, t).toPointer()
    }
    if (t is Structure && t !is Structure.ByValue ) {
        @Suppress("UNCHECKED_CAST")
        return (abi as IStructABI<T>).byValue(t)
    }
    if (type.isMarkedNullable) {
        return marshalToNative(t, type.withNullability(false))
    }
    if (!type.jvmErasure.isInstance(t) && (abi is IParameterizedNativePeerProvider)) {
        return abi.makeNativePeer(type, t)
    }
    if (type == typeOf<Any>() && t !is NativeMapped && t !is Pointer && t !is Structure) {
        return AnyABI.toNative(t as Any).toPointer()
    }

    val marshal: Marshal<T, *> = marshals.singleOrNull {
        type == it.fromType
    } as Marshal<T, *>? ?: return t

    if (t == null) {
        return marshal.nativeNullValue
    }

    return marshal.toNative(t)
}

class BooleanMarshal : Marshal<Boolean, Byte> {
    override val fromType = typeOf<Boolean>()
    override val toType = typeOf<Byte>()

    override val managedNullValue = false
    override val nativeNullValue: Byte = 0

    override fun fromNative(t: Byte): Boolean {
        return t.toInt() != 0
    }

    override fun toNative(t: Boolean): Byte {
        return if (t) 1 else 0
    }
}

class StringMarshal : Marshal<String, HANDLE> {
    override val fromType = typeOf<String>()
    override val toType = typeOf<HANDLE>()

    override val managedNullValue = ""
    override val nativeNullValue = HANDLE(Pointer.NULL)

    override fun fromNative(t: HANDLE): String {
        return t.handleToString()
    }

    override fun toNative(t: String): HANDLE {
        return t.toHandle()
    }

}