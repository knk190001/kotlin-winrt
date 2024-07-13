package com.github.knk190001.winrtbinding.runtime

import com.github.knk190001.winrtbinding.runtime.base.IKotlinWinRTAggregate
import com.github.knk190001.winrtbinding.runtime.com.IInspectableVtbl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.sun.jna.Memory
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.platform.win32.WinNT
import kotlin.reflect.jvm.jvmName

fun generateIInspectable(thisObj:Any, interfaces: Map<Guid.GUID, Pointer>): Pair<Pointer, IInspectableVtbl> {
    val objPtr = Memory(12)
    objPtr.setInt(8, 1)
    val iUnknownVtbl = IUnknownVtbl()
    iUnknownVtbl.queryInterface = IUnknownVtbl.QueryInterface { thisPtr, iid, returnValue ->
        returnValue.value = Pointer.NULL
        if(iid.value == IUnknown.ABI.IID || iid.value == IInspectableVtbl.IID) {
            returnValue.value = objPtr
            return@QueryInterface WinNT.S_OK
        }

        if (interfaces.containsKey(iid.value)) {
            returnValue.value = interfaces[iid.value]
            return@QueryInterface WinNT.S_OK
        }
        if (thisObj is IKotlinWinRTAggregate) {
            try {
                returnValue.value = thisObj.inner?.QueryInterface(iid)!!.iUnknown_Ptr
                return@QueryInterface WinNT.S_OK
            } catch (e: Exception) {
                return@QueryInterface WinNT.HRESULT(WinNT.E_NOTIMPL)
            }
        } else {
            return@QueryInterface WinNT.HRESULT(WinNT.E_NOTIMPL)
        }
    }

    iUnknownVtbl.addRef = IUnknownVtbl.AddRef { _: Pointer? ->
        val refCount = objPtr.getInt(8)
        objPtr.setInt(8, refCount + 1)
        return@AddRef WinDef.ULONG(refCount.toLong() + 1)
    }

    iUnknownVtbl.release = IUnknownVtbl.Release { _: Pointer? ->
        val refCount = objPtr.getInt(8)
        objPtr.setInt(8, refCount - 1)
        return@Release WinDef.ULONG(refCount.toLong() - 1)
    }

    val iInspectableVtbl = IInspectableVtbl()
    iInspectableVtbl.iUnknownVtbl = iUnknownVtbl

    val guids = Memory((interfaces.size + 2) * 16L)

    val iUnknownGuid = ByteArray(16)
    IUnknown.ABI.IID.pointer.read(0,iUnknownGuid, 0, 16)
    guids.write(0, iUnknownGuid, 0, 16)
    val iIInspectableGuid = ByteArray(16)
    IInspectableVtbl.IID.pointer.read(0,iIInspectableGuid, 0, 16)
    guids.write(16, iIInspectableGuid, 0, 16)
    interfaces.keys.forEachIndexed { index, guid ->
        guids.write((index + 2) * 16L, guid.toByteArray(), 0, 16)
    }

    iInspectableVtbl.getIids = IInspectableVtbl.GetIids { _, iidCount, pointer ->
        pointer.value = guids
        iidCount.value = interfaces.size + 2
        return@GetIids WinNT.S_OK
    }

    iInspectableVtbl.getRuntimeClassName = IInspectableVtbl.GetRuntimeClassName { thisPointer, className ->
        className.value = thisObj::class.jvmName.toHandle()
        return@GetRuntimeClassName WinNT.S_OK
    }

    iInspectableVtbl.getTrustLevel = IInspectableVtbl.GetTrustLevel { _, trustLevel ->
        trustLevel.value = 1
        return@GetTrustLevel WinNT.S_OK
    }
    iInspectableVtbl.write()

    objPtr.setPointer(0, iInspectableVtbl.pointer)
    return objPtr to iInspectableVtbl
}

fun backFillIInspectable(iInspectableVtbl: IInspectableVtbl, pointer: Pointer){
    val vtblSize = iInspectableVtbl.size()
    val byteArray = ByteArray(vtblSize)
    iInspectableVtbl.pointer.read(0L, byteArray, 0, vtblSize)
    pointer.getPointer(0).write(0, byteArray, 0, vtblSize)
}