package com.github.knk190001.winrtbinding.runtime.base

import java.lang.invoke.MethodHandle

interface IParameterizedNativeHandleProvider {
    val handles: Map<Int, MethodHandle>
}