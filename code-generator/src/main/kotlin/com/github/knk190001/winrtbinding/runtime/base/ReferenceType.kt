package com.github.knk190001.winrtbinding.runtime.base

import java.lang.foreign.MemorySegment

open class ReferenceType(final override var segment: MemorySegment) : IObjectReference