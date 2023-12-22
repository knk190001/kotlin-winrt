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

@ABIMarker(MediaFrameArrivedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Capture.Frames.MediaFrameArrivedEventArgs;{0b430add-a490-4435-ada1-9affd55239f7})")
@WinRTByReference(brClass = MediaFrameArrivedEventArgs.ByReference::class)
public class MediaFrameArrivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaFrameArrivedEventArgs.WithDefault, IWinRTObject {
  private val __323511975_Interface: IMediaFrameArrivedEventArgs.WithDefault by lazy {
    as_323511975()
  }


  public override val __323511975_Ptr: JNAPointer? by lazy {
    __323511975_Interface.__323511975_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__323511975_Interface)

  private fun as_323511975(): IMediaFrameArrivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMediaFrameArrivedEventArgs.ABI.makeIMediaFrameArrivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaFrameArrivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaFrameArrivedEventArgs.ABI.makeIMediaFrameArrivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaFrameArrivedEventArgs> {
    public override fun getValue() = MediaFrameArrivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MediaFrameArrivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaFrameArrivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaFrameArrivedEventArgs {
      val address = segment.toRawLongValue()
      return MediaFrameArrivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MediaFrameArrivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
