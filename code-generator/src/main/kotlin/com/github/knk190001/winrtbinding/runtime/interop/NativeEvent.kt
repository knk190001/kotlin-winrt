package com.github.knk190001.winrtbinding.runtime.interop

import com.github.knk190001.winrtbinding.runtime.base.Delegate
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.sun.jna.Function
import com.sun.jna.Native
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import kotlin.reflect.KType

class NativeEvent<E : Delegate, T>(
    val obj: Pointer?,
    val backingObj: NativeMapped,
    private val addVtblIdx: Int,
    private val removeVtblIdx: Int,
    val returnType: KType
) : IEvent<E> {
    private val handlers: MutableMap<E, T> = mutableMapOf()

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
        val fnPtr = obj!!.getPointer(0).getPointer(addVtblIdx.toLong() * Native.POINTER_SIZE)
        val fn = Function.getFunction(fnPtr)
        val result = makeByReferenceType<T>(returnType)
        val hr = fn.invokeHR(arrayOf(obj, handler, result))
        if (hr.toInt() != 0) {
            throw RuntimeException(hr.toString())
        }
        handlers[handler] = result.getValue()
    }

    override fun remove(handler: E) {
        val fnPtr = obj!!.getPointer(removeVtblIdx.toLong() * Native.POINTER_SIZE)
        val fn = Function.getFunction(fnPtr)
        val hr = fn.invokeHR(arrayOf(handlers[handler]))
        if (hr.toInt() != 0) {
            throw RuntimeException(hr.toString())
        }
        handlers.remove(handler)
    }
}