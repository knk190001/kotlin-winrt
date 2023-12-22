package Windows.Media.Control

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

@ABIMarker(PlaybackInfoChangedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Control.PlaybackInfoChangedEventArgs;{786756c2-bc0d-50a5-8807-054291fef139})")
@WinRTByReference(brClass = PlaybackInfoChangedEventArgs.ByReference::class)
public class PlaybackInfoChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPlaybackInfoChangedEventArgs.WithDefault, IWinRTObject {
  private val __289269011_Interface: IPlaybackInfoChangedEventArgs.WithDefault by lazy {
    as_289269011()
  }


  public override val __289269011_Ptr: JNAPointer? by lazy {
    __289269011_Interface.__289269011_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__289269011_Interface)

  private fun as_289269011(): IPlaybackInfoChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPlaybackInfoChangedEventArgs.ABI.makeIPlaybackInfoChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlaybackInfoChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlaybackInfoChangedEventArgs.ABI.makeIPlaybackInfoChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PlaybackInfoChangedEventArgs> {
    public override fun getValue() = PlaybackInfoChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PlaybackInfoChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlaybackInfoChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PlaybackInfoChangedEventArgs {
      val address = segment.toRawLongValue()
      return PlaybackInfoChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PlaybackInfoChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
