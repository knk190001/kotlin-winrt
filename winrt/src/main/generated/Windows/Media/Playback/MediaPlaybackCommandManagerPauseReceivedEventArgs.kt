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

@ABIMarker(MediaPlaybackCommandManagerPauseReceivedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Playback.MediaPlaybackCommandManagerPauseReceivedEventArgs;{5ceccd1c-c25c-4221-b16c-c3c98ce012d6})")
@WinRTByReference(brClass = MediaPlaybackCommandManagerPauseReceivedEventArgs.ByReference::class)
public class MediaPlaybackCommandManagerPauseReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaPlaybackCommandManagerPauseReceivedEventArgs.WithDefault, IWinRTObject {
  private val __987198360_Interface: IMediaPlaybackCommandManagerPauseReceivedEventArgs.WithDefault
      by lazy {
    as_987198360()
  }


  public override val __987198360_Ptr: JNAPointer? by lazy {
    __987198360_Interface.__987198360_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__987198360_Interface)

  private fun as_987198360(): IMediaPlaybackCommandManagerPauseReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlaybackCommandManagerPauseReceivedEventArgs.ABI.makeIMediaPlaybackCommandManagerPauseReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlaybackCommandManagerPauseReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlaybackCommandManagerPauseReceivedEventArgs.ABI.makeIMediaPlaybackCommandManagerPauseReceivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaPlaybackCommandManagerPauseReceivedEventArgs> {
    public override fun getValue() =
        MediaPlaybackCommandManagerPauseReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MediaPlaybackCommandManagerPauseReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaPlaybackCommandManagerPauseReceivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MediaPlaybackCommandManagerPauseReceivedEventArgs {
      val address = segment.toRawLongValue()
      return MediaPlaybackCommandManagerPauseReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MediaPlaybackCommandManagerPauseReceivedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
