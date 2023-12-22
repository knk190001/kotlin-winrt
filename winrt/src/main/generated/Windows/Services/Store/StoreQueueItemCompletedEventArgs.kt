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

@ABIMarker(StoreQueueItemCompletedEventArgs.ABI::class)
@Signature("rc(Windows.Services.Store.StoreQueueItemCompletedEventArgs;{1247df6c-b44a-439b-bb07-1d3003d005c2})")
@WinRTByReference(brClass = StoreQueueItemCompletedEventArgs.ByReference::class)
public class StoreQueueItemCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStoreQueueItemCompletedEventArgs.WithDefault, IWinRTObject {
  private val __1624270980_Interface: IStoreQueueItemCompletedEventArgs.WithDefault by lazy {
    as_1624270980()
  }


  public override val __1624270980_Ptr: JNAPointer? by lazy {
    __1624270980_Interface.__1624270980_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1624270980_Interface)

  private fun as_1624270980(): IStoreQueueItemCompletedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IStoreQueueItemCompletedEventArgs.ABI.makeIStoreQueueItemCompletedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStoreQueueItemCompletedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStoreQueueItemCompletedEventArgs.ABI.makeIStoreQueueItemCompletedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StoreQueueItemCompletedEventArgs> {
    public override fun getValue() = StoreQueueItemCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: StoreQueueItemCompletedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StoreQueueItemCompletedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StoreQueueItemCompletedEventArgs {
      val address = segment.toRawLongValue()
      return StoreQueueItemCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: StoreQueueItemCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
