package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.Primitives.CalendarViewTemplateSettings
import Microsoft.UI.Xaml.CornerRadius
import Microsoft.UI.Xaml.HorizontalAlignment
import Microsoft.UI.Xaml.Media.Brush
import Microsoft.UI.Xaml.Media.FontFamily
import Microsoft.UI.Xaml.Style
import Microsoft.UI.Xaml.Thickness
import Microsoft.UI.Xaml.VerticalAlignment
import Windows.Foundation.Collections.IVector
import Windows.Foundation.DateTime
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Globalization.DayOfWeek
import Windows.UI.Text.FontStyle
import Windows.UI.Text.FontWeight
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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICalendarView.ABI::class)
@Signature("{e786081e-b680-56ab-bfbb-52d5b17c365e}")
@Guid("e786081eb68056abbfbb52d5b17c365e")
@WinRTInterface("e786081eb68056abbfbb52d5b17c365e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICalendarView.ByReference::class)
public interface ICalendarView : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CalendarIdentifier(): String?

  @InterfaceMethod(1)
  public fun put_CalendarIdentifier(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_DayOfWeekFormat(): String?

  @InterfaceMethod(3)
  public fun put_DayOfWeekFormat(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_IsGroupLabelVisible(): Boolean

  @InterfaceMethod(5)
  public fun put_IsGroupLabelVisible(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_DisplayMode(): CalendarViewDisplayMode?

  @InterfaceMethod(7)
  public fun put_DisplayMode(value: CalendarViewDisplayMode?): Unit

  @InterfaceMethod(8)
  public fun get_FirstDayOfWeek(): DayOfWeek?

  @InterfaceMethod(9)
  public fun put_FirstDayOfWeek(value: DayOfWeek?): Unit

  @InterfaceMethod(10)
  public fun get_IsOutOfScopeEnabled(): Boolean

  @InterfaceMethod(11)
  public fun put_IsOutOfScopeEnabled(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_IsTodayHighlighted(): Boolean

  @InterfaceMethod(13)
  public fun put_IsTodayHighlighted(value: Boolean): Unit

  @InterfaceMethod(14)
  public fun get_MaxDate(): DateTime?

  @InterfaceMethod(15)
  public fun put_MaxDate(value: DateTime?): Unit

  @InterfaceMethod(16)
  public fun get_MinDate(): DateTime?

  @InterfaceMethod(17)
  public fun put_MinDate(value: DateTime?): Unit

  @InterfaceMethod(18)
  public fun get_NumberOfWeeksInView(): Int

  @InterfaceMethod(19)
  public fun put_NumberOfWeeksInView(value: Int): Unit

  @InterfaceMethod(20)
  public fun get_SelectedDates(): IVector<DateTime?>?

  @InterfaceMethod(21)
  public fun get_SelectionMode(): CalendarViewSelectionMode?

  @InterfaceMethod(22)
  public fun put_SelectionMode(value: CalendarViewSelectionMode?): Unit

  @InterfaceMethod(23)
  public fun get_TemplateSettings(): CalendarViewTemplateSettings?

  @InterfaceMethod(24)
  public fun get_FocusBorderBrush(): Brush?

  @InterfaceMethod(25)
  public fun put_FocusBorderBrush(value: Brush?): Unit

  @InterfaceMethod(26)
  public fun get_SelectedHoverBorderBrush(): Brush?

  @InterfaceMethod(27)
  public fun put_SelectedHoverBorderBrush(value: Brush?): Unit

  @InterfaceMethod(28)
  public fun get_SelectedPressedBorderBrush(): Brush?

  @InterfaceMethod(29)
  public fun put_SelectedPressedBorderBrush(value: Brush?): Unit

  @InterfaceMethod(30)
  public fun get_SelectedDisabledBorderBrush(): Brush?

  @InterfaceMethod(31)
  public fun put_SelectedDisabledBorderBrush(value: Brush?): Unit

  @InterfaceMethod(32)
  public fun get_SelectedBorderBrush(): Brush?

  @InterfaceMethod(33)
  public fun put_SelectedBorderBrush(value: Brush?): Unit

  @InterfaceMethod(34)
  public fun get_HoverBorderBrush(): Brush?

  @InterfaceMethod(35)
  public fun put_HoverBorderBrush(value: Brush?): Unit

  @InterfaceMethod(36)
  public fun get_PressedBorderBrush(): Brush?

  @InterfaceMethod(37)
  public fun put_PressedBorderBrush(value: Brush?): Unit

  @InterfaceMethod(38)
  public fun get_TodaySelectedInnerBorderBrush(): Brush?

  @InterfaceMethod(39)
  public fun put_TodaySelectedInnerBorderBrush(value: Brush?): Unit

  @InterfaceMethod(40)
  public fun get_BlackoutStrikethroughBrush(): Brush?

  @InterfaceMethod(41)
  public fun put_BlackoutStrikethroughBrush(value: Brush?): Unit

  @InterfaceMethod(42)
  public fun get_CalendarItemBorderBrush(): Brush?

  @InterfaceMethod(43)
  public fun put_CalendarItemBorderBrush(value: Brush?): Unit

  @InterfaceMethod(44)
  public fun get_BlackoutBackground(): Brush?

  @InterfaceMethod(45)
  public fun put_BlackoutBackground(value: Brush?): Unit

  @InterfaceMethod(46)
  public fun get_OutOfScopeBackground(): Brush?

  @InterfaceMethod(47)
  public fun put_OutOfScopeBackground(value: Brush?): Unit

  @InterfaceMethod(48)
  public fun get_CalendarItemBackground(): Brush?

  @InterfaceMethod(49)
  public fun put_CalendarItemBackground(value: Brush?): Unit

  @InterfaceMethod(50)
  public fun get_CalendarItemHoverBackground(): Brush?

  @InterfaceMethod(51)
  public fun put_CalendarItemHoverBackground(value: Brush?): Unit

  @InterfaceMethod(52)
  public fun get_CalendarItemPressedBackground(): Brush?

  @InterfaceMethod(53)
  public fun put_CalendarItemPressedBackground(value: Brush?): Unit

  @InterfaceMethod(54)
  public fun get_CalendarItemDisabledBackground(): Brush?

  @InterfaceMethod(55)
  public fun put_CalendarItemDisabledBackground(value: Brush?): Unit

  @InterfaceMethod(56)
  public fun get_TodayBackground(): Brush?

  @InterfaceMethod(57)
  public fun put_TodayBackground(value: Brush?): Unit

  @InterfaceMethod(58)
  public fun get_TodayBlackoutBackground(): Brush?

  @InterfaceMethod(59)
  public fun put_TodayBlackoutBackground(value: Brush?): Unit

  @InterfaceMethod(60)
  public fun get_TodayHoverBackground(): Brush?

  @InterfaceMethod(61)
  public fun put_TodayHoverBackground(value: Brush?): Unit

  @InterfaceMethod(62)
  public fun get_TodayPressedBackground(): Brush?

  @InterfaceMethod(63)
  public fun put_TodayPressedBackground(value: Brush?): Unit

  @InterfaceMethod(64)
  public fun get_TodayDisabledBackground(): Brush?

  @InterfaceMethod(65)
  public fun put_TodayDisabledBackground(value: Brush?): Unit

  @InterfaceMethod(66)
  public fun get_PressedForeground(): Brush?

  @InterfaceMethod(67)
  public fun put_PressedForeground(value: Brush?): Unit

  @InterfaceMethod(68)
  public fun get_TodayForeground(): Brush?

  @InterfaceMethod(69)
  public fun put_TodayForeground(value: Brush?): Unit

  @InterfaceMethod(70)
  public fun get_BlackoutForeground(): Brush?

  @InterfaceMethod(71)
  public fun put_BlackoutForeground(value: Brush?): Unit

  @InterfaceMethod(72)
  public fun get_TodayBlackoutForeground(): Brush?

  @InterfaceMethod(73)
  public fun put_TodayBlackoutForeground(value: Brush?): Unit

  @InterfaceMethod(74)
  public fun get_SelectedForeground(): Brush?

  @InterfaceMethod(75)
  public fun put_SelectedForeground(value: Brush?): Unit

  @InterfaceMethod(76)
  public fun get_SelectedHoverForeground(): Brush?

  @InterfaceMethod(77)
  public fun put_SelectedHoverForeground(value: Brush?): Unit

  @InterfaceMethod(78)
  public fun get_SelectedPressedForeground(): Brush?

  @InterfaceMethod(79)
  public fun put_SelectedPressedForeground(value: Brush?): Unit

  @InterfaceMethod(80)
  public fun get_SelectedDisabledForeground(): Brush?

  @InterfaceMethod(81)
  public fun put_SelectedDisabledForeground(value: Brush?): Unit

  @InterfaceMethod(82)
  public fun get_OutOfScopeForeground(): Brush?

  @InterfaceMethod(83)
  public fun put_OutOfScopeForeground(value: Brush?): Unit

  @InterfaceMethod(84)
  public fun get_OutOfScopeHoverForeground(): Brush?

  @InterfaceMethod(85)
  public fun put_OutOfScopeHoverForeground(value: Brush?): Unit

  @InterfaceMethod(86)
  public fun get_OutOfScopePressedForeground(): Brush?

  @InterfaceMethod(87)
  public fun put_OutOfScopePressedForeground(value: Brush?): Unit

  @InterfaceMethod(88)
  public fun get_CalendarItemForeground(): Brush?

  @InterfaceMethod(89)
  public fun put_CalendarItemForeground(value: Brush?): Unit

  @InterfaceMethod(90)
  public fun get_DisabledForeground(): Brush?

  @InterfaceMethod(91)
  public fun put_DisabledForeground(value: Brush?): Unit

  @InterfaceMethod(92)
  public fun get_DayItemFontFamily(): FontFamily?

  @InterfaceMethod(93)
  public fun put_DayItemFontFamily(value: FontFamily?): Unit

  @InterfaceMethod(94)
  public fun get_DayItemFontSize(): Double

  @InterfaceMethod(95)
  public fun put_DayItemFontSize(value: Double): Unit

  @InterfaceMethod(96)
  public fun get_DayItemFontStyle(): FontStyle?

  @InterfaceMethod(97)
  public fun put_DayItemFontStyle(value: FontStyle?): Unit

  @InterfaceMethod(98)
  public fun get_DayItemFontWeight(): FontWeight?

  @InterfaceMethod(99)
  public fun put_DayItemFontWeight(value: FontWeight?): Unit

  @InterfaceMethod(100)
  public fun get_TodayFontWeight(): FontWeight?

  @InterfaceMethod(101)
  public fun put_TodayFontWeight(value: FontWeight?): Unit

  @InterfaceMethod(102)
  public fun get_FirstOfMonthLabelFontFamily(): FontFamily?

  @InterfaceMethod(103)
  public fun put_FirstOfMonthLabelFontFamily(value: FontFamily?): Unit

  @InterfaceMethod(104)
  public fun get_FirstOfMonthLabelFontSize(): Double

  @InterfaceMethod(105)
  public fun put_FirstOfMonthLabelFontSize(value: Double): Unit

  @InterfaceMethod(106)
  public fun get_FirstOfMonthLabelFontStyle(): FontStyle?

  @InterfaceMethod(107)
  public fun put_FirstOfMonthLabelFontStyle(value: FontStyle?): Unit

  @InterfaceMethod(108)
  public fun get_FirstOfMonthLabelFontWeight(): FontWeight?

  @InterfaceMethod(109)
  public fun put_FirstOfMonthLabelFontWeight(value: FontWeight?): Unit

  @InterfaceMethod(110)
  public fun get_MonthYearItemFontFamily(): FontFamily?

  @InterfaceMethod(111)
  public fun put_MonthYearItemFontFamily(value: FontFamily?): Unit

  @InterfaceMethod(112)
  public fun get_MonthYearItemFontSize(): Double

  @InterfaceMethod(113)
  public fun put_MonthYearItemFontSize(value: Double): Unit

  @InterfaceMethod(114)
  public fun get_MonthYearItemFontStyle(): FontStyle?

  @InterfaceMethod(115)
  public fun put_MonthYearItemFontStyle(value: FontStyle?): Unit

  @InterfaceMethod(116)
  public fun get_MonthYearItemFontWeight(): FontWeight?

  @InterfaceMethod(117)
  public fun put_MonthYearItemFontWeight(value: FontWeight?): Unit

  @InterfaceMethod(118)
  public fun get_FirstOfYearDecadeLabelFontFamily(): FontFamily?

  @InterfaceMethod(119)
  public fun put_FirstOfYearDecadeLabelFontFamily(value: FontFamily?): Unit

  @InterfaceMethod(120)
  public fun get_FirstOfYearDecadeLabelFontSize(): Double

  @InterfaceMethod(121)
  public fun put_FirstOfYearDecadeLabelFontSize(value: Double): Unit

  @InterfaceMethod(122)
  public fun get_FirstOfYearDecadeLabelFontStyle(): FontStyle?

  @InterfaceMethod(123)
  public fun put_FirstOfYearDecadeLabelFontStyle(value: FontStyle?): Unit

  @InterfaceMethod(124)
  public fun get_FirstOfYearDecadeLabelFontWeight(): FontWeight?

  @InterfaceMethod(125)
  public fun put_FirstOfYearDecadeLabelFontWeight(value: FontWeight?): Unit

  @InterfaceMethod(126)
  public fun get_DayItemMargin(): Thickness?

  @InterfaceMethod(127)
  public fun put_DayItemMargin(value: Thickness?): Unit

  @InterfaceMethod(128)
  public fun get_MonthYearItemMargin(): Thickness?

  @InterfaceMethod(129)
  public fun put_MonthYearItemMargin(value: Thickness?): Unit

  @InterfaceMethod(130)
  public fun get_FirstOfMonthLabelMargin(): Thickness?

  @InterfaceMethod(131)
  public fun put_FirstOfMonthLabelMargin(value: Thickness?): Unit

  @InterfaceMethod(132)
  public fun get_FirstOfYearDecadeLabelMargin(): Thickness?

  @InterfaceMethod(133)
  public fun put_FirstOfYearDecadeLabelMargin(value: Thickness?): Unit

  @InterfaceMethod(134)
  public fun get_HorizontalDayItemAlignment(): HorizontalAlignment?

  @InterfaceMethod(135)
  public fun put_HorizontalDayItemAlignment(value: HorizontalAlignment?): Unit

  @InterfaceMethod(136)
  public fun get_VerticalDayItemAlignment(): VerticalAlignment?

  @InterfaceMethod(137)
  public fun put_VerticalDayItemAlignment(value: VerticalAlignment?): Unit

  @InterfaceMethod(138)
  public fun get_HorizontalFirstOfMonthLabelAlignment(): HorizontalAlignment?

  @InterfaceMethod(139)
  public fun put_HorizontalFirstOfMonthLabelAlignment(value: HorizontalAlignment?): Unit

  @InterfaceMethod(140)
  public fun get_VerticalFirstOfMonthLabelAlignment(): VerticalAlignment?

  @InterfaceMethod(141)
  public fun put_VerticalFirstOfMonthLabelAlignment(value: VerticalAlignment?): Unit

  @InterfaceMethod(142)
  public fun get_CalendarItemBorderThickness(): Thickness?

  @InterfaceMethod(143)
  public fun put_CalendarItemBorderThickness(value: Thickness?): Unit

  @InterfaceMethod(144)
  public fun get_CalendarViewDayItemStyle(): Style?

  @InterfaceMethod(145)
  public fun put_CalendarViewDayItemStyle(value: Style?): Unit

  @InterfaceMethod(146)
  public fun get_CalendarItemCornerRadius(): CornerRadius?

  @InterfaceMethod(147)
  public fun put_CalendarItemCornerRadius(value: CornerRadius?): Unit

  @InterfaceMethod(148)
  public fun add_CalendarViewDayItemChanging(handler: TypedEventHandler<CalendarView?,
      CalendarViewDayItemChangingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(149)
  public fun remove_CalendarViewDayItemChanging(token: EventRegistrationToken?): Unit

  @InterfaceMethod(150)
  public fun add_SelectedDatesChanged(handler: TypedEventHandler<CalendarView?,
      CalendarViewSelectedDatesChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(151)
  public fun remove_SelectedDatesChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(152)
  public fun SetDisplayDate(date: DateTime?): Unit

  @InterfaceMethod(153)
  public fun SetYearDecadeDisplayDimensions(columns: Int, rows: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICalendarView>
      {
    public override fun getValue() = ABI.makeICalendarView(pointer.getPointer(0))

    public fun setValue(value: ICalendarView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICalendarView {
    public val __1546504630_Ptr: Pointer?

    public val _1546504630_VtblPtr: Pointer?
      get() = __1546504630_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CalendarIdentifier(): String? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_CalendarIdentifier(value: String?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DayOfWeekFormat(): String? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_DayOfWeekFormat(value: String?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsGroupLabelVisible(): Boolean {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsGroupLabelVisible(value: Boolean): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_DisplayMode(): CalendarViewDisplayMode? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CalendarViewDisplayMode>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CalendarViewDisplayMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_DisplayMode(value: CalendarViewDisplayMode?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_FirstDayOfWeek(): DayOfWeek? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DayOfWeek>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DayOfWeek>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_FirstDayOfWeek(value: DayOfWeek?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_IsOutOfScopeEnabled(): Boolean {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_IsOutOfScopeEnabled(value: Boolean): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_IsTodayHighlighted(): Boolean {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_IsTodayHighlighted(value: Boolean): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_MaxDate(): DateTime? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_MaxDate(value: DateTime?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_MinDate(): DateTime? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_MinDate(value: DateTime?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_NumberOfWeeksInView(): Int {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_NumberOfWeeksInView(value: Int): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_SelectedDates(): IVector<DateTime?>? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun get_SelectionMode(): CalendarViewSelectionMode? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CalendarViewSelectionMode>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CalendarViewSelectionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun put_SelectionMode(value: CalendarViewSelectionMode?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun get_TemplateSettings(): CalendarViewTemplateSettings? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CalendarViewTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CalendarViewTemplateSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun get_FocusBorderBrush(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun put_FocusBorderBrush(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_SelectedHoverBorderBrush(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun put_SelectedHoverBorderBrush(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_SelectedPressedBorderBrush(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun put_SelectedPressedBorderBrush(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_SelectedDisabledBorderBrush(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun put_SelectedDisabledBorderBrush(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun get_SelectedBorderBrush(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun put_SelectedBorderBrush(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun get_HoverBorderBrush(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun put_HoverBorderBrush(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun get_PressedBorderBrush(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun put_PressedBorderBrush(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun get_TodaySelectedInnerBorderBrush(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun put_TodaySelectedInnerBorderBrush(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun get_BlackoutStrikethroughBrush(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(41)
    public override fun put_BlackoutStrikethroughBrush(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(42)
    public override fun get_CalendarItemBorderBrush(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(43)
    public override fun put_CalendarItemBorderBrush(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(44)
    public override fun get_BlackoutBackground(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(45)
    public override fun put_BlackoutBackground(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(46)
    public override fun get_OutOfScopeBackground(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(47)
    public override fun put_OutOfScopeBackground(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(48)
    public override fun get_CalendarItemBackground(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(49)
    public override fun put_CalendarItemBackground(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(50)
    public override fun get_CalendarItemHoverBackground(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(51)
    public override fun put_CalendarItemHoverBackground(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(52)
    public override fun get_CalendarItemPressedBackground(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(53)
    public override fun put_CalendarItemPressedBackground(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(54)
    public override fun get_CalendarItemDisabledBackground(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(60L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(55)
    public override fun put_CalendarItemDisabledBackground(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(61L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(56)
    public override fun get_TodayBackground(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(62L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(57)
    public override fun put_TodayBackground(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(63L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(58)
    public override fun get_TodayBlackoutBackground(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(64L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(59)
    public override fun put_TodayBlackoutBackground(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(65L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(60)
    public override fun get_TodayHoverBackground(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(66L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(61)
    public override fun put_TodayHoverBackground(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(67L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(62)
    public override fun get_TodayPressedBackground(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(68L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(63)
    public override fun put_TodayPressedBackground(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(69L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(64)
    public override fun get_TodayDisabledBackground(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(70L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(65)
    public override fun put_TodayDisabledBackground(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(71L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(66)
    public override fun get_PressedForeground(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(72L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(67)
    public override fun put_PressedForeground(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(73L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(68)
    public override fun get_TodayForeground(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(74L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(69)
    public override fun put_TodayForeground(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(75L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(70)
    public override fun get_BlackoutForeground(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(76L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(71)
    public override fun put_BlackoutForeground(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(77L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(72)
    public override fun get_TodayBlackoutForeground(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(78L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(73)
    public override fun put_TodayBlackoutForeground(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(79L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(74)
    public override fun get_SelectedForeground(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(80L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(75)
    public override fun put_SelectedForeground(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(81L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(76)
    public override fun get_SelectedHoverForeground(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(82L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(77)
    public override fun put_SelectedHoverForeground(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(83L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(78)
    public override fun get_SelectedPressedForeground(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(84L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(79)
    public override fun put_SelectedPressedForeground(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(85L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(80)
    public override fun get_SelectedDisabledForeground(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(86L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(81)
    public override fun put_SelectedDisabledForeground(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(87L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(82)
    public override fun get_OutOfScopeForeground(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(88L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(83)
    public override fun put_OutOfScopeForeground(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(89L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(84)
    public override fun get_OutOfScopeHoverForeground(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(90L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(85)
    public override fun put_OutOfScopeHoverForeground(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(91L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(86)
    public override fun get_OutOfScopePressedForeground(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(92L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(87)
    public override fun put_OutOfScopePressedForeground(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(93L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(88)
    public override fun get_CalendarItemForeground(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(94L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(89)
    public override fun put_CalendarItemForeground(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(95L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(90)
    public override fun get_DisabledForeground(): Brush? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(96L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(91)
    public override fun put_DisabledForeground(value: Brush?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(97L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(92)
    public override fun get_DayItemFontFamily(): FontFamily? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(98L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontFamily>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontFamily>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(93)
    public override fun put_DayItemFontFamily(value: FontFamily?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(99L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(94)
    public override fun get_DayItemFontSize(): Double {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(100L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(95)
    public override fun put_DayItemFontSize(value: Double): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(101L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(96)
    public override fun get_DayItemFontStyle(): FontStyle? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(102L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontStyle>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontStyle>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(97)
    public override fun put_DayItemFontStyle(value: FontStyle?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(103L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(98)
    public override fun get_DayItemFontWeight(): FontWeight? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(104L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontWeight>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontWeight>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(99)
    public override fun put_DayItemFontWeight(value: FontWeight?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(105L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(100)
    public override fun get_TodayFontWeight(): FontWeight? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(106L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontWeight>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontWeight>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(101)
    public override fun put_TodayFontWeight(value: FontWeight?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(107L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(102)
    public override fun get_FirstOfMonthLabelFontFamily(): FontFamily? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(108L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontFamily>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontFamily>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(103)
    public override fun put_FirstOfMonthLabelFontFamily(value: FontFamily?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(109L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(104)
    public override fun get_FirstOfMonthLabelFontSize(): Double {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(110L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(105)
    public override fun put_FirstOfMonthLabelFontSize(value: Double): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(111L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(106)
    public override fun get_FirstOfMonthLabelFontStyle(): FontStyle? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(112L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontStyle>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontStyle>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(107)
    public override fun put_FirstOfMonthLabelFontStyle(value: FontStyle?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(113L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(108)
    public override fun get_FirstOfMonthLabelFontWeight(): FontWeight? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(114L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontWeight>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontWeight>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(109)
    public override fun put_FirstOfMonthLabelFontWeight(value: FontWeight?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(115L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(110)
    public override fun get_MonthYearItemFontFamily(): FontFamily? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(116L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontFamily>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontFamily>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(111)
    public override fun put_MonthYearItemFontFamily(value: FontFamily?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(117L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(112)
    public override fun get_MonthYearItemFontSize(): Double {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(118L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(113)
    public override fun put_MonthYearItemFontSize(value: Double): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(119L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(114)
    public override fun get_MonthYearItemFontStyle(): FontStyle? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(120L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontStyle>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontStyle>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(115)
    public override fun put_MonthYearItemFontStyle(value: FontStyle?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(121L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(116)
    public override fun get_MonthYearItemFontWeight(): FontWeight? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(122L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontWeight>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontWeight>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(117)
    public override fun put_MonthYearItemFontWeight(value: FontWeight?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(123L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(118)
    public override fun get_FirstOfYearDecadeLabelFontFamily(): FontFamily? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(124L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontFamily>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontFamily>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(119)
    public override fun put_FirstOfYearDecadeLabelFontFamily(value: FontFamily?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(125L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(120)
    public override fun get_FirstOfYearDecadeLabelFontSize(): Double {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(126L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(121)
    public override fun put_FirstOfYearDecadeLabelFontSize(value: Double): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(127L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(122)
    public override fun get_FirstOfYearDecadeLabelFontStyle(): FontStyle? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(128L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontStyle>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontStyle>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(123)
    public override fun put_FirstOfYearDecadeLabelFontStyle(value: FontStyle?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(129L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(124)
    public override fun get_FirstOfYearDecadeLabelFontWeight(): FontWeight? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(130L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FontWeight>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FontWeight>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(125)
    public override fun put_FirstOfYearDecadeLabelFontWeight(value: FontWeight?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(131L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(126)
    public override fun get_DayItemMargin(): Thickness? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(132L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(127)
    public override fun put_DayItemMargin(value: Thickness?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(133L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(128)
    public override fun get_MonthYearItemMargin(): Thickness? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(134L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(129)
    public override fun put_MonthYearItemMargin(value: Thickness?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(135L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(130)
    public override fun get_FirstOfMonthLabelMargin(): Thickness? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(136L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(131)
    public override fun put_FirstOfMonthLabelMargin(value: Thickness?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(137L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(132)
    public override fun get_FirstOfYearDecadeLabelMargin(): Thickness? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(138L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(133)
    public override fun put_FirstOfYearDecadeLabelMargin(value: Thickness?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(139L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(134)
    public override fun get_HorizontalDayItemAlignment(): HorizontalAlignment? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(140L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HorizontalAlignment>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HorizontalAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(135)
    public override fun put_HorizontalDayItemAlignment(value: HorizontalAlignment?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(141L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(136)
    public override fun get_VerticalDayItemAlignment(): VerticalAlignment? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(142L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VerticalAlignment>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VerticalAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(137)
    public override fun put_VerticalDayItemAlignment(value: VerticalAlignment?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(143L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(138)
    public override fun get_HorizontalFirstOfMonthLabelAlignment(): HorizontalAlignment? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(144L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HorizontalAlignment>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HorizontalAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(139)
    public override fun put_HorizontalFirstOfMonthLabelAlignment(value: HorizontalAlignment?):
        Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(145L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(140)
    public override fun get_VerticalFirstOfMonthLabelAlignment(): VerticalAlignment? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(146L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VerticalAlignment>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VerticalAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(141)
    public override fun put_VerticalFirstOfMonthLabelAlignment(value: VerticalAlignment?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(147L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(142)
    public override fun get_CalendarItemBorderThickness(): Thickness? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(148L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(143)
    public override fun put_CalendarItemBorderThickness(value: Thickness?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(149L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(144)
    public override fun get_CalendarViewDayItemStyle(): Style? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(150L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(145)
    public override fun put_CalendarViewDayItemStyle(value: Style?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(151L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(146)
    public override fun get_CalendarItemCornerRadius(): CornerRadius? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(152L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CornerRadius>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CornerRadius>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(147)
    public override fun put_CalendarItemCornerRadius(value: CornerRadius?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(153L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(148)
    public override fun add_CalendarViewDayItemChanging(handler: TypedEventHandler<CalendarView?,
        CalendarViewDayItemChangingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(154L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(149)
    public override fun remove_CalendarViewDayItemChanging(token: EventRegistrationToken?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(155L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(150)
    public override fun add_SelectedDatesChanged(handler: TypedEventHandler<CalendarView?,
        CalendarViewSelectedDatesChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(156L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(151)
    public override fun remove_SelectedDatesChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(157L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(152)
    public override fun SetDisplayDate(date: DateTime?): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(158L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, marshalToNative(date),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(153)
    public override fun SetYearDecadeDisplayDimensions(columns: Int, rows: Int): Unit {
      val fnPtr = _1546504630_VtblPtr!!.getPointer(159L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546504630_Ptr, columns, rows,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICalendarView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1546504630_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICalendarView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e786081eb68056abbfbb52d5b17c365e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICalendarView(ptr: Pointer?): WithDefault = ICalendarView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICalendarView {
      val address = segment.toRawLongValue()
      return makeICalendarView(Pointer(address))
    }

    public override fun toNative(obj: ICalendarView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1546504630_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICalendarView): Array<ICalendarView?> = (elements as
        Array<ICalendarView?>).castToImpl<ICalendarView,ICalendarView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICalendarView?> =
        arrayOfNulls<ICalendarView_Impl>(size) as Array<ICalendarView?>
  }
}
