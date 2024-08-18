package com.github.knk190001.winrtbinding.runtime.interop

import com.github.knk190001.winrtbinding.runtime.abi.IBaseABI
import com.github.knk190001.winrtbinding.runtime.abiOf
import com.github.knk190001.winrtbinding.runtime.base.IObjectReference
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.layoutOf
import com.github.knk190001.winrtbinding.runtime.memoize
import com.sun.jna.platform.win32.WinNT
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandle
import kotlin.math.max
import kotlin.reflect.KType
import kotlin.reflect.jvm.jvmErasure

class NativeEvent<E : IObjectReference, T>(
    val obj: ObjectPtr,
    val backingObj: IObjectReference,
    private val addVtblIdx: Int,
    private val removeVtblIdx: Int,
    val returnType: KType
) : IEvent<E> {
    private val eventTokens: MutableMap<E, T> = mutableMapOf()
    private val vtbl = obj.vtbl.withMethodCount(max(addVtblIdx.toLong(), removeVtblIdx.toLong()))

    constructor(
        obj: IObjectReference,
        addVtblIdx: Int,
        removeVtblIdx: Int,
        returnType: KType
    ) : this(ObjectPtr(obj.segment), obj, addVtblIdx, removeVtblIdx, returnType)

    override fun add(handler: E) {
        val fnPtr = vtbl[addVtblIdx]
        val result = PointerTo<T>(returnType)
        val hr = addDowncallHandle.invoke(fnPtr, obj.segment, handler.segment, result.segment) as Int
        checkHR(WinNT.HRESULT(hr))
        eventTokens[handler] = result.value
    }

    override fun remove(handler: E) {
        val fnPtr = vtbl[removeVtblIdx]
        val fn = removeDowncallHandle(returnType)
        val eventTokenABI = abiOf(returnType.jvmErasure) as IBaseABI<T, Any>
        val tokenNative = eventTokenABI.toNative(eventTokens[handler]!!)
        val hr = fn.invoke(fnPtr, obj, tokenNative) as Int
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