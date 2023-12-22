package Windows.Media.Capture.Frames

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

@ABIMarker(VideoMediaFrameFormat.ABI::class)
@Signature("rc(Windows.Media.Capture.Frames.VideoMediaFrameFormat;{46027fc0-d71b-45c7-8f14-6d9a0ae604e4})")
@WinRTByReference(brClass = VideoMediaFrameFormat.ByReference::class)
public class VideoMediaFrameFormat(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVideoMediaFrameFormat.WithDefault, IWinRTObject {
  private val __812044939_Interface: IVideoMediaFrameFormat.WithDefault by lazy {
    as_812044939()
  }


  public override val __812044939_Ptr: JNAPointer? by lazy {
    __812044939_Interface.__812044939_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__812044939_Interface)

  private fun as_812044939(): IVideoMediaFrameFormat.WithDefault {
    if(pointer == NULL) {
      return(IVideoMediaFrameFormat.ABI.makeIVideoMediaFrameFormat(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVideoMediaFrameFormat>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVideoMediaFrameFormat.ABI.makeIVideoMediaFrameFormat(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VideoMediaFrameFormat> {
    public override fun getValue() = VideoMediaFrameFormat(pointer.getPointer(0))

    public fun setValue(value: VideoMediaFrameFormat): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VideoMediaFrameFormat, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VideoMediaFrameFormat {
      val address = segment.toRawLongValue()
      return VideoMediaFrameFormat(Pointer(address))
    }

    public override fun toNative(obj: VideoMediaFrameFormat): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
