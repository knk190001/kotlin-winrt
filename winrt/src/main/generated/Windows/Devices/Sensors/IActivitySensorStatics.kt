package Windows.Devices.Sensors

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.DateTime
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TimeSpan
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

@ABIMarker(IActivitySensorStatics.ABI::class)
@Signature("{a71e0e9d-ee8b-45d1-b25b-08cc0df92ab6}")
@Guid("a71e0e9dee8b45d1b25b08cc0df92ab6")
@WinRTInterface("a71e0e9dee8b45d1b25b08cc0df92ab6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IActivitySensorStatics.ByReference::class)
public interface IActivitySensorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefaultAsync(): IAsyncOperation<ActivitySensor?>?

  @InterfaceMethod(1)
  public fun GetDeviceSelector(): String?

  @InterfaceMethod(2)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<ActivitySensor?>?

  @InterfaceMethod(3)
  public fun GetSystemHistoryAsync(fromTime: DateTime?):
      IAsyncOperation<IVectorView<ActivitySensorReading?>?>?

  @InterfaceMethod(4)
  public fun GetSystemHistoryAsync(fromTime: DateTime?, duration: TimeSpan?):
      IAsyncOperation<IVectorView<ActivitySensorReading?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IActivitySensorStatics> {
    public override fun getValue() = ABI.makeIActivitySensorStatics(pointer.getPointer(0))

    public fun setValue(value: IActivitySensorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IActivitySensorStatics {
    public val __202163568_Ptr: Pointer?

    public val _202163568_VtblPtr: Pointer?
      get() = __202163568_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefaultAsync(): IAsyncOperation<ActivitySensor?>? {
      val fnPtr = _202163568_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ActivitySensor?>>()
      val hr = fn.invokeHR(arrayOf(__202163568_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ActivitySensor?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _202163568_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__202163568_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<ActivitySensor?>? {
      val fnPtr = _202163568_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ActivitySensor?>>()
      val hr = fn.invokeHR(arrayOf(__202163568_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ActivitySensor?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetSystemHistoryAsync(fromTime: DateTime?):
        IAsyncOperation<IVectorView<ActivitySensorReading?>?>? {
      val fnPtr = _202163568_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<ActivitySensorReading?>?>>()
      val hr = fn.invokeHR(arrayOf(__202163568_Ptr, marshalToNative(fromTime), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<ActivitySensorReading?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetSystemHistoryAsync(fromTime: DateTime?, duration: TimeSpan?):
        IAsyncOperation<IVectorView<ActivitySensorReading?>?>? {
      val fnPtr = _202163568_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<ActivitySensorReading?>?>>()
      val hr = fn.invokeHR(arrayOf(__202163568_Ptr, marshalToNative(fromTime),
          marshalToNative(duration), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<ActivitySensorReading?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IActivitySensorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __202163568_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IActivitySensorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a71e0e9dee8b45d1b25b08cc0df92ab6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIActivitySensorStatics(ptr: Pointer?): WithDefault =
        IActivitySensorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IActivitySensorStatics {
      val address = segment.toRawLongValue()
      return makeIActivitySensorStatics(Pointer(address))
    }

    public override fun toNative(obj: IActivitySensorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__202163568_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IActivitySensorStatics): Array<IActivitySensorStatics?> =
        (elements as
        Array<IActivitySensorStatics?>).castToImpl<IActivitySensorStatics,IActivitySensorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IActivitySensorStatics?> =
        arrayOfNulls<IActivitySensorStatics_Impl>(size) as Array<IActivitySensorStatics?>
  }
}
