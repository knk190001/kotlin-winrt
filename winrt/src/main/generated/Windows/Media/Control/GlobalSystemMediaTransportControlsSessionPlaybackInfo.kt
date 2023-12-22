package Windows.Media.Control

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

@ABIMarker(GlobalSystemMediaTransportControlsSessionPlaybackInfo.ABI::class)
@Signature("rc(Windows.Media.Control.GlobalSystemMediaTransportControlsSessionPlaybackInfo;{94b4b6cf-e8ba-51ad-87a7-c10ade106127})")
@WinRTByReference(brClass =
    GlobalSystemMediaTransportControlsSessionPlaybackInfo.ByReference::class)
public class GlobalSystemMediaTransportControlsSessionPlaybackInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGlobalSystemMediaTransportControlsSessionPlaybackInfo.WithDefault,
    IWinRTObject {
  private val __1959012369_Interface:
      IGlobalSystemMediaTransportControlsSessionPlaybackInfo.WithDefault by lazy {
    as_1959012369()
  }


  public override val __1959012369_Ptr: JNAPointer? by lazy {
    __1959012369_Interface.__1959012369_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1959012369_Interface)

  private fun as_1959012369(): IGlobalSystemMediaTransportControlsSessionPlaybackInfo.WithDefault {
    if(pointer == NULL) {
      return(IGlobalSystemMediaTransportControlsSessionPlaybackInfo.ABI.makeIGlobalSystemMediaTransportControlsSessionPlaybackInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGlobalSystemMediaTransportControlsSessionPlaybackInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGlobalSystemMediaTransportControlsSessionPlaybackInfo.ABI.makeIGlobalSystemMediaTransportControlsSessionPlaybackInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GlobalSystemMediaTransportControlsSessionPlaybackInfo> {
    public override fun getValue() =
        GlobalSystemMediaTransportControlsSessionPlaybackInfo(pointer.getPointer(0))

    public fun setValue(value: GlobalSystemMediaTransportControlsSessionPlaybackInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GlobalSystemMediaTransportControlsSessionPlaybackInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        GlobalSystemMediaTransportControlsSessionPlaybackInfo {
      val address = segment.toRawLongValue()
      return GlobalSystemMediaTransportControlsSessionPlaybackInfo(Pointer(address))
    }

    public override fun toNative(obj: GlobalSystemMediaTransportControlsSessionPlaybackInfo):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
