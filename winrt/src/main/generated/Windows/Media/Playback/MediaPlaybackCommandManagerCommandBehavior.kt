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

@ABIMarker(MediaPlaybackCommandManagerCommandBehavior.ABI::class)
@Signature("rc(Windows.Media.Playback.MediaPlaybackCommandManagerCommandBehavior;{786c1e78-ce78-4a10-afd6-843fcbb90c2e})")
@WinRTByReference(brClass = MediaPlaybackCommandManagerCommandBehavior.ByReference::class)
public class MediaPlaybackCommandManagerCommandBehavior(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaPlaybackCommandManagerCommandBehavior.WithDefault, IWinRTObject {
  private val __921876043_Interface: IMediaPlaybackCommandManagerCommandBehavior.WithDefault by
      lazy {
    as_921876043()
  }


  public override val __921876043_Ptr: JNAPointer? by lazy {
    __921876043_Interface.__921876043_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__921876043_Interface)

  private fun as_921876043(): IMediaPlaybackCommandManagerCommandBehavior.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlaybackCommandManagerCommandBehavior.ABI.makeIMediaPlaybackCommandManagerCommandBehavior(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlaybackCommandManagerCommandBehavior>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlaybackCommandManagerCommandBehavior.ABI.makeIMediaPlaybackCommandManagerCommandBehavior(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaPlaybackCommandManagerCommandBehavior> {
    public override fun getValue() =
        MediaPlaybackCommandManagerCommandBehavior(pointer.getPointer(0))

    public fun setValue(value: MediaPlaybackCommandManagerCommandBehavior): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaPlaybackCommandManagerCommandBehavior, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MediaPlaybackCommandManagerCommandBehavior {
      val address = segment.toRawLongValue()
      return MediaPlaybackCommandManagerCommandBehavior(Pointer(address))
    }

    public override fun toNative(obj: MediaPlaybackCommandManagerCommandBehavior): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
