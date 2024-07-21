package com.github.knk190001.winrtbinding.foundation.collections

import Windows.Foundation.Collections.IIterator
import Windows.Foundation.Collections.IVectorView
import com.github.knk190001.winrtbinding.runtime.base.KotlinWinRTObject
import com.github.knk190001.winrtbinding.runtime.interop.UIntByReference
import kotlin.reflect.KType
import kotlin.reflect.full.createType

class JVMVectorView<T>(type: KType, private val backingList: List<T>) : KotlinWinRTObject(), IVectorView<T>,
    List<T> by backingList {

    override val Windows_Foundation_Collections_IVectorView_Type: KType = type

    init {
        initObj()
    }

    override fun GetAt(index: UInt): T {
        return backingList[index.toInt()]
    }

    override val Size: UInt
        get() {
            return backingList.size.toUInt()
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
                listOf(Windows_Foundation_Collections_IVectorView_Type.arguments[0])
            ), backingList.iterator()
        )
    }
}