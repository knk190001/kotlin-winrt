package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyProperty
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICalendarViewStatics.ABI::class)
@Signature("{9553e6fc-e4da-57d4-9472-7f8ed5ff7219}")
@Guid("9553e6fce4da57d494727f8ed5ff7219")
@WinRTInterface("9553e6fce4da57d494727f8ed5ff7219")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICalendarViewStatics.ByReference::class)
public interface ICalendarViewStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CalendarIdentifierProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_DayOfWeekFormatProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_IsGroupLabelVisibleProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_DisplayModeProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_FirstDayOfWeekProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_IsOutOfScopeEnabledProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_IsTodayHighlightedProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_MaxDateProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_MinDateProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_NumberOfWeeksInViewProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun get_SelectedDatesProperty(): DependencyProperty?

  @InterfaceMethod(11)
  public fun get_SelectionModeProperty(): DependencyProperty?

  @InterfaceMethod(12)
  public fun get_TemplateSettingsProperty(): DependencyProperty?

  @InterfaceMethod(13)
  public fun get_FocusBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(14)
  public fun get_SelectedHoverBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(15)
  public fun get_SelectedPressedBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(16)
  public fun get_SelectedDisabledBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(17)
  public fun get_SelectedBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(18)
  public fun get_HoverBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(19)
  public fun get_PressedBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(20)
  public fun get_TodaySelectedInnerBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(21)
  public fun get_BlackoutStrikethroughBrushProperty(): DependencyProperty?

  @InterfaceMethod(22)
  public fun get_CalendarItemBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(23)
  public fun get_BlackoutBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(24)
  public fun get_OutOfScopeBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(25)
  public fun get_CalendarItemBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(26)
  public fun get_CalendarItemHoverBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(27)
  public fun get_CalendarItemPressedBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(28)
  public fun get_CalendarItemDisabledBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(29)
  public fun get_TodayBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(30)
  public fun get_TodayBlackoutBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(31)
  public fun get_TodayHoverBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(32)
  public fun get_TodayPressedBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(33)
  public fun get_TodayDisabledBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(34)
  public fun get_PressedForegroundProperty(): DependencyProperty?

  @InterfaceMethod(35)
  public fun get_TodayForegroundProperty(): DependencyProperty?

  @InterfaceMethod(36)
  public fun get_BlackoutForegroundProperty(): DependencyProperty?

  @InterfaceMethod(37)
  public fun get_TodayBlackoutForegroundProperty(): DependencyProperty?

  @InterfaceMethod(38)
  public fun get_SelectedForegroundProperty(): DependencyProperty?

  @InterfaceMethod(39)
  public fun get_SelectedHoverForegroundProperty(): DependencyProperty?

  @InterfaceMethod(40)
  public fun get_SelectedPressedForegroundProperty(): DependencyProperty?

  @InterfaceMethod(41)
  public fun get_SelectedDisabledForegroundProperty(): DependencyProperty?

  @InterfaceMethod(42)
  public fun get_OutOfScopeForegroundProperty(): DependencyProperty?

  @InterfaceMethod(43)
  public fun get_OutOfScopeHoverForegroundProperty(): DependencyProperty?

  @InterfaceMethod(44)
  public fun get_OutOfScopePressedForegroundProperty(): DependencyProperty?

  @InterfaceMethod(45)
  public fun get_CalendarItemForegroundProperty(): DependencyProperty?

  @InterfaceMethod(46)
  public fun get_DisabledForegroundProperty(): DependencyProperty?

  @InterfaceMethod(47)
  public fun get_DayItemFontFamilyProperty(): DependencyProperty?

  @InterfaceMethod(48)
  public fun get_DayItemFontSizeProperty(): DependencyProperty?

  @InterfaceMethod(49)
  public fun get_DayItemFontStyleProperty(): DependencyProperty?

  @InterfaceMethod(50)
  public fun get_DayItemFontWeightProperty(): DependencyProperty?

  @InterfaceMethod(51)
  public fun get_TodayFontWeightProperty(): DependencyProperty?

  @InterfaceMethod(52)
  public fun get_FirstOfMonthLabelFontFamilyProperty(): DependencyProperty?

  @InterfaceMethod(53)
  public fun get_FirstOfMonthLabelFontSizeProperty(): DependencyProperty?

  @InterfaceMethod(54)
  public fun get_FirstOfMonthLabelFontStyleProperty(): DependencyProperty?

  @InterfaceMethod(55)
  public fun get_FirstOfMonthLabelFontWeightProperty(): DependencyProperty?

  @InterfaceMethod(56)
  public fun get_MonthYearItemFontFamilyProperty(): DependencyProperty?

  @InterfaceMethod(57)
  public fun get_MonthYearItemFontSizeProperty(): DependencyProperty?

  @InterfaceMethod(58)
  public fun get_MonthYearItemFontStyleProperty(): DependencyProperty?

  @InterfaceMethod(59)
  public fun get_MonthYearItemFontWeightProperty(): DependencyProperty?

  @InterfaceMethod(60)
  public fun get_FirstOfYearDecadeLabelFontFamilyProperty(): DependencyProperty?

  @InterfaceMethod(61)
  public fun get_FirstOfYearDecadeLabelFontSizeProperty(): DependencyProperty?

  @InterfaceMethod(62)
  public fun get_FirstOfYearDecadeLabelFontStyleProperty(): DependencyProperty?

  @InterfaceMethod(63)
  public fun get_FirstOfYearDecadeLabelFontWeightProperty(): DependencyProperty?

  @InterfaceMethod(64)
  public fun get_DayItemMarginProperty(): DependencyProperty?

  @InterfaceMethod(65)
  public fun get_MonthYearItemMarginProperty(): DependencyProperty?

  @InterfaceMethod(66)
  public fun get_FirstOfMonthLabelMarginProperty(): DependencyProperty?

  @InterfaceMethod(67)
  public fun get_FirstOfYearDecadeLabelMarginProperty(): DependencyProperty?

  @InterfaceMethod(68)
  public fun get_HorizontalDayItemAlignmentProperty(): DependencyProperty?

  @InterfaceMethod(69)
  public fun get_VerticalDayItemAlignmentProperty(): DependencyProperty?

  @InterfaceMethod(70)
  public fun get_HorizontalFirstOfMonthLabelAlignmentProperty(): DependencyProperty?

  @InterfaceMethod(71)
  public fun get_VerticalFirstOfMonthLabelAlignmentProperty(): DependencyProperty?

  @InterfaceMethod(72)
  public fun get_CalendarItemBorderThicknessProperty(): DependencyProperty?

  @InterfaceMethod(73)
  public fun get_CalendarViewDayItemStyleProperty(): DependencyProperty?

  @InterfaceMethod(74)
  public fun get_CalendarItemCornerRadiusProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICalendarViewStatics> {
    public override fun getValue() = ABI.makeICalendarViewStatics(pointer.getPointer(0))

    public fun setValue(value: ICalendarViewStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICalendarViewStatics {
    public val __1151375899_Ptr: Pointer?

    public val _1151375899_VtblPtr: Pointer?
      get() = __1151375899_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CalendarIdentifierProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DayOfWeekFormatProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsGroupLabelVisibleProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DisplayModeProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_FirstDayOfWeekProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_IsOutOfScopeEnabledProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_IsTodayHighlightedProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_MaxDateProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_MinDateProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_NumberOfWeeksInViewProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_SelectedDatesProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_SelectionModeProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_TemplateSettingsProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_FocusBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_SelectedHoverBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_SelectedPressedBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_SelectedDisabledBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_SelectedBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_HoverBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun get_PressedBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun get_TodaySelectedInnerBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun get_BlackoutStrikethroughBrushProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun get_CalendarItemBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun get_BlackoutBackgroundProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun get_OutOfScopeBackgroundProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun get_CalendarItemBackgroundProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun get_CalendarItemHoverBackgroundProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun get_CalendarItemPressedBackgroundProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun get_CalendarItemDisabledBackgroundProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun get_TodayBackgroundProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun get_TodayBlackoutBackgroundProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun get_TodayHoverBackgroundProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun get_TodayPressedBackgroundProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun get_TodayDisabledBackgroundProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(34)
    public override fun get_PressedForegroundProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun get_TodayForegroundProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(36)
    public override fun get_BlackoutForegroundProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun get_TodayBlackoutForegroundProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(38)
    public override fun get_SelectedForegroundProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun get_SelectedHoverForegroundProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(40)
    public override fun get_SelectedPressedForegroundProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(41)
    public override fun get_SelectedDisabledForegroundProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(42)
    public override fun get_OutOfScopeForegroundProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(43)
    public override fun get_OutOfScopeHoverForegroundProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(44)
    public override fun get_OutOfScopePressedForegroundProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(45)
    public override fun get_CalendarItemForegroundProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(46)
    public override fun get_DisabledForegroundProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(47)
    public override fun get_DayItemFontFamilyProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(48)
    public override fun get_DayItemFontSizeProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(49)
    public override fun get_DayItemFontStyleProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(50)
    public override fun get_DayItemFontWeightProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(51)
    public override fun get_TodayFontWeightProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(52)
    public override fun get_FirstOfMonthLabelFontFamilyProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(53)
    public override fun get_FirstOfMonthLabelFontSizeProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(54)
    public override fun get_FirstOfMonthLabelFontStyleProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(60L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(55)
    public override fun get_FirstOfMonthLabelFontWeightProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(61L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(56)
    public override fun get_MonthYearItemFontFamilyProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(62L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(57)
    public override fun get_MonthYearItemFontSizeProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(63L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(58)
    public override fun get_MonthYearItemFontStyleProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(64L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(59)
    public override fun get_MonthYearItemFontWeightProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(65L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(60)
    public override fun get_FirstOfYearDecadeLabelFontFamilyProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(66L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(61)
    public override fun get_FirstOfYearDecadeLabelFontSizeProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(67L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(62)
    public override fun get_FirstOfYearDecadeLabelFontStyleProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(68L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(63)
    public override fun get_FirstOfYearDecadeLabelFontWeightProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(69L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(64)
    public override fun get_DayItemMarginProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(70L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(65)
    public override fun get_MonthYearItemMarginProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(71L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(66)
    public override fun get_FirstOfMonthLabelMarginProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(72L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(67)
    public override fun get_FirstOfYearDecadeLabelMarginProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(73L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(68)
    public override fun get_HorizontalDayItemAlignmentProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(74L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(69)
    public override fun get_VerticalDayItemAlignmentProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(75L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(70)
    public override fun get_HorizontalFirstOfMonthLabelAlignmentProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(76L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(71)
    public override fun get_VerticalFirstOfMonthLabelAlignmentProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(77L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(72)
    public override fun get_CalendarItemBorderThicknessProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(78L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(73)
    public override fun get_CalendarViewDayItemStyleProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(79L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(74)
    public override fun get_CalendarItemCornerRadiusProperty(): DependencyProperty? {
      val fnPtr = _1151375899_VtblPtr!!.getPointer(80L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1151375899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ICalendarViewStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1151375899_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICalendarViewStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9553e6fce4da57d494727f8ed5ff7219")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICalendarViewStatics(ptr: Pointer?): WithDefault = ICalendarViewStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICalendarViewStatics {
      val address = segment.toRawLongValue()
      return makeICalendarViewStatics(Pointer(address))
    }

    public override fun toNative(obj: ICalendarViewStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1151375899_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICalendarViewStatics): Array<ICalendarViewStatics?> =
        (elements as
        Array<ICalendarViewStatics?>).castToImpl<ICalendarViewStatics,ICalendarViewStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICalendarViewStatics?> =
        arrayOfNulls<ICalendarViewStatics_Impl>(size) as Array<ICalendarViewStatics?>
  }
}
