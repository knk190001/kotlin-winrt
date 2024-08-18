package com.github.knk190001.winrtbinding.runtime.base

import java.lang.foreign.MemorySegment

open class CompositionReferenceType(segment: MemorySegment): ICompositionReference {
    override var segment: MemorySegment = segment

    override var inner: MemorySegment? = null
    override val receiver: MemorySegment
        get() = inner?: segment
}