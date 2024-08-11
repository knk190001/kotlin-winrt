package com.github.knk190001.winrtbinding.runtime.interop

import com.github.knk190001.winrtbinding.runtime.*
import com.github.knk190001.winrtbinding.runtime.abi.IBaseABI
import com.sun.jna.Native
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.WinNT
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandle
import kotlin.reflect.KType
import kotlin.reflect.jvm.jvmErasure

class NativeEvent<E : PointerType, T>(
    val obj: Pointer?,
    val backingObj: NativeMapped,
    private val addVtblIdx: Int,
    private val removeVtblIdx: Int,
    val returnType: KType
) : IEvent<E> {
    private val eventTokens: MutableMap<E, T> = mutableMapOf()

    constructor(
        obj: NativeMapped,
        addVtblIdx: Int,
        removeVtblIdx: Int,
        returnType: KType
    ) : this(obj.toNative() as? Pointer, obj, addVtblIdx, removeVtblIdx, returnType) {
        if (backingObj.nativeType() != Pointer::class.java) {
            throw RuntimeException("The native representation is not pointer")
        }
    }

    override fun add(handler: E) {
        val fnPtr = obj!!.getPointer(0).getPointer(addVtblIdx.toLong() * Native.POINTER_SIZE).toMemorySegment()
        val result = PointerTo<T>(returnType)
        val hr = addDowncallHandle.invoke(fnPtr, obj.toMemorySegment(), handler.pointer.toMemorySegment(), result.segment) as Int
        checkHR(WinNT.HRESULT(hr))
        eventTokens[handler] = result.value
    }

    override fun remove(handler: E) {
        val fnPtr = obj!!.getPointer(removeVtblIdx.toLong() * Native.POINTER_SIZE).toMemorySegment()
        val fn = removeDowncallHandle(returnType)
        val eventTokenABI = abiOf(returnType.jvmErasure) as IBaseABI<T, Any>
        val tokenNative = eventTokenABI.toNative(eventTokens[handler]!!)
        val hr = fn.invoke(fnPtr, obj.toMemorySegment(), tokenNative) as Int
        checkHR(WinNT.HRESULT(hr))
        eventTokens.remove(handler)
    }

    companion object {
        private val linker = Linker.nativeLinker()
        private val addDowncallHandle = linker.downcallHandle(
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
        )

        private fun getRemoveDowncallHandle(returnType: KType): MethodHandle {
            return linker.downcallHandle(
                FunctionDescriptor.of(ValueLayout.JAVA_INT, layoutOf(returnType.jvmErasure)),
            )
        }

        private val removeDowncallHandle = memoize(::getRemoveDowncallHandle)
    }
}