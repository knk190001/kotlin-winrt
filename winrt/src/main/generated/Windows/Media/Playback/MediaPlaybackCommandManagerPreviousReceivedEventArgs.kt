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

@ABIMarker(MediaPlaybackCommandManagerPreviousReceivedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Playback.MediaPlaybackCommandManagerPreviousReceivedEventArgs;{525e3081-4632-4f76-99b1-d771623f6287})")
@WinRTByReference(brClass = MediaPlaybackCommandManagerPreviousReceivedEventArgs.ByReference::class)
public class MediaPlaybackCommandManagerPreviousReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaPlaybackCommandManagerPreviousReceivedEventArgs.WithDefault,
    IWinRTObject {
  private val __1621166199_Interface:
      IMediaPlaybackCommandManagerPreviousReceivedEventArgs.WithDefault by lazy {
    as_1621166199()
  }


  public override val __1621166199_Ptr: JNAPointer? by lazy {
    __1621166199_Interface.__1621166199_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1621166199_Interface)

  private fun as_1621166199(): IMediaPlaybackCommandManagerPreviousReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlaybackCommandManagerPreviousReceivedEventArgs.ABI.makeIMediaPlaybackCommandManagerPreviousReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlaybackCommandManagerPreviousReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlaybackCommandManagerPreviousReceivedEventArgs.ABI.makeIMediaPlaybackCommandManagerPreviousReceivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaPlaybackCommandManagerPreviousReceivedEventArgs> {
    public override fun getValue() =
        MediaPlaybackCommandManagerPreviousReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MediaPlaybackCommandManagerPreviousReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaPlaybackCommandManagerPreviousReceivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MediaPlaybackCommandManagerPreviousReceivedEventArgs {
      val address = segment.toRawLongValue()
      return MediaPlaybackCommandManagerPreviousReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MediaPlaybackCommandManagerPreviousReceivedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
