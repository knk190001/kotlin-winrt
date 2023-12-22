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

@ABIMarker(KnownPerceptionColorFrameSourceProperties.ABI::class)
@WinRTByReference(brClass = KnownPerceptionColorFrameSourceProperties.ByReference::class)
public class KnownPerceptionColorFrameSourceProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KnownPerceptionColorFrameSourceProperties> {
    public override fun getValue() =
        KnownPerceptionColorFrameSourceProperties(pointer.getPointer(0))

    public fun setValue(value: KnownPerceptionColorFrameSourceProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KnownPerceptionColorFrameSourceProperties, MemoryAddress> {
    public val IKnownPerceptionColorFrameSourcePropertiesStatics_Instance:
        IKnownPerceptionColorFrameSourcePropertiesStatics by lazy {
      createIKnownPerceptionColorFrameSourcePropertiesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKnownPerceptionColorFrameSourcePropertiesStatics():
        IKnownPerceptionColorFrameSourcePropertiesStatics {
      val refiid = Guid.REFIID(IKnownPerceptionColorFrameSourcePropertiesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Perception.KnownPerceptionColorFrameSourceProperties".toHandle(),refiid,interfacePtr)
      val result =
          IKnownPerceptionColorFrameSourcePropertiesStatics.ABI.makeIKnownPerceptionColorFrameSourcePropertiesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress):
        KnownPerceptionColorFrameSourceProperties {
      val address = segment.toRawLongValue()
      return KnownPerceptionColorFrameSourceProperties(Pointer(address))
    }

    public override fun toNative(obj: KnownPerceptionColorFrameSourceProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Exposure() =
        ABI.IKnownPerceptionColorFrameSourcePropertiesStatics_Instance.get_Exposure()

    public fun get_AutoExposureEnabled() =
        ABI.IKnownPerceptionColorFrameSourcePropertiesStatics_Instance.get_AutoExposureEnabled()

    public fun get_ExposureCompensation() =
        ABI.IKnownPerceptionColorFrameSourcePropertiesStatics_Instance.get_ExposureCompensation()
  }
}
