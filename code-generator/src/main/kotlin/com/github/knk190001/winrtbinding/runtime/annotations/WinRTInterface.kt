package com.github.knk190001.winrtbinding.runtime.annotations


@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class WinRTInterface(val uuid: String)
