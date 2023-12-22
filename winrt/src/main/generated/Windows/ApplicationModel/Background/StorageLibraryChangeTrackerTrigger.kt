package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.IStorageLibraryChangeTrackerTriggerFactory.ABI.IID
import Windows.Storage.StorageLibraryChangeTracker
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(StorageLibraryChangeTrackerTrigger.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.StorageLibraryChangeTrackerTrigger;{84b3a058-6027-4b87-9790-bdf3f757dbd7})")
@WinRTByReference(brClass = StorageLibraryChangeTrackerTrigger.ByReference::class)
public class StorageLibraryChangeTrackerTrigger(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBackgroundTrigger.WithDefault, IWinRTObject {
  private val __54213927_Interface: IBackgroundTrigger.WithDefault by lazy {
    as_54213927()
  }


  public override val __54213927_Ptr: JNAPointer? by lazy {
    __54213927_Interface.__54213927_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__54213927_Interface)

  public constructor(tracker: StorageLibraryChangeTracker) : this(ABI.activate(tracker))

  private fun as_54213927(): IBackgroundTrigger.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTrigger.ABI.makeIBackgroundTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTrigger.ABI.makeIBackgroundTrigger(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StorageLibraryChangeTrackerTrigger> {
    public override fun getValue() = StorageLibraryChangeTrackerTrigger(pointer.getPointer(0))

    public fun setValue(value: StorageLibraryChangeTrackerTrigger): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorageLibraryChangeTrackerTrigger, MemoryAddress> {
    public val IStorageLibraryChangeTrackerTriggerFactory_Instance:
        IStorageLibraryChangeTrackerTriggerFactory by lazy {
      createIStorageLibraryChangeTrackerTriggerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIStorageLibraryChangeTrackerTriggerFactory():
        IStorageLibraryChangeTrackerTriggerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.StorageLibraryChangeTrackerTrigger".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IStorageLibraryChangeTrackerTriggerFactory.ABI.makeIStorageLibraryChangeTrackerTriggerFactory(factoryActivatorPtr.value))
    }

    public fun activate(tracker: StorageLibraryChangeTracker): JNAPointer? =
        IStorageLibraryChangeTrackerTriggerFactory_Instance.Create(tracker)?.pointer

    public override fun fromNative(segment: MemoryAddress): StorageLibraryChangeTrackerTrigger {
      val address = segment.toRawLongValue()
      return StorageLibraryChangeTrackerTrigger(Pointer(address))
    }

    public override fun toNative(obj: StorageLibraryChangeTrackerTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
