package com.github.knk190001.winrtbinding.runtime.com

import com.github.knk190001.winrtbinding.runtime.abi.IABI
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.base.ReferenceType
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.interop.IInspectablePtr
import com.github.knk190001.winrtbinding.runtime.interop.PointerTo
import com.github.knk190001.winrtbinding.runtime.interop.vtbl
import com.github.knk190001.winrtbinding.runtime.objects.IInspectableVtbl
import com.github.knk190001.winrtbinding.runtime.readReceiveArrayIntoList
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.Guid.GUID
import com.sun.jna.platform.win32.WinNT
import java.lang.foreign.*
import kotlin.reflect.typeOf


@ABIMarker(IInspectable::class)
@com.github.knk190001.winrtbinding.runtime.annotations.Guid("af86e2e0b12d4c6a9c5ad7aa65101e90")
interface IInspectable : IUnknown {

    override val iUnknown_Ptr: PointerTo<IInspectableVtbl>
        get() = IInspectablePtr(segment)

    override val iUnknown_Vtbl: IInspectableVtbl
        get() = iUnknown_Ptr.vtbl

    fun GetIids(iidCount: PointerTo<ULong>, iids: MutableList<Guid.IID>) {
        val fnPtr = iUnknown_Vtbl.getIids
        val result = PointerTo<PointerTo<*>>()
        val fn = ABI.downcallHandles[0]
        val hr = fn.invoke(fnPtr, iUnknown_Ptr.segment, iidCount.segment, result.segment) as Int
        readReceiveArrayIntoList(typeOf<GUID>(), iidCount, result, iids)
        checkHR(WinNT.HRESULT(hr))
    }

    fun GetRuntimeClassName(): String {
        val fnPtr = iUnknown_Vtbl.getRuntimeClassName
        val result = PointerTo<String>()
        val fn = ABI.downcallHandles[1]
        val hr = fn.invoke(fnPtr, iUnknown_Ptr.segment, result.segment) as Int
        checkHR(WinNT.HRESULT(hr))
        return result.value
    }

    fun GetTrustLevel(): TrustLevel {
        val fnPtr = iUnknown_Vtbl.getTrustLevel
        val fn = ABI.downcallHandles[2]
        val result = PointerTo<TrustLevel>()
        val hr = fn.invoke(fnPtr, iUnknown_Ptr.segment, result.segment) as Int
        checkHR(WinNT.HRESULT(hr))
        return result.value
    }

    class IInspectable_Impl(ptr: MemorySegment): ReferenceType(ptr), IInspectable

    object ABI: IABI<IInspectable, MemorySegment> {
        val IID = Guid.IID("af86e2e0-b12d-4c6a-9c5a-d7aa65101e90")

        override fun fromNative(obj: MemorySegment): IInspectable {
            return IInspectable_Impl(obj)
        }

        override val layout: MemoryLayout = ValueLayout.ADDRESS

        override fun toNative(obj: IInspectable): MemorySegment {
            return obj.segment
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