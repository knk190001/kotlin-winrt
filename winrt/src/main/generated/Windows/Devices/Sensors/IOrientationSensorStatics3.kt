package Windows.Devices.Sensors

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

@ABIMarker(IOrientationSensorStatics3.ABI::class)
@Signature("{d82ce920-2777-40ff-9f59-d654b085f12f}")
@Guid("d82ce920277740ff9f59d654b085f12f")
@WinRTInterface("d82ce920277740ff9f59d654b085f12f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOrientationSensorStatics3.ByReference::class)
public interface IOrientationSensorStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(sensorReadingtype: SensorReadingType?): OrientationSensor?

  @InterfaceMethod(1)
  public fun GetDefault(sensorReadingType: SensorReadingType?,
      optimizationGoal: SensorOptimizationGoal?): OrientationSensor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOrientationSensorStatics3> {
    public override fun getValue() = ABI.makeIOrientationSensorStatics3(pointer.getPointer(0))

    public fun setValue(value: IOrientationSensorStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOrientationSensorStatics3 {
    public val __829350804_Ptr: Pointer?

    public val _829350804_VtblPtr: Pointer?
      get() = __829350804_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(sensorReadingtype: SensorReadingType?): OrientationSensor? {
      val fnPtr = _829350804_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<OrientationSensor>()
      val hr = fn.invokeHR(arrayOf(__829350804_Ptr, marshalToNative(sensorReadingtype), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<OrientationSensor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDefault(sensorReadingType: SensorReadingType?,
        optimizationGoal: SensorOptimizationGoal?): OrientationSensor? {
      val fnPtr = _829350804_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<OrientationSensor>()
      val hr = fn.invokeHR(arrayOf(__829350804_Ptr, marshalToNative(sensorReadingType),
          marshalToNative(optimizationGoal), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<OrientationSensor>(result.getValue())
      return resultValue
    }
  }

  public class IOrientationSensorStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __829350804_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOrientationSensorStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d82ce920277740ff9f59d654b085f12f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOrientationSensorStatics3(ptr: Pointer?): WithDefault =
        IOrientationSensorStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOrientationSensorStatics3 {
      val address = segment.toRawLongValue()
      return makeIOrientationSensorStatics3(Pointer(address))
    }

    public override fun toNative(obj: IOrientationSensorStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__829350804_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOrientationSensorStatics3):
        Array<IOrientationSensorStatics3?> = (elements as
        Array<IOrientationSensorStatics3?>).castToImpl<IOrientationSensorStatics3,IOrientationSensorStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOrientationSensorStatics3?> =
        arrayOfNulls<IOrientationSensorStatics3_Impl>(size) as Array<IOrientationSensorStatics3?>
  }
}
