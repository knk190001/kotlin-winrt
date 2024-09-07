package com.github.knk190001.winrtbinding.foundation.collections

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVector
import com.github.knk190001.winrtbinding.foundation.collections.INativeVector.SubList
import java.util.*
import java.util.function.Predicate
import kotlin.reflect.KType
import kotlin.reflect.full.createType

class NativeVector<T>(override val nativeVector: IVector<T>) : INativeVector<T> {
    override val Windows_Foundation_Collections_IVector_Type: KType =
        nativeVector.Windows_Foundation_Collections_IVector_Type!!

    override val Windows_Foundation_Collections_IIterable_Type: KType =
        nativeVector.Windows_Foundation_Collections_IIterable_Type
}

interface INativeVector<T> : MutableList<T> {
    val Windows_Foundation_Collections_IVector_Type: KType
    val Windows_Foundation_Collections_IIterable_Type: KType
        get() = IIterable::class.createType(listOf(
            Windows_Foundation_Collections_IVector_Type.arguments[0],
        ))

    val nativeVector: IVector<T>

    override val size: Int
        get() = nativeVector.Size.toInt()

    override fun clear() {
        nativeVector.Clear()
    }

    override fun addAll(elements: Collection<T>): Boolean {
        elements.forEach(nativeVector::Append)
        return true
    }

    override fun addAll(index: Int, elements: Collection<T>): Boolean {
        elements.reversed().forEach {
            nativeVector.InsertAt(index.toUInt(), it)
        }
        return true
    }

    override fun add(index: Int, element: T) {
        nativeVector.InsertAt(index.toUInt(), element)
    }

    override fun add(element: T): Boolean {
        nativeVector.Append(element)
        return true
    }

    override fun get(index: Int): T {
        return nativeVector.GetAt(index.toUInt())
    }

    override fun isEmpty(): Boolean {
        return nativeVector.Size.toInt() == 0
    }

    private open class Itr<T>(val backingVector: IVector<T>) : MutableIterator<T> {
        var cursor = 0
        var lastRet = -1
        override fun hasNext(): Boolean {
            return cursor != backingVector.Size.toInt()
        }

        override fun next(): T {
            val i = cursor
            if (i >= backingVector.Size.toInt()) {
                throw NoSuchElementException()
            }
            cursor = i + 1
            lastRet = i
            return backingVector.GetAt(i.toUInt())
        }

        override fun remove() {
            if (lastRet < 0) {
                throw IllegalStateException()
            }
            backingVector.RemoveAt(lastRet.toUInt())
            cursor = lastRet
        }

    }

    private class ListItr<T>(backingVector: IVector<T>, index: Int = 0) : Itr<T>(backingVector),
        MutableListIterator<T> {
        init {
            cursor = index
        }

        override fun add(element: T) {
            val i = cursor
            backingVector.InsertAt(i.toUInt(), element)
            cursor = i + 1
            lastRet = -1
        }

        override fun hasPrevious(): Boolean = cursor != 0

        override fun nextIndex(): Int = cursor

        override fun previous(): T {
            val i = cursor - 1
            if (i < 0) throw NoSuchElementException()
            cursor = i
            lastRet = i
            return backingVector.GetAt(lastRet.toUInt())
        }

        override fun previousIndex(): Int = cursor - 1

        override fun set(element: T) {
            if (lastRet < 0) {
                throw IllegalStateException()
            }

            backingVector.SetAt(lastRet.toUInt(), element)
        }
    }

    override fun iterator(): MutableIterator<T> {
        return Itr(nativeVector)
    }

    override fun listIterator(): MutableListIterator<T> {
        return ListItr(nativeVector)
    }

    override fun listIterator(index: Int): MutableListIterator<T> {
        return ListItr(nativeVector, index)
    }

    override fun removeAt(index: Int): T {
        val uIndex = index.toUInt()
        val result = nativeVector.GetAt(uIndex)
        nativeVector.RemoveAt(uIndex)
        return result
    }

    companion object {
        private fun subListRangeCheck(fromIndex: Int, toIndex: Int, size: Int) {
            if (fromIndex < 0) throw IndexOutOfBoundsException("fromIndex = $fromIndex")
            if (toIndex > size) throw IndexOutOfBoundsException("toIndex = $toIndex")
            require(fromIndex <= toIndex) { "fromIndex($fromIndex) > toIndex($toIndex)" }
        }
    }

    override fun subList(fromIndex: Int, toIndex: Int): MutableList<T> {
        subListRangeCheck(fromIndex, toIndex, size)
        return SubList(this, fromIndex, toIndex)
    }

