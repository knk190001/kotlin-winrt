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

@ABIMarker(IInclinometer.ABI::class)
@Signature("{2648ca6f-2286-406f-9161-f0c4bd806ebf}")
@Guid("2648ca6f2286406f9161f0c4bd806ebf")
@WinRTInterface("2648ca6f2286406f9161f0c4bd806ebf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInclinometer.ByReference::class)
public interface IInclinometer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCurrentReading(): InclinometerReading?

  @InterfaceMethod(1)
  public fun get_MinimumReportInterval(): WinDef.UINT

  @InterfaceMethod(2)
  public fun put_ReportInterval(value: WinDef.UINT): Unit

  @InterfaceMethod(3)
  public fun get_ReportInterval(): WinDef.UINT

  @InterfaceMethod(4)
  public fun add_ReadingChanged(handler: TypedEventHandler<Inclinometer?,
      InclinometerReadingChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_ReadingChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IInclinometer>
      {
    public override fun getValue() = ABI.makeIInclinometer(pointer.getPointer(0))

    public fun setValue(value: IInclinometer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInclinometer {
    public val __894073881_Ptr: Pointer?

    public val _894073881_VtblPtr: Pointer?
      get() = __894073881_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCurrentReading(): InclinometerReading? {
      val fnPtr = _894073881_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InclinometerReading>()
      val hr = fn.invokeHR(arrayOf(__894073881_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InclinometerReading>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MinimumReportInterval(): WinDef.UINT {
      val fnPtr = _894073881_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__894073881_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_ReportInterval(value: WinDef.UINT): Unit {
      val fnPtr = _894073881_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__894073881_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_ReportInterval(): WinDef.UINT {
      val fnPtr = _894073881_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__894073881_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun add_ReadingChanged(handler: TypedEventHandler<Inclinometer?,
        InclinometerReadingChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _894073881_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__894073881_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_ReadingChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _894073881_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__894073881_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInclinometer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __894073881_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInclinometer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2648ca6f2286406f9161f0c4bd806ebf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInclinometer(ptr: Pointer?): WithDefault = IInclinometer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInclinometer {
      val address = segment.toRawLongValue()
      return makeIInclinometer(Pointer(address))
    }

    public override fun toNative(obj: IInclinometer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__894073881_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInclinometer): Array<IInclinometer?> = (elements as
        Array<IInclinometer?>).castToImpl<IInclinometer,IInclinometer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInclinometer?> =
        arrayOfNulls<IInclinometer_Impl>(size) as Array<IInclinometer?>
  }
}
