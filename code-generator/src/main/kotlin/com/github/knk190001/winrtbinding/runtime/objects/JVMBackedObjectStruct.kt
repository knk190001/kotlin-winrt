package com.github.knk190001.winrtbinding.runtime.objects

import com.github.knk190001.winrtbinding.runtime.interop.StringABI
import com.github.knk190001.winrtbinding.runtime.structLayoutWithPadding
import com.sun.jna.platform.win32.Guid.GUID
import java.lang.foreign.*

private const val VTBL_PTR = "vtblPtr"
private const val METHOD_COUNT = "methodCount"
private const val CLASS_NAME = "className"
private const val REF_COUNT = "refCount"
private const val INNER = "inner"

class JVMBackedObjectStruct(val layout: StructLayout, segment: MemorySegment) {
    val segment: MemorySegment = segment.reinterpret(layout.byteSize())

    constructor(segment: MemorySegment) : this(
        run<StructLayout> {
            val temp = JVMBackedObjectStruct(approximateLayout, segment)
            JVMBackedWinRTObjectFactory.getClassMetadata(temp.className)!!.layout
        },
        segment)

    constructor(interfaces: List<Pair<String, Long>>, arena: Arena) : this(
        objectPeerStructLayout(interfaces),
        objectPeerStructLayout(interfaces).let { layout ->
            val segment = arena.allocate(layout)
            segment.set(ValueLayout.ADDRESS, 0L, Vtbl(arena, 0).segment)
            interfaces.forEach { (name, methodCount) ->
                val vtblPtrHandle = layout.varHandle(
                    MemoryLayout.PathElement.groupElement(name),
                    MemoryLayout.PathElement.groupElement(VTBL_PTR)
                )
                vtblPtrHandle.set(segment, 0L, Vtbl(arena, methodCount).segment)

                val methodCountHandle = layout.varHandle(
                    MemoryLayout.PathElement.groupElement(name),
                    MemoryLayout.PathElement.groupElement(METHOD_COUNT)
                )
                methodCountHandle.set(segment, 0L, methodCount)
            }
            segment
        })

    private val vtblPtrHandle = layout.varHandle(
        MemoryLayout.PathElement.groupElement(VTBL_PTR)
    )

    private val classNameHandle = layout.varHandle(
        MemoryLayout.PathElement.groupElement(CLASS_NAME)
    )

    private val refCountHandle = layout.varHandle(
        MemoryLayout.PathElement.groupElement(REF_COUNT)
    )

    private val innerHandle = layout.varHandle(
        MemoryLayout.PathElement.groupElement(INNER)
    )

    val metadata: ClassMetadata? = JVMBackedWinRTObjectFactory.getClassMetadata(className)

    var vtblPtr: MemorySegment
        get() = vtblPtrHandle.get(segment, 0L) as MemorySegment
        set(value) = vtblPtrHandle.set(segment, 0L, value)

    var className: String
        get() {
            val handleSegment = classNameHandle.get(segment, 0L) as MemorySegment
            if (handleSegment == MemorySegment.NULL) {
                return ""
            }
            return StringABI.fromNative(handleSegment)
        }
        set(value) = classNameHandle.set(segment, 0L, StringABI.toNative(value))

    var classNameAsHandle: MemorySegment
        get() = classNameHandle.get(segment, 0L) as MemorySegment
        set(value) = classNameHandle.set(segment, 0L, value)

    var refCount: Int
        get() = refCountHandle.get(segment, 0L) as Int
        set(value) = refCountHandle.set(segment, 0L, value)

    var inner: MemorySegment
        get() = innerHandle.get(segment, 0L) as MemorySegment
        set(value) = innerHandle.set(segment, 0L, value)

    fun incrementRefCountAtomic(): Int {
        return intHandle.getAndAdd(segment, refCountOffset, 1) as Int
    }

    fun decrementRefCountAtomic(): Int {
        return intHandle.getAndAdd(segment, refCountOffset, -1) as Int
    }

    val vtbl = Vtbl(0L, vtblPtr)

    private fun interfaceOffset(guid: GUID): Long {
        return layout.byteOffset(
            MemoryLayout.PathElement.groupElement(guid.toGuidString())
        )
    }

    operator fun get(guid: GUID): JVMBackedInterfaceStruct {
        return JVMBackedInterfaceStruct(
            segment.asSlice(
                interfaceOffset(guid),
                JVMBackedInterfaceStruct.layout.byteSize()
            )
        )
    }

    companion object {
        val approximateLayout = objectPeerStructLayout(emptyList())

        private val intHandle = ValueLayout.JAVA_INT.varHandle()
        private val refCountOffset = approximateLayout.byteOffset(
            MemoryLayout.PathElement.groupElement(REF_COUNT)
        )

        private fun objectPeerStructLayout(interfaces: List<Pair<String, Long>>): StructLayout {
            val interfaceLayouts = interfaces.map { (name, methodCount) ->
                JVMBackedInterfaceStruct.peerStructLayout(methodCount).withName(name)
            }.toTypedArray()
            return structLayoutWithPadding(
                ValueLayout.ADDRESS.withTargetLayout(
                    Vtbl.vtblLayoutWithLength(0L)
                ).withName(VTBL_PTR),
                ValueLayout.ADDRESS.withName(CLASS_NAME),
                ValueLayout.ADDRESS.withName(INNER),
                ValueLayout.JAVA_INT.withName(REF_COUNT),
                MemoryLayout.paddingLayout(4),
                *interfaceLayouts
            )
        }
    }
}