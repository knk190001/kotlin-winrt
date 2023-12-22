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

@ABIMarker(MediaPlaybackCommandManagerPlayReceivedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Playback.MediaPlaybackCommandManagerPlayReceivedEventArgs;{9af0004e-578b-4c56-a006-16159d888a48})")
@WinRTByReference(brClass = MediaPlaybackCommandManagerPlayReceivedEventArgs.ByReference::class)
public class MediaPlaybackCommandManagerPlayReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaPlaybackCommandManagerPlayReceivedEventArgs.WithDefault, IWinRTObject {
  private val __732932646_Interface: IMediaPlaybackCommandManagerPlayReceivedEventArgs.WithDefault
      by lazy {
    as_732932646()
  }


  public override val __732932646_Ptr: JNAPointer? by lazy {
    __732932646_Interface.__732932646_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__732932646_Interface)

  private fun as_732932646(): IMediaPlaybackCommandManagerPlayReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlaybackCommandManagerPlayReceivedEventArgs.ABI.makeIMediaPlaybackCommandManagerPlayReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlaybackCommandManagerPlayReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlaybackCommandManagerPlayReceivedEventArgs.ABI.makeIMediaPlaybackCommandManagerPlayReceivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaPlaybackCommandManagerPlayReceivedEventArgs> {
    public override fun getValue() =
        MediaPlaybackCommandManagerPlayReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MediaPlaybackCommandManagerPlayReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaPlaybackCommandManagerPlayReceivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MediaPlaybackCommandManagerPlayReceivedEventArgs {
      val address = segment.toRawLongValue()
      return MediaPlaybackCommandManagerPlayReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MediaPlaybackCommandManagerPlayReceivedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
