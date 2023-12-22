package Windows.Media.Devices

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

@ABIMarker(VideoTemporalDenoisingControl.ABI::class)
@Signature("rc(Windows.Media.Devices.VideoTemporalDenoisingControl;{7ab34735-3e2a-4a32-baff-4358c4fbdd57})")
@WinRTByReference(brClass = VideoTemporalDenoisingControl.ByReference::class)
public class VideoTemporalDenoisingControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVideoTemporalDenoisingControl.WithDefault, IWinRTObject {
  private val __1588804643_Interface: IVideoTemporalDenoisingControl.WithDefault by lazy {
    as_1588804643()
  }


  public override val __1588804643_Ptr: JNAPointer? by lazy {
    __1588804643_Interface.__1588804643_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1588804643_Interface)

  private fun as_1588804643(): IVideoTemporalDenoisingControl.WithDefault {
    if(pointer == NULL) {
      return(IVideoTemporalDenoisingControl.ABI.makeIVideoTemporalDenoisingControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVideoTemporalDenoisingControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVideoTemporalDenoisingControl.ABI.makeIVideoTemporalDenoisingControl(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VideoTemporalDenoisingControl> {
    public override fun getValue() = VideoTemporalDenoisingControl(pointer.getPointer(0))

    public fun setValue(value: VideoTemporalDenoisingControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VideoTemporalDenoisingControl, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VideoTemporalDenoisingControl {
      val address = segment.toRawLongValue()
      return VideoTemporalDenoisingControl(Pointer(address))
    }

    public override fun toNative(obj: VideoTemporalDenoisingControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
