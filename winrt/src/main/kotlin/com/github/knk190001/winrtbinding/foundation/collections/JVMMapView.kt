package com.github.knk190001.winrtbinding.foundation.collections

import Windows.Foundation.Collections.IIterator
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.Collections.IMapView
import com.github.knk190001.winrtbinding.runtime.annotations.ObjectImplements
import com.github.knk190001.winrtbinding.runtime.base.KotlinWinRTObject
import kotlin.math.ceil
import kotlin.reflect.KType
import kotlin.reflect.KTypeProjection
import kotlin.reflect.KVariance
import kotlin.reflect.full.createType

@ObjectImplements([IMapView::class])
class JVMMapView<K, V>(type: KType, backingMap: Map<K, V>) : KotlinWinRTObject(), IMapView<K, V>,
    Map<K, V> by backingMap {

    override val Windows_Foundation_Collections_IMapView_Type: KType = type
    init {
        initObj()
    }

    override val Size: UInt = size.toUInt()

    override fun Split(first: IMapView.ByReference<K, V>?, second: IMapView.ByReference<K, V>?) {
        if (isEmpty()) {
            first!!.setValue(IMapView.IMapViewImpl(Windows_Foundation_Collections_IMapView_Type = Windows_Foundation_Collections_IMapView_Type))
            second!!.setValue(IMapView.IMapViewImpl(Windows_Foundation_Collections_IMapView_Type = Windows_Foundation_Collections_IMapView_Type))
        }
        val half = ceil(size / 2f).toInt()
        val items = entries.chunked(half)
        val firstHalf = JVMMapView(Windows_Foundation_Collections_IMapView_Type, items[0].associate { it.toPair() })
        val secondHalf =
            if (size != 1) JVMMapView(Windows_Foundation_Collections_IMapView_Type, items[1].associate { it.toPair() })
            else JVMMapView(Windows_Foundation_Collections_IMapView_Type, emptyMap())

        first?.setValue(firstHalf)
        second?.setValue(secondHalf)
    }

    override fun HasKey(key: K): Boolean {
        return containsKey(key)
    }

    override fun Lookup(key: K): V {
        @Suppress("UNCHECKED_CAST")
        return get(key) as V
    }

    override fun First(): Iterator<IKeyValuePair<K, V>?> {
        return JVMIterator(
            IIterator::class.createType(
                listOf(
                    KTypeProjection(KVariance.INVARIANT, Windows_Foundation_Collections_IMapView_Type.arguments[0].type),
                    KTypeProjection(KVariance.INVARIANT, Windows_Foundation_Collections_IMapView_Type.arguments[1].type)
                )
            ), Itr(Windows_Foundation_Collections_IMapView_Type, iterator())
        )
    }

    private class Itr<K, V>(private val type: KType, private val backingIterator: Iterator<Map.Entry<K, V>>): Iterator<IKeyValuePair<K, V>?> {
        override fun hasNext(): Boolean {
            return backingIterator.hasNext()
        }

        override fun next(): IKeyValuePair<K, V> {
            val next = backingIterator.next()
            return JVMKeyValuePair(IKeyValuePair::class.createType(
                listOf(type.arguments[0], type.arguments[1])
            ), next.key to next.value)
        }
    }
}