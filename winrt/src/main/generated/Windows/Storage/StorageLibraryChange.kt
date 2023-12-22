package Windows.Storage

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

@ABIMarker(StorageLibraryChange.ABI::class)
@Signature("rc(Windows.Storage.StorageLibraryChange;{00980b23-2be2-4909-aa48-159f5203a51e})")
@WinRTByReference(brClass = StorageLibraryChange.ByReference::class)
public class StorageLibraryChange(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorageLibraryChange.WithDefault, IWinRTObject {
  private val __694935465_Interface: IStorageLibraryChange.WithDefault by lazy {
    as_694935465()
  }


  public override val __694935465_Ptr: JNAPointer? by lazy {
    __694935465_Interface.__694935465_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__694935465_Interface)

  private fun as_694935465(): IStorageLibraryChange.WithDefault {
    if(pointer == NULL) {
      return(IStorageLibraryChange.ABI.makeIStorageLibraryChange(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageLibraryChange>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageLibraryChange.ABI.makeIStorageLibraryChange(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StorageLibraryChange> {
    public override fun getValue() = StorageLibraryChange(pointer.getPointer(0))

    public fun setValue(value: StorageLibraryChange): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorageLibraryChange, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StorageLibraryChange {
      val address = segment.toRawLongValue()
      return StorageLibraryChange(Pointer(address))
    }

    public override fun toNative(obj: StorageLibraryChange): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
