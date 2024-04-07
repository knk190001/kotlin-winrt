package com.github.knk190001.winrtbinding

typealias Fn<A, R> = (A) -> R
typealias BiFn<A, B, R> = (A, B) -> R
typealias TriFn<A, B, C, R> = (A, B, C) -> R
typealias BiConsumer<A, B> = (A, B) -> Unit
typealias PairList<A, B> = List<Pair<A, B>>
typealias TripleList<A, B, C> = List<Triple<A, B, C>>

fun <A, B, R> PairList<A, B>.map(transform: BiFn<A, B, R>): List<R> = this.map { it ->
    transform(it.first, it.second)
}

fun <A, B, C, R> TripleList<A, B, C>.map(transform: TriFn<A, B, C, R>): List<R> = this.map { it ->
    transform(it.first, it.second, it.third)
}


fun <A, B> PairList<A, B>.forEach(consumer: BiConsumer<A, B>): Unit = this.forEach { (a, b) ->
    consumer(a, b)
}

inline fun <T, reified L : T> List<T>.mapIfInstanceOf(transform: Fn<L, T>): List<T> {
    return this.map {
        if (it is L) {
            transform(it)
        } else it
    }
}
