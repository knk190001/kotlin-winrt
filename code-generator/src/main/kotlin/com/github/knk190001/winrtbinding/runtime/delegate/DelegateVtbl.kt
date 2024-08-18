package com.github.knk190001.winrtbinding.runtime.delegate

import com.github.knk190001.winrtbinding.runtime.abi.IABI
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import java.lang.foreign.*

@ABIMarker(DelegateVtbl.ABI::class)
class DelegateVtbl(segment: MemorySegment) {
    constructor(arena: Arena) : this(arena.allocate(layout))

    val segment: MemorySegment = segment.reinterpret(layout.byteSize())

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

    object ABI: IABI<DelegateVtbl, MemorySegment> {
        override val layout: AddressLayout = ValueLayout.ADDRESS

        override fun fromNative(obj: MemorySegment): DelegateVtbl {
            return DelegateVtbl(obj)
        }

        override fun toNative(obj: DelegateVtbl): MemorySegment {
            return obj.segment
        }
    }
}