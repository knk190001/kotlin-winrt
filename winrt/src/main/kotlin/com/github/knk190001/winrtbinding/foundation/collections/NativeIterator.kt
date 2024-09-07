package com.github.knk190001.winrtbinding.foundation.collections

import Windows.Foundation.Collections.IIterator
import kotlin.reflect.KType

class NativeIterator<T>(override val nativeIterator: IIterator<T>) : INativeIterator<T> {
    override val Windows_Foundation_Collections_IIterator_Type: KType =
        nativeIterator.Windows_Foundation_Collections_IIterator_Type!!
}

interface INativeIterator<T> : Iterator<T> {
    val Windows_Foundation_Collections_IIterator_Type: KType

    val nativeIterator: IIterator<T>
    override fun hasNext(): Boolean {
        return nativeIterator.HasCurrent
    }

    override fun next(): T {
        val current = nativeIterator.Current
        nativeIterator.MoveNext()
        return current
    }
}