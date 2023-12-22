package Windows.Media.Audio

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

@ABIMarker(AudioFrameCompletedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Audio.AudioFrameCompletedEventArgs;{dc7c829e-0208-4504-a5a8-f0f268920a65})")
@WinRTByReference(brClass = AudioFrameCompletedEventArgs.ByReference::class)
public class AudioFrameCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAudioFrameCompletedEventArgs.WithDefault, IWinRTObject {
  private val __686585515_Interface: IAudioFrameCompletedEventArgs.WithDefault by lazy {
    as_686585515()
  }


  public override val __686585515_Ptr: JNAPointer? by lazy {
    __686585515_Interface.__686585515_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__686585515_Interface)

  private fun as_686585515(): IAudioFrameCompletedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAudioFrameCompletedEventArgs.ABI.makeIAudioFrameCompletedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioFrameCompletedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioFrameCompletedEventArgs.ABI.makeIAudioFrameCompletedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AudioFrameCompletedEventArgs> {
    public override fun getValue() = AudioFrameCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AudioFrameCompletedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AudioFrameCompletedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AudioFrameCompletedEventArgs {
      val address = segment.toRawLongValue()
      return AudioFrameCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AudioFrameCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
