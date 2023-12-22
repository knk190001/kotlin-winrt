package Windows.Media.Core

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

@ABIMarker(VideoTrackSupportInfo.ABI::class)
@Signature("rc(Windows.Media.Core.VideoTrackSupportInfo;{4bb534a0-fc5f-450d-8ff0-778d590486de})")
@WinRTByReference(brClass = VideoTrackSupportInfo.ByReference::class)
public class VideoTrackSupportInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVideoTrackSupportInfo.WithDefault, IWinRTObject {
  private val __1837328968_Interface: IVideoTrackSupportInfo.WithDefault by lazy {
    as_1837328968()
  }


  public override val __1837328968_Ptr: JNAPointer? by lazy {
    __1837328968_Interface.__1837328968_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1837328968_Interface)

  private fun as_1837328968(): IVideoTrackSupportInfo.WithDefault {
    if(pointer == NULL) {
      return(IVideoTrackSupportInfo.ABI.makeIVideoTrackSupportInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVideoTrackSupportInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVideoTrackSupportInfo.ABI.makeIVideoTrackSupportInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VideoTrackSupportInfo> {
    public override fun getValue() = VideoTrackSupportInfo(pointer.getPointer(0))

    public fun setValue(value: VideoTrackSupportInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VideoTrackSupportInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VideoTrackSupportInfo {
      val address = segment.toRawLongValue()
      return VideoTrackSupportInfo(Pointer(address))
    }

    public override fun toNative(obj: VideoTrackSupportInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
