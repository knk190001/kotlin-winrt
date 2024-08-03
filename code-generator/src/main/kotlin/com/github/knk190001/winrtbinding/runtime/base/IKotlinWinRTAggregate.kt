package com.github.knk190001.winrtbinding.runtime.base

import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.objects.JVMBackedWinRTObjectFactory
import com.github.knk190001.winrtbinding.runtime.toPointer
import com.sun.jna.Pointer

interface IKotlinWinRTAggregate: ICompositionPointer, IUnknown {
    fun initAggregate(): Pointer{
        return JVMBackedWinRTObjectFactory.create(this).toPointer()
    }
}