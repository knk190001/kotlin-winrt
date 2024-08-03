package com.github.knk190001.winrtbinding.runtime.abi

import kotlin.reflect.KType

interface IParameterizedNativePeerProvider {
    fun makeNativePeer(type: KType, obj: Any?): Any?
}