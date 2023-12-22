package Windows.Storage.Search

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

@ABIMarker(StorageLibraryContentChangedTriggerDetails.ABI::class)
@Signature("rc(Windows.Storage.Search.StorageLibraryContentChangedTriggerDetails;{2a371977-abbf-4e1d-8aa5-6385d8884799})")
@WinRTByReference(brClass = StorageLibraryContentChangedTriggerDetails.ByReference::class)
public class StorageLibraryContentChangedTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorageLibraryContentChangedTriggerDetails.WithDefault, IWinRTObject {
  private val __1226699240_Interface: IStorageLibraryContentChangedTriggerDetails.WithDefault by
      lazy {
    as_1226699240()
  }


  public override val __1226699240_Ptr: JNAPointer? by lazy {
    __1226699240_Interface.__1226699240_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1226699240_Interface)

  private fun as_1226699240(): IStorageLibraryContentChangedTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IStorageLibraryContentChangedTriggerDetails.ABI.makeIStorageLibraryContentChangedTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageLibraryContentChangedTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageLibraryContentChangedTriggerDetails.ABI.makeIStorageLibraryContentChangedTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StorageLibraryContentChangedTriggerDetails> {
    public override fun getValue() =
        StorageLibraryContentChangedTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: StorageLibraryContentChangedTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorageLibraryContentChangedTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        StorageLibraryContentChangedTriggerDetails {
      val address = segment.toRawLongValue()
      return StorageLibraryContentChangedTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: StorageLibraryContentChangedTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
