package com.github.knk190001.winrtbinding.runtime.annotations

import kotlin.reflect.KClass

annotation class AggregateImplements(
    val interfaces: Array<KClass<*>>
)
