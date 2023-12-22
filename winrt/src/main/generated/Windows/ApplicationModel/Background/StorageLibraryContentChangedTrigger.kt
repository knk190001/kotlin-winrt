package Windows.ApplicationModel.Background

import Windows.Foundation.Collections.IIterable
import Windows.Storage.StorageLibrary
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

@ABIMarker(StorageLibraryContentChangedTrigger.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.StorageLibraryContentChangedTrigger;{1637e0a7-829c-45bc-929b-a1e7ea78d89b})")
@WinRTByReference(brClass = StorageLibraryContentChangedTrigger.ByReference::class)
public class StorageLibraryContentChangedTrigger(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorageLibraryContentChangedTrigger.WithDefault,
    IBackgroundTrigger.WithDefault, IWinRTObject {
  private val __1110334412_Interface: IStorageLibraryContentChangedTrigger.WithDefault by lazy {
    as_1110334412()
  }


  private val __54213927_Interface: IBackgroundTrigger.WithDefault by lazy {
    as_54213927()
  }


  public override val __1110334412_Ptr: JNAPointer? by lazy {
    __1110334412_Interface.__1110334412_Ptr
  }


  public override val __54213927_Ptr: JNAPointer? by lazy {
    __54213927_Interface.__54213927_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1110334412_Interface, __54213927_Interface)

  private fun as_1110334412(): IStorageLibraryContentChangedTrigger.WithDefault {
    if(pointer == NULL) {
      return(IStorageLibraryContentChangedTrigger.ABI.makeIStorageLibraryContentChangedTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageLibraryContentChangedTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageLibraryContentChangedTrigger.ABI.makeIStorageLibraryContentChangedTrigger(ref.value))
  }

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
      IByReference<StorageLibraryContentChangedTrigger> {
    public override fun getValue() = StorageLibraryContentChangedTrigger(pointer.getPointer(0))

    public fun setValue(value: StorageLibraryContentChangedTrigger): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorageLibraryContentChangedTrigger, MemoryAddress> {
    public val IStorageLibraryContentChangedTriggerStatics_Instance:
        IStorageLibraryContentChangedTriggerStatics by lazy {
      createIStorageLibraryContentChangedTriggerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIStorageLibraryContentChangedTriggerStatics():
        IStorageLibraryContentChangedTriggerStatics {
      val refiid = Guid.REFIID(IStorageLibraryContentChangedTriggerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.StorageLibraryContentChangedTrigger".toHandle(),refiid,interfacePtr)
      val result =
          IStorageLibraryContentChangedTriggerStatics.ABI.makeIStorageLibraryContentChangedTriggerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): StorageLibraryContentChangedTrigger {
      val address = segment.toRawLongValue()
      return StorageLibraryContentChangedTrigger(Pointer(address))
    }

    public override fun toNative(obj: StorageLibraryContentChangedTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create(storageLibrary: StorageLibrary) =
        ABI.IStorageLibraryContentChangedTriggerStatics_Instance.Create(storageLibrary)

    public fun CreateFromLibraries(storageLibraries: IIterable<StorageLibrary?>) =
        ABI.IStorageLibraryContentChangedTriggerStatics_Instance.CreateFromLibraries(storageLibraries)
  }
}
