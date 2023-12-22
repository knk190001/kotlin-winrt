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

@ABIMarker(AudioNodeEmitterNaturalDecayModelProperties.ABI::class)
@Signature("rc(Windows.Media.Audio.AudioNodeEmitterNaturalDecayModelProperties;{48934bcf-cf2c-4efc-9331-75bd22df1f0c})")
@WinRTByReference(brClass = AudioNodeEmitterNaturalDecayModelProperties.ByReference::class)
public class AudioNodeEmitterNaturalDecayModelProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAudioNodeEmitterNaturalDecayModelProperties.WithDefault, IWinRTObject {
  private val __175959763_Interface: IAudioNodeEmitterNaturalDecayModelProperties.WithDefault by
      lazy {
    as_175959763()
  }


  public override val __175959763_Ptr: JNAPointer? by lazy {
    __175959763_Interface.__175959763_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__175959763_Interface)

  private fun as_175959763(): IAudioNodeEmitterNaturalDecayModelProperties.WithDefault {
    if(pointer == NULL) {
      return(IAudioNodeEmitterNaturalDecayModelProperties.ABI.makeIAudioNodeEmitterNaturalDecayModelProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioNodeEmitterNaturalDecayModelProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioNodeEmitterNaturalDecayModelProperties.ABI.makeIAudioNodeEmitterNaturalDecayModelProperties(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AudioNodeEmitterNaturalDecayModelProperties> {
    public override fun getValue() =
        AudioNodeEmitterNaturalDecayModelProperties(pointer.getPointer(0))

    public fun setValue(value: AudioNodeEmitterNaturalDecayModelProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AudioNodeEmitterNaturalDecayModelProperties, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AudioNodeEmitterNaturalDecayModelProperties {
      val address = segment.toRawLongValue()
      return AudioNodeEmitterNaturalDecayModelProperties(Pointer(address))
    }

    public override fun toNative(obj: AudioNodeEmitterNaturalDecayModelProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
