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

@ABIMarker(IGyrometer.ABI::class)
@Signature("{fdb9a9c4-84b1-4ca2-9763-9b589506c70c}")
@Guid("fdb9a9c484b14ca297639b589506c70c")
@WinRTInterface("fdb9a9c484b14ca297639b589506c70c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGyrometer.ByReference::class)
public interface IGyrometer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCurrentReading(): GyrometerReading?

  @InterfaceMethod(1)
  public fun get_MinimumReportInterval(): WinDef.UINT

  @InterfaceMethod(2)
  public fun put_ReportInterval(value: WinDef.UINT): Unit

  @InterfaceMethod(3)
  public fun get_ReportInterval(): WinDef.UINT

  @InterfaceMethod(4)
  public fun add_ReadingChanged(handler: TypedEventHandler<Gyrometer?,
      GyrometerReadingChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_ReadingChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGyrometer> {
    public override fun getValue() = ABI.makeIGyrometer(pointer.getPointer(0))

    public fun setValue(value: IGyrometer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGyrometer {
    public val __697437746_Ptr: Pointer?

    public val _697437746_VtblPtr: Pointer?
      get() = __697437746_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCurrentReading(): GyrometerReading? {
      val fnPtr = _697437746_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GyrometerReading>()
      val hr = fn.invokeHR(arrayOf(__697437746_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GyrometerReading>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MinimumReportInterval(): WinDef.UINT {
      val fnPtr = _697437746_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__697437746_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_ReportInterval(value: WinDef.UINT): Unit {
      val fnPtr = _697437746_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__697437746_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_ReportInterval(): WinDef.UINT {
      val fnPtr = _697437746_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__697437746_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun add_ReadingChanged(handler: TypedEventHandler<Gyrometer?,
        GyrometerReadingChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _697437746_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__697437746_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_ReadingChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _697437746_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__697437746_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGyrometer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __697437746_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGyrometer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fdb9a9c484b14ca297639b589506c70c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGyrometer(ptr: Pointer?): WithDefault = IGyrometer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGyrometer {
      val address = segment.toRawLongValue()
      return makeIGyrometer(Pointer(address))
    }

    public override fun toNative(obj: IGyrometer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__697437746_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGyrometer): Array<IGyrometer?> = (elements as
        Array<IGyrometer?>).castToImpl<IGyrometer,IGyrometer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGyrometer?> = arrayOfNulls<IGyrometer_Impl>(size)
        as Array<IGyrometer?>
  }
}
