package com.github.knk190001.winrtbinding.runtime.interop

sealed interface IEvent<H> {
    fun add(handler: H)

    fun remove(handler: H)

    operator fun plusAssign(handler: H) {
        add(handler)
    }

    operator fun minusAssign(handler: H) {
        remove(handler)
    }
}