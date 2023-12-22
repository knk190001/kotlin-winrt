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

@ABIMarker(VideoMediaFrame.ABI::class)
@Signature("rc(Windows.Media.Capture.Frames.VideoMediaFrame;{00dd4ccb-32bd-4fe1-a013-7cc13cf5dbcf})")
@WinRTByReference(brClass = VideoMediaFrame.ByReference::class)
public class VideoMediaFrame(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVideoMediaFrame.WithDefault, IWinRTObject {
  private val __866527198_Interface: IVideoMediaFrame.WithDefault by lazy {
    as_866527198()
  }


  public override val __866527198_Ptr: JNAPointer? by lazy {
    __866527198_Interface.__866527198_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__866527198_Interface)

  private fun as_866527198(): IVideoMediaFrame.WithDefault {
    if(pointer == NULL) {
      return(IVideoMediaFrame.ABI.makeIVideoMediaFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVideoMediaFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVideoMediaFrame.ABI.makeIVideoMediaFrame(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VideoMediaFrame> {
    public override fun getValue() = VideoMediaFrame(pointer.getPointer(0))

    public fun setValue(value: VideoMediaFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VideoMediaFrame, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VideoMediaFrame {
      val address = segment.toRawLongValue()
      return VideoMediaFrame(Pointer(address))
    }

    public override fun toNative(obj: VideoMediaFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
