package com.github.knk190001.winrtbinding.runtime.com

import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.interop.PointerTo
import com.github.knk190001.winrtbinding.runtime.toMemorySegment
import com.github.knk190001.winrtbinding.runtime.toPointer
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinNT
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.ValueLayout

class IActivationFactory(val ptr: Pointer? = Pointer.NULL) : PointerType(ptr), IInspectable {
    private val vtblPtr = ptr?.getPointer(0)

    fun activateInstance(): Pointer {
        val fnPtr = vtblPtr!!.getPointer(6L * POINTER_SIZE).toMemorySegment()
        val returnVal = PointerTo<PointerTo<*>>()
        val hr = downcallHandle.invoke(fnPtr, ptr.toMemorySegment(), returnVal.segment) as Int
        checkHR(WinNT.HRESULT(hr))
        return returnVal.value.segment.toPointer()
    }

    companion object {
        var IID = Guid.IID("0000003500000000C000000000000046")
        private val linker: Linker = Linker.nativeLinker()
        val downcallHandle = linker.downcallHandle(
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
        )
    }
}