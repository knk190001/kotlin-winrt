package com.github.knk190001.winrtbinding.runtime.base

import com.sun.jna.NativeMapped
import kotlin.reflect.KType

interface IParameterizedNativePeerProvider {
    fun makeNativePeer(type: KType, obj: Any?): Any?
}