package com.github.knk190001.winrtbinding.runtime.delegate

import com.github.knk190001.winrtbinding.runtime.abi.IABI
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import java.lang.foreign.AddressLayout
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout

@ABIMarker(IUnknownVtbl.ABI::class)
open class IUnknownVtbl(segment: MemorySegment) {
    open val segment: MemorySegment = segment.reinterpret(layout.byteSize())

    var queryInterface: MemorySegment
        get() = queryInterfaceVarHandle.get(segment, 0L) as MemorySegment
        set(value) = queryInterfaceVarHandle.set(segment, 0L, value)

    var addRef: MemorySegment
        get() = addRefVarHandle.get(segment, 0L) as MemorySegment
        set(value) = addRefVarHandle.set(segment, 0L, value)

    var release: MemorySegment
        get() = releaseVarHandle.get(segment, 0L) as MemorySegment
        set(value) = releaseVarHandle.set(segment, 0L, value)

    companion object {
        val layout: MemoryLayout = MemoryLayout.structLayout(
            ValueLayout.ADDRESS.withName("queryInterface"),
            ValueLayout.ADDRESS.withName("addRef"),
            ValueLayout.ADDRESS.withName("release")
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
    }

    object ABI: IABI<IUnknownVtbl, MemorySegment> {
        override val layout: AddressLayout = ValueLayout.ADDRESS

        override fun fromNative(obj: MemorySegment): IUnknownVtbl {
            return IUnknownVtbl(obj)
        }

        override fun toNative(obj: IUnknownVtbl): MemorySegment {
            return obj.segment
        }
    }
}