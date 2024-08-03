package com.github.knk190001.winrtbinding.runtime.objects

import com.github.knk190001.winrtbinding.runtime.structLayoutWithPadding
import java.lang.foreign.Arena
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout

class Vtbl(methodCount: Long, val segment: MemorySegment) {
    val layout: MemoryLayout = vtblLayoutWithLength(methodCount)

    constructor(arena: Arena, methodCount: Long) :
            this(methodCount,arena.allocate(vtblLayoutWithLength(methodCount)))

    private val queryInterfaceVarHandle = layout.varHandle(
        MemoryLayout.PathElement.groupElement("queryInterface")
    )

    private val addRefVarHandle = layout.varHandle(
        MemoryLayout.PathElement.groupElement("addRef")
    )

    private val releaseVarHandle = layout.varHandle(
        MemoryLayout.PathElement.groupElement("release")
    )

    private val getIidsVarHandle = layout.varHandle(
        MemoryLayout.PathElement.groupElement("getIids")
    )

    private val getRuntimeClassNameVarHandle = layout.varHandle(
        MemoryLayout.PathElement.groupElement("getRuntimeClassName")
    )

    private val getTrustLevelVarHandle = layout.varHandle(
        MemoryLayout.PathElement.groupElement("getTrustLevel")
    )

    private val methodsVarHandle = layout.varHandle(
        MemoryLayout.PathElement.groupElement("methods"),
        MemoryLayout.PathElement.sequenceElement(),
    )

    var queryInterface: MemorySegment
        get() = queryInterfaceVarHandle.get(segment, 0L) as MemorySegment
        set(value) = queryInterfaceVarHandle.set(segment, 0L, value)

    var addRef: MemorySegment
        get() = addRefVarHandle.get(segment, 0L) as MemorySegment
        set(value) = addRefVarHandle.set(segment, 0L, value)

    var release: MemorySegment
        get() = releaseVarHandle.get(segment, 0L) as MemorySegment
        set(value) = releaseVarHandle.set(segment, 0L, value)

    var getIids: MemorySegment
        get() = getIidsVarHandle.get(segment, 0L) as MemorySegment
        set(value) = getIidsVarHandle.set(segment, 0L, value)

    var getRuntimeClassName: MemorySegment
        get() = getRuntimeClassNameVarHandle.get(segment, 0L) as MemorySegment
        set(value) = getRuntimeClassNameVarHandle.set(segment, 0L, value)

    var getTrustLevel: MemorySegment
        get() = getTrustLevelVarHandle.get(segment, 0L) as MemorySegment
        set(value) = getTrustLevelVarHandle.set(segment, 0L, value)

    operator fun get(index: Int): MemorySegment {
        return methodsVarHandle.get(segment, 0L, index.toLong()) as MemorySegment
    }

    operator fun set(index: Int, value: MemorySegment) {
        methodsVarHandle.set(segment, 0L, index.toLong(), value)
    }

    companion object {
        fun vtblLayoutWithLength(length: Long): MemoryLayout {
            return structLayoutWithPadding(
                ValueLayout.ADDRESS.withName("queryInterface"),
                ValueLayout.ADDRESS.withName("addRef"),
                ValueLayout.ADDRESS.withName("release"),
                ValueLayout.ADDRESS.withName("getIids"),
                ValueLayout.ADDRESS.withName("getRuntimeClassName"),
                ValueLayout.ADDRESS.withName("getTrustLevel"),
                MemoryLayout.sequenceLayout(length, ValueLayout.ADDRESS).withName("methods")
            )
        }
    }
}
