package Windows.Devices.Perception

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(KnownPerceptionFrameSourceProperties.ABI::class)
@WinRTByReference(brClass = KnownPerceptionFrameSourceProperties.ByReference::class)
public class KnownPerceptionFrameSourceProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KnownPerceptionFrameSourceProperties> {
    public override fun getValue() = KnownPerceptionFrameSourceProperties(pointer.getPointer(0))

    public fun setValue(value: KnownPerceptionFrameSourceProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KnownPerceptionFrameSourceProperties, MemoryAddress> {
    public val IKnownPerceptionFrameSourcePropertiesStatics2_Instance:
        IKnownPerceptionFrameSourcePropertiesStatics2 by lazy {
      createIKnownPerceptionFrameSourcePropertiesStatics2()
    }


    public val IKnownPerceptionFrameSourcePropertiesStatics_Instance:
        IKnownPerceptionFrameSourcePropertiesStatics by lazy {
      createIKnownPerceptionFrameSourcePropertiesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKnownPerceptionFrameSourcePropertiesStatics2():
        IKnownPerceptionFrameSourcePropertiesStatics2 {
      val refiid = Guid.REFIID(IKnownPerceptionFrameSourcePropertiesStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Perception.KnownPerceptionFrameSourceProperties".toHandle(),refiid,interfacePtr)
      val result =
          IKnownPerceptionFrameSourcePropertiesStatics2.ABI.makeIKnownPerceptionFrameSourcePropertiesStatics2(interfacePtr.value)
      return result
    }

    public fun createIKnownPerceptionFrameSourcePropertiesStatics():
        IKnownPerceptionFrameSourcePropertiesStatics {
      val refiid = Guid.REFIID(IKnownPerceptionFrameSourcePropertiesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Perception.KnownPerceptionFrameSourceProperties".toHandle(),refiid,interfacePtr)
      val result =
          IKnownPerceptionFrameSourcePropertiesStatics.ABI.makeIKnownPerceptionFrameSourcePropertiesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): KnownPerceptionFrameSourceProperties {
      val address = segment.toRawLongValue()
      return KnownPerceptionFrameSourceProperties(Pointer(address))
    }

    public override fun toNative(obj: KnownPerceptionFrameSourceProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_DeviceId() =
        ABI.IKnownPerceptionFrameSourcePropertiesStatics2_Instance.get_DeviceId()

    public fun get_Id() = ABI.IKnownPerceptionFrameSourcePropertiesStatics_Instance.get_Id()

    public fun get_PhysicalDeviceIds() =
        ABI.IKnownPerceptionFrameSourcePropertiesStatics_Instance.get_PhysicalDeviceIds()

    public fun get_FrameKind() =
        ABI.IKnownPerceptionFrameSourcePropertiesStatics_Instance.get_FrameKind()

    public fun get_DeviceModelVersion() =
        ABI.IKnownPerceptionFrameSourcePropertiesStatics_Instance.get_DeviceModelVersion()

    public fun get_EnclosureLocation() =
        ABI.IKnownPerceptionFrameSourcePropertiesStatics_Instance.get_EnclosureLocation()
  }
}
