package com.github.knk190001.winrtbinding.runtime.annotations

import kotlin.reflect.KClass

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class WinRTByReference(val brClass: KClass<*>)