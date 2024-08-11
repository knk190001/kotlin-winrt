package com.github.knk190001.winrtbinding.runtime.com

import com.github.knk190001.winrtbinding.runtime.abi.IABI
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout

@ABIMarker(TrustLevel.ABI::class)
enum class TrustLevel(val value: Int) : NativeMapped {
    BasicTrust(0),
    PartialTrust(1),
    FullTrust(2);


    override fun fromNative(p0: Any?, p1: FromNativeContext?): Any {
        if (p0 !is Int) throw IllegalArgumentException()
        return when (p0) {
            0 -> BasicTrust
            1 -> PartialTrust
            2 -> FullTrust
            else -> throw IllegalArgumentException()
        }
    }

    override fun toNative(): Any {
        return this.value
    }

    override fun nativeType(): Class<*> {
        return Integer::class.java
    }

    object ABI: IABI<TrustLevel, Int> {
        override fun fromNative(obj: Int): TrustLevel {
            return when (obj) {
                0 -> TrustLevel.BasicTrust
                1 -> TrustLevel.PartialTrust
                2 -> TrustLevel.FullTrust
                else -> throw IllegalArgumentException()
            }
        }

        override val layout: MemoryLayout
            get() = ValueLayout.JAVA_INT

        override fun toNative(obj: TrustLevel): Int {
            return obj.value
        }

    }
}