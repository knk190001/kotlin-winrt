package Windows.Media.Effects

import Windows.Media.AudioProcessing
import Windows.Media.Capture.MediaCategory
import Windows.Media.Render.AudioRenderCategory
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AudioEffectsManager.ABI::class)
@WinRTByReference(brClass = AudioEffectsManager.ByReference::class)
public class AudioEffectsManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AudioEffectsManager> {
    public override fun getValue() = AudioEffectsManager(pointer.getPointer(0))

    public fun setValue(value: AudioEffectsManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AudioEffectsManager, MemoryAddress> {
    public val IAudioEffectsManagerStatics_Instance: IAudioEffectsManagerStatics by lazy {
      createIAudioEffectsManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAudioEffectsManagerStatics(): IAudioEffectsManagerStatics {
      val refiid = Guid.REFIID(IAudioEffectsManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Effects.AudioEffectsManager".toHandle(),refiid,interfacePtr)
      val result =
          IAudioEffectsManagerStatics.ABI.makeIAudioEffectsManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AudioEffectsManager {
      val address = segment.toRawLongValue()
      return AudioEffectsManager(Pointer(address))
    }

    public override fun toNative(obj: AudioEffectsManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateAudioRenderEffectsManager(deviceId: String, category: AudioRenderCategory) =
        ABI.IAudioEffectsManagerStatics_Instance.CreateAudioRenderEffectsManager(deviceId, category)

    public fun CreateAudioRenderEffectsManager(
      deviceId: String,
      category: AudioRenderCategory,
      mode: AudioProcessing
    ) = ABI.IAudioEffectsManagerStatics_Instance.CreateAudioRenderEffectsManager(deviceId, category,
        mode)

    public fun CreateAudioCaptureEffectsManager(deviceId: String, category: MediaCategory) =
        ABI.IAudioEffectsManagerStatics_Instance.CreateAudioCaptureEffectsManager(deviceId,
        category)

    public fun CreateAudioCaptureEffectsManager(
      deviceId: String,
      category: MediaCategory,
      mode: AudioProcessing
    ) = ABI.IAudioEffectsManagerStatics_Instance.CreateAudioCaptureEffectsManager(deviceId,
        category, mode)
  }
}
