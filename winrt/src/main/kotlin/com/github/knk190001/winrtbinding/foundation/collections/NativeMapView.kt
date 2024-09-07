package com.github.knk190001.winrtbinding.foundation.collections

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.Collections.IMapView
import kotlin.reflect.KType
import kotlin.reflect.KTypeProjection
import kotlin.reflect.KVariance.INVARIANT
import kotlin.reflect.full.createType

class NativeMapView<K, V>(override val nativeMapView: IMapView<K, V>) : INativeMapView<K, V> {
    override val Windows_Foundation_Collections_IMapView_Type: KType =
        nativeMapView.Windows_Foundation_Collections_IMapView_Type!!

    override val Windows_Foundation_Collections_IIterable_Type: KType =
        nativeMapView.Windows_Foundation_Collections_IIterable_Type
}

interface INativeMapView<K, V> : Map<K, V> {
    val Windows_Foundation_Collections_IMapView_Type: KType
    val Windows_Foundation_Collections_IIterable_Type: KType
        get() = IIterable::class.createType(listOf(
            KTypeProjection(
                INVARIANT,IKeyValuePair::class.createType(listOf(
                Windows_Foundation_Collections_IMapView_Type!!.arguments[0],
                Windows_Foundation_Collections_IMapView_Type!!.arguments[1],
            ))),
        ))

    val nativeMapView: IMapView<K, V>

    override val entries: Set<Map.Entry<K, V>>
        get() = EntrySet(nativeMapView)

    override val keys: Set<K>
        get() = entries.map { it.key }.toSet()

    override val size: Int
        get() = nativeMapView.Size.toInt()

    override val values: Collection<V>
        get() = entries.map { it.value }

    private class EntrySet<K, V>(private val backingMap: IMapView<K, V>) :
        Set<Map.Entry<K, V>> {
        override val size: Int
            get() = backingMap.Size.toInt()

        override fun isEmpty(): Boolean {
            return size == 0
        }

        override fun containsAll(elements: Collection<Map.Entry<K, V>>): Boolean {
            return elements.all { backingMap.HasKey(it.key) && backingMap.Lookup(it.key) == it.value }
        }

        override fun contains(element: Map.Entry<K, V>): Boolean {
            return backingMap.HasKey(element.key) && backingMap.Lookup(element.key) == element.value
        }

        override fun iterator(): Iterator<Map.Entry<K, V>> {
            val iterator = backingMap.First()!!
            val contents = mutableListOf<IKeyValuePair<K, V>>()
            while (iterator.hasNext()) {
                contents.add(iterator.next()!!)
            }

            return object : Iterator<Map.Entry<K, V>> {
                private var index = 0

                override fun hasNext(): Boolean {
                    return index < contents.size
                }

                override fun next(): Map.Entry<K, V> {
                    val current = contents[index]
                    index++
                    return object : Map.Entry<K, V> {
                        override val key: K
                            get() = current.Key
                        override val value: V
                            get() = current.Value

                    }
                }
            }
        }
    }


    override fun containsKey(key: K): Boolean {
        return nativeMapView.HasKey(key)
    }

    override fun containsValue(value: V): Boolean {
        return entries.firstOrNull { it.value == value } != null
    }

    override fun get(key: K): V? {
        return nativeMapView.Lookup(key)
    }

    override fun isEmpty(): Boolean {
        return nativeMapView.Size.toInt() == 0
    }
}