package com.github.knk190001.winrtbinding.foundation.collections

import Windows.Foundation.Collections.IIterable
import kotlin.reflect.KType

class NativeIterable<T>(override val nativeIterable: IIterable<T>) : INativeIterable<T> {
    override val Windows_Foundation_Collections_IIterable_Type: KType =
        nativeIterable.Windows_Foundation_Collections_IIterable_Type!!
}

interface INativeIterable<T> : Iterable<T> {
    val Windows_Foundation_Collections_IIterable_Type: KType

    val nativeIterable: IIterable<T>
    override fun iterator(): Iterator<T> {
        return nativeIterable.First()!!
    }
}