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

@ABIMarker(GattCharacteristicUuids.ABI::class)
@WinRTByReference(brClass = GattCharacteristicUuids.ByReference::class)
public class GattCharacteristicUuids(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattCharacteristicUuids> {
    public override fun getValue() = GattCharacteristicUuids(pointer.getPointer(0))

    public fun setValue(value: GattCharacteristicUuids): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattCharacteristicUuids, MemoryAddress> {
    public val IGattCharacteristicUuidsStatics2_Instance: IGattCharacteristicUuidsStatics2 by lazy {
      createIGattCharacteristicUuidsStatics2()
    }


    public val IGattCharacteristicUuidsStatics_Instance: IGattCharacteristicUuidsStatics by lazy {
      createIGattCharacteristicUuidsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGattCharacteristicUuidsStatics2(): IGattCharacteristicUuidsStatics2 {
      val refiid = Guid.REFIID(IGattCharacteristicUuidsStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids".toHandle(),refiid,interfacePtr)
      val result =
          IGattCharacteristicUuidsStatics2.ABI.makeIGattCharacteristicUuidsStatics2(interfacePtr.value)
      return result
    }

    public fun createIGattCharacteristicUuidsStatics(): IGattCharacteristicUuidsStatics {
      val refiid = Guid.REFIID(IGattCharacteristicUuidsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicUuids".toHandle(),refiid,interfacePtr)
      val result =
          IGattCharacteristicUuidsStatics.ABI.makeIGattCharacteristicUuidsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GattCharacteristicUuids {
      val address = segment.toRawLongValue()
      return GattCharacteristicUuids(Pointer(address))
    }

    public override fun toNative(obj: GattCharacteristicUuids): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_AlertCategoryId() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_AlertCategoryId()

    public fun get_AlertCategoryIdBitMask() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_AlertCategoryIdBitMask()

    public fun get_AlertLevel() = ABI.IGattCharacteristicUuidsStatics2_Instance.get_AlertLevel()

    public fun get_AlertNotificationControlPoint() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_AlertNotificationControlPoint()

    public fun get_AlertStatus() = ABI.IGattCharacteristicUuidsStatics2_Instance.get_AlertStatus()

    public fun get_GapAppearance() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_GapAppearance()

    public fun get_BootKeyboardInputReport() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_BootKeyboardInputReport()

    public fun get_BootKeyboardOutputReport() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_BootKeyboardOutputReport()

    public fun get_BootMouseInputReport() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_BootMouseInputReport()

    public fun get_CurrentTime() = ABI.IGattCharacteristicUuidsStatics2_Instance.get_CurrentTime()

    public fun get_CyclingPowerControlPoint() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_CyclingPowerControlPoint()

    public fun get_CyclingPowerFeature() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_CyclingPowerFeature()

    public fun get_CyclingPowerMeasurement() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_CyclingPowerMeasurement()

    public fun get_CyclingPowerVector() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_CyclingPowerVector()

    public fun get_DateTime() = ABI.IGattCharacteristicUuidsStatics2_Instance.get_DateTime()

    public fun get_DayDateTime() = ABI.IGattCharacteristicUuidsStatics2_Instance.get_DayDateTime()

    public fun get_DayOfWeek() = ABI.IGattCharacteristicUuidsStatics2_Instance.get_DayOfWeek()

    public fun get_GapDeviceName() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_GapDeviceName()

    public fun get_DstOffset() = ABI.IGattCharacteristicUuidsStatics2_Instance.get_DstOffset()

    public fun get_ExactTime256() = ABI.IGattCharacteristicUuidsStatics2_Instance.get_ExactTime256()

    public fun get_FirmwareRevisionString() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_FirmwareRevisionString()

    public fun get_HardwareRevisionString() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_HardwareRevisionString()

    public fun get_HidControlPoint() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_HidControlPoint()

    public fun get_HidInformation() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_HidInformation()

    public fun get_Ieee1107320601RegulatoryCertificationDataList() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_Ieee1107320601RegulatoryCertificationDataList()

    public fun get_LnControlPoint() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_LnControlPoint()

    public fun get_LnFeature() = ABI.IGattCharacteristicUuidsStatics2_Instance.get_LnFeature()

    public fun get_LocalTimeInformation() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_LocalTimeInformation()

    public fun get_LocationAndSpeed() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_LocationAndSpeed()

    public fun get_ManufacturerNameString() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_ManufacturerNameString()

    public fun get_ModelNumberString() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_ModelNumberString()

    public fun get_Navigation() = ABI.IGattCharacteristicUuidsStatics2_Instance.get_Navigation()

    public fun get_NewAlert() = ABI.IGattCharacteristicUuidsStatics2_Instance.get_NewAlert()

    public fun get_GapPeripheralPreferredConnectionParameters() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_GapPeripheralPreferredConnectionParameters()

    public fun get_GapPeripheralPrivacyFlag() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_GapPeripheralPrivacyFlag()

    public fun get_PnpId() = ABI.IGattCharacteristicUuidsStatics2_Instance.get_PnpId()

    public fun get_PositionQuality() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_PositionQuality()

    public fun get_ProtocolMode() = ABI.IGattCharacteristicUuidsStatics2_Instance.get_ProtocolMode()

    public fun get_GapReconnectionAddress() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_GapReconnectionAddress()

    public fun get_ReferenceTimeInformation() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_ReferenceTimeInformation()

    public fun get_Report() = ABI.IGattCharacteristicUuidsStatics2_Instance.get_Report()

    public fun get_ReportMap() = ABI.IGattCharacteristicUuidsStatics2_Instance.get_ReportMap()

    public fun get_RingerControlPoint() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_RingerControlPoint()

    public fun get_RingerSetting() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_RingerSetting()

    public fun get_ScanIntervalWindow() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_ScanIntervalWindow()

    public fun get_ScanRefresh() = ABI.IGattCharacteristicUuidsStatics2_Instance.get_ScanRefresh()

    public fun get_SerialNumberString() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_SerialNumberString()

    public fun get_GattServiceChanged() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_GattServiceChanged()

    public fun get_SoftwareRevisionString() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_SoftwareRevisionString()

    public fun get_SupportedNewAlertCategory() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_SupportedNewAlertCategory()

    public fun get_SupportUnreadAlertCategory() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_SupportUnreadAlertCategory()

    public fun get_SystemId() = ABI.IGattCharacteristicUuidsStatics2_Instance.get_SystemId()

    public fun get_TimeAccuracy() = ABI.IGattCharacteristicUuidsStatics2_Instance.get_TimeAccuracy()

    public fun get_TimeSource() = ABI.IGattCharacteristicUuidsStatics2_Instance.get_TimeSource()

    public fun get_TimeUpdateControlPoint() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_TimeUpdateControlPoint()

    public fun get_TimeUpdateState() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_TimeUpdateState()

    public fun get_TimeWithDst() = ABI.IGattCharacteristicUuidsStatics2_Instance.get_TimeWithDst()

    public fun get_TimeZone() = ABI.IGattCharacteristicUuidsStatics2_Instance.get_TimeZone()

    public fun get_TxPowerLevel() = ABI.IGattCharacteristicUuidsStatics2_Instance.get_TxPowerLevel()

    public fun get_UnreadAlertStatus() =
        ABI.IGattCharacteristicUuidsStatics2_Instance.get_UnreadAlertStatus()

    public fun get_BatteryLevel() = ABI.IGattCharacteristicUuidsStatics_Instance.get_BatteryLevel()

    public fun get_BloodPressureFeature() =
        ABI.IGattCharacteristicUuidsStatics_Instance.get_BloodPressureFeature()

    public fun get_BloodPressureMeasurement() =
        ABI.IGattCharacteristicUuidsStatics_Instance.get_BloodPressureMeasurement()

    public fun get_BodySensorLocation() =
        ABI.IGattCharacteristicUuidsStatics_Instance.get_BodySensorLocation()

    public fun get_CscFeature() = ABI.IGattCharacteristicUuidsStatics_Instance.get_CscFeature()

    public fun get_CscMeasurement() =
        ABI.IGattCharacteristicUuidsStatics_Instance.get_CscMeasurement()

    public fun get_GlucoseFeature() =
        ABI.IGattCharacteristicUuidsStatics_Instance.get_GlucoseFeature()

    public fun get_GlucoseMeasurement() =
        ABI.IGattCharacteristicUuidsStatics_Instance.get_GlucoseMeasurement()

    public fun get_GlucoseMeasurementContext() =
        ABI.IGattCharacteristicUuidsStatics_Instance.get_GlucoseMeasurementContext()

    public fun get_HeartRateControlPoint() =
        ABI.IGattCharacteristicUuidsStatics_Instance.get_HeartRateControlPoint()

    public fun get_HeartRateMeasurement() =
        ABI.IGattCharacteristicUuidsStatics_Instance.get_HeartRateMeasurement()

    public fun get_IntermediateCuffPressure() =
        ABI.IGattCharacteristicUuidsStatics_Instance.get_IntermediateCuffPressure()

    public fun get_IntermediateTemperature() =
        ABI.IGattCharacteristicUuidsStatics_Instance.get_IntermediateTemperature()

    public fun get_MeasurementInterval() =
        ABI.IGattCharacteristicUuidsStatics_Instance.get_MeasurementInterval()

    public fun get_RecordAccessControlPoint() =
        ABI.IGattCharacteristicUuidsStatics_Instance.get_RecordAccessControlPoint()

    public fun get_RscFeature() = ABI.IGattCharacteristicUuidsStatics_Instance.get_RscFeature()

    public fun get_RscMeasurement() =
        ABI.IGattCharacteristicUuidsStatics_Instance.get_RscMeasurement()

    public fun get_SCControlPoint() =
        ABI.IGattCharacteristicUuidsStatics_Instance.get_SCControlPoint()

    public fun get_SensorLocation() =
        ABI.IGattCharacteristicUuidsStatics_Instance.get_SensorLocation()

    public fun get_TemperatureMeasurement() =
        ABI.IGattCharacteristicUuidsStatics_Instance.get_TemperatureMeasurement()

    public fun get_TemperatureType() =
        ABI.IGattCharacteristicUuidsStatics_Instance.get_TemperatureType()
  }
}
