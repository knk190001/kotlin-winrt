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

@ABIMarker(MediaPlaybackCommandManagerAutoRepeatModeReceivedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Playback.MediaPlaybackCommandManagerAutoRepeatModeReceivedEventArgs;{3d6f4f23-5230-4411-a0e9-bad94c2a045c})")
@WinRTByReference(brClass =
    MediaPlaybackCommandManagerAutoRepeatModeReceivedEventArgs.ByReference::class)
public class MediaPlaybackCommandManagerAutoRepeatModeReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaPlaybackCommandManagerAutoRepeatModeReceivedEventArgs.WithDefault,
    IWinRTObject {
  private val __1976708287_Interface:
      IMediaPlaybackCommandManagerAutoRepeatModeReceivedEventArgs.WithDefault by lazy {
    as_1976708287()
  }


  public override val __1976708287_Ptr: JNAPointer? by lazy {
    __1976708287_Interface.__1976708287_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1976708287_Interface)

  private fun as_1976708287():
      IMediaPlaybackCommandManagerAutoRepeatModeReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlaybackCommandManagerAutoRepeatModeReceivedEventArgs.ABI.makeIMediaPlaybackCommandManagerAutoRepeatModeReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlaybackCommandManagerAutoRepeatModeReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlaybackCommandManagerAutoRepeatModeReceivedEventArgs.ABI.makeIMediaPlaybackCommandManagerAutoRepeatModeReceivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaPlaybackCommandManagerAutoRepeatModeReceivedEventArgs> {
    public override fun getValue() =
        MediaPlaybackCommandManagerAutoRepeatModeReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MediaPlaybackCommandManagerAutoRepeatModeReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaPlaybackCommandManagerAutoRepeatModeReceivedEventArgs,
      MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MediaPlaybackCommandManagerAutoRepeatModeReceivedEventArgs {
      val address = segment.toRawLongValue()
      return MediaPlaybackCommandManagerAutoRepeatModeReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MediaPlaybackCommandManagerAutoRepeatModeReceivedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
