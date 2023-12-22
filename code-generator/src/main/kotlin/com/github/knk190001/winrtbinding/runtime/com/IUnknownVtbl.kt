package com.github.knk190001.winrtbinding.runtime.com

import com.sun.jna.Callback
import com.sun.jna.Native
import com.sun.jna.Pointer
import com.sun.jna.Structure
import com.sun.jna.Structure.FieldOrder
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinDef.ULONG
import com.sun.jna.platform.win32.WinNT.HRESULT
import com.sun.jna.ptr.PointerByReference
import com.sun.jna.win32.StdCallLibrary.StdCallCallback
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout

@FieldOrder("queryInterface","addRef","release")
class IUnknownVtbl(ptr: Pointer? = Pointer.NULL) : Structure(ptr) {
    init {
        autoRead = true
        read()
    }
    @JvmField
    var queryInterface: QueryInterface? = null

    @JvmField
    var addRef: AddRef? = null

    @JvmField
    var release: Release? = null

    fun interface QueryInterface : StdCallCallback {
        operator fun invoke(thisPtr: Pointer, iid: Guid.REFIID, returnValue: PointerByReference): HRESULT
    }

    fun interface AddRef : StdCallCallback {
        operator fun invoke(thisPtr: Pointer): ULONG
    }

    fun interface Release : StdCallCallback {
        operator fun invoke(thisPtr: Pointer): ULONG
    }

    fun queryInterface(thisPtr: Pointer, iid: Guid.REFIID, returnValue: PointerByReference):HRESULT {
        return queryInterface!!(thisPtr,iid, returnValue)
    }

    fun addRef(thisPtr: Pointer): ULONG {
        return addRef!!(thisPtr)
    }
    fun release(thisPtr: Pointer): ULONG {
        return release!!(thisPtr)
    }

    companion object {
        val SIZE = Native.getNativeSize(IUnknownVtbl::class.java)
        val vtblLayout = MemoryLayout.structLayout(
            ValueLayout.ADDRESS.withName("QueryInterface"),
            ValueLayout.ADDRESS.withName("AddRef"),
            ValueLayout.ADDRESS.withName("Release")
        ).withName("IUnknownVtbl")
    }
}