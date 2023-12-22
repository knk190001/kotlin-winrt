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

@ABIMarker(StorageItemAccessList.ABI::class)
@Signature("rc(Windows.Storage.AccessCache.StorageItemAccessList;{2caff6ad-de90-47f5-b2c3-dd36c9fdd453})")
@WinRTByReference(brClass = StorageItemAccessList.ByReference::class)
public class StorageItemAccessList(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorageItemAccessList.WithDefault, IWinRTObject {
  private val __178972825_Interface: IStorageItemAccessList.WithDefault by lazy {
    as_178972825()
  }


  public override val __178972825_Ptr: JNAPointer? by lazy {
    __178972825_Interface.__178972825_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__178972825_Interface)

  private fun as_178972825(): IStorageItemAccessList.WithDefault {
    if(pointer == NULL) {
      return(IStorageItemAccessList.ABI.makeIStorageItemAccessList(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageItemAccessList>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageItemAccessList.ABI.makeIStorageItemAccessList(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StorageItemAccessList> {
    public override fun getValue() = StorageItemAccessList(pointer.getPointer(0))

    public fun setValue(value: StorageItemAccessList): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorageItemAccessList, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StorageItemAccessList {
      val address = segment.toRawLongValue()
      return StorageItemAccessList(Pointer(address))
    }

    public override fun toNative(obj: StorageItemAccessList): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
