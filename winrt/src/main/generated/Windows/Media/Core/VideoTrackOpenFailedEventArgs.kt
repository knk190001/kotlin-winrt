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

@ABIMarker(VideoTrackOpenFailedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Core.VideoTrackOpenFailedEventArgs;{7679e231-04f9-4c82-a4ee-8602c8bb4754})")
@WinRTByReference(brClass = VideoTrackOpenFailedEventArgs.ByReference::class)
public class VideoTrackOpenFailedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVideoTrackOpenFailedEventArgs.WithDefault, IWinRTObject {
  private val __383926069_Interface: IVideoTrackOpenFailedEventArgs.WithDefault by lazy {
    as_383926069()
  }


  public override val __383926069_Ptr: JNAPointer? by lazy {
    __383926069_Interface.__383926069_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__383926069_Interface)

  private fun as_383926069(): IVideoTrackOpenFailedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IVideoTrackOpenFailedEventArgs.ABI.makeIVideoTrackOpenFailedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVideoTrackOpenFailedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVideoTrackOpenFailedEventArgs.ABI.makeIVideoTrackOpenFailedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VideoTrackOpenFailedEventArgs> {
    public override fun getValue() = VideoTrackOpenFailedEventArgs(pointer.getPointer(0))

    public fun setValue(value: VideoTrackOpenFailedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VideoTrackOpenFailedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VideoTrackOpenFailedEventArgs {
      val address = segment.toRawLongValue()
      return VideoTrackOpenFailedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: VideoTrackOpenFailedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
