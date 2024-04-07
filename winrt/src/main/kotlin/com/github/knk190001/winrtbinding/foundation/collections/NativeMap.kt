package com.github.knk190001.winrtbinding.foundation.collections

import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.Collections.IMap

interface NativeMap<K, V> : IMap.WithDefault<K, V>, MutableMap<K, V> {
    override fun remove(key: K): V? {
        val previous = Lookup(key)
        Remove(key)
        return previous
    }

    override fun putAll(from: Map<out K, V>) {
        from.forEach { (key, value) -> put(key, value) }
    }

    override fun clear() {
        Clear()
    }

    override fun put(key: K, value: V): V? {
        val previous = Lookup(key)
        Insert(key, value)
        return previous
    }

    class EntrySet<K, V>(private val backingMap: NativeMap<K, V>) :
        AbstractMutableSet<MutableMap.MutableEntry<K, V>>() {
        override val size: Int
            get() = backingMap.size

        override fun add(element: MutableMap.MutableEntry<K, V>): Boolean {
            val original = backingMap[element.key]
            backingMap[element.key] = element.value
            return original != element.value
        }

        override fun clear() {
            backingMap.clear()
        }

        override fun iterator(): MutableIterator<MutableMap.MutableEntry<K, V>> {
            val iterator = backingMap.First()
            val contents = mutableListOf<IKeyValuePair<K, V>>()
            while (iterator!!.hasNext()) {
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
                            get() = current.get_Key()
                        override val value: V
                            get() = current.get_Value()

                        override fun setValue(newValue: V): V {
                            val oldValue = value
                            backingMap[key] = newValue
                            return oldValue
                        }
                    }
                }

                override fun remove() {
                    val previous = contents[index - 1]
                    backingMap.Remove(previous.get_Key())
                    contents.removeAt(index - 1)
                    index--
                }
            }
        }
    }

    override val entries: MutableSet<MutableMap.MutableEntry<K, V>>
        get() = EntrySet(this)


    class KeySet<K, V>(private val backingMap: NativeMap<K, V>) : AbstractMutableSet<K>() {
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
            val iterator = backingMap.First()
            val contents = mutableListOf<IKeyValuePair<K, V>>()
            while (iterator!!.hasNext()) {
                contents.add(iterator.next()!!)
            }

            return object : MutableIterator<K> {
                private var index = 0

                override fun hasNext(): Boolean {
                    return index < contents.size
                }

                override fun next(): K {
                    val current = contents[index]
                    index++
                    return current.get_Key()
                }

                override fun remove() {
                    val previous = contents[index - 1]
                    backingMap.Remove(previous.get_Key())
                    contents.removeAt(index - 1)
                    index--
                }
            }
        }
    }

    override val keys: MutableSet<K>
        get() = KeySet(this)
    override val size: Int
        get() = get_Size().toInt()

    class Values<K, V>(private val backingMap: NativeMap<K, V>) : AbstractMutableCollection<V>() {
        override val size: Int
            get() = backingMap.size

        override fun add(element: V): Boolean {
            throw UnsupportedOperationException()
        }

        override fun clear() {
            backingMap.clear()
        }

        override fun remove(element: V): Boolean {
            val iterator = backingMap.First()
            while (iterator!!.hasNext()) {
                val current = iterator.next()
                if (current!!.get_Value() == element) {
                    backingMap.Remove(current.get_Key())
                    return true
                }
            }
            return false
        }

        override fun iterator(): MutableIterator<V> {
            val iterator = backingMap.First()
            val contents = mutableListOf<IKeyValuePair<K, V>>()
            while (iterator!!.hasNext()) {
                contents.add(iterator.next()!!)
            }

            return object : MutableIterator<V> {
                private var index = 0

                override fun hasNext(): Boolean {
                    return index < contents.size
                }

                override fun next(): V {
                    val current = contents[index]
                    index++
                    return current.get_Value()
                }

                override fun remove() {
                    val previous = contents[index - 1]
                    backingMap.Remove(previous.get_Key())
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
        return HasKey(key)
    }

    override fun containsValue(value: V): Boolean {
        return values.contains(value)
    }

    override fun get(key: K): V? {
        return Lookup(key)
    }

    override fun isEmpty(): Boolean {
        return get_Size().toInt() == 0
    }
}