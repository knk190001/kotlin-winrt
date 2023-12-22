package com.github.knk190001.winrtbinding.runtime.interop

import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.COM.Unknown
import com.sun.jna.platform.win32.Guid.GUID
import com.sun.jna.platform.win32.WinDef.*
import com.sun.jna.platform.win32.WinNT.HANDLE
import com.sun.jna.platform.win32.WinNT.HANDLEByReference
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
            USHORT::class -> UShortByReference() as IByReference<T>
            UINT::class -> UIntByReference() as IByReference<T>
            ULONG::class -> ULongByReference() as IByReference<T>
            Float::class -> FloatByReference() as IByReference<T>
            Double::class -> DoubleByReference() as IByReference<T>
            Boolean::class -> BooleanByReference() as IByReference<T>
            Short::class -> ShortByReference() as IByReference<T>
            Int::class -> IntByReference() as IByReference<T>
            Long::class -> LongByReference() as IByReference<T>
            Unit::class -> throw IllegalArgumentException("ByReference<Unit> can't exist")
            String::class -> StringByReference() as IByReference<T>
            IUnknown::class -> IUnknownByReference() as IByReference<T>
            Byte::class -> ByteByReference() as IByReference<T>
            GUID::class -> GuidByReference() as IByReference<T>
            Char::class -> CharByReference() as IByReference<T>
            else -> throw NotImplementedError("Type: ${type.classifier} is not handled")
        }
    }
    val iByReference = brtAnnotation.brClass.createInstance() as IByReference<T>
    if (iByReference is ISpecializable) {
        iByReference.specialize(type)
    }
    return iByReference
}


class UShortByReference(pointer: Pointer? = null) : IByReference<USHORT>, USHORTByReference() {
    init {
        if (pointer != null) {
            this.pointer = pointer
        }
    }
}
class UIntByReference(pointer: Pointer? = null) : IByReference<UINT>, UINTByReference() {
    init {
        if (pointer != null) {
            this.pointer = pointer
        }
    }
}

class ULongByReference(pointer: Pointer? = null) : IByReference<ULONG>, ULONGByReference() {
    init {
        if (pointer != null) {
            this.pointer = pointer
        }
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
class IUnknownByReference(pointer: Pointer? = null) : IByReference<IUnknown>, IUnknown.ByReference() {
    init {
        if (pointer != null) {
            this.pointer = pointer
        }
    }
}
class ByteByReference(pointer: Pointer? = null) : IByReference<Byte>, com.sun.jna.ptr.ByteByReference() {
    init {
        if (pointer != null) {
            this.pointer = pointer
        }
    }
}
class GuidByReference(pointer: Pointer? = null) : IByReference<GUID>, GUID.ByReference() {
    override fun getValue(): GUID {
        return this
    }
}

class CharByReference(pointer: Pointer? = null) : Unknown.ByReference(), IByReference<Char> {
    override fun getValue(): Char {
        return pointer.getChar(0)
    }
}