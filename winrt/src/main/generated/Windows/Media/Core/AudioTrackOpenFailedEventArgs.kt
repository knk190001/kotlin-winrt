package Windows.Media.Core

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

@ABIMarker(AudioTrackOpenFailedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Core.AudioTrackOpenFailedEventArgs;{eeddb9b9-bb7c-4112-bf76-9384676f824b})")
@WinRTByReference(brClass = AudioTrackOpenFailedEventArgs.ByReference::class)
public class AudioTrackOpenFailedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAudioTrackOpenFailedEventArgs.WithDefault, IWinRTObject {
  private val __691951834_Interface: IAudioTrackOpenFailedEventArgs.WithDefault by lazy {
    as_691951834()
  }


  public override val __691951834_Ptr: JNAPointer? by lazy {
    __691951834_Interface.__691951834_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__691951834_Interface)

  private fun as_691951834(): IAudioTrackOpenFailedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAudioTrackOpenFailedEventArgs.ABI.makeIAudioTrackOpenFailedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioTrackOpenFailedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioTrackOpenFailedEventArgs.ABI.makeIAudioTrackOpenFailedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AudioTrackOpenFailedEventArgs> {
    public override fun getValue() = AudioTrackOpenFailedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AudioTrackOpenFailedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AudioTrackOpenFailedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AudioTrackOpenFailedEventArgs {
      val address = segment.toRawLongValue()
      return AudioTrackOpenFailedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AudioTrackOpenFailedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
