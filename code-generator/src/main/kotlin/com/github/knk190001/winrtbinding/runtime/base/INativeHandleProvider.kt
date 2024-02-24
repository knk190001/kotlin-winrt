package com.github.knk190001.winrtbinding.runtime.base

import com.sun.jna.platform.win32.Guid.GUID
import java.lang.invoke.MethodHandle

interface INativeHandleProvider {
    val guid: GUID
    val handles: Map<Int, MethodHandle>
}