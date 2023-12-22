package Windows.Devices.Bluetooth.GenericAttributeProfile

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGattCharacteristicUuidsStatics2.ABI::class)
@Signature("{1855b425-d46e-4a2c-9c3f-ed6dea29e7be}")
@Guid("1855b425d46e4a2c9c3fed6dea29e7be")
@WinRTInterface("1855b425d46e4a2c9c3fed6dea29e7be")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattCharacteristicUuidsStatics2.ByReference::class)
public interface IGattCharacteristicUuidsStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AlertCategoryId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_AlertCategoryIdBitMask(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(2)
  public fun get_AlertLevel(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(3)
  public fun get_AlertNotificationControlPoint(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(4)
  public fun get_AlertStatus(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(5)
  public fun get_GapAppearance(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(6)
  public fun get_BootKeyboardInputReport(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(7)
  public fun get_BootKeyboardOutputReport(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(8)
  public fun get_BootMouseInputReport(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(9)
  public fun get_CurrentTime(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(10)
  public fun get_CyclingPowerControlPoint(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(11)
  public fun get_CyclingPowerFeature(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(12)
  public fun get_CyclingPowerMeasurement(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(13)
  public fun get_CyclingPowerVector(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(14)
  public fun get_DateTime(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(15)
  public fun get_DayDateTime(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(16)
  public fun get_DayOfWeek(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(17)
  public fun get_GapDeviceName(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(18)
  public fun get_DstOffset(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(19)
  public fun get_ExactTime256(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(20)
  public fun get_FirmwareRevisionString(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(21)
  public fun get_HardwareRevisionString(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(22)
  public fun get_HidControlPoint(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(23)
  public fun get_HidInformation(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(24)
  public fun get_Ieee1107320601RegulatoryCertificationDataList():
      com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(25)
  public fun get_LnControlPoint(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(26)
  public fun get_LnFeature(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(27)
  public fun get_LocalTimeInformation(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(28)
  public fun get_LocationAndSpeed(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(29)
  public fun get_ManufacturerNameString(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(30)
  public fun get_ModelNumberString(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(31)
  public fun get_Navigation(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(32)
  public fun get_NewAlert(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(33)
  public fun get_GapPeripheralPreferredConnectionParameters(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(34)
  public fun get_GapPeripheralPrivacyFlag(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(35)
  public fun get_PnpId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(36)
  public fun get_PositionQuality(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(37)
  public fun get_ProtocolMode(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(38)
  public fun get_GapReconnectionAddress(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(39)
  public fun get_ReferenceTimeInformation(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(40)
  public fun get_Report(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(41)
  public fun get_ReportMap(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(42)
  public fun get_RingerControlPoint(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(43)
  public fun get_RingerSetting(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(44)
  public fun get_ScanIntervalWindow(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(45)
  public fun get_ScanRefresh(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(46)
  public fun get_SerialNumberString(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(47)
  public fun get_GattServiceChanged(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(48)
  public fun get_SoftwareRevisionString(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(49)
  public fun get_SupportedNewAlertCategory(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(50)
  public fun get_SupportUnreadAlertCategory(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(51)
  public fun get_SystemId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(52)
  public fun get_TimeAccuracy(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(53)
  public fun get_TimeSource(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(54)
  public fun get_TimeUpdateControlPoint(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(55)
  public fun get_TimeUpdateState(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(56)
  public fun get_TimeWithDst(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(57)
  public fun get_TimeZone(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(58)
  public fun get_TxPowerLevel(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(59)
  public fun get_UnreadAlertStatus(): com.sun.jna.platform.win32.Guid.GUID?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattCharacteristicUuidsStatics2> {
    public override fun getValue() = ABI.makeIGattCharacteristicUuidsStatics2(pointer.getPointer(0))

    public fun setValue(value: IGattCharacteristicUuidsStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattCharacteristicUuidsStatics2 {
    public val __1547187663_Ptr: Pointer?

    public val _1547187663_VtblPtr: Pointer?
      get() = __1547187663_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AlertCategoryId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AlertCategoryIdBitMask(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_AlertLevel(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_AlertNotificationControlPoint(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_AlertStatus(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_GapAppearance(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_BootKeyboardInputReport(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_BootKeyboardOutputReport(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_BootMouseInputReport(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_CurrentTime(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_CyclingPowerControlPoint(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_CyclingPowerFeature(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_CyclingPowerMeasurement(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_CyclingPowerVector(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_DateTime(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_DayDateTime(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_DayOfWeek(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_GapDeviceName(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_DstOffset(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun get_ExactTime256(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun get_FirmwareRevisionString(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun get_HardwareRevisionString(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun get_HidControlPoint(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun get_HidInformation(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun get_Ieee1107320601RegulatoryCertificationDataList():
        com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun get_LnControlPoint(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun get_LnFeature(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun get_LocalTimeInformation(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun get_LocationAndSpeed(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun get_ManufacturerNameString(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun get_ModelNumberString(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun get_Navigation(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun get_NewAlert(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun get_GapPeripheralPreferredConnectionParameters():
        com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(34)
    public override fun get_GapPeripheralPrivacyFlag(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun get_PnpId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(36)
    public override fun get_PositionQuality(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun get_ProtocolMode(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(38)
    public override fun get_GapReconnectionAddress(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun get_ReferenceTimeInformation(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(40)
    public override fun get_Report(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(41)
    public override fun get_ReportMap(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(42)
    public override fun get_RingerControlPoint(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(43)
    public override fun get_RingerSetting(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(44)
    public override fun get_ScanIntervalWindow(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(45)
    public override fun get_ScanRefresh(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(46)
    public override fun get_SerialNumberString(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(47)
    public override fun get_GattServiceChanged(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(48)
    public override fun get_SoftwareRevisionString(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(49)
    public override fun get_SupportedNewAlertCategory(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(50)
    public override fun get_SupportUnreadAlertCategory(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(51)
    public override fun get_SystemId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(52)
    public override fun get_TimeAccuracy(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(53)
    public override fun get_TimeSource(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(54)
    public override fun get_TimeUpdateControlPoint(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(60L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(55)
    public override fun get_TimeUpdateState(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(61L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(56)
    public override fun get_TimeWithDst(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(62L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(57)
    public override fun get_TimeZone(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(63L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(58)
    public override fun get_TxPowerLevel(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(64L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(59)
    public override fun get_UnreadAlertStatus(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1547187663_VtblPtr!!.getPointer(65L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1547187663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }
  }

  public class IGattCharacteristicUuidsStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1547187663_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattCharacteristicUuidsStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1855b425d46e4a2c9c3fed6dea29e7be")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattCharacteristicUuidsStatics2(ptr: Pointer?): WithDefault =
        IGattCharacteristicUuidsStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattCharacteristicUuidsStatics2 {
      val address = segment.toRawLongValue()
      return makeIGattCharacteristicUuidsStatics2(Pointer(address))
    }

    public override fun toNative(obj: IGattCharacteristicUuidsStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1547187663_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattCharacteristicUuidsStatics2):
        Array<IGattCharacteristicUuidsStatics2?> = (elements as
        Array<IGattCharacteristicUuidsStatics2?>).castToImpl<IGattCharacteristicUuidsStatics2,IGattCharacteristicUuidsStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattCharacteristicUuidsStatics2?> =
        arrayOfNulls<IGattCharacteristicUuidsStatics2_Impl>(size) as
        Array<IGattCharacteristicUuidsStatics2?>
  }
}
