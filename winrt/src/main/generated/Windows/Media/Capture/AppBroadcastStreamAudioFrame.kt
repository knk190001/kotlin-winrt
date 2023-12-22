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

@ABIMarker(AppBroadcastStreamAudioFrame.ABI::class)
@Signature("rc(Windows.Media.Capture.AppBroadcastStreamAudioFrame;{efab4ac8-21ba-453f-8bb7-5e938a2e9a74})")
@WinRTByReference(brClass = AppBroadcastStreamAudioFrame.ByReference::class)
public class AppBroadcastStreamAudioFrame(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppBroadcastStreamAudioFrame.WithDefault, IWinRTObject {
  private val __2021914223_Interface: IAppBroadcastStreamAudioFrame.WithDefault by lazy {
    as_2021914223()
  }


  public override val __2021914223_Ptr: JNAPointer? by lazy {
    __2021914223_Interface.__2021914223_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2021914223_Interface)

  private fun as_2021914223(): IAppBroadcastStreamAudioFrame.WithDefault {
    if(pointer == NULL) {
      return(IAppBroadcastStreamAudioFrame.ABI.makeIAppBroadcastStreamAudioFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBroadcastStreamAudioFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBroadcastStreamAudioFrame.ABI.makeIAppBroadcastStreamAudioFrame(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBroadcastStreamAudioFrame> {
    public override fun getValue() = AppBroadcastStreamAudioFrame(pointer.getPointer(0))

    public fun setValue(value: AppBroadcastStreamAudioFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBroadcastStreamAudioFrame, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppBroadcastStreamAudioFrame {
      val address = segment.toRawLongValue()
      return AppBroadcastStreamAudioFrame(Pointer(address))
    }

    public override fun toNative(obj: AppBroadcastStreamAudioFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
