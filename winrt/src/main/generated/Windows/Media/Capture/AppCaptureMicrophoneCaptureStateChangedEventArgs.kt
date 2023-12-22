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

@ABIMarker(AppCaptureMicrophoneCaptureStateChangedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Capture.AppCaptureMicrophoneCaptureStateChangedEventArgs;{324d249e-45bc-4c35-bc35-e469fc7a69e0})")
@WinRTByReference(brClass = AppCaptureMicrophoneCaptureStateChangedEventArgs.ByReference::class)
public class AppCaptureMicrophoneCaptureStateChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppCaptureMicrophoneCaptureStateChangedEventArgs.WithDefault, IWinRTObject {
  private val __1548443061_Interface: IAppCaptureMicrophoneCaptureStateChangedEventArgs.WithDefault
      by lazy {
    as_1548443061()
  }


  public override val __1548443061_Ptr: JNAPointer? by lazy {
    __1548443061_Interface.__1548443061_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1548443061_Interface)

  private fun as_1548443061(): IAppCaptureMicrophoneCaptureStateChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppCaptureMicrophoneCaptureStateChangedEventArgs.ABI.makeIAppCaptureMicrophoneCaptureStateChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppCaptureMicrophoneCaptureStateChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppCaptureMicrophoneCaptureStateChangedEventArgs.ABI.makeIAppCaptureMicrophoneCaptureStateChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppCaptureMicrophoneCaptureStateChangedEventArgs> {
    public override fun getValue() =
        AppCaptureMicrophoneCaptureStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AppCaptureMicrophoneCaptureStateChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppCaptureMicrophoneCaptureStateChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AppCaptureMicrophoneCaptureStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return AppCaptureMicrophoneCaptureStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AppCaptureMicrophoneCaptureStateChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
