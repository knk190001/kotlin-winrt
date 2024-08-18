package com.github.knk190001.winrtbinding.runtime.objects

import com.github.knk190001.winrtbinding.runtime.abi.IABI
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.delegate.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.structLayoutWithPadding
import java.lang.foreign.AddressLayout
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout

@ABIMarker(IInspectableVtbl.ABI::class)
open class IInspectableVtbl(segment: MemorySegment): IUnknownVtbl(segment) {
    override val segment: MemorySegment = segment.reinterpret(layout.byteSize())

    private val getIidsVarHandle = layout.varHandle(
        MemoryLayout.PathElement.groupElement("getIids")
    )

    private val getRuntimeClassNameVarHandle = layout.varHandle(
        MemoryLayout.PathElement.groupElement("getRuntimeClassName")
    )

    private val getTrustLevelVarHandle = layout.varHandle(
        MemoryLayout.PathElement.groupElement("getTrustLevel")
    )

    var getIids: MemorySegment
        get() = getIidsVarHandle.get(segment, 0L) as MemorySegment
        set(value) = getIidsVarHandle.set(segment, 0L, value)

    var getRuntimeClassName: MemorySegment
        get() = getRuntimeClassNameVarHandle.get(segment, 0L) as MemorySegment
        set(value) = getRuntimeClassNameVarHandle.set(segment, 0L, value)

    var getTrustLevel: MemorySegment
        get() = getTrustLevelVarHandle.get(segment, 0L) as MemorySegment
        set(value) = getTrustLevelVarHandle.set(segment, 0L, value)

    companion object {
        val layout = structLayoutWithPadding(
            IUnknownVtbl.layout,
            ValueLayout.ADDRESS.withName("getIids"),
            ValueLayout.ADDRESS.withName("getRuntimeClassName"),
            ValueLayout.ADDRESS.withName("getTrustLevel"),
        )
    }

    object ABI: IABI<IInspectableVtbl, MemorySegment> {
        override val layout: AddressLayout = ValueLayout.ADDRESS

        override fun fromNative(obj: MemorySegment): IInspectableVtbl {
            return IInspectableVtbl(obj)
        }

        override fun toNative(obj: IInspectableVtbl): MemorySegment {
            return obj.segment
        }
    }
}
