package Windows.UI.Xaml.Controls

import Windows.Foundation.DateTime
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.IReference
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.FrameworkElement
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDatePickerFlyout.ABI::class)
@Signature("{fbf33b1a-a3a4-4df8-9228-23a5ac27df4e}")
@Guid("fbf33b1aa3a44df8922823a5ac27df4e")
@WinRTInterface("fbf33b1aa3a44df8922823a5ac27df4e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDatePickerFlyout.ByReference::class)
public interface IDatePickerFlyout : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CalendarIdentifier(): String?

  @InterfaceMethod(1)
  public fun put_CalendarIdentifier(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Date(): DateTime?

  @InterfaceMethod(3)
  public fun put_Date(value: DateTime?): Unit

  @InterfaceMethod(4)
  public fun get_DayVisible(): Boolean

  @InterfaceMethod(5)
  public fun put_DayVisible(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_MonthVisible(): Boolean

  @InterfaceMethod(7)
  public fun put_MonthVisible(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_YearVisible(): Boolean

  @InterfaceMethod(9)
  public fun put_YearVisible(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_MinYear(): DateTime?

  @InterfaceMethod(11)
  public fun put_MinYear(value: DateTime?): Unit

  @InterfaceMethod(12)
  public fun get_MaxYear(): DateTime?

  @InterfaceMethod(13)
  public fun put_MaxYear(value: DateTime?): Unit

  @InterfaceMethod(14)
  public fun add_DatePicked(handler: TypedEventHandler<DatePickerFlyout?, DatePickedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(15)
  public fun remove_DatePicked(token: EventRegistrationToken?): Unit

  @InterfaceMethod(16)
  public fun ShowAtAsync(target: FrameworkElement?): IAsyncOperation<IReference<DateTime?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDatePickerFlyout> {
    public override fun getValue() = ABI.makeIDatePickerFlyout(pointer.getPointer(0))

    public fun setValue(value: IDatePickerFlyout_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDatePickerFlyout {
    public val __561418003_Ptr: Pointer?

    public val _561418003_VtblPtr: Pointer?
      get() = __561418003_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CalendarIdentifier(): String? {
      val fnPtr = _561418003_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__561418003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_CalendarIdentifier(value: String?): Unit {
      val fnPtr = _561418003_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__561418003_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Date(): DateTime? {
      val fnPtr = _561418003_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__561418003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Date(value: DateTime?): Unit {
      val fnPtr = _561418003_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__561418003_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_DayVisible(): Boolean {
      val fnPtr = _561418003_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__561418003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_DayVisible(value: Boolean): Unit {
      val fnPtr = _561418003_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__561418003_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_MonthVisible(): Boolean {
      val fnPtr = _561418003_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__561418003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_MonthVisible(value: Boolean): Unit {
      val fnPtr = _561418003_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__561418003_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_YearVisible(): Boolean {
      val fnPtr = _561418003_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__561418003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_YearVisible(value: Boolean): Unit {
      val fnPtr = _561418003_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__561418003_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_MinYear(): DateTime? {
      val fnPtr = _561418003_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__561418003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_MinYear(value: DateTime?): Unit {
      val fnPtr = _561418003_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__561418003_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_MaxYear(): DateTime? {
      val fnPtr = _561418003_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__561418003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_MaxYear(value: DateTime?): Unit {
      val fnPtr = _561418003_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__561418003_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun add_DatePicked(handler: TypedEventHandler<DatePickerFlyout?,
        DatePickedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _561418003_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__561418003_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun remove_DatePicked(token: EventRegistrationToken?): Unit {
      val fnPtr = _561418003_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__561418003_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun ShowAtAsync(target: FrameworkElement?):
        IAsyncOperation<IReference<DateTime?>?>? {
      val fnPtr = _561418003_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IReference<DateTime?>?>>()
      val hr = fn.invokeHR(arrayOf(__561418003_Ptr, marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IReference<DateTime?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IDatePickerFlyout_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __561418003_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatePickerFlyout, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fbf33b1aa3a44df8922823a5ac27df4e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatePickerFlyout(ptr: Pointer?): WithDefault = IDatePickerFlyout_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDatePickerFlyout {
      val address = segment.toRawLongValue()
      return makeIDatePickerFlyout(Pointer(address))
    }

    public override fun toNative(obj: IDatePickerFlyout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__561418003_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDatePickerFlyout): Array<IDatePickerFlyout?> = (elements
        as Array<IDatePickerFlyout?>).castToImpl<IDatePickerFlyout,IDatePickerFlyout_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDatePickerFlyout?> =
        arrayOfNulls<IDatePickerFlyout_Impl>(size) as Array<IDatePickerFlyout?>
  }
}
