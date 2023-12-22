package com.github.knk190001.winrtbinding.generator


typealias PairedList<A, B> = Collection<Pair<A, B>>
typealias Predicate<A> = (A) -> Boolean
typealias Transform<T, R> = (T) -> R
typealias BiConsumer<A, B> = (A, B) -> Unit

fun <A, B> PairedList<A, B>.filterFirst(predicate: Predicate<A>): PairedList<A, B> {
    return filter {
        predicate(it.first)
    }
}

fun <A, B, R> PairedList<A, B>.mapFirst(transform: Transform<A, R>): PairedList<R, B> {
    return map {
        transform(it.first) to it.second
    }
}

fun <A, B, R> PairedList<A, B>.mapPairFirst(transform: Transform<Pair<A, B>, R>): PairedList<R, B> {
    return map {
        transform(it) to it.second
    }
}

fun <A, B, R> PairedList<A, B>.flatMapFirst(transform: Transform<A, Collection<R>>): PairedList<R, B> {
    return flatMap { pair ->
        transform(pair.first).map {
            it to pair.second
        }
    }
}

fun <A, B> PairedList<A, B>.forEachPaired(action: BiConsumer<A, B>) {
    forEach {
        action(it.first, it.second)
    }
}