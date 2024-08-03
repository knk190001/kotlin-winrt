package com.github.knk190001.winrtbinding.runtime.delegate

import com.github.knk190001.winrtbinding.runtime.base.ReferenceManager
import com.github.knk190001.winrtbinding.runtime.iAgileObjectIID
import com.github.knk190001.winrtbinding.runtime.iUnknownIID
import com.github.knk190001.winrtbinding.runtime.interop.GUIDABI
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinError
import com.sun.jna.platform.win32.WinNT
import java.lang.foreign.*
import java.lang.invoke.MethodHandles
import kotlin.reflect.jvm.javaMethod

object Delegate {
    val delegatePtrLayout: ValueLayout = ValueLayout.ADDRESS.withTargetLayout(DelegateStruct.layout)
    val refiidLayout: ValueLayout = ValueLayout.ADDRESS.withTargetLayout(GUIDABI.layout)

    val iUnknown: Guid.IID = iUnknownIID
    val iAgileObject: Guid.IID = iAgileObjectIID

    @JvmStatic
    private fun queryInterface(thisPtr: MemorySegment, refiid: MemorySegment, ppvObject: MemorySegment): Int {
        try {
            val thisStruct = DelegateStruct(thisPtr)

            val thisType = GUIDABI.fromNative(thisStruct.iid)
            val requestedGuid = Guid.IID(GUIDABI.fromNative(refiid))
            if (requestedGuid == (thisType) ||
                requestedGuid == (iUnknown) ||
                requestedGuid == (iAgileObject)
            ) {
                thisStruct.incrementRefCountAtomic()
                ppvObject.set(ValueLayout.ADDRESS, 0, thisPtr)
                return 0
            }
            return WinNT.E_NOTIMPL
        } catch (e: Exception) {
            e.printStackTrace()
            return WinError.E_FAIL
        }
    }

    @JvmStatic
    private fun addRef(thisPtr: MemorySegment): Int {
        val delegateStruct = DelegateStruct(thisPtr)
        val refCount = delegateStruct.incrementRefCountAtomic()
        return refCount + 1
    }

    @JvmStatic
    private fun release(thisPtr: MemorySegment): Int {
        ReferenceManager.getArena(thisPtr.address())!!
        val delegateStruct = DelegateStruct(thisPtr)
        val refCount = delegateStruct.decrementRefCountAtomic()
        if (refCount == 1) {
            ReferenceManager.remove(thisPtr.address())
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

    fun createDelegate(arena: Arena, iid: Guid.IID, invokeFnPtr: MemorySegment): MemorySegment {
        val delegateStruct = DelegateStruct(arena)
        delegateStruct.vtbl.segment.copyFrom(delegateVtblPrototype)
        delegateStruct.vtbl.invoke = invokeFnPtr
        delegateStruct.refCount = 1
        delegateStruct.iid.copyFrom(MemorySegment.ofArray(iid.toByteArray()))

        ReferenceManager.registerArena(arena, delegateStruct.segment.address())
        return delegateStruct.segment
    }
}