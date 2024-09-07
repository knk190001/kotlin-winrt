package com.github.knk190001.winrtbinding.foundation.collections

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.Collections.IMap
import kotlin.reflect.KType
import kotlin.reflect.KTypeProjection
import kotlin.reflect.KVariance.INVARIANT
import kotlin.reflect.full.createType

class NativeMap<K, V>(override val nativeMap: IMap<K, V>) : INativeMap<K, V> {
    override val Windows_Foundation_Collections_IMap_Type: KType = nativeMap.Windows_Foundation_Collections_IMap_Type!!
    override val Windows_Foundation_Collections_IIterable_Type: KType =
        nativeMap.Windows_Foundation_Collections_IIterable_Type
}

interface INativeMap<K, V> : MutableMap<K, V> {
    val Windows_Foundation_Collections_IMap_Type: KType
    val Windows_Foundation_Collections_IIterable_Type: KType
        get() = IIterable::class.createType(listOf(
            KTypeProjection(
                INVARIANT,IKeyValuePair::class.createType(listOf(
                Windows_Foundation_Collections_IMap_Type.arguments[0],
                Windows_Foundation_Collections_IMap_Type.arguments[1],
            ))),
        ))


    val nativeMap: IMap<K, V>

    override fun remove(key: K): V? {
        val previous = nativeMap.Lookup(key)
        nativeMap.Remove(key)
        return previous
    }

    override fun putAll(from: Map<out K, V>) {
        from.forEach { (key, value) -> put(key, value) }
    }

    override fun clear() {
        nativeMap.Clear()
    }

    override fun put(key: K, value: V): V? {
        val previous = nativeMap.Lookup(key)
        nativeMap.Insert(key, value)
        return previous
    }

    class EntrySet<K, V>(private val backingMap: IMap<K, V>) :
        AbstractMutableSet<MutableMap.MutableEntry<K, V>>() {
        override val size: Int
            get() = backingMap.Size.toInt()

        override fun add(element: MutableMap.MutableEntry<K, V>): Boolean {
            val original = backingMap.Lookup(element.key)
            backingMap.Insert(element.key, element.value)
            return original != element.value
        }

        override fun clear() {
            backingMap.Clear()
        }

        override fun iterator(): MutableIterator<MutableMap.MutableEntry<K, V>> {
            val iterator = backingMap.First()!!
            val contents = mutableListOf<IKeyValuePair<K, V>>()
            while (iterator.hasNext()) {
                contents.add(iterator.next()!!)
            }

            return object : MutableIterator<MutableMap.MutableEntry<K, V>> {
                private var index = 0

                override fun hasNext(): Boolean {
                    return index < contents.size
                }

                override fun next(): MutableMap.MutableEntry<K, V> {
                    val current = contents[index]
                    index++
                    return object : MutableMap.MutableEntry<K, V> {
                        override val key: K
                            get() = current.Key
                        override val value: V
                            get() = current.Value

                        override fun setValue(newValue: V): V {
                            val oldValue = value
                            backingMap.Insert(key, newValue)
                            return oldValue
                        }
                    }
                }

                override fun remove() {
                    val previous = contents[index - 1]
                    backingMap.Remove(previous.Key)
                    contents.removeAt(index - 1)
                    index--
                }
            }
        }
    }

    override val entries: MutableSet<MutableMap.MutableEntry<K, V>>
        get() = EntrySet(nativeMap)


    class KeySet<K, V>(private val backingMap: INativeMap<K, V>) : AbstractMutableSet<K>() {
        override val size: Int
            get() = backingMap.size

        override fun add(element: K): Boolean {
            throw UnsupportedOperationException("This set is remove-only")
        }

        override fun clear() {
            backingMap.clear()
        }

        override fun remove(element: K): Boolean {
            val contains = backingMap.containsKey(element)
            backingMap.remove(element)
            return contains
        }

        override fun iterator(): MutableIterator<K> {
            val iterator = backingMap.iterator()
            val contents = mutableListOf<MutableMap.MutableEntry<K, V>>()
            while (iterator.hasNext()) {
                contents.add(iterator.next())
            }

            return object : MutableIterator<K> {
                private var index = 0

                override fun hasNext(): Boolean {
                    return index < contents.size
                }

                override fun next(): K {
                    val current = contents[index]
                    index++
                    return current.key
                }

                override fun remove() {
                    val previous = contents[index - 1]
                    backingMap.remove(previous.key)
                    contents.removeAt(index - 1)
                    index--
                }
            }
        }
    }

    override val keys: MutableSet<K>
        get() = KeySet(this)

    override val size: Int
        get() = nativeMap.Size.toInt()

    class Values<K, V>(private val backingMap: INativeMap<K, V>) : AbstractMutableCollection<V>() {
        override val size: Int
            get() = backingMap.size

        override fun add(element: V): Boolean {
            throw UnsupportedOperationException()
        }

        override fun clear() {
            backingMap.clear()
        }

        override fun remove(element: V): Boolean {
            val iterator = backingMap.iterator()
            while (iterator.hasNext()) {
                val current = iterator.next()
                if (current.value == element) {
                    backingMap.remove(current.key)
                    return true
                }
            }
            return false
        }

        override fun iterator(): MutableIterator<V> {
            val iterator = backingMap.iterator()
            val contents = mutableListOf<MutableMap.MutableEntry<K, V>>()
            while (iterator.hasNext()) {
                contents.add(iterator.next())
            }

            return object : MutableIterator<V> {
                private var index = 0

                override fun hasNext(): Boolean {
                    return index < contents.size
                }

                override fun next(): V {
                    val current = contents[index]
                    index++
                    return current.value
                }

                override fun remove() {
                    val previous = contents[index - 1]
                    backingMap.remove(previous.key)
                    contents.removeAt(index - 1)
                    index--
                }
            }
        }
    }

    override val values: MutableCollection<V>
        get() {
            return Values(this)
        }

    override fun containsKey(key: K): Boolean {
        return nativeMap.HasKey(key)
    }

    override fun containsValue(value: V): Boolean {
        return values.contains(value)
    }

    override fun get(key: K): V? {
        return nativeMap.Lookup(key)
    }

    override fun isEmpty(): Boolean {
        return nativeMap.Size.toInt() == 0
    }
}