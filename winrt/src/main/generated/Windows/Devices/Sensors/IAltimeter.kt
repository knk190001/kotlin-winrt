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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAltimeter.ABI::class)
@Signature("{72f057fd-8f04-49f1-b4a7-f4e363b701a2}")
@Guid("72f057fd8f0449f1b4a7f4e363b701a2")
@WinRTInterface("72f057fd8f0449f1b4a7f4e363b701a2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAltimeter.ByReference::class)
public interface IAltimeter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCurrentReading(): AltimeterReading?

  @InterfaceMethod(1)
  public fun get_DeviceId(): String?

  @InterfaceMethod(2)
  public fun get_MinimumReportInterval(): WinDef.UINT

  @InterfaceMethod(3)
  public fun put_ReportInterval(value: WinDef.UINT): Unit

  @InterfaceMethod(4)
  public fun get_ReportInterval(): WinDef.UINT

  @InterfaceMethod(5)
  public fun add_ReadingChanged(handler: TypedEventHandler<Altimeter?,
      AltimeterReadingChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_ReadingChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAltimeter> {
    public override fun getValue() = ABI.makeIAltimeter(pointer.getPointer(0))

    public fun setValue(value: IAltimeter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAltimeter {
    public val __1978889021_Ptr: Pointer?

    public val _1978889021_VtblPtr: Pointer?
      get() = __1978889021_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCurrentReading(): AltimeterReading? {
      val fnPtr = _1978889021_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AltimeterReading>()
      val hr = fn.invokeHR(arrayOf(__1978889021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AltimeterReading>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1978889021_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1978889021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MinimumReportInterval(): WinDef.UINT {
      val fnPtr = _1978889021_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1978889021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_ReportInterval(value: WinDef.UINT): Unit {
      val fnPtr = _1978889021_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1978889021_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ReportInterval(): WinDef.UINT {
      val fnPtr = _1978889021_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1978889021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun add_ReadingChanged(handler: TypedEventHandler<Altimeter?,
        AltimeterReadingChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1978889021_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1978889021_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_ReadingChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1978889021_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1978889021_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAltimeter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1978889021_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAltimeter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("72f057fd8f0449f1b4a7f4e363b701a2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAltimeter(ptr: Pointer?): WithDefault = IAltimeter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAltimeter {
      val address = segment.toRawLongValue()
      return makeIAltimeter(Pointer(address))
    }

    public override fun toNative(obj: IAltimeter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1978889021_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAltimeter): Array<IAltimeter?> = (elements as
        Array<IAltimeter?>).castToImpl<IAltimeter,IAltimeter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAltimeter?> = arrayOfNulls<IAltimeter_Impl>(size)
        as Array<IAltimeter?>
  }
}
