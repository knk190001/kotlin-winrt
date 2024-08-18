package com.github.knk190001.winrtbinding.runtime.interop

import com.github.knk190001.winrtbinding.runtime.base.CompositionReferenceType
import com.github.knk190001.winrtbinding.runtime.base.ReferenceType
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.Guid.IID
import java.lang.foreign.MemorySegment

class WinRTObjectInitializer private constructor(private val getPointer: () -> MemorySegment, interfaceCount: Int) {
    private val interfacePointers = HashMap<IID, ObjectPtr>(interfaceCount)

    constructor(crt: CompositionReferenceType, interfaceCount: Int) : this({ crt.receiver }, interfaceCount)
    constructor(rt: ReferenceType, interfaceCount: Int) : this({ rt.segment }, interfaceCount)

    operator fun get(iid: IID): ObjectPtr {
        if (interfacePointers.containsKey(iid)) {
            return interfacePointers[iid]!!
        }

        val pointer = getPointer()
        if (pointer == Pointer.NULL) {
            throw RuntimeException("Tried to query interface on an object with a null value")
        }
        val refiid = Guid.REFIID(iid)
        val ref = ObjectPtr(IUnknown.ABI.fromNative(pointer).QueryInterface(refiid).segment)
        interfacePointers[iid] = ref

        return ref
    }
}
