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

@ABIMarker(MediaPlaybackCommandManager.ABI::class)
@Signature("rc(Windows.Media.Playback.MediaPlaybackCommandManager;{5acee5a6-5cb6-4a5a-8521-cc86b1c1ed37})")
@WinRTByReference(brClass = MediaPlaybackCommandManager.ByReference::class)
public class MediaPlaybackCommandManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaPlaybackCommandManager.WithDefault, IWinRTObject {
  private val __1908827160_Interface: IMediaPlaybackCommandManager.WithDefault by lazy {
    as_1908827160()
  }


  public override val __1908827160_Ptr: JNAPointer? by lazy {
    __1908827160_Interface.__1908827160_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1908827160_Interface)

  private fun as_1908827160(): IMediaPlaybackCommandManager.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlaybackCommandManager.ABI.makeIMediaPlaybackCommandManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlaybackCommandManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlaybackCommandManager.ABI.makeIMediaPlaybackCommandManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaPlaybackCommandManager> {
    public override fun getValue() = MediaPlaybackCommandManager(pointer.getPointer(0))

    public fun setValue(value: MediaPlaybackCommandManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaPlaybackCommandManager, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaPlaybackCommandManager {
      val address = segment.toRawLongValue()
      return MediaPlaybackCommandManager(Pointer(address))
    }

    public override fun toNative(obj: MediaPlaybackCommandManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
