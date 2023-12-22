package Windows.Devices.Sensors

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

@ABIMarker(IHingeAngleSensor.ABI::class)
@Signature("{e9d3be02-bfdf-437f-8c29-88c77393d309}")
@Guid("e9d3be02bfdf437f8c2988c77393d309")
@WinRTInterface("e9d3be02bfdf437f8c2988c77393d309")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHingeAngleSensor.ByReference::class)
public interface IHingeAngleSensor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCurrentReadingAsync(): IAsyncOperation<HingeAngleReading?>?

  @InterfaceMethod(1)
  public fun get_DeviceId(): String?

  @InterfaceMethod(2)
  public fun get_MinReportThresholdInDegrees(): Double

  @InterfaceMethod(3)
  public fun get_ReportThresholdInDegrees(): Double

  @InterfaceMethod(4)
  public fun put_ReportThresholdInDegrees(value: Double): Unit

  @InterfaceMethod(5)
  public fun add_ReadingChanged(handler: TypedEventHandler<HingeAngleSensor?,
      HingeAngleSensorReadingChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_ReadingChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHingeAngleSensor> {
    public override fun getValue() = ABI.makeIHingeAngleSensor(pointer.getPointer(0))

    public fun setValue(value: IHingeAngleSensor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHingeAngleSensor {
    public val __1547934162_Ptr: Pointer?

    public val _1547934162_VtblPtr: Pointer?
      get() = __1547934162_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCurrentReadingAsync(): IAsyncOperation<HingeAngleReading?>? {
      val fnPtr = _1547934162_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<HingeAngleReading?>>()
      val hr = fn.invokeHR(arrayOf(__1547934162_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<HingeAngleReading?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1547934162_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1547934162_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MinReportThresholdInDegrees(): Double {
      val fnPtr = _1547934162_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1547934162_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_ReportThresholdInDegrees(): Double {
      val fnPtr = _1547934162_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1547934162_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_ReportThresholdInDegrees(value: Double): Unit {
      val fnPtr = _1547934162_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1547934162_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_ReadingChanged(handler: TypedEventHandler<HingeAngleSensor?,
        HingeAngleSensorReadingChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1547934162_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1547934162_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_ReadingChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1547934162_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1547934162_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHingeAngleSensor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1547934162_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHingeAngleSensor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e9d3be02bfdf437f8c2988c77393d309")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHingeAngleSensor(ptr: Pointer?): WithDefault = IHingeAngleSensor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHingeAngleSensor {
      val address = segment.toRawLongValue()
      return makeIHingeAngleSensor(Pointer(address))
    }

    public override fun toNative(obj: IHingeAngleSensor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1547934162_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHingeAngleSensor): Array<IHingeAngleSensor?> = (elements
        as Array<IHingeAngleSensor?>).castToImpl<IHingeAngleSensor,IHingeAngleSensor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHingeAngleSensor?> =
        arrayOfNulls<IHingeAngleSensor_Impl>(size) as Array<IHingeAngleSensor?>
  }
}
