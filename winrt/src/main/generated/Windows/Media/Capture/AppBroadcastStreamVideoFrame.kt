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

@ABIMarker(AppBroadcastStreamVideoFrame.ABI::class)
@Signature("rc(Windows.Media.Capture.AppBroadcastStreamVideoFrame;{0f97cf2b-c9e4-4e88-8194-d814cbd585d8})")
@WinRTByReference(brClass = AppBroadcastStreamVideoFrame.ByReference::class)
public class AppBroadcastStreamVideoFrame(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppBroadcastStreamVideoFrame.WithDefault, IWinRTObject {
  private val __1145299734_Interface: IAppBroadcastStreamVideoFrame.WithDefault by lazy {
    as_1145299734()
  }


  public override val __1145299734_Ptr: JNAPointer? by lazy {
    __1145299734_Interface.__1145299734_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1145299734_Interface)

  private fun as_1145299734(): IAppBroadcastStreamVideoFrame.WithDefault {
    if(pointer == NULL) {
      return(IAppBroadcastStreamVideoFrame.ABI.makeIAppBroadcastStreamVideoFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBroadcastStreamVideoFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBroadcastStreamVideoFrame.ABI.makeIAppBroadcastStreamVideoFrame(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBroadcastStreamVideoFrame> {
    public override fun getValue() = AppBroadcastStreamVideoFrame(pointer.getPointer(0))

    public fun setValue(value: AppBroadcastStreamVideoFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBroadcastStreamVideoFrame, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppBroadcastStreamVideoFrame {
      val address = segment.toRawLongValue()
      return AppBroadcastStreamVideoFrame(Pointer(address))
    }

    public override fun toNative(obj: AppBroadcastStreamVideoFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
