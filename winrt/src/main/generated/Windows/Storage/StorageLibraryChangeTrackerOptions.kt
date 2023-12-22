package Windows.Storage

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(StorageLibraryChangeTrackerOptions.ABI::class)
@Signature("rc(Windows.Storage.StorageLibraryChangeTrackerOptions;{bb52bcd4-1a6d-59c0-ad2a-823a20532483})")
@WinRTByReference(brClass = StorageLibraryChangeTrackerOptions.ByReference::class)
public class StorageLibraryChangeTrackerOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorageLibraryChangeTrackerOptions.WithDefault, IWinRTObject {
  private val __204064847_Interface: IStorageLibraryChangeTrackerOptions.WithDefault by lazy {
    as_204064847()
  }


  public override val __204064847_Ptr: JNAPointer? by lazy {
    __204064847_Interface.__204064847_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__204064847_Interface)

  public constructor() : this(ABI.activate())

  private fun as_204064847(): IStorageLibraryChangeTrackerOptions.WithDefault {
    if(pointer == NULL) {
      return(IStorageLibraryChangeTrackerOptions.ABI.makeIStorageLibraryChangeTrackerOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageLibraryChangeTrackerOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageLibraryChangeTrackerOptions.ABI.makeIStorageLibraryChangeTrackerOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StorageLibraryChangeTrackerOptions> {
    public override fun getValue() = StorageLibraryChangeTrackerOptions(pointer.getPointer(0))

    public fun setValue(value: StorageLibraryChangeTrackerOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorageLibraryChangeTrackerOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.StorageLibraryChangeTrackerOptions".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): StorageLibraryChangeTrackerOptions {
      val address = segment.toRawLongValue()
      return StorageLibraryChangeTrackerOptions(Pointer(address))
    }

    public override fun toNative(obj: StorageLibraryChangeTrackerOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
