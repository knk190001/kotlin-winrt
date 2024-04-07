package com.github.knk190001.winrtbinding.runtime.base

import com.sun.jna.Structure.ByValue
import java.lang.foreign.MemorySegment

interface IStructABI<Managed: Any> : IABI<Managed, MemorySegment> {
    fun byValue(struct: Managed): Managed
}