package com.github.knk190001.winrtbinding.foundation.collections

import Windows.Foundation.Collections.IIterator

interface NativeIterator<T>: IIterator.WithDefault<T>, Iterator<T> {
    override fun hasNext(): Boolean {
        return HasCurrent
    }

    override fun next(): T {
        val current = Current
        MoveNext()
        return current
    }
}