package com.github.knk190001.winrtbinding.foundation.collections

import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.Collections.IMapView

interface NativeMapView<K, V>: IMapView.WithDefault<K, V>, Map<K, V> {
    override val entries: Set<Map.Entry<K, V>>
        get() = EntrySet(this)
    override val keys: Set<K>
        get() = entries.map { it.key }.toSet()
    override val size: Int
        get() = Size.toInt()
    override val values: Collection<V>
        get() = entries.map { it.value }

    private class EntrySet<K, V>(private val backingMap: NativeMapView<K, V>) :
        Set<Map.Entry<K, V>> {
        override val size: Int
            get() = backingMap.size

        override fun isEmpty(): Boolean {
            return backingMap.isEmpty()
        }

        override fun containsAll(elements: Collection<Map.Entry<K, V>>): Boolean {
            return elements.all { backingMap.containsKey(it.key) && backingMap[it.key] == it.value }
        }

        override fun contains(element: Map.Entry<K, V>): Boolean {
            return backingMap.containsKey(element.key) && backingMap[element.key] == element.value
        }

        override fun iterator(): Iterator<Map.Entry<K, V>> {
            val iterator = backingMap.First()
            val contents = mutableListOf<IKeyValuePair<K, V>>()
            while (iterator!!.hasNext()) {
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
        return HasKey(key)
    }

    override fun containsValue(value: V): Boolean {
        return entries.firstOrNull { it.value == value } != null
    }

    override fun get(key: K): V? {
        return Lookup(key)
    }

    override fun isEmpty(): Boolean {
        return Size.toInt() == 0
    }
}