package com.github.knk190001.winrtbinding.runtime.interop

import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.base.IBaseABI
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.github.knk190001.winrtbinding.runtime.toPointer
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid.GUID
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.platform.win32.WinDef.USHORT
import com.sun.jna.platform.win32.WinNT.HANDLE
import java.lang.foreign.*
import kotlin.reflect.KClass

val abiPolyfillMap = mapOf<KClass<*>, IBaseABI<*, *>>(
    String::class to StringABI,
    USHORT::class to UShortABI,
    WinDef.UINT::class to UIntABI,
    WinDef.ULONG::class to ULongABI,
    Float::class to FloatABI,
    Double::class to DoubleABI,
    Boolean::class to BooleanABI,
    Short::class to ShortABI,
    Int::class to IntABI,
    Long::class to LongABI,
    Byte::class to ByteABI,
    GUID::class to GUIDABI,
    Char::class to CharABI,
)

object StringABI: IABI<String, MemoryAddress> {
    override fun fromNative(obj: MemoryAddress): String {
        return HANDLE(obj.toPointer()).handleToString()
    }

    override val layout: MemoryLayout
        get() = ValueLayout.ADDRESS

    override fun toNative(obj: String): MemoryAddress {
        return MemoryAddress.ofLong(Pointer.nativeValue(obj.toHandle().pointer))
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
        return GUID(Pointer(obj.address().toRawLongValue()))
    }

    override val layout: MemoryLayout
        get() = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_SHORT,
            ValueLayout.JAVA_SHORT,
            ValueLayout.JAVA_LONG
        )

    override fun toNative(obj: GUID): MemorySegment {
        val address = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
        return MemorySegment.ofAddress(address, layout.byteSize(), MemorySession.global())
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



