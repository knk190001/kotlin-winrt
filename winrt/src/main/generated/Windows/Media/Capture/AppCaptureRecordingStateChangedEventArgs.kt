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

@ABIMarker(AppCaptureRecordingStateChangedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Capture.AppCaptureRecordingStateChangedEventArgs;{24fc8712-e305-490d-b415-6b1c9049736b})")
@WinRTByReference(brClass = AppCaptureRecordingStateChangedEventArgs.ByReference::class)
public class AppCaptureRecordingStateChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppCaptureRecordingStateChangedEventArgs.WithDefault, IWinRTObject {
  private val __1359424864_Interface: IAppCaptureRecordingStateChangedEventArgs.WithDefault by
      lazy {
    as_1359424864()
  }


  public override val __1359424864_Ptr: JNAPointer? by lazy {
    __1359424864_Interface.__1359424864_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1359424864_Interface)

  private fun as_1359424864(): IAppCaptureRecordingStateChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppCaptureRecordingStateChangedEventArgs.ABI.makeIAppCaptureRecordingStateChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppCaptureRecordingStateChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppCaptureRecordingStateChangedEventArgs.ABI.makeIAppCaptureRecordingStateChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppCaptureRecordingStateChangedEventArgs> {
    public override fun getValue() = AppCaptureRecordingStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AppCaptureRecordingStateChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppCaptureRecordingStateChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AppCaptureRecordingStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return AppCaptureRecordingStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AppCaptureRecordingStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
