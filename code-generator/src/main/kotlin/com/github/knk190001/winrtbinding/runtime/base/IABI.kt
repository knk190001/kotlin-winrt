package com.github.knk190001.winrtbinding.runtime.base

interface IABI<Managed : Any, Native : Any>: IBaseABI<Managed, Native> {
    fun fromNative(obj: Native): Managed
}