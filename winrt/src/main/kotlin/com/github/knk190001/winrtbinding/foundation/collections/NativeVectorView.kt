package com.github.knk190001.winrtbinding.foundation.collections

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
import java.util.*
import kotlin.reflect.KType
import kotlin.reflect.full.createType

class NativeVectorView<T>(override val nativeVectorView: IVectorView<T>) : INativeVectorView<T> {
    override val Windows_Foundation_Collections_IVectorView_Type: KType =
        nativeVectorView.Windows_Foundation_Collections_IVectorView_Type!!
    override val Windows_Foundation_Collections_IIterable_Type: KType
        get() = nativeVectorView.Windows_Foundation_Collections_IIterable_Type
}

interface INativeVectorView<T> : List<T> {
    val Windows_Foundation_Collections_IVectorView_Type: KType
    val Windows_Foundation_Collections_IIterable_Type: KType
        get() = IIterable::class.createType(listOf(
            Windows_Foundation_Collections_IVectorView_Type.arguments[0],
        ))

    val nativeVectorView: IVectorView<T>

    override val size: Int
        get() = nativeVectorView.Size.toInt()

    override fun get(index: Int): T {
        return nativeVectorView.GetAt(index.toUInt())
    }

    override fun isEmpty(): Boolean {
        return size == 0
    }

    private open class Itr<T>(val backingVector: IVectorView<T>) : Iterator<T> {
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
    }


    override fun iterator(): Iterator<T> {
        return Itr(nativeVectorView)
    }

    private class ListItr<T>(backingVector: IVectorView<T>, index: Int = 0) : Itr<T>(backingVector),
        ListIterator<T> {
        init {
            cursor = index
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
    }


    override fun listIterator(): ListIterator<T> {
        return ListItr(nativeVectorView)
    }

    override fun listIterator(index: Int): ListIterator<T> {
        return ListItr(nativeVectorView, index)
    }

    private class SubList<T>(val root: List<T>, fromIndex: Int, toIndex: Int) :
        List<T>, RandomAccess {
        var offset = fromIndex
        override var size = toIndex - fromIndex
        override fun containsAll(elements: Collection<T>): Boolean {
            return elements.all { contains(it) }
        }

        override fun contains(element: T): Boolean {
            return indexOf(element) >= 0
        }

        var parent: SubList<T>? = null

        constructor(parent: SubList<T>, fromIndex: Int, toIndex: Int) : this(
            parent.root,
            fromIndex,
            toIndex
        ) {
            this.parent = parent
            offset = parent.offset + fromIndex
        }

        override fun get(index: Int): T {
            Objects.checkIndex(index, size)
            return root[offset + index]
        }

        override fun isEmpty(): Boolean {
            return size == 0
        }

        override fun indexOf(element: T): Int {
            val end = offset + size
            for (i in offset..<end) {
                if (element == root[i]) return i - offset
            }
            return -1
        }


        override fun subList(fromIndex: Int, toIndex: Int): List<T> {
            subListRangeCheck(fromIndex, toIndex, size)
            return SubList(this, fromIndex, toIndex)
        }

        override fun iterator(): Iterator<T> {
            return listIterator()
        }

        override fun lastIndexOf(element: T): Int {
            val end = offset + size
            for (i in end - 1 downTo offset) {
                if (element == root[i]) return i - offset
            }
            return -1
        }

        override fun listIterator(): ListIterator<T> {
            return listIterator(0)
        }

        override fun listIterator(index: Int): ListIterator<T> {
            rangeCheckForAdd(index)

            return object : ListIterator<T> {
                private val i: ListIterator<T> = root.listIterator(offset + index)

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
            }
        }

        private fun rangeCheckForAdd(index: Int) {
            if (index > size || index < 0) throw IndexOutOfBoundsException(index)
        }
    }


    override fun subList(fromIndex: Int, toIndex: Int): List<T> {
        subListRangeCheck(fromIndex, toIndex, size)
        return SubList(this, fromIndex, toIndex)
    }

    override fun lastIndexOf(element: T): Int {
        for (i in size - 1 downTo 0) {
            if (element == this[i]) return i
        }
        return -1
    }

    override fun indexOf(element: T): Int {
        for (i in 0..<size) {
            if (element == this[i]) return i
        }
        return -1
    }

    override fun containsAll(elements: Collection<T>): Boolean {
        return elements.all { contains(it) }
    }

    override fun contains(element: T): Boolean {
        return indexOf(element) >= 0
    }

    companion object {
        private fun subListRangeCheck(fromIndex: Int, toIndex: Int, size: Int) {
            if (fromIndex < 0) throw IndexOutOfBoundsException("fromIndex = $fromIndex")
            if (toIndex > size) throw IndexOutOfBoundsException("toIndex = $toIndex")
            require(fromIndex <= toIndex) { "fromIndex($fromIndex) > toIndex($toIndex)" }
        }
    }
}