package com.github.knk190001.winrtbinding.runtime.annotations

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class Guid(val guid: String)