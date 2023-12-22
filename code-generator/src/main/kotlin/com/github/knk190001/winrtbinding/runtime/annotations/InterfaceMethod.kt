package com.github.knk190001.winrtbinding.runtime.annotations


@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class InterfaceMethod(val methodIndex: Int)
