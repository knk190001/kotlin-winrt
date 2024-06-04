package com.github.knk190001.winrtbinding.runtime.interop


typealias TokenGenerator<T> = () -> T

abstract class Event<H, T>(val tokenGenerator: TokenGenerator<T>) : IEvent<H> {
    private val handlers: MutableMap<T, H> = mutableMapOf()

    fun nativeAdd(handler: H): T {
        val token = tokenGenerator()
        handlers[token] = handler
        add(handler)
        return token
    }

    fun nativeRemove(token: T) {
        val handler = handlers[token]
        remove(handler!!)
        handlers.remove(token)
    }
}