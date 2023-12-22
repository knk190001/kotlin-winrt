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

@ABIMarker(KnownPerceptionVideoFrameSourceProperties.ABI::class)
@WinRTByReference(brClass = KnownPerceptionVideoFrameSourceProperties.ByReference::class)
public class KnownPerceptionVideoFrameSourceProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KnownPerceptionVideoFrameSourceProperties> {
    public override fun getValue() =
        KnownPerceptionVideoFrameSourceProperties(pointer.getPointer(0))

    public fun setValue(value: KnownPerceptionVideoFrameSourceProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KnownPerceptionVideoFrameSourceProperties, MemoryAddress> {
    public val IKnownPerceptionVideoFrameSourcePropertiesStatics_Instance:
        IKnownPerceptionVideoFrameSourcePropertiesStatics by lazy {
      createIKnownPerceptionVideoFrameSourcePropertiesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKnownPerceptionVideoFrameSourcePropertiesStatics():
        IKnownPerceptionVideoFrameSourcePropertiesStatics {
      val refiid = Guid.REFIID(IKnownPerceptionVideoFrameSourcePropertiesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Perception.KnownPerceptionVideoFrameSourceProperties".toHandle(),refiid,interfacePtr)
      val result =
          IKnownPerceptionVideoFrameSourcePropertiesStatics.ABI.makeIKnownPerceptionVideoFrameSourcePropertiesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress):
        KnownPerceptionVideoFrameSourceProperties {
      val address = segment.toRawLongValue()
      return KnownPerceptionVideoFrameSourceProperties(Pointer(address))
    }

    public override fun toNative(obj: KnownPerceptionVideoFrameSourceProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_VideoProfile() =
        ABI.IKnownPerceptionVideoFrameSourcePropertiesStatics_Instance.get_VideoProfile()

    public fun get_SupportedVideoProfiles() =
        ABI.IKnownPerceptionVideoFrameSourcePropertiesStatics_Instance.get_SupportedVideoProfiles()

    public fun get_AvailableVideoProfiles() =
        ABI.IKnownPerceptionVideoFrameSourcePropertiesStatics_Instance.get_AvailableVideoProfiles()

    public fun get_IsMirrored() =
        ABI.IKnownPerceptionVideoFrameSourcePropertiesStatics_Instance.get_IsMirrored()

    public fun get_CameraIntrinsics() =
        ABI.IKnownPerceptionVideoFrameSourcePropertiesStatics_Instance.get_CameraIntrinsics()
  }
}
