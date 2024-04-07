package com.github.knk190001.winrtbinding.foundation.collections

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IIterator
import java.util.*

interface NativeIterable<T>: IIterable.WithDefault<T>, Iterable<T>  {
    override fun iterator(): Iterator<T> {
        @Suppress("UNCHECKED_CAST")
        return Itr(First()!! as IIterator<T>)
    }

    private class Itr<T>(private val iterator: IIterator<T>): Iterator<T> {
        override fun hasNext(): Boolean {
            return iterator.get_HasCurrent()
        }

        override fun next(): T {
            val current = iterator.get_Current()
            iterator.MoveNext()
            return current
        }
    }
}