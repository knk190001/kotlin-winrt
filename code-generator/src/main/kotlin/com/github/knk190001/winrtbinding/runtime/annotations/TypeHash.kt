package com.github.knk190001.winrtbinding.runtime.annotations

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
annotation class TypeHash(val hash: String)