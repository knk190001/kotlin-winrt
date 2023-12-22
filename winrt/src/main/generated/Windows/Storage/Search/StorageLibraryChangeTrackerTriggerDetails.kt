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

@ABIMarker(StorageLibraryChangeTrackerTriggerDetails.ABI::class)
@Signature("rc(Windows.Storage.Search.StorageLibraryChangeTrackerTriggerDetails;{1dc7a369-b7a3-4df2-9d61-eba85a0343d2})")
@WinRTByReference(brClass = StorageLibraryChangeTrackerTriggerDetails.ByReference::class)
public class StorageLibraryChangeTrackerTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorageLibraryChangeTrackerTriggerDetails.WithDefault, IWinRTObject {
  private val __63109359_Interface: IStorageLibraryChangeTrackerTriggerDetails.WithDefault by lazy {
    as_63109359()
  }


  public override val __63109359_Ptr: JNAPointer? by lazy {
    __63109359_Interface.__63109359_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__63109359_Interface)

  private fun as_63109359(): IStorageLibraryChangeTrackerTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IStorageLibraryChangeTrackerTriggerDetails.ABI.makeIStorageLibraryChangeTrackerTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageLibraryChangeTrackerTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageLibraryChangeTrackerTriggerDetails.ABI.makeIStorageLibraryChangeTrackerTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StorageLibraryChangeTrackerTriggerDetails> {
    public override fun getValue() =
        StorageLibraryChangeTrackerTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: StorageLibraryChangeTrackerTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorageLibraryChangeTrackerTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        StorageLibraryChangeTrackerTriggerDetails {
      val address = segment.toRawLongValue()
      return StorageLibraryChangeTrackerTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: StorageLibraryChangeTrackerTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
