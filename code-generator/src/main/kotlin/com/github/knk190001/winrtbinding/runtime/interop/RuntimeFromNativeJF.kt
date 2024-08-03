package com.github.knk190001.winrtbinding.runtime.interop

import com.github.knk190001.winrtbinding.runtime.abi.IABI
import com.github.knk190001.winrtbinding.runtime.abi.IParameterizedABI
import com.github.knk190001.winrtbinding.runtime.abiOf
import kotlin.reflect.KClass
import kotlin.reflect.KType

@Suppress("UNCHECKED_CAST")
fun <T : Any> runtimeFromNativeJF(obj: Any, type: KType): T {
    return when (val abi = abiOf(type.classifier as KClass<*>)) {
        is IABI<*, *> -> {
            val casted = abi as IABI<T, Any>
            casted.fromNative(obj)
        }
        is IParameterizedABI<*, *> -> {
            val casted = abi as IParameterizedABI<T, Any>
            casted.fromNative(type, obj)
        }
    }
}