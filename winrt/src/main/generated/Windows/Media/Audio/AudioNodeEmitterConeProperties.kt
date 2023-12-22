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

@ABIMarker(AudioNodeEmitterConeProperties.ABI::class)
@Signature("rc(Windows.Media.Audio.AudioNodeEmitterConeProperties;{e99b2cee-02ca-4375-9326-0c6ae4bcdfb5})")
@WinRTByReference(brClass = AudioNodeEmitterConeProperties.ByReference::class)
public class AudioNodeEmitterConeProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAudioNodeEmitterConeProperties.WithDefault, IWinRTObject {
  private val __810232884_Interface: IAudioNodeEmitterConeProperties.WithDefault by lazy {
    as_810232884()
  }


  public override val __810232884_Ptr: JNAPointer? by lazy {
    __810232884_Interface.__810232884_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__810232884_Interface)

  private fun as_810232884(): IAudioNodeEmitterConeProperties.WithDefault {
    if(pointer == NULL) {
      return(IAudioNodeEmitterConeProperties.ABI.makeIAudioNodeEmitterConeProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioNodeEmitterConeProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioNodeEmitterConeProperties.ABI.makeIAudioNodeEmitterConeProperties(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AudioNodeEmitterConeProperties> {
    public override fun getValue() = AudioNodeEmitterConeProperties(pointer.getPointer(0))

    public fun setValue(value: AudioNodeEmitterConeProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AudioNodeEmitterConeProperties, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AudioNodeEmitterConeProperties {
      val address = segment.toRawLongValue()
      return AudioNodeEmitterConeProperties(Pointer(address))
    }

    public override fun toNative(obj: AudioNodeEmitterConeProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
