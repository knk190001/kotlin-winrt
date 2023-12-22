package com.github.knk190001.winrtbinding.runtime.base

import java.lang.foreign.*

sealed interface IBaseABI<Managed, Native> {
    val layout: MemoryLayout

    fun toNative(obj: Managed): Native

    fun copyTo(obj: Managed, address: MemoryAddress) {
        if(layout is ValueLayout) {
            when (layout) {
                is ValueLayout.OfByte -> address[ValueLayout.JAVA_BYTE, 0] = toNative(obj) as Byte
                is ValueLayout.OfShort -> address[ValueLayout.JAVA_SHORT, 0] = toNative(obj) as Short
                is ValueLayout.OfChar -> address[ValueLayout.JAVA_CHAR, 0] = toNative(obj) as Char
                is ValueLayout.OfInt -> address[ValueLayout.JAVA_INT, 0] = toNative(obj) as Int
                is ValueLayout.OfLong -> address[ValueLayout.JAVA_LONG, 0] = toNative(obj) as Long
                is ValueLayout.OfFloat -> address[ValueLayout.JAVA_FLOAT, 0] = toNative(obj) as Float
                is ValueLayout.OfDouble -> address[ValueLayout.JAVA_DOUBLE, 0] = toNative(obj) as Double
                is ValueLayout.OfAddress -> address[ValueLayout.ADDRESS, 0] = toNative(obj) as MemoryAddress
                is GroupLayout -> {
                    val native = toNative(obj) as MemorySegment
                    val byteSize = (layout as GroupLayout).byteSize()
                    val memorySegment = MemorySegment.ofAddress(address, byteSize, MemorySession.global())
                    memorySegment.copyFrom(native)
                }
                else -> throw IllegalArgumentException("Unsupported layout type: ${layout::class}")
            }
            return
        }
    }

}