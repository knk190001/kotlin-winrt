package Windows.Services.Store

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

@ABIMarker(StoreQueueItemStatus.ABI::class)
@Signature("rc(Windows.Services.Store.StoreQueueItemStatus;{9bd6796f-9cc3-4ec3-b2ef-7be433b30174})")
@WinRTByReference(brClass = StoreQueueItemStatus.ByReference::class)
public class StoreQueueItemStatus(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStoreQueueItemStatus.WithDefault, IWinRTObject {
  private val __1102538466_Interface: IStoreQueueItemStatus.WithDefault by lazy {
    as_1102538466()
  }


  public override val __1102538466_Ptr: JNAPointer? by lazy {
    __1102538466_Interface.__1102538466_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1102538466_Interface)

  private fun as_1102538466(): IStoreQueueItemStatus.WithDefault {
    if(pointer == NULL) {
      return(IStoreQueueItemStatus.ABI.makeIStoreQueueItemStatus(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStoreQueueItemStatus>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStoreQueueItemStatus.ABI.makeIStoreQueueItemStatus(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StoreQueueItemStatus> {
    public override fun getValue() = StoreQueueItemStatus(pointer.getPointer(0))

    public fun setValue(value: StoreQueueItemStatus): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StoreQueueItemStatus, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StoreQueueItemStatus {
      val address = segment.toRawLongValue()
      return StoreQueueItemStatus(Pointer(address))
    }

    public override fun toNative(obj: StoreQueueItemStatus): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
