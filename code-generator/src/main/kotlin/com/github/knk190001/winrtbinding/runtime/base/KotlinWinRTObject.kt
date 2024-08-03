package com.github.knk190001.winrtbinding.runtime.base

import com.github.knk190001.winrtbinding.runtime.*
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.objects.JVMBackedWinRTObjectFactory
import com.sun.jna.PointerType

abstract class KotlinWinRTObject : PointerType(), IUnknown {
    init {
        this.pointer = JVMBackedWinRTObjectFactory.create(this).toPointer()
    }
}