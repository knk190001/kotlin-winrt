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

@ABIMarker(StorageFolderQueryResult.ABI::class)
@Signature("rc(Windows.Storage.Search.StorageFolderQueryResult;{6654c911-7d66-46fa-aecf-e4a4baa93ab8})")
@WinRTByReference(brClass = StorageFolderQueryResult.ByReference::class)
public class StorageFolderQueryResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorageFolderQueryResult.WithDefault, IStorageQueryResultBase.WithDefault,
    IWinRTObject {
  private val __111331073_Interface: IStorageFolderQueryResult.WithDefault by lazy {
    as_111331073()
  }


  private val __1632583490_Interface: IStorageQueryResultBase.WithDefault by lazy {
    as_1632583490()
  }


  public override val __111331073_Ptr: JNAPointer? by lazy {
    __111331073_Interface.__111331073_Ptr
  }


  public override val __1632583490_Ptr: JNAPointer? by lazy {
    __1632583490_Interface.__1632583490_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__111331073_Interface, __1632583490_Interface)

  private fun as_111331073(): IStorageFolderQueryResult.WithDefault {
    if(pointer == NULL) {
      return(IStorageFolderQueryResult.ABI.makeIStorageFolderQueryResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageFolderQueryResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageFolderQueryResult.ABI.makeIStorageFolderQueryResult(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StorageFolderQueryResult> {
    public override fun getValue() = StorageFolderQueryResult(pointer.getPointer(0))

    public fun setValue(value: StorageFolderQueryResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorageFolderQueryResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StorageFolderQueryResult {
      val address = segment.toRawLongValue()
      return StorageFolderQueryResult(Pointer(address))
    }

    public override fun toNative(obj: StorageFolderQueryResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
