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

@ABIMarker(PlaybackMediaMarkerReachedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Playback.PlaybackMediaMarkerReachedEventArgs;{578cd1b9-90e2-4e60-abc4-8740b01f6196})")
@WinRTByReference(brClass = PlaybackMediaMarkerReachedEventArgs.ByReference::class)
public class PlaybackMediaMarkerReachedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPlaybackMediaMarkerReachedEventArgs.WithDefault, IWinRTObject {
  private val __2000813743_Interface: IPlaybackMediaMarkerReachedEventArgs.WithDefault by lazy {
    as_2000813743()
  }


  public override val __2000813743_Ptr: JNAPointer? by lazy {
    __2000813743_Interface.__2000813743_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2000813743_Interface)

  private fun as_2000813743(): IPlaybackMediaMarkerReachedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPlaybackMediaMarkerReachedEventArgs.ABI.makeIPlaybackMediaMarkerReachedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlaybackMediaMarkerReachedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlaybackMediaMarkerReachedEventArgs.ABI.makeIPlaybackMediaMarkerReachedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PlaybackMediaMarkerReachedEventArgs> {
    public override fun getValue() = PlaybackMediaMarkerReachedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PlaybackMediaMarkerReachedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlaybackMediaMarkerReachedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PlaybackMediaMarkerReachedEventArgs {
      val address = segment.toRawLongValue()
      return PlaybackMediaMarkerReachedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PlaybackMediaMarkerReachedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
