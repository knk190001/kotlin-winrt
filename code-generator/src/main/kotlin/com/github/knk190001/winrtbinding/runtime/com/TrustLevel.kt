package com.github.knk190001.winrtbinding.runtime.com

import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped

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
}