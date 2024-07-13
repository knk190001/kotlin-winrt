package com.github.knk190001.winrtbinding.runtime.interop

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.toMemoryAddress
import com.github.knk190001.winrtbinding.runtime.toPointer
import com.sun.jna.Native
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid.GUID
import com.sun.jna.platform.win32.WinNT.HANDLE
import com.sun.jna.platform.win32.WinNT.HANDLEByReference
import com.sun.jna.ptr.ByReference
import kotlin.reflect.KType
import kotlin.reflect.full.createInstance
import kotlin.reflect.typeOf


interface IByReference<T> {
    fun getPointer(): Pointer
    fun getValue(): T
}

interface ISpecializable {
    fun specialize(type: KType)
}

inline fun <reified T> makeByReferenceType(): IByReference<T> {
    return makeByReferenceType(typeOf<T>())
}

@Suppress("UNCHECKED_CAST")
fun <T> makeByReferenceType(type: KType): IByReference<T> {
    val brtAnnotation = type.annotationOfType<WinRTByReference>()
    if (brtAnnotation == null) {
        return when (type.classifier) {
            UShort::class -> UShortByReference() as IByReference<T>
            UInt::class -> UIntByReference() as IByReference<T>
            ULong::class -> ULongByReference() as IByReference<T>
            Float::class -> FloatByReference() as IByReference<T>
            Double::class -> DoubleByReference() as IByReference<T>
            Boolean::class -> BooleanByReference() as IByReference<T>
            Short::class -> ShortByReference() as IByReference<T>
            Int::class -> IntByReference() as IByReference<T>
            Long::class -> LongByReference() as IByReference<T>
            Unit::class -> throw IllegalArgumentException("ByReference<Unit> can't exist")
            String::class -> StringByReference() as IByReference<T>
            Byte::class -> ByteByReference() as IByReference<T>
            GUID::class -> GuidByReference() as IByReference<T>
            Char::class -> CharByReference() as IByReference<T>
            Any::class -> AnyByReference() as IByReference<T>
            else -> throw NotImplementedError("Type: ${type.classifier} is not handled")
        }
    }
    val iByReference = brtAnnotation.brClass.createInstance() as IByReference<T>
    if (iByReference is ISpecializable) {
        iByReference.specialize(type)
    }
    return iByReference
}


class UShortByReference(pointer: Pointer? = null) : ByReference(2), IByReference<UShort> {
    init {
        if (pointer != null) {
            this.pointer = pointer
        }
    }

    override fun getValue(): UShort {
        return pointer.getShort(0).toUShort()
    }

    fun setValue(value: UInt) {
        pointer.setShort(0, value.toShort())
    }
}
class UIntByReference(pointer: Pointer? = null) : ByReference(4), IByReference<UInt> {
    init {
        if (pointer != null) {
            this.pointer = pointer
        }
    }

    override fun getValue(): UInt {
        return pointer.getInt(0).toUInt()
    }

    fun setValue(value: UInt) {
        pointer.setInt(0, value.toInt())
    }
}

class ULongByReference(pointer: Pointer? = null) : ByReference(4), IByReference<ULong> {
    init {
        if (pointer != null) {
            this.pointer = pointer
        }
    }

    override fun getValue(): ULong {
        return pointer.getLong(0).toULong()
    }

    fun setValue(value: UInt) {
        pointer.setLong(0, value.toLong())
    }
}
class FloatByReference(pointer: Pointer? = null) : IByReference<Float>, com.sun.jna.ptr.FloatByReference() {
    init {
        if (pointer != null) {
            this.pointer = pointer
        }
    }
}
class DoubleByReference(pointer: Pointer? = null) : IByReference<Double>, com.sun.jna.ptr.DoubleByReference() {
    init {
        if (pointer != null) {
            this.pointer = pointer
        }
    }
}
class BooleanByReference(pointer: Pointer? = null) : IByReference<Byte>, com.sun.jna.ptr.ByteByReference() {
    init {
        if (pointer != null) {
            this.pointer = pointer
        }
    }
}
class ShortByReference(pointer: Pointer? = null) : IByReference<Short>, com.sun.jna.ptr.ShortByReference() {
    init {
        if (pointer != null) {
            this.pointer = pointer
        }
    }
}
class IntByReference(pointer: Pointer? = null) : IByReference<Int>, com.sun.jna.ptr.IntByReference() {
    init {
        if (pointer != null) {
            this.pointer = pointer
        }
    }
}
class LongByReference(pointer: Pointer? = null) : IByReference<Long>, com.sun.jna.ptr.LongByReference() {
    init {
        if (pointer != null) {
            this.pointer = pointer
        }
    }
}
class StringByReference(pointer: Pointer? = null) : IByReference<HANDLE>, HANDLEByReference() {
    init {
        if (pointer != null) {
            this.pointer = pointer
        }
    }
}
@ABIMarker(IUnknown.ABI::class)
class AnyByReference(pointer: Pointer? = null) : IByReference<Any>, ByReference(Native.POINTER_SIZE) {
    init {
        if (pointer != null) {
            this.pointer = pointer
        }
    }

    override fun getValue(): Any {
        return AnyABI.fromNative(pointer.getPointer(0).toMemoryAddress())
    }

    fun setValue(value: Any) {
        pointer.setPointer(0, AnyABI.toNative(value).toPointer())
    }
}
class ByteByReference(pointer: Pointer? = null) : IByReference<Byte>, com.sun.jna.ptr.ByteByReference() {
    init {
        if (pointer != null) {
            this.pointer = pointer
        }
    }
}
class GuidByReference(pointer: Pointer? = null) : GUID.ByReference(pointer), IByReference<GUID> {
    override fun getValue(): GUID {
        return this
    }
}

class CharByReference(pointer: Pointer? = null) : ByReference(2), IByReference<Char> {
    init {
        if (pointer != null) {
            this.pointer = pointer
        }
    }
    override fun getValue(): Char {
        return pointer.getChar(0)
    }
}