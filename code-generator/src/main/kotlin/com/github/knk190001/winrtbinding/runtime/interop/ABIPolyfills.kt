package com.github.knk190001.winrtbinding.runtime.interop

import com.github.knk190001.winrtbinding.runtime.*
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.base.IBaseABI
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid.GUID
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.platform.win32.WinDef.USHORT
import com.sun.jna.platform.win32.WinNT.HANDLE
import java.lang.foreign.*
import kotlin.reflect.KClass

const val AnyABIClass = "com.github.knk190001.winrtbinding.runtime.AnyABI"
@Suppress("UNCHECKED_CAST")
val AnyABI = Class.forName(AnyABIClass).kotlin.objectInstance as IABI<Any, MemorySegment>

val abiPolyfillMap = mapOf<KClass<*>, IBaseABI<*, *>>(
    String::class to StringABI,
    UByte::class to UByteABI,
    UShort::class to UShortABI,
    UInt::class to UIntABI,
    ULong::class to ULongABI,
    Float::class to FloatABI,
    Double::class to DoubleABI,
    Boolean::class to BooleanABI,
    Short::class to ShortABI,
    Int::class to IntABI,
    Long::class to LongABI,
    Byte::class to ByteABI,
    GUID::class to GUIDABI,
    Char::class to CharABI,
    Any::class to AnyABI
)

object UByteABI : IABI<UByte, Byte> {
    override fun fromNative(obj: Byte): UByte {
        return obj.toUByte()
    }

    override val layout: MemoryLayout
        get() = ValueLayout.JAVA_BYTE

    override fun toNative(obj: UByte): Byte {
        return obj.toByte()
    }
}

object StringABI: IABI<String, MemorySegment> {
    override fun fromNative(obj: MemorySegment): String {
        return HANDLE(obj.toPointer()).handleToString()
    }

    override val layout: MemoryLayout
        get() = ValueLayout.ADDRESS

    override fun toNative(obj: String): MemorySegment {
        return MemorySegment.ofAddress(Pointer.nativeValue(obj.toHandle().pointer))
    }

}

object UShortABI : IABI<UShort, Short> {
    override fun fromNative(obj: Short): UShort {
        return obj.toUShort()
    }

    override val layout: MemoryLayout
        get() = ValueLayout.JAVA_SHORT

    override fun toNative(obj: UShort): Short {
        return obj.toShort()
    }

}

object UIntABI : IABI<UInt, Int> {
    override fun fromNative(obj: Int): UInt {
        return obj.toUInt()
    }

    override val layout: MemoryLayout
        get() = ValueLayout.JAVA_INT

    override fun toNative(obj: UInt): Int {
        return obj.toInt()
    }

}

object ULongABI : IABI<ULong, Long> {
    override fun fromNative(obj: Long): ULong {
        return obj.toULong()
    }

    override val layout: MemoryLayout
        get() = ValueLayout.JAVA_LONG

    override fun toNative(obj: ULong): Long {
        return obj.toLong()
    }

}

object FloatABI : IABI<Float, Float> {
    override fun fromNative(obj: Float): Float {
        return obj
    }

    override val layout: MemoryLayout
        get() = ValueLayout.JAVA_FLOAT

    override fun toNative(obj: Float): Float {
        return obj
    }

}

object DoubleABI : IABI<Double, Double> {
    override fun fromNative(obj: Double): Double {
        return obj
    }

    override val layout: MemoryLayout
        get() = ValueLayout.JAVA_DOUBLE

    override fun toNative(obj: Double): Double {
        return obj
    }

}

object BooleanABI : IABI<Boolean, Byte> {
    override fun fromNative(obj: Byte): Boolean {
        return obj != 0.toByte()
    }

    override val layout: MemoryLayout
        get() =ValueLayout.JAVA_BYTE

    override fun toNative(obj: Boolean): Byte {
        return if ( obj ) 1 else 0
    }

}

object ShortABI : IABI<Short, Short> {
    override fun fromNative(obj: Short): Short {
        return obj
    }

    override val layout: MemoryLayout
        get() = ValueLayout.JAVA_SHORT

    override fun toNative(obj: Short): Short {
        return obj
    }

}

object IntABI : IABI<Int, Int> {
    override fun fromNative(obj: Int): Int {
        return obj
    }

    override val layout: MemoryLayout
        get() = ValueLayout.JAVA_INT

    override fun toNative(obj: Int): Int {
        return obj
    }

}

object LongABI : IABI<Long, Long> {
    override fun fromNative(obj: Long): Long {
        return obj
    }

    override val layout: MemoryLayout
        get() = ValueLayout.JAVA_LONG

    override fun toNative(obj: Long): Long {
        return obj
    }

}

object ByteABI : IABI<Byte, Byte> {
    override fun fromNative(obj: Byte): Byte {
        return obj
    }

    override val layout: MemoryLayout
        get() = ValueLayout.JAVA_BYTE

    override fun toNative(obj: Byte): Byte {
        return obj
    }

}

object GUIDABI : IABI<GUID, MemorySegment> {
    override fun fromNative(obj: MemorySegment): GUID {
        return GUID(obj.toPointer())
    }

    override val layout: MemoryLayout
        get() = structLayoutWithPadding(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_SHORT,
            ValueLayout.JAVA_SHORT,
            ValueLayout.JAVA_LONG
        )

    override fun toNative(obj: GUID): MemorySegment {
        return obj.pointer.toMemorySegment().reinterpret(layout.byteSize())
    }

}

object CharABI : IABI<Char, Char> {
    override fun fromNative(obj: Char): Char {
        return obj
    }

    override val layout: MemoryLayout
        get() = ValueLayout.JAVA_CHAR

    override fun toNative(obj: Char): Char {
        return obj
    }

}