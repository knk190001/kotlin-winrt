package Windows.Media.Capture

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

@ABIMarker(AppBroadcastState.ABI::class)
@Signature("rc(Windows.Media.Capture.AppBroadcastState;{ee08056d-8099-4ddd-922e-c56dac58abfb})")
@WinRTByReference(brClass = AppBroadcastState.ByReference::class)
public class AppBroadcastState(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppBroadcastState.WithDefault, IWinRTObject {
  private val __1890878471_Interface: IAppBroadcastState.WithDefault by lazy {
    as_1890878471()
  }


  public override val __1890878471_Ptr: JNAPointer? by lazy {
    __1890878471_Interface.__1890878471_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1890878471_Interface)

  private fun as_1890878471(): IAppBroadcastState.WithDefault {
    if(pointer == NULL) {
      return(IAppBroadcastState.ABI.makeIAppBroadcastState(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBroadcastState>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBroadcastState.ABI.makeIAppBroadcastState(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBroadcastState> {
    public override fun getValue() = AppBroadcastState(pointer.getPointer(0))

    public fun setValue(value: AppBroadcastState): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBroadcastState, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppBroadcastState {
      val address = segment.toRawLongValue()
      return AppBroadcastState(Pointer(address))
    }

    public override fun toNative(obj: AppBroadcastState): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
