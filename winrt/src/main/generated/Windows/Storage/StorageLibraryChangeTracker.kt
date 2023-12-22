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

@ABIMarker(StorageLibraryChangeTracker.ABI::class)
@Signature("rc(Windows.Storage.StorageLibraryChangeTracker;{9e157316-6073-44f6-9681-7492d1286c90})")
@WinRTByReference(brClass = StorageLibraryChangeTracker.ByReference::class)
public class StorageLibraryChangeTracker(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorageLibraryChangeTracker.WithDefault,
    IStorageLibraryChangeTracker2.WithDefault, IWinRTObject {
  private val __1435193167_Interface: IStorageLibraryChangeTracker.WithDefault by lazy {
    as_1435193167()
  }


  private val __1541315267_Interface: IStorageLibraryChangeTracker2.WithDefault by lazy {
    as_1541315267()
  }


  public override val __1435193167_Ptr: JNAPointer? by lazy {
    __1435193167_Interface.__1435193167_Ptr
  }


  public override val __1541315267_Ptr: JNAPointer? by lazy {
    __1541315267_Interface.__1541315267_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1435193167_Interface, __1541315267_Interface)

  private fun as_1435193167(): IStorageLibraryChangeTracker.WithDefault {
    if(pointer == NULL) {
      return(IStorageLibraryChangeTracker.ABI.makeIStorageLibraryChangeTracker(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageLibraryChangeTracker>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageLibraryChangeTracker.ABI.makeIStorageLibraryChangeTracker(ref.value))
  }

  private fun as_1541315267(): IStorageLibraryChangeTracker2.WithDefault {
    if(pointer == NULL) {
      return(IStorageLibraryChangeTracker2.ABI.makeIStorageLibraryChangeTracker2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageLibraryChangeTracker2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageLibraryChangeTracker2.ABI.makeIStorageLibraryChangeTracker2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StorageLibraryChangeTracker> {
    public override fun getValue() = StorageLibraryChangeTracker(pointer.getPointer(0))

    public fun setValue(value: StorageLibraryChangeTracker): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorageLibraryChangeTracker, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StorageLibraryChangeTracker {
      val address = segment.toRawLongValue()
      return StorageLibraryChangeTracker(Pointer(address))
    }

    public override fun toNative(obj: StorageLibraryChangeTracker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