    private class SubList<T>(val root: MutableList<T>, val fromIndex: Int, val toIndex: Int) :
        AbstractMutableList<T>(), RandomAccess {
        var offset = fromIndex
        override var size = toIndex - fromIndex
        var parent: INativeVector.SubList<T>? = null

        constructor(parent: INativeVector.SubList<T>, fromIndex: Int, toIndex: Int) : this(
            parent.root,
            fromIndex,
            toIndex
        ) {
            this.parent = parent
            offset = parent.offset + fromIndex
        }

        override fun set(index: Int, element: T): T {
            Objects.checkIndex(index, size)
            val oldVal = root[offset + index]
            root[offset + index] = element
            return oldVal
        }

        override fun get(index: Int): T {
            Objects.checkIndex(index, size)
            return root[offset + index]
        }

        override fun add(index: Int, element: T) {
            Objects.checkIndex(index, size)
            root.add(offset + index, element)
            updateSize(1)
        }

        override fun removeAt(index: Int): T {
            Objects.checkIndex(index, size)
            val result = root.removeAt(offset + index)
            updateSize(-1)
            return result
        }

        override fun removeRange(fromIndex: Int, toIndex: Int) {
            super.removeRange(fromIndex, toIndex)
            updateSize(fromIndex - toIndex)
        }

        override fun addAll(elements: Collection<T>): Boolean {
            return addAll(size, elements)
        }

        override fun addAll(index: Int, elements: Collection<T>): Boolean {
            val cSize = elements.size
            super.addAll(index, elements)
            updateSize(cSize)
            return true
        }

        override fun removeAll(elements: Collection<T>): Boolean {
            val oldSize = root.size
            val result = super.removeAll(elements)
            updateSize(root.size - oldSize)
            return result
        }

        override fun retainAll(elements: Collection<T>): Boolean {
            val oldSize = root.size
            val result = super.retainAll(elements)
            updateSize(root.size - oldSize)
            return result
        }

        override fun removeIf(filter: Predicate<in T>): Boolean {
            val oldSize = root.size
            val result = super.removeIf(filter)
            updateSize(root.size - oldSize)
            return result
        }

        override fun subList(fromIndex: Int, toIndex: Int): MutableList<T> {
            subListRangeCheck(fromIndex, toIndex, size)
            return SubList(this, fromIndex, toIndex)
        }

        override fun iterator(): MutableIterator<T> {
            return listIterator()
        }

        override fun listIterator(index: Int): MutableListIterator<T> {
            rangeCheckForAdd(index)

            return object : MutableListIterator<T> {
                private val i: MutableListIterator<T> = root.listIterator(offset + index)

                override fun hasNext(): Boolean {
                    return nextIndex() < size
                }

                override fun next(): T {
                    if (hasNext()) return i.next()
                    else throw NoSuchElementException()
                }

                override fun hasPrevious(): Boolean {
                    return previousIndex() >= 0
                }

                override fun previous(): T {
                    if (hasPrevious()) return i.previous()
                    else throw NoSuchElementException()
                }

                override fun nextIndex(): Int {
                    return i.nextIndex() - offset
                }

                override fun previousIndex(): Int {
                    return i.previousIndex() - offset
                }

                override fun remove() {
                    i.remove()
                    updateSize(-1)
                }

                override fun set(element: T) {
                    i.set(element)
                }

                override fun add(element: T) {
                    i.add(element)
                    updateSize(1)
                }
            }
        }

        private fun rangeCheckForAdd(index: Int) {
            if (index > size || index < 0) throw IndexOutOfBoundsException(index)
        }

        private fun updateSize(sizeChange: Int) {
            var slist: INativeVector.SubList<T>? = this
            do {
                slist!!.size += sizeChange
                slist = slist!!.parent
            } while (slist != null)
        }
    }

    override fun set(index: Int, element: T): T {
        val uIndex = index.toUInt()
        val prev = nativeVector.GetAt(uIndex)
        nativeVector.SetAt(uIndex, element)
        return prev
    }

    override fun retainAll(elements: Collection<T>): Boolean {
        var modified = false
        val it: MutableIterator<T> = iterator()
        while (it.hasNext()) {
            if (!elements.contains(it.next())) {
                it.remove()
                modified = true
            }
        }
        return modified
    }

    override fun removeAll(elements: Collection<T>): Boolean {
        var modified = false
        val it: MutableIterator<T> = iterator()
        while (it.hasNext()) {
            if (elements.contains(it.next())) {
                it.remove()
                modified = true
            }
        }
        return modified
    }

    override fun remove(element: T): Boolean {
        val iterator = iterator()
        while (iterator.hasNext()) {
            if (iterator.next() == element) {
                iterator.remove()
                return true
            }
        }
        return false
    }

    override fun lastIndexOf(element: T): Int {
        for (i in (0..<size).reversed()) {
            if (this[i] == element) {
                return i
            }
        }
        return -1
    }

    override fun indexOf(element: T): Int {
        for (i in 0..<size) {
            if (this[i] == element) {
                return i
            }
        }
        return -1
    }

    override fun containsAll(elements: Collection<T>): Boolean {
        return elements.all(::contains)
    }

    override fun contains(element: T): Boolean {
        return any { it == element }
    }
}