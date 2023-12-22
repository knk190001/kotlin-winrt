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

@ABIMarker(PlaybackRateChangeRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Media.PlaybackRateChangeRequestedEventArgs;{2ce2c41f-3cd6-4f77-9ba7-eb27c26a2140})")
@WinRTByReference(brClass = PlaybackRateChangeRequestedEventArgs.ByReference::class)
public class PlaybackRateChangeRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPlaybackRateChangeRequestedEventArgs.WithDefault, IWinRTObject {
  private val __934727068_Interface: IPlaybackRateChangeRequestedEventArgs.WithDefault by lazy {
    as_934727068()
  }


  public override val __934727068_Ptr: JNAPointer? by lazy {
    __934727068_Interface.__934727068_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__934727068_Interface)

  private fun as_934727068(): IPlaybackRateChangeRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPlaybackRateChangeRequestedEventArgs.ABI.makeIPlaybackRateChangeRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlaybackRateChangeRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlaybackRateChangeRequestedEventArgs.ABI.makeIPlaybackRateChangeRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PlaybackRateChangeRequestedEventArgs> {
    public override fun getValue() = PlaybackRateChangeRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PlaybackRateChangeRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlaybackRateChangeRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PlaybackRateChangeRequestedEventArgs {
      val address = segment.toRawLongValue()
      return PlaybackRateChangeRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PlaybackRateChangeRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
