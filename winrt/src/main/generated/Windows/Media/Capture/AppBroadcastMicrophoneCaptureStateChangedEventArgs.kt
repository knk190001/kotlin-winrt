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

@ABIMarker(AppBroadcastMicrophoneCaptureStateChangedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Capture.AppBroadcastMicrophoneCaptureStateChangedEventArgs;{a86ad5e9-9440-4908-9d09-65b7e315d795})")
@WinRTByReference(brClass = AppBroadcastMicrophoneCaptureStateChangedEventArgs.ByReference::class)
public class AppBroadcastMicrophoneCaptureStateChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppBroadcastMicrophoneCaptureStateChangedEventArgs.WithDefault, IWinRTObject
    {
  private val __677537488_Interface: IAppBroadcastMicrophoneCaptureStateChangedEventArgs.WithDefault
      by lazy {
    as_677537488()
  }


  public override val __677537488_Ptr: JNAPointer? by lazy {
    __677537488_Interface.__677537488_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__677537488_Interface)

  private fun as_677537488(): IAppBroadcastMicrophoneCaptureStateChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppBroadcastMicrophoneCaptureStateChangedEventArgs.ABI.makeIAppBroadcastMicrophoneCaptureStateChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBroadcastMicrophoneCaptureStateChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBroadcastMicrophoneCaptureStateChangedEventArgs.ABI.makeIAppBroadcastMicrophoneCaptureStateChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBroadcastMicrophoneCaptureStateChangedEventArgs> {
    public override fun getValue() =
        AppBroadcastMicrophoneCaptureStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AppBroadcastMicrophoneCaptureStateChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBroadcastMicrophoneCaptureStateChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AppBroadcastMicrophoneCaptureStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return AppBroadcastMicrophoneCaptureStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AppBroadcastMicrophoneCaptureStateChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
