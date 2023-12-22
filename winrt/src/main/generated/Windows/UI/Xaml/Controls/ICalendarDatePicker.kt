package Windows.UI.Xaml.Controls

import Windows.Foundation.DateTime
import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IReference
import Windows.Foundation.TypedEventHandler
import Windows.Globalization.DayOfWeek
import Windows.UI.Xaml.DataTemplate
import Windows.UI.Xaml.Style
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ICalendarDatePicker.ABI::class)
@Signature("{63c9c16f-668c-4491-9444-d45d8bf4fa29}")
@Guid("63c9c16f668c44919444d45d8bf4fa29")
@WinRTInterface("63c9c16f668c44919444d45d8bf4fa29")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICalendarDatePicker.ByReference::class)
public interface ICalendarDatePicker : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Date(): IReference<DateTime?>?

  @InterfaceMethod(1)
  public fun put_Date(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(2)
  public fun get_IsCalendarOpen(): Boolean

  @InterfaceMethod(3)
  public fun put_IsCalendarOpen(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_DateFormat(): String?

  @InterfaceMethod(5)
  public fun put_DateFormat(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_PlaceholderText(): String?

  @InterfaceMethod(7)
  public fun put_PlaceholderText(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_Header(): IUnknown?

  @InterfaceMethod(9)
  public fun put_Header(value: IUnknown?): Unit

  @InterfaceMethod(10)
  public fun get_HeaderTemplate(): DataTemplate?

  @InterfaceMethod(11)
  public fun put_HeaderTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(12)
  public fun get_CalendarViewStyle(): Style?

  @InterfaceMethod(13)
  public fun put_CalendarViewStyle(value: Style?): Unit

  @InterfaceMethod(14)
  public fun get_MinDate(): DateTime?

  @InterfaceMethod(15)
  public fun put_MinDate(value: DateTime?): Unit

  @InterfaceMethod(16)
  public fun get_MaxDate(): DateTime?

  @InterfaceMethod(17)
  public fun put_MaxDate(value: DateTime?): Unit

  @InterfaceMethod(18)
  public fun get_IsTodayHighlighted(): Boolean

  @InterfaceMethod(19)
  public fun put_IsTodayHighlighted(value: Boolean): Unit

  @InterfaceMethod(20)
  public fun get_DisplayMode(): CalendarViewDisplayMode?

  @InterfaceMethod(21)
  public fun put_DisplayMode(value: CalendarViewDisplayMode?): Unit

  @InterfaceMethod(22)
  public fun get_FirstDayOfWeek(): DayOfWeek?

  @InterfaceMethod(23)
  public fun put_FirstDayOfWeek(value: DayOfWeek?): Unit

  @InterfaceMethod(24)
  public fun get_DayOfWeekFormat(): String?

  @InterfaceMethod(25)
  public fun put_DayOfWeekFormat(value: String?): Unit

  @InterfaceMethod(26)
  public fun get_CalendarIdentifier(): String?

  @InterfaceMethod(27)
  public fun put_CalendarIdentifier(value: String?): Unit

  @InterfaceMethod(28)
  public fun get_IsOutOfScopeEnabled(): Boolean

  @InterfaceMethod(29)
  public fun put_IsOutOfScopeEnabled(value: Boolean): Unit

  @InterfaceMethod(30)
  public fun get_IsGroupLabelVisible(): Boolean

  @InterfaceMethod(31)
  public fun put_IsGroupLabelVisible(value: Boolean): Unit

  @InterfaceMethod(32)
  public fun add_CalendarViewDayItemChanging(handler: CalendarViewDayItemChangingEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(33)
  public fun remove_CalendarViewDayItemChanging(token: EventRegistrationToken?): Unit

  @InterfaceMethod(34)
  public fun add_DateChanged(handler: TypedEventHandler<CalendarDatePicker?,
      CalendarDatePickerDateChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(35)
  public fun remove_DateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(36)
  public fun add_Opened(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(37)
  public fun remove_Opened(token: EventRegistrationToken?): Unit

  @InterfaceMethod(38)
  public fun add_Closed(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(39)
  public fun remove_Closed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(40)
  public fun SetDisplayDate(date: DateTime?): Unit

  @InterfaceMethod(41)
  public fun SetYearDecadeDisplayDimensions(columns: Int, rows: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICalendarDatePicker> {
    public override fun getValue() = ABI.makeICalendarDatePicker(pointer.getPointer(0))

    public fun setValue(value: ICalendarDatePicker_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICalendarDatePicker {
    public val __990795990_Ptr: Pointer?

    public val _990795990_VtblPtr: Pointer?
      get() = __990795990_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Date(): IReference<DateTime?>? {
      val fnPtr = _990795990_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Date(value: IReference<DateTime?>?): Unit {
      val fnPtr = _990795990_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsCalendarOpen(): Boolean {
      val fnPtr = _990795990_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsCalendarOpen(value: Boolean): Unit {
      val fnPtr = _990795990_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_DateFormat(): String? {
      val fnPtr = _990795990_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_DateFormat(value: String?): Unit {
      val fnPtr = _990795990_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_PlaceholderText(): String? {
      val fnPtr = _990795990_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_PlaceholderText(value: String?): Unit {
      val fnPtr = _990795990_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Header(): IUnknown? {
      val fnPtr = _990795990_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Header(value: IUnknown?): Unit {
      val fnPtr = _990795990_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_HeaderTemplate(): DataTemplate? {
      val fnPtr = _990795990_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_HeaderTemplate(value: DataTemplate?): Unit {
      val fnPtr = _990795990_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_CalendarViewStyle(): Style? {
      val fnPtr = _990795990_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_CalendarViewStyle(value: Style?): Unit {
      val fnPtr = _990795990_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_MinDate(): DateTime? {
      val fnPtr = _990795990_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_MinDate(value: DateTime?): Unit {
      val fnPtr = _990795990_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_MaxDate(): DateTime? {
      val fnPtr = _990795990_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_MaxDate(value: DateTime?): Unit {
      val fnPtr = _990795990_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_IsTodayHighlighted(): Boolean {
      val fnPtr = _990795990_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_IsTodayHighlighted(value: Boolean): Unit {
      val fnPtr = _990795990_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_DisplayMode(): CalendarViewDisplayMode? {
      val fnPtr = _990795990_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CalendarViewDisplayMode>()
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CalendarViewDisplayMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_DisplayMode(value: CalendarViewDisplayMode?): Unit {
      val fnPtr = _990795990_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_FirstDayOfWeek(): DayOfWeek? {
      val fnPtr = _990795990_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DayOfWeek>()
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DayOfWeek>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_FirstDayOfWeek(value: DayOfWeek?): Unit {
      val fnPtr = _990795990_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_DayOfWeekFormat(): String? {
      val fnPtr = _990795990_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun put_DayOfWeekFormat(value: String?): Unit {
      val fnPtr = _990795990_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_CalendarIdentifier(): String? {
      val fnPtr = _990795990_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun put_CalendarIdentifier(value: String?): Unit {
      val fnPtr = _990795990_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_IsOutOfScopeEnabled(): Boolean {
      val fnPtr = _990795990_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(29)
    public override fun put_IsOutOfScopeEnabled(value: Boolean): Unit {
      val fnPtr = _990795990_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_IsGroupLabelVisible(): Boolean {
      val fnPtr = _990795990_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(31)
    public override fun put_IsGroupLabelVisible(value: Boolean): Unit {
      val fnPtr = _990795990_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override
        fun add_CalendarViewDayItemChanging(handler: CalendarViewDayItemChangingEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _990795990_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun remove_CalendarViewDayItemChanging(token: EventRegistrationToken?): Unit {
      val fnPtr = _990795990_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun add_DateChanged(handler: TypedEventHandler<CalendarDatePicker?,
        CalendarDatePickerDateChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _990795990_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun remove_DateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _990795990_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun add_Opened(handler: EventHandler<IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _990795990_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun remove_Opened(token: EventRegistrationToken?): Unit {
      val fnPtr = _990795990_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun add_Closed(handler: EventHandler<IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _990795990_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun remove_Closed(token: EventRegistrationToken?): Unit {
      val fnPtr = _990795990_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun SetDisplayDate(date: DateTime?): Unit {
      val fnPtr = _990795990_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr, marshalToNative(date),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(41)
    public override fun SetYearDecadeDisplayDimensions(columns: Int, rows: Int): Unit {
      val fnPtr = _990795990_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__990795990_Ptr, columns, rows,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICalendarDatePicker_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __990795990_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICalendarDatePicker, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("63c9c16f668c44919444d45d8bf4fa29")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICalendarDatePicker(ptr: Pointer?): WithDefault = ICalendarDatePicker_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICalendarDatePicker {
      val address = segment.toRawLongValue()
      return makeICalendarDatePicker(Pointer(address))
    }

    public override fun toNative(obj: ICalendarDatePicker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__990795990_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICalendarDatePicker): Array<ICalendarDatePicker?> =
        (elements as
        Array<ICalendarDatePicker?>).castToImpl<ICalendarDatePicker,ICalendarDatePicker_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICalendarDatePicker?> =
        arrayOfNulls<ICalendarDatePicker_Impl>(size) as Array<ICalendarDatePicker?>
  }
}
