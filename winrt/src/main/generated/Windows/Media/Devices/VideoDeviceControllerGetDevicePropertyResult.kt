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

@ABIMarker(VideoDeviceControllerGetDevicePropertyResult.ABI::class)
@Signature("rc(Windows.Media.Devices.VideoDeviceControllerGetDevicePropertyResult;{c5d88395-6ed5-4790-8b5d-0ef13935d0f8})")
@WinRTByReference(brClass = VideoDeviceControllerGetDevicePropertyResult.ByReference::class)
public class VideoDeviceControllerGetDevicePropertyResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVideoDeviceControllerGetDevicePropertyResult.WithDefault, IWinRTObject {
  private val __1439703666_Interface: IVideoDeviceControllerGetDevicePropertyResult.WithDefault by
      lazy {
    as_1439703666()
  }


  public override val __1439703666_Ptr: JNAPointer? by lazy {
    __1439703666_Interface.__1439703666_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1439703666_Interface)

  private fun as_1439703666(): IVideoDeviceControllerGetDevicePropertyResult.WithDefault {
    if(pointer == NULL) {
      return(IVideoDeviceControllerGetDevicePropertyResult.ABI.makeIVideoDeviceControllerGetDevicePropertyResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVideoDeviceControllerGetDevicePropertyResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVideoDeviceControllerGetDevicePropertyResult.ABI.makeIVideoDeviceControllerGetDevicePropertyResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VideoDeviceControllerGetDevicePropertyResult> {
    public override fun getValue() =
        VideoDeviceControllerGetDevicePropertyResult(pointer.getPointer(0))

    public fun setValue(value: VideoDeviceControllerGetDevicePropertyResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VideoDeviceControllerGetDevicePropertyResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        VideoDeviceControllerGetDevicePropertyResult {
      val address = segment.toRawLongValue()
      return VideoDeviceControllerGetDevicePropertyResult(Pointer(address))
    }

    public override fun toNative(obj: VideoDeviceControllerGetDevicePropertyResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
