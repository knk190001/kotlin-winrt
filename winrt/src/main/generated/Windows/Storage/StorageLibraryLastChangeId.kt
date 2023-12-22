package Windows.Storage

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

@ABIMarker(StorageLibraryLastChangeId.ABI::class)
@Signature("rc(Windows.Storage.StorageLibraryLastChangeId;{5281826a-bbe1-53bc-82ca-81cc7f039329})")
@WinRTByReference(brClass = StorageLibraryLastChangeId.ByReference::class)
public class StorageLibraryLastChangeId(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorageLibraryLastChangeId.WithDefault, IWinRTObject {
  private val __794107610_Interface: IStorageLibraryLastChangeId.WithDefault by lazy {
    as_794107610()
  }


  public override val __794107610_Ptr: JNAPointer? by lazy {
    __794107610_Interface.__794107610_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__794107610_Interface)

  private fun as_794107610(): IStorageLibraryLastChangeId.WithDefault {
    if(pointer == NULL) {
      return(IStorageLibraryLastChangeId.ABI.makeIStorageLibraryLastChangeId(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageLibraryLastChangeId>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageLibraryLastChangeId.ABI.makeIStorageLibraryLastChangeId(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StorageLibraryLastChangeId> {
    public override fun getValue() = StorageLibraryLastChangeId(pointer.getPointer(0))

    public fun setValue(value: StorageLibraryLastChangeId): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorageLibraryLastChangeId, MemoryAddress> {
    public val IStorageLibraryLastChangeIdStatics_Instance: IStorageLibraryLastChangeIdStatics by
        lazy {
      createIStorageLibraryLastChangeIdStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIStorageLibraryLastChangeIdStatics(): IStorageLibraryLastChangeIdStatics {
      val refiid = Guid.REFIID(IStorageLibraryLastChangeIdStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.StorageLibraryLastChangeId".toHandle(),refiid,interfacePtr)
      val result =
          IStorageLibraryLastChangeIdStatics.ABI.makeIStorageLibraryLastChangeIdStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): StorageLibraryLastChangeId {
      val address = segment.toRawLongValue()
      return StorageLibraryLastChangeId(Pointer(address))
    }

    public override fun toNative(obj: StorageLibraryLastChangeId): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Unknown() = ABI.IStorageLibraryLastChangeIdStatics_Instance.get_Unknown()
  }
}
