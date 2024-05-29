package com.github.knk190001.winrtbinding.foundation.collections

import Windows.Foundation.Collections.IIterator
import Windows.Foundation.Collections.IVectorView
import com.github.knk190001.winrtbinding.runtime.base.KotlinWinRTObject
import com.github.knk190001.winrtbinding.runtime.interop.UIntByReference
import com.sun.jna.platform.win32.WinDef
import kotlin.reflect.KType
import kotlin.reflect.full.createType

class JVMVectorView<T>(type:KType, private val backingList: List<T>): KotlinWinRTObject(), IVectorView<T>, List<T> by backingList {

    override val _Windows_Foundation_CollectionsIVectorView_Type: KType = type
    init {
        initObj()
    }
    override fun GetAt(index: WinDef.UINT): T {
        return backingList[index.toInt()]
    }

    override fun get_Size(): WinDef.UINT {
        return WinDef.UINT(backingList.size.toLong())
    }

    override fun GetMany(startIndex: WinDef.UINT, items: Array<T>): WinDef.UINT {
        var backingIdx = startIndex.toInt()
        var idx = 0
        while (backingIdx < backingList.size) {
            items[idx] = backingList[idx]
            backingIdx++
            idx++
        }
        return WinDef.UINT(idx.toLong())
    }

    override fun IndexOf(value: T, index: UIntByReference): Boolean {
        val indexOf = backingList.indexOf(value)
        if (indexOf != -1) {
            index.value = WinDef.UINT(indexOf.toLong())
            return true
        }
        return false
    }

    override fun First(): JVMIterator<T> {
        return JVMIterator(IIterator::class.createType(
            listOf(_Windows_Foundation_CollectionsIVectorView_Type.arguments[0])
        ),backingList.iterator())
    }


}