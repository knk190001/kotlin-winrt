package com.github.knk190001.winrtbinding.runtime.base

interface IABI<Managed, Native : Any>: IBaseABI<Managed, Native> {
    fun fromNative(obj: Native): Managed
}