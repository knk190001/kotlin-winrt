package Windows.Storage.AccessCache

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(StorageItemMostRecentlyUsedList.ABI::class)
@Signature("rc(Windows.Storage.AccessCache.StorageItemMostRecentlyUsedList;{016239d5-510d-411e-8cf1-c3d1effa4c33})")
@WinRTByReference(brClass = StorageItemMostRecentlyUsedList.ByReference::class)
public class StorageItemMostRecentlyUsedList(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorageItemMostRecentlyUsedList.WithDefault,
    IStorageItemAccessList.WithDefault, IStorageItemMostRecentlyUsedList2.WithDefault, IWinRTObject
    {
  private val __1997806101_Interface: IStorageItemMostRecentlyUsedList.WithDefault by lazy {
    as_1997806101()
  }


  private val __178972825_Interface: IStorageItemAccessList.WithDefault by lazy {
    as_178972825()
  }


  private val __1802446937_Interface: IStorageItemMostRecentlyUsedList2.WithDefault by lazy {
    as_1802446937()
  }


  public override val __1997806101_Ptr: JNAPointer? by lazy {
    __1997806101_Interface.__1997806101_Ptr
  }


  public override val __178972825_Ptr: JNAPointer? by lazy {
    __178972825_Interface.__178972825_Ptr
  }


  public override val __1802446937_Ptr: JNAPointer? by lazy {
    __1802446937_Interface.__1802446937_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1997806101_Interface, __178972825_Interface, __1802446937_Interface)

  private fun as_1997806101(): IStorageItemMostRecentlyUsedList.WithDefault {
    if(pointer == NULL) {
      return(IStorageItemMostRecentlyUsedList.ABI.makeIStorageItemMostRecentlyUsedList(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageItemMostRecentlyUsedList>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageItemMostRecentlyUsedList.ABI.makeIStorageItemMostRecentlyUsedList(ref.value))
  }

  private fun as_178972825(): IStorageItemAccessList.WithDefault {
    if(pointer == NULL) {
      return(IStorageItemAccessList.ABI.makeIStorageItemAccessList(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageItemAccessList>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageItemAccessList.ABI.makeIStorageItemAccessList(ref.value))
  }

  private fun as_1802446937(): IStorageItemMostRecentlyUsedList2.WithDefault {
    if(pointer == NULL) {
      return(IStorageItemMostRecentlyUsedList2.ABI.makeIStorageItemMostRecentlyUsedList2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageItemMostRecentlyUsedList2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageItemMostRecentlyUsedList2.ABI.makeIStorageItemMostRecentlyUsedList2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StorageItemMostRecentlyUsedList> {
    public override fun getValue() = StorageItemMostRecentlyUsedList(pointer.getPointer(0))

    public fun setValue(value: StorageItemMostRecentlyUsedList): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorageItemMostRecentlyUsedList, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StorageItemMostRecentlyUsedList {
      val address = segment.toRawLongValue()
      return StorageItemMostRecentlyUsedList(Pointer(address))
    }

    public override fun toNative(obj: StorageItemMostRecentlyUsedList): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
