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

@ABIMarker(StorageFileQueryResult.ABI::class)
@Signature("rc(Windows.Storage.Search.StorageFileQueryResult;{52fda447-2baa-412c-b29f-d4b1778efa1e})")
@WinRTByReference(brClass = StorageFileQueryResult.ByReference::class)
public class StorageFileQueryResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorageFileQueryResult.WithDefault, IStorageQueryResultBase.WithDefault,
    IStorageFileQueryResult2.WithDefault, IWinRTObject {
  private val __1369899727_Interface: IStorageFileQueryResult.WithDefault by lazy {
    as_1369899727()
  }


  private val __1632583490_Interface: IStorageQueryResultBase.WithDefault by lazy {
    as_1632583490()
  }


  private val __482781473_Interface: IStorageFileQueryResult2.WithDefault by lazy {
    as_482781473()
  }


  public override val __1369899727_Ptr: JNAPointer? by lazy {
    __1369899727_Interface.__1369899727_Ptr
  }


  public override val __1632583490_Ptr: JNAPointer? by lazy {
    __1632583490_Interface.__1632583490_Ptr
  }


  public override val __482781473_Ptr: JNAPointer? by lazy {
    __482781473_Interface.__482781473_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1369899727_Interface, __1632583490_Interface, __482781473_Interface)

  private fun as_1369899727(): IStorageFileQueryResult.WithDefault {
    if(pointer == NULL) {
      return(IStorageFileQueryResult.ABI.makeIStorageFileQueryResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageFileQueryResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageFileQueryResult.ABI.makeIStorageFileQueryResult(ref.value))
  }

  private fun as_1632583490(): IStorageQueryResultBase.WithDefault {
    if(pointer == NULL) {
      return(IStorageQueryResultBase.ABI.makeIStorageQueryResultBase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageQueryResultBase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageQueryResultBase.ABI.makeIStorageQueryResultBase(ref.value))
  }

  private fun as_482781473(): IStorageFileQueryResult2.WithDefault {
    if(pointer == NULL) {
      return(IStorageFileQueryResult2.ABI.makeIStorageFileQueryResult2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageFileQueryResult2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageFileQueryResult2.ABI.makeIStorageFileQueryResult2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StorageFileQueryResult> {
    public override fun getValue() = StorageFileQueryResult(pointer.getPointer(0))

    public fun setValue(value: StorageFileQueryResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorageFileQueryResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StorageFileQueryResult {
      val address = segment.toRawLongValue()
      return StorageFileQueryResult(Pointer(address))
    }

    public override fun toNative(obj: StorageFileQueryResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
