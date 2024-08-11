package com.github.knk190001.winrtbinding.runtime.interop

import com.github.knk190001.winrtbinding.runtime.*
import com.github.knk190001.winrtbinding.runtime.abi.IABI
import com.github.knk190001.winrtbinding.runtime.abi.IAnyABI
import com.github.knk190001.winrtbinding.runtime.abi.IBaseABI
import com.github.knk190001.winrtbinding.runtime.abi.ITrivialABI
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid.GUID
import com.sun.jna.platform.win32.Guid.IID
import com.sun.jna.platform.win32.WinNT.HANDLE
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import kotlin.reflect.KClass


const val AnyABIPackage = "com.github.knk190001.winrtbinding.runtime"
const val AnyABIClassName = "AnyABI"

val AnyABI = try {
    Class.forName("$AnyABIPackage.$AnyABIClassName").kotlin.objectInstance as IAnyABI
} catch (e: Exception) {
    // Fallback to a dummy implementation when testing
    object : IAnyABI {
        override fun fromNative(obj: MemorySegment): Any {
            TODO()
        }

        override val layout: MemoryLayout
            get() = ValueLayout.ADDRESS

        override fun toNative(obj: Any?): MemorySegment {
            TODO()
        }

        override fun box(value: Any?): IUnknown {
            TODO()
        }
    }
}

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

object StringABI: IABI<String?, MemorySegment> {
    override fun fromNative(obj: MemorySegment): String {
        return HANDLE(obj.toPointer()).handleToString()
    }

    override val layout: MemoryLayout
        get() = ValueLayout.ADDRESS

    override fun toNative(obj: String?): MemorySegment {
        if(obj == null) {
            return MemorySegment.NULL
        }
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

object FloatABI : ITrivialABI<Float> {
    override val layout: MemoryLayout = ValueLayout.JAVA_FLOAT
}

object DoubleABI : ITrivialABI<Double> {
    override val layout: MemoryLayout = ValueLayout.JAVA_DOUBLE
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

object ShortABI : ITrivialABI<Short> {
    override val layout: MemoryLayout = ValueLayout.JAVA_SHORT
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

object ByteABI : ITrivialABI<Byte> {
    override val layout: MemoryLayout = ValueLayout.JAVA_BYTE
}

object GUIDABI : IABI<IID, MemorySegment> {
    override fun fromNative(obj: MemorySegment): IID {
        return IID(obj.toPointer())
    }

    override val layout: MemoryLayout
        get() = structLayoutWithPadding(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_SHORT,
            ValueLayout.JAVA_SHORT,
            ValueLayout.JAVA_LONG
        )

    override fun toNative(obj: IID): MemorySegment {
        return obj.pointer.toMemorySegment().reinterpret(layout.byteSize())
    }

}

object CharABI : ITrivialABI<Char> {
    override val layout: MemoryLayout = ValueLayout.JAVA_CHAR
}