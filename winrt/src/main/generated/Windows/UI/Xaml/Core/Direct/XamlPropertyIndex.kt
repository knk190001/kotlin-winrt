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

@ABIMarker(XamlPropertyIndex.ABI::class)
@Signature("enum(Windows.UI.Xaml.Core.Direct.XamlPropertyIndex;i4)")
@WinRTByReference(brClass = XamlPropertyIndex.ByReference::class)
public enum class XamlPropertyIndex(
  public val value: Int
) : NativeMapped {
  AutomationProperties_AcceleratorKey(5),
  AutomationProperties_AccessibilityView(6),
  AutomationProperties_AccessKey(7),
  AutomationProperties_AutomationId(8),
  AutomationProperties_ControlledPeers(9),
  AutomationProperties_HelpText(10),
  AutomationProperties_IsRequiredForForm(11),
  AutomationProperties_ItemStatus(12),
  AutomationProperties_ItemType(13),
  AutomationProperties_LabeledBy(14),
  AutomationProperties_LiveSetting(15),
  AutomationProperties_Name(16),
  ToolTipService_Placement(24),
  ToolTipService_PlacementTarget(25),
  ToolTipService_ToolTip(26),
  Typography_AnnotationAlternates(28),
  Typography_Capitals(29),
  Typography_CapitalSpacing(30),
  Typography_CaseSensitiveForms(31),
  Typography_ContextualAlternates(32),
  Typography_ContextualLigatures(33),
  Typography_ContextualSwashes(34),
  Typography_DiscretionaryLigatures(35),
  Typography_EastAsianExpertForms(36),
  Typography_EastAsianLanguage(37),
  Typography_EastAsianWidths(38),
  Typography_Fraction(39),
  Typography_HistoricalForms(40),
  Typography_HistoricalLigatures(41),
  Typography_Kerning(42),
  Typography_MathematicalGreek(43),
  Typography_NumeralAlignment(44),
  Typography_NumeralStyle(45),
  Typography_SlashedZero(46),
  Typography_StandardLigatures(47),
  Typography_StandardSwashes(48),
  Typography_StylisticAlternates(49),
  Typography_StylisticSet1(50),
  Typography_StylisticSet10(51),
  Typography_StylisticSet11(52),
  Typography_StylisticSet12(53),
  Typography_StylisticSet13(54),
  Typography_StylisticSet14(55),
  Typography_StylisticSet15(56),
  Typography_StylisticSet16(57),
  Typography_StylisticSet17(58),
  Typography_StylisticSet18(59),
  Typography_StylisticSet19(60),
  Typography_StylisticSet2(61),
  Typography_StylisticSet20(62),
  Typography_StylisticSet3(63),
  Typography_StylisticSet4(64),
  Typography_StylisticSet5(65),
  Typography_StylisticSet6(66),
  Typography_StylisticSet7(67),
  Typography_StylisticSet8(68),
  Typography_StylisticSet9(69),
  Typography_Variants(70),
  AutomationPeer_EventsSource(75),
  AutoSuggestBoxSuggestionChosenEventArgs_SelectedItem(76),
  AutoSuggestBoxTextChangedEventArgs_Reason(77),
  Brush_Opacity(78),
  Brush_RelativeTransform(79),
  Brush_Transform(80),
  CollectionViewSource_IsSourceGrouped(81),
  CollectionViewSource_ItemsPath(82),
  CollectionViewSource_Source(83),
  CollectionViewSource_View(84),
  ColorKeyFrame_KeyTime(90),
  ColorKeyFrame_Value(91),
  ColumnDefinition_ActualWidth(92),
  ColumnDefinition_MaxWidth(93),
  ColumnDefinition_MinWidth(94),
  ColumnDefinition_Width(95),
  ComboBoxTemplateSettings_DropDownClosedHeight(96),
  ComboBoxTemplateSettings_DropDownOffset(97),
  ComboBoxTemplateSettings_DropDownOpenedHeight(98),
  ComboBoxTemplateSettings_SelectedItemDirection(99),
  DoubleKeyFrame_KeyTime(107),
  DoubleKeyFrame_Value(108),
  EasingFunctionBase_EasingMode(111),
  FlyoutBase_AttachedFlyout(114),
  FlyoutBase_Placement(115),
  Geometry_Bounds(118),
  Geometry_Transform(119),
  GradientStop_Color(120),
  GradientStop_Offset(121),
  GroupStyle_ContainerStyle(124),
  GroupStyle_ContainerStyleSelector(125),
  GroupStyle_HeaderContainerStyle(126),
  GroupStyle_HeaderTemplate(127),
  GroupStyle_HeaderTemplateSelector(128),
  GroupStyle_HidesIfEmpty(129),
  GroupStyle_Panel(130),
  InertiaExpansionBehavior_DesiredDeceleration(144),
  InertiaExpansionBehavior_DesiredExpansion(145),
  InertiaRotationBehavior_DesiredDeceleration(146),
  InertiaRotationBehavior_DesiredRotation(147),
  InertiaTranslationBehavior_DesiredDeceleration(148),
  InertiaTranslationBehavior_DesiredDisplacement(149),
  InputScope_Names(150),
  InputScopeName_NameValue(151),
  KeySpline_ControlPoint1(153),
  KeySpline_ControlPoint2(154),
  ManipulationPivot_Center(159),
  ManipulationPivot_Radius(160),
  ObjectKeyFrame_KeyTime(183),
  ObjectKeyFrame_Value(184),
  PageStackEntry_SourcePageType(185),
  PathFigure_IsClosed(192),
  PathFigure_IsFilled(193),
  PathFigure_Segments(194),
  PathFigure_StartPoint(195),
  Pointer_IsInContact(199),
  Pointer_IsInRange(200),
  Pointer_PointerDeviceType(201),
  Pointer_PointerId(202),
  PointKeyFrame_KeyTime(205),
  PointKeyFrame_Value(206),
  PrintDocument_DocumentSource(209),
  ProgressBarTemplateSettings_ContainerAnimationEndPosition(211),
  ProgressBarTemplateSettings_ContainerAnimationStartPosition(212),
  ProgressBarTemplateSettings_EllipseAnimationEndPosition(213),
  ProgressBarTemplateSettings_EllipseAnimationWellPosition(214),
  ProgressBarTemplateSettings_EllipseDiameter(215),
  ProgressBarTemplateSettings_EllipseOffset(216),
  ProgressBarTemplateSettings_IndicatorLengthDelta(217),
  ProgressRingTemplateSettings_EllipseDiameter(218),
  ProgressRingTemplateSettings_EllipseOffset(219),
  ProgressRingTemplateSettings_MaxSideLength(220),
  PropertyPath_Path(221),
  RowDefinition_ActualHeight(226),
  RowDefinition_Height(227),
  RowDefinition_MaxHeight(228),
  RowDefinition_MinHeight(229),
  SetterBase_IsSealed(233),
  SettingsFlyoutTemplateSettings_BorderBrush(234),
  SettingsFlyoutTemplateSettings_BorderThickness(235),
  SettingsFlyoutTemplateSettings_ContentTransitions(236),
  SettingsFlyoutTemplateSettings_HeaderBackground(237),
  SettingsFlyoutTemplateSettings_HeaderForeground(238),
  SettingsFlyoutTemplateSettings_IconSource(239),
  Style_BasedOn(244),
  Style_IsSealed(245),
  Style_Setters(246),
  Style_TargetType(247),
  TextElement_CharacterSpacing(249),
  TextElement_FontFamily(250),
  TextElement_FontSize(251),
  TextElement_FontStretch(252),
  TextElement_FontStyle(253),
  TextElement_FontWeight(254),
  TextElement_Foreground(255),
  TextElement_IsTextScaleFactorEnabled(256),
  TextElement_Language(257),
  Timeline_AutoReverse(263),
  Timeline_BeginTime(264),
  Timeline_Duration(265),
  Timeline_FillBehavior(266),
  Timeline_RepeatBehavior(267),
  Timeline_SpeedRatio(268),
  TimelineMarker_Text(269),
  TimelineMarker_Time(270),
  TimelineMarker_Type(271),
  ToggleSwitchTemplateSettings_CurtainCurrentToOffOffset(273),
  ToggleSwitchTemplateSettings_CurtainCurrentToOnOffset(274),
  ToggleSwitchTemplateSettings_CurtainOffToOnOffset(275),
  ToggleSwitchTemplateSettings_CurtainOnToOffOffset(276),
  ToggleSwitchTemplateSettings_KnobCurrentToOffOffset(277),
  ToggleSwitchTemplateSettings_KnobCurrentToOnOffset(278),
  ToggleSwitchTemplateSettings_KnobOffToOnOffset(279),
  ToggleSwitchTemplateSettings_KnobOnToOffOffset(280),
  ToolTipTemplateSettings_FromHorizontalOffset(281),
  ToolTipTemplateSettings_FromVerticalOffset(282),
  UIElement_AllowDrop(292),
  UIElement_CacheMode(293),
  UIElement_Clip(295),
  UIElement_CompositeMode(296),
  UIElement_IsDoubleTapEnabled(297),
  UIElement_IsHitTestVisible(298),
  UIElement_IsHoldingEnabled(299),
  UIElement_IsRightTapEnabled(300),
  UIElement_IsTapEnabled(301),
  UIElement_ManipulationMode(302),
  UIElement_Opacity(303),
  UIElement_PointerCaptures(304),
  UIElement_Projection(305),
  UIElement_RenderSize(306),
  UIElement_RenderTransform(307),
  UIElement_RenderTransformOrigin(308),
  UIElement_Transitions(309),
  UIElement_UseLayoutRounding(311),
  UIElement_Visibility(312),
  VisualState_Storyboard(322),
  VisualStateGroup_States(323),
  VisualStateGroup_Transitions(324),
  VisualStateManager_CustomVisualStateManager(325),
  VisualStateManager_VisualStateGroups(326),
  VisualTransition_From(327),
  VisualTransition_GeneratedDuration(328),
  VisualTransition_GeneratedEasingFunction(329),
  VisualTransition_Storyboard(330),
  VisualTransition_To(331),
  ArcSegment_IsLargeArc(332),
  ArcSegment_Point(333),
  ArcSegment_RotationAngle(334),
  ArcSegment_Size(335),
  ArcSegment_SweepDirection(336),
  BackEase_Amplitude(337),
  BeginStoryboard_Storyboard(338),
  BezierSegment_Point1(339),
  BezierSegment_Point2(340),
  BezierSegment_Point3(341),
  BitmapSource_PixelHeight(342),
  BitmapSource_PixelWidth(343),
  Block_LineHeight(344),
  Block_LineStackingStrategy(345),
  Block_Margin(346),
  Block_TextAlignment(347),
  BounceEase_Bounces(348),
  BounceEase_Bounciness(349),
  ColorAnimation_By(350),
  ColorAnimation_EasingFunction(351),
  ColorAnimation_EnableDependentAnimation(352),
  ColorAnimation_From(353),
  ColorAnimation_To(354),
  ColorAnimationUsingKeyFrames_EnableDependentAnimation(355),
  ColorAnimationUsingKeyFrames_KeyFrames(356),
  ContentThemeTransition_HorizontalOffset(357),
  ContentThemeTransition_VerticalOffset(358),
  ControlTemplate_TargetType(359),
  DispatcherTimer_Interval(362),
  DoubleAnimation_By(363),
  DoubleAnimation_EasingFunction(364),
  DoubleAnimation_EnableDependentAnimation(365),
  DoubleAnimation_From(366),
  DoubleAnimation_To(367),
  DoubleAnimationUsingKeyFrames_EnableDependentAnimation(368),
  DoubleAnimationUsingKeyFrames_KeyFrames(369),
  EasingColorKeyFrame_EasingFunction(372),
  EasingDoubleKeyFrame_EasingFunction(373),
  EasingPointKeyFrame_EasingFunction(374),
  EdgeUIThemeTransition_Edge(375),
  ElasticEase_Oscillations(376),
  ElasticEase_Springiness(377),
  EllipseGeometry_Center(378),
  EllipseGeometry_RadiusX(379),
  EllipseGeometry_RadiusY(380),
  EntranceThemeTransition_FromHorizontalOffset(381),
  EntranceThemeTransition_FromVerticalOffset(382),
  EntranceThemeTransition_IsStaggeringEnabled(383),
  EventTrigger_Actions(384),
  EventTrigger_RoutedEvent(385),
  ExponentialEase_Exponent(386),
  Flyout_Content(387),
  Flyout_FlyoutPresenterStyle(388),
  FrameworkElement_ActualHeight(389),
  FrameworkElement_ActualWidth(390),
  FrameworkElement_DataContext(391),
  FrameworkElement_FlowDirection(392),
  FrameworkElement_Height(393),
  FrameworkElement_HorizontalAlignment(394),
  FrameworkElement_Language(396),
  FrameworkElement_Margin(397),
  FrameworkElement_MaxHeight(398),
  FrameworkElement_MaxWidth(399),
  FrameworkElement_MinHeight(400),
  FrameworkElement_MinWidth(401),
  FrameworkElement_Parent(402),
  FrameworkElement_RequestedTheme(403),
  FrameworkElement_Resources(404),
  FrameworkElement_Style(405),
  FrameworkElement_Tag(406),
  FrameworkElement_Triggers(407),
  FrameworkElement_VerticalAlignment(408),
  FrameworkElement_Width(409),
  FrameworkElementAutomationPeer_Owner(410),
  GeometryGroup_Children(411),
  GeometryGroup_FillRule(412),
  GradientBrush_ColorInterpolationMode(413),
  GradientBrush_GradientStops(414),
  GradientBrush_MappingMode(415),
  GradientBrush_SpreadMethod(416),
  GridViewItemTemplateSettings_DragItemsCount(417),
  ItemAutomationPeer_Item(419),
  ItemAutomationPeer_ItemsControlAutomationPeer(420),
  LineGeometry_EndPoint(422),
  LineGeometry_StartPoint(423),
  LineSegment_Point(424),
  ListViewItemTemplateSettings_DragItemsCount(425),
  Matrix3DProjection_ProjectionMatrix(426),
  MenuFlyout_Items(427),
  MenuFlyout_MenuFlyoutPresenterStyle(428),
  ObjectAnimationUsingKeyFrames_EnableDependentAnimation(429),
  ObjectAnimationUsingKeyFrames_KeyFrames(430),
  PaneThemeTransition_Edge(431),
  PathGeometry_Figures(432),
  PathGeometry_FillRule(433),
  PlaneProjection_CenterOfRotationX(434),
  PlaneProjection_CenterOfRotationY(435),
  PlaneProjection_CenterOfRotationZ(436),
  PlaneProjection_GlobalOffsetX(437),
  PlaneProjection_GlobalOffsetY(438),
  PlaneProjection_GlobalOffsetZ(439),
  PlaneProjection_LocalOffsetX(440),
  PlaneProjection_LocalOffsetY(441),
  PlaneProjection_LocalOffsetZ(442),
  PlaneProjection_ProjectionMatrix(443),
  PlaneProjection_RotationX(444),
  PlaneProjection_RotationY(445),
  PlaneProjection_RotationZ(446),
  PointAnimation_By(447),
  PointAnimation_EasingFunction(448),
  PointAnimation_EnableDependentAnimation(449),
  PointAnimation_From(450),
  PointAnimation_To(451),
  PointAnimationUsingKeyFrames_EnableDependentAnimation(452),
  PointAnimationUsingKeyFrames_KeyFrames(453),
  PolyBezierSegment_Points(456),
  PolyLineSegment_Points(457),
  PolyQuadraticBezierSegment_Points(458),
  PopupThemeTransition_FromHorizontalOffset(459),
  PopupThemeTransition_FromVerticalOffset(460),
  PowerEase_Power(461),
  QuadraticBezierSegment_Point1(466),
  QuadraticBezierSegment_Point2(467),
  RectangleGeometry_Rect(470),
  RelativeSource_Mode(471),
  RenderTargetBitmap_PixelHeight(472),
  RenderTargetBitmap_PixelWidth(473),
  Setter_Property(474),
  Setter_Value(475),
  SolidColorBrush_Color(476),
  SplineColorKeyFrame_KeySpline(477),
  SplineDoubleKeyFrame_KeySpline(478),
  SplinePointKeyFrame_KeySpline(479),
  TileBrush_AlignmentX(483),
  TileBrush_AlignmentY(484),
  TileBrush_Stretch(485),
  Binding_Converter(487),
  Binding_ConverterLanguage(488),
  Binding_ConverterParameter(489),
  Binding_ElementName(490),
  Binding_FallbackValue(491),
  Binding_Mode(492),
  Binding_Path(493),
  Binding_RelativeSource(494),
  Binding_Source(495),
  Binding_TargetNullValue(496),
  Binding_UpdateSourceTrigger(497),
  BitmapImage_CreateOptions(498),
  BitmapImage_DecodePixelHeight(499),
  BitmapImage_DecodePixelType(500),
  BitmapImage_DecodePixelWidth(501),
  BitmapImage_UriSource(502),
  Border_Background(503),
  Border_BorderBrush(504),
  Border_BorderThickness(505),
  Border_Child(506),
  Border_ChildTransitions(507),
  Border_CornerRadius(508),
  Border_Padding(509),
  CaptureElement_Source(510),
  CaptureElement_Stretch(511),
  CompositeTransform_CenterX(514),
  CompositeTransform_CenterY(515),
  CompositeTransform_Rotation(516),
  CompositeTransform_ScaleX(517),
  CompositeTransform_ScaleY(518),
  CompositeTransform_SkewX(519),
  CompositeTransform_SkewY(520),
  CompositeTransform_TranslateX(521),
  CompositeTransform_TranslateY(522),
  ContentPresenter_CharacterSpacing(523),
  ContentPresenter_Content(524),
  ContentPresenter_ContentTemplate(525),
  ContentPresenter_ContentTemplateSelector(526),
  ContentPresenter_ContentTransitions(527),
  ContentPresenter_FontFamily(528),
  ContentPresenter_FontSize(529),
  ContentPresenter_FontStretch(530),
  ContentPresenter_FontStyle(531),
  ContentPresenter_FontWeight(532),
  ContentPresenter_Foreground(533),
  ContentPresenter_IsTextScaleFactorEnabled(534),
  ContentPresenter_LineStackingStrategy(535),
  ContentPresenter_MaxLines(536),
  ContentPresenter_OpticalMarginAlignment(537),
  ContentPresenter_TextLineBounds(539),
  ContentPresenter_TextWrapping(540),
  Control_Background(541),
  Control_BorderBrush(542),
  Control_BorderThickness(543),
  Control_CharacterSpacing(544),
  Control_FocusState(546),
  Control_FontFamily(547),
  Control_FontSize(548),
  Control_FontStretch(549),
  Control_FontStyle(550),
  Control_FontWeight(551),
  Control_Foreground(552),
  Control_HorizontalContentAlignment(553),
  Control_IsEnabled(554),
  Control_IsTabStop(555),
  Control_IsTextScaleFactorEnabled(556),
  Control_Padding(557),
  Control_TabIndex(558),
  Control_TabNavigation(559),
  Control_Template(560),
  Control_VerticalContentAlignment(561),
  DragItemThemeAnimation_TargetName(565),
  DragOverThemeAnimation_Direction(566),
  DragOverThemeAnimation_TargetName(567),
  DragOverThemeAnimation_ToOffset(568),
  DropTargetItemThemeAnimation_TargetName(569),
  FadeInThemeAnimation_TargetName(570),
  FadeOutThemeAnimation_TargetName(571),
  Glyphs_Fill(574),
  Glyphs_FontRenderingEmSize(575),
  Glyphs_FontUri(576),
  Glyphs_Indices(577),
  Glyphs_OriginX(578),
  Glyphs_OriginY(579),
  Glyphs_StyleSimulations(580),
  Glyphs_UnicodeString(581),
  IconElement_Foreground(584),
  Image_NineGrid(586),
  Image_PlayToSource(587),
  Image_Source(588),
  Image_Stretch(589),
  ImageBrush_ImageSource(591),
  InlineUIContainer_Child(592),
  ItemsPresenter_Footer(594),
  ItemsPresenter_FooterTemplate(595),
  ItemsPresenter_FooterTransitions(596),
  ItemsPresenter_Header(597),
  ItemsPresenter_HeaderTemplate(598),
  ItemsPresenter_HeaderTransitions(599),
  ItemsPresenter_Padding(601),
  LinearGradientBrush_EndPoint(602),
  LinearGradientBrush_StartPoint(603),
  MatrixTransform_Matrix(604),
  MediaElement_ActualStereo3DVideoPackingMode(605),
  MediaElement_AreTransportControlsEnabled(606),
  MediaElement_AspectRatioHeight(607),
  MediaElement_AspectRatioWidth(608),
  MediaElement_AudioCategory(609),
  MediaElement_AudioDeviceType(610),
  MediaElement_AudioStreamCount(611),
  MediaElement_AudioStreamIndex(612),
  MediaElement_AutoPlay(613),
  MediaElement_Balance(614),
  MediaElement_BufferingProgress(615),
  MediaElement_CanPause(616),
  MediaElement_CanSeek(617),
  MediaElement_CurrentState(618),
  MediaElement_DefaultPlaybackRate(619),
  MediaElement_DownloadProgress(620),
  MediaElement_DownloadProgressOffset(621),
  MediaElement_IsAudioOnly(623),
  MediaElement_IsFullWindow(624),
  MediaElement_IsLooping(625),
  MediaElement_IsMuted(626),
  MediaElement_IsStereo3DVideo(627),
  MediaElement_Markers(628),
  MediaElement_NaturalDuration(629),
  MediaElement_NaturalVideoHeight(630),
  MediaElement_NaturalVideoWidth(631),
  MediaElement_PlaybackRate(632),
  MediaElement_PlayToPreferredSourceUri(633),
  MediaElement_PlayToSource(634),
  MediaElement_Position(635),
  MediaElement_PosterSource(636),
  MediaElement_ProtectionManager(637),
  MediaElement_RealTimePlayback(638),
  MediaElement_Source(639),
  MediaElement_Stereo3DVideoPackingMode(640),
  MediaElement_Stereo3DVideoRenderMode(641),
  MediaElement_Stretch(642),
  MediaElement_TransportControls(643),
  MediaElement_Volume(644),
  Panel_Background(647),
  Panel_Children(648),
  Panel_ChildrenTransitions(649),
  Panel_IsItemsHost(651),
  Paragraph_Inlines(652),
  Paragraph_TextIndent(653),
  PointerDownThemeAnimation_TargetName(660),
  PointerUpThemeAnimation_TargetName(662),
  PopInThemeAnimation_FromHorizontalOffset(664),
  PopInThemeAnimation_FromVerticalOffset(665),
  PopInThemeAnimation_TargetName(666),
  PopOutThemeAnimation_TargetName(667),
  Popup_Child(668),
  Popup_ChildTransitions(669),
  Popup_HorizontalOffset(670),
  Popup_IsLightDismissEnabled(673),
  Popup_IsOpen(674),
  Popup_VerticalOffset(676),
  RepositionThemeAnimation_FromHorizontalOffset(683),
  RepositionThemeAnimation_FromVerticalOffset(684),
  RepositionThemeAnimation_TargetName(685),
  ResourceDictionary_MergedDictionaries(687),
  ResourceDictionary_Source(688),
  ResourceDictionary_ThemeDictionaries(689),
  RichTextBlock_Blocks(691),
  RichTextBlock_CharacterSpacing(692),
  RichTextBlock_FontFamily(693),
  RichTextBlock_FontSize(694),
  RichTextBlock_FontStretch(695),
  RichTextBlock_FontStyle(696),
  RichTextBlock_FontWeight(697),
  RichTextBlock_Foreground(698),
  RichTextBlock_HasOverflowContent(699),
  RichTextBlock_IsColorFontEnabled(700),
  RichTextBlock_IsTextScaleFactorEnabled(701),
  RichTextBlock_IsTextSelectionEnabled(702),
  RichTextBlock_LineHeight(703),
  RichTextBlock_LineStackingStrategy(704),
  RichTextBlock_MaxLines(705),
  RichTextBlock_OpticalMarginAlignment(706),
  RichTextBlock_OverflowContentTarget(707),
  RichTextBlock_Padding(708),
  RichTextBlock_SelectedText(709),
  RichTextBlock_SelectionHighlightColor(710),
  RichTextBlock_TextAlignment(711),
  RichTextBlock_TextIndent(712),
  RichTextBlock_TextLineBounds(713),
  RichTextBlock_TextReadingOrder(714),
  RichTextBlock_TextTrimming(715),
  RichTextBlock_TextWrapping(716),
  RichTextBlockOverflow_HasOverflowContent(717),
  RichTextBlockOverflow_MaxLines(718),
  RichTextBlockOverflow_OverflowContentTarget(719),
  RichTextBlockOverflow_Padding(720),
  RotateTransform_Angle(721),
  RotateTransform_CenterX(722),
  RotateTransform_CenterY(723),
  Run_FlowDirection(725),
  Run_Text(726),
  ScaleTransform_CenterX(727),
  ScaleTransform_CenterY(728),
  ScaleTransform_ScaleX(729),
  ScaleTransform_ScaleY(730),
  SetterBaseCollection_IsSealed(732),
  Shape_Fill(733),
  Shape_GeometryTransform(734),
  Shape_Stretch(735),
  Shape_Stroke(736),
  Shape_StrokeDashArray(737),
  Shape_StrokeDashCap(738),
  Shape_StrokeDashOffset(739),
  Shape_StrokeEndLineCap(740),
  Shape_StrokeLineJoin(741),
  Shape_StrokeMiterLimit(742),
  Shape_StrokeStartLineCap(743),
  Shape_StrokeThickness(744),
  SkewTransform_AngleX(745),
  SkewTransform_AngleY(746),
  SkewTransform_CenterX(747),
  SkewTransform_CenterY(748),
  Span_Inlines(749),
  SplitCloseThemeAnimation_ClosedLength(750),
  SplitCloseThemeAnimation_ClosedTarget(751),
  SplitCloseThemeAnimation_ClosedTargetName(752),
  SplitCloseThemeAnimation_ContentTarget(753),
  SplitCloseThemeAnimation_ContentTargetName(754),
  SplitCloseThemeAnimation_ContentTranslationDirection(755),
  SplitCloseThemeAnimation_ContentTranslationOffset(756),
  SplitCloseThemeAnimation_OffsetFromCenter(757),
  SplitCloseThemeAnimation_OpenedLength(758),
  SplitCloseThemeAnimation_OpenedTarget(759),
  SplitCloseThemeAnimation_OpenedTargetName(760),
  SplitOpenThemeAnimation_ClosedLength(761),
  SplitOpenThemeAnimation_ClosedTarget(762),
  SplitOpenThemeAnimation_ClosedTargetName(763),
  SplitOpenThemeAnimation_ContentTarget(764),
  SplitOpenThemeAnimation_ContentTargetName(765),
  SplitOpenThemeAnimation_ContentTranslationDirection(766),
  SplitOpenThemeAnimation_ContentTranslationOffset(767),
  SplitOpenThemeAnimation_OffsetFromCenter(768),
  SplitOpenThemeAnimation_OpenedLength(769),
  SplitOpenThemeAnimation_OpenedTarget(770),
  SplitOpenThemeAnimation_OpenedTargetName(771),
  Storyboard_Children(772),
  Storyboard_TargetName(774),
  Storyboard_TargetProperty(775),
  SwipeBackThemeAnimation_FromHorizontalOffset(776),
  SwipeBackThemeAnimation_FromVerticalOffset(777),
  SwipeBackThemeAnimation_TargetName(778),
  SwipeHintThemeAnimation_TargetName(779),
  SwipeHintThemeAnimation_ToHorizontalOffset(780),
  SwipeHintThemeAnimation_ToVerticalOffset(781),
  TextBlock_CharacterSpacing(782),
  TextBlock_FontFamily(783),
  TextBlock_FontSize(784),
  TextBlock_FontStretch(785),
  TextBlock_FontStyle(786),
  TextBlock_FontWeight(787),
  TextBlock_Foreground(788),
  TextBlock_Inlines(789),
  TextBlock_IsColorFontEnabled(790),
  TextBlock_IsTextScaleFactorEnabled(791),
  TextBlock_IsTextSelectionEnabled(792),
  TextBlock_LineHeight(793),
  TextBlock_LineStackingStrategy(794),
  TextBlock_MaxLines(795),
  TextBlock_OpticalMarginAlignment(796),
  TextBlock_Padding(797),
  TextBlock_SelectedText(798),
  TextBlock_SelectionHighlightColor(799),
  TextBlock_Text(800),
  TextBlock_TextAlignment(801),
  TextBlock_TextDecorations(802),
  TextBlock_TextLineBounds(803),
  TextBlock_TextReadingOrder(804),
  TextBlock_TextTrimming(805),
  TextBlock_TextWrapping(806),
  TransformGroup_Children(811),
  TransformGroup_Value(812),
  TranslateTransform_X(814),
  TranslateTransform_Y(815),
  Viewbox_Child(819),
  Viewbox_Stretch(820),
  Viewbox_StretchDirection(821),
  WebViewBrush_SourceName(825),
  AppBarSeparator_IsCompact(826),
  BitmapIcon_UriSource(827),
  Canvas_Left(828),
  Canvas_Top(829),
  Canvas_ZIndex(830),
  ContentControl_Content(832),
  ContentControl_ContentTemplate(833),
  ContentControl_ContentTemplateSelector(834),
  ContentControl_ContentTransitions(835),
  DatePicker_CalendarIdentifier(837),
  DatePicker_Date(838),
  DatePicker_DayFormat(839),
  DatePicker_DayVisible(840),
  DatePicker_Header(841),
  DatePicker_HeaderTemplate(842),
  DatePicker_MaxYear(843),
  DatePicker_MinYear(844),
  DatePicker_MonthFormat(845),
  DatePicker_MonthVisible(846),
  DatePicker_Orientation(847),
  DatePicker_YearFormat(848),
  DatePicker_YearVisible(849),
  FontIcon_FontFamily(851),
  FontIcon_FontSize(852),
  FontIcon_FontStyle(853),
  FontIcon_FontWeight(854),
  FontIcon_Glyph(855),
  FontIcon_IsTextScaleFactorEnabled(856),
  Grid_Column(857),
  Grid_ColumnDefinitions(858),
  Grid_ColumnSpan(859),
  Grid_Row(860),
  Grid_RowDefinitions(861),
  Grid_RowSpan(862),
  Hub_DefaultSectionIndex(863),
  Hub_Header(864),
  Hub_HeaderTemplate(865),
  Hub_IsActiveView(866),
  Hub_IsZoomedInView(867),
  Hub_Orientation(868),
  Hub_SectionHeaders(869),
  Hub_Sections(870),
  Hub_SectionsInView(871),
  Hub_SemanticZoomOwner(872),
  HubSection_ContentTemplate(873),
  HubSection_Header(874),
  HubSection_HeaderTemplate(875),
  HubSection_IsHeaderInteractive(876),
  Hyperlink_NavigateUri(877),
  ItemsControl_DisplayMemberPath(879),
  ItemsControl_GroupStyle(880),
  ItemsControl_GroupStyleSelector(881),
  ItemsControl_IsGrouping(882),
  ItemsControl_ItemContainerStyle(884),
  ItemsControl_ItemContainerStyleSelector(885),
  ItemsControl_ItemContainerTransitions(886),
  ItemsControl_Items(887),
  ItemsControl_ItemsPanel(889),
  ItemsControl_ItemsSource(890),
  ItemsControl_ItemTemplate(891),
  ItemsControl_ItemTemplateSelector(892),
  Line_X1(893),
  Line_X2(894),
  Line_Y1(895),
  Line_Y2(896),
  MediaTransportControls_IsFastForwardButtonVisible(898),
  MediaTransportControls_IsFastRewindButtonVisible(900),
  MediaTransportControls_IsFullWindowButtonVisible(902),
  MediaTransportControls_IsPlaybackRateButtonVisible(904),
  MediaTransportControls_IsSeekBarVisible(905),
  MediaTransportControls_IsStopButtonVisible(908),
  MediaTransportControls_IsVolumeButtonVisible(910),
  MediaTransportControls_IsZoomButtonVisible(912),
  PasswordBox_Header(913),
  PasswordBox_HeaderTemplate(914),
  PasswordBox_IsPasswordRevealButtonEnabled(915),
  PasswordBox_MaxLength(916),
  PasswordBox_Password(917),
  PasswordBox_PasswordChar(918),
  PasswordBox_PlaceholderText(919),
  PasswordBox_PreventKeyboardDisplayOnProgrammaticFocus(920),
  PasswordBox_SelectionHighlightColor(921),
  Path_Data(922),
  PathIcon_Data(923),
  Polygon_FillRule(924),
  Polygon_Points(925),
  Polyline_FillRule(926),
  Polyline_Points(927),
  ProgressRing_IsActive(928),
  ProgressRing_TemplateSettings(929),
  RangeBase_LargeChange(930),
  RangeBase_Maximum(931),
  RangeBase_Minimum(932),
  RangeBase_SmallChange(933),
  RangeBase_Value(934),
  Rectangle_RadiusX(935),
  Rectangle_RadiusY(936),
  RichEditBox_AcceptsReturn(937),
  RichEditBox_Header(938),
  RichEditBox_HeaderTemplate(939),
  RichEditBox_InputScope(940),
  RichEditBox_IsColorFontEnabled(941),
  RichEditBox_IsReadOnly(942),
  RichEditBox_IsSpellCheckEnabled(943),
  RichEditBox_IsTextPredictionEnabled(944),
  RichEditBox_PlaceholderText(945),
  RichEditBox_PreventKeyboardDisplayOnProgrammaticFocus(946),
  RichEditBox_SelectionHighlightColor(947),
  RichEditBox_TextAlignment(948),
  RichEditBox_TextWrapping(949),
  SearchBox_ChooseSuggestionOnEnter(950),
  SearchBox_FocusOnKeyboardInput(951),
  SearchBox_PlaceholderText(952),
  SearchBox_QueryText(953),
  SearchBox_SearchHistoryContext(954),
  SearchBox_SearchHistoryEnabled(955),
  SemanticZoom_CanChangeViews(956),
  SemanticZoom_IsZoomedInViewActive(957),
  SemanticZoom_IsZoomOutButtonEnabled(958),
  SemanticZoom_ZoomedInView(959),
  SemanticZoom_ZoomedOutView(960),
  StackPanel_AreScrollSnapPointsRegular(961),
  StackPanel_Orientation(962),
  SymbolIcon_Symbol(963),
  TextBox_AcceptsReturn(964),
  TextBox_Header(965),
  TextBox_HeaderTemplate(966),
  TextBox_InputScope(967),
  TextBox_IsColorFontEnabled(968),
  TextBox_IsReadOnly(971),
  TextBox_IsSpellCheckEnabled(972),
  TextBox_IsTextPredictionEnabled(973),
  TextBox_MaxLength(974),
  TextBox_PlaceholderText(975),
  TextBox_PreventKeyboardDisplayOnProgrammaticFocus(976),
  TextBox_SelectedText(977),
  TextBox_SelectionHighlightColor(978),
  TextBox_SelectionLength(979),
  TextBox_SelectionStart(980),
  TextBox_Text(981),
  TextBox_TextAlignment(982),
  TextBox_TextWrapping(983),
  Thumb_IsDragging(984),
  TickBar_Fill(985),
  TimePicker_ClockIdentifier(986),
  TimePicker_Header(987),
  TimePicker_HeaderTemplate(988),
  TimePicker_MinuteIncrement(989),
  TimePicker_Time(990),
  ToggleSwitch_Header(991),
  ToggleSwitch_HeaderTemplate(992),
  ToggleSwitch_IsOn(993),
  ToggleSwitch_OffContent(994),
  ToggleSwitch_OffContentTemplate(995),
  ToggleSwitch_OnContent(996),
  ToggleSwitch_OnContentTemplate(997),
  ToggleSwitch_TemplateSettings(998),
  UserControl_Content(999),
  VariableSizedWrapGrid_ColumnSpan(1000),
  VariableSizedWrapGrid_HorizontalChildrenAlignment(1001),
  VariableSizedWrapGrid_ItemHeight(1002),
  VariableSizedWrapGrid_ItemWidth(1003),
  VariableSizedWrapGrid_MaximumRowsOrColumns(1004),
  VariableSizedWrapGrid_Orientation(1005),
  VariableSizedWrapGrid_RowSpan(1006),
  VariableSizedWrapGrid_VerticalChildrenAlignment(1007),
  WebView_AllowedScriptNotifyUris(1008),
  WebView_CanGoBack(1009),
  WebView_CanGoForward(1010),
  WebView_ContainsFullScreenElement(1011),
  WebView_DataTransferPackage(1012),
  WebView_DefaultBackgroundColor(1013),
  WebView_DocumentTitle(1014),
  WebView_Source(1015),
  AppBar_ClosedDisplayMode(1016),
  AppBar_IsOpen(1017),
  AppBar_IsSticky(1018),
  AutoSuggestBox_AutoMaximizeSuggestionArea(1019),
  AutoSuggestBox_Header(1020),
  AutoSuggestBox_IsSuggestionListOpen(1021),
  AutoSuggestBox_MaxSuggestionListHeight(1022),
  AutoSuggestBox_PlaceholderText(1023),
  AutoSuggestBox_Text(1024),
  AutoSuggestBox_TextBoxStyle(1025),
  AutoSuggestBox_TextMemberPath(1026),
  AutoSuggestBox_UpdateTextOnSelect(1027),
  ButtonBase_ClickMode(1029),
  ButtonBase_Command(1030),
  ButtonBase_CommandParameter(1031),
  ButtonBase_IsPointerOver(1032),
  ButtonBase_IsPressed(1033),
  ContentDialog_FullSizeDesired(1034),
  ContentDialog_IsPrimaryButtonEnabled(1035),
  ContentDialog_IsSecondaryButtonEnabled(1036),
  ContentDialog_PrimaryButtonCommand(1037),
  ContentDialog_PrimaryButtonCommandParameter(1038),
  ContentDialog_PrimaryButtonText(1039),
  ContentDialog_SecondaryButtonCommand(1040),
  ContentDialog_SecondaryButtonCommandParameter(1041),
  ContentDialog_SecondaryButtonText(1042),
  ContentDialog_Title(1043),
  ContentDialog_TitleTemplate(1044),
  Frame_BackStack(1045),
  Frame_BackStackDepth(1046),
  Frame_CacheSize(1047),
  Frame_CanGoBack(1048),
  Frame_CanGoForward(1049),
  Frame_CurrentSourcePageType(1050),
  Frame_ForwardStack(1051),
  Frame_SourcePageType(1052),
  GridViewItemPresenter_CheckBrush(1053),
  GridViewItemPresenter_CheckHintBrush(1054),
  GridViewItemPresenter_CheckSelectingBrush(1055),
  GridViewItemPresenter_ContentMargin(1056),
  GridViewItemPresenter_DisabledOpacity(1057),
  GridViewItemPresenter_DragBackground(1058),
  GridViewItemPresenter_DragForeground(1059),
  GridViewItemPresenter_DragOpacity(1060),
  GridViewItemPresenter_FocusBorderBrush(1061),
  GridViewItemPresenter_GridViewItemPresenterHorizontalContentAlignment(1062),
  GridViewItemPresenter_GridViewItemPresenterPadding(1063),
  GridViewItemPresenter_PlaceholderBackground(1064),
  GridViewItemPresenter_PointerOverBackground(1065),
  GridViewItemPresenter_PointerOverBackgroundMargin(1066),
  GridViewItemPresenter_ReorderHintOffset(1067),
  GridViewItemPresenter_SelectedBackground(1068),
  GridViewItemPresenter_SelectedBorderThickness(1069),
  GridViewItemPresenter_SelectedForeground(1070),
  GridViewItemPresenter_SelectedPointerOverBackground(1071),
  GridViewItemPresenter_SelectedPointerOverBorderBrush(1072),
  GridViewItemPresenter_SelectionCheckMarkVisualEnabled(1073),
  GridViewItemPresenter_GridViewItemPresenterVerticalContentAlignment(1074),
  ItemsStackPanel_CacheLength(1076),
  ItemsStackPanel_GroupHeaderPlacement(1077),
  ItemsStackPanel_GroupPadding(1078),
  ItemsStackPanel_ItemsUpdatingScrollMode(1079),
  ItemsStackPanel_Orientation(1080),
  ItemsWrapGrid_CacheLength(1081),
  ItemsWrapGrid_GroupHeaderPlacement(1082),
  ItemsWrapGrid_GroupPadding(1083),
  ItemsWrapGrid_ItemHeight(1084),
  ItemsWrapGrid_ItemWidth(1085),
  ItemsWrapGrid_MaximumRowsOrColumns(1086),
  ItemsWrapGrid_Orientation(1087),
  ListViewItemPresenter_CheckBrush(1088),
  ListViewItemPresenter_CheckHintBrush(1089),
  ListViewItemPresenter_CheckSelectingBrush(1090),
  ListViewItemPresenter_ContentMargin(1091),
  ListViewItemPresenter_DisabledOpacity(1092),
  ListViewItemPresenter_DragBackground(1093),
  ListViewItemPresenter_DragForeground(1094),
  ListViewItemPresenter_DragOpacity(1095),
  ListViewItemPresenter_FocusBorderBrush(1096),
  ListViewItemPresenter_ListViewItemPresenterHorizontalContentAlignment(1097),
  ListViewItemPresenter_ListViewItemPresenterPadding(1098),
  ListViewItemPresenter_PlaceholderBackground(1099),
  ListViewItemPresenter_PointerOverBackground(1100),
  ListViewItemPresenter_PointerOverBackgroundMargin(1101),
  ListViewItemPresenter_ReorderHintOffset(1102),
  ListViewItemPresenter_SelectedBackground(1103),
  ListViewItemPresenter_SelectedBorderThickness(1104),
  ListViewItemPresenter_SelectedForeground(1105),
  ListViewItemPresenter_SelectedPointerOverBackground(1106),
  ListViewItemPresenter_SelectedPointerOverBorderBrush(1107),
  ListViewItemPresenter_SelectionCheckMarkVisualEnabled(1108),
  ListViewItemPresenter_ListViewItemPresenterVerticalContentAlignment(1109),
  MenuFlyoutItem_Command(1110),
  MenuFlyoutItem_CommandParameter(1111),
  MenuFlyoutItem_Text(1112),
  Page_BottomAppBar(1114),
  Page_Frame(1115),
  Page_NavigationCacheMode(1116),
  Page_TopAppBar(1117),
  ProgressBar_IsIndeterminate(1118),
  ProgressBar_ShowError(1119),
  ProgressBar_ShowPaused(1120),
  ProgressBar_TemplateSettings(1121),
  ScrollBar_IndicatorMode(1122),
  ScrollBar_Orientation(1123),
  ScrollBar_ViewportSize(1124),
  Selector_IsSynchronizedWithCurrentItem(1126),
  Selector_SelectedIndex(1127),
  Selector_SelectedItem(1128),
  Selector_SelectedValue(1129),
  Selector_SelectedValuePath(1130),
  SelectorItem_IsSelected(1131),
  SettingsFlyout_HeaderBackground(1132),
  SettingsFlyout_HeaderForeground(1133),
  SettingsFlyout_IconSource(1134),
  SettingsFlyout_TemplateSettings(1135),
  SettingsFlyout_Title(1136),
  Slider_Header(1137),
  Slider_HeaderTemplate(1138),
  Slider_IntermediateValue(1139),
  Slider_IsDirectionReversed(1140),
  Slider_IsThumbToolTipEnabled(1141),
  Slider_Orientation(1142),
  Slider_SnapsTo(1143),
  Slider_StepFrequency(1144),
  Slider_ThumbToolTipValueConverter(1145),
  Slider_TickFrequency(1146),
  Slider_TickPlacement(1147),
  SwapChainPanel_CompositionScaleX(1148),
  SwapChainPanel_CompositionScaleY(1149),
  ToolTip_HorizontalOffset(1150),
  ToolTip_IsOpen(1151),
  ToolTip_Placement(1152),
  ToolTip_PlacementTarget(1153),
  ToolTip_TemplateSettings(1154),
  ToolTip_VerticalOffset(1155),
  Button_Flyout(1156),
  ComboBox_Header(1157),
  ComboBox_HeaderTemplate(1158),
  ComboBox_IsDropDownOpen(1159),
  ComboBox_IsEditable(1160),
  ComboBox_IsSelectionBoxHighlighted(1161),
  ComboBox_MaxDropDownHeight(1162),
  ComboBox_PlaceholderText(1163),
  ComboBox_SelectionBoxItem(1164),
  ComboBox_SelectionBoxItemTemplate(1165),
  ComboBox_TemplateSettings(1166),
  CommandBar_PrimaryCommands(1167),
  CommandBar_SecondaryCommands(1168),
  FlipView_UseTouchAnimationsForAllNavigation(1169),
  HyperlinkButton_NavigateUri(1170),
  ListBox_SelectedItems(1171),
  ListBox_SelectionMode(1172),
  ListViewBase_CanDragItems(1173),
  ListViewBase_CanReorderItems(1174),
  ListViewBase_DataFetchSize(1175),
  ListViewBase_Footer(1176),
  ListViewBase_FooterTemplate(1177),
  ListViewBase_FooterTransitions(1178),
  ListViewBase_Header(1179),
  ListViewBase_HeaderTemplate(1180),
  ListViewBase_HeaderTransitions(1181),
  ListViewBase_IncrementalLoadingThreshold(1182),
  ListViewBase_IncrementalLoadingTrigger(1183),
  ListViewBase_IsActiveView(1184),
  ListViewBase_IsItemClickEnabled(1185),
  ListViewBase_IsSwipeEnabled(1186),
  ListViewBase_IsZoomedInView(1187),
  ListViewBase_ReorderMode(1188),
  ListViewBase_SelectedItems(1189),
  ListViewBase_SelectionMode(1190),
  ListViewBase_SemanticZoomOwner(1191),
  ListViewBase_ShowsScrollingPlaceholders(1192),
  RepeatButton_Delay(1193),
  RepeatButton_Interval(1194),
  ScrollViewer_BringIntoViewOnFocusChange(1195),
  ScrollViewer_ComputedHorizontalScrollBarVisibility(1196),
  ScrollViewer_ComputedVerticalScrollBarVisibility(1197),
  ScrollViewer_ExtentHeight(1198),
  ScrollViewer_ExtentWidth(1199),
  ScrollViewer_HorizontalOffset(1200),
  ScrollViewer_HorizontalScrollBarVisibility(1201),
  ScrollViewer_HorizontalScrollMode(1202),
  ScrollViewer_HorizontalSnapPointsAlignment(1203),
  ScrollViewer_HorizontalSnapPointsType(1204),
  ScrollViewer_IsDeferredScrollingEnabled(1205),
  ScrollViewer_IsHorizontalRailEnabled(1206),
  ScrollViewer_IsHorizontalScrollChainingEnabled(1207),
  ScrollViewer_IsScrollInertiaEnabled(1208),
  ScrollViewer_IsVerticalRailEnabled(1209),
  ScrollViewer_IsVerticalScrollChainingEnabled(1210),
  ScrollViewer_IsZoomChainingEnabled(1211),
  ScrollViewer_IsZoomInertiaEnabled(1212),
  ScrollViewer_LeftHeader(1213),
  ScrollViewer_MaxZoomFactor(1214),
  ScrollViewer_MinZoomFactor(1215),
  ScrollViewer_ScrollableHeight(1216),
  ScrollViewer_ScrollableWidth(1217),
  ScrollViewer_TopHeader(1218),
  ScrollViewer_TopLeftHeader(1219),
  ScrollViewer_VerticalOffset(1220),
  ScrollViewer_VerticalScrollBarVisibility(1221),
  ScrollViewer_VerticalScrollMode(1222),
  ScrollViewer_VerticalSnapPointsAlignment(1223),
  ScrollViewer_VerticalSnapPointsType(1224),
  ScrollViewer_ViewportHeight(1225),
  ScrollViewer_ViewportWidth(1226),
  ScrollViewer_ZoomFactor(1227),
  ScrollViewer_ZoomMode(1228),
  ScrollViewer_ZoomSnapPoints(1229),
  ScrollViewer_ZoomSnapPointsType(1230),
  ToggleButton_IsChecked(1231),
  ToggleButton_IsThreeState(1232),
  ToggleMenuFlyoutItem_IsChecked(1233),
  VirtualizingStackPanel_AreScrollSnapPointsRegular(1234),
  VirtualizingStackPanel_IsVirtualizing(1236),
  VirtualizingStackPanel_Orientation(1237),
  VirtualizingStackPanel_VirtualizationMode(1238),
  WrapGrid_HorizontalChildrenAlignment(1239),
  WrapGrid_ItemHeight(1240),
  WrapGrid_ItemWidth(1241),
  WrapGrid_MaximumRowsOrColumns(1242),
  WrapGrid_Orientation(1243),
  WrapGrid_VerticalChildrenAlignment(1244),
  AppBarButton_Icon(1245),
  AppBarButton_IsCompact(1246),
  AppBarButton_Label(1247),
  AppBarToggleButton_Icon(1248),
  AppBarToggleButton_IsCompact(1249),
  AppBarToggleButton_Label(1250),
  GridViewItem_TemplateSettings(1251),
  ListViewItem_TemplateSettings(1252),
  RadioButton_GroupName(1253),
  Glyphs_ColorFontPaletteIndex(1267),
  Glyphs_IsColorFontEnabled(1268),
  CalendarViewTemplateSettings_HasMoreContentAfter(1274),
  CalendarViewTemplateSettings_HasMoreContentBefore(1275),
  CalendarViewTemplateSettings_HasMoreViews(1276),
  CalendarViewTemplateSettings_HeaderText(1277),
  CalendarViewTemplateSettings_WeekDay1(1280),
  CalendarViewTemplateSettings_WeekDay2(1281),
  CalendarViewTemplateSettings_WeekDay3(1282),
  CalendarViewTemplateSettings_WeekDay4(1283),
  CalendarViewTemplateSettings_WeekDay5(1284),
  CalendarViewTemplateSettings_WeekDay6(1285),
  CalendarViewTemplateSettings_WeekDay7(1286),
  CalendarView_CalendarIdentifier(1291),
  CalendarView_DayOfWeekFormat(1299),
  CalendarView_DisplayMode(1302),
  CalendarView_FirstDayOfWeek(1303),
  CalendarView_IsOutOfScopeEnabled(1317),
  CalendarView_IsTodayHighlighted(1318),
  CalendarView_MaxDate(1320),
  CalendarView_MinDate(1321),
  CalendarView_NumberOfWeeksInView(1327),
  CalendarView_SelectedDates(1333),
  CalendarView_SelectionMode(1335),
  CalendarView_TemplateSettings(1336),
  CalendarViewDayItem_Date(1339),
  CalendarViewDayItem_IsBlackout(1340),
  MediaTransportControls_IsFastForwardEnabled(1382),
  MediaTransportControls_IsFastRewindEnabled(1383),
  MediaTransportControls_IsFullWindowEnabled(1384),
  MediaTransportControls_IsPlaybackRateEnabled(1385),
  MediaTransportControls_IsSeekEnabled(1386),
  MediaTransportControls_IsStopEnabled(1387),
  MediaTransportControls_IsVolumeEnabled(1388),
  MediaTransportControls_IsZoomEnabled(1389),
  ContentPresenter_LineHeight(1425),
  CalendarViewTemplateSettings_MinViewWidth(1435),
  ListViewBase_SelectedRanges(1459),
  SplitViewTemplateSettings_CompactPaneGridLength(1462),
  SplitViewTemplateSettings_NegativeOpenPaneLength(1463),
  SplitViewTemplateSettings_NegativeOpenPaneLengthMinusCompactLength(1464),
  SplitViewTemplateSettings_OpenPaneGridLength(1465),
  SplitViewTemplateSettings_OpenPaneLengthMinusCompactLength(1466),
  SplitView_CompactPaneLength(1467),
  SplitView_Content(1468),
  SplitView_DisplayMode(1469),
  SplitView_IsPaneOpen(1470),
  SplitView_OpenPaneLength(1471),
  SplitView_Pane(1472),
  SplitView_PanePlacement(1473),
  SplitView_TemplateSettings(1474),
  UIElement_Transform3D(1475),
  CompositeTransform3D_CenterX(1476),
  CompositeTransform3D_CenterY(1478),
  CompositeTransform3D_CenterZ(1480),
  CompositeTransform3D_RotationX(1482),
  CompositeTransform3D_RotationY(1484),
  CompositeTransform3D_RotationZ(1486),
  CompositeTransform3D_ScaleX(1488),
  CompositeTransform3D_ScaleY(1490),
  CompositeTransform3D_ScaleZ(1492),
  CompositeTransform3D_TranslateX(1494),
  CompositeTransform3D_TranslateY(1496),
  CompositeTransform3D_TranslateZ(1498),
  PerspectiveTransform3D_Depth(1500),
  PerspectiveTransform3D_OffsetX(1501),
  PerspectiveTransform3D_OffsetY(1502),
  RelativePanel_Above(1508),
  RelativePanel_AlignBottomWith(1509),
  RelativePanel_AlignLeftWith(1510),
  RelativePanel_AlignRightWith(1515),
  RelativePanel_AlignTopWith(1516),
  RelativePanel_Below(1517),
  RelativePanel_LeftOf(1520),
  RelativePanel_RightOf(1521),
  SplitViewTemplateSettings_OpenPaneLength(1524),
  PasswordBox_PasswordRevealMode(1527),
  SplitView_PaneBackground(1528),
  ItemsStackPanel_AreStickyGroupHeadersEnabled(1529),
  ItemsWrapGrid_AreStickyGroupHeadersEnabled(1530),
  MenuFlyoutSubItem_Items(1531),
  MenuFlyoutSubItem_Text(1532),
  UIElement_CanDrag(1534),
  DataTemplate_ExtensionInstance(1535),
  RelativePanel_AlignHorizontalCenterWith(1552),
  RelativePanel_AlignVerticalCenterWith(1553),
  TargetPropertyPath_Path(1555),
  TargetPropertyPath_Target(1556),
  VisualState_Setters(1558),
  VisualState_StateTriggers(1559),
  AdaptiveTrigger_MinWindowHeight(1560),
  AdaptiveTrigger_MinWindowWidth(1561),
  Setter_Target(1562),
  CalendarView_BlackoutForeground(1565),
  CalendarView_CalendarItemBackground(1566),
  CalendarView_CalendarItemBorderBrush(1567),
  CalendarView_CalendarItemBorderThickness(1568),
  CalendarView_CalendarItemForeground(1569),
  CalendarView_CalendarViewDayItemStyle(1570),
  CalendarView_DayItemFontFamily(1571),
  CalendarView_DayItemFontSize(1572),
  CalendarView_DayItemFontStyle(1573),
  CalendarView_DayItemFontWeight(1574),
  CalendarView_FirstOfMonthLabelFontFamily(1575),
  CalendarView_FirstOfMonthLabelFontSize(1576),
  CalendarView_FirstOfMonthLabelFontStyle(1577),
  CalendarView_FirstOfMonthLabelFontWeight(1578),
  CalendarView_FirstOfYearDecadeLabelFontFamily(1579),
  CalendarView_FirstOfYearDecadeLabelFontSize(1580),
  CalendarView_FirstOfYearDecadeLabelFontStyle(1581),
  CalendarView_FirstOfYearDecadeLabelFontWeight(1582),
  CalendarView_FocusBorderBrush(1583),
  CalendarView_HorizontalDayItemAlignment(1584),
  CalendarView_HorizontalFirstOfMonthLabelAlignment(1585),
  CalendarView_HoverBorderBrush(1586),
  CalendarView_MonthYearItemFontFamily(1588),
  CalendarView_MonthYearItemFontSize(1589),
  CalendarView_MonthYearItemFontStyle(1590),
  CalendarView_MonthYearItemFontWeight(1591),
  CalendarView_OutOfScopeBackground(1592),
  CalendarView_OutOfScopeForeground(1593),
  CalendarView_PressedBorderBrush(1594),
  CalendarView_PressedForeground(1595),
  CalendarView_SelectedBorderBrush(1596),
  CalendarView_SelectedForeground(1597),
  CalendarView_SelectedHoverBorderBrush(1598),
  CalendarView_SelectedPressedBorderBrush(1599),
  CalendarView_TodayFontWeight(1600),
  CalendarView_TodayForeground(1601),
  CalendarView_VerticalDayItemAlignment(1602),
  CalendarView_VerticalFirstOfMonthLabelAlignment(1603),
  MediaTransportControls_IsCompact(1605),
  RelativePanel_AlignBottomWithPanel(1606),
  RelativePanel_AlignHorizontalCenterWithPanel(1607),
  RelativePanel_AlignLeftWithPanel(1608),
  RelativePanel_AlignRightWithPanel(1609),
  RelativePanel_AlignTopWithPanel(1610),
  RelativePanel_AlignVerticalCenterWithPanel(1611),
  ListViewBase_IsMultiSelectCheckBoxEnabled(1612),
  AutomationProperties_Level(1614),
  AutomationProperties_PositionInSet(1615),
  AutomationProperties_SizeOfSet(1616),
  ListViewItemPresenter_CheckBoxBrush(1617),
  ListViewItemPresenter_CheckMode(1618),
  ListViewItemPresenter_PressedBackground(1620),
  ListViewItemPresenter_SelectedPressedBackground(1621),
  Control_IsTemplateFocusTarget(1623),
  Control_UseSystemFocusVisuals(1624),
  ListViewItemPresenter_FocusSecondaryBorderBrush(1628),
  ListViewItemPresenter_PointerOverForeground(1630),
  FontIcon_MirroredWhenRightToLeft(1631),
  CalendarViewTemplateSettings_CenterX(1632),
  CalendarViewTemplateSettings_CenterY(1633),
  CalendarViewTemplateSettings_ClipRect(1634),
  PasswordBox_TextReadingOrder(1650),
  RichEditBox_TextReadingOrder(1651),
  TextBox_TextReadingOrder(1652),
  WebView_ExecutionMode(1653),
  WebView_DeferredPermissionRequests(1655),
  WebView_Settings(1656),
  RichEditBox_DesiredCandidateWindowAlignment(1660),
  TextBox_DesiredCandidateWindowAlignment(1662),
  CalendarDatePicker_CalendarIdentifier(1663),
  CalendarDatePicker_CalendarViewStyle(1664),
  CalendarDatePicker_Date(1665),
  CalendarDatePicker_DateFormat(1666),
  CalendarDatePicker_DayOfWeekFormat(1667),
  CalendarDatePicker_DisplayMode(1668),
  CalendarDatePicker_FirstDayOfWeek(1669),
  CalendarDatePicker_Header(1670),
  CalendarDatePicker_HeaderTemplate(1671),
  CalendarDatePicker_IsCalendarOpen(1672),
  CalendarDatePicker_IsGroupLabelVisible(1673),
  CalendarDatePicker_IsOutOfScopeEnabled(1674),
  CalendarDatePicker_IsTodayHighlighted(1675),
  CalendarDatePicker_MaxDate(1676),
  CalendarDatePicker_MinDate(1677),
  CalendarDatePicker_PlaceholderText(1678),
  CalendarView_IsGroupLabelVisible(1679),
  ContentPresenter_Background(1680),
  ContentPresenter_BorderBrush(1681),
  ContentPresenter_BorderThickness(1682),
  ContentPresenter_CornerRadius(1683),
  ContentPresenter_Padding(1684),
  Grid_BorderBrush(1685),
  Grid_BorderThickness(1686),
  Grid_CornerRadius(1687),
  Grid_Padding(1688),
  RelativePanel_BorderBrush(1689),
  RelativePanel_BorderThickness(1690),
  RelativePanel_CornerRadius(1691),
  RelativePanel_Padding(1692),
  StackPanel_BorderBrush(1693),
  StackPanel_BorderThickness(1694),
  StackPanel_CornerRadius(1695),
  StackPanel_Padding(1696),
  PasswordBox_InputScope(1697),
  MediaTransportControlsHelper_DropoutOrder(1698),
  AutoSuggestBoxQuerySubmittedEventArgs_ChosenSuggestion(1699),
  AutoSuggestBoxQuerySubmittedEventArgs_QueryText(1700),
  AutoSuggestBox_QueryIcon(1701),
  StateTrigger_IsActive(1702),
  ContentPresenter_HorizontalContentAlignment(1703),
  ContentPresenter_VerticalContentAlignment(1704),
  AppBarTemplateSettings_ClipRect(1705),
  AppBarTemplateSettings_CompactRootMargin(1706),
  AppBarTemplateSettings_CompactVerticalDelta(1707),
  AppBarTemplateSettings_HiddenRootMargin(1708),
  AppBarTemplateSettings_HiddenVerticalDelta(1709),
  AppBarTemplateSettings_MinimalRootMargin(1710),
  AppBarTemplateSettings_MinimalVerticalDelta(1711),
  CommandBarTemplateSettings_ContentHeight(1712),
  CommandBarTemplateSettings_NegativeOverflowContentHeight(1713),
  CommandBarTemplateSettings_OverflowContentClipRect(1714),
  CommandBarTemplateSettings_OverflowContentHeight(1715),
  CommandBarTemplateSettings_OverflowContentHorizontalOffset(1716),
  CommandBarTemplateSettings_OverflowContentMaxHeight(1717),
  CommandBarTemplateSettings_OverflowContentMinWidth(1718),
  AppBar_TemplateSettings(1719),
  CommandBar_CommandBarOverflowPresenterStyle(1720),
  CommandBar_CommandBarTemplateSettings(1721),
  DrillInThemeAnimation_EntranceTarget(1722),
  DrillInThemeAnimation_EntranceTargetName(1723),
  DrillInThemeAnimation_ExitTarget(1724),
  DrillInThemeAnimation_ExitTargetName(1725),
  DrillOutThemeAnimation_EntranceTarget(1726),
  DrillOutThemeAnimation_EntranceTargetName(1727),
  DrillOutThemeAnimation_ExitTarget(1728),
  DrillOutThemeAnimation_ExitTargetName(1729),
  XamlBindingHelper_DataTemplateComponent(1730),
  AutomationProperties_Annotations(1732),
  AutomationAnnotation_Element(1733),
  AutomationAnnotation_Type(1734),
  AutomationPeerAnnotation_Peer(1735),
  AutomationPeerAnnotation_Type(1736),
  Hyperlink_UnderlineStyle(1741),
  CalendarView_DisabledForeground(1742),
  CalendarView_TodayBackground(1743),
  CalendarView_TodayBlackoutBackground(1744),
  CalendarView_TodaySelectedInnerBorderBrush(1747),
  Control_IsFocusEngaged(1749),
  Control_IsFocusEngagementEnabled(1752),
  RichEditBox_ClipboardCopyFormat(1754),
  CommandBarTemplateSettings_OverflowContentMaxWidth(1757),
  ComboBoxTemplateSettings_DropDownContentMinWidth(1758),
  MenuFlyoutPresenterTemplateSettings_FlyoutContentMinWidth(1762),
  MenuFlyoutPresenter_TemplateSettings(1763),
  AutomationProperties_LandmarkType(1766),
  AutomationProperties_LocalizedLandmarkType(1767),
  RepositionThemeTransition_IsStaggeringEnabled(1769),
  ListBox_SingleSelectionFollowsFocus(1770),
  ListViewBase_SingleSelectionFollowsFocus(1771),
  BitmapImage_AutoPlay(1773),
  BitmapImage_IsAnimatedBitmap(1774),
  BitmapImage_IsPlaying(1775),
  AutomationProperties_FullDescription(1776),
  AutomationProperties_IsDataValidForForm(1777),
  AutomationProperties_IsPeripheral(1778),
  AutomationProperties_LocalizedControlType(1779),
  FlyoutBase_AllowFocusOnInteraction(1780),
  TextElement_AllowFocusOnInteraction(1781),
  FrameworkElement_AllowFocusOnInteraction(1782),
  Control_RequiresPointer(1783),
  UIElement_ContextFlyout(1785),
  TextElement_AccessKey(1786),
  UIElement_AccessKeyScopeOwner(1787),
  UIElement_IsAccessKeyScope(1788),
  AutomationProperties_DescribedBy(1790),
  UIElement_AccessKey(1803),
  Control_XYFocusDown(1804),
  Control_XYFocusLeft(1805),
  Control_XYFocusRight(1806),
  Control_XYFocusUp(1807),
  Hyperlink_XYFocusDown(1808),
  Hyperlink_XYFocusLeft(1809),
  Hyperlink_XYFocusRight(1810),
  Hyperlink_XYFocusUp(1811),
  WebView_XYFocusDown(1812),
  WebView_XYFocusLeft(1813),
  WebView_XYFocusRight(1814),
  WebView_XYFocusUp(1815),
  CommandBarTemplateSettings_EffectiveOverflowButtonVisibility(1816),
  AppBarSeparator_IsInOverflow(1817),
  CommandBar_DefaultLabelPosition(1818),
  CommandBar_IsDynamicOverflowEnabled(1819),
  CommandBar_OverflowButtonVisibility(1820),
  AppBarButton_IsInOverflow(1821),
  AppBarButton_LabelPosition(1822),
  AppBarToggleButton_IsInOverflow(1823),
  AppBarToggleButton_LabelPosition(1824),
  FlyoutBase_LightDismissOverlayMode(1825),
  Popup_LightDismissOverlayMode(1827),
  CalendarDatePicker_LightDismissOverlayMode(1829),
  DatePicker_LightDismissOverlayMode(1830),
  SplitView_LightDismissOverlayMode(1831),
  TimePicker_LightDismissOverlayMode(1832),
  AppBar_LightDismissOverlayMode(1833),
  AutoSuggestBox_LightDismissOverlayMode(1834),
  ComboBox_LightDismissOverlayMode(1835),
  AppBarSeparator_DynamicOverflowOrder(1836),
  AppBarButton_DynamicOverflowOrder(1837),
  AppBarToggleButton_DynamicOverflowOrder(1838),
  FrameworkElement_FocusVisualMargin(1839),
  FrameworkElement_FocusVisualPrimaryBrush(1840),
  FrameworkElement_FocusVisualPrimaryThickness(1841),
  FrameworkElement_FocusVisualSecondaryBrush(1842),
  FrameworkElement_FocusVisualSecondaryThickness(1843),
  FlyoutBase_AllowFocusWhenDisabled(1846),
  FrameworkElement_AllowFocusWhenDisabled(1847),
  ComboBox_IsTextSearchEnabled(1848),
  TextElement_ExitDisplayModeOnAccessKeyInvoked(1849),
  UIElement_ExitDisplayModeOnAccessKeyInvoked(1850),
  MediaPlayerPresenter_IsFullWindow(1851),
  MediaPlayerPresenter_MediaPlayer(1852),
  MediaPlayerPresenter_Stretch(1853),
  MediaPlayerElement_AreTransportControlsEnabled(1854),
  MediaPlayerElement_AutoPlay(1855),
  MediaPlayerElement_IsFullWindow(1856),
  MediaPlayerElement_MediaPlayer(1857),
  MediaPlayerElement_PosterSource(1858),
  MediaPlayerElement_Source(1859),
  MediaPlayerElement_Stretch(1860),
  MediaPlayerElement_TransportControls(1861),
  MediaTransportControls_FastPlayFallbackBehaviour(1862),
  MediaTransportControls_IsNextTrackButtonVisible(1863),
  MediaTransportControls_IsPreviousTrackButtonVisible(1864),
  MediaTransportControls_IsSkipBackwardButtonVisible(1865),
  MediaTransportControls_IsSkipBackwardEnabled(1866),
  MediaTransportControls_IsSkipForwardButtonVisible(1867),
  MediaTransportControls_IsSkipForwardEnabled(1868),
  FlyoutBase_ElementSoundMode(1869),
  Control_ElementSoundMode(1870),
  Hyperlink_ElementSoundMode(1871),
  AutomationProperties_FlowsFrom(1876),
  AutomationProperties_FlowsTo(1877),
  TextElement_TextDecorations(1879),
  RichTextBlock_TextDecorations(1881),
  Control_DefaultStyleResourceUri(1882),
  ContentDialog_PrimaryButtonStyle(1884),
  ContentDialog_SecondaryButtonStyle(1885),
  TextElement_KeyTipHorizontalOffset(1890),
  TextElement_KeyTipPlacementMode(1891),
  TextElement_KeyTipVerticalOffset(1892),
  UIElement_KeyTipHorizontalOffset(1893),
  UIElement_KeyTipPlacementMode(1894),
  UIElement_KeyTipVerticalOffset(1895),
  FlyoutBase_OverlayInputPassThroughElement(1896),
  UIElement_XYFocusKeyboardNavigation(1897),
  AutomationProperties_Culture(1898),
  UIElement_XYFocusDownNavigationStrategy(1918),
  UIElement_XYFocusLeftNavigationStrategy(1919),
  UIElement_XYFocusRightNavigationStrategy(1920),
  UIElement_XYFocusUpNavigationStrategy(1921),
  Hyperlink_XYFocusDownNavigationStrategy(1922),
  Hyperlink_XYFocusLeftNavigationStrategy(1923),
  Hyperlink_XYFocusRightNavigationStrategy(1924),
  Hyperlink_XYFocusUpNavigationStrategy(1925),
  TextElement_AccessKeyScopeOwner(1926),
  TextElement_IsAccessKeyScope(1927),
  Hyperlink_FocusState(1934),
  ContentDialog_CloseButtonCommand(1936),
  ContentDialog_CloseButtonCommandParameter(1937),
  ContentDialog_CloseButtonStyle(1938),
  ContentDialog_CloseButtonText(1939),
  ContentDialog_DefaultButton(1940),
  RichEditBox_SelectionHighlightColorWhenNotFocused(1941),
  TextBox_SelectionHighlightColorWhenNotFocused(1942),
  SvgImageSource_RasterizePixelHeight(1948),
  SvgImageSource_RasterizePixelWidth(1949),
  SvgImageSource_UriSource(1950),
  LoadedImageSurface_DecodedPhysicalSize(1955),
  LoadedImageSurface_DecodedSize(1956),
  LoadedImageSurface_NaturalSize(1957),
  ComboBox_SelectionChangedTrigger(1958),
  XamlCompositionBrushBase_FallbackColor(1960),
  UIElement_Lights(1962),
  MenuFlyoutItem_Icon(1963),
  MenuFlyoutSubItem_Icon(1964),
  BitmapIcon_ShowAsMonochrome(1965),
  UIElement_HighContrastAdjustment(1967),
  RichEditBox_MaxLength(1968),
  UIElement_TabFocusNavigation(1969),
  Control_IsTemplateKeyTipTarget(1970),
  Hyperlink_IsTabStop(1972),
  Hyperlink_TabIndex(1973),
  MediaTransportControls_IsRepeatButtonVisible(1974),
  MediaTransportControls_IsRepeatEnabled(1975),
  MediaTransportControls_ShowAndHideAutomatically(1976),
  RichEditBox_DisabledFormattingAccelerators(1977),
  RichEditBox_CharacterCasing(1978),
  TextBox_CharacterCasing(1979),
  RichTextBlock_IsTextTrimmed(1980),
  RichTextBlockOverflow_IsTextTrimmed(1981),
  TextBlock_IsTextTrimmed(1982),
  TextHighlighter_Background(1985),
  TextHighlighter_Foreground(1986),
  TextHighlighter_Ranges(1987),
  RichTextBlock_TextHighlighters(1988),
  TextBlock_TextHighlighters(1989),
  FrameworkElement_ActualTheme(1992),
  Grid_ColumnSpacing(1993),
  Grid_RowSpacing(1994),
  StackPanel_Spacing(1995),
  Block_HorizontalTextAlignment(1996),
  RichTextBlock_HorizontalTextAlignment(1997),
  TextBlock_HorizontalTextAlignment(1998),
  RichEditBox_HorizontalTextAlignment(1999),
  TextBox_HorizontalTextAlignment(2000),
  TextBox_PlaceholderForeground(2001),
  ComboBox_PlaceholderForeground(2002),
  KeyboardAccelerator_IsEnabled(2003),
  KeyboardAccelerator_Key(2004),
  KeyboardAccelerator_Modifiers(2005),
  KeyboardAccelerator_ScopeOwner(2006),
  UIElement_KeyboardAccelerators(2007),
  ListViewItemPresenter_RevealBackground(2009),
  ListViewItemPresenter_RevealBackgroundShowsAboveContent(2010),
  ListViewItemPresenter_RevealBorderBrush(2011),
  ListViewItemPresenter_RevealBorderThickness(2012),
  UIElement_KeyTipTarget(2014),
  AppBarButtonTemplateSettings_KeyboardAcceleratorTextMinWidth(2015),
  AppBarToggleButtonTemplateSettings_KeyboardAcceleratorTextMinWidth(2016),
  MenuFlyoutItemTemplateSettings_KeyboardAcceleratorTextMinWidth(2017),
  MenuFlyoutItem_TemplateSettings(2019),
  AppBarButton_TemplateSettings(2021),
  AppBarToggleButton_TemplateSettings(2023),
  UIElement_KeyboardAcceleratorPlacementMode(2028),
  MediaTransportControls_IsCompactOverlayButtonVisible(2032),
  MediaTransportControls_IsCompactOverlayEnabled(2033),
  UIElement_KeyboardAcceleratorPlacementTarget(2061),
  UIElement_CenterPoint(2062),
  UIElement_Rotation(2063),
  UIElement_RotationAxis(2064),
  UIElement_Scale(2065),
  UIElement_TransformMatrix(2066),
  UIElement_Translation(2067),
  TextBox_HandwritingView(2068),
  AutomationProperties_HeadingLevel(2069),
  TextBox_IsHandwritingViewEnabled(2076),
  RichEditBox_ContentLinkProviders(2078),
  RichEditBox_ContentLinkBackgroundColor(2079),
  RichEditBox_ContentLinkForegroundColor(2080),
  HandwritingView_AreCandidatesEnabled(2081),
  HandwritingView_IsOpen(2082),
  HandwritingView_PlacementTarget(2084),
  HandwritingView_PlacementAlignment(2085),
  RichEditBox_HandwritingView(2086),
  RichEditBox_IsHandwritingViewEnabled(2087),
  MenuFlyoutItem_KeyboardAcceleratorTextOverride(2090),
  AppBarButton_KeyboardAcceleratorTextOverride(2091),
  AppBarToggleButton_KeyboardAcceleratorTextOverride(2092),
  ContentLink_Background(2093),
  ContentLink_Cursor(2094),
  ContentLink_ElementSoundMode(2095),
  ContentLink_FocusState(2096),
  ContentLink_IsTabStop(2097),
  ContentLink_TabIndex(2098),
  ContentLink_XYFocusDown(2099),
  ContentLink_XYFocusDownNavigationStrategy(2100),
  ContentLink_XYFocusLeft(2101),
  ContentLink_XYFocusLeftNavigationStrategy(2102),
  ContentLink_XYFocusRight(2103),
  ContentLink_XYFocusRightNavigationStrategy(2104),
  ContentLink_XYFocusUp(2105),
  ContentLink_XYFocusUpNavigationStrategy(2106),
  IconSource_Foreground(2112),
  BitmapIconSource_ShowAsMonochrome(2113),
  BitmapIconSource_UriSource(2114),
  FontIconSource_FontFamily(2115),
  FontIconSource_FontSize(2116),
  FontIconSource_FontStyle(2117),
  FontIconSource_FontWeight(2118),
  FontIconSource_Glyph(2119),
  FontIconSource_IsTextScaleFactorEnabled(2120),
  FontIconSource_MirroredWhenRightToLeft(2121),
  PathIconSource_Data(2122),
  SymbolIconSource_Symbol(2123),
  UIElement_Shadow(2130),
  IconSourceElement_IconSource(2131),
  PasswordBox_CanPasteClipboardContent(2137),
  TextBox_CanPasteClipboardContent(2138),
  TextBox_CanRedo(2139),
  TextBox_CanUndo(2140),
  FlyoutBase_ShowMode(2141),
  FlyoutBase_Target(2142),
  Control_CornerRadius(2143),
  AutomationProperties_IsDialog(2149),
  AppBarElementContainer_DynamicOverflowOrder(2150),
  AppBarElementContainer_IsCompact(2151),
  AppBarElementContainer_IsInOverflow(2152),
  ScrollContentPresenter_CanContentRenderOutsideBounds(2157),
  ScrollViewer_CanContentRenderOutsideBounds(2158),
  RichEditBox_SelectionFlyout(2159),
  TextBox_SelectionFlyout(2160),
  Border_BackgroundSizing(2161),
  ContentPresenter_BackgroundSizing(2162),
  Control_BackgroundSizing(2163),
  Grid_BackgroundSizing(2164),
  RelativePanel_BackgroundSizing(2165),
  StackPanel_BackgroundSizing(2166),
  ScrollViewer_HorizontalAnchorRatio(2170),
  ScrollViewer_VerticalAnchorRatio(2171),
  ComboBox_Text(2208),
  TextBox_Description(2217),
  ToolTip_PlacementRect(2218),
  RichTextBlock_SelectionFlyout(2219),
  TextBlock_SelectionFlyout(2220),
  PasswordBox_SelectionFlyout(2221),
  Border_BackgroundTransition(2222),
  ContentPresenter_BackgroundTransition(2223),
  Panel_BackgroundTransition(2224),
  ColorPaletteResources_Accent(2227),
  ColorPaletteResources_AltHigh(2228),
  ColorPaletteResources_AltLow(2229),
  ColorPaletteResources_AltMedium(2230),
  ColorPaletteResources_AltMediumHigh(2231),
  ColorPaletteResources_AltMediumLow(2232),
  ColorPaletteResources_BaseHigh(2233),
  ColorPaletteResources_BaseLow(2234),
  ColorPaletteResources_BaseMedium(2235),
  ColorPaletteResources_BaseMediumHigh(2236),
  ColorPaletteResources_BaseMediumLow(2237),
  ColorPaletteResources_ChromeAltLow(2238),
  ColorPaletteResources_ChromeBlackHigh(2239),
  ColorPaletteResources_ChromeBlackLow(2240),
  ColorPaletteResources_ChromeBlackMedium(2241),
  ColorPaletteResources_ChromeBlackMediumLow(2242),
  ColorPaletteResources_ChromeDisabledHigh(2243),
  ColorPaletteResources_ChromeDisabledLow(2244),
  ColorPaletteResources_ChromeGray(2245),
  ColorPaletteResources_ChromeHigh(2246),
  ColorPaletteResources_ChromeLow(2247),
  ColorPaletteResources_ChromeMedium(2248),
  ColorPaletteResources_ChromeMediumLow(2249),
  ColorPaletteResources_ChromeWhite(2250),
  ColorPaletteResources_ErrorText(2252),
  ColorPaletteResources_ListLow(2253),
  ColorPaletteResources_ListMedium(2254),
  UIElement_TranslationTransition(2255),
  UIElement_OpacityTransition(2256),
  UIElement_RotationTransition(2257),
  UIElement_ScaleTransition(2258),
  BrushTransition_Duration(2261),
  ScalarTransition_Duration(2262),
  Vector3Transition_Duration(2263),
  Vector3Transition_Components(2266),
  FlyoutBase_IsOpen(2267),
  StandardUICommand_Kind(2275),
  UIElement_CanBeScrollAnchor(2276),
  ThemeShadow_Receivers(2279),
  ScrollContentPresenter_SizesContentToTemplatedParent(2280),
  ComboBox_TextBoxStyle(2281),
  Frame_IsNavigationStackEnabled(2282),
  RichEditBox_ProofingMenuFlyout(2283),
  TextBox_ProofingMenuFlyout(2284),
  ScrollViewer_ReduceViewportForCoreInputViewOcclusions(2295),
  FlyoutBase_AreOpenCloseAnimationsEnabled(2296),
  FlyoutBase_InputDevicePrefersPrimaryCommands(2297),
  CalendarDatePicker_Description(2300),
  PasswordBox_Description(2308),
  RichEditBox_Description(2316),
  AutoSuggestBox_Description(2331),
  ComboBox_Description(2339),
  XamlUICommand_AccessKey(2347),
  XamlUICommand_Command(2348),
  XamlUICommand_Description(2349),
  XamlUICommand_IconSource(2350),
  XamlUICommand_KeyboardAccelerators(2351),
  XamlUICommand_Label(2352),
  DatePicker_SelectedDate(2355),
  TimePicker_SelectedTime(2356),
  AppBarTemplateSettings_NegativeCompactVerticalDelta(2367),
  AppBarTemplateSettings_NegativeHiddenVerticalDelta(2368),
  AppBarTemplateSettings_NegativeMinimalVerticalDelta(2369),
  FlyoutBase_ShouldConstrainToRootBounds(2378),
  Popup_ShouldConstrainToRootBounds(2379),
  FlyoutPresenter_IsDefaultShadowEnabled(2380),
  MenuFlyoutPresenter_IsDefaultShadowEnabled(2381),
  UIElement_ActualOffset(2382),
  UIElement_ActualSize(2383),
  CommandBarTemplateSettings_OverflowContentCompactYTranslation(2384),
  CommandBarTemplateSettings_OverflowContentHiddenYTranslation(2385),
  CommandBarTemplateSettings_OverflowContentMinimalYTranslation(2386),
  HandwritingView_IsCommandBarOpen(2395),
  HandwritingView_IsSwitchToKeyboardEnabled(2396),
  ListViewItemPresenter_SelectionIndicatorVisualEnabled(2399),
  ListViewItemPresenter_SelectionIndicatorBrush(2400),
  ListViewItemPresenter_SelectionIndicatorMode(2401),
  ListViewItemPresenter_SelectionIndicatorPointerOverBrush(2402),
  ListViewItemPresenter_SelectionIndicatorPressedBrush(2403),
  ListViewItemPresenter_SelectedBorderBrush(2410),
  ListViewItemPresenter_SelectedInnerBorderBrush(2411),
  ListViewItemPresenter_CheckBoxCornerRadius(2412),
  ListViewItemPresenter_SelectionIndicatorCornerRadius(2413),
  ListViewItemPresenter_SelectedDisabledBorderBrush(2414),
  ListViewItemPresenter_SelectedPressedBorderBrush(2415),
  ListViewItemPresenter_SelectedDisabledBackground(2416),
  ListViewItemPresenter_PointerOverBorderBrush(2417),
  ListViewItemPresenter_CheckBoxPointerOverBrush(2418),
  ListViewItemPresenter_CheckBoxPressedBrush(2419),
  ListViewItemPresenter_CheckDisabledBrush(2420),
  ListViewItemPresenter_CheckPressedBrush(2421),
  ListViewItemPresenter_CheckBoxBorderBrush(2422),
  ListViewItemPresenter_CheckBoxDisabledBorderBrush(2423),
  ListViewItemPresenter_CheckBoxPressedBorderBrush(2424),
  ListViewItemPresenter_CheckBoxDisabledBrush(2425),
  ListViewItemPresenter_CheckBoxSelectedBrush(2426),
  ListViewItemPresenter_CheckBoxSelectedDisabledBrush(2427),
  ListViewItemPresenter_CheckBoxSelectedPointerOverBrush(2428),
  ListViewItemPresenter_CheckBoxSelectedPressedBrush(2429),
  ListViewItemPresenter_CheckBoxPointerOverBorderBrush(2430),
  ListViewItemPresenter_SelectionIndicatorDisabledBrush(2431),
  CalendarView_BlackoutBackground(2432),
  CalendarView_BlackoutStrikethroughBrush(2433),
  CalendarView_CalendarItemCornerRadius(2434),
  CalendarView_CalendarItemDisabledBackground(2435),
  CalendarView_CalendarItemHoverBackground(2436),
  CalendarView_CalendarItemPressedBackground(2437),
  CalendarView_DayItemMargin(2438),
  CalendarView_FirstOfMonthLabelMargin(2439),
  CalendarView_FirstOfYearDecadeLabelMargin(2440),
  CalendarView_MonthYearItemMargin(2441),
  CalendarView_OutOfScopeHoverForeground(2442),
  CalendarView_OutOfScopePressedForeground(2443),
  CalendarView_SelectedDisabledBorderBrush(2444),
  CalendarView_SelectedDisabledForeground(2445),
  CalendarView_SelectedHoverForeground(2446),
  CalendarView_SelectedPressedForeground(2447),
  CalendarView_TodayBlackoutForeground(2448),
  CalendarView_TodayDisabledBackground(2449),
  CalendarView_TodayHoverBackground(2450),
  CalendarView_TodayPressedBackground(2451),
  Popup_ActualPlacement(2452),
  Popup_DesiredPlacement(2453),
  Popup_PlacementTarget(2454),
  AutomationProperties_AutomationControlType(2455),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      XamlPropertyIndex {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      5 -> AutomationProperties_AcceleratorKey
      6 -> AutomationProperties_AccessibilityView
      7 -> AutomationProperties_AccessKey
      8 -> AutomationProperties_AutomationId
      9 -> AutomationProperties_ControlledPeers
      10 -> AutomationProperties_HelpText
      11 -> AutomationProperties_IsRequiredForForm
      12 -> AutomationProperties_ItemStatus
      13 -> AutomationProperties_ItemType
      14 -> AutomationProperties_LabeledBy
      15 -> AutomationProperties_LiveSetting
      16 -> AutomationProperties_Name
      24 -> ToolTipService_Placement
      25 -> ToolTipService_PlacementTarget
      26 -> ToolTipService_ToolTip
      28 -> Typography_AnnotationAlternates
      29 -> Typography_Capitals
      30 -> Typography_CapitalSpacing
      31 -> Typography_CaseSensitiveForms
      32 -> Typography_ContextualAlternates
      33 -> Typography_ContextualLigatures
      34 -> Typography_ContextualSwashes
      35 -> Typography_DiscretionaryLigatures
      36 -> Typography_EastAsianExpertForms
      37 -> Typography_EastAsianLanguage
      38 -> Typography_EastAsianWidths
      39 -> Typography_Fraction
      40 -> Typography_HistoricalForms
      41 -> Typography_HistoricalLigatures
      42 -> Typography_Kerning
      43 -> Typography_MathematicalGreek
      44 -> Typography_NumeralAlignment
      45 -> Typography_NumeralStyle
      46 -> Typography_SlashedZero
      47 -> Typography_StandardLigatures
      48 -> Typography_StandardSwashes
      49 -> Typography_StylisticAlternates
      50 -> Typography_StylisticSet1
      51 -> Typography_StylisticSet10
      52 -> Typography_StylisticSet11
      53 -> Typography_StylisticSet12
      54 -> Typography_StylisticSet13
      55 -> Typography_StylisticSet14
      56 -> Typography_StylisticSet15
      57 -> Typography_StylisticSet16
      58 -> Typography_StylisticSet17
      59 -> Typography_StylisticSet18
      60 -> Typography_StylisticSet19
      61 -> Typography_StylisticSet2
      62 -> Typography_StylisticSet20
      63 -> Typography_StylisticSet3
      64 -> Typography_StylisticSet4
      65 -> Typography_StylisticSet5
      66 -> Typography_StylisticSet6
      67 -> Typography_StylisticSet7
      68 -> Typography_StylisticSet8
      69 -> Typography_StylisticSet9
      70 -> Typography_Variants
      75 -> AutomationPeer_EventsSource
      76 -> AutoSuggestBoxSuggestionChosenEventArgs_SelectedItem
      77 -> AutoSuggestBoxTextChangedEventArgs_Reason
      78 -> Brush_Opacity
      79 -> Brush_RelativeTransform
      80 -> Brush_Transform
      81 -> CollectionViewSource_IsSourceGrouped
      82 -> CollectionViewSource_ItemsPath
      83 -> CollectionViewSource_Source
      84 -> CollectionViewSource_View
      90 -> ColorKeyFrame_KeyTime
      91 -> ColorKeyFrame_Value
      92 -> ColumnDefinition_ActualWidth
      93 -> ColumnDefinition_MaxWidth
      94 -> ColumnDefinition_MinWidth
      95 -> ColumnDefinition_Width
      96 -> ComboBoxTemplateSettings_DropDownClosedHeight
      97 -> ComboBoxTemplateSettings_DropDownOffset
      98 -> ComboBoxTemplateSettings_DropDownOpenedHeight
      99 -> ComboBoxTemplateSettings_SelectedItemDirection
      107 -> DoubleKeyFrame_KeyTime
      108 -> DoubleKeyFrame_Value
      111 -> EasingFunctionBase_EasingMode
      114 -> FlyoutBase_AttachedFlyout
      115 -> FlyoutBase_Placement
      118 -> Geometry_Bounds
      119 -> Geometry_Transform
      120 -> GradientStop_Color
      121 -> GradientStop_Offset
      124 -> GroupStyle_ContainerStyle
      125 -> GroupStyle_ContainerStyleSelector
      126 -> GroupStyle_HeaderContainerStyle
      127 -> GroupStyle_HeaderTemplate
      128 -> GroupStyle_HeaderTemplateSelector
      129 -> GroupStyle_HidesIfEmpty
      130 -> GroupStyle_Panel
      144 -> InertiaExpansionBehavior_DesiredDeceleration
      145 -> InertiaExpansionBehavior_DesiredExpansion
      146 -> InertiaRotationBehavior_DesiredDeceleration
      147 -> InertiaRotationBehavior_DesiredRotation
      148 -> InertiaTranslationBehavior_DesiredDeceleration
      149 -> InertiaTranslationBehavior_DesiredDisplacement
      150 -> InputScope_Names
      151 -> InputScopeName_NameValue
      153 -> KeySpline_ControlPoint1
      154 -> KeySpline_ControlPoint2
      159 -> ManipulationPivot_Center
      160 -> ManipulationPivot_Radius
      183 -> ObjectKeyFrame_KeyTime
      184 -> ObjectKeyFrame_Value
      185 -> PageStackEntry_SourcePageType
      192 -> PathFigure_IsClosed
      193 -> PathFigure_IsFilled
      194 -> PathFigure_Segments
      195 -> PathFigure_StartPoint
      199 -> Pointer_IsInContact
      200 -> Pointer_IsInRange
      201 -> Pointer_PointerDeviceType
      202 -> Pointer_PointerId
      205 -> PointKeyFrame_KeyTime
      206 -> PointKeyFrame_Value
      209 -> PrintDocument_DocumentSource
      211 -> ProgressBarTemplateSettings_ContainerAnimationEndPosition
      212 -> ProgressBarTemplateSettings_ContainerAnimationStartPosition
      213 -> ProgressBarTemplateSettings_EllipseAnimationEndPosition
      214 -> ProgressBarTemplateSettings_EllipseAnimationWellPosition
      215 -> ProgressBarTemplateSettings_EllipseDiameter
      216 -> ProgressBarTemplateSettings_EllipseOffset
      217 -> ProgressBarTemplateSettings_IndicatorLengthDelta
      218 -> ProgressRingTemplateSettings_EllipseDiameter
      219 -> ProgressRingTemplateSettings_EllipseOffset
      220 -> ProgressRingTemplateSettings_MaxSideLength
      221 -> PropertyPath_Path
      226 -> RowDefinition_ActualHeight
      227 -> RowDefinition_Height
      228 -> RowDefinition_MaxHeight
      229 -> RowDefinition_MinHeight
      233 -> SetterBase_IsSealed
      234 -> SettingsFlyoutTemplateSettings_BorderBrush
      235 -> SettingsFlyoutTemplateSettings_BorderThickness
      236 -> SettingsFlyoutTemplateSettings_ContentTransitions
      237 -> SettingsFlyoutTemplateSettings_HeaderBackground
      238 -> SettingsFlyoutTemplateSettings_HeaderForeground
      239 -> SettingsFlyoutTemplateSettings_IconSource
      244 -> Style_BasedOn
      245 -> Style_IsSealed
      246 -> Style_Setters
      247 -> Style_TargetType
      249 -> TextElement_CharacterSpacing
      250 -> TextElement_FontFamily
      251 -> TextElement_FontSize
      252 -> TextElement_FontStretch
      253 -> TextElement_FontStyle
      254 -> TextElement_FontWeight
      255 -> TextElement_Foreground
      256 -> TextElement_IsTextScaleFactorEnabled
      257 -> TextElement_Language
      263 -> Timeline_AutoReverse
      264 -> Timeline_BeginTime
      265 -> Timeline_Duration
      266 -> Timeline_FillBehavior
      267 -> Timeline_RepeatBehavior
      268 -> Timeline_SpeedRatio
      269 -> TimelineMarker_Text
      270 -> TimelineMarker_Time
      271 -> TimelineMarker_Type
      273 -> ToggleSwitchTemplateSettings_CurtainCurrentToOffOffset
      274 -> ToggleSwitchTemplateSettings_CurtainCurrentToOnOffset
      275 -> ToggleSwitchTemplateSettings_CurtainOffToOnOffset
      276 -> ToggleSwitchTemplateSettings_CurtainOnToOffOffset
      277 -> ToggleSwitchTemplateSettings_KnobCurrentToOffOffset
      278 -> ToggleSwitchTemplateSettings_KnobCurrentToOnOffset
      279 -> ToggleSwitchTemplateSettings_KnobOffToOnOffset
      280 -> ToggleSwitchTemplateSettings_KnobOnToOffOffset
      281 -> ToolTipTemplateSettings_FromHorizontalOffset
      282 -> ToolTipTemplateSettings_FromVerticalOffset
      292 -> UIElement_AllowDrop
      293 -> UIElement_CacheMode
      295 -> UIElement_Clip
      296 -> UIElement_CompositeMode
      297 -> UIElement_IsDoubleTapEnabled
      298 -> UIElement_IsHitTestVisible
      299 -> UIElement_IsHoldingEnabled
      300 -> UIElement_IsRightTapEnabled
      301 -> UIElement_IsTapEnabled
      302 -> UIElement_ManipulationMode
      303 -> UIElement_Opacity
      304 -> UIElement_PointerCaptures
      305 -> UIElement_Projection
      306 -> UIElement_RenderSize
      307 -> UIElement_RenderTransform
      308 -> UIElement_RenderTransformOrigin
      309 -> UIElement_Transitions
      311 -> UIElement_UseLayoutRounding
      312 -> UIElement_Visibility
      322 -> VisualState_Storyboard
      323 -> VisualStateGroup_States
      324 -> VisualStateGroup_Transitions
      325 -> VisualStateManager_CustomVisualStateManager
      326 -> VisualStateManager_VisualStateGroups
      327 -> VisualTransition_From
      328 -> VisualTransition_GeneratedDuration
      329 -> VisualTransition_GeneratedEasingFunction
      330 -> VisualTransition_Storyboard
      331 -> VisualTransition_To
      332 -> ArcSegment_IsLargeArc
      333 -> ArcSegment_Point
      334 -> ArcSegment_RotationAngle
      335 -> ArcSegment_Size
      336 -> ArcSegment_SweepDirection
      337 -> BackEase_Amplitude
      338 -> BeginStoryboard_Storyboard
      339 -> BezierSegment_Point1
      340 -> BezierSegment_Point2
      341 -> BezierSegment_Point3
      342 -> BitmapSource_PixelHeight
      343 -> BitmapSource_PixelWidth
      344 -> Block_LineHeight
      345 -> Block_LineStackingStrategy
      346 -> Block_Margin
      347 -> Block_TextAlignment
      348 -> BounceEase_Bounces
      349 -> BounceEase_Bounciness
      350 -> ColorAnimation_By
      351 -> ColorAnimation_EasingFunction
      352 -> ColorAnimation_EnableDependentAnimation
      353 -> ColorAnimation_From
      354 -> ColorAnimation_To
      355 -> ColorAnimationUsingKeyFrames_EnableDependentAnimation
      356 -> ColorAnimationUsingKeyFrames_KeyFrames
      357 -> ContentThemeTransition_HorizontalOffset
      358 -> ContentThemeTransition_VerticalOffset
      359 -> ControlTemplate_TargetType
      362 -> DispatcherTimer_Interval
      363 -> DoubleAnimation_By
      364 -> DoubleAnimation_EasingFunction
      365 -> DoubleAnimation_EnableDependentAnimation
      366 -> DoubleAnimation_From
      367 -> DoubleAnimation_To
      368 -> DoubleAnimationUsingKeyFrames_EnableDependentAnimation
      369 -> DoubleAnimationUsingKeyFrames_KeyFrames
      372 -> EasingColorKeyFrame_EasingFunction
      373 -> EasingDoubleKeyFrame_EasingFunction
      374 -> EasingPointKeyFrame_EasingFunction
      375 -> EdgeUIThemeTransition_Edge
      376 -> ElasticEase_Oscillations
      377 -> ElasticEase_Springiness
      378 -> EllipseGeometry_Center
      379 -> EllipseGeometry_RadiusX
      380 -> EllipseGeometry_RadiusY
      381 -> EntranceThemeTransition_FromHorizontalOffset
      382 -> EntranceThemeTransition_FromVerticalOffset
      383 -> EntranceThemeTransition_IsStaggeringEnabled
      384 -> EventTrigger_Actions
      385 -> EventTrigger_RoutedEvent
      386 -> ExponentialEase_Exponent
      387 -> Flyout_Content
      388 -> Flyout_FlyoutPresenterStyle
      389 -> FrameworkElement_ActualHeight
      390 -> FrameworkElement_ActualWidth
      391 -> FrameworkElement_DataContext
      392 -> FrameworkElement_FlowDirection
      393 -> FrameworkElement_Height
      394 -> FrameworkElement_HorizontalAlignment
      396 -> FrameworkElement_Language
      397 -> FrameworkElement_Margin
      398 -> FrameworkElement_MaxHeight
      399 -> FrameworkElement_MaxWidth
      400 -> FrameworkElement_MinHeight
      401 -> FrameworkElement_MinWidth
      402 -> FrameworkElement_Parent
      403 -> FrameworkElement_RequestedTheme
      404 -> FrameworkElement_Resources
      405 -> FrameworkElement_Style
      406 -> FrameworkElement_Tag
      407 -> FrameworkElement_Triggers
      408 -> FrameworkElement_VerticalAlignment
      409 -> FrameworkElement_Width
      410 -> FrameworkElementAutomationPeer_Owner
      411 -> GeometryGroup_Children
      412 -> GeometryGroup_FillRule
      413 -> GradientBrush_ColorInterpolationMode
      414 -> GradientBrush_GradientStops
      415 -> GradientBrush_MappingMode
      416 -> GradientBrush_SpreadMethod
      417 -> GridViewItemTemplateSettings_DragItemsCount
      419 -> ItemAutomationPeer_Item
      420 -> ItemAutomationPeer_ItemsControlAutomationPeer
      422 -> LineGeometry_EndPoint
      423 -> LineGeometry_StartPoint
      424 -> LineSegment_Point
      425 -> ListViewItemTemplateSettings_DragItemsCount
      426 -> Matrix3DProjection_ProjectionMatrix
      427 -> MenuFlyout_Items
      428 -> MenuFlyout_MenuFlyoutPresenterStyle
      429 -> ObjectAnimationUsingKeyFrames_EnableDependentAnimation
      430 -> ObjectAnimationUsingKeyFrames_KeyFrames
      431 -> PaneThemeTransition_Edge
      432 -> PathGeometry_Figures
      433 -> PathGeometry_FillRule
      434 -> PlaneProjection_CenterOfRotationX
      435 -> PlaneProjection_CenterOfRotationY
      436 -> PlaneProjection_CenterOfRotationZ
      437 -> PlaneProjection_GlobalOffsetX
      438 -> PlaneProjection_GlobalOffsetY
      439 -> PlaneProjection_GlobalOffsetZ
      440 -> PlaneProjection_LocalOffsetX
      441 -> PlaneProjection_LocalOffsetY
      442 -> PlaneProjection_LocalOffsetZ
      443 -> PlaneProjection_ProjectionMatrix
      444 -> PlaneProjection_RotationX
      445 -> PlaneProjection_RotationY
      446 -> PlaneProjection_RotationZ
      447 -> PointAnimation_By
      448 -> PointAnimation_EasingFunction
      449 -> PointAnimation_EnableDependentAnimation
      450 -> PointAnimation_From
      451 -> PointAnimation_To
      452 -> PointAnimationUsingKeyFrames_EnableDependentAnimation
      453 -> PointAnimationUsingKeyFrames_KeyFrames
      456 -> PolyBezierSegment_Points
      457 -> PolyLineSegment_Points
      458 -> PolyQuadraticBezierSegment_Points
      459 -> PopupThemeTransition_FromHorizontalOffset
      460 -> PopupThemeTransition_FromVerticalOffset
      461 -> PowerEase_Power
      466 -> QuadraticBezierSegment_Point1
      467 -> QuadraticBezierSegment_Point2
      470 -> RectangleGeometry_Rect
      471 -> RelativeSource_Mode
      472 -> RenderTargetBitmap_PixelHeight
      473 -> RenderTargetBitmap_PixelWidth
      474 -> Setter_Property
      475 -> Setter_Value
      476 -> SolidColorBrush_Color
      477 -> SplineColorKeyFrame_KeySpline
      478 -> SplineDoubleKeyFrame_KeySpline
      479 -> SplinePointKeyFrame_KeySpline
      483 -> TileBrush_AlignmentX
      484 -> TileBrush_AlignmentY
      485 -> TileBrush_Stretch
      487 -> Binding_Converter
      488 -> Binding_ConverterLanguage
      489 -> Binding_ConverterParameter
      490 -> Binding_ElementName
      491 -> Binding_FallbackValue
      492 -> Binding_Mode
      493 -> Binding_Path
      494 -> Binding_RelativeSource
      495 -> Binding_Source
      496 -> Binding_TargetNullValue
      497 -> Binding_UpdateSourceTrigger
      498 -> BitmapImage_CreateOptions
      499 -> BitmapImage_DecodePixelHeight
      500 -> BitmapImage_DecodePixelType
      501 -> BitmapImage_DecodePixelWidth
      502 -> BitmapImage_UriSource
      503 -> Border_Background
      504 -> Border_BorderBrush
      505 -> Border_BorderThickness
      506 -> Border_Child
      507 -> Border_ChildTransitions
      508 -> Border_CornerRadius
      509 -> Border_Padding
      510 -> CaptureElement_Source
      511 -> CaptureElement_Stretch
      514 -> CompositeTransform_CenterX
      515 -> CompositeTransform_CenterY
      516 -> CompositeTransform_Rotation
      517 -> CompositeTransform_ScaleX
      518 -> CompositeTransform_ScaleY
      519 -> CompositeTransform_SkewX
      520 -> CompositeTransform_SkewY
      521 -> CompositeTransform_TranslateX
      522 -> CompositeTransform_TranslateY
      523 -> ContentPresenter_CharacterSpacing
      524 -> ContentPresenter_Content
      525 -> ContentPresenter_ContentTemplate
      526 -> ContentPresenter_ContentTemplateSelector
      527 -> ContentPresenter_ContentTransitions
      528 -> ContentPresenter_FontFamily
      529 -> ContentPresenter_FontSize
      530 -> ContentPresenter_FontStretch
      531 -> ContentPresenter_FontStyle
      532 -> ContentPresenter_FontWeight
      533 -> ContentPresenter_Foreground
      534 -> ContentPresenter_IsTextScaleFactorEnabled
      535 -> ContentPresenter_LineStackingStrategy
      536 -> ContentPresenter_MaxLines
      537 -> ContentPresenter_OpticalMarginAlignment
      539 -> ContentPresenter_TextLineBounds
      540 -> ContentPresenter_TextWrapping
      541 -> Control_Background
      542 -> Control_BorderBrush
      543 -> Control_BorderThickness
      544 -> Control_CharacterSpacing
      546 -> Control_FocusState
      547 -> Control_FontFamily
      548 -> Control_FontSize
      549 -> Control_FontStretch
      550 -> Control_FontStyle
      551 -> Control_FontWeight
      552 -> Control_Foreground
      553 -> Control_HorizontalContentAlignment
      554 -> Control_IsEnabled
      555 -> Control_IsTabStop
      556 -> Control_IsTextScaleFactorEnabled
      557 -> Control_Padding
      558 -> Control_TabIndex
      559 -> Control_TabNavigation
      560 -> Control_Template
      561 -> Control_VerticalContentAlignment
      565 -> DragItemThemeAnimation_TargetName
      566 -> DragOverThemeAnimation_Direction
      567 -> DragOverThemeAnimation_TargetName
      568 -> DragOverThemeAnimation_ToOffset
      569 -> DropTargetItemThemeAnimation_TargetName
      570 -> FadeInThemeAnimation_TargetName
      571 -> FadeOutThemeAnimation_TargetName
      574 -> Glyphs_Fill
      575 -> Glyphs_FontRenderingEmSize
      576 -> Glyphs_FontUri
      577 -> Glyphs_Indices
      578 -> Glyphs_OriginX
      579 -> Glyphs_OriginY
      580 -> Glyphs_StyleSimulations
      581 -> Glyphs_UnicodeString
      584 -> IconElement_Foreground
      586 -> Image_NineGrid
      587 -> Image_PlayToSource
      588 -> Image_Source
      589 -> Image_Stretch
      591 -> ImageBrush_ImageSource
      592 -> InlineUIContainer_Child
      594 -> ItemsPresenter_Footer
      595 -> ItemsPresenter_FooterTemplate
      596 -> ItemsPresenter_FooterTransitions
      597 -> ItemsPresenter_Header
      598 -> ItemsPresenter_HeaderTemplate
      599 -> ItemsPresenter_HeaderTransitions
      601 -> ItemsPresenter_Padding
      602 -> LinearGradientBrush_EndPoint
      603 -> LinearGradientBrush_StartPoint
      604 -> MatrixTransform_Matrix
      605 -> MediaElement_ActualStereo3DVideoPackingMode
      606 -> MediaElement_AreTransportControlsEnabled
      607 -> MediaElement_AspectRatioHeight
      608 -> MediaElement_AspectRatioWidth
      609 -> MediaElement_AudioCategory
      610 -> MediaElement_AudioDeviceType
      611 -> MediaElement_AudioStreamCount
      612 -> MediaElement_AudioStreamIndex
      613 -> MediaElement_AutoPlay
      614 -> MediaElement_Balance
      615 -> MediaElement_BufferingProgress
      616 -> MediaElement_CanPause
      617 -> MediaElement_CanSeek
      618 -> MediaElement_CurrentState
      619 -> MediaElement_DefaultPlaybackRate
      620 -> MediaElement_DownloadProgress
      621 -> MediaElement_DownloadProgressOffset
      623 -> MediaElement_IsAudioOnly
      624 -> MediaElement_IsFullWindow
      625 -> MediaElement_IsLooping
      626 -> MediaElement_IsMuted
      627 -> MediaElement_IsStereo3DVideo
      628 -> MediaElement_Markers
      629 -> MediaElement_NaturalDuration
      630 -> MediaElement_NaturalVideoHeight
      631 -> MediaElement_NaturalVideoWidth
      632 -> MediaElement_PlaybackRate
      633 -> MediaElement_PlayToPreferredSourceUri
      634 -> MediaElement_PlayToSource
      635 -> MediaElement_Position
      636 -> MediaElement_PosterSource
      637 -> MediaElement_ProtectionManager
      638 -> MediaElement_RealTimePlayback
      639 -> MediaElement_Source
      640 -> MediaElement_Stereo3DVideoPackingMode
      641 -> MediaElement_Stereo3DVideoRenderMode
      642 -> MediaElement_Stretch
      643 -> MediaElement_TransportControls
      644 -> MediaElement_Volume
      647 -> Panel_Background
      648 -> Panel_Children
      649 -> Panel_ChildrenTransitions
      651 -> Panel_IsItemsHost
      652 -> Paragraph_Inlines
      653 -> Paragraph_TextIndent
      660 -> PointerDownThemeAnimation_TargetName
      662 -> PointerUpThemeAnimation_TargetName
      664 -> PopInThemeAnimation_FromHorizontalOffset
      665 -> PopInThemeAnimation_FromVerticalOffset
      666 -> PopInThemeAnimation_TargetName
      667 -> PopOutThemeAnimation_TargetName
      668 -> Popup_Child
      669 -> Popup_ChildTransitions
      670 -> Popup_HorizontalOffset
      673 -> Popup_IsLightDismissEnabled
      674 -> Popup_IsOpen
      676 -> Popup_VerticalOffset
      683 -> RepositionThemeAnimation_FromHorizontalOffset
      684 -> RepositionThemeAnimation_FromVerticalOffset
      685 -> RepositionThemeAnimation_TargetName
      687 -> ResourceDictionary_MergedDictionaries
      688 -> ResourceDictionary_Source
      689 -> ResourceDictionary_ThemeDictionaries
      691 -> RichTextBlock_Blocks
      692 -> RichTextBlock_CharacterSpacing
      693 -> RichTextBlock_FontFamily
      694 -> RichTextBlock_FontSize
      695 -> RichTextBlock_FontStretch
      696 -> RichTextBlock_FontStyle
      697 -> RichTextBlock_FontWeight
      698 -> RichTextBlock_Foreground
      699 -> RichTextBlock_HasOverflowContent
      700 -> RichTextBlock_IsColorFontEnabled
      701 -> RichTextBlock_IsTextScaleFactorEnabled
      702 -> RichTextBlock_IsTextSelectionEnabled
      703 -> RichTextBlock_LineHeight
      704 -> RichTextBlock_LineStackingStrategy
      705 -> RichTextBlock_MaxLines
      706 -> RichTextBlock_OpticalMarginAlignment
      707 -> RichTextBlock_OverflowContentTarget
      708 -> RichTextBlock_Padding
      709 -> RichTextBlock_SelectedText
      710 -> RichTextBlock_SelectionHighlightColor
      711 -> RichTextBlock_TextAlignment
      712 -> RichTextBlock_TextIndent
      713 -> RichTextBlock_TextLineBounds
      714 -> RichTextBlock_TextReadingOrder
      715 -> RichTextBlock_TextTrimming
      716 -> RichTextBlock_TextWrapping
      717 -> RichTextBlockOverflow_HasOverflowContent
      718 -> RichTextBlockOverflow_MaxLines
      719 -> RichTextBlockOverflow_OverflowContentTarget
      720 -> RichTextBlockOverflow_Padding
      721 -> RotateTransform_Angle
      722 -> RotateTransform_CenterX
      723 -> RotateTransform_CenterY
      725 -> Run_FlowDirection
      726 -> Run_Text
      727 -> ScaleTransform_CenterX
      728 -> ScaleTransform_CenterY
      729 -> ScaleTransform_ScaleX
      730 -> ScaleTransform_ScaleY
      732 -> SetterBaseCollection_IsSealed
      733 -> Shape_Fill
      734 -> Shape_GeometryTransform
      735 -> Shape_Stretch
      736 -> Shape_Stroke
      737 -> Shape_StrokeDashArray
      738 -> Shape_StrokeDashCap
      739 -> Shape_StrokeDashOffset
      740 -> Shape_StrokeEndLineCap
      741 -> Shape_StrokeLineJoin
      742 -> Shape_StrokeMiterLimit
      743 -> Shape_StrokeStartLineCap
      744 -> Shape_StrokeThickness
      745 -> SkewTransform_AngleX
      746 -> SkewTransform_AngleY
      747 -> SkewTransform_CenterX
      748 -> SkewTransform_CenterY
      749 -> Span_Inlines
      750 -> SplitCloseThemeAnimation_ClosedLength
      751 -> SplitCloseThemeAnimation_ClosedTarget
      752 -> SplitCloseThemeAnimation_ClosedTargetName
      753 -> SplitCloseThemeAnimation_ContentTarget
      754 -> SplitCloseThemeAnimation_ContentTargetName
      755 -> SplitCloseThemeAnimation_ContentTranslationDirection
      756 -> SplitCloseThemeAnimation_ContentTranslationOffset
      757 -> SplitCloseThemeAnimation_OffsetFromCenter
      758 -> SplitCloseThemeAnimation_OpenedLength
      759 -> SplitCloseThemeAnimation_OpenedTarget
      760 -> SplitCloseThemeAnimation_OpenedTargetName
      761 -> SplitOpenThemeAnimation_ClosedLength
      762 -> SplitOpenThemeAnimation_ClosedTarget
      763 -> SplitOpenThemeAnimation_ClosedTargetName
      764 -> SplitOpenThemeAnimation_ContentTarget
      765 -> SplitOpenThemeAnimation_ContentTargetName
      766 -> SplitOpenThemeAnimation_ContentTranslationDirection
      767 -> SplitOpenThemeAnimation_ContentTranslationOffset
      768 -> SplitOpenThemeAnimation_OffsetFromCenter
      769 -> SplitOpenThemeAnimation_OpenedLength
      770 -> SplitOpenThemeAnimation_OpenedTarget
      771 -> SplitOpenThemeAnimation_OpenedTargetName
      772 -> Storyboard_Children
      774 -> Storyboard_TargetName
      775 -> Storyboard_TargetProperty
      776 -> SwipeBackThemeAnimation_FromHorizontalOffset
      777 -> SwipeBackThemeAnimation_FromVerticalOffset
      778 -> SwipeBackThemeAnimation_TargetName
      779 -> SwipeHintThemeAnimation_TargetName
      780 -> SwipeHintThemeAnimation_ToHorizontalOffset
      781 -> SwipeHintThemeAnimation_ToVerticalOffset
      782 -> TextBlock_CharacterSpacing
      783 -> TextBlock_FontFamily
      784 -> TextBlock_FontSize
      785 -> TextBlock_FontStretch
      786 -> TextBlock_FontStyle
      787 -> TextBlock_FontWeight
      788 -> TextBlock_Foreground
      789 -> TextBlock_Inlines
      790 -> TextBlock_IsColorFontEnabled
      791 -> TextBlock_IsTextScaleFactorEnabled
      792 -> TextBlock_IsTextSelectionEnabled
      793 -> TextBlock_LineHeight
      794 -> TextBlock_LineStackingStrategy
      795 -> TextBlock_MaxLines
      796 -> TextBlock_OpticalMarginAlignment
      797 -> TextBlock_Padding
      798 -> TextBlock_SelectedText
      799 -> TextBlock_SelectionHighlightColor
      800 -> TextBlock_Text
      801 -> TextBlock_TextAlignment
      802 -> TextBlock_TextDecorations
      803 -> TextBlock_TextLineBounds
      804 -> TextBlock_TextReadingOrder
      805 -> TextBlock_TextTrimming
      806 -> TextBlock_TextWrapping
      811 -> TransformGroup_Children
      812 -> TransformGroup_Value
      814 -> TranslateTransform_X
      815 -> TranslateTransform_Y
      819 -> Viewbox_Child
      820 -> Viewbox_Stretch
      821 -> Viewbox_StretchDirection
      825 -> WebViewBrush_SourceName
      826 -> AppBarSeparator_IsCompact
      827 -> BitmapIcon_UriSource
      828 -> Canvas_Left
      829 -> Canvas_Top
      830 -> Canvas_ZIndex
      832 -> ContentControl_Content
      833 -> ContentControl_ContentTemplate
      834 -> ContentControl_ContentTemplateSelector
      835 -> ContentControl_ContentTransitions
      837 -> DatePicker_CalendarIdentifier
      838 -> DatePicker_Date
      839 -> DatePicker_DayFormat
      840 -> DatePicker_DayVisible
      841 -> DatePicker_Header
      842 -> DatePicker_HeaderTemplate
      843 -> DatePicker_MaxYear
      844 -> DatePicker_MinYear
      845 -> DatePicker_MonthFormat
      846 -> DatePicker_MonthVisible
      847 -> DatePicker_Orientation
      848 -> DatePicker_YearFormat
      849 -> DatePicker_YearVisible
      851 -> FontIcon_FontFamily
      852 -> FontIcon_FontSize
      853 -> FontIcon_FontStyle
      854 -> FontIcon_FontWeight
      855 -> FontIcon_Glyph
      856 -> FontIcon_IsTextScaleFactorEnabled
      857 -> Grid_Column
      858 -> Grid_ColumnDefinitions
      859 -> Grid_ColumnSpan
      860 -> Grid_Row
      861 -> Grid_RowDefinitions
      862 -> Grid_RowSpan
      863 -> Hub_DefaultSectionIndex
      864 -> Hub_Header
      865 -> Hub_HeaderTemplate
      866 -> Hub_IsActiveView
      867 -> Hub_IsZoomedInView
      868 -> Hub_Orientation
      869 -> Hub_SectionHeaders
      870 -> Hub_Sections
      871 -> Hub_SectionsInView
      872 -> Hub_SemanticZoomOwner
      873 -> HubSection_ContentTemplate
      874 -> HubSection_Header
      875 -> HubSection_HeaderTemplate
      876 -> HubSection_IsHeaderInteractive
      877 -> Hyperlink_NavigateUri
      879 -> ItemsControl_DisplayMemberPath
      880 -> ItemsControl_GroupStyle
      881 -> ItemsControl_GroupStyleSelector
      882 -> ItemsControl_IsGrouping
      884 -> ItemsControl_ItemContainerStyle
      885 -> ItemsControl_ItemContainerStyleSelector
      886 -> ItemsControl_ItemContainerTransitions
      887 -> ItemsControl_Items
      889 -> ItemsControl_ItemsPanel
      890 -> ItemsControl_ItemsSource
      891 -> ItemsControl_ItemTemplate
      892 -> ItemsControl_ItemTemplateSelector
      893 -> Line_X1
      894 -> Line_X2
      895 -> Line_Y1
      896 -> Line_Y2
      898 -> MediaTransportControls_IsFastForwardButtonVisible
      900 -> MediaTransportControls_IsFastRewindButtonVisible
      902 -> MediaTransportControls_IsFullWindowButtonVisible
      904 -> MediaTransportControls_IsPlaybackRateButtonVisible
      905 -> MediaTransportControls_IsSeekBarVisible
      908 -> MediaTransportControls_IsStopButtonVisible
      910 -> MediaTransportControls_IsVolumeButtonVisible
      912 -> MediaTransportControls_IsZoomButtonVisible
      913 -> PasswordBox_Header
      914 -> PasswordBox_HeaderTemplate
      915 -> PasswordBox_IsPasswordRevealButtonEnabled
      916 -> PasswordBox_MaxLength
      917 -> PasswordBox_Password
      918 -> PasswordBox_PasswordChar
      919 -> PasswordBox_PlaceholderText
      920 -> PasswordBox_PreventKeyboardDisplayOnProgrammaticFocus
      921 -> PasswordBox_SelectionHighlightColor
      922 -> Path_Data
      923 -> PathIcon_Data
      924 -> Polygon_FillRule
      925 -> Polygon_Points
      926 -> Polyline_FillRule
      927 -> Polyline_Points
      928 -> ProgressRing_IsActive
      929 -> ProgressRing_TemplateSettings
      930 -> RangeBase_LargeChange
      931 -> RangeBase_Maximum
      932 -> RangeBase_Minimum
      933 -> RangeBase_SmallChange
      934 -> RangeBase_Value
      935 -> Rectangle_RadiusX
      936 -> Rectangle_RadiusY
      937 -> RichEditBox_AcceptsReturn
      938 -> RichEditBox_Header
      939 -> RichEditBox_HeaderTemplate
      940 -> RichEditBox_InputScope
      941 -> RichEditBox_IsColorFontEnabled
      942 -> RichEditBox_IsReadOnly
      943 -> RichEditBox_IsSpellCheckEnabled
      944 -> RichEditBox_IsTextPredictionEnabled
      945 -> RichEditBox_PlaceholderText
      946 -> RichEditBox_PreventKeyboardDisplayOnProgrammaticFocus
      947 -> RichEditBox_SelectionHighlightColor
      948 -> RichEditBox_TextAlignment
      949 -> RichEditBox_TextWrapping
      950 -> SearchBox_ChooseSuggestionOnEnter
      951 -> SearchBox_FocusOnKeyboardInput
      952 -> SearchBox_PlaceholderText
      953 -> SearchBox_QueryText
      954 -> SearchBox_SearchHistoryContext
      955 -> SearchBox_SearchHistoryEnabled
      956 -> SemanticZoom_CanChangeViews
      957 -> SemanticZoom_IsZoomedInViewActive
      958 -> SemanticZoom_IsZoomOutButtonEnabled
      959 -> SemanticZoom_ZoomedInView
      960 -> SemanticZoom_ZoomedOutView
      961 -> StackPanel_AreScrollSnapPointsRegular
      962 -> StackPanel_Orientation
      963 -> SymbolIcon_Symbol
      964 -> TextBox_AcceptsReturn
      965 -> TextBox_Header
      966 -> TextBox_HeaderTemplate
      967 -> TextBox_InputScope
      968 -> TextBox_IsColorFontEnabled
      971 -> TextBox_IsReadOnly
      972 -> TextBox_IsSpellCheckEnabled
      973 -> TextBox_IsTextPredictionEnabled
      974 -> TextBox_MaxLength
      975 -> TextBox_PlaceholderText
      976 -> TextBox_PreventKeyboardDisplayOnProgrammaticFocus
      977 -> TextBox_SelectedText
      978 -> TextBox_SelectionHighlightColor
      979 -> TextBox_SelectionLength
      980 -> TextBox_SelectionStart
      981 -> TextBox_Text
      982 -> TextBox_TextAlignment
      983 -> TextBox_TextWrapping
      984 -> Thumb_IsDragging
      985 -> TickBar_Fill
      986 -> TimePicker_ClockIdentifier
      987 -> TimePicker_Header
      988 -> TimePicker_HeaderTemplate
      989 -> TimePicker_MinuteIncrement
      990 -> TimePicker_Time
      991 -> ToggleSwitch_Header
      992 -> ToggleSwitch_HeaderTemplate
      993 -> ToggleSwitch_IsOn
      994 -> ToggleSwitch_OffContent
      995 -> ToggleSwitch_OffContentTemplate
      996 -> ToggleSwitch_OnContent
      997 -> ToggleSwitch_OnContentTemplate
      998 -> ToggleSwitch_TemplateSettings
      999 -> UserControl_Content
      1000 -> VariableSizedWrapGrid_ColumnSpan
      1001 -> VariableSizedWrapGrid_HorizontalChildrenAlignment
      1002 -> VariableSizedWrapGrid_ItemHeight
      1003 -> VariableSizedWrapGrid_ItemWidth
      1004 -> VariableSizedWrapGrid_MaximumRowsOrColumns
      1005 -> VariableSizedWrapGrid_Orientation
      1006 -> VariableSizedWrapGrid_RowSpan
      1007 -> VariableSizedWrapGrid_VerticalChildrenAlignment
      1008 -> WebView_AllowedScriptNotifyUris
      1009 -> WebView_CanGoBack
      1010 -> WebView_CanGoForward
      1011 -> WebView_ContainsFullScreenElement
      1012 -> WebView_DataTransferPackage
      1013 -> WebView_DefaultBackgroundColor
      1014 -> WebView_DocumentTitle
      1015 -> WebView_Source
      1016 -> AppBar_ClosedDisplayMode
      1017 -> AppBar_IsOpen
      1018 -> AppBar_IsSticky
      1019 -> AutoSuggestBox_AutoMaximizeSuggestionArea
      1020 -> AutoSuggestBox_Header
      1021 -> AutoSuggestBox_IsSuggestionListOpen
      1022 -> AutoSuggestBox_MaxSuggestionListHeight
      1023 -> AutoSuggestBox_PlaceholderText
      1024 -> AutoSuggestBox_Text
      1025 -> AutoSuggestBox_TextBoxStyle
      1026 -> AutoSuggestBox_TextMemberPath
      1027 -> AutoSuggestBox_UpdateTextOnSelect
      1029 -> ButtonBase_ClickMode
      1030 -> ButtonBase_Command
      1031 -> ButtonBase_CommandParameter
      1032 -> ButtonBase_IsPointerOver
      1033 -> ButtonBase_IsPressed
      1034 -> ContentDialog_FullSizeDesired
      1035 -> ContentDialog_IsPrimaryButtonEnabled
      1036 -> ContentDialog_IsSecondaryButtonEnabled
      1037 -> ContentDialog_PrimaryButtonCommand
      1038 -> ContentDialog_PrimaryButtonCommandParameter
      1039 -> ContentDialog_PrimaryButtonText
      1040 -> ContentDialog_SecondaryButtonCommand
      1041 -> ContentDialog_SecondaryButtonCommandParameter
      1042 -> ContentDialog_SecondaryButtonText
      1043 -> ContentDialog_Title
      1044 -> ContentDialog_TitleTemplate
      1045 -> Frame_BackStack
      1046 -> Frame_BackStackDepth
      1047 -> Frame_CacheSize
      1048 -> Frame_CanGoBack
      1049 -> Frame_CanGoForward
      1050 -> Frame_CurrentSourcePageType
      1051 -> Frame_ForwardStack
      1052 -> Frame_SourcePageType
      1053 -> GridViewItemPresenter_CheckBrush
      1054 -> GridViewItemPresenter_CheckHintBrush
      1055 -> GridViewItemPresenter_CheckSelectingBrush
      1056 -> GridViewItemPresenter_ContentMargin
      1057 -> GridViewItemPresenter_DisabledOpacity
      1058 -> GridViewItemPresenter_DragBackground
      1059 -> GridViewItemPresenter_DragForeground
      1060 -> GridViewItemPresenter_DragOpacity
      1061 -> GridViewItemPresenter_FocusBorderBrush
      1062 -> GridViewItemPresenter_GridViewItemPresenterHorizontalContentAlignment
      1063 -> GridViewItemPresenter_GridViewItemPresenterPadding
      1064 -> GridViewItemPresenter_PlaceholderBackground
      1065 -> GridViewItemPresenter_PointerOverBackground
      1066 -> GridViewItemPresenter_PointerOverBackgroundMargin
      1067 -> GridViewItemPresenter_ReorderHintOffset
      1068 -> GridViewItemPresenter_SelectedBackground
      1069 -> GridViewItemPresenter_SelectedBorderThickness
      1070 -> GridViewItemPresenter_SelectedForeground
      1071 -> GridViewItemPresenter_SelectedPointerOverBackground
      1072 -> GridViewItemPresenter_SelectedPointerOverBorderBrush
      1073 -> GridViewItemPresenter_SelectionCheckMarkVisualEnabled
      1074 -> GridViewItemPresenter_GridViewItemPresenterVerticalContentAlignment
      1076 -> ItemsStackPanel_CacheLength
      1077 -> ItemsStackPanel_GroupHeaderPlacement
      1078 -> ItemsStackPanel_GroupPadding
      1079 -> ItemsStackPanel_ItemsUpdatingScrollMode
      1080 -> ItemsStackPanel_Orientation
      1081 -> ItemsWrapGrid_CacheLength
      1082 -> ItemsWrapGrid_GroupHeaderPlacement
      1083 -> ItemsWrapGrid_GroupPadding
      1084 -> ItemsWrapGrid_ItemHeight
      1085 -> ItemsWrapGrid_ItemWidth
      1086 -> ItemsWrapGrid_MaximumRowsOrColumns
      1087 -> ItemsWrapGrid_Orientation
      1088 -> ListViewItemPresenter_CheckBrush
      1089 -> ListViewItemPresenter_CheckHintBrush
      1090 -> ListViewItemPresenter_CheckSelectingBrush
      1091 -> ListViewItemPresenter_ContentMargin
      1092 -> ListViewItemPresenter_DisabledOpacity
      1093 -> ListViewItemPresenter_DragBackground
      1094 -> ListViewItemPresenter_DragForeground
      1095 -> ListViewItemPresenter_DragOpacity
      1096 -> ListViewItemPresenter_FocusBorderBrush
      1097 -> ListViewItemPresenter_ListViewItemPresenterHorizontalContentAlignment
      1098 -> ListViewItemPresenter_ListViewItemPresenterPadding
      1099 -> ListViewItemPresenter_PlaceholderBackground
      1100 -> ListViewItemPresenter_PointerOverBackground
      1101 -> ListViewItemPresenter_PointerOverBackgroundMargin
      1102 -> ListViewItemPresenter_ReorderHintOffset
      1103 -> ListViewItemPresenter_SelectedBackground
      1104 -> ListViewItemPresenter_SelectedBorderThickness
      1105 -> ListViewItemPresenter_SelectedForeground
      1106 -> ListViewItemPresenter_SelectedPointerOverBackground
      1107 -> ListViewItemPresenter_SelectedPointerOverBorderBrush
      1108 -> ListViewItemPresenter_SelectionCheckMarkVisualEnabled
      1109 -> ListViewItemPresenter_ListViewItemPresenterVerticalContentAlignment
      1110 -> MenuFlyoutItem_Command
      1111 -> MenuFlyoutItem_CommandParameter
      1112 -> MenuFlyoutItem_Text
      1114 -> Page_BottomAppBar
      1115 -> Page_Frame
      1116 -> Page_NavigationCacheMode
      1117 -> Page_TopAppBar
      1118 -> ProgressBar_IsIndeterminate
      1119 -> ProgressBar_ShowError
      1120 -> ProgressBar_ShowPaused
      1121 -> ProgressBar_TemplateSettings
      1122 -> ScrollBar_IndicatorMode
      1123 -> ScrollBar_Orientation
      1124 -> ScrollBar_ViewportSize
      1126 -> Selector_IsSynchronizedWithCurrentItem
      1127 -> Selector_SelectedIndex
      1128 -> Selector_SelectedItem
      1129 -> Selector_SelectedValue
      1130 -> Selector_SelectedValuePath
      1131 -> SelectorItem_IsSelected
      1132 -> SettingsFlyout_HeaderBackground
      1133 -> SettingsFlyout_HeaderForeground
      1134 -> SettingsFlyout_IconSource
      1135 -> SettingsFlyout_TemplateSettings
      1136 -> SettingsFlyout_Title
      1137 -> Slider_Header
      1138 -> Slider_HeaderTemplate
      1139 -> Slider_IntermediateValue
      1140 -> Slider_IsDirectionReversed
      1141 -> Slider_IsThumbToolTipEnabled
      1142 -> Slider_Orientation
      1143 -> Slider_SnapsTo
      1144 -> Slider_StepFrequency
      1145 -> Slider_ThumbToolTipValueConverter
      1146 -> Slider_TickFrequency
      1147 -> Slider_TickPlacement
      1148 -> SwapChainPanel_CompositionScaleX
      1149 -> SwapChainPanel_CompositionScaleY
      1150 -> ToolTip_HorizontalOffset
      1151 -> ToolTip_IsOpen
      1152 -> ToolTip_Placement
      1153 -> ToolTip_PlacementTarget
      1154 -> ToolTip_TemplateSettings
      1155 -> ToolTip_VerticalOffset
      1156 -> Button_Flyout
      1157 -> ComboBox_Header
      1158 -> ComboBox_HeaderTemplate
      1159 -> ComboBox_IsDropDownOpen
      1160 -> ComboBox_IsEditable
      1161 -> ComboBox_IsSelectionBoxHighlighted
      1162 -> ComboBox_MaxDropDownHeight
      1163 -> ComboBox_PlaceholderText
      1164 -> ComboBox_SelectionBoxItem
      1165 -> ComboBox_SelectionBoxItemTemplate
      1166 -> ComboBox_TemplateSettings
      1167 -> CommandBar_PrimaryCommands
      1168 -> CommandBar_SecondaryCommands
      1169 -> FlipView_UseTouchAnimationsForAllNavigation
      1170 -> HyperlinkButton_NavigateUri
      1171 -> ListBox_SelectedItems
      1172 -> ListBox_SelectionMode
      1173 -> ListViewBase_CanDragItems
      1174 -> ListViewBase_CanReorderItems
      1175 -> ListViewBase_DataFetchSize
      1176 -> ListViewBase_Footer
      1177 -> ListViewBase_FooterTemplate
      1178 -> ListViewBase_FooterTransitions
      1179 -> ListViewBase_Header
      1180 -> ListViewBase_HeaderTemplate
      1181 -> ListViewBase_HeaderTransitions
      1182 -> ListViewBase_IncrementalLoadingThreshold
      1183 -> ListViewBase_IncrementalLoadingTrigger
      1184 -> ListViewBase_IsActiveView
      1185 -> ListViewBase_IsItemClickEnabled
      1186 -> ListViewBase_IsSwipeEnabled
      1187 -> ListViewBase_IsZoomedInView
      1188 -> ListViewBase_ReorderMode
      1189 -> ListViewBase_SelectedItems
      1190 -> ListViewBase_SelectionMode
      1191 -> ListViewBase_SemanticZoomOwner
      1192 -> ListViewBase_ShowsScrollingPlaceholders
      1193 -> RepeatButton_Delay
      1194 -> RepeatButton_Interval
      1195 -> ScrollViewer_BringIntoViewOnFocusChange
      1196 -> ScrollViewer_ComputedHorizontalScrollBarVisibility
      1197 -> ScrollViewer_ComputedVerticalScrollBarVisibility
      1198 -> ScrollViewer_ExtentHeight
      1199 -> ScrollViewer_ExtentWidth
      1200 -> ScrollViewer_HorizontalOffset
      1201 -> ScrollViewer_HorizontalScrollBarVisibility
      1202 -> ScrollViewer_HorizontalScrollMode
      1203 -> ScrollViewer_HorizontalSnapPointsAlignment
      1204 -> ScrollViewer_HorizontalSnapPointsType
      1205 -> ScrollViewer_IsDeferredScrollingEnabled
      1206 -> ScrollViewer_IsHorizontalRailEnabled
      1207 -> ScrollViewer_IsHorizontalScrollChainingEnabled
      1208 -> ScrollViewer_IsScrollInertiaEnabled
      1209 -> ScrollViewer_IsVerticalRailEnabled
      1210 -> ScrollViewer_IsVerticalScrollChainingEnabled
      1211 -> ScrollViewer_IsZoomChainingEnabled
      1212 -> ScrollViewer_IsZoomInertiaEnabled
      1213 -> ScrollViewer_LeftHeader
      1214 -> ScrollViewer_MaxZoomFactor
      1215 -> ScrollViewer_MinZoomFactor
      1216 -> ScrollViewer_ScrollableHeight
      1217 -> ScrollViewer_ScrollableWidth
      1218 -> ScrollViewer_TopHeader
      1219 -> ScrollViewer_TopLeftHeader
      1220 -> ScrollViewer_VerticalOffset
      1221 -> ScrollViewer_VerticalScrollBarVisibility
      1222 -> ScrollViewer_VerticalScrollMode
      1223 -> ScrollViewer_VerticalSnapPointsAlignment
      1224 -> ScrollViewer_VerticalSnapPointsType
      1225 -> ScrollViewer_ViewportHeight
      1226 -> ScrollViewer_ViewportWidth
      1227 -> ScrollViewer_ZoomFactor
      1228 -> ScrollViewer_ZoomMode
      1229 -> ScrollViewer_ZoomSnapPoints
      1230 -> ScrollViewer_ZoomSnapPointsType
      1231 -> ToggleButton_IsChecked
      1232 -> ToggleButton_IsThreeState
      1233 -> ToggleMenuFlyoutItem_IsChecked
      1234 -> VirtualizingStackPanel_AreScrollSnapPointsRegular
      1236 -> VirtualizingStackPanel_IsVirtualizing
      1237 -> VirtualizingStackPanel_Orientation
      1238 -> VirtualizingStackPanel_VirtualizationMode
      1239 -> WrapGrid_HorizontalChildrenAlignment
      1240 -> WrapGrid_ItemHeight
      1241 -> WrapGrid_ItemWidth
      1242 -> WrapGrid_MaximumRowsOrColumns
      1243 -> WrapGrid_Orientation
      1244 -> WrapGrid_VerticalChildrenAlignment
      1245 -> AppBarButton_Icon
      1246 -> AppBarButton_IsCompact
      1247 -> AppBarButton_Label
      1248 -> AppBarToggleButton_Icon
      1249 -> AppBarToggleButton_IsCompact
      1250 -> AppBarToggleButton_Label
      1251 -> GridViewItem_TemplateSettings
      1252 -> ListViewItem_TemplateSettings
      1253 -> RadioButton_GroupName
      1267 -> Glyphs_ColorFontPaletteIndex
      1268 -> Glyphs_IsColorFontEnabled
      1274 -> CalendarViewTemplateSettings_HasMoreContentAfter
      1275 -> CalendarViewTemplateSettings_HasMoreContentBefore
      1276 -> CalendarViewTemplateSettings_HasMoreViews
      1277 -> CalendarViewTemplateSettings_HeaderText
      1280 -> CalendarViewTemplateSettings_WeekDay1
      1281 -> CalendarViewTemplateSettings_WeekDay2
      1282 -> CalendarViewTemplateSettings_WeekDay3
      1283 -> CalendarViewTemplateSettings_WeekDay4
      1284 -> CalendarViewTemplateSettings_WeekDay5
      1285 -> CalendarViewTemplateSettings_WeekDay6
      1286 -> CalendarViewTemplateSettings_WeekDay7
      1291 -> CalendarView_CalendarIdentifier
      1299 -> CalendarView_DayOfWeekFormat
      1302 -> CalendarView_DisplayMode
      1303 -> CalendarView_FirstDayOfWeek
      1317 -> CalendarView_IsOutOfScopeEnabled
      1318 -> CalendarView_IsTodayHighlighted
      1320 -> CalendarView_MaxDate
      1321 -> CalendarView_MinDate
      1327 -> CalendarView_NumberOfWeeksInView
      1333 -> CalendarView_SelectedDates
      1335 -> CalendarView_SelectionMode
      1336 -> CalendarView_TemplateSettings
      1339 -> CalendarViewDayItem_Date
      1340 -> CalendarViewDayItem_IsBlackout
      1382 -> MediaTransportControls_IsFastForwardEnabled
      1383 -> MediaTransportControls_IsFastRewindEnabled
      1384 -> MediaTransportControls_IsFullWindowEnabled
      1385 -> MediaTransportControls_IsPlaybackRateEnabled
      1386 -> MediaTransportControls_IsSeekEnabled
      1387 -> MediaTransportControls_IsStopEnabled
      1388 -> MediaTransportControls_IsVolumeEnabled
      1389 -> MediaTransportControls_IsZoomEnabled
      1425 -> ContentPresenter_LineHeight
      1435 -> CalendarViewTemplateSettings_MinViewWidth
      1459 -> ListViewBase_SelectedRanges
      1462 -> SplitViewTemplateSettings_CompactPaneGridLength
      1463 -> SplitViewTemplateSettings_NegativeOpenPaneLength
      1464 -> SplitViewTemplateSettings_NegativeOpenPaneLengthMinusCompactLength
      1465 -> SplitViewTemplateSettings_OpenPaneGridLength
      1466 -> SplitViewTemplateSettings_OpenPaneLengthMinusCompactLength
      1467 -> SplitView_CompactPaneLength
      1468 -> SplitView_Content
      1469 -> SplitView_DisplayMode
      1470 -> SplitView_IsPaneOpen
      1471 -> SplitView_OpenPaneLength
      1472 -> SplitView_Pane
      1473 -> SplitView_PanePlacement
      1474 -> SplitView_TemplateSettings
      1475 -> UIElement_Transform3D
      1476 -> CompositeTransform3D_CenterX
      1478 -> CompositeTransform3D_CenterY
      1480 -> CompositeTransform3D_CenterZ
      1482 -> CompositeTransform3D_RotationX
      1484 -> CompositeTransform3D_RotationY
      1486 -> CompositeTransform3D_RotationZ
      1488 -> CompositeTransform3D_ScaleX
      1490 -> CompositeTransform3D_ScaleY
      1492 -> CompositeTransform3D_ScaleZ
      1494 -> CompositeTransform3D_TranslateX
      1496 -> CompositeTransform3D_TranslateY
      1498 -> CompositeTransform3D_TranslateZ
      1500 -> PerspectiveTransform3D_Depth
      1501 -> PerspectiveTransform3D_OffsetX
      1502 -> PerspectiveTransform3D_OffsetY
      1508 -> RelativePanel_Above
      1509 -> RelativePanel_AlignBottomWith
      1510 -> RelativePanel_AlignLeftWith
      1515 -> RelativePanel_AlignRightWith
      1516 -> RelativePanel_AlignTopWith
      1517 -> RelativePanel_Below
      1520 -> RelativePanel_LeftOf
      1521 -> RelativePanel_RightOf
      1524 -> SplitViewTemplateSettings_OpenPaneLength
      1527 -> PasswordBox_PasswordRevealMode
      1528 -> SplitView_PaneBackground
      1529 -> ItemsStackPanel_AreStickyGroupHeadersEnabled
      1530 -> ItemsWrapGrid_AreStickyGroupHeadersEnabled
      1531 -> MenuFlyoutSubItem_Items
      1532 -> MenuFlyoutSubItem_Text
      1534 -> UIElement_CanDrag
      1535 -> DataTemplate_ExtensionInstance
      1552 -> RelativePanel_AlignHorizontalCenterWith
      1553 -> RelativePanel_AlignVerticalCenterWith
      1555 -> TargetPropertyPath_Path
      1556 -> TargetPropertyPath_Target
      1558 -> VisualState_Setters
      1559 -> VisualState_StateTriggers
      1560 -> AdaptiveTrigger_MinWindowHeight
      1561 -> AdaptiveTrigger_MinWindowWidth
      1562 -> Setter_Target
      1565 -> CalendarView_BlackoutForeground
      1566 -> CalendarView_CalendarItemBackground
      1567 -> CalendarView_CalendarItemBorderBrush
      1568 -> CalendarView_CalendarItemBorderThickness
      1569 -> CalendarView_CalendarItemForeground
      1570 -> CalendarView_CalendarViewDayItemStyle
      1571 -> CalendarView_DayItemFontFamily
      1572 -> CalendarView_DayItemFontSize
      1573 -> CalendarView_DayItemFontStyle
      1574 -> CalendarView_DayItemFontWeight
      1575 -> CalendarView_FirstOfMonthLabelFontFamily
      1576 -> CalendarView_FirstOfMonthLabelFontSize
      1577 -> CalendarView_FirstOfMonthLabelFontStyle
      1578 -> CalendarView_FirstOfMonthLabelFontWeight
      1579 -> CalendarView_FirstOfYearDecadeLabelFontFamily
      1580 -> CalendarView_FirstOfYearDecadeLabelFontSize
      1581 -> CalendarView_FirstOfYearDecadeLabelFontStyle
      1582 -> CalendarView_FirstOfYearDecadeLabelFontWeight
      1583 -> CalendarView_FocusBorderBrush
      1584 -> CalendarView_HorizontalDayItemAlignment
      1585 -> CalendarView_HorizontalFirstOfMonthLabelAlignment
      1586 -> CalendarView_HoverBorderBrush
      1588 -> CalendarView_MonthYearItemFontFamily
      1589 -> CalendarView_MonthYearItemFontSize
      1590 -> CalendarView_MonthYearItemFontStyle
      1591 -> CalendarView_MonthYearItemFontWeight
      1592 -> CalendarView_OutOfScopeBackground
      1593 -> CalendarView_OutOfScopeForeground
      1594 -> CalendarView_PressedBorderBrush
      1595 -> CalendarView_PressedForeground
      1596 -> CalendarView_SelectedBorderBrush
      1597 -> CalendarView_SelectedForeground
      1598 -> CalendarView_SelectedHoverBorderBrush
      1599 -> CalendarView_SelectedPressedBorderBrush
      1600 -> CalendarView_TodayFontWeight
      1601 -> CalendarView_TodayForeground
      1602 -> CalendarView_VerticalDayItemAlignment
      1603 -> CalendarView_VerticalFirstOfMonthLabelAlignment
      1605 -> MediaTransportControls_IsCompact
      1606 -> RelativePanel_AlignBottomWithPanel
      1607 -> RelativePanel_AlignHorizontalCenterWithPanel
      1608 -> RelativePanel_AlignLeftWithPanel
      1609 -> RelativePanel_AlignRightWithPanel
      1610 -> RelativePanel_AlignTopWithPanel
      1611 -> RelativePanel_AlignVerticalCenterWithPanel
      1612 -> ListViewBase_IsMultiSelectCheckBoxEnabled
      1614 -> AutomationProperties_Level
      1615 -> AutomationProperties_PositionInSet
      1616 -> AutomationProperties_SizeOfSet
      1617 -> ListViewItemPresenter_CheckBoxBrush
      1618 -> ListViewItemPresenter_CheckMode
      1620 -> ListViewItemPresenter_PressedBackground
      1621 -> ListViewItemPresenter_SelectedPressedBackground
      1623 -> Control_IsTemplateFocusTarget
      1624 -> Control_UseSystemFocusVisuals
      1628 -> ListViewItemPresenter_FocusSecondaryBorderBrush
      1630 -> ListViewItemPresenter_PointerOverForeground
      1631 -> FontIcon_MirroredWhenRightToLeft
      1632 -> CalendarViewTemplateSettings_CenterX
      1633 -> CalendarViewTemplateSettings_CenterY
      1634 -> CalendarViewTemplateSettings_ClipRect
      1650 -> PasswordBox_TextReadingOrder
      1651 -> RichEditBox_TextReadingOrder
      1652 -> TextBox_TextReadingOrder
      1653 -> WebView_ExecutionMode
      1655 -> WebView_DeferredPermissionRequests
      1656 -> WebView_Settings
      1660 -> RichEditBox_DesiredCandidateWindowAlignment
      1662 -> TextBox_DesiredCandidateWindowAlignment
      1663 -> CalendarDatePicker_CalendarIdentifier
      1664 -> CalendarDatePicker_CalendarViewStyle
      1665 -> CalendarDatePicker_Date
      1666 -> CalendarDatePicker_DateFormat
      1667 -> CalendarDatePicker_DayOfWeekFormat
      1668 -> CalendarDatePicker_DisplayMode
      1669 -> CalendarDatePicker_FirstDayOfWeek
      1670 -> CalendarDatePicker_Header
      1671 -> CalendarDatePicker_HeaderTemplate
      1672 -> CalendarDatePicker_IsCalendarOpen
      1673 -> CalendarDatePicker_IsGroupLabelVisible
      1674 -> CalendarDatePicker_IsOutOfScopeEnabled
      1675 -> CalendarDatePicker_IsTodayHighlighted
      1676 -> CalendarDatePicker_MaxDate
      1677 -> CalendarDatePicker_MinDate
      1678 -> CalendarDatePicker_PlaceholderText
      1679 -> CalendarView_IsGroupLabelVisible
      1680 -> ContentPresenter_Background
      1681 -> ContentPresenter_BorderBrush
      1682 -> ContentPresenter_BorderThickness
      1683 -> ContentPresenter_CornerRadius
      1684 -> ContentPresenter_Padding
      1685 -> Grid_BorderBrush
      1686 -> Grid_BorderThickness
      1687 -> Grid_CornerRadius
      1688 -> Grid_Padding
      1689 -> RelativePanel_BorderBrush
      1690 -> RelativePanel_BorderThickness
      1691 -> RelativePanel_CornerRadius
      1692 -> RelativePanel_Padding
      1693 -> StackPanel_BorderBrush
      1694 -> StackPanel_BorderThickness
      1695 -> StackPanel_CornerRadius
      1696 -> StackPanel_Padding
      1697 -> PasswordBox_InputScope
      1698 -> MediaTransportControlsHelper_DropoutOrder
      1699 -> AutoSuggestBoxQuerySubmittedEventArgs_ChosenSuggestion
      1700 -> AutoSuggestBoxQuerySubmittedEventArgs_QueryText
      1701 -> AutoSuggestBox_QueryIcon
      1702 -> StateTrigger_IsActive
      1703 -> ContentPresenter_HorizontalContentAlignment
      1704 -> ContentPresenter_VerticalContentAlignment
      1705 -> AppBarTemplateSettings_ClipRect
      1706 -> AppBarTemplateSettings_CompactRootMargin
      1707 -> AppBarTemplateSettings_CompactVerticalDelta
      1708 -> AppBarTemplateSettings_HiddenRootMargin
      1709 -> AppBarTemplateSettings_HiddenVerticalDelta
      1710 -> AppBarTemplateSettings_MinimalRootMargin
      1711 -> AppBarTemplateSettings_MinimalVerticalDelta
      1712 -> CommandBarTemplateSettings_ContentHeight
      1713 -> CommandBarTemplateSettings_NegativeOverflowContentHeight
      1714 -> CommandBarTemplateSettings_OverflowContentClipRect
      1715 -> CommandBarTemplateSettings_OverflowContentHeight
      1716 -> CommandBarTemplateSettings_OverflowContentHorizontalOffset
      1717 -> CommandBarTemplateSettings_OverflowContentMaxHeight
      1718 -> CommandBarTemplateSettings_OverflowContentMinWidth
      1719 -> AppBar_TemplateSettings
      1720 -> CommandBar_CommandBarOverflowPresenterStyle
      1721 -> CommandBar_CommandBarTemplateSettings
      1722 -> DrillInThemeAnimation_EntranceTarget
      1723 -> DrillInThemeAnimation_EntranceTargetName
      1724 -> DrillInThemeAnimation_ExitTarget
      1725 -> DrillInThemeAnimation_ExitTargetName
      1726 -> DrillOutThemeAnimation_EntranceTarget
      1727 -> DrillOutThemeAnimation_EntranceTargetName
      1728 -> DrillOutThemeAnimation_ExitTarget
      1729 -> DrillOutThemeAnimation_ExitTargetName
      1730 -> XamlBindingHelper_DataTemplateComponent
      1732 -> AutomationProperties_Annotations
      1733 -> AutomationAnnotation_Element
      1734 -> AutomationAnnotation_Type
      1735 -> AutomationPeerAnnotation_Peer
      1736 -> AutomationPeerAnnotation_Type
      1741 -> Hyperlink_UnderlineStyle
      1742 -> CalendarView_DisabledForeground
      1743 -> CalendarView_TodayBackground
      1744 -> CalendarView_TodayBlackoutBackground
      1747 -> CalendarView_TodaySelectedInnerBorderBrush
      1749 -> Control_IsFocusEngaged
      1752 -> Control_IsFocusEngagementEnabled
      1754 -> RichEditBox_ClipboardCopyFormat
      1757 -> CommandBarTemplateSettings_OverflowContentMaxWidth
      1758 -> ComboBoxTemplateSettings_DropDownContentMinWidth
      1762 -> MenuFlyoutPresenterTemplateSettings_FlyoutContentMinWidth
      1763 -> MenuFlyoutPresenter_TemplateSettings
      1766 -> AutomationProperties_LandmarkType
      1767 -> AutomationProperties_LocalizedLandmarkType
      1769 -> RepositionThemeTransition_IsStaggeringEnabled
      1770 -> ListBox_SingleSelectionFollowsFocus
      1771 -> ListViewBase_SingleSelectionFollowsFocus
      1773 -> BitmapImage_AutoPlay
      1774 -> BitmapImage_IsAnimatedBitmap
      1775 -> BitmapImage_IsPlaying
      1776 -> AutomationProperties_FullDescription
      1777 -> AutomationProperties_IsDataValidForForm
      1778 -> AutomationProperties_IsPeripheral
      1779 -> AutomationProperties_LocalizedControlType
      1780 -> FlyoutBase_AllowFocusOnInteraction
      1781 -> TextElement_AllowFocusOnInteraction
      1782 -> FrameworkElement_AllowFocusOnInteraction
      1783 -> Control_RequiresPointer
      1785 -> UIElement_ContextFlyout
      1786 -> TextElement_AccessKey
      1787 -> UIElement_AccessKeyScopeOwner
      1788 -> UIElement_IsAccessKeyScope
      1790 -> AutomationProperties_DescribedBy
      1803 -> UIElement_AccessKey
      1804 -> Control_XYFocusDown
      1805 -> Control_XYFocusLeft
      1806 -> Control_XYFocusRight
      1807 -> Control_XYFocusUp
      1808 -> Hyperlink_XYFocusDown
      1809 -> Hyperlink_XYFocusLeft
      1810 -> Hyperlink_XYFocusRight
      1811 -> Hyperlink_XYFocusUp
      1812 -> WebView_XYFocusDown
      1813 -> WebView_XYFocusLeft
      1814 -> WebView_XYFocusRight
      1815 -> WebView_XYFocusUp
      1816 -> CommandBarTemplateSettings_EffectiveOverflowButtonVisibility
      1817 -> AppBarSeparator_IsInOverflow
      1818 -> CommandBar_DefaultLabelPosition
      1819 -> CommandBar_IsDynamicOverflowEnabled
      1820 -> CommandBar_OverflowButtonVisibility
      1821 -> AppBarButton_IsInOverflow
      1822 -> AppBarButton_LabelPosition
      1823 -> AppBarToggleButton_IsInOverflow
      1824 -> AppBarToggleButton_LabelPosition
      1825 -> FlyoutBase_LightDismissOverlayMode
      1827 -> Popup_LightDismissOverlayMode
      1829 -> CalendarDatePicker_LightDismissOverlayMode
      1830 -> DatePicker_LightDismissOverlayMode
      1831 -> SplitView_LightDismissOverlayMode
      1832 -> TimePicker_LightDismissOverlayMode
      1833 -> AppBar_LightDismissOverlayMode
      1834 -> AutoSuggestBox_LightDismissOverlayMode
      1835 -> ComboBox_LightDismissOverlayMode
      1836 -> AppBarSeparator_DynamicOverflowOrder
      1837 -> AppBarButton_DynamicOverflowOrder
      1838 -> AppBarToggleButton_DynamicOverflowOrder
      1839 -> FrameworkElement_FocusVisualMargin
      1840 -> FrameworkElement_FocusVisualPrimaryBrush
      1841 -> FrameworkElement_FocusVisualPrimaryThickness
      1842 -> FrameworkElement_FocusVisualSecondaryBrush
      1843 -> FrameworkElement_FocusVisualSecondaryThickness
      1846 -> FlyoutBase_AllowFocusWhenDisabled
      1847 -> FrameworkElement_AllowFocusWhenDisabled
      1848 -> ComboBox_IsTextSearchEnabled
      1849 -> TextElement_ExitDisplayModeOnAccessKeyInvoked
      1850 -> UIElement_ExitDisplayModeOnAccessKeyInvoked
      1851 -> MediaPlayerPresenter_IsFullWindow
      1852 -> MediaPlayerPresenter_MediaPlayer
      1853 -> MediaPlayerPresenter_Stretch
      1854 -> MediaPlayerElement_AreTransportControlsEnabled
      1855 -> MediaPlayerElement_AutoPlay
      1856 -> MediaPlayerElement_IsFullWindow
      1857 -> MediaPlayerElement_MediaPlayer
      1858 -> MediaPlayerElement_PosterSource
      1859 -> MediaPlayerElement_Source
      1860 -> MediaPlayerElement_Stretch
      1861 -> MediaPlayerElement_TransportControls
      1862 -> MediaTransportControls_FastPlayFallbackBehaviour
      1863 -> MediaTransportControls_IsNextTrackButtonVisible
      1864 -> MediaTransportControls_IsPreviousTrackButtonVisible
      1865 -> MediaTransportControls_IsSkipBackwardButtonVisible
      1866 -> MediaTransportControls_IsSkipBackwardEnabled
      1867 -> MediaTransportControls_IsSkipForwardButtonVisible
      1868 -> MediaTransportControls_IsSkipForwardEnabled
      1869 -> FlyoutBase_ElementSoundMode
      1870 -> Control_ElementSoundMode
      1871 -> Hyperlink_ElementSoundMode
      1876 -> AutomationProperties_FlowsFrom
      1877 -> AutomationProperties_FlowsTo
      1879 -> TextElement_TextDecorations
      1881 -> RichTextBlock_TextDecorations
      1882 -> Control_DefaultStyleResourceUri
      1884 -> ContentDialog_PrimaryButtonStyle
      1885 -> ContentDialog_SecondaryButtonStyle
      1890 -> TextElement_KeyTipHorizontalOffset
      1891 -> TextElement_KeyTipPlacementMode
      1892 -> TextElement_KeyTipVerticalOffset
      1893 -> UIElement_KeyTipHorizontalOffset
      1894 -> UIElement_KeyTipPlacementMode
      1895 -> UIElement_KeyTipVerticalOffset
      1896 -> FlyoutBase_OverlayInputPassThroughElement
      1897 -> UIElement_XYFocusKeyboardNavigation
      1898 -> AutomationProperties_Culture
      1918 -> UIElement_XYFocusDownNavigationStrategy
      1919 -> UIElement_XYFocusLeftNavigationStrategy
      1920 -> UIElement_XYFocusRightNavigationStrategy
      1921 -> UIElement_XYFocusUpNavigationStrategy
      1922 -> Hyperlink_XYFocusDownNavigationStrategy
      1923 -> Hyperlink_XYFocusLeftNavigationStrategy
      1924 -> Hyperlink_XYFocusRightNavigationStrategy
      1925 -> Hyperlink_XYFocusUpNavigationStrategy
      1926 -> TextElement_AccessKeyScopeOwner
      1927 -> TextElement_IsAccessKeyScope
      1934 -> Hyperlink_FocusState
      1936 -> ContentDialog_CloseButtonCommand
      1937 -> ContentDialog_CloseButtonCommandParameter
      1938 -> ContentDialog_CloseButtonStyle
      1939 -> ContentDialog_CloseButtonText
      1940 -> ContentDialog_DefaultButton
      1941 -> RichEditBox_SelectionHighlightColorWhenNotFocused
      1942 -> TextBox_SelectionHighlightColorWhenNotFocused
      1948 -> SvgImageSource_RasterizePixelHeight
      1949 -> SvgImageSource_RasterizePixelWidth
      1950 -> SvgImageSource_UriSource
      1955 -> LoadedImageSurface_DecodedPhysicalSize
      1956 -> LoadedImageSurface_DecodedSize
      1957 -> LoadedImageSurface_NaturalSize
      1958 -> ComboBox_SelectionChangedTrigger
      1960 -> XamlCompositionBrushBase_FallbackColor
      1962 -> UIElement_Lights
      1963 -> MenuFlyoutItem_Icon
      1964 -> MenuFlyoutSubItem_Icon
      1965 -> BitmapIcon_ShowAsMonochrome
      1967 -> UIElement_HighContrastAdjustment
      1968 -> RichEditBox_MaxLength
      1969 -> UIElement_TabFocusNavigation
      1970 -> Control_IsTemplateKeyTipTarget
      1972 -> Hyperlink_IsTabStop
      1973 -> Hyperlink_TabIndex
      1974 -> MediaTransportControls_IsRepeatButtonVisible
      1975 -> MediaTransportControls_IsRepeatEnabled
      1976 -> MediaTransportControls_ShowAndHideAutomatically
      1977 -> RichEditBox_DisabledFormattingAccelerators
      1978 -> RichEditBox_CharacterCasing
      1979 -> TextBox_CharacterCasing
      1980 -> RichTextBlock_IsTextTrimmed
      1981 -> RichTextBlockOverflow_IsTextTrimmed
      1982 -> TextBlock_IsTextTrimmed
      1985 -> TextHighlighter_Background
      1986 -> TextHighlighter_Foreground
      1987 -> TextHighlighter_Ranges
      1988 -> RichTextBlock_TextHighlighters
      1989 -> TextBlock_TextHighlighters
      1992 -> FrameworkElement_ActualTheme
      1993 -> Grid_ColumnSpacing
      1994 -> Grid_RowSpacing
      1995 -> StackPanel_Spacing
      1996 -> Block_HorizontalTextAlignment
      1997 -> RichTextBlock_HorizontalTextAlignment
      1998 -> TextBlock_HorizontalTextAlignment
      1999 -> RichEditBox_HorizontalTextAlignment
      2000 -> TextBox_HorizontalTextAlignment
      2001 -> TextBox_PlaceholderForeground
      2002 -> ComboBox_PlaceholderForeground
      2003 -> KeyboardAccelerator_IsEnabled
      2004 -> KeyboardAccelerator_Key
      2005 -> KeyboardAccelerator_Modifiers
      2006 -> KeyboardAccelerator_ScopeOwner
      2007 -> UIElement_KeyboardAccelerators
      2009 -> ListViewItemPresenter_RevealBackground
      2010 -> ListViewItemPresenter_RevealBackgroundShowsAboveContent
      2011 -> ListViewItemPresenter_RevealBorderBrush
      2012 -> ListViewItemPresenter_RevealBorderThickness
      2014 -> UIElement_KeyTipTarget
      2015 -> AppBarButtonTemplateSettings_KeyboardAcceleratorTextMinWidth
      2016 -> AppBarToggleButtonTemplateSettings_KeyboardAcceleratorTextMinWidth
      2017 -> MenuFlyoutItemTemplateSettings_KeyboardAcceleratorTextMinWidth
      2019 -> MenuFlyoutItem_TemplateSettings
      2021 -> AppBarButton_TemplateSettings
      2023 -> AppBarToggleButton_TemplateSettings
      2028 -> UIElement_KeyboardAcceleratorPlacementMode
      2032 -> MediaTransportControls_IsCompactOverlayButtonVisible
      2033 -> MediaTransportControls_IsCompactOverlayEnabled
      2061 -> UIElement_KeyboardAcceleratorPlacementTarget
      2062 -> UIElement_CenterPoint
      2063 -> UIElement_Rotation
      2064 -> UIElement_RotationAxis
      2065 -> UIElement_Scale
      2066 -> UIElement_TransformMatrix
      2067 -> UIElement_Translation
      2068 -> TextBox_HandwritingView
      2069 -> AutomationProperties_HeadingLevel
      2076 -> TextBox_IsHandwritingViewEnabled
      2078 -> RichEditBox_ContentLinkProviders
      2079 -> RichEditBox_ContentLinkBackgroundColor
      2080 -> RichEditBox_ContentLinkForegroundColor
      2081 -> HandwritingView_AreCandidatesEnabled
      2082 -> HandwritingView_IsOpen
      2084 -> HandwritingView_PlacementTarget
      2085 -> HandwritingView_PlacementAlignment
      2086 -> RichEditBox_HandwritingView
      2087 -> RichEditBox_IsHandwritingViewEnabled
      2090 -> MenuFlyoutItem_KeyboardAcceleratorTextOverride
      2091 -> AppBarButton_KeyboardAcceleratorTextOverride
      2092 -> AppBarToggleButton_KeyboardAcceleratorTextOverride
      2093 -> ContentLink_Background
      2094 -> ContentLink_Cursor
      2095 -> ContentLink_ElementSoundMode
      2096 -> ContentLink_FocusState
      2097 -> ContentLink_IsTabStop
      2098 -> ContentLink_TabIndex
      2099 -> ContentLink_XYFocusDown
      2100 -> ContentLink_XYFocusDownNavigationStrategy
      2101 -> ContentLink_XYFocusLeft
      2102 -> ContentLink_XYFocusLeftNavigationStrategy
      2103 -> ContentLink_XYFocusRight
      2104 -> ContentLink_XYFocusRightNavigationStrategy
      2105 -> ContentLink_XYFocusUp
      2106 -> ContentLink_XYFocusUpNavigationStrategy
      2112 -> IconSource_Foreground
      2113 -> BitmapIconSource_ShowAsMonochrome
      2114 -> BitmapIconSource_UriSource
      2115 -> FontIconSource_FontFamily
      2116 -> FontIconSource_FontSize
      2117 -> FontIconSource_FontStyle
      2118 -> FontIconSource_FontWeight
      2119 -> FontIconSource_Glyph
      2120 -> FontIconSource_IsTextScaleFactorEnabled
      2121 -> FontIconSource_MirroredWhenRightToLeft
      2122 -> PathIconSource_Data
      2123 -> SymbolIconSource_Symbol
      2130 -> UIElement_Shadow
      2131 -> IconSourceElement_IconSource
      2137 -> PasswordBox_CanPasteClipboardContent
      2138 -> TextBox_CanPasteClipboardContent
      2139 -> TextBox_CanRedo
      2140 -> TextBox_CanUndo
      2141 -> FlyoutBase_ShowMode
      2142 -> FlyoutBase_Target
      2143 -> Control_CornerRadius
      2149 -> AutomationProperties_IsDialog
      2150 -> AppBarElementContainer_DynamicOverflowOrder
      2151 -> AppBarElementContainer_IsCompact
      2152 -> AppBarElementContainer_IsInOverflow
      2157 -> ScrollContentPresenter_CanContentRenderOutsideBounds
      2158 -> ScrollViewer_CanContentRenderOutsideBounds
      2159 -> RichEditBox_SelectionFlyout
      2160 -> TextBox_SelectionFlyout
      2161 -> Border_BackgroundSizing
      2162 -> ContentPresenter_BackgroundSizing
      2163 -> Control_BackgroundSizing
      2164 -> Grid_BackgroundSizing
      2165 -> RelativePanel_BackgroundSizing
      2166 -> StackPanel_BackgroundSizing
      2170 -> ScrollViewer_HorizontalAnchorRatio
      2171 -> ScrollViewer_VerticalAnchorRatio
      2208 -> ComboBox_Text
      2217 -> TextBox_Description
      2218 -> ToolTip_PlacementRect
      2219 -> RichTextBlock_SelectionFlyout
      2220 -> TextBlock_SelectionFlyout
      2221 -> PasswordBox_SelectionFlyout
      2222 -> Border_BackgroundTransition
      2223 -> ContentPresenter_BackgroundTransition
      2224 -> Panel_BackgroundTransition
      2227 -> ColorPaletteResources_Accent
      2228 -> ColorPaletteResources_AltHigh
      2229 -> ColorPaletteResources_AltLow
      2230 -> ColorPaletteResources_AltMedium
      2231 -> ColorPaletteResources_AltMediumHigh
      2232 -> ColorPaletteResources_AltMediumLow
      2233 -> ColorPaletteResources_BaseHigh
      2234 -> ColorPaletteResources_BaseLow
      2235 -> ColorPaletteResources_BaseMedium
      2236 -> ColorPaletteResources_BaseMediumHigh
      2237 -> ColorPaletteResources_BaseMediumLow
      2238 -> ColorPaletteResources_ChromeAltLow
      2239 -> ColorPaletteResources_ChromeBlackHigh
      2240 -> ColorPaletteResources_ChromeBlackLow
      2241 -> ColorPaletteResources_ChromeBlackMedium
      2242 -> ColorPaletteResources_ChromeBlackMediumLow
      2243 -> ColorPaletteResources_ChromeDisabledHigh
      2244 -> ColorPaletteResources_ChromeDisabledLow
      2245 -> ColorPaletteResources_ChromeGray
      2246 -> ColorPaletteResources_ChromeHigh
      2247 -> ColorPaletteResources_ChromeLow
      2248 -> ColorPaletteResources_ChromeMedium
      2249 -> ColorPaletteResources_ChromeMediumLow
      2250 -> ColorPaletteResources_ChromeWhite
      2252 -> ColorPaletteResources_ErrorText
      2253 -> ColorPaletteResources_ListLow
      2254 -> ColorPaletteResources_ListMedium
      2255 -> UIElement_TranslationTransition
      2256 -> UIElement_OpacityTransition
      2257 -> UIElement_RotationTransition
      2258 -> UIElement_ScaleTransition
      2261 -> BrushTransition_Duration
      2262 -> ScalarTransition_Duration
      2263 -> Vector3Transition_Duration
      2266 -> Vector3Transition_Components
      2267 -> FlyoutBase_IsOpen
      2275 -> StandardUICommand_Kind
      2276 -> UIElement_CanBeScrollAnchor
      2279 -> ThemeShadow_Receivers
      2280 -> ScrollContentPresenter_SizesContentToTemplatedParent
      2281 -> ComboBox_TextBoxStyle
      2282 -> Frame_IsNavigationStackEnabled
      2283 -> RichEditBox_ProofingMenuFlyout
      2284 -> TextBox_ProofingMenuFlyout
      2295 -> ScrollViewer_ReduceViewportForCoreInputViewOcclusions
      2296 -> FlyoutBase_AreOpenCloseAnimationsEnabled
      2297 -> FlyoutBase_InputDevicePrefersPrimaryCommands
      2300 -> CalendarDatePicker_Description
      2308 -> PasswordBox_Description
      2316 -> RichEditBox_Description
      2331 -> AutoSuggestBox_Description
      2339 -> ComboBox_Description
      2347 -> XamlUICommand_AccessKey
      2348 -> XamlUICommand_Command
      2349 -> XamlUICommand_Description
      2350 -> XamlUICommand_IconSource
      2351 -> XamlUICommand_KeyboardAccelerators
      2352 -> XamlUICommand_Label
      2355 -> DatePicker_SelectedDate
      2356 -> TimePicker_SelectedTime
      2367 -> AppBarTemplateSettings_NegativeCompactVerticalDelta
      2368 -> AppBarTemplateSettings_NegativeHiddenVerticalDelta
      2369 -> AppBarTemplateSettings_NegativeMinimalVerticalDelta
      2378 -> FlyoutBase_ShouldConstrainToRootBounds
      2379 -> Popup_ShouldConstrainToRootBounds
      2380 -> FlyoutPresenter_IsDefaultShadowEnabled
      2381 -> MenuFlyoutPresenter_IsDefaultShadowEnabled
      2382 -> UIElement_ActualOffset
      2383 -> UIElement_ActualSize
      2384 -> CommandBarTemplateSettings_OverflowContentCompactYTranslation
      2385 -> CommandBarTemplateSettings_OverflowContentHiddenYTranslation
      2386 -> CommandBarTemplateSettings_OverflowContentMinimalYTranslation
      2395 -> HandwritingView_IsCommandBarOpen
      2396 -> HandwritingView_IsSwitchToKeyboardEnabled
      2399 -> ListViewItemPresenter_SelectionIndicatorVisualEnabled
      2400 -> ListViewItemPresenter_SelectionIndicatorBrush
      2401 -> ListViewItemPresenter_SelectionIndicatorMode
      2402 -> ListViewItemPresenter_SelectionIndicatorPointerOverBrush
      2403 -> ListViewItemPresenter_SelectionIndicatorPressedBrush
      2410 -> ListViewItemPresenter_SelectedBorderBrush
      2411 -> ListViewItemPresenter_SelectedInnerBorderBrush
      2412 -> ListViewItemPresenter_CheckBoxCornerRadius
      2413 -> ListViewItemPresenter_SelectionIndicatorCornerRadius
      2414 -> ListViewItemPresenter_SelectedDisabledBorderBrush
      2415 -> ListViewItemPresenter_SelectedPressedBorderBrush
      2416 -> ListViewItemPresenter_SelectedDisabledBackground
      2417 -> ListViewItemPresenter_PointerOverBorderBrush
      2418 -> ListViewItemPresenter_CheckBoxPointerOverBrush
      2419 -> ListViewItemPresenter_CheckBoxPressedBrush
      2420 -> ListViewItemPresenter_CheckDisabledBrush
      2421 -> ListViewItemPresenter_CheckPressedBrush
      2422 -> ListViewItemPresenter_CheckBoxBorderBrush
      2423 -> ListViewItemPresenter_CheckBoxDisabledBorderBrush
      2424 -> ListViewItemPresenter_CheckBoxPressedBorderBrush
      2425 -> ListViewItemPresenter_CheckBoxDisabledBrush
      2426 -> ListViewItemPresenter_CheckBoxSelectedBrush
      2427 -> ListViewItemPresenter_CheckBoxSelectedDisabledBrush
      2428 -> ListViewItemPresenter_CheckBoxSelectedPointerOverBrush
      2429 -> ListViewItemPresenter_CheckBoxSelectedPressedBrush
      2430 -> ListViewItemPresenter_CheckBoxPointerOverBorderBrush
      2431 -> ListViewItemPresenter_SelectionIndicatorDisabledBrush
      2432 -> CalendarView_BlackoutBackground
      2433 -> CalendarView_BlackoutStrikethroughBrush
      2434 -> CalendarView_CalendarItemCornerRadius
      2435 -> CalendarView_CalendarItemDisabledBackground
      2436 -> CalendarView_CalendarItemHoverBackground
      2437 -> CalendarView_CalendarItemPressedBackground
      2438 -> CalendarView_DayItemMargin
      2439 -> CalendarView_FirstOfMonthLabelMargin
      2440 -> CalendarView_FirstOfYearDecadeLabelMargin
      2441 -> CalendarView_MonthYearItemMargin
      2442 -> CalendarView_OutOfScopeHoverForeground
      2443 -> CalendarView_OutOfScopePressedForeground
      2444 -> CalendarView_SelectedDisabledBorderBrush
      2445 -> CalendarView_SelectedDisabledForeground
      2446 -> CalendarView_SelectedHoverForeground
      2447 -> CalendarView_SelectedPressedForeground
      2448 -> CalendarView_TodayBlackoutForeground
      2449 -> CalendarView_TodayDisabledBackground
      2450 -> CalendarView_TodayHoverBackground
      2451 -> CalendarView_TodayPressedBackground
      2452 -> Popup_ActualPlacement
      2453 -> Popup_DesiredPlacement
      2454 -> Popup_PlacementTarget
      2455 -> AutomationProperties_AutomationControlType
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<XamlPropertyIndex> {
    public fun setValue(newValue: XamlPropertyIndex): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): XamlPropertyIndex =
        XamlPropertyIndex.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<XamlPropertyIndex, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): XamlPropertyIndex =
        XamlPropertyIndex.values()[0].fromNative(value, null)

    public override fun toNative(obj: XamlPropertyIndex): Int = obj.value
  }
}
