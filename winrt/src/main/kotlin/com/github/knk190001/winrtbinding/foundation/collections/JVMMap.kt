package com.github.knk190001.winrtbinding.foundation.collections

import Windows.Foundation.Collections.IIterator
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.Collections.IMap
import Windows.Foundation.Collections.IMapView
import com.github.knk190001.winrtbinding.runtime.base.KotlinWinRTObject
import kotlin.reflect.KType
import kotlin.reflect.KTypeProjection
import kotlin.reflect.KVariance
import kotlin.reflect.full.createType

class JVMMap<K, V>(type: KType, backingMap: MutableMap<K, V>) : KotlinWinRTObject(), IMap<K, V>,
    MutableMap<K, V> by backingMap {

    override val Windows_Foundation_Collections_IMap_Type: KType = type

    init {
        initObj()
    }

    override fun Lookup(key: K): V {
        @Suppress("UNCHECKED_CAST")
        return get(key) as V
    }

    override val Size: UInt
        get(){
            return size.toUInt()
        }

    override fun HasKey(key: K): Boolean {
        return containsKey(key)
    }

    override fun GetView(): Map<K, V> {
        return JVMMapView(
            IMapView::class.createType(
                listOf(
                    KTypeProjection(KVariance.INVARIANT, Windows_Foundation_Collections_IMap_Type.arguments[0].type),
                    KTypeProjection(KVariance.INVARIANT, Windows_Foundation_Collections_IMap_Type.arguments[1].type)
                )
            ),
            this
        )
    }

    override fun Clear() {
        clear()
    }

    override fun Remove(key: K) {
        remove(key)
    }

    override fun Insert(key: K, value: V): Boolean {
        val exists = containsKey(key)
        this[key] = value
        return exists
    }

    override fun First(): Iterator<IKeyValuePair<K, V>?> {
        return JVMIterator(
            IIterator::class.createType(
                listOf(
                    KTypeProjection(KVariance.INVARIANT, Windows_Foundation_Collections_IMap_Type.arguments[0].type),
                    KTypeProjection(KVariance.INVARIANT, Windows_Foundation_Collections_IMap_Type.arguments[1].type)
                )
            ), Itr(Windows_Foundation_Collections_IMap_Type, iterator())
        )
    }

    private class Itr<K, V>(
        private val type: KType,
        private val backingIterator: Iterator<MutableMap.MutableEntry<K, V>>
    ) : Iterator<IKeyValuePair<K, V>?> {
        override fun hasNext(): Boolean {
            return backingIterator.hasNext()
        }

        override fun next(): IKeyValuePair<K, V> {
            val next = backingIterator.next()
            return JVMKeyValuePair(
                IKeyValuePair::class.createType(
                    listOf(type.arguments[0], type.arguments[1])
                ), next.key to next.value
            )
        }
    }
}