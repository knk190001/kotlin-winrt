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

@ABIMarker(MediaPlaybackSphericalVideoProjection.ABI::class)
@Signature("rc(Windows.Media.Playback.MediaPlaybackSphericalVideoProjection;{d405b37c-6f0e-4661-b8ee-d487ba9752d5})")
@WinRTByReference(brClass = MediaPlaybackSphericalVideoProjection.ByReference::class)
public class MediaPlaybackSphericalVideoProjection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaPlaybackSphericalVideoProjection.WithDefault, IWinRTObject {
  private val __129289325_Interface: IMediaPlaybackSphericalVideoProjection.WithDefault by lazy {
    as_129289325()
  }


  public override val __129289325_Ptr: JNAPointer? by lazy {
    __129289325_Interface.__129289325_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__129289325_Interface)

  private fun as_129289325(): IMediaPlaybackSphericalVideoProjection.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlaybackSphericalVideoProjection.ABI.makeIMediaPlaybackSphericalVideoProjection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlaybackSphericalVideoProjection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlaybackSphericalVideoProjection.ABI.makeIMediaPlaybackSphericalVideoProjection(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaPlaybackSphericalVideoProjection> {
    public override fun getValue() = MediaPlaybackSphericalVideoProjection(pointer.getPointer(0))

    public fun setValue(value: MediaPlaybackSphericalVideoProjection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaPlaybackSphericalVideoProjection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaPlaybackSphericalVideoProjection {
      val address = segment.toRawLongValue()
      return MediaPlaybackSphericalVideoProjection(Pointer(address))
    }

    public override fun toNative(obj: MediaPlaybackSphericalVideoProjection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
