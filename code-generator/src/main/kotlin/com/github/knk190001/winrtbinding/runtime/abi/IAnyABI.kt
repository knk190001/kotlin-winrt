package com.github.knk190001.winrtbinding.runtime.abi

import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import java.lang.foreign.MemorySegment

interface IAnyABI: IABI<Any?, MemorySegment> {
    fun box(obj: Any?): IUnknown?
}