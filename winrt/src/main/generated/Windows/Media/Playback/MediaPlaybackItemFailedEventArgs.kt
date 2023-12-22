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

@ABIMarker(MediaPlaybackItemFailedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Playback.MediaPlaybackItemFailedEventArgs;{7703134a-e9a7-47c3-862c-c656d30683d4})")
@WinRTByReference(brClass = MediaPlaybackItemFailedEventArgs.ByReference::class)
public class MediaPlaybackItemFailedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaPlaybackItemFailedEventArgs.WithDefault, IWinRTObject {
  private val __406883071_Interface: IMediaPlaybackItemFailedEventArgs.WithDefault by lazy {
    as_406883071()
  }


  public override val __406883071_Ptr: JNAPointer? by lazy {
    __406883071_Interface.__406883071_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__406883071_Interface)

  private fun as_406883071(): IMediaPlaybackItemFailedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlaybackItemFailedEventArgs.ABI.makeIMediaPlaybackItemFailedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlaybackItemFailedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlaybackItemFailedEventArgs.ABI.makeIMediaPlaybackItemFailedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaPlaybackItemFailedEventArgs> {
    public override fun getValue() = MediaPlaybackItemFailedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MediaPlaybackItemFailedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaPlaybackItemFailedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaPlaybackItemFailedEventArgs {
      val address = segment.toRawLongValue()
      return MediaPlaybackItemFailedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MediaPlaybackItemFailedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
