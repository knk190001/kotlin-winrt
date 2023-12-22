package Windows.Devices.Sensors

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ProximitySensor.ABI::class)
@Signature("rc(Windows.Devices.Sensors.ProximitySensor;{54c076b8-ecfb-4944-b928-74fc504d47ee})")
@WinRTByReference(brClass = ProximitySensor.ByReference::class)
public class ProximitySensor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProximitySensor.WithDefault, IWinRTObject {
  private val __1623149997_Interface: IProximitySensor.WithDefault by lazy {
    as_1623149997()
  }


  public override val __1623149997_Ptr: JNAPointer? by lazy {
    __1623149997_Interface.__1623149997_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1623149997_Interface)

  private fun as_1623149997(): IProximitySensor.WithDefault {
    if(pointer == NULL) {
      return(IProximitySensor.ABI.makeIProximitySensor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProximitySensor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProximitySensor.ABI.makeIProximitySensor(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProximitySensor> {
    public override fun getValue() = ProximitySensor(pointer.getPointer(0))

    public fun setValue(value: ProximitySensor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProximitySensor, MemoryAddress> {
    public val IProximitySensorStatics2_Instance: IProximitySensorStatics2 by lazy {
      createIProximitySensorStatics2()
    }


    public val IProximitySensorStatics_Instance: IProximitySensorStatics by lazy {
      createIProximitySensorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIProximitySensorStatics2(): IProximitySensorStatics2 {
      val refiid = Guid.REFIID(IProximitySensorStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.ProximitySensor".toHandle(),refiid,interfacePtr)
      val result = IProximitySensorStatics2.ABI.makeIProximitySensorStatics2(interfacePtr.value)
      return result
    }

    public fun createIProximitySensorStatics(): IProximitySensorStatics {
      val refiid = Guid.REFIID(IProximitySensorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.ProximitySensor".toHandle(),refiid,interfacePtr)
      val result = IProximitySensorStatics.ABI.makeIProximitySensorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ProximitySensor {
      val address = segment.toRawLongValue()
      return ProximitySensor(Pointer(address))
    }

    public override fun toNative(obj: ProximitySensor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetReadingsFromTriggerDetails(triggerDetails: SensorDataThresholdTriggerDetails) =
        ABI.IProximitySensorStatics2_Instance.GetReadingsFromTriggerDetails(triggerDetails)

    public fun GetDeviceSelector() = ABI.IProximitySensorStatics_Instance.GetDeviceSelector()

    public fun FromId(sensorId: String) = ABI.IProximitySensorStatics_Instance.FromId(sensorId)
  }
}
