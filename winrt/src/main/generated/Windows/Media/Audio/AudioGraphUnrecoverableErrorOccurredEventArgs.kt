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

@ABIMarker(AudioGraphUnrecoverableErrorOccurredEventArgs.ABI::class)
@Signature("rc(Windows.Media.Audio.AudioGraphUnrecoverableErrorOccurredEventArgs;{c3d9cbe0-3ff6-4fb3-b262-50d435c55423})")
@WinRTByReference(brClass = AudioGraphUnrecoverableErrorOccurredEventArgs.ByReference::class)
public class AudioGraphUnrecoverableErrorOccurredEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAudioGraphUnrecoverableErrorOccurredEventArgs.WithDefault, IWinRTObject {
  private val __158183663_Interface: IAudioGraphUnrecoverableErrorOccurredEventArgs.WithDefault by
      lazy {
    as_158183663()
  }


  public override val __158183663_Ptr: JNAPointer? by lazy {
    __158183663_Interface.__158183663_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__158183663_Interface)

  private fun as_158183663(): IAudioGraphUnrecoverableErrorOccurredEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAudioGraphUnrecoverableErrorOccurredEventArgs.ABI.makeIAudioGraphUnrecoverableErrorOccurredEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioGraphUnrecoverableErrorOccurredEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioGraphUnrecoverableErrorOccurredEventArgs.ABI.makeIAudioGraphUnrecoverableErrorOccurredEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AudioGraphUnrecoverableErrorOccurredEventArgs> {
    public override fun getValue() =
        AudioGraphUnrecoverableErrorOccurredEventArgs(pointer.getPointer(0))

    public fun setValue(value: AudioGraphUnrecoverableErrorOccurredEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AudioGraphUnrecoverableErrorOccurredEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AudioGraphUnrecoverableErrorOccurredEventArgs {
      val address = segment.toRawLongValue()
      return AudioGraphUnrecoverableErrorOccurredEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AudioGraphUnrecoverableErrorOccurredEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
