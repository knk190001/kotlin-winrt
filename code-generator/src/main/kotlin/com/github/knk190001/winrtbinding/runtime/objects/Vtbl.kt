package com.github.knk190001.winrtbinding.runtime.objects

import com.github.knk190001.winrtbinding.runtime.abi.IABI
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.structLayoutWithPadding
import java.lang.foreign.*

@ABIMarker(Vtbl.ABI::class)
class Vtbl(methodCount: Long, segment: MemorySegment): IInspectableVtbl(segment) {
    val layout: MemoryLayout = vtblLayoutWithLength(methodCount)
    override val segment: MemorySegment = segment.reinterpret(layout.byteSize())

    constructor(arena: Arena, methodCount: Long) :
            this(methodCount,arena.allocate(vtblLayoutWithLength(methodCount)))

    private val methodsVarHandle = layout.varHandle(
        MemoryLayout.PathElement.groupElement("methods"),
        MemoryLayout.PathElement.sequenceElement(),
    )


    operator fun get(index: Int): MemorySegment {
        return methodsVarHandle.get(segment, 0L, index.toLong()) as MemorySegment
    }

    operator fun set(index: Int, value: MemorySegment) {
        methodsVarHandle.set(segment, 0L, index.toLong(), value)
    }

    fun withMethodCount(size: Long): Vtbl {
        return Vtbl(size, segment)
    }

    companion object {
        fun vtblLayoutWithLength(length: Long): MemoryLayout {
            return structLayoutWithPadding(
                layout,
                MemoryLayout.sequenceLayout(length, ValueLayout.ADDRESS).withName("methods")
            )
        }
    }

    object ABI: IABI<Vtbl, MemorySegment> {
        override val layout: AddressLayout = ValueLayout.ADDRESS

        override fun fromNative(obj: MemorySegment): Vtbl {
            return Vtbl(0, obj)
        }

        override fun toNative(obj: Vtbl): MemorySegment {
            return obj.segment
        }
    }
}
