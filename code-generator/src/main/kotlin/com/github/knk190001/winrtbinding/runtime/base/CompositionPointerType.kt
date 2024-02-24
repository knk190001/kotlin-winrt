package com.github.knk190001.winrtbinding.runtime.base

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.sun.jna.*
import kotlin.reflect.jvm.javaConstructor
import kotlin.reflect.jvm.reflect

open class CompositionPointerType(pointer: JNAPointer? = Pointer.NULL) : NativeMapped, ICompositionPointer {
    override var inner: IUnknown? = null
    private var principalPtr = pointer
    override var vtbl: Memory? = null

    var pointer:Pointer?
        get() {
            return if (inner != null) inner!!.iUnknown_Ptr else principalPtr
        }
        set(value) {
            principalPtr = value
        }

    override fun fromNative(nativeValue: Any?, context: FromNativeContext?): Any? {
        // Always pass along null pointer values
        if (nativeValue == null) {
            return null
        }

        val pt = javaClass.kotlin.constructors.single {
            it.parameters.isEmpty()
        }.javaConstructor!!.newInstance()
        pt.pointer = nativeValue as Pointer?
        return pt
    }

    override fun nativeType(): Class<*> = Pointer::class.java

    override fun toNative(): Any {
        return principalPtr as Any
    }
}