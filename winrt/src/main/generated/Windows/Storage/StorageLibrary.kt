package Windows.Storage

import Windows.System.User
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(StorageLibrary.ABI::class)
@Signature("rc(Windows.Storage.StorageLibrary;{1edd7103-0e5e-4d6c-b5e8-9318983d6a03})")
@WinRTByReference(brClass = StorageLibrary.ByReference::class)
public class StorageLibrary(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorageLibrary.WithDefault, IStorageLibrary2.WithDefault,
    IStorageLibrary3.WithDefault, IWinRTObject {
  private val __1260844697_Interface: IStorageLibrary.WithDefault by lazy {
    as_1260844697()
  }


  private val __431479993_Interface: IStorageLibrary2.WithDefault by lazy {
    as_431479993()
  }


  private val __431479994_Interface: IStorageLibrary3.WithDefault by lazy {
    as_431479994()
  }


  public override val __1260844697_Ptr: JNAPointer? by lazy {
    __1260844697_Interface.__1260844697_Ptr
  }


  public override val __431479993_Ptr: JNAPointer? by lazy {
    __431479993_Interface.__431479993_Ptr
  }


  public override val __431479994_Ptr: JNAPointer? by lazy {
    __431479994_Interface.__431479994_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1260844697_Interface, __431479993_Interface, __431479994_Interface)

  private fun as_1260844697(): IStorageLibrary.WithDefault {
    if(pointer == NULL) {
      return(IStorageLibrary.ABI.makeIStorageLibrary(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageLibrary>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageLibrary.ABI.makeIStorageLibrary(ref.value))
  }

  private fun as_431479993(): IStorageLibrary2.WithDefault {
    if(pointer == NULL) {
      return(IStorageLibrary2.ABI.makeIStorageLibrary2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageLibrary2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageLibrary2.ABI.makeIStorageLibrary2(ref.value))
  }

  private fun as_431479994(): IStorageLibrary3.WithDefault {
    if(pointer == NULL) {
      return(IStorageLibrary3.ABI.makeIStorageLibrary3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageLibrary3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageLibrary3.ABI.makeIStorageLibrary3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<StorageLibrary>
      {
    public override fun getValue() = StorageLibrary(pointer.getPointer(0))

    public fun setValue(value: StorageLibrary): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorageLibrary, MemoryAddress> {
    public val IStorageLibraryStatics_Instance: IStorageLibraryStatics by lazy {
      createIStorageLibraryStatics()
    }


    public val IStorageLibraryStatics2_Instance: IStorageLibraryStatics2 by lazy {
      createIStorageLibraryStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIStorageLibraryStatics(): IStorageLibraryStatics {
      val refiid = Guid.REFIID(IStorageLibraryStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.StorageLibrary".toHandle(),refiid,interfacePtr)
      val result = IStorageLibraryStatics.ABI.makeIStorageLibraryStatics(interfacePtr.value)
      return result
    }

    public fun createIStorageLibraryStatics2(): IStorageLibraryStatics2 {
      val refiid = Guid.REFIID(IStorageLibraryStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.StorageLibrary".toHandle(),refiid,interfacePtr)
      val result = IStorageLibraryStatics2.ABI.makeIStorageLibraryStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): StorageLibrary {
      val address = segment.toRawLongValue()
      return StorageLibrary(Pointer(address))
    }

    public override fun toNative(obj: StorageLibrary): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetLibraryAsync(libraryId: KnownLibraryId) =
        ABI.IStorageLibraryStatics_Instance.GetLibraryAsync(libraryId)

    public fun GetLibraryForUserAsync(user: User, libraryId: KnownLibraryId) =
        ABI.IStorageLibraryStatics2_Instance.GetLibraryForUserAsync(user, libraryId)
  }
}
