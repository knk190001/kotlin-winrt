package com.github.knk190001.winrtbinding.runtime.interop

import com.github.knk190001.winrtbinding.runtime.getValue
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.WinDef.UINT
import com.sun.jna.ptr.PointerByReference
import java.lang.reflect.Array.newInstance as jvmNewArrayInstance

abstract class AbstractOutArray<T>(val clazz: Class<*>) :PointerByReference(){
    abstract val arrayPtr: Pointer
    var initialized = false
    lateinit var array: Array<T>
    abstract val size:Int
}

class OutArray<T> (clazz: Class<T>) : AbstractOutArray<T?>(clazz) {
    override val arrayPtr: Pointer
        get() = value

    override val size
        get() = array.size

    operator fun get(idx: Int): T? {
        return array[idx]
    }

    operator fun set(idx: Int, newValue: T?) {
        array[idx] = newValue
    }

}
class PrimitiveOutArray<T> (clazz: Class<T>) : AbstractOutArray<T>(clazz) {
    override val arrayPtr: Pointer
        get() = value
    override val size
        get() = array.size

    operator fun get(idx: Int): T {
        return array[idx]
    }

    operator fun set(idx: Int, newValue: T) {
        array[idx] = newValue
    }

}

inline fun <reified T> AbstractOutArray<T>.initialize(length: UINT) {
    @Suppress("UNCHECKED_CAST")
    array = jvmNewArrayInstance(this.clazz, length.toInt()) as Array<T>
    arrayPtr.getValue(0, array)
    initialized = true
}

inline fun <reified T> makeOutArray(): AbstractOutArray<T?> {
    return OutArray(T::class.java)
}
inline fun <reified T> makePrimitiveOutArray(): AbstractOutArray<T> {
    return PrimitiveOutArray(T::class.java)
}