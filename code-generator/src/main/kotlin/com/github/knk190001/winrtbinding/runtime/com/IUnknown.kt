package com.github.knk190001.winrtbinding.runtime.com

import com.github.knk190001.winrtbinding.runtime.abi.IABI
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.interop.GUIDABI
import com.github.knk190001.winrtbinding.runtime.interop.PointerTo
import com.github.knk190001.winrtbinding.runtime.toMemorySegment
import com.github.knk190001.winrtbinding.runtime.toPointer
import com.sun.jna.Native
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.PointerType
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
interface IUnknown : NativeMapped {
    val iUnknown_Vtbl: Pointer
        get() = iUnknown_Ptr.getPointer(0)

    val iUnknown_Ptr: Pointer
        get() = toNative() as Pointer

    fun QueryInterface(iid: Guid.REFIID): IUnknown {
        val fnPtr = iUnknown_Vtbl.getPointer(0).toMemorySegment()
        val fn = ABI.downCallHandles[0]
        val iid_Native = GUIDABI.toNative(iid.value)
        val result = PointerTo<IUnknown>()
        val hr = fn.invoke(fnPtr, iUnknown_Ptr.toMemorySegment(), iid_Native, result.segment) as Int
        checkHR(WinNT.HRESULT(hr))
        Reference.reachabilityFence(iid)
        return result.value
    }

    fun AddRef(): ULong {
        val fnPtr = iUnknown_Vtbl.getPointer(Native.POINTER_SIZE.toLong()).toMemorySegment()
        val fn = ABI.downCallHandles[1]
        return (fn.invoke(fnPtr, iUnknown_Ptr.toMemorySegment()) as Long).toULong()
    }

    fun Release(): ULong {
        val fnPtr = iUnknown_Vtbl.getPointer(2 * Native.POINTER_SIZE.toLong()).toMemorySegment()
        val fn = ABI.downCallHandles[2]
        return (fn.invoke(fnPtr, iUnknown_Ptr.toMemorySegment()) as Long).toULong()
    }

    object ABI: IABI<IUnknown, MemorySegment> {
        val IID: Guid.IID = Guid.IID("0000000000000000C000000000000046")

        fun makeIUnknown(ptr: Pointer?): IUnknown =
            IUnknown_Impl(ptr)

        override fun fromNative(obj: MemorySegment): IUnknown {
            return makeIUnknown(obj.toPointer())
        }

        override val layout: MemoryLayout
            get() = ADDRESS

        override fun toNative(obj: IUnknown): MemorySegment {
            return MemorySegment.ofAddress(Pointer.nativeValue(obj.iUnknown_Ptr))
        }

        private val linker: Linker = Linker.nativeLinker()
        internal val downCallHandles = listOf(
            linker.downcallHandle(FunctionDescriptor.of(JAVA_INT, ADDRESS, ADDRESS, ADDRESS)),
            linker.downcallHandle(FunctionDescriptor.of(JAVA_INT, ADDRESS)),
            linker.downcallHandle(FunctionDescriptor.of(JAVA_INT, ADDRESS))
        )
    }

    open class ByReference : com.sun.jna.ptr.ByReference(Native.POINTER_SIZE) {
        fun getValue() = ABI.makeIUnknown(pointer.getPointer(0))

        fun setValue(value: IUnknown): Unit {
            pointer.setPointer(0, value.toNative() as Pointer?)
        }
    }
    class IUnknown_Impl(ptr: Pointer? = Pointer.NULL) : PointerType(ptr), IUnknown {
        override val iUnknown_Ptr: Pointer
            get() = pointer

        override val iUnknown_Vtbl: Pointer
            get() = pointer.getPointer(0)
    }
}