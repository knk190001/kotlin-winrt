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

@ABIMarker(MediaPlaybackSession.ABI::class)
@Signature("rc(Windows.Media.Playback.MediaPlaybackSession;{c32b683d-0407-41ba-8946-8b345a5a5435})")
@WinRTByReference(brClass = MediaPlaybackSession.ByReference::class)
public class MediaPlaybackSession(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaPlaybackSession.WithDefault, IMediaPlaybackSession2.WithDefault,
    IMediaPlaybackSession3.WithDefault, IWinRTObject {
  private val __54988624_Interface: IMediaPlaybackSession.WithDefault by lazy {
    as_54988624()
  }


  private val __1704647394_Interface: IMediaPlaybackSession2.WithDefault by lazy {
    as_1704647394()
  }


  private val __1704647395_Interface: IMediaPlaybackSession3.WithDefault by lazy {
    as_1704647395()
  }


  public override val __54988624_Ptr: JNAPointer? by lazy {
    __54988624_Interface.__54988624_Ptr
  }


  public override val __1704647394_Ptr: JNAPointer? by lazy {
    __1704647394_Interface.__1704647394_Ptr
  }


  public override val __1704647395_Ptr: JNAPointer? by lazy {
    __1704647395_Interface.__1704647395_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__54988624_Interface, __1704647394_Interface, __1704647395_Interface)

  private fun as_54988624(): IMediaPlaybackSession.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlaybackSession.ABI.makeIMediaPlaybackSession(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlaybackSession>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlaybackSession.ABI.makeIMediaPlaybackSession(ref.value))
  }

  private fun as_1704647394(): IMediaPlaybackSession2.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlaybackSession2.ABI.makeIMediaPlaybackSession2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlaybackSession2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlaybackSession2.ABI.makeIMediaPlaybackSession2(ref.value))
  }

  private fun as_1704647395(): IMediaPlaybackSession3.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlaybackSession3.ABI.makeIMediaPlaybackSession3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlaybackSession3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlaybackSession3.ABI.makeIMediaPlaybackSession3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaPlaybackSession> {
    public override fun getValue() = MediaPlaybackSession(pointer.getPointer(0))

    public fun setValue(value: MediaPlaybackSession): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaPlaybackSession, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaPlaybackSession {
      val address = segment.toRawLongValue()
      return MediaPlaybackSession(Pointer(address))
    }

    public override fun toNative(obj: MediaPlaybackSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
