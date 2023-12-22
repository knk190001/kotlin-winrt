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

@ABIMarker(AudioNodeEmitterShape.ABI::class)
@Signature("rc(Windows.Media.Audio.AudioNodeEmitterShape;{ea0311c5-e73d-44bc-859c-45553bbc4828})")
@WinRTByReference(brClass = AudioNodeEmitterShape.ByReference::class)
public class AudioNodeEmitterShape(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAudioNodeEmitterShape.WithDefault, IWinRTObject {
  private val __494823011_Interface: IAudioNodeEmitterShape.WithDefault by lazy {
    as_494823011()
  }


  public override val __494823011_Ptr: JNAPointer? by lazy {
    __494823011_Interface.__494823011_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__494823011_Interface)

  private fun as_494823011(): IAudioNodeEmitterShape.WithDefault {
    if(pointer == NULL) {
      return(IAudioNodeEmitterShape.ABI.makeIAudioNodeEmitterShape(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioNodeEmitterShape>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioNodeEmitterShape.ABI.makeIAudioNodeEmitterShape(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AudioNodeEmitterShape> {
    public override fun getValue() = AudioNodeEmitterShape(pointer.getPointer(0))

    public fun setValue(value: AudioNodeEmitterShape): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AudioNodeEmitterShape, MemoryAddress> {
    public val IAudioNodeEmitterShapeStatics_Instance: IAudioNodeEmitterShapeStatics by lazy {
      createIAudioNodeEmitterShapeStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAudioNodeEmitterShapeStatics(): IAudioNodeEmitterShapeStatics {
      val refiid = Guid.REFIID(IAudioNodeEmitterShapeStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Audio.AudioNodeEmitterShape".toHandle(),refiid,interfacePtr)
      val result =
          IAudioNodeEmitterShapeStatics.ABI.makeIAudioNodeEmitterShapeStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AudioNodeEmitterShape {
      val address = segment.toRawLongValue()
      return AudioNodeEmitterShape(Pointer(address))
    }

    public override fun toNative(obj: AudioNodeEmitterShape): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateCone(
      innerAngle: Double,
      outerAngle: Double,
      outerAngleGain: Double
    ) = ABI.IAudioNodeEmitterShapeStatics_Instance.CreateCone(innerAngle, outerAngle,
        outerAngleGain)

    public fun CreateOmnidirectional() =
        ABI.IAudioNodeEmitterShapeStatics_Instance.CreateOmnidirectional()
  }
}
