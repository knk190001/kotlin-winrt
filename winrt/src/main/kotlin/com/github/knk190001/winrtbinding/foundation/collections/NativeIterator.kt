package com.github.knk190001.winrtbinding.foundation.collections

import Windows.Foundation.Collections.IIterator
import java.util.function.Consumer

interface NativeIterator<T>: IIterator.WithDefault<T>, Iterator<T> {
    override fun hasNext(): Boolean {
        return get_HasCurrent()
    }

    override fun next(): T {
        val current = get_Current()
        MoveNext()
        return current
    }
}