package com.github.knk190001.winrtbinding.runtime

import com.github.knk190001.winrtbinding.runtime.interop.PointerTo
import com.github.knk190001.winrtbinding.runtime.interop.StringABI
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinNT
import java.lang.foreign.*

object Combase {
    init {
        System.loadLibrary("combase")
    }

    private val linker = Linker.nativeLinker()
    private val lookup = SymbolLookup.loaderLookup()

    private val roInitializeHandle = linker.downcallHandle(
        lookup.find("RoInitialize").get(),
        FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        )
    )

    private val roGetActivationFactoryHandle = linker.downcallHandle(
        lookup.find("RoGetActivationFactory").get(),
        FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        )
    )

    private val windowsCreateStringHandle = linker.downcallHandle(
        lookup.find("WindowsCreateString").get(),
        FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        )
    )

    private val windowsGetStringRawBuffer = linker.downcallHandle(
        lookup.find("WindowsGetStringRawBuffer").get(),
        FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        )
    )

    fun roInitialize(initType: Int): WinNT.HRESULT {
        val result = roInitializeHandle.invoke(initType) as Int
        return WinNT.HRESULT(result)
    }

    fun <T> roGetActivationFactory(
        activatableClassId: String,
        iid: Guid.IID,
        factory: PointerTo<T>,
    ): WinNT.HRESULT {
        val classId_Native = StringABI.toNative(activatableClassId)
        val iid_Native = PointerTo<Guid.GUID>(iid)
        val result = roGetActivationFactoryHandle.invoke(classId_Native, iid_Native.segment, factory.segment) as Int
        return WinNT.HRESULT(result)
    }

    fun windowsCreateString(sourceString: String, length: Int, string: PointerTo<PointerTo<*>>): WinNT.HRESULT =
        Arena.ofConfined().use { arena ->
            val sourceString_Native = arena.allocateFrom(sourceString, Charsets.UTF_16LE)
            val result = windowsCreateStringHandle.invoke(sourceString_Native, length, string.segment) as Int
            return WinNT.HRESULT(result)
        }

    fun windowsGetStringRawBuffer(str: MemorySegment, length: PointerTo<Int>): String {
        val result = windowsGetStringRawBuffer.invoke(str, length.segment) as MemorySegment
        val resized = result.reinterpret((length.value + 1) * ValueLayout.JAVA_CHAR.byteSize())
        val string = resized.getString(0, Charsets.UTF_16LE)
        return string
    }
}