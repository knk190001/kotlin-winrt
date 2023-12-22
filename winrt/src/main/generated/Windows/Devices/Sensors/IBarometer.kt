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

@ABIMarker(IBarometer.ABI::class)
@Signature("{934475a8-78bf-452f-b017-f0209ce6dab4}")
@Guid("934475a878bf452fb017f0209ce6dab4")
@WinRTInterface("934475a878bf452fb017f0209ce6dab4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarometer.ByReference::class)
public interface IBarometer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCurrentReading(): BarometerReading?

  @InterfaceMethod(1)
  public fun get_DeviceId(): String?

  @InterfaceMethod(2)
  public fun get_MinimumReportInterval(): WinDef.UINT

  @InterfaceMethod(3)
  public fun put_ReportInterval(value: WinDef.UINT): Unit

  @InterfaceMethod(4)
  public fun get_ReportInterval(): WinDef.UINT

  @InterfaceMethod(5)
  public fun add_ReadingChanged(handler: TypedEventHandler<Barometer?,
      BarometerReadingChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_ReadingChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBarometer> {
    public override fun getValue() = ABI.makeIBarometer(pointer.getPointer(0))

    public fun setValue(value: IBarometer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarometer {
    public val __872124897_Ptr: Pointer?

    public val _872124897_VtblPtr: Pointer?
      get() = __872124897_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCurrentReading(): BarometerReading? {
      val fnPtr = _872124897_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BarometerReading>()
      val hr = fn.invokeHR(arrayOf(__872124897_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BarometerReading>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DeviceId(): String? {
      val fnPtr = _872124897_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__872124897_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MinimumReportInterval(): WinDef.UINT {
      val fnPtr = _872124897_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__872124897_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_ReportInterval(value: WinDef.UINT): Unit {
      val fnPtr = _872124897_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__872124897_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ReportInterval(): WinDef.UINT {
      val fnPtr = _872124897_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__872124897_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun add_ReadingChanged(handler: TypedEventHandler<Barometer?,
        BarometerReadingChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _872124897_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__872124897_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_ReadingChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _872124897_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__872124897_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBarometer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __872124897_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarometer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("934475a878bf452fb017f0209ce6dab4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarometer(ptr: Pointer?): WithDefault = IBarometer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBarometer {
      val address = segment.toRawLongValue()
      return makeIBarometer(Pointer(address))
    }

    public override fun toNative(obj: IBarometer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__872124897_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarometer): Array<IBarometer?> = (elements as
        Array<IBarometer?>).castToImpl<IBarometer,IBarometer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarometer?> = arrayOfNulls<IBarometer_Impl>(size)
        as Array<IBarometer?>
  }
}
