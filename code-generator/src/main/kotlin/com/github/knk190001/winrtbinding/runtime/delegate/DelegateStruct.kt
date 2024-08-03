package com.github.knk190001.winrtbinding.runtime.delegate

import com.github.knk190001.winrtbinding.runtime.interop.GUIDABI
import com.github.knk190001.winrtbinding.runtime.structLayoutWithPadding
import java.lang.foreign.Arena
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout

private const val VTBL_PTR = "vtblPtr"


class DelegateStruct(val segment: MemorySegment) {
    constructor(arena: Arena) : this(arena.allocate(layout).also {
        val vtblSegment = arena.allocate(DelegateVtbl.layout)
        vtblPtrHandle.set(it, 0L, vtblSegment)
    })

    val vtbl: DelegateVtbl = DelegateVtbl(vtblPtr)

    private var vtblPtr: MemorySegment
        get() = vtblPtrHandle.get(segment, 0L) as MemorySegment
        set(value) = vtblPtrHandle.set(segment, 0L, value)

    var refCount: Int
        get() = refCountHandle.get(segment, 0L) as Int
        set(value) = refCountHandle.set(segment, 0L, value)

    var iid: MemorySegment
        get() = segment.asSlice(iidOffset, GUIDABI.layout.byteSize())
        set(value) {
            iid.copyFrom(value)
        }

    fun incrementRefCountAtomic(): Int {
        return intHandle.getAndAdd(segment, refCountOffset, 1) as Int
    }

    fun decrementRefCountAtomic(): Int {
        return intHandle.getAndAdd(segment, refCountOffset, -1) as Int
    }


    companion object {
        val layout = structLayoutWithPadding(
            ValueLayout.ADDRESS.withTargetLayout(DelegateVtbl.layout)
                .withName(VTBL_PTR),
            GUIDABI.layout.withName("iid"),
            ValueLayout.JAVA_INT.withName("refCount")
        )

        private val vtblPtrHandle = layout.varHandle(
            MemoryLayout.PathElement.groupElement(VTBL_PTR)
        )

        private val refCountHandle = layout.varHandle(
            MemoryLayout.PathElement.groupElement("refCount")
        )

        private val intHandle = ValueLayout.JAVA_INT.varHandle()

        private val refCountOffset = layout.byteOffset(
            MemoryLayout.PathElement.groupElement("refCount")
        )

        private val iidOffset = layout.byteOffset(
            MemoryLayout.PathElement.groupElement("iid")
        )
    }
}