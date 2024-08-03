package com.github.knk190001.winrtbinding.foundation.collections

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IIterator
import Windows.Foundation.Collections.IVector
import Windows.Foundation.Collections.IVectorView
import com.github.knk190001.winrtbinding.runtime.annotations.ObjectImplements
import com.github.knk190001.winrtbinding.runtime.base.KotlinWinRTObject
import com.github.knk190001.winrtbinding.runtime.interop.UIntByReference
import kotlin.reflect.KType
import kotlin.reflect.full.createType


@ObjectImplements([IVector::class, IIterable::class])
class JVMVector<T>(type: KType, private val backingList: MutableList<T>) : KotlinWinRTObject(), IVector<T>,
    MutableList<T> by backingList {
        override val Windows_Foundation_Collections_IVector_Type: KType = type

    override fun GetAt(index: UInt): T {
        return backingList[index.toInt()]
    }

    override val Size: UInt
        get() {
            return backingList.size.toUInt()
        }

    override fun GetView(): List<T> {
        return JVMVectorView(
            IVectorView::class.createType(listOf(Windows_Foundation_Collections_IVector_Type.arguments[0])),
            backingList
        )
    }

    override fun RemoveAt(index: UInt) {
        backingList.removeAt(index.toInt())
    }

    override fun RemoveAtEnd() {
        backingList.dropLast(1)
    }

    override fun Clear() {
        backingList.clear()
    }

    override fun ReplaceAll(items: Array<T>) {
        backingList.clear()
        backingList.addAll(items)
    }

    override fun GetMany(startIndex: UInt, items: Array<T>): UInt {
        var backingIdx = startIndex.toInt()
        var idx = 0
        while (backingIdx < backingList.size) {
            items[idx] = backingList[idx]
            backingIdx++
            idx++
        }
        return idx.toUInt()
    }

    override fun Append(value: T) {
        backingList += value
    }

    override fun InsertAt(index: UInt, value: T) {
        backingList.add(index.toInt(), value)
    }

    override fun SetAt(index: UInt, value: T) {
        backingList[index.toInt()] = value
    }

    override fun IndexOf(value: T, index: UIntByReference): Boolean {
        val indexOf = backingList.indexOf(value)
        if (indexOf != -1) {
            index.setValue(indexOf.toUInt())
            return true
        }
        return false
    }

    override fun First(): JVMIterator<T> {
        return JVMIterator(
            IIterator::class.createType(
                listOf(Windows_Foundation_Collections_IVector_Type.arguments[0])
            ), backingList.iterator()
        )
    }
}