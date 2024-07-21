package com.github.knk190001.winrtbinding.foundation.collections

import Windows.Foundation.Collections.IIterable
import com.github.knk190001.winrtbinding.runtime.annotations.ObjectImplements
import com.github.knk190001.winrtbinding.runtime.base.KotlinWinRTObject
import kotlin.reflect.KType

@ObjectImplements([IIterable::class])
class JVMIterable<T>(type: KType, backingIterable: Iterable<T>): KotlinWinRTObject(), IIterable<T>, Iterable<T> by backingIterable {
    override val Windows_Foundation_Collections_IIterable_Type: KType = type
    init {
        initObj()
    }

    override fun First(): Iterator<T> {
        return JVMIterator(Windows_Foundation_Collections_IIterable_Type, iterator())
    }
}
