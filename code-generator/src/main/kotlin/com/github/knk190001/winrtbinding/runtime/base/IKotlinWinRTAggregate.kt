package com.github.knk190001.winrtbinding.runtime.base

import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.objects.JVMBackedWinRTObjectFactory
import java.lang.foreign.MemorySegment

interface IKotlinWinRTAggregate : ICompositionReference, IUnknown {
    fun initAggregate(): MemorySegment {
        return JVMBackedWinRTObjectFactory.create(this)
    }
}