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

@ABIMarker(StorageItemQueryResult.ABI::class)
@Signature("rc(Windows.Storage.Search.StorageItemQueryResult;{e8948079-9d58-47b8-b2b2-41b07f4795f9})")
@WinRTByReference(brClass = StorageItemQueryResult.ByReference::class)
public class StorageItemQueryResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorageItemQueryResult.WithDefault, IStorageQueryResultBase.WithDefault,
    IWinRTObject {
  private val __678093626_Interface: IStorageItemQueryResult.WithDefault by lazy {
    as_678093626()
  }


  private val __1632583490_Interface: IStorageQueryResultBase.WithDefault by lazy {
    as_1632583490()
  }


  public override val __678093626_Ptr: JNAPointer? by lazy {
    __678093626_Interface.__678093626_Ptr
  }


  public override val __1632583490_Ptr: JNAPointer? by lazy {
    __1632583490_Interface.__1632583490_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__678093626_Interface, __1632583490_Interface)

  private fun as_678093626(): IStorageItemQueryResult.WithDefault {
    if(pointer == NULL) {
      return(IStorageItemQueryResult.ABI.makeIStorageItemQueryResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageItemQueryResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageItemQueryResult.ABI.makeIStorageItemQueryResult(ref.value))
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
      IByReference<StorageItemQueryResult> {
    public override fun getValue() = StorageItemQueryResult(pointer.getPointer(0))

    public fun setValue(value: StorageItemQueryResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorageItemQueryResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StorageItemQueryResult {
      val address = segment.toRawLongValue()
      return StorageItemQueryResult(Pointer(address))
    }

    public override fun toNative(obj: StorageItemQueryResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
