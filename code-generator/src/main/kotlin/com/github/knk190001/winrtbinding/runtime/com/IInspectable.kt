package com.github.knk190001.winrtbinding.runtime.com

import com.github.knk190001.winrtbinding.runtime.abi.IABI
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.interop.PointerTo
import com.github.knk190001.winrtbinding.runtime.interop.ULongByReference
import com.github.knk190001.winrtbinding.runtime.readReceiveArrayIntoList
import com.github.knk190001.winrtbinding.runtime.toMemorySegment
import com.github.knk190001.winrtbinding.runtime.toPointer
import com.sun.jna.Native
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.Guid.GUID
import com.sun.jna.platform.win32.WinNT
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.*
import kotlin.reflect.typeOf


@ABIMarker(IInspectable::class)
@com.github.knk190001.winrtbinding.runtime.annotations.Guid("af86e2e0b12d4c6a9c5ad7aa65101e90")
interface IInspectable : IUnknown, NativeMapped {
    fun GetIids(iidCount: ULongByReference, iids: MutableList<Guid.IID>) {
        val fnPtr = iUnknown_Vtbl.getPointer(3L * Native.POINTER_SIZE).toMemorySegment()
        val result = PointerByReference()
        val fn = ABI.downcallHandles[0]
        val hr = fn.invoke(fnPtr, iUnknown_Ptr.toMemorySegment(), iidCount.pointer.toMemorySegment(), result.pointer.toMemorySegment()) as Int
        readReceiveArrayIntoList(typeOf<GUID>(), iidCount, result, iids)
        checkHR(WinNT.HRESULT(hr))
    }

    fun GetRuntimeClassName(): String {
        val fnPtr = iUnknown_Vtbl.getPointer(4L * Native.POINTER_SIZE).toMemorySegment()
        val result = PointerTo<String>()
        val fn = ABI.downcallHandles[1]
        val hr = fn.invoke(fnPtr, iUnknown_Ptr.toMemorySegment(), result.segment) as Int
        checkHR(WinNT.HRESULT(hr))
        return result.value
    }

    fun GetTrustLevel(): TrustLevel {
        val fnPtr = iUnknown_Vtbl.getPointer(5L * Native.POINTER_SIZE).toMemorySegment()
        val fn = ABI.downcallHandles[2]
        val result = PointerTo<TrustLevel>()
        val hr = fn.invoke(fnPtr, iUnknown_Ptr.toMemorySegment(), result.segment) as Int
        checkHR(WinNT.HRESULT(hr))
        return result.value
    }

    class IInspectable_Impl(ptr: Pointer? = Pointer.NULL): PointerType(ptr), IInspectable {
        override val iUnknown_Ptr: Pointer
            get() = pointer

        override val iUnknown_Vtbl: Pointer
            get() = pointer.getPointer(0)
    }

    object ABI: IABI<IInspectable, MemorySegment> {
        val IID = Guid.IID("af86e2e0-b12d-4c6a-9c5a-d7aa65101e90")

        override fun fromNative(obj: MemorySegment): IInspectable {
            return IInspectable_Impl(obj.toPointer())
        }

        override val layout: MemoryLayout = ValueLayout.ADDRESS

        override fun toNative(obj: IInspectable): MemorySegment {
            return obj.iUnknown_Ptr.toMemorySegment()
        }

        private val linker: Linker = Linker.nativeLinker()
        internal val downcallHandles = listOf(
            linker.downcallHandle(FunctionDescriptor.of(
                ValueLayout.JAVA_INT,
                ValueLayout.ADDRESS,
                ValueLayout.ADDRESS,
                ValueLayout.ADDRESS
            )),
            linker.downcallHandle(FunctionDescriptor.of(
                ValueLayout.JAVA_INT,
                ValueLayout.ADDRESS,
                ValueLayout.ADDRESS
            )),
            linker.downcallHandle(FunctionDescriptor.of(
                ValueLayout.JAVA_INT,
                ValueLayout.ADDRESS,
                ValueLayout.ADDRESS
            )),
        )

    }
}