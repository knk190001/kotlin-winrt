package com.github.knk190001.winrtbinding.runtime.base

import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import java.lang.foreign.Arena
import java.lang.ref.Cleaner
import java.lang.ref.WeakReference
import java.util.concurrent.ConcurrentHashMap

object ReferenceManager {
    private val arenaTable = ConcurrentHashMap<Long, Arena?>()
    private val backingObjects = ConcurrentHashMap<Long, Ref<Any?>>()
    private val cleaner = Cleaner.create()

    private interface Ref<T> {
        fun get(): T?

        fun toWeak(): Ref<T> {
            return WeakRef(get()!!)
        }

        fun toStrong(): Ref<T> {
            return StrongRef(get()!!)
        }
    }

    private class StrongRef<T>(val value: T) : Ref<T> {
        override fun get(): T? {
            return value
        }

        override fun toStrong(): Ref<T> {
            return this
        }
    }

    private class WeakRef<T>(value: T) : Ref<T> {
        private val ref = WeakReference(value)
        override fun get(): T? {
            return ref.get()
        }

        override fun toWeak(): Ref<T> {
            return this
        }
    }

    fun registerArena(arena: Arena, address: Long) {
        arenaTable[address] = arena
    }

    fun registerBackingObject(obj: Any?, address: Long) {
        backingObjects[address] = WeakRef(obj)
    }

    fun releaseOnGC(obj: IUnknown) {
        val clone = IUnknown.ABI.makeIUnknown(obj.iUnknown_Ptr)
        cleaner.register(obj) {
            clone.Release()
        }
    }

    fun getArena(address: Long): Arena? {
        return arenaTable[address]
    }

    fun setWeak(address: Long) {
        backingObjects[address] = backingObjects[address]!!.toWeak()
    }

    fun setStrong(address: Long) {
        backingObjects[address] = backingObjects[address]!!.toStrong()
    }

    fun remove(address: Long) {
        arenaTable[address]!!.close()
        arenaTable.remove(address)
        backingObjects.remove(address)
        println("Freed: 0x${address.toString(16)}")
    }

    fun removeOnGC(obj: IUnknown, address: Long) {
        cleaner.register(obj) {
            remove(address)
        }
    }

    fun containsBackingObject(address: Long): Boolean {
        return backingObjects.containsKey(address)
    }
}