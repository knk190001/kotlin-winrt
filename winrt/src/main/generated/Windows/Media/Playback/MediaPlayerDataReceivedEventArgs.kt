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

@ABIMarker(MediaPlayerDataReceivedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Playback.MediaPlayerDataReceivedEventArgs;{c75a9405-c801-412a-835b-83fc0e622a8e})")
@WinRTByReference(brClass = MediaPlayerDataReceivedEventArgs.ByReference::class)
public class MediaPlayerDataReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaPlayerDataReceivedEventArgs.WithDefault, IWinRTObject {
  private val __272657056_Interface: IMediaPlayerDataReceivedEventArgs.WithDefault by lazy {
    as_272657056()
  }


  public override val __272657056_Ptr: JNAPointer? by lazy {
    __272657056_Interface.__272657056_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__272657056_Interface)

  private fun as_272657056(): IMediaPlayerDataReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlayerDataReceivedEventArgs.ABI.makeIMediaPlayerDataReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlayerDataReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlayerDataReceivedEventArgs.ABI.makeIMediaPlayerDataReceivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaPlayerDataReceivedEventArgs> {
    public override fun getValue() = MediaPlayerDataReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MediaPlayerDataReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaPlayerDataReceivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaPlayerDataReceivedEventArgs {
      val address = segment.toRawLongValue()
      return MediaPlayerDataReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MediaPlayerDataReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
