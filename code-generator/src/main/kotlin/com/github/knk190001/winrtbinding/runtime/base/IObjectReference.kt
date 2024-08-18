package com.github.knk190001.winrtbinding.runtime.base

import java.lang.foreign.MemorySegment


interface IObjectReference {
    var segment: MemorySegment
}