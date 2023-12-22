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

@ABIMarker(AppCaptureState.ABI::class)
@Signature("rc(Windows.Media.Capture.AppCaptureState;{73134372-d4eb-44ce-9538-465f506ac4ea})")
@WinRTByReference(brClass = AppCaptureState.ByReference::class)
public class AppCaptureState(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppCaptureState.WithDefault, IWinRTObject {
  private val __2134556372_Interface: IAppCaptureState.WithDefault by lazy {
    as_2134556372()
  }


  public override val __2134556372_Ptr: JNAPointer? by lazy {
    __2134556372_Interface.__2134556372_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2134556372_Interface)

  private fun as_2134556372(): IAppCaptureState.WithDefault {
    if(pointer == NULL) {
      return(IAppCaptureState.ABI.makeIAppCaptureState(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppCaptureState>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppCaptureState.ABI.makeIAppCaptureState(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppCaptureState> {
    public override fun getValue() = AppCaptureState(pointer.getPointer(0))

    public fun setValue(value: AppCaptureState): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppCaptureState, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppCaptureState {
      val address = segment.toRawLongValue()
      return AppCaptureState(Pointer(address))
    }

    public override fun toNative(obj: AppCaptureState): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
