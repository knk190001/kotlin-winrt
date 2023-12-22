package Windows.Devices.Bluetooth.GenericAttributeProfile

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

@ABIMarker(GattServiceUuids.ABI::class)
@WinRTByReference(brClass = GattServiceUuids.ByReference::class)
public class GattServiceUuids(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattServiceUuids> {
    public override fun getValue() = GattServiceUuids(pointer.getPointer(0))

    public fun setValue(value: GattServiceUuids): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattServiceUuids, MemoryAddress> {
    public val IGattServiceUuidsStatics_Instance: IGattServiceUuidsStatics by lazy {
      createIGattServiceUuidsStatics()
    }


    public val IGattServiceUuidsStatics2_Instance: IGattServiceUuidsStatics2 by lazy {
      createIGattServiceUuidsStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGattServiceUuidsStatics(): IGattServiceUuidsStatics {
      val refiid = Guid.REFIID(IGattServiceUuidsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceUuids".toHandle(),refiid,interfacePtr)
      val result = IGattServiceUuidsStatics.ABI.makeIGattServiceUuidsStatics(interfacePtr.value)
      return result
    }

    public fun createIGattServiceUuidsStatics2(): IGattServiceUuidsStatics2 {
      val refiid = Guid.REFIID(IGattServiceUuidsStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceUuids".toHandle(),refiid,interfacePtr)
      val result = IGattServiceUuidsStatics2.ABI.makeIGattServiceUuidsStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GattServiceUuids {
      val address = segment.toRawLongValue()
      return GattServiceUuids(Pointer(address))
    }

    public override fun toNative(obj: GattServiceUuids): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Battery() = ABI.IGattServiceUuidsStatics_Instance.get_Battery()

    public fun get_BloodPressure() = ABI.IGattServiceUuidsStatics_Instance.get_BloodPressure()

    public fun get_CyclingSpeedAndCadence() =
        ABI.IGattServiceUuidsStatics_Instance.get_CyclingSpeedAndCadence()

    public fun get_GenericAccess() = ABI.IGattServiceUuidsStatics_Instance.get_GenericAccess()

    public fun get_GenericAttribute() = ABI.IGattServiceUuidsStatics_Instance.get_GenericAttribute()

    public fun get_Glucose() = ABI.IGattServiceUuidsStatics_Instance.get_Glucose()

    public fun get_HealthThermometer() =
        ABI.IGattServiceUuidsStatics_Instance.get_HealthThermometer()

    public fun get_HeartRate() = ABI.IGattServiceUuidsStatics_Instance.get_HeartRate()

    public fun get_RunningSpeedAndCadence() =
        ABI.IGattServiceUuidsStatics_Instance.get_RunningSpeedAndCadence()

    public fun get_AlertNotification() =
        ABI.IGattServiceUuidsStatics2_Instance.get_AlertNotification()

    public fun get_CurrentTime() = ABI.IGattServiceUuidsStatics2_Instance.get_CurrentTime()

    public fun get_CyclingPower() = ABI.IGattServiceUuidsStatics2_Instance.get_CyclingPower()

    public fun get_DeviceInformation() =
        ABI.IGattServiceUuidsStatics2_Instance.get_DeviceInformation()

    public fun get_HumanInterfaceDevice() =
        ABI.IGattServiceUuidsStatics2_Instance.get_HumanInterfaceDevice()

    public fun get_ImmediateAlert() = ABI.IGattServiceUuidsStatics2_Instance.get_ImmediateAlert()

    public fun get_LinkLoss() = ABI.IGattServiceUuidsStatics2_Instance.get_LinkLoss()

    public fun get_LocationAndNavigation() =
        ABI.IGattServiceUuidsStatics2_Instance.get_LocationAndNavigation()

    public fun get_NextDstChange() = ABI.IGattServiceUuidsStatics2_Instance.get_NextDstChange()

    public fun get_PhoneAlertStatus() =
        ABI.IGattServiceUuidsStatics2_Instance.get_PhoneAlertStatus()

    public fun get_ReferenceTimeUpdate() =
        ABI.IGattServiceUuidsStatics2_Instance.get_ReferenceTimeUpdate()

    public fun get_ScanParameters() = ABI.IGattServiceUuidsStatics2_Instance.get_ScanParameters()

    public fun get_TxPower() = ABI.IGattServiceUuidsStatics2_Instance.get_TxPower()
  }
}
