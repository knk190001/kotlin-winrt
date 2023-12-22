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

@ABIMarker(MediaPlaybackCommandManagerPositionReceivedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Playback.MediaPlaybackCommandManagerPositionReceivedEventArgs;{5591a754-d627-4bdd-a90d-86a015b24902})")
@WinRTByReference(brClass = MediaPlaybackCommandManagerPositionReceivedEventArgs.ByReference::class)
public class MediaPlaybackCommandManagerPositionReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaPlaybackCommandManagerPositionReceivedEventArgs.WithDefault,
    IWinRTObject {
  private val __444077189_Interface:
      IMediaPlaybackCommandManagerPositionReceivedEventArgs.WithDefault by lazy {
    as_444077189()
  }


  public override val __444077189_Ptr: JNAPointer? by lazy {
    __444077189_Interface.__444077189_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__444077189_Interface)

  private fun as_444077189(): IMediaPlaybackCommandManagerPositionReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlaybackCommandManagerPositionReceivedEventArgs.ABI.makeIMediaPlaybackCommandManagerPositionReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlaybackCommandManagerPositionReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlaybackCommandManagerPositionReceivedEventArgs.ABI.makeIMediaPlaybackCommandManagerPositionReceivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaPlaybackCommandManagerPositionReceivedEventArgs> {
    public override fun getValue() =
        MediaPlaybackCommandManagerPositionReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MediaPlaybackCommandManagerPositionReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaPlaybackCommandManagerPositionReceivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MediaPlaybackCommandManagerPositionReceivedEventArgs {
      val address = segment.toRawLongValue()
      return MediaPlaybackCommandManagerPositionReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MediaPlaybackCommandManagerPositionReceivedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
