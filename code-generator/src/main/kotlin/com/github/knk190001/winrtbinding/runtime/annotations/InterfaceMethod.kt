package com.github.knk190001.winrtbinding.runtime.annotations


@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@Retention(AnnotationRetention.RUNTIME)
annotation class InterfaceMethod(val methodIndex: Int)
