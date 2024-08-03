package com.github.knk190001.winrtbinding.runtime.objects

import com.sun.jna.platform.win32.Guid
import java.lang.foreign.StructLayout

data class ClassMetadata (
    val layout: StructLayout,
    val interfaces: Set<Guid.IID>
)
