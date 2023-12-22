package Windows.Media.Effects

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

@ABIMarker(AudioCaptureEffectsManager.ABI::class)
@Signature("rc(Windows.Media.Effects.AudioCaptureEffectsManager;{8f85c271-038d-4393-8298-540110608eef})")
@WinRTByReference(brClass = AudioCaptureEffectsManager.ByReference::class)
public class AudioCaptureEffectsManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAudioCaptureEffectsManager.WithDefault, IWinRTObject {
  private val __349356649_Interface: IAudioCaptureEffectsManager.WithDefault by lazy {
    as_349356649()
  }


  public override val __349356649_Ptr: JNAPointer? by lazy {
    __349356649_Interface.__349356649_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__349356649_Interface)

  private fun as_349356649(): IAudioCaptureEffectsManager.WithDefault {
    if(pointer == NULL) {
      return(IAudioCaptureEffectsManager.ABI.makeIAudioCaptureEffectsManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioCaptureEffectsManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioCaptureEffectsManager.ABI.makeIAudioCaptureEffectsManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AudioCaptureEffectsManager> {
    public override fun getValue() = AudioCaptureEffectsManager(pointer.getPointer(0))

    public fun setValue(value: AudioCaptureEffectsManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AudioCaptureEffectsManager, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AudioCaptureEffectsManager {
      val address = segment.toRawLongValue()
      return AudioCaptureEffectsManager(Pointer(address))
    }

    public override fun toNative(obj: AudioCaptureEffectsManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
