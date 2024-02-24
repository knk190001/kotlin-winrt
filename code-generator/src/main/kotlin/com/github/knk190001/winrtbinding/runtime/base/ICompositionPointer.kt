package com.github.knk190001.winrtbinding.runtime.base

import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.sun.jna.Memory
import com.sun.jna.Pointer

interface ICompositionPointer {
    var inner: IUnknown?
    var vtbl: Memory?
}