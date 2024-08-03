package com.github.knk190001.winrtbinding.runtime.delegate

import java.lang.foreign.Arena
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout

class DelegateVtbl(val segment: MemorySegment) {
    constructor(arena: Arena) : this(arena.allocate(layout))

    var queryInterface: MemorySegment
        get() = queryInterfaceVarHandle.get(segment, 0L) as MemorySegment
        set(value) = queryInterfaceVarHandle.set(segment, 0L, value)

    var addRef: MemorySegment
        get() = addRefVarHandle.get(segment, 0L) as MemorySegment
        set(value) = addRefVarHandle.set(segment, 0L, value)

    var release: MemorySegment
        get() = releaseVarHandle.get(segment, 0L) as MemorySegment
        set(value) = releaseVarHandle.set(segment, 0L, value)

    var invoke: MemorySegment
        get() = invokeVarHandle.get(segment, 0L) as MemorySegment
        set(value) = invokeVarHandle.set(segment, 0L, value)

    companion object {
        val layout: MemoryLayout = MemoryLayout.structLayout(
            ValueLayout.ADDRESS.withName("queryInterface"),
            ValueLayout.ADDRESS.withName("addRef"),
            ValueLayout.ADDRESS.withName("release"),
            ValueLayout.ADDRESS.withName("invoke")
        )

        private val queryInterfaceVarHandle = layout.varHandle(
            MemoryLayout.PathElement.groupElement("queryInterface")
        )

        private val addRefVarHandle = layout.varHandle(
            MemoryLayout.PathElement.groupElement("addRef")
        )

        private val releaseVarHandle = layout.varHandle(
            MemoryLayout.PathElement.groupElement("release")
        )

        private val invokeVarHandle = layout.varHandle(
            MemoryLayout.PathElement.groupElement("invoke")
        )
    }
}