package com.github.knk190001.winrtbinding.runtime.com

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.sun.jna.Function
import com.sun.jna.Native
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout

@ABIMarker(IUnknown.ABI::class)
interface IUnknown : NativeMapped, IWinRTInterface {
    val iUnknown_Vtbl: Pointer
        get() = iUnknown_Ptr.getPointer(0)

    val iUnknown_Ptr: Pointer
        get() = toNative() as Pointer

    fun QueryInterface(iid: Guid.REFIID): Pointer {
        val fnPtr = iUnknown_Vtbl.getPointer(0)
        val fn = Function.getFunction(fnPtr, Function.ALT_CONVENTION)
        val result = PointerByReference()
        val hr = fn.invokeHR(arrayOf(iUnknown_Ptr, iid, result))
        if (hr.toInt() != 0) {
            throw RuntimeException(hr.toString())
        }
        return result.value
    }

    fun AddRef(): WinDef.ULONG {
        val fnPtr = iUnknown_Vtbl.getPointer(1)
        val fn = Function.getFunction(fnPtr, Function.ALT_CONVENTION)
        return WinDef.ULONG(fn.invokeLong(arrayOf(iUnknown_Ptr)))
    }

    fun Release(): WinDef.ULONG {
        val fnPtr = iUnknown_Vtbl.getPointer(2)
        val fn = Function.getFunction(fnPtr, Function.ALT_CONVENTION)
        return WinDef.ULONG(fn.invokeLong(arrayOf(iUnknown_Ptr)))
    }

    object ABI: IABI<IUnknown, MemoryAddress> {
        val IID: Guid.IID = Guid.IID("0000000000000000C000000000000046")

        fun makeIUnknown(ptr: Pointer?): IUnknown =
            IUnknown_Impl(ptr)

        override fun fromNative(segment: MemoryAddress): IUnknown {
            val address = segment.get(ValueLayout.ADDRESS, 0)
            return makeIUnknown(Pointer(address.toRawLongValue()))
        }

        override val layout: MemoryLayout
            get() = ValueLayout.ADDRESS

        override fun toNative(obj: IUnknown): MemoryAddress {
            return MemoryAddress.ofLong(Pointer.nativeValue(obj.iUnknown_Ptr))
        }

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