package Windows.Media.Audio

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import kotlin.Double
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AudioNodeEmitterDecayModel.ABI::class)
@Signature("rc(Windows.Media.Audio.AudioNodeEmitterDecayModel;{1d1d5af7-0d53-4fa9-bd84-d5816a86f3ff})")
@WinRTByReference(brClass = AudioNodeEmitterDecayModel.ByReference::class)
public class AudioNodeEmitterDecayModel(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAudioNodeEmitterDecayModel.WithDefault, IWinRTObject {
  private val __675088909_Interface: IAudioNodeEmitterDecayModel.WithDefault by lazy {
    as_675088909()
  }


  public override val __675088909_Ptr: JNAPointer? by lazy {
    __675088909_Interface.__675088909_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__675088909_Interface)

  private fun as_675088909(): IAudioNodeEmitterDecayModel.WithDefault {
    if(pointer == NULL) {
      return(IAudioNodeEmitterDecayModel.ABI.makeIAudioNodeEmitterDecayModel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioNodeEmitterDecayModel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioNodeEmitterDecayModel.ABI.makeIAudioNodeEmitterDecayModel(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AudioNodeEmitterDecayModel> {
    public override fun getValue() = AudioNodeEmitterDecayModel(pointer.getPointer(0))

    public fun setValue(value: AudioNodeEmitterDecayModel): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AudioNodeEmitterDecayModel, MemoryAddress> {
    public val IAudioNodeEmitterDecayModelStatics_Instance: IAudioNodeEmitterDecayModelStatics by
        lazy {
      createIAudioNodeEmitterDecayModelStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAudioNodeEmitterDecayModelStatics(): IAudioNodeEmitterDecayModelStatics {
      val refiid = Guid.REFIID(IAudioNodeEmitterDecayModelStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Audio.AudioNodeEmitterDecayModel".toHandle(),refiid,interfacePtr)
      val result =
          IAudioNodeEmitterDecayModelStatics.ABI.makeIAudioNodeEmitterDecayModelStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AudioNodeEmitterDecayModel {
      val address = segment.toRawLongValue()
      return AudioNodeEmitterDecayModel(Pointer(address))
    }

    public override fun toNative(obj: AudioNodeEmitterDecayModel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateNatural(
      minGain: Double,
      maxGain: Double,
      unityGainDistance: Double,
      cutoffDistance: Double
    ) = ABI.IAudioNodeEmitterDecayModelStatics_Instance.CreateNatural(minGain, maxGain,
        unityGainDistance, cutoffDistance)

    public fun CreateCustom(minGain: Double, maxGain: Double) =
        ABI.IAudioNodeEmitterDecayModelStatics_Instance.CreateCustom(minGain, maxGain)
  }
}
