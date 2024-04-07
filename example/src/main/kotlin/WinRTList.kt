//import Windows.Foundation.Collections.IVector
//import com.sun.jna.platform.win32.WinDef
//
//class WinRTList<T>(val peer: IVector<T>): MutableList<T> {
//    override val size: Int
//        get() = peer.get_Size().toInt()
//
//    override fun clear() {
//        peer.Clear()
//    }
//
//    override fun addAll(elements: Collection<T>): Boolean {
//        elements.forEach { peer.Append(it) }
//        return true
//    }
//
//    override fun addAll(index: Int, elements: Collection<T>): Boolean {
//        elements.reversed().forEach {
//            peer.InsertAt(WinDef.UINT(index.toLong()),it)
//        }
//        return true
//    }
//
//    override fun add(index: Int, element: T) {
//        peer.InsertAt(WinDef.UINT(index.toLong()), element)
//    }
//
//    override fun add(element: T): Boolean {
//        peer.Append(element)
//        return true
//    }
//
//    override fun get(index: Int): T {
//        return peer.GetAt(WinDef.UINT(index.toLong()))
//    }
//
//    override fun isEmpty(): Boolean {
//        return peer.get_Size().toInt() == 0
//    }
//
//    override fun iterator(): MutableIterator<T> {
//        TODO("Not yet implemented")
//    }
//
//    override fun listIterator(): MutableListIterator<T> {
//        TODO("Not yet implemented")
//    }
//
//    override fun listIterator(index: Int): MutableListIterator<T> {
//        TODO("Not yet implemented")
//    }
//
//    override fun removeAt(index: Int): T {
//        val uintIndex = WinDef.UINT(index.toLong())
//        val result = peer.GetAt(uintIndex)
//        peer.RemoveAt(uintIndex)
//        return result
//    }
//
//    override fun set(index: Int, element: T): T {
//        val uintIndex = WinDef.UINT(index.toLong())
//        val result = peer.GetAt(uintIndex)
//        peer.SetAt(uintIndex,element)
//        return result
//    }
//
//    override fun retainAll(elements: Collection<T>): Boolean {
//        val removalIndices = mutableListOf<Int>()
//
//        for (i in 0 until peer.get_Size().toInt()) {
//            if (!elements.contains(peer.GetAt(WinDef.UINT(i.toLong())))) {
//                removalIndices += i
//            }
//        }
//
//        for (index in removalIndices) {
//            peer.RemoveAt(WinDef.UINT(index.toLong()))
//        }
//
//        return removalIndices.isNotEmpty()
//    }
//
//    override fun removeAll(elements: Collection<T>): Boolean {
//        val removalIndices = mutableListOf<Int>()
//
//        for (i in 0 until peer.get_Size().toInt()) {
//            if (elements.contains(peer.GetAt(WinDef.UINT(i.toLong())))) {
//                removalIndices += i
//            }
//        }
//
//        for (index in removalIndices) {
//            peer.RemoveAt(WinDef.UINT(index.toLong()))
//        }
//
//        return removalIndices.isNotEmpty()
//    }
//
//    override fun remove(element: T): Boolean {
//        for (i in 0 until peer.get_Size().toInt()) {
//            peer.GetAt(WinDef.UINT(i.toLong()))
//        }
//    }
//
//    override fun subList(fromIndex: Int, toIndex: Int): MutableList<T> {
//
//        TODO("Not yet implemented")
//    }
//
//    override fun lastIndexOf(element: T): Int {
//        TODO("Not yet implemented")
//    }
//
//    override fun indexOf(element: T): Int {
//        TODO("Not yet implemented")
//    }
//
//    override fun containsAll(elements: Collection<T>): Boolean {
//        TODO("Not yet implemented")
//    }
//
//    override fun contains(element: T): Boolean {
//        TODO("Not yet implemented")
//    }
//
//}