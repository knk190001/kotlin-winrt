package com.github.knk190001.winrtbinding.runtime.base

import java.lang.foreign.MemorySegment

interface ICompositionReference: IObjectReference {
    var inner: MemorySegment?
    val receiver: MemorySegment
}