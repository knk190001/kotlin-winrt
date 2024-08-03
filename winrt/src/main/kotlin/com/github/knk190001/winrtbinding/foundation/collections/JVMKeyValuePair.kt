package com.github.knk190001.winrtbinding.foundation.collections

import Windows.Foundation.Collections.IKeyValuePair
import com.github.knk190001.winrtbinding.runtime.annotations.ObjectImplements
import com.github.knk190001.winrtbinding.runtime.base.KotlinWinRTObject
import kotlin.reflect.KType

@ObjectImplements([IKeyValuePair::class])
class JVMKeyValuePair<K, V>(type: KType, private val backingPair: Pair<K, V>): KotlinWinRTObject(), IKeyValuePair<K, V> {
    override val Windows_Foundation_Collections_IKeyValuePair_Type: KType = type

    override val Key: K = backingPair.first

    override val Value: V = backingPair.second
}