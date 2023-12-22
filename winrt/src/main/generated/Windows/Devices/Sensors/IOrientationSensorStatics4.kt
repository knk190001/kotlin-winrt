package Windows.Devices.Sensors

import Windows.Foundation.IAsyncOperation
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IOrientationSensorStatics4.ABI::class)
@Signature("{a67feb55-2c85-4b28-a0fe-58c4b20495f5}")
@Guid("a67feb552c854b28a0fe58c4b20495f5")
@WinRTInterface("a67feb552c854b28a0fe58c4b20495f5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOrientationSensorStatics4.ByReference::class)
public interface IOrientationSensorStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelector(readingType: SensorReadingType?): String?

  @InterfaceMethod(1)
  public fun GetDeviceSelector(readingType: SensorReadingType?,
      optimizationGoal: SensorOptimizationGoal?): String?

  @InterfaceMethod(2)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<OrientationSensor?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOrientationSensorStatics4> {
    public override fun getValue() = ABI.makeIOrientationSensorStatics4(pointer.getPointer(0))

    public fun setValue(value: IOrientationSensorStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOrientationSensorStatics4 {
    public val __829350803_Ptr: Pointer?

    public val _829350803_VtblPtr: Pointer?
      get() = __829350803_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelector(readingType: SensorReadingType?): String? {
      val fnPtr = _829350803_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__829350803_Ptr, marshalToNative(readingType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeviceSelector(readingType: SensorReadingType?,
        optimizationGoal: SensorOptimizationGoal?): String? {
      val fnPtr = _829350803_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__829350803_Ptr, marshalToNative(readingType),
          marshalToNative(optimizationGoal), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<OrientationSensor?>? {
      val fnPtr = _829350803_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<OrientationSensor?>>()
      val hr = fn.invokeHR(arrayOf(__829350803_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<OrientationSensor?>>(result.getValue())
      return resultValue
    }
  }

  public class IOrientationSensorStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __829350803_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOrientationSensorStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a67feb552c854b28a0fe58c4b20495f5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOrientationSensorStatics4(ptr: Pointer?): WithDefault =
        IOrientationSensorStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOrientationSensorStatics4 {
      val address = segment.toRawLongValue()
      return makeIOrientationSensorStatics4(Pointer(address))
    }

    public override fun toNative(obj: IOrientationSensorStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__829350803_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOrientationSensorStatics4):
        Array<IOrientationSensorStatics4?> = (elements as
        Array<IOrientationSensorStatics4?>).castToImpl<IOrientationSensorStatics4,IOrientationSensorStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOrientationSensorStatics4?> =
        arrayOfNulls<IOrientationSensorStatics4_Impl>(size) as Array<IOrientationSensorStatics4?>
  }
}
