package com.github.knk190001.winrtbinding.runtime.com

import com.github.knk190001.winrtbinding.runtime.abi.IABI
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.base.ReferenceType
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.interop.ObjectPtr
import com.github.knk190001.winrtbinding.runtime.interop.PointerTo
import com.github.knk190001.winrtbinding.runtime.interop.vtbl
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinNT
import java.lang.foreign.*

@ABIMarker(IActivationFactory.ABI::class)
class IActivationFactory(ptr: MemorySegment) : ReferenceType(ptr), IInspectable {

    private val thisPtr = ObjectPtr(segment)
    private val vtblPtr = thisPtr.vtbl.withMethodCount(1)

    fun activateInstance(): MemorySegment {
        val fnPtr = vtblPtr[0]
        val returnVal = PointerTo<PointerTo<*>>()
        val hr = downcallHandle.invoke(fnPtr, segment, returnVal.segment) as Int
        checkHR(WinNT.HRESULT(hr))
        return returnVal.value.segment
    }

    companion object {
        var IID = Guid.IID("0000003500000000C000000000000046")
        private val linker: Linker = Linker.nativeLinker()
        val downcallHandle = linker.downcallHandle(
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
        )
    }

    object ABI: IABI<IActivationFactory, MemorySegment> {
        override val layout: MemoryLayout = ValueLayout.ADDRESS
        override fun toNative(obj: IActivationFactory): MemorySegment {
            return obj.segment
        }

        override fun fromNative(segment: MemorySegment): IActivationFactory {
            if(segment == MemorySegment.NULL) throw NullPointerException("Null pointer passed to fromNative")
            return IActivationFactory(segment)
        }
    }
}