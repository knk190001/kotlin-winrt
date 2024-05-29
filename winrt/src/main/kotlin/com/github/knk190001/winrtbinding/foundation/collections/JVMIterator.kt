package com.github.knk190001.winrtbinding.foundation.collections

import Windows.Foundation.Collections.IIterator
import com.github.knk190001.winrtbinding.runtime.annotations.ObjectImplements
import com.github.knk190001.winrtbinding.runtime.base.KotlinWinRTObject
import com.sun.jna.platform.win32.WinDef
import kotlin.collections.Iterator
import kotlin.reflect.KType

@ObjectImplements([IIterator::class])
class JVMIterator<T>(type: KType, private val backingIterator: Iterator<T>): KotlinWinRTObject(), IIterator<T>, Iterator<T> by backingIterator{
    init {
        initObj()
    }

    override val _Windows_Foundation_CollectionsIIterator_Type: KType = type

    private var currentAssigned = false
    private var current: Any? = null
    override fun get_Current(): T {
        @Suppress("UNCHECKED_CAST")
        if(currentAssigned) return current as T
        return next()
    }

    override fun get_HasCurrent(): Boolean {
        if(currentAssigned) return true
        return backingIterator.hasNext()
    }

    override fun MoveNext(): Boolean {
        currentAssigned = false
        current = null
        return backingIterator.hasNext()
    }

    override fun GetMany(items: Array<T>): WinDef.UINT {
        var idx = 0
        while (get_HasCurrent() && idx < items.size) {
            items[idx] = get_Current()
            MoveNext()
            idx++
        }
        return WinDef.UINT(idx.toLong())
    }

    override fun next(): T {
        currentAssigned = true
        current = backingIterator.next()
        @Suppress("UNCHECKED_CAST")
        return current as T
    }
}