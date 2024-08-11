package com.github.knk190001.winrtbinding.runtime

interface CallScope {
    fun onScopeExit(callback: () -> Unit)
    companion object {
        inline operator fun <T> invoke(block: CallScope.() -> T ): T {
            val scope = CallScopeImpl()
            val result = scope.block()
            scope.callbacks.forEach { it() }
            return result
        }
    }
    class CallScopeImpl : CallScope {
        val callbacks = mutableListOf<() -> Unit>()
        override fun onScopeExit(callback: () -> Unit) {
            callbacks.add(callback)
        }
    }
}