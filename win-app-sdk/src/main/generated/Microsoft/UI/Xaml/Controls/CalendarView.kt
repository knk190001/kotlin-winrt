package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.ICalendarViewFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CalendarView.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.CalendarView;{e786081e-b680-56ab-bfbb-52d5b17c365e})")
@WinRTByReference(brClass = CalendarView.ByReference::class)
public open class CalendarView(
  ptr: JNAPointer? = NULL
) : Control(ptr), ICalendarView.WithDefault, IWinRTObject {
  private val __1546504630_Interface: ICalendarView.WithDefault by lazy {
    as_1546504630()
  }


  public override val __1546504630_Ptr: JNAPointer? by lazy {
    __1546504630_Interface.__1546504630_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1546504630_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1546504630(): ICalendarView.WithDefault {
    if(pointer == NULL) {
      return(ICalendarView.ABI.makeICalendarView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICalendarView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICalendarView.ABI.makeICalendarView(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<CalendarView> {
    public override fun getValue() = CalendarView(pointer.getPointer(0))

    public fun setValue(value: CalendarView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CalendarView, MemoryAddress> {
    public val ICalendarViewStatics_Instance: ICalendarViewStatics by lazy {
      createICalendarViewStatics()
    }


    public val ICalendarViewFactory_Instance: ICalendarViewFactory by lazy {
      createICalendarViewFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICalendarViewStatics(): ICalendarViewStatics {
      val refiid = Guid.REFIID(ICalendarViewStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.CalendarView".toHandle(),refiid,interfacePtr)
      val result = ICalendarViewStatics.ABI.makeICalendarViewStatics(interfacePtr.value)
      return result
    }

    public fun createICalendarViewFactory(): ICalendarViewFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.CalendarView".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICalendarViewFactory.ABI.makeICalendarViewFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ICalendarViewFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): CalendarView {
      val address = segment.toRawLongValue()
      return CalendarView(Pointer(address))
    }

    public override fun toNative(obj: CalendarView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CalendarIdentifierProperty() =
        ABI.ICalendarViewStatics_Instance.get_CalendarIdentifierProperty()

    public fun get_DayOfWeekFormatProperty() =
        ABI.ICalendarViewStatics_Instance.get_DayOfWeekFormatProperty()

    public fun get_IsGroupLabelVisibleProperty() =
        ABI.ICalendarViewStatics_Instance.get_IsGroupLabelVisibleProperty()

    public fun get_DisplayModeProperty() =
        ABI.ICalendarViewStatics_Instance.get_DisplayModeProperty()

    public fun get_FirstDayOfWeekProperty() =
        ABI.ICalendarViewStatics_Instance.get_FirstDayOfWeekProperty()

    public fun get_IsOutOfScopeEnabledProperty() =
        ABI.ICalendarViewStatics_Instance.get_IsOutOfScopeEnabledProperty()

    public fun get_IsTodayHighlightedProperty() =
        ABI.ICalendarViewStatics_Instance.get_IsTodayHighlightedProperty()

    public fun get_MaxDateProperty() = ABI.ICalendarViewStatics_Instance.get_MaxDateProperty()

    public fun get_MinDateProperty() = ABI.ICalendarViewStatics_Instance.get_MinDateProperty()

    public fun get_NumberOfWeeksInViewProperty() =
        ABI.ICalendarViewStatics_Instance.get_NumberOfWeeksInViewProperty()

    public fun get_SelectedDatesProperty() =
        ABI.ICalendarViewStatics_Instance.get_SelectedDatesProperty()

    public fun get_SelectionModeProperty() =
        ABI.ICalendarViewStatics_Instance.get_SelectionModeProperty()

    public fun get_TemplateSettingsProperty() =
        ABI.ICalendarViewStatics_Instance.get_TemplateSettingsProperty()

    public fun get_FocusBorderBrushProperty() =
        ABI.ICalendarViewStatics_Instance.get_FocusBorderBrushProperty()

    public fun get_SelectedHoverBorderBrushProperty() =
        ABI.ICalendarViewStatics_Instance.get_SelectedHoverBorderBrushProperty()

    public fun get_SelectedPressedBorderBrushProperty() =
        ABI.ICalendarViewStatics_Instance.get_SelectedPressedBorderBrushProperty()

    public fun get_SelectedDisabledBorderBrushProperty() =
        ABI.ICalendarViewStatics_Instance.get_SelectedDisabledBorderBrushProperty()

    public fun get_SelectedBorderBrushProperty() =
        ABI.ICalendarViewStatics_Instance.get_SelectedBorderBrushProperty()

    public fun get_HoverBorderBrushProperty() =
        ABI.ICalendarViewStatics_Instance.get_HoverBorderBrushProperty()

    public fun get_PressedBorderBrushProperty() =
        ABI.ICalendarViewStatics_Instance.get_PressedBorderBrushProperty()

    public fun get_TodaySelectedInnerBorderBrushProperty() =
        ABI.ICalendarViewStatics_Instance.get_TodaySelectedInnerBorderBrushProperty()

    public fun get_BlackoutStrikethroughBrushProperty() =
        ABI.ICalendarViewStatics_Instance.get_BlackoutStrikethroughBrushProperty()

    public fun get_CalendarItemBorderBrushProperty() =
        ABI.ICalendarViewStatics_Instance.get_CalendarItemBorderBrushProperty()

    public fun get_BlackoutBackgroundProperty() =
        ABI.ICalendarViewStatics_Instance.get_BlackoutBackgroundProperty()

    public fun get_OutOfScopeBackgroundProperty() =
        ABI.ICalendarViewStatics_Instance.get_OutOfScopeBackgroundProperty()

    public fun get_CalendarItemBackgroundProperty() =
        ABI.ICalendarViewStatics_Instance.get_CalendarItemBackgroundProperty()

    public fun get_CalendarItemHoverBackgroundProperty() =
        ABI.ICalendarViewStatics_Instance.get_CalendarItemHoverBackgroundProperty()

    public fun get_CalendarItemPressedBackgroundProperty() =
        ABI.ICalendarViewStatics_Instance.get_CalendarItemPressedBackgroundProperty()

    public fun get_CalendarItemDisabledBackgroundProperty() =
        ABI.ICalendarViewStatics_Instance.get_CalendarItemDisabledBackgroundProperty()

    public fun get_TodayBackgroundProperty() =
        ABI.ICalendarViewStatics_Instance.get_TodayBackgroundProperty()

    public fun get_TodayBlackoutBackgroundProperty() =
        ABI.ICalendarViewStatics_Instance.get_TodayBlackoutBackgroundProperty()

    public fun get_TodayHoverBackgroundProperty() =
        ABI.ICalendarViewStatics_Instance.get_TodayHoverBackgroundProperty()

    public fun get_TodayPressedBackgroundProperty() =
        ABI.ICalendarViewStatics_Instance.get_TodayPressedBackgroundProperty()

    public fun get_TodayDisabledBackgroundProperty() =
        ABI.ICalendarViewStatics_Instance.get_TodayDisabledBackgroundProperty()

    public fun get_PressedForegroundProperty() =
        ABI.ICalendarViewStatics_Instance.get_PressedForegroundProperty()

    public fun get_TodayForegroundProperty() =
        ABI.ICalendarViewStatics_Instance.get_TodayForegroundProperty()

    public fun get_BlackoutForegroundProperty() =
        ABI.ICalendarViewStatics_Instance.get_BlackoutForegroundProperty()

    public fun get_TodayBlackoutForegroundProperty() =
        ABI.ICalendarViewStatics_Instance.get_TodayBlackoutForegroundProperty()

    public fun get_SelectedForegroundProperty() =
        ABI.ICalendarViewStatics_Instance.get_SelectedForegroundProperty()

    public fun get_SelectedHoverForegroundProperty() =
        ABI.ICalendarViewStatics_Instance.get_SelectedHoverForegroundProperty()

    public fun get_SelectedPressedForegroundProperty() =
        ABI.ICalendarViewStatics_Instance.get_SelectedPressedForegroundProperty()

    public fun get_SelectedDisabledForegroundProperty() =
        ABI.ICalendarViewStatics_Instance.get_SelectedDisabledForegroundProperty()

    public fun get_OutOfScopeForegroundProperty() =
        ABI.ICalendarViewStatics_Instance.get_OutOfScopeForegroundProperty()

    public fun get_OutOfScopeHoverForegroundProperty() =
        ABI.ICalendarViewStatics_Instance.get_OutOfScopeHoverForegroundProperty()

    public fun get_OutOfScopePressedForegroundProperty() =
        ABI.ICalendarViewStatics_Instance.get_OutOfScopePressedForegroundProperty()

    public fun get_CalendarItemForegroundProperty() =
        ABI.ICalendarViewStatics_Instance.get_CalendarItemForegroundProperty()

    public fun get_DisabledForegroundProperty() =
        ABI.ICalendarViewStatics_Instance.get_DisabledForegroundProperty()

    public fun get_DayItemFontFamilyProperty() =
        ABI.ICalendarViewStatics_Instance.get_DayItemFontFamilyProperty()

    public fun get_DayItemFontSizeProperty() =
        ABI.ICalendarViewStatics_Instance.get_DayItemFontSizeProperty()

    public fun get_DayItemFontStyleProperty() =
        ABI.ICalendarViewStatics_Instance.get_DayItemFontStyleProperty()

    public fun get_DayItemFontWeightProperty() =
        ABI.ICalendarViewStatics_Instance.get_DayItemFontWeightProperty()

    public fun get_TodayFontWeightProperty() =
        ABI.ICalendarViewStatics_Instance.get_TodayFontWeightProperty()

    public fun get_FirstOfMonthLabelFontFamilyProperty() =
        ABI.ICalendarViewStatics_Instance.get_FirstOfMonthLabelFontFamilyProperty()

    public fun get_FirstOfMonthLabelFontSizeProperty() =
        ABI.ICalendarViewStatics_Instance.get_FirstOfMonthLabelFontSizeProperty()

    public fun get_FirstOfMonthLabelFontStyleProperty() =
        ABI.ICalendarViewStatics_Instance.get_FirstOfMonthLabelFontStyleProperty()

    public fun get_FirstOfMonthLabelFontWeightProperty() =
        ABI.ICalendarViewStatics_Instance.get_FirstOfMonthLabelFontWeightProperty()

    public fun get_MonthYearItemFontFamilyProperty() =
        ABI.ICalendarViewStatics_Instance.get_MonthYearItemFontFamilyProperty()

    public fun get_MonthYearItemFontSizeProperty() =
        ABI.ICalendarViewStatics_Instance.get_MonthYearItemFontSizeProperty()

    public fun get_MonthYearItemFontStyleProperty() =
        ABI.ICalendarViewStatics_Instance.get_MonthYearItemFontStyleProperty()

    public fun get_MonthYearItemFontWeightProperty() =
        ABI.ICalendarViewStatics_Instance.get_MonthYearItemFontWeightProperty()

    public fun get_FirstOfYearDecadeLabelFontFamilyProperty() =
        ABI.ICalendarViewStatics_Instance.get_FirstOfYearDecadeLabelFontFamilyProperty()

    public fun get_FirstOfYearDecadeLabelFontSizeProperty() =
        ABI.ICalendarViewStatics_Instance.get_FirstOfYearDecadeLabelFontSizeProperty()

    public fun get_FirstOfYearDecadeLabelFontStyleProperty() =
        ABI.ICalendarViewStatics_Instance.get_FirstOfYearDecadeLabelFontStyleProperty()

    public fun get_FirstOfYearDecadeLabelFontWeightProperty() =
        ABI.ICalendarViewStatics_Instance.get_FirstOfYearDecadeLabelFontWeightProperty()

    public fun get_DayItemMarginProperty() =
        ABI.ICalendarViewStatics_Instance.get_DayItemMarginProperty()

    public fun get_MonthYearItemMarginProperty() =
        ABI.ICalendarViewStatics_Instance.get_MonthYearItemMarginProperty()

    public fun get_FirstOfMonthLabelMarginProperty() =
        ABI.ICalendarViewStatics_Instance.get_FirstOfMonthLabelMarginProperty()

    public fun get_FirstOfYearDecadeLabelMarginProperty() =
        ABI.ICalendarViewStatics_Instance.get_FirstOfYearDecadeLabelMarginProperty()

    public fun get_HorizontalDayItemAlignmentProperty() =
        ABI.ICalendarViewStatics_Instance.get_HorizontalDayItemAlignmentProperty()

    public fun get_VerticalDayItemAlignmentProperty() =
        ABI.ICalendarViewStatics_Instance.get_VerticalDayItemAlignmentProperty()

    public fun get_HorizontalFirstOfMonthLabelAlignmentProperty() =
        ABI.ICalendarViewStatics_Instance.get_HorizontalFirstOfMonthLabelAlignmentProperty()

    public fun get_VerticalFirstOfMonthLabelAlignmentProperty() =
        ABI.ICalendarViewStatics_Instance.get_VerticalFirstOfMonthLabelAlignmentProperty()

    public fun get_CalendarItemBorderThicknessProperty() =
        ABI.ICalendarViewStatics_Instance.get_CalendarItemBorderThicknessProperty()

    public fun get_CalendarViewDayItemStyleProperty() =
        ABI.ICalendarViewStatics_Instance.get_CalendarViewDayItemStyleProperty()

    public fun get_CalendarItemCornerRadiusProperty() =
        ABI.ICalendarViewStatics_Instance.get_CalendarItemCornerRadiusProperty()
  }
}
