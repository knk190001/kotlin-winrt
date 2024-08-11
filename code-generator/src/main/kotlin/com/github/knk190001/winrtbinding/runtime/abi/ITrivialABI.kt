package com.github.knk190001.winrtbinding.runtime.abi

interface ITrivialABI<T: Any>: IABI<T, T> {
    override fun toNative(obj: T): T {
        return obj
    }

    override fun fromNative(obj: T): T {
        return obj
    }
}