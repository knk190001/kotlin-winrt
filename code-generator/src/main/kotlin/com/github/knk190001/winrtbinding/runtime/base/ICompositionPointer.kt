package com.github.knk190001.winrtbinding.runtime.base

import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.sun.jna.Memory

interface ICompositionPointer {
    var inner: IUnknown?
}