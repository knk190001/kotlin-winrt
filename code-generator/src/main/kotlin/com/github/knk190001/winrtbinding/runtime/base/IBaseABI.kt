package com.github.knk190001.winrtbinding.runtime.base

import java.lang.foreign.*

sealed interface IBaseABI<Managed, Native> {
    val layout: MemoryLayout

    fun toNative(obj: Managed): Native

    fun copyTo(obj: Managed, address: MemorySegment) {
        val resized = address.reinterpret(layout.byteSize())
        if(layout is ValueLayout) {
            when (layout) {
                is ValueLayout.OfByte -> resized[ValueLayout.JAVA_BYTE, 0] = toNative(obj) as Byte
                is ValueLayout.OfShort -> resized[ValueLayout.JAVA_SHORT, 0] = toNative(obj) as Short
                is ValueLayout.OfChar -> resized[ValueLayout.JAVA_CHAR, 0] = toNative(obj) as Char
                is ValueLayout.OfInt -> resized[ValueLayout.JAVA_INT, 0] = toNative(obj) as Int
                is ValueLayout.OfLong -> resized[ValueLayout.JAVA_LONG, 0] = toNative(obj) as Long
                is ValueLayout.OfFloat -> resized[ValueLayout.JAVA_FLOAT, 0] = toNative(obj) as Float
                is ValueLayout.OfDouble -> resized[ValueLayout.JAVA_DOUBLE, 0] = toNative(obj) as Double
                is AddressLayout -> resized[ValueLayout.ADDRESS, 0] = toNative(obj) as MemorySegment
                is GroupLayout -> {
                    val native = toNative(obj) as MemorySegment
                    val byteSize = layout.byteSize()
                    val memorySegment = native.reinterpret(byteSize)
                    memorySegment.copyFrom(native)
                }
                else -> throw IllegalArgumentException("Unsupported layout type: ${layout::class}")
            }
            return
        }
    }

}