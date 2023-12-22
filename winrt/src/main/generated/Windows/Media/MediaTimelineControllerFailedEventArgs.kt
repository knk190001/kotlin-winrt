package Windows.Media

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

@ABIMarker(MediaTimelineControllerFailedEventArgs.ABI::class)
@Signature("rc(Windows.Media.MediaTimelineControllerFailedEventArgs;{8821f81d-3e77-43fb-be26-4fc87a044834})")
@WinRTByReference(brClass = MediaTimelineControllerFailedEventArgs.ByReference::class)
public class MediaTimelineControllerFailedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaTimelineControllerFailedEventArgs.WithDefault, IWinRTObject {
  private val __357794327_Interface: IMediaTimelineControllerFailedEventArgs.WithDefault by lazy {
    as_357794327()
  }


  public override val __357794327_Ptr: JNAPointer? by lazy {
    __357794327_Interface.__357794327_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__357794327_Interface)

  private fun as_357794327(): IMediaTimelineControllerFailedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMediaTimelineControllerFailedEventArgs.ABI.makeIMediaTimelineControllerFailedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaTimelineControllerFailedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaTimelineControllerFailedEventArgs.ABI.makeIMediaTimelineControllerFailedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaTimelineControllerFailedEventArgs> {
    public override fun getValue() = MediaTimelineControllerFailedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MediaTimelineControllerFailedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaTimelineControllerFailedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaTimelineControllerFailedEventArgs {
      val address = segment.toRawLongValue()
      return MediaTimelineControllerFailedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MediaTimelineControllerFailedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
