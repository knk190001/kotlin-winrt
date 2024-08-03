package com.github.knk190001.winrtbinding.foundation.collections

import Windows.Foundation.Collections.IIterator
import com.github.knk190001.winrtbinding.runtime.annotations.ObjectImplements
import com.github.knk190001.winrtbinding.runtime.base.KotlinWinRTObject
import kotlin.reflect.KType

@ObjectImplements([IIterator::class])
class JVMIterator<T>(type: KType, private val backingIterator: Iterator<T>) : KotlinWinRTObject(), IIterator<T>,
    Iterator<T> by backingIterator {
    override val Windows_Foundation_Collections_IIterator_Type: KType = type

    private var currentAssigned = false
    private var current: Any? = null
    override val Current: T
        get() {
            @Suppress("UNCHECKED_CAST")
            if (currentAssigned) return current as T
            return next()
        }

    override val HasCurrent: Boolean
        get() {
            if (currentAssigned) return true
            return backingIterator.hasNext()
        }

    override fun MoveNext(): Boolean {
        currentAssigned = false
        current = null
        return backingIterator.hasNext()
    }

    override fun GetMany(items: Array<T>): UInt {
        var idx = 0
        while (HasCurrent && idx < items.size) {
            items[idx] = Current
            MoveNext()
            idx++
        }
        return idx.toUInt()
    }

    override fun next(): T {
        currentAssigned = true
        current = backingIterator.next()
        @Suppress("UNCHECKED_CAST")
        return current as T
    }
}