package Windows.Devices.Sensors

import Windows.Foundation.EventRegistrationToken
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAccelerometer.ABI::class)
@Signature("{df184548-2711-4da7-8098-4b82205d3c7d}")
@Guid("df18454827114da780984b82205d3c7d")
@WinRTInterface("df18454827114da780984b82205d3c7d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAccelerometer.ByReference::class)
public interface IAccelerometer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCurrentReading(): AccelerometerReading?

  @InterfaceMethod(1)
  public fun get_MinimumReportInterval(): WinDef.UINT

  @InterfaceMethod(2)
  public fun put_ReportInterval(value: WinDef.UINT): Unit

  @InterfaceMethod(3)
  public fun get_ReportInterval(): WinDef.UINT

  @InterfaceMethod(4)
  public fun add_ReadingChanged(handler: TypedEventHandler<Accelerometer?,
      AccelerometerReadingChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_ReadingChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_Shaken(handler: TypedEventHandler<Accelerometer?, AccelerometerShakenEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_Shaken(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAccelerometer>
      {
    public override fun getValue() = ABI.makeIAccelerometer(pointer.getPointer(0))

    public fun setValue(value: IAccelerometer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAccelerometer {
    public val __1246634525_Ptr: Pointer?

    public val _1246634525_VtblPtr: Pointer?
      get() = __1246634525_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCurrentReading(): AccelerometerReading? {
      val fnPtr = _1246634525_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AccelerometerReading>()
      val hr = fn.invokeHR(arrayOf(__1246634525_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AccelerometerReading>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MinimumReportInterval(): WinDef.UINT {
      val fnPtr = _1246634525_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1246634525_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_ReportInterval(value: WinDef.UINT): Unit {
      val fnPtr = _1246634525_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1246634525_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_ReportInterval(): WinDef.UINT {
      val fnPtr = _1246634525_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1246634525_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun add_ReadingChanged(handler: TypedEventHandler<Accelerometer?,
        AccelerometerReadingChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1246634525_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1246634525_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_ReadingChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1246634525_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1246634525_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_Shaken(handler: TypedEventHandler<Accelerometer?,
        AccelerometerShakenEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1246634525_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1246634525_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_Shaken(token: EventRegistrationToken?): Unit {
      val fnPtr = _1246634525_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1246634525_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAccelerometer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1246634525_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAccelerometer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("df18454827114da780984b82205d3c7d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAccelerometer(ptr: Pointer?): WithDefault = IAccelerometer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAccelerometer {
      val address = segment.toRawLongValue()
      return makeIAccelerometer(Pointer(address))
    }

    public override fun toNative(obj: IAccelerometer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1246634525_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAccelerometer): Array<IAccelerometer?> = (elements as
        Array<IAccelerometer?>).castToImpl<IAccelerometer,IAccelerometer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAccelerometer?> =
        arrayOfNulls<IAccelerometer_Impl>(size) as Array<IAccelerometer?>
  }
}
