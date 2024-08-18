package com.github.knk190001.winrtbinding.runtime.com

import com.github.knk190001.winrtbinding.runtime.abi.IABI
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.base.IObjectReference
import com.github.knk190001.winrtbinding.runtime.base.ReferenceType
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.delegate.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.interop.GUIDABI
import com.github.knk190001.winrtbinding.runtime.interop.PointerTo
import com.github.knk190001.winrtbinding.runtime.interop.vtbl
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinNT
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout.ADDRESS
import java.lang.foreign.ValueLayout.JAVA_INT
import java.lang.ref.Reference

@ABIMarker(IUnknown.ABI::class)
@com.github.knk190001.winrtbinding.runtime.annotations.Guid("0000000000000000c000000000000046")
interface IUnknown: IObjectReference {
    val iUnknown_Vtbl: IUnknownVtbl
        get() = iUnknown_Ptr.vtbl

    val iUnknown_Ptr: PointerTo<IUnknownVtbl>
        get() = PointerTo<IUnknownVtbl>(segment)

    fun QueryInterface(iid: Guid.REFIID): IUnknown {
        val fnPtr = iUnknown_Vtbl.queryInterface
        val fn = ABI.downCallHandles[0]
        val iid_Native = GUIDABI.toNative(iid.value)
        val result = PointerTo<IUnknown>()
        val hr = fn.invoke(fnPtr, iUnknown_Ptr.segment, iid_Native, result.segment) as Int
        checkHR(WinNT.HRESULT(hr))
        Reference.reachabilityFence(iid)
        return result.value
    }

    fun AddRef(): ULong {
        val fnPtr = iUnknown_Vtbl.addRef
        val fn = ABI.downCallHandles[1]
        return (fn.invoke(fnPtr, iUnknown_Ptr.segment) as Long).toULong()
    }

    fun Release(): ULong {
        val fnPtr = iUnknown_Vtbl.release
        val fn = ABI.downCallHandles[2]
        return (fn.invoke(fnPtr, iUnknown_Ptr.segment) as Long).toULong()
    }

    object ABI: IABI<IUnknown, MemorySegment> {
        val IID: Guid.IID = Guid.IID("0000000000000000C000000000000046")

        override fun fromNative(obj: MemorySegment): IUnknown {
            return IUnknown_Impl(obj)
        }

        override val layout: MemoryLayout
            get() = ADDRESS

        override fun toNative(obj: IUnknown): MemorySegment {
            return obj.iUnknown_Ptr.segment
        }

        private val linker: Linker = Linker.nativeLinker()
        internal val downCallHandles = listOf(
            linker.downcallHandle(FunctionDescriptor.of(JAVA_INT, ADDRESS, ADDRESS, ADDRESS)),
            linker.downcallHandle(FunctionDescriptor.of(JAVA_INT, ADDRESS)),
            linker.downcallHandle(FunctionDescriptor.of(JAVA_INT, ADDRESS))
        )
    }
    class IUnknown_Impl(ptr: MemorySegment) : ReferenceType(ptr), IUnknown
}