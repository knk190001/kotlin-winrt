package Windows.Media.Playback

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

@ABIMarker(MediaPlaybackItemOpenedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Playback.MediaPlaybackItemOpenedEventArgs;{cbd9bd82-3037-4fbe-ae8f-39fc39edf4ef})")
@WinRTByReference(brClass = MediaPlaybackItemOpenedEventArgs.ByReference::class)
public class MediaPlaybackItemOpenedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaPlaybackItemOpenedEventArgs.WithDefault, IWinRTObject {
  private val __1580453291_Interface: IMediaPlaybackItemOpenedEventArgs.WithDefault by lazy {
    as_1580453291()
  }


  public override val __1580453291_Ptr: JNAPointer? by lazy {
    __1580453291_Interface.__1580453291_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1580453291_Interface)

  private fun as_1580453291(): IMediaPlaybackItemOpenedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlaybackItemOpenedEventArgs.ABI.makeIMediaPlaybackItemOpenedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlaybackItemOpenedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlaybackItemOpenedEventArgs.ABI.makeIMediaPlaybackItemOpenedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaPlaybackItemOpenedEventArgs> {
    public override fun getValue() = MediaPlaybackItemOpenedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MediaPlaybackItemOpenedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaPlaybackItemOpenedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaPlaybackItemOpenedEventArgs {
      val address = segment.toRawLongValue()
      return MediaPlaybackItemOpenedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MediaPlaybackItemOpenedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
