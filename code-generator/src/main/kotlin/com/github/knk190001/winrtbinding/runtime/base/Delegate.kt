package com.github.knk190001.winrtbinding.runtime.base

import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.iAgileObjectIID
import com.github.knk190001.winrtbinding.runtime.iUnknownIID
import com.github.knk190001.winrtbinding.runtime.interop.GUIDABI
import com.github.knk190001.winrtbinding.runtime.structLayoutWithPadding
import com.sun.jna.platform.win32.Guid.IID
import java.lang.foreign.*
import java.lang.invoke.MethodHandles
import java.lang.ref.Cleaner
import java.lang.ref.WeakReference
import java.util.concurrent.ConcurrentHashMap
import kotlin.reflect.jvm.javaMethod


object Delegate {
    val delegatePtrLayout = ValueLayout.ADDRESS.withTargetLayout(DelegateStruct.layout)
    val refiidLayout = ValueLayout.ADDRESS.withTargetLayout(GUIDABI.layout)

    val iUnknownByteArray = iUnknownIID.toByteArray()
    val iAgileObjectByteArray = iAgileObjectIID.toByteArray()

    @JvmStatic
    private fun queryInterface(thisPtr: MemorySegment, refiid: MemorySegment, ppvObject: MemorySegment): Int {
        try {
            val thisStruct = DelegateStruct(thisPtr)

            val thisTypeByteArray = thisStruct.iid.toArray(ValueLayout.JAVA_BYTE)
            val requestedGuidByteArray = refiid.toArray(ValueLayout.JAVA_BYTE)
            if (requestedGuidByteArray.contentEquals(thisTypeByteArray) ||
                requestedGuidByteArray.contentEquals(iUnknownByteArray) ||
                requestedGuidByteArray.contentEquals(iAgileObjectByteArray)
            ) {
                thisStruct.refCount++
                ppvObject.set(ValueLayout.ADDRESS, 0, thisPtr)
                return 0
            }
            return 0x80004002u.toInt()
        } catch (e: Exception) {
            e.printStackTrace()
            return 0x80004005u.toInt()
        }
    }

    @JvmStatic
    private fun addRef(thisPtr: MemorySegment): Int {
        val delegateStruct = DelegateStruct(thisPtr)
        val refCount = delegateStruct.refCount++
        if (refCount == 0) {
            ReferenceManager.setStrong(thisPtr.address())
        }
        return refCount + 1
    }

    @JvmStatic
    private fun release(thisPtr: MemorySegment): Int {
        val delegateStruct = DelegateStruct(thisPtr)
        val refCount = delegateStruct.refCount--
        if (refCount == 1) {
            ReferenceManager.setWeak(thisPtr.address())
        }
        return refCount - 1
    }

    private val lookup = MethodHandles.lookup()
    private val queryInterfaceHandle = lookup.unreflect(::queryInterface.javaMethod)
    private val addRefHandle = lookup.unreflect(::addRef.javaMethod)
    private val releaseHandle = lookup.unreflect(::release.javaMethod)

    private val queryInterfaceStub = Linker.nativeLinker().upcallStub(
        queryInterfaceHandle,
        FunctionDescriptor.of(
            ValueLayout.JAVA_INT, delegatePtrLayout, refiidLayout,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        ),
        Arena.global()
    )

    private val addRefStub = Linker.nativeLinker().upcallStub(
        addRefHandle,
        FunctionDescriptor.of(ValueLayout.JAVA_INT, delegatePtrLayout),
        Arena.global()
    )

    private val releaseStub = Linker.nativeLinker().upcallStub(
        releaseHandle,
        FunctionDescriptor.of(ValueLayout.JAVA_INT, delegatePtrLayout),
        Arena.global()
    )

    private val delegateVtblPrototype = DelegateVtbl(Arena.global()).also {
        it.queryInterface = queryInterfaceStub
        it.addRef = addRefStub
        it.release = releaseStub
    }.segment

    fun createDelegate(arena: Arena, iid: IID, invokeFnPtr: MemorySegment): MemorySegment {
        val delegateStruct = DelegateStruct(arena)
        delegateStruct.vtbl.segment.copyFrom(delegateVtblPrototype)
        delegateStruct.vtbl.invoke = invokeFnPtr
        delegateStruct.refCount = 1
        delegateStruct.iid.copyFrom(MemorySegment.ofArray(iid.toByteArray()))

        ReferenceManager.registerArena(arena, delegateStruct.segment.address())
        return delegateStruct.segment
    }
}


object ReferenceManager {
    private val table = ConcurrentHashMap<Long, Ref<Arena>?>()
    private val cleaner = Cleaner.create()

    private interface Ref<T> {
        val value: T?

        fun toWeak(): WeakRef<T>
        fun toStrong(): StrongRef<T>
    }

    private class StrongRef<T>(override var value: T) : Ref<T> {
        override fun toWeak(): WeakRef<T> {
            return WeakRef(value)
        }

        override fun toStrong(): StrongRef<T> = this
    }

    private class WeakRef<T>(value: T) : Ref<T> {
        private val ref = WeakReference(value)
        override val value: T?
            get() = ref.get()

        override fun toStrong(): StrongRef<T> {
            return if (value != null) {
                StrongRef(value!!)
            } else {
                throw IllegalStateException("Reference was garbage collected")
            }
        }

        override fun toWeak(): WeakRef<T> = this
    }

    fun registerArena(arena: Arena, address: Long) {
        val ref = StrongRef(arena)
        table[address] = ref

        cleaner.register(arena) {
            remove(address)
        }
    }

    fun register(obj: IUnknown) {
        cleaner.register(obj) {
            obj.Release()
        }
    }

    fun remove(address: Long) {
        table[address] = null
        println("Freed: $address")
    }

    fun setWeak(address: Long) {
        table[address] = table[address]?.toWeak()
    }

    fun setStrong(address: Long) {
        table[address] = table[address]?.toStrong()
    }
}

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

class DelegateStruct(val segment: MemorySegment) {
    constructor(arena: Arena) : this(arena.allocate(layout).also {
        val vtblSegment = arena.allocate(DelegateVtbl.layout)
        vtblPtrHandle.set(it, 0L, vtblSegment)
    })

    val vtbl: DelegateVtbl = DelegateVtbl(vtblPtr)

    var vtblPtr: MemorySegment
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

    companion object {
        val layout = structLayoutWithPadding(
            ValueLayout.ADDRESS.withTargetLayout(DelegateVtbl.layout)
                .withName("vtblPtr"),
            GUIDABI.layout.withName("iid"),
            ValueLayout.JAVA_INT.withName("refCount")
        )

        private val vtblPtrHandle = layout.varHandle(
            MemoryLayout.PathElement.groupElement("vtblPtr")
        )

        private val refCountHandle = layout.varHandle(
            MemoryLayout.PathElement.groupElement("refCount")
        )

        private val iidOffset = layout.byteOffset(
            MemoryLayout.PathElement.groupElement("iid")
        )
    }
}

