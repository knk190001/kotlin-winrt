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

@ABIMarker(AudioPlaybackConnectionOpenResult.ABI::class)
@Signature("rc(Windows.Media.Audio.AudioPlaybackConnectionOpenResult;{4e656aef-39f9-5fc9-a519-a5bbfd9fe921})")
@WinRTByReference(brClass = AudioPlaybackConnectionOpenResult.ByReference::class)
public class AudioPlaybackConnectionOpenResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAudioPlaybackConnectionOpenResult.WithDefault, IWinRTObject {
  private val __1959604050_Interface: IAudioPlaybackConnectionOpenResult.WithDefault by lazy {
    as_1959604050()
  }


  public override val __1959604050_Ptr: JNAPointer? by lazy {
    __1959604050_Interface.__1959604050_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1959604050_Interface)

  private fun as_1959604050(): IAudioPlaybackConnectionOpenResult.WithDefault {
    if(pointer == NULL) {
      return(IAudioPlaybackConnectionOpenResult.ABI.makeIAudioPlaybackConnectionOpenResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioPlaybackConnectionOpenResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioPlaybackConnectionOpenResult.ABI.makeIAudioPlaybackConnectionOpenResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AudioPlaybackConnectionOpenResult> {
    public override fun getValue() = AudioPlaybackConnectionOpenResult(pointer.getPointer(0))

    public fun setValue(value: AudioPlaybackConnectionOpenResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AudioPlaybackConnectionOpenResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AudioPlaybackConnectionOpenResult {
      val address = segment.toRawLongValue()
      return AudioPlaybackConnectionOpenResult(Pointer(address))
    }

    public override fun toNative(obj: AudioPlaybackConnectionOpenResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
