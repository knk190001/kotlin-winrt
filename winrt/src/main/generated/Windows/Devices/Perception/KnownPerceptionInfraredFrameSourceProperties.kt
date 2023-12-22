package Windows.Devices.Perception

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(KnownPerceptionInfraredFrameSourceProperties.ABI::class)
@WinRTByReference(brClass = KnownPerceptionInfraredFrameSourceProperties.ByReference::class)
public class KnownPerceptionInfraredFrameSourceProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KnownPerceptionInfraredFrameSourceProperties> {
    public override fun getValue() =
        KnownPerceptionInfraredFrameSourceProperties(pointer.getPointer(0))

    public fun setValue(value: KnownPerceptionInfraredFrameSourceProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KnownPerceptionInfraredFrameSourceProperties, MemoryAddress> {
    public val IKnownPerceptionInfraredFrameSourcePropertiesStatics_Instance:
        IKnownPerceptionInfraredFrameSourcePropertiesStatics by lazy {
      createIKnownPerceptionInfraredFrameSourcePropertiesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKnownPerceptionInfraredFrameSourcePropertiesStatics():
        IKnownPerceptionInfraredFrameSourcePropertiesStatics {
      val refiid = Guid.REFIID(IKnownPerceptionInfraredFrameSourcePropertiesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Perception.KnownPerceptionInfraredFrameSourceProperties".toHandle(),refiid,interfacePtr)
      val result =
          IKnownPerceptionInfraredFrameSourcePropertiesStatics.ABI.makeIKnownPerceptionInfraredFrameSourcePropertiesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress):
        KnownPerceptionInfraredFrameSourceProperties {
      val address = segment.toRawLongValue()
      return KnownPerceptionInfraredFrameSourceProperties(Pointer(address))
    }

    public override fun toNative(obj: KnownPerceptionInfraredFrameSourceProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Exposure() =
        ABI.IKnownPerceptionInfraredFrameSourcePropertiesStatics_Instance.get_Exposure()

    public fun get_AutoExposureEnabled() =
        ABI.IKnownPerceptionInfraredFrameSourcePropertiesStatics_Instance.get_AutoExposureEnabled()

    public fun get_ExposureCompensation() =
        ABI.IKnownPerceptionInfraredFrameSourcePropertiesStatics_Instance.get_ExposureCompensation()

    public fun get_ActiveIlluminationEnabled() =
        ABI.IKnownPerceptionInfraredFrameSourcePropertiesStatics_Instance.get_ActiveIlluminationEnabled()

    public fun get_AmbientSubtractionEnabled() =
        ABI.IKnownPerceptionInfraredFrameSourcePropertiesStatics_Instance.get_AmbientSubtractionEnabled()

    public fun get_StructureLightPatternEnabled() =
        ABI.IKnownPerceptionInfraredFrameSourcePropertiesStatics_Instance.get_StructureLightPatternEnabled()

    public fun get_InterleavedIlluminationEnabled() =
        ABI.IKnownPerceptionInfraredFrameSourcePropertiesStatics_Instance.get_InterleavedIlluminationEnabled()
  }
}
