package Windows.UI.Xaml.Core.Direct

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.JAVA_INT
import kotlin.Any
import kotlin.Int
import kotlin.Unit

@ABIMarker(XamlEventIndex.ABI::class)
@Signature("enum(Windows.UI.Xaml.Core.Direct.XamlEventIndex;i4)")
@WinRTByReference(brClass = XamlEventIndex.ByReference::class)
public enum class XamlEventIndex(
  public val value: Int
) : NativeMapped {
  FrameworkElement_DataContextChanged(16),
  FrameworkElement_SizeChanged(17),
  FrameworkElement_LayoutUpdated(18),
  UIElement_KeyUp(22),
  UIElement_KeyDown(23),
  UIElement_GotFocus(24),
  UIElement_LostFocus(25),
  UIElement_DragStarting(26),
  UIElement_DropCompleted(27),
  UIElement_CharacterReceived(28),
  UIElement_DragEnter(29),
  UIElement_DragLeave(30),
  UIElement_DragOver(31),
  UIElement_Drop(32),
  UIElement_PointerPressed(38),
  UIElement_PointerMoved(39),
  UIElement_PointerReleased(40),
  UIElement_PointerEntered(41),
  UIElement_PointerExited(42),
  UIElement_PointerCaptureLost(43),
  UIElement_PointerCanceled(44),
  UIElement_PointerWheelChanged(45),
  UIElement_Tapped(46),
  UIElement_DoubleTapped(47),
  UIElement_Holding(48),
  UIElement_ContextRequested(49),
  UIElement_ContextCanceled(50),
  UIElement_RightTapped(51),
  UIElement_ManipulationStarting(52),
  UIElement_ManipulationInertiaStarting(53),
  UIElement_ManipulationStarted(54),
  UIElement_ManipulationDelta(55),
  UIElement_ManipulationCompleted(56),
  UIElement_ProcessKeyboardAccelerators(60),
  UIElement_GettingFocus(61),
  UIElement_LosingFocus(62),
  UIElement_NoFocusCandidateFound(63),
  UIElement_PreviewKeyDown(64),
  UIElement_PreviewKeyUp(65),
  UIElement_BringIntoViewRequested(66),
  AppBar_Opening(109),
  AppBar_Opened(110),
  AppBar_Closing(111),
  AppBar_Closed(112),
  AutoSuggestBox_SuggestionChosen(113),
  AutoSuggestBox_TextChanged(114),
  AutoSuggestBox_QuerySubmitted(115),
  CalendarDatePicker_CalendarViewDayItemChanging(116),
  CalendarDatePicker_DateChanged(117),
  CalendarDatePicker_Opened(118),
  CalendarDatePicker_Closed(119),
  CalendarView_CalendarViewDayItemChanging(120),
  CalendarView_SelectedDatesChanged(121),
  ComboBox_DropDownClosed(122),
  ComboBox_DropDownOpened(123),
  CommandBar_DynamicOverflowItemsChanging(124),
  ContentDialog_Closing(126),
  ContentDialog_Closed(127),
  ContentDialog_Opened(128),
  ContentDialog_PrimaryButtonClick(129),
  ContentDialog_SecondaryButtonClick(130),
  ContentDialog_CloseButtonClick(131),
  Control_FocusEngaged(132),
  Control_FocusDisengaged(133),
  DatePicker_DateChanged(135),
  Frame_Navigated(136),
  Frame_Navigating(137),
  Frame_NavigationFailed(138),
  Frame_NavigationStopped(139),
  Hub_SectionHeaderClick(143),
  Hub_SectionsInViewChanged(144),
  ItemsPresenter_HorizontalSnapPointsChanged(148),
  ItemsPresenter_VerticalSnapPointsChanged(149),
  ListViewBase_ItemClick(150),
  ListViewBase_DragItemsStarting(151),
  ListViewBase_DragItemsCompleted(152),
  ListViewBase_ContainerContentChanging(153),
  ListViewBase_ChoosingItemContainer(154),
  ListViewBase_ChoosingGroupHeaderContainer(155),
  MediaTransportControls_ThumbnailRequested(167),
  MenuFlyoutItem_Click(168),
  RichEditBox_TextChanging(177),
  ScrollViewer_ViewChanging(192),
  ScrollViewer_ViewChanged(193),
  ScrollViewer_DirectManipulationStarted(194),
  ScrollViewer_DirectManipulationCompleted(195),
  SearchBox_QueryChanged(196),
  SearchBox_SuggestionsRequested(197),
  SearchBox_QuerySubmitted(198),
  SearchBox_ResultSuggestionChosen(199),
  SearchBox_PrepareForFocusOnKeyboardInput(200),
  SemanticZoom_ViewChangeStarted(201),
  SemanticZoom_ViewChangeCompleted(202),
  SettingsFlyout_BackClick(203),
  StackPanel_HorizontalSnapPointsChanged(208),
  StackPanel_VerticalSnapPointsChanged(209),
  TimePicker_TimeChanged(227),
  ToggleSwitch_Toggled(228),
  ToolTip_Closed(229),
  ToolTip_Opened(230),
  VirtualizingStackPanel_CleanUpVirtualizedItemEvent(231),
  WebView_SeparateProcessLost(232),
  WebView_LoadCompleted(233),
  WebView_ScriptNotify(234),
  WebView_NavigationFailed(235),
  WebView_NavigationStarting(236),
  WebView_ContentLoading(237),
  WebView_DOMContentLoaded(238),
  WebView_NavigationCompleted(239),
  WebView_FrameNavigationStarting(240),
  WebView_FrameContentLoading(241),
  WebView_FrameDOMContentLoaded(242),
  WebView_FrameNavigationCompleted(243),
  WebView_LongRunningScriptDetected(244),
  WebView_UnsafeContentWarningDisplaying(245),
  WebView_UnviewableContentIdentified(246),
  WebView_ContainsFullScreenElementChanged(247),
  WebView_UnsupportedUriSchemeIdentified(248),
  WebView_NewWindowRequested(249),
  WebView_PermissionRequested(250),
  ButtonBase_Click(256),
  CarouselPanel_HorizontalSnapPointsChanged(257),
  CarouselPanel_VerticalSnapPointsChanged(258),
  OrientedVirtualizingPanel_HorizontalSnapPointsChanged(263),
  OrientedVirtualizingPanel_VerticalSnapPointsChanged(264),
  RangeBase_ValueChanged(267),
  ScrollBar_Scroll(268),
  Selector_SelectionChanged(269),
  Thumb_DragStarted(270),
  Thumb_DragDelta(271),
  Thumb_DragCompleted(272),
  ToggleButton_Checked(273),
  ToggleButton_Unchecked(274),
  ToggleButton_Indeterminate(275),
  WebView_WebResourceRequested(283),
  ScrollViewer_AnchorRequested(291),
  DatePicker_SelectedDateChanged(322),
  TimePicker_SelectedTimeChanged(323),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      XamlEventIndex {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      16 -> FrameworkElement_DataContextChanged
      17 -> FrameworkElement_SizeChanged
      18 -> FrameworkElement_LayoutUpdated
      22 -> UIElement_KeyUp
      23 -> UIElement_KeyDown
      24 -> UIElement_GotFocus
      25 -> UIElement_LostFocus
      26 -> UIElement_DragStarting
      27 -> UIElement_DropCompleted
      28 -> UIElement_CharacterReceived
      29 -> UIElement_DragEnter
      30 -> UIElement_DragLeave
      31 -> UIElement_DragOver
      32 -> UIElement_Drop
      38 -> UIElement_PointerPressed
      39 -> UIElement_PointerMoved
      40 -> UIElement_PointerReleased
      41 -> UIElement_PointerEntered
      42 -> UIElement_PointerExited
      43 -> UIElement_PointerCaptureLost
      44 -> UIElement_PointerCanceled
      45 -> UIElement_PointerWheelChanged
      46 -> UIElement_Tapped
      47 -> UIElement_DoubleTapped
      48 -> UIElement_Holding
      49 -> UIElement_ContextRequested
      50 -> UIElement_ContextCanceled
      51 -> UIElement_RightTapped
      52 -> UIElement_ManipulationStarting
      53 -> UIElement_ManipulationInertiaStarting
      54 -> UIElement_ManipulationStarted
      55 -> UIElement_ManipulationDelta
      56 -> UIElement_ManipulationCompleted
      60 -> UIElement_ProcessKeyboardAccelerators
      61 -> UIElement_GettingFocus
      62 -> UIElement_LosingFocus
      63 -> UIElement_NoFocusCandidateFound
      64 -> UIElement_PreviewKeyDown
      65 -> UIElement_PreviewKeyUp
      66 -> UIElement_BringIntoViewRequested
      109 -> AppBar_Opening
      110 -> AppBar_Opened
      111 -> AppBar_Closing
      112 -> AppBar_Closed
      113 -> AutoSuggestBox_SuggestionChosen
      114 -> AutoSuggestBox_TextChanged
      115 -> AutoSuggestBox_QuerySubmitted
      116 -> CalendarDatePicker_CalendarViewDayItemChanging
      117 -> CalendarDatePicker_DateChanged
      118 -> CalendarDatePicker_Opened
      119 -> CalendarDatePicker_Closed
      120 -> CalendarView_CalendarViewDayItemChanging
      121 -> CalendarView_SelectedDatesChanged
      122 -> ComboBox_DropDownClosed
      123 -> ComboBox_DropDownOpened
      124 -> CommandBar_DynamicOverflowItemsChanging
      126 -> ContentDialog_Closing
      127 -> ContentDialog_Closed
      128 -> ContentDialog_Opened
      129 -> ContentDialog_PrimaryButtonClick
      130 -> ContentDialog_SecondaryButtonClick
      131 -> ContentDialog_CloseButtonClick
      132 -> Control_FocusEngaged
      133 -> Control_FocusDisengaged
      135 -> DatePicker_DateChanged
      136 -> Frame_Navigated
      137 -> Frame_Navigating
      138 -> Frame_NavigationFailed
      139 -> Frame_NavigationStopped
      143 -> Hub_SectionHeaderClick
      144 -> Hub_SectionsInViewChanged
      148 -> ItemsPresenter_HorizontalSnapPointsChanged
      149 -> ItemsPresenter_VerticalSnapPointsChanged
      150 -> ListViewBase_ItemClick
      151 -> ListViewBase_DragItemsStarting
      152 -> ListViewBase_DragItemsCompleted
      153 -> ListViewBase_ContainerContentChanging
      154 -> ListViewBase_ChoosingItemContainer
      155 -> ListViewBase_ChoosingGroupHeaderContainer
      167 -> MediaTransportControls_ThumbnailRequested
      168 -> MenuFlyoutItem_Click
      177 -> RichEditBox_TextChanging
      192 -> ScrollViewer_ViewChanging
      193 -> ScrollViewer_ViewChanged
      194 -> ScrollViewer_DirectManipulationStarted
      195 -> ScrollViewer_DirectManipulationCompleted
      196 -> SearchBox_QueryChanged
      197 -> SearchBox_SuggestionsRequested
      198 -> SearchBox_QuerySubmitted
      199 -> SearchBox_ResultSuggestionChosen
      200 -> SearchBox_PrepareForFocusOnKeyboardInput
      201 -> SemanticZoom_ViewChangeStarted
      202 -> SemanticZoom_ViewChangeCompleted
      203 -> SettingsFlyout_BackClick
      208 -> StackPanel_HorizontalSnapPointsChanged
      209 -> StackPanel_VerticalSnapPointsChanged
      227 -> TimePicker_TimeChanged
      228 -> ToggleSwitch_Toggled
      229 -> ToolTip_Closed
      230 -> ToolTip_Opened
      231 -> VirtualizingStackPanel_CleanUpVirtualizedItemEvent
      232 -> WebView_SeparateProcessLost
      233 -> WebView_LoadCompleted
      234 -> WebView_ScriptNotify
      235 -> WebView_NavigationFailed
      236 -> WebView_NavigationStarting
      237 -> WebView_ContentLoading
      238 -> WebView_DOMContentLoaded
      239 -> WebView_NavigationCompleted
      240 -> WebView_FrameNavigationStarting
      241 -> WebView_FrameContentLoading
      242 -> WebView_FrameDOMContentLoaded
      243 -> WebView_FrameNavigationCompleted
      244 -> WebView_LongRunningScriptDetected
      245 -> WebView_UnsafeContentWarningDisplaying
      246 -> WebView_UnviewableContentIdentified
      247 -> WebView_ContainsFullScreenElementChanged
      248 -> WebView_UnsupportedUriSchemeIdentified
      249 -> WebView_NewWindowRequested
      250 -> WebView_PermissionRequested
      256 -> ButtonBase_Click
      257 -> CarouselPanel_HorizontalSnapPointsChanged
      258 -> CarouselPanel_VerticalSnapPointsChanged
      263 -> OrientedVirtualizingPanel_HorizontalSnapPointsChanged
      264 -> OrientedVirtualizingPanel_VerticalSnapPointsChanged
      267 -> RangeBase_ValueChanged
      268 -> ScrollBar_Scroll
      269 -> Selector_SelectionChanged
      270 -> Thumb_DragStarted
      271 -> Thumb_DragDelta
      272 -> Thumb_DragCompleted
      273 -> ToggleButton_Checked
      274 -> ToggleButton_Unchecked
      275 -> ToggleButton_Indeterminate
      283 -> WebView_WebResourceRequested
      291 -> ScrollViewer_AnchorRequested
      322 -> DatePicker_SelectedDateChanged
      323 -> TimePicker_SelectedTimeChanged
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<XamlEventIndex> {
    public fun setValue(newValue: XamlEventIndex): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): XamlEventIndex =
        XamlEventIndex.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<XamlEventIndex, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): XamlEventIndex =
        XamlEventIndex.values()[0].fromNative(value, null)

    public override fun toNative(obj: XamlEventIndex): Int = obj.value
  }
}
