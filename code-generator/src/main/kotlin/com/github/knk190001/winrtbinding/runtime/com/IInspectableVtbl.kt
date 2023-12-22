package com.github.knk190001.winrtbinding.runtime.com

import com.sun.jna.Callback
import com.sun.jna.Native
import com.sun.jna.Pointer
import com.sun.jna.Structure
import com.sun.jna.Structure.FieldOrder
import com.sun.jna.platform.win32.Guid.IID
import com.sun.jna.platform.win32.WinNT.HANDLEByReference
import com.sun.jna.platform.win32.WinNT.HRESULT
import com.sun.jna.ptr.IntByReference
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout

@FieldOrder("iUnknownVtbl", "getIids", "getRuntimeClassName", "getTrustLevel")
class IInspectableVtbl(ptr: Pointer? = Pointer.NULL) : Structure(ptr) {
    @JvmField
    var iUnknownVtbl: IUnknownVtbl? = null
    @JvmField
    var getIids: GetIids? = null
    @JvmField
    var getRuntimeClassName: GetRuntimeClassName? = null
    @JvmField
    var getTrustLevel: GetTrustLevel? = null

    fun interface GetIids : Callback {
        fun invoke(thisPointer: Pointer, iidCount: IntByReference, pointer: PointerByReference): HRESULT
    }

    fun interface GetRuntimeClassName : Callback {
        fun invoke(thisPointer: Pointer, className: HANDLEByReference): HRESULT
    }

    fun interface GetTrustLevel : Callback {
        fun invoke(thisPointer: Pointer, trustLevel: IntByReference): HRESULT
    }

    companion object {
        val SIZE = Native.getNativeSize(IInspectableVtbl::class.java)
        val IID = IID("AF86E2E0-B12D-4c6a-9C5A-D7AA65101E90")
        val vtblLayout = MemoryLayout.structLayout(
            ValueLayout.ADDRESS.withName("GetIids"),
            ValueLayout.ADDRESS.withName("GetRuntimeClassName"),
            ValueLayout.ADDRESS.withName("GetTrustLevel")
        ).withName("IInspectableVtbl")
    }
}