package Windows.Devices.Sensors

import Windows.Foundation.DateTime
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

@ABIMarker(IOrientationSensorReading.ABI::class)
@Signature("{4756c993-6595-4897-bcc6-d537ee757564}")
@Guid("4756c99365954897bcc6d537ee757564")
@WinRTInterface("4756c99365954897bcc6d537ee757564")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOrientationSensorReading.ByReference::class)
public interface IOrientationSensorReading : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Timestamp(): DateTime?

  @InterfaceMethod(1)
  public fun get_RotationMatrix(): SensorRotationMatrix?

  @InterfaceMethod(2)
  public fun get_Quaternion(): SensorQuaternion?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOrientationSensorReading> {
    public override fun getValue() = ABI.makeIOrientationSensorReading(pointer.getPointer(0))

    public fun setValue(value: IOrientationSensorReading_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOrientationSensorReading {
    public val __928528530_Ptr: Pointer?

    public val _928528530_VtblPtr: Pointer?
      get() = __928528530_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _928528530_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__928528530_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RotationMatrix(): SensorRotationMatrix? {
      val fnPtr = _928528530_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SensorRotationMatrix>()
      val hr = fn.invokeHR(arrayOf(__928528530_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SensorRotationMatrix>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Quaternion(): SensorQuaternion? {
      val fnPtr = _928528530_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SensorQuaternion>()
      val hr = fn.invokeHR(arrayOf(__928528530_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SensorQuaternion>(result.getValue())
      return resultValue
    }
  }

  public class IOrientationSensorReading_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __928528530_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOrientationSensorReading, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4756c99365954897bcc6d537ee757564")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOrientationSensorReading(ptr: Pointer?): WithDefault =
        IOrientationSensorReading_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOrientationSensorReading {
      val address = segment.toRawLongValue()
      return makeIOrientationSensorReading(Pointer(address))
    }

    public override fun toNative(obj: IOrientationSensorReading): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__928528530_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOrientationSensorReading):
        Array<IOrientationSensorReading?> = (elements as
        Array<IOrientationSensorReading?>).castToImpl<IOrientationSensorReading,IOrientationSensorReading_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOrientationSensorReading?> =
        arrayOfNulls<IOrientationSensorReading_Impl>(size) as Array<IOrientationSensorReading?>
  }
}
