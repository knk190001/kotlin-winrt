package com.github.knk190001.winrtbinding.runtime.interop

import com.github.knk190001.winrtbinding.runtime.base.CompositionPointerType
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.Guid.IID

class WinRTObjectInitializer private constructor(private val getPointer: () -> Pointer?, interfaceCount: Int) {
    private val interfacePointers = HashMap<IID, Pointer>(interfaceCount)

    constructor(cpt: CompositionPointerType, interfaceCount: Int) : this({ cpt.pointer }, interfaceCount)
    constructor(pt: PointerType, interfaceCount: Int) : this({ pt.pointer }, interfaceCount)

    operator fun get(iid: IID): Pointer? {
        if (interfacePointers.containsKey(iid)) {
            return interfacePointers[iid]
        }

        val pointer = getPointer()
        if (pointer == Pointer.NULL) {
            throw RuntimeException("Tried to query interface on an object with a null value")
        }
        val refiid = Guid.REFIID(iid)
        val ref = IUnknown.ABI.makeIUnknown(pointer).QueryInterface(refiid)
        interfacePointers[iid] = ref.iUnknown_Ptr

        return ref.iUnknown_Ptr
    }


}
