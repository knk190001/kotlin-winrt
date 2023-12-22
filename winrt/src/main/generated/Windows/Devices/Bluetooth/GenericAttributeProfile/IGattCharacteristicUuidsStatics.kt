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

@ABIMarker(IGattCharacteristicUuidsStatics.ABI::class)
@Signature("{58fa4586-b1de-470c-b7de-0d11ff44f4b7}")
@Guid("58fa4586b1de470cb7de0d11ff44f4b7")
@WinRTInterface("58fa4586b1de470cb7de0d11ff44f4b7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattCharacteristicUuidsStatics.ByReference::class)
public interface IGattCharacteristicUuidsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BatteryLevel(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_BloodPressureFeature(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(2)
  public fun get_BloodPressureMeasurement(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(3)
  public fun get_BodySensorLocation(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(4)
  public fun get_CscFeature(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(5)
  public fun get_CscMeasurement(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(6)
  public fun get_GlucoseFeature(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(7)
  public fun get_GlucoseMeasurement(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(8)
  public fun get_GlucoseMeasurementContext(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(9)
  public fun get_HeartRateControlPoint(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(10)
  public fun get_HeartRateMeasurement(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(11)
  public fun get_IntermediateCuffPressure(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(12)
  public fun get_IntermediateTemperature(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(13)
  public fun get_MeasurementInterval(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(14)
  public fun get_RecordAccessControlPoint(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(15)
  public fun get_RscFeature(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(16)
  public fun get_RscMeasurement(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(17)
  public fun get_SCControlPoint(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(18)
  public fun get_SensorLocation(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(19)
  public fun get_TemperatureMeasurement(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(20)
  public fun get_TemperatureType(): com.sun.jna.platform.win32.Guid.GUID?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattCharacteristicUuidsStatics> {
    public override fun getValue() = ABI.makeIGattCharacteristicUuidsStatics(pointer.getPointer(0))

    public fun setValue(value: IGattCharacteristicUuidsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattCharacteristicUuidsStatics {
    public val __1296835267_Ptr: Pointer?

    public val _1296835267_VtblPtr: Pointer?
      get() = __1296835267_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BatteryLevel(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1296835267_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1296835267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_BloodPressureFeature(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1296835267_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1296835267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_BloodPressureMeasurement(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1296835267_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1296835267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_BodySensorLocation(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1296835267_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1296835267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_CscFeature(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1296835267_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1296835267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_CscMeasurement(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1296835267_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1296835267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_GlucoseFeature(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1296835267_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1296835267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_GlucoseMeasurement(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1296835267_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1296835267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_GlucoseMeasurementContext(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1296835267_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1296835267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_HeartRateControlPoint(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1296835267_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1296835267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_HeartRateMeasurement(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1296835267_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1296835267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_IntermediateCuffPressure(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1296835267_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1296835267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_IntermediateTemperature(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1296835267_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1296835267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_MeasurementInterval(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1296835267_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1296835267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_RecordAccessControlPoint(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1296835267_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1296835267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_RscFeature(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1296835267_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1296835267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_RscMeasurement(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1296835267_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1296835267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_SCControlPoint(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1296835267_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1296835267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_SensorLocation(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1296835267_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1296835267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun get_TemperatureMeasurement(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1296835267_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1296835267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun get_TemperatureType(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1296835267_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1296835267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }
  }

  public class IGattCharacteristicUuidsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1296835267_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattCharacteristicUuidsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("58fa4586b1de470cb7de0d11ff44f4b7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattCharacteristicUuidsStatics(ptr: Pointer?): WithDefault =
        IGattCharacteristicUuidsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattCharacteristicUuidsStatics {
      val address = segment.toRawLongValue()
      return makeIGattCharacteristicUuidsStatics(Pointer(address))
    }

    public override fun toNative(obj: IGattCharacteristicUuidsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1296835267_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattCharacteristicUuidsStatics):
        Array<IGattCharacteristicUuidsStatics?> = (elements as
        Array<IGattCharacteristicUuidsStatics?>).castToImpl<IGattCharacteristicUuidsStatics,IGattCharacteristicUuidsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattCharacteristicUuidsStatics?> =
        arrayOfNulls<IGattCharacteristicUuidsStatics_Impl>(size) as
        Array<IGattCharacteristicUuidsStatics?>
  }
}
