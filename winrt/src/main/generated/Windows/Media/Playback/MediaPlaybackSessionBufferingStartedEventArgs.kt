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

@ABIMarker(MediaPlaybackSessionBufferingStartedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Playback.MediaPlaybackSessionBufferingStartedEventArgs;{cd6aafed-74e2-43b5-b115-76236c33791a})")
@WinRTByReference(brClass = MediaPlaybackSessionBufferingStartedEventArgs.ByReference::class)
public class MediaPlaybackSessionBufferingStartedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaPlaybackSessionBufferingStartedEventArgs.WithDefault, IWinRTObject {
  private val __1320632680_Interface: IMediaPlaybackSessionBufferingStartedEventArgs.WithDefault by
      lazy {
    as_1320632680()
  }


  public override val __1320632680_Ptr: JNAPointer? by lazy {
    __1320632680_Interface.__1320632680_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1320632680_Interface)

  private fun as_1320632680(): IMediaPlaybackSessionBufferingStartedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlaybackSessionBufferingStartedEventArgs.ABI.makeIMediaPlaybackSessionBufferingStartedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlaybackSessionBufferingStartedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlaybackSessionBufferingStartedEventArgs.ABI.makeIMediaPlaybackSessionBufferingStartedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaPlaybackSessionBufferingStartedEventArgs> {
    public override fun getValue() =
        MediaPlaybackSessionBufferingStartedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MediaPlaybackSessionBufferingStartedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaPlaybackSessionBufferingStartedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MediaPlaybackSessionBufferingStartedEventArgs {
      val address = segment.toRawLongValue()
      return MediaPlaybackSessionBufferingStartedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MediaPlaybackSessionBufferingStartedEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
