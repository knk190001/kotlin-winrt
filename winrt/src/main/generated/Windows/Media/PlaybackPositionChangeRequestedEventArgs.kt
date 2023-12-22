package Windows.Media

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

@ABIMarker(PlaybackPositionChangeRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Media.PlaybackPositionChangeRequestedEventArgs;{b4493f88-eb28-4961-9c14-335e44f3e125})")
@WinRTByReference(brClass = PlaybackPositionChangeRequestedEventArgs.ByReference::class)
public class PlaybackPositionChangeRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPlaybackPositionChangeRequestedEventArgs.WithDefault, IWinRTObject {
  private val __36050477_Interface: IPlaybackPositionChangeRequestedEventArgs.WithDefault by lazy {
    as_36050477()
  }


  public override val __36050477_Ptr: JNAPointer? by lazy {
    __36050477_Interface.__36050477_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__36050477_Interface)

  private fun as_36050477(): IPlaybackPositionChangeRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPlaybackPositionChangeRequestedEventArgs.ABI.makeIPlaybackPositionChangeRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlaybackPositionChangeRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlaybackPositionChangeRequestedEventArgs.ABI.makeIPlaybackPositionChangeRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PlaybackPositionChangeRequestedEventArgs> {
    public override fun getValue() = PlaybackPositionChangeRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PlaybackPositionChangeRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlaybackPositionChangeRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        PlaybackPositionChangeRequestedEventArgs {
      val address = segment.toRawLongValue()
      return PlaybackPositionChangeRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PlaybackPositionChangeRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
