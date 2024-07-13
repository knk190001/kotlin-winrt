package com.github.knk190001.winrtbinding.runtime.com

import com.github.knk190001.winrtbinding.runtime.*
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.interop.IntByReference
import com.github.knk190001.winrtbinding.runtime.interop.ULongByReference
import com.sun.jna.*
import com.sun.jna.Function
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.Guid.GUID
import com.sun.jna.platform.win32.WinNT
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.reflect.typeOf


@ABIMarker(IInspectable::class)
@com.github.knk190001.winrtbinding.runtime.annotations.Guid("af86e2e0b12d4c6a9c5ad7aa65101e90")
interface IInspectable : IUnknown, NativeMapped, IWinRTInterface {
    fun GetIids(iidCount: ULongByReference, iids: MutableList<Guid.IID>) {
        val fnPtr = iUnknown_Vtbl.getPointer(3L * Native.POINTER_SIZE)
        val fn = Function.getFunction(fnPtr, Function.ALT_CONVENTION)
        val result = PointerByReference()
        val hr = fn.invokeHR(arrayOf(iUnknown_Ptr, iidCount, result))
        readReceiveArrayIntoList(typeOf<GUID>(), iidCount, result, iids)
        checkHR(hr)
    }

    fun GetRuntimeClassName(): String {
        val fnPtr = iUnknown_Vtbl.getPointer(4L * Native.POINTER_SIZE)
        val fn = Function.getFunction(fnPtr, Function.ALT_CONVENTION)
        val result = WinNT.HANDLEByReference()
        val hr = fn.invokeHR(arrayOf(result))
        checkHR(hr)
        return result.value.handleToString()
    }

    fun GetTrustLevel(): TrustLevel {
        val fnPtr = iUnknown_Vtbl.getPointer(5L * Native.POINTER_SIZE)
        val fn = Function.getFunction(fnPtr, Function.ALT_CONVENTION)
        val result = IntByReference()
        val hr = fn.invokeHR(arrayOf(result))
        checkHR(hr)
        return TrustLevel.BasicTrust.fromNative(result.value, null) as TrustLevel
    }

    class IInspectable_Impl(ptr: Pointer? = Pointer.NULL): PointerType(ptr), IInspectable {
        override val iUnknown_Ptr: Pointer
            get() = pointer

        override val iUnknown_Vtbl: Pointer
            get() = pointer.getPointer(0)
    }

    object ABI: IABI<IInspectable, MemoryAddress> {
        override fun fromNative(obj: MemoryAddress): IInspectable {
            return IInspectable_Impl(obj.toPointer())
        }

        override val layout: MemoryLayout = ValueLayout.ADDRESS

        override fun toNative(obj: IInspectable): MemoryAddress {
            return obj.iUnknown_Ptr.toMemoryAddress()
        }

    }
}