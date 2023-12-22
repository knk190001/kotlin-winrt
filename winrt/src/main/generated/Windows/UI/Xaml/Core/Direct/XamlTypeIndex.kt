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

@ABIMarker(XamlTypeIndex.ABI::class)
@Signature("enum(Windows.UI.Xaml.Core.Direct.XamlTypeIndex;i4)")
@WinRTByReference(brClass = XamlTypeIndex.ByReference::class)
public enum class XamlTypeIndex(
  public val value: Int
) : NativeMapped {
  AutoSuggestBoxSuggestionChosenEventArgs(34),
  AutoSuggestBoxTextChangedEventArgs(35),
  CollectionViewSource(41),
  ColumnDefinition(44),
  GradientStop(64),
  InputScope(74),
  InputScopeName(75),
  KeySpline(78),
  PathFigure(93),
  PrintDocument(100),
  RowDefinition(106),
  Style(114),
  TimelineMarker(126),
  VisualState(137),
  VisualStateGroup(138),
  VisualStateManager(139),
  VisualTransition(140),
  AddDeleteThemeTransition(177),
  ArcSegment(178),
  BackEase(179),
  BeginStoryboard(180),
  BezierSegment(181),
  BindingBase(182),
  BitmapCache(183),
  BounceEase(186),
  CircleEase(187),
  ColorAnimation(188),
  ColorAnimationUsingKeyFrames(189),
  ContentThemeTransition(190),
  ControlTemplate(191),
  CubicEase(192),
  DataTemplate(194),
  DiscreteColorKeyFrame(195),
  DiscreteDoubleKeyFrame(196),
  DiscreteObjectKeyFrame(197),
  DiscretePointKeyFrame(198),
  DoubleAnimation(200),
  DoubleAnimationUsingKeyFrames(201),
  EasingColorKeyFrame(204),
  EasingDoubleKeyFrame(205),
  EasingPointKeyFrame(206),
  EdgeUIThemeTransition(207),
  ElasticEase(208),
  EllipseGeometry(209),
  EntranceThemeTransition(210),
  EventTrigger(211),
  ExponentialEase(212),
  Flyout(213),
  GeometryGroup(216),
  ItemsPanelTemplate(227),
  LinearColorKeyFrame(230),
  LinearDoubleKeyFrame(231),
  LinearPointKeyFrame(232),
  LineGeometry(233),
  LineSegment(234),
  Matrix3DProjection(236),
  MenuFlyout(238),
  ObjectAnimationUsingKeyFrames(240),
  PaneThemeTransition(241),
  PathGeometry(243),
  PlaneProjection(244),
  PointAnimation(245),
  PointAnimationUsingKeyFrames(246),
  PolyBezierSegment(248),
  PolyLineSegment(249),
  PolyQuadraticBezierSegment(250),
  PopupThemeTransition(251),
  PowerEase(252),
  QuadraticBezierSegment(254),
  QuadraticEase(255),
  QuarticEase(256),
  QuinticEase(257),
  RectangleGeometry(258),
  RelativeSource(259),
  RenderTargetBitmap(260),
  ReorderThemeTransition(261),
  RepositionThemeTransition(262),
  Setter(263),
  SineEase(264),
  SolidColorBrush(265),
  SplineColorKeyFrame(266),
  SplineDoubleKeyFrame(267),
  SplinePointKeyFrame(268),
  BitmapImage(285),
  Border(286),
  CaptureElement(288),
  CompositeTransform(295),
  ContentPresenter(296),
  DragItemThemeAnimation(302),
  DragOverThemeAnimation(303),
  DropTargetItemThemeAnimation(304),
  FadeInThemeAnimation(306),
  FadeOutThemeAnimation(307),
  Glyphs(312),
  Image(326),
  ImageBrush(328),
  InlineUIContainer(329),
  ItemsPresenter(332),
  LinearGradientBrush(334),
  LineBreak(335),
  MatrixTransform(340),
  MediaElement(342),
  Paragraph(349),
  PointerDownThemeAnimation(357),
  PointerUpThemeAnimation(359),
  PopInThemeAnimation(361),
  PopOutThemeAnimation(362),
  Popup(363),
  RepositionThemeAnimation(370),
  ResourceDictionary(371),
  RichTextBlock(374),
  RichTextBlockOverflow(376),
  RotateTransform(378),
  Run(380),
  ScaleTransform(381),
  SkewTransform(389),
  Span(390),
  SplitCloseThemeAnimation(391),
  SplitOpenThemeAnimation(392),
  Storyboard(393),
  SwipeBackThemeAnimation(394),
  SwipeHintThemeAnimation(395),
  TextBlock(396),
  TransformGroup(411),
  TranslateTransform(413),
  Viewbox(417),
  WebViewBrush(423),
  AppBarSeparator(427),
  BitmapIcon(429),
  Bold(430),
  Canvas(432),
  ContentControl(435),
  DatePicker(436),
  DependencyObjectCollection(437),
  Ellipse(438),
  FontIcon(440),
  Grid(442),
  Hub(445),
  HubSection(446),
  Hyperlink(447),
  Italic(449),
  ItemsControl(451),
  Line(452),
  MediaTransportControls(458),
  PasswordBox(462),
  Path(463),
  PathIcon(464),
  Polygon(465),
  Polyline(466),
  ProgressRing(468),
  Rectangle(470),
  RichEditBox(473),
  ScrollContentPresenter(476),
  SearchBox(477),
  SemanticZoom(479),
  StackPanel(481),
  SymbolIcon(482),
  TextBox(483),
  Thumb(485),
  TickBar(486),
  TimePicker(487),
  ToggleSwitch(489),
  Underline(490),
  UserControl(491),
  VariableSizedWrapGrid(492),
  WebView(494),
  AppBar(495),
  AutoSuggestBox(499),
  CarouselPanel(502),
  ContentDialog(506),
  FlyoutPresenter(508),
  Frame(509),
  GridViewItemPresenter(511),
  GroupItem(512),
  ItemsStackPanel(514),
  ItemsWrapGrid(515),
  ListViewItemPresenter(520),
  MenuFlyoutItem(521),
  MenuFlyoutPresenter(522),
  MenuFlyoutSeparator(523),
  Page(525),
  ProgressBar(528),
  ScrollBar(530),
  SettingsFlyout(533),
  Slider(534),
  SwapChainBackgroundPanel(535),
  SwapChainPanel(536),
  ToolTip(538),
  Button(540),
  ComboBoxItem(541),
  CommandBar(542),
  FlipViewItem(543),
  GridViewHeaderItem(545),
  HyperlinkButton(546),
  ListBoxItem(547),
  ListViewHeaderItem(550),
  RepeatButton(551),
  ScrollViewer(552),
  ToggleButton(553),
  ToggleMenuFlyoutItem(554),
  VirtualizingStackPanel(555),
  WrapGrid(556),
  AppBarButton(557),
  AppBarToggleButton(558),
  CheckBox(559),
  GridViewItem(560),
  ListViewItem(561),
  RadioButton(562),
  Binding(564),
  ComboBox(566),
  FlipView(567),
  ListBox(568),
  GridView(570),
  ListView(571),
  CalendarView(707),
  CalendarViewDayItem(709),
  CalendarPanel(723),
  SplitView(728),
  CompositeTransform3D(732),
  PerspectiveTransform3D(733),
  RelativePanel(744),
  InkCanvas(748),
  MenuFlyoutSubItem(749),
  AdaptiveTrigger(757),
  SoftwareBitmapSource(761),
  StateTrigger(767),
  CalendarDatePicker(774),
  AutoSuggestBoxQuerySubmittedEventArgs(778),
  CommandBarOverflowPresenter(781),
  DrillInThemeAnimation(782),
  DrillOutThemeAnimation(783),
  AutomationAnnotation(789),
  AutomationPeerAnnotation(790),
  MediaPlayerPresenter(828),
  MediaPlayerElement(829),
  XamlLight(855),
  SvgImageSource(860),
  KeyboardAccelerator(897),
  HandwritingView(920),
  ContentLink(925),
  BitmapIconSource(929),
  FontIconSource(930),
  PathIconSource(931),
  SymbolIconSource(933),
  IconSourceElement(939),
  AppBarElementContainer(945),
  ColorPaletteResources(952),
  StandardUICommand(961),
  ThemeShadow(964),
  XamlUICommand(969),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      XamlTypeIndex {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      34 -> AutoSuggestBoxSuggestionChosenEventArgs
      35 -> AutoSuggestBoxTextChangedEventArgs
      41 -> CollectionViewSource
      44 -> ColumnDefinition
      64 -> GradientStop
      74 -> InputScope
      75 -> InputScopeName
      78 -> KeySpline
      93 -> PathFigure
      100 -> PrintDocument
      106 -> RowDefinition
      114 -> Style
      126 -> TimelineMarker
      137 -> VisualState
      138 -> VisualStateGroup
      139 -> VisualStateManager
      140 -> VisualTransition
      177 -> AddDeleteThemeTransition
      178 -> ArcSegment
      179 -> BackEase
      180 -> BeginStoryboard
      181 -> BezierSegment
      182 -> BindingBase
      183 -> BitmapCache
      186 -> BounceEase
      187 -> CircleEase
      188 -> ColorAnimation
      189 -> ColorAnimationUsingKeyFrames
      190 -> ContentThemeTransition
      191 -> ControlTemplate
      192 -> CubicEase
      194 -> DataTemplate
      195 -> DiscreteColorKeyFrame
      196 -> DiscreteDoubleKeyFrame
      197 -> DiscreteObjectKeyFrame
      198 -> DiscretePointKeyFrame
      200 -> DoubleAnimation
      201 -> DoubleAnimationUsingKeyFrames
      204 -> EasingColorKeyFrame
      205 -> EasingDoubleKeyFrame
      206 -> EasingPointKeyFrame
      207 -> EdgeUIThemeTransition
      208 -> ElasticEase
      209 -> EllipseGeometry
      210 -> EntranceThemeTransition
      211 -> EventTrigger
      212 -> ExponentialEase
      213 -> Flyout
      216 -> GeometryGroup
      227 -> ItemsPanelTemplate
      230 -> LinearColorKeyFrame
      231 -> LinearDoubleKeyFrame
      232 -> LinearPointKeyFrame
      233 -> LineGeometry
      234 -> LineSegment
      236 -> Matrix3DProjection
      238 -> MenuFlyout
      240 -> ObjectAnimationUsingKeyFrames
      241 -> PaneThemeTransition
      243 -> PathGeometry
      244 -> PlaneProjection
      245 -> PointAnimation
      246 -> PointAnimationUsingKeyFrames
      248 -> PolyBezierSegment
      249 -> PolyLineSegment
      250 -> PolyQuadraticBezierSegment
      251 -> PopupThemeTransition
      252 -> PowerEase
      254 -> QuadraticBezierSegment
      255 -> QuadraticEase
      256 -> QuarticEase
      257 -> QuinticEase
      258 -> RectangleGeometry
      259 -> RelativeSource
      260 -> RenderTargetBitmap
      261 -> ReorderThemeTransition
      262 -> RepositionThemeTransition
      263 -> Setter
      264 -> SineEase
      265 -> SolidColorBrush
      266 -> SplineColorKeyFrame
      267 -> SplineDoubleKeyFrame
      268 -> SplinePointKeyFrame
      285 -> BitmapImage
      286 -> Border
      288 -> CaptureElement
      295 -> CompositeTransform
      296 -> ContentPresenter
      302 -> DragItemThemeAnimation
      303 -> DragOverThemeAnimation
      304 -> DropTargetItemThemeAnimation
      306 -> FadeInThemeAnimation
      307 -> FadeOutThemeAnimation
      312 -> Glyphs
      326 -> Image
      328 -> ImageBrush
      329 -> InlineUIContainer
      332 -> ItemsPresenter
      334 -> LinearGradientBrush
      335 -> LineBreak
      340 -> MatrixTransform
      342 -> MediaElement
      349 -> Paragraph
      357 -> PointerDownThemeAnimation
      359 -> PointerUpThemeAnimation
      361 -> PopInThemeAnimation
      362 -> PopOutThemeAnimation
      363 -> Popup
      370 -> RepositionThemeAnimation
      371 -> ResourceDictionary
      374 -> RichTextBlock
      376 -> RichTextBlockOverflow
      378 -> RotateTransform
      380 -> Run
      381 -> ScaleTransform
      389 -> SkewTransform
      390 -> Span
      391 -> SplitCloseThemeAnimation
      392 -> SplitOpenThemeAnimation
      393 -> Storyboard
      394 -> SwipeBackThemeAnimation
      395 -> SwipeHintThemeAnimation
      396 -> TextBlock
      411 -> TransformGroup
      413 -> TranslateTransform
      417 -> Viewbox
      423 -> WebViewBrush
      427 -> AppBarSeparator
      429 -> BitmapIcon
      430 -> Bold
      432 -> Canvas
      435 -> ContentControl
      436 -> DatePicker
      437 -> DependencyObjectCollection
      438 -> Ellipse
      440 -> FontIcon
      442 -> Grid
      445 -> Hub
      446 -> HubSection
      447 -> Hyperlink
      449 -> Italic
      451 -> ItemsControl
      452 -> Line
      458 -> MediaTransportControls
      462 -> PasswordBox
      463 -> Path
      464 -> PathIcon
      465 -> Polygon
      466 -> Polyline
      468 -> ProgressRing
      470 -> Rectangle
      473 -> RichEditBox
      476 -> ScrollContentPresenter
      477 -> SearchBox
      479 -> SemanticZoom
      481 -> StackPanel
      482 -> SymbolIcon
      483 -> TextBox
      485 -> Thumb
      486 -> TickBar
      487 -> TimePicker
      489 -> ToggleSwitch
      490 -> Underline
      491 -> UserControl
      492 -> VariableSizedWrapGrid
      494 -> WebView
      495 -> AppBar
      499 -> AutoSuggestBox
      502 -> CarouselPanel
      506 -> ContentDialog
      508 -> FlyoutPresenter
      509 -> Frame
      511 -> GridViewItemPresenter
      512 -> GroupItem
      514 -> ItemsStackPanel
      515 -> ItemsWrapGrid
      520 -> ListViewItemPresenter
      521 -> MenuFlyoutItem
      522 -> MenuFlyoutPresenter
      523 -> MenuFlyoutSeparator
      525 -> Page
      528 -> ProgressBar
      530 -> ScrollBar
      533 -> SettingsFlyout
      534 -> Slider
      535 -> SwapChainBackgroundPanel
      536 -> SwapChainPanel
      538 -> ToolTip
      540 -> Button
      541 -> ComboBoxItem
      542 -> CommandBar
      543 -> FlipViewItem
      545 -> GridViewHeaderItem
      546 -> HyperlinkButton
      547 -> ListBoxItem
      550 -> ListViewHeaderItem
      551 -> RepeatButton
      552 -> ScrollViewer
      553 -> ToggleButton
      554 -> ToggleMenuFlyoutItem
      555 -> VirtualizingStackPanel
      556 -> WrapGrid
      557 -> AppBarButton
      558 -> AppBarToggleButton
      559 -> CheckBox
      560 -> GridViewItem
      561 -> ListViewItem
      562 -> RadioButton
      564 -> Binding
      566 -> ComboBox
      567 -> FlipView
      568 -> ListBox
      570 -> GridView
      571 -> ListView
      707 -> CalendarView
      709 -> CalendarViewDayItem
      723 -> CalendarPanel
      728 -> SplitView
      732 -> CompositeTransform3D
      733 -> PerspectiveTransform3D
      744 -> RelativePanel
      748 -> InkCanvas
      749 -> MenuFlyoutSubItem
      757 -> AdaptiveTrigger
      761 -> SoftwareBitmapSource
      767 -> StateTrigger
      774 -> CalendarDatePicker
      778 -> AutoSuggestBoxQuerySubmittedEventArgs
      781 -> CommandBarOverflowPresenter
      782 -> DrillInThemeAnimation
      783 -> DrillOutThemeAnimation
      789 -> AutomationAnnotation
      790 -> AutomationPeerAnnotation
      828 -> MediaPlayerPresenter
      829 -> MediaPlayerElement
      855 -> XamlLight
      860 -> SvgImageSource
      897 -> KeyboardAccelerator
      920 -> HandwritingView
      925 -> ContentLink
      929 -> BitmapIconSource
      930 -> FontIconSource
      931 -> PathIconSource
      933 -> SymbolIconSource
      939 -> IconSourceElement
      945 -> AppBarElementContainer
      952 -> ColorPaletteResources
      961 -> StandardUICommand
      964 -> ThemeShadow
      969 -> XamlUICommand
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<XamlTypeIndex> {
    public fun setValue(newValue: XamlTypeIndex): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): XamlTypeIndex =
        XamlTypeIndex.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<XamlTypeIndex, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): XamlTypeIndex =
        XamlTypeIndex.values()[0].fromNative(value, null)

    public override fun toNative(obj: XamlTypeIndex): Int = obj.value
  }
}
