package com.github.knk190001.winrtbinding.runtime.objects

import com.github.knk190001.winrtbinding.runtime.interop.GUIDABI
import com.github.knk190001.winrtbinding.runtime.structLayoutWithPadding
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.Guid.IID
import java.lang.foreign.Arena
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout

private const val VTBL_PTR = "vtblPtr"
private const val ROOT_OBJECT_PTR = "rootObjectPtr"
private const val IID = "iid"
private const val IS_PARAMETERIZED = "isParameterized"
private const val METHOD_COUNT = "methodCount"


class JVMBackedInterfaceStruct(val segment: MemorySegment) {
    var methodCount: Long
        get() = segment.get(ValueLayout.JAVA_LONG, methodCountOffset)
        set(value) = segment.set(ValueLayout.JAVA_LONG, methodCountOffset, value)
    val layout: MemoryLayout = peerStructLayout(methodCount)

    private val vtblPtrHandle = layout.varHandle(
        MemoryLayout.PathElement.groupElement(VTBL_PTR)
    )

    private val rootObjectPtrHandle = layout.varHandle(
        MemoryLayout.PathElement.groupElement(ROOT_OBJECT_PTR)
    )

    private val iidOffset = layout.byteOffset(
        MemoryLayout.PathElement.groupElement(IID)
    )

    private val isParameterizedHandle = layout.varHandle(
        MemoryLayout.PathElement.groupElement(IS_PARAMETERIZED)
    )

    private var vtblPtr: MemorySegment
        get() = vtblPtrHandle.get(segment, 0L) as MemorySegment
        set(value) = vtblPtrHandle.set(segment, 0L, value)

    var rootObjectPtr: MemorySegment
        get() = rootObjectPtrHandle.get(segment, 0L) as MemorySegment
        set(value) = rootObjectPtrHandle.set(segment, 0L, value)

    var iid: Guid.IID
        get() = IID(Pointer(segment.address() + iidOffset))
        set(value) {
            val iidSegment = segment.asSlice(iidOffset, GUIDABI.layout.byteSize())
            iidSegment.copyFrom(MemorySegment.ofArray(value.toByteArray()))
        }

    var isParameterized: Boolean
        get() = isParameterizedHandle.get(segment, 0L) as Boolean
        set(value) = isParameterizedHandle.set(segment, 0L, value)

    val vtbl = Vtbl(methodCount, vtblPtr)

    constructor(arena: Arena, methodCount: Long) : this(
       peerStructLayout(methodCount).let { layout ->
            val segment = arena.allocate(layout)
            segment.set(ValueLayout.ADDRESS, 0L, Vtbl(arena, methodCount).segment)
            segment.set(ValueLayout.JAVA_LONG, methodCountOffset, methodCount)
            segment
        }
    )

    companion object {
        private val methodCountOffset = peerStructLayout(0).byteOffset(
            MemoryLayout.PathElement.groupElement(METHOD_COUNT)
        )

        val layout: MemoryLayout = peerStructLayout(0)

        fun peerStructLayout(methodCount: Long): MemoryLayout {
            return structLayoutWithPadding(
                ValueLayout.ADDRESS.withTargetLayout(
                    Vtbl.vtblLayoutWithLength(methodCount)
                ).withName(VTBL_PTR),
                GUIDABI.layout.withName(IID),
                ValueLayout.ADDRESS.withName(ROOT_OBJECT_PTR).withTargetLayout(JVMBackedObjectStruct.approximateLayout),
                ValueLayout.JAVA_LONG.withName(METHOD_COUNT),
                ValueLayout.JAVA_BOOLEAN.withName(IS_PARAMETERIZED)
            )
        }
    }

}