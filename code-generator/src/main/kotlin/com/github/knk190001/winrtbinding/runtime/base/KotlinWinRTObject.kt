package com.github.knk190001.winrtbinding.runtime.base

import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.objects.JVMBackedWinRTObjectFactory
import java.lang.foreign.MemorySegment

abstract class KotlinWinRTObject : ReferenceType(MemorySegment.NULL), IUnknown {
    init {
        this.segment = JVMBackedWinRTObjectFactory.create(this)
    }
}