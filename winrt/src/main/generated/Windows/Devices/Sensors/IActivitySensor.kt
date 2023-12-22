package Windows.Devices.Sensors

import Windows.Foundation.Collections.IVector
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IActivitySensor.ABI::class)
@Signature("{cd7a630c-fb5f-48eb-b09b-a2708d1c61ef}")
@Guid("cd7a630cfb5f48ebb09ba2708d1c61ef")
@WinRTInterface("cd7a630cfb5f48ebb09ba2708d1c61ef")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IActivitySensor.ByReference::class)
public interface IActivitySensor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCurrentReadingAsync(): IAsyncOperation<ActivitySensorReading?>?

  @InterfaceMethod(1)
  public fun get_SubscribedActivities(): IVector<ActivityType?>?

  @InterfaceMethod(2)
  public fun get_PowerInMilliwatts(): Double

  @InterfaceMethod(3)
  public fun get_DeviceId(): String?

  @InterfaceMethod(4)
  public fun get_SupportedActivities(): IVectorView<ActivityType?>?

  @InterfaceMethod(5)
  public fun get_MinimumReportInterval(): WinDef.UINT

  @InterfaceMethod(6)
  public fun add_ReadingChanged(handler: TypedEventHandler<ActivitySensor?,
      ActivitySensorReadingChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_ReadingChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IActivitySensor> {
    public override fun getValue() = ABI.makeIActivitySensor(pointer.getPointer(0))

    public fun setValue(value: IActivitySensor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IActivitySensor {
    public val __1731784853_Ptr: Pointer?

    public val _1731784853_VtblPtr: Pointer?
      get() = __1731784853_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCurrentReadingAsync(): IAsyncOperation<ActivitySensorReading?>? {
      val fnPtr = _1731784853_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ActivitySensorReading?>>()
      val hr = fn.invokeHR(arrayOf(__1731784853_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ActivitySensorReading?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SubscribedActivities(): IVector<ActivityType?>? {
      val fnPtr = _1731784853_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<ActivityType?>>()
      val hr = fn.invokeHR(arrayOf(__1731784853_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<ActivityType?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PowerInMilliwatts(): Double {
      val fnPtr = _1731784853_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1731784853_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1731784853_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1731784853_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_SupportedActivities(): IVectorView<ActivityType?>? {
      val fnPtr = _1731784853_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ActivityType?>>()
      val hr = fn.invokeHR(arrayOf(__1731784853_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ActivityType?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_MinimumReportInterval(): WinDef.UINT {
      val fnPtr = _1731784853_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1731784853_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun add_ReadingChanged(handler: TypedEventHandler<ActivitySensor?,
        ActivitySensorReadingChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1731784853_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1731784853_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_ReadingChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1731784853_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1731784853_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IActivitySensor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1731784853_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IActivitySensor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cd7a630cfb5f48ebb09ba2708d1c61ef")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIActivitySensor(ptr: Pointer?): WithDefault = IActivitySensor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IActivitySensor {
      val address = segment.toRawLongValue()
      return makeIActivitySensor(Pointer(address))
    }

    public override fun toNative(obj: IActivitySensor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1731784853_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IActivitySensor): Array<IActivitySensor?> = (elements as
        Array<IActivitySensor?>).castToImpl<IActivitySensor,IActivitySensor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IActivitySensor?> =
        arrayOfNulls<IActivitySensor_Impl>(size) as Array<IActivitySensor?>
  }
}
