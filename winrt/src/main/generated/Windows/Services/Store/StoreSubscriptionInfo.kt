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

@ABIMarker(StoreSubscriptionInfo.ABI::class)
@Signature("rc(Windows.Services.Store.StoreSubscriptionInfo;{4189776a-0559-43ac-a9c6-3ab0011fb8eb})")
@WinRTByReference(brClass = StoreSubscriptionInfo.ByReference::class)
public class StoreSubscriptionInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStoreSubscriptionInfo.WithDefault, IWinRTObject {
  private val __969713375_Interface: IStoreSubscriptionInfo.WithDefault by lazy {
    as_969713375()
  }


  public override val __969713375_Ptr: JNAPointer? by lazy {
    __969713375_Interface.__969713375_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__969713375_Interface)

  private fun as_969713375(): IStoreSubscriptionInfo.WithDefault {
    if(pointer == NULL) {
      return(IStoreSubscriptionInfo.ABI.makeIStoreSubscriptionInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStoreSubscriptionInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStoreSubscriptionInfo.ABI.makeIStoreSubscriptionInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StoreSubscriptionInfo> {
    public override fun getValue() = StoreSubscriptionInfo(pointer.getPointer(0))

    public fun setValue(value: StoreSubscriptionInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StoreSubscriptionInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StoreSubscriptionInfo {
      val address = segment.toRawLongValue()
      return StoreSubscriptionInfo(Pointer(address))
    }

    public override fun toNative(obj: StoreSubscriptionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
