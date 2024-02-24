package com.github.knk190001.winrtbinding.runtime.base

import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.sun.jna.*
import com.sun.jna.Structure.FieldOrder
import com.sun.jna.platform.win32.Guid.GUID
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.platform.win32.WinDef.UINT
import com.sun.jna.platform.win32.WinNT.HRESULT
import kotlin.reflect.jvm.jvmName

open class Delegate(ptr: Pointer? = Memory(12)) : PointerType(ptr) {
    lateinit var  vtbl: DelegateVtbl

    class ByReference  : com.sun.jna.ptr.ByReference(Native.POINTER_SIZE) {
        fun setValue(delegate: Delegate) {
            this.pointer.setPointer(0, delegate.pointer)
        }

        fun getValue(): Delegate {
            return Delegate(this.pointer.getPointer(0))
        }
    }

    fun init(uuids: List<GUID>, fn: Callback) {
        init(uuids, CallbackReference.getFunctionPointer(fn))
    }

    fun init(uuids: List<GUID>, fn: Pointer) {
        vtbl = DelegateVtbl()
        vtbl.autoWrite = true
        vtbl.autoRead = true
        vtbl.iUnknownVtbl!!.autoRead = true
        vtbl.iUnknownVtbl!!.autoWrite = true

        pointer.setPointer(0, vtbl.pointer)
        pointer.setInt(Native.POINTER_SIZE.toLong(), 1)
        vtbl.fn = fn
        val unknown = vtbl.iUnknownVtbl
        println("Delegate class: ${this::class.jvmName}")
        println("Delegate pointer: 0x${Pointer.nativeValue(pointer).toString(16)}")
        println("Function pointer: 0x${Pointer.nativeValue(fn).toString(16)}")
        unknown!!.queryInterface = IUnknownVtbl.QueryInterface { thisPtr, iid, returnValue ->
            println("QueryInterface: ${iid.value.toGuidString()}")
            returnValue.value = Pointer.NULL
            if (thisPtr == Pointer.NULL) {
                return@QueryInterface HRESULT(UINT(0x80070057).toInt())
            }
            if (uuids.contains(iid.value)) {
                unknown.addRef(thisPtr)
                returnValue.value = pointer
                return@QueryInterface HRESULT(0)
            }
            println("End QueryInterface")
            return@QueryInterface HRESULT(-2147467262)
        }
        unknown.addRef = IUnknownVtbl.AddRef {
            println("AddRef")
            val refCount = pointer.getInt(Native.POINTER_SIZE.toLong())
            pointer.setInt(Native.POINTER_SIZE.toLong(), refCount + 1)
            println("End AddRef")
            return@AddRef WinDef.ULONG(refCount+1L)
        }
        unknown.release = IUnknownVtbl.Release {
            println("Release")
            val refCount = pointer.getInt(Native.POINTER_SIZE.toLong())
            pointer.setInt(Native.POINTER_SIZE.toLong(), refCount - 1)
            println("End Release")
            return@Release WinDef.ULONG(refCount-1L)
        }
        vtbl.iUnknownVtbl!!.write()
        vtbl.write()
    }

    @FieldOrder("iUnknownVtbl", "fn")
    open class DelegateVtbl(ptr: Pointer? = Pointer.NULL) : Structure(ptr) {
        class ByValue(ptr: Pointer?) : DelegateVtbl(ptr), Structure.ByValue
        class ByReference(ptr: Pointer?) : DelegateVtbl(ptr), Structure.ByReference
        init {
            autoRead = true
            autoWrite = true
        }

        @JvmField
        var iUnknownVtbl: IUnknownVtbl? = null

        @JvmField
        var fn: Pointer? = null
    }
}