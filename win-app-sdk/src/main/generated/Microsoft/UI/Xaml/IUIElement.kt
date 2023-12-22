package Microsoft.UI.Xaml

import Microsoft.UI.Composition.ICompositionAnimationBase
import Microsoft.UI.Input.PointerPoint
import Microsoft.UI.Xaml.Controls.Primitives.FlyoutBase
import Microsoft.UI.Xaml.Input.AccessKeyDisplayDismissedEventArgs
import Microsoft.UI.Xaml.Input.AccessKeyDisplayRequestedEventArgs
import Microsoft.UI.Xaml.Input.AccessKeyInvokedEventArgs
import Microsoft.UI.Xaml.Input.CharacterReceivedRoutedEventArgs
import Microsoft.UI.Xaml.Input.ContextRequestedEventArgs
import Microsoft.UI.Xaml.Input.DoubleTappedEventHandler
import Microsoft.UI.Xaml.Input.GettingFocusEventArgs
import Microsoft.UI.Xaml.Input.HoldingEventHandler
import Microsoft.UI.Xaml.Input.KeyEventHandler
import Microsoft.UI.Xaml.Input.KeyTipPlacementMode
import Microsoft.UI.Xaml.Input.KeyboardAccelerator
import Microsoft.UI.Xaml.Input.KeyboardAcceleratorPlacementMode
import Microsoft.UI.Xaml.Input.KeyboardNavigationMode
import Microsoft.UI.Xaml.Input.LosingFocusEventArgs
import Microsoft.UI.Xaml.Input.ManipulationCompletedEventHandler
import Microsoft.UI.Xaml.Input.ManipulationDeltaEventHandler
import Microsoft.UI.Xaml.Input.ManipulationInertiaStartingEventHandler
import Microsoft.UI.Xaml.Input.ManipulationModes
import Microsoft.UI.Xaml.Input.ManipulationStartedEventHandler
import Microsoft.UI.Xaml.Input.ManipulationStartingEventHandler
import Microsoft.UI.Xaml.Input.NoFocusCandidateFoundEventArgs
import Microsoft.UI.Xaml.Input.Pointer
import Microsoft.UI.Xaml.Input.PointerEventHandler
import Microsoft.UI.Xaml.Input.ProcessKeyboardAcceleratorEventArgs
import Microsoft.UI.Xaml.Input.RightTappedEventHandler
import Microsoft.UI.Xaml.Input.TappedEventHandler
import Microsoft.UI.Xaml.Input.XYFocusKeyboardNavigationMode
import Microsoft.UI.Xaml.Input.XYFocusNavigationStrategy
import Microsoft.UI.Xaml.Media.Animation.TransitionCollection
import Microsoft.UI.Xaml.Media.CacheMode
import Microsoft.UI.Xaml.Media.ElementCompositeMode
import Microsoft.UI.Xaml.Media.GeneralTransform
import Microsoft.UI.Xaml.Media.Media3D.Transform3D
import Microsoft.UI.Xaml.Media.Projection
import Microsoft.UI.Xaml.Media.RectangleGeometry
import Microsoft.UI.Xaml.Media.Shadow
import Microsoft.UI.Xaml.Media.Transform
import Microsoft.UI.Xaml.Media.XamlLight
import Windows.ApplicationModel.DataTransfer.DataPackageOperation
import Windows.Foundation.Collections.IVector
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Numerics.Matrix4x4
import Windows.Foundation.Numerics.Vector2
import Windows.Foundation.Numerics.Vector3
import Windows.Foundation.Point
import Windows.Foundation.Rect
import Windows.Foundation.Size
import Windows.Foundation.TypedEventHandler
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
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUIElement.ABI::class)
@Signature("{c3c01020-320c-5cf6-9d24-d396bbfa4d8b}")
@Guid("c3c01020320c5cf69d24d396bbfa4d8b")
@WinRTInterface("c3c01020320c5cf69d24d396bbfa4d8b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUIElement.ByReference::class)
public interface IUIElement : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DesiredSize(): Size?

  @InterfaceMethod(1)
  public fun get_AllowDrop(): Boolean

  @InterfaceMethod(2)
  public fun put_AllowDrop(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_Opacity(): Double

  @InterfaceMethod(4)
  public fun put_Opacity(value: Double): Unit

  @InterfaceMethod(5)
  public fun get_Clip(): RectangleGeometry?

  @InterfaceMethod(6)
  public fun put_Clip(value: RectangleGeometry?): Unit

  @InterfaceMethod(7)
  public fun get_RenderTransform(): Transform?

  @InterfaceMethod(8)
  public fun put_RenderTransform(value: Transform?): Unit

  @InterfaceMethod(9)
  public fun get_Projection(): Projection?

  @InterfaceMethod(10)
  public fun put_Projection(value: Projection?): Unit

  @InterfaceMethod(11)
  public fun get_Transform3D(): Transform3D?

  @InterfaceMethod(12)
  public fun put_Transform3D(value: Transform3D?): Unit

  @InterfaceMethod(13)
  public fun get_RenderTransformOrigin(): Point?

  @InterfaceMethod(14)
  public fun put_RenderTransformOrigin(value: Point?): Unit

  @InterfaceMethod(15)
  public fun get_IsHitTestVisible(): Boolean

  @InterfaceMethod(16)
  public fun put_IsHitTestVisible(value: Boolean): Unit

  @InterfaceMethod(17)
  public fun get_Visibility(): Visibility?

  @InterfaceMethod(18)
  public fun put_Visibility(value: Visibility?): Unit

  @InterfaceMethod(19)
  public fun get_RenderSize(): Size?

  @InterfaceMethod(20)
  public fun get_UseLayoutRounding(): Boolean

  @InterfaceMethod(21)
  public fun put_UseLayoutRounding(value: Boolean): Unit

  @InterfaceMethod(22)
  public fun get_Transitions(): TransitionCollection?

  @InterfaceMethod(23)
  public fun put_Transitions(value: TransitionCollection?): Unit

  @InterfaceMethod(24)
  public fun get_CacheMode(): CacheMode?

  @InterfaceMethod(25)
  public fun put_CacheMode(value: CacheMode?): Unit

  @InterfaceMethod(26)
  public fun get_IsTapEnabled(): Boolean

  @InterfaceMethod(27)
  public fun put_IsTapEnabled(value: Boolean): Unit

  @InterfaceMethod(28)
  public fun get_IsDoubleTapEnabled(): Boolean

  @InterfaceMethod(29)
  public fun put_IsDoubleTapEnabled(value: Boolean): Unit

  @InterfaceMethod(30)
  public fun get_CanDrag(): Boolean

  @InterfaceMethod(31)
  public fun put_CanDrag(value: Boolean): Unit

  @InterfaceMethod(32)
  public fun get_IsRightTapEnabled(): Boolean

  @InterfaceMethod(33)
  public fun put_IsRightTapEnabled(value: Boolean): Unit

  @InterfaceMethod(34)
  public fun get_IsHoldingEnabled(): Boolean

  @InterfaceMethod(35)
  public fun put_IsHoldingEnabled(value: Boolean): Unit

  @InterfaceMethod(36)
  public fun get_ManipulationMode(): ManipulationModes?

  @InterfaceMethod(37)
  public fun put_ManipulationMode(value: ManipulationModes?): Unit

  @InterfaceMethod(38)
  public fun get_PointerCaptures(): IVectorView<Pointer?>?

  @InterfaceMethod(39)
  public fun get_ContextFlyout(): FlyoutBase?

  @InterfaceMethod(40)
  public fun put_ContextFlyout(value: FlyoutBase?): Unit

  @InterfaceMethod(41)
  public fun get_CompositeMode(): ElementCompositeMode?

  @InterfaceMethod(42)
  public fun put_CompositeMode(value: ElementCompositeMode?): Unit

  @InterfaceMethod(43)
  public fun get_Lights(): IVector<XamlLight?>?

  @InterfaceMethod(44)
  public fun get_CanBeScrollAnchor(): Boolean

  @InterfaceMethod(45)
  public fun put_CanBeScrollAnchor(value: Boolean): Unit

  @InterfaceMethod(46)
  public fun get_ExitDisplayModeOnAccessKeyInvoked(): Boolean

  @InterfaceMethod(47)
  public fun put_ExitDisplayModeOnAccessKeyInvoked(value: Boolean): Unit

  @InterfaceMethod(48)
  public fun get_IsAccessKeyScope(): Boolean

  @InterfaceMethod(49)
  public fun put_IsAccessKeyScope(value: Boolean): Unit

  @InterfaceMethod(50)
  public fun get_AccessKeyScopeOwner(): DependencyObject?

  @InterfaceMethod(51)
  public fun put_AccessKeyScopeOwner(value: DependencyObject?): Unit

  @InterfaceMethod(52)
  public fun get_AccessKey(): String?

  @InterfaceMethod(53)
  public fun put_AccessKey(value: String?): Unit

  @InterfaceMethod(54)
  public fun get_KeyTipPlacementMode(): KeyTipPlacementMode?

  @InterfaceMethod(55)
  public fun put_KeyTipPlacementMode(value: KeyTipPlacementMode?): Unit

  @InterfaceMethod(56)
  public fun get_KeyTipHorizontalOffset(): Double

  @InterfaceMethod(57)
  public fun put_KeyTipHorizontalOffset(value: Double): Unit

  @InterfaceMethod(58)
  public fun get_KeyTipVerticalOffset(): Double

  @InterfaceMethod(59)
  public fun put_KeyTipVerticalOffset(value: Double): Unit

  @InterfaceMethod(60)
  public fun get_KeyTipTarget(): DependencyObject?

  @InterfaceMethod(61)
  public fun put_KeyTipTarget(value: DependencyObject?): Unit

  @InterfaceMethod(62)
  public fun get_XYFocusKeyboardNavigation(): XYFocusKeyboardNavigationMode?

  @InterfaceMethod(63)
  public fun put_XYFocusKeyboardNavigation(value: XYFocusKeyboardNavigationMode?): Unit

  @InterfaceMethod(64)
  public fun get_XYFocusUpNavigationStrategy(): XYFocusNavigationStrategy?

  @InterfaceMethod(65)
  public fun put_XYFocusUpNavigationStrategy(value: XYFocusNavigationStrategy?): Unit

  @InterfaceMethod(66)
  public fun get_XYFocusDownNavigationStrategy(): XYFocusNavigationStrategy?

  @InterfaceMethod(67)
  public fun put_XYFocusDownNavigationStrategy(value: XYFocusNavigationStrategy?): Unit

  @InterfaceMethod(68)
  public fun get_XYFocusLeftNavigationStrategy(): XYFocusNavigationStrategy?

  @InterfaceMethod(69)
  public fun put_XYFocusLeftNavigationStrategy(value: XYFocusNavigationStrategy?): Unit

  @InterfaceMethod(70)
  public fun get_XYFocusRightNavigationStrategy(): XYFocusNavigationStrategy?

  @InterfaceMethod(71)
  public fun put_XYFocusRightNavigationStrategy(value: XYFocusNavigationStrategy?): Unit

  @InterfaceMethod(72)
  public fun get_KeyboardAccelerators(): IVector<KeyboardAccelerator?>?

  @InterfaceMethod(73)
  public fun get_KeyboardAcceleratorPlacementTarget(): DependencyObject?

  @InterfaceMethod(74)
  public fun put_KeyboardAcceleratorPlacementTarget(value: DependencyObject?): Unit

  @InterfaceMethod(75)
  public fun get_KeyboardAcceleratorPlacementMode(): KeyboardAcceleratorPlacementMode?

  @InterfaceMethod(76)
  public fun put_KeyboardAcceleratorPlacementMode(value: KeyboardAcceleratorPlacementMode?): Unit

  @InterfaceMethod(77)
  public fun get_HighContrastAdjustment(): ElementHighContrastAdjustment?

  @InterfaceMethod(78)
  public fun put_HighContrastAdjustment(value: ElementHighContrastAdjustment?): Unit

  @InterfaceMethod(79)
  public fun get_TabFocusNavigation(): KeyboardNavigationMode?

  @InterfaceMethod(80)
  public fun put_TabFocusNavigation(value: KeyboardNavigationMode?): Unit

  @InterfaceMethod(81)
  public fun get_OpacityTransition(): ScalarTransition?

  @InterfaceMethod(82)
  public fun put_OpacityTransition(value: ScalarTransition?): Unit

  @InterfaceMethod(83)
  public fun get_Translation(): Vector3?

  @InterfaceMethod(84)
  public fun put_Translation(value: Vector3?): Unit

  @InterfaceMethod(85)
  public fun get_TranslationTransition(): Vector3Transition?

  @InterfaceMethod(86)
  public fun put_TranslationTransition(value: Vector3Transition?): Unit

  @InterfaceMethod(87)
  public fun get_Rotation(): Float

  @InterfaceMethod(88)
  public fun put_Rotation(value: Float): Unit

  @InterfaceMethod(89)
  public fun get_RotationTransition(): ScalarTransition?

  @InterfaceMethod(90)
  public fun put_RotationTransition(value: ScalarTransition?): Unit

  @InterfaceMethod(91)
  public fun get_Scale(): Vector3?

  @InterfaceMethod(92)
  public fun put_Scale(value: Vector3?): Unit

  @InterfaceMethod(93)
  public fun get_ScaleTransition(): Vector3Transition?

  @InterfaceMethod(94)
  public fun put_ScaleTransition(value: Vector3Transition?): Unit

  @InterfaceMethod(95)
  public fun get_TransformMatrix(): Matrix4x4?

  @InterfaceMethod(96)
  public fun put_TransformMatrix(value: Matrix4x4?): Unit

  @InterfaceMethod(97)
  public fun get_CenterPoint(): Vector3?

  @InterfaceMethod(98)
  public fun put_CenterPoint(value: Vector3?): Unit

  @InterfaceMethod(99)
  public fun get_RotationAxis(): Vector3?

  @InterfaceMethod(100)
  public fun put_RotationAxis(value: Vector3?): Unit

  @InterfaceMethod(101)
  public fun get_ActualOffset(): Vector3?

  @InterfaceMethod(102)
  public fun get_ActualSize(): Vector2?

  @InterfaceMethod(103)
  public fun get_XamlRoot(): XamlRoot?

  @InterfaceMethod(104)
  public fun put_XamlRoot(value: XamlRoot?): Unit

  @InterfaceMethod(105)
  public fun get_Shadow(): Shadow?

  @InterfaceMethod(106)
  public fun put_Shadow(value: Shadow?): Unit

  @InterfaceMethod(107)
  public fun get_RasterizationScale(): Double

  @InterfaceMethod(108)
  public fun put_RasterizationScale(value: Double): Unit

  @InterfaceMethod(109)
  public fun get_FocusState(): FocusState?

  @InterfaceMethod(110)
  public fun get_UseSystemFocusVisuals(): Boolean

  @InterfaceMethod(111)
  public fun put_UseSystemFocusVisuals(value: Boolean): Unit

  @InterfaceMethod(112)
  public fun get_XYFocusLeft(): DependencyObject?

  @InterfaceMethod(113)
  public fun put_XYFocusLeft(value: DependencyObject?): Unit

  @InterfaceMethod(114)
  public fun get_XYFocusRight(): DependencyObject?

  @InterfaceMethod(115)
  public fun put_XYFocusRight(value: DependencyObject?): Unit

  @InterfaceMethod(116)
  public fun get_XYFocusUp(): DependencyObject?

  @InterfaceMethod(117)
  public fun put_XYFocusUp(value: DependencyObject?): Unit

  @InterfaceMethod(118)
  public fun get_XYFocusDown(): DependencyObject?

  @InterfaceMethod(119)
  public fun put_XYFocusDown(value: DependencyObject?): Unit

  @InterfaceMethod(120)
  public fun get_IsTabStop(): Boolean

  @InterfaceMethod(121)
  public fun put_IsTabStop(value: Boolean): Unit

  @InterfaceMethod(122)
  public fun get_TabIndex(): Int

  @InterfaceMethod(123)
  public fun put_TabIndex(value: Int): Unit

  @InterfaceMethod(124)
  public fun add_KeyUp(handler: KeyEventHandler?): EventRegistrationToken?

  @InterfaceMethod(125)
  public fun remove_KeyUp(token: EventRegistrationToken?): Unit

  @InterfaceMethod(126)
  public fun add_KeyDown(handler: KeyEventHandler?): EventRegistrationToken?

  @InterfaceMethod(127)
  public fun remove_KeyDown(token: EventRegistrationToken?): Unit

  @InterfaceMethod(128)
  public fun add_GotFocus(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(129)
  public fun remove_GotFocus(token: EventRegistrationToken?): Unit

  @InterfaceMethod(130)
  public fun add_LostFocus(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(131)
  public fun remove_LostFocus(token: EventRegistrationToken?): Unit

  @InterfaceMethod(132)
  public fun add_DragStarting(handler: TypedEventHandler<UIElement?, DragStartingEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(133)
  public fun remove_DragStarting(token: EventRegistrationToken?): Unit

  @InterfaceMethod(134)
  public fun add_DropCompleted(handler: TypedEventHandler<UIElement?, DropCompletedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(135)
  public fun remove_DropCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(136)
  public fun add_CharacterReceived(handler: TypedEventHandler<UIElement?,
      CharacterReceivedRoutedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(137)
  public fun remove_CharacterReceived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(138)
  public fun add_DragEnter(handler: DragEventHandler?): EventRegistrationToken?

  @InterfaceMethod(139)
  public fun remove_DragEnter(token: EventRegistrationToken?): Unit

  @InterfaceMethod(140)
  public fun add_DragLeave(handler: DragEventHandler?): EventRegistrationToken?

  @InterfaceMethod(141)
  public fun remove_DragLeave(token: EventRegistrationToken?): Unit

  @InterfaceMethod(142)
  public fun add_DragOver(handler: DragEventHandler?): EventRegistrationToken?

  @InterfaceMethod(143)
  public fun remove_DragOver(token: EventRegistrationToken?): Unit

  @InterfaceMethod(144)
  public fun add_Drop(handler: DragEventHandler?): EventRegistrationToken?

  @InterfaceMethod(145)
  public fun remove_Drop(token: EventRegistrationToken?): Unit

  @InterfaceMethod(146)
  public fun add_PointerPressed(handler: PointerEventHandler?): EventRegistrationToken?

  @InterfaceMethod(147)
  public fun remove_PointerPressed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(148)
  public fun add_PointerMoved(handler: PointerEventHandler?): EventRegistrationToken?

  @InterfaceMethod(149)
  public fun remove_PointerMoved(token: EventRegistrationToken?): Unit

  @InterfaceMethod(150)
  public fun add_PointerReleased(handler: PointerEventHandler?): EventRegistrationToken?

  @InterfaceMethod(151)
  public fun remove_PointerReleased(token: EventRegistrationToken?): Unit

  @InterfaceMethod(152)
  public fun add_PointerEntered(handler: PointerEventHandler?): EventRegistrationToken?

  @InterfaceMethod(153)
  public fun remove_PointerEntered(token: EventRegistrationToken?): Unit

  @InterfaceMethod(154)
  public fun add_PointerExited(handler: PointerEventHandler?): EventRegistrationToken?

  @InterfaceMethod(155)
  public fun remove_PointerExited(token: EventRegistrationToken?): Unit

  @InterfaceMethod(156)
  public fun add_PointerCaptureLost(handler: PointerEventHandler?): EventRegistrationToken?

  @InterfaceMethod(157)
  public fun remove_PointerCaptureLost(token: EventRegistrationToken?): Unit

  @InterfaceMethod(158)
  public fun add_PointerCanceled(handler: PointerEventHandler?): EventRegistrationToken?

  @InterfaceMethod(159)
  public fun remove_PointerCanceled(token: EventRegistrationToken?): Unit

  @InterfaceMethod(160)
  public fun add_PointerWheelChanged(handler: PointerEventHandler?): EventRegistrationToken?

  @InterfaceMethod(161)
  public fun remove_PointerWheelChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(162)
  public fun add_Tapped(handler: TappedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(163)
  public fun remove_Tapped(token: EventRegistrationToken?): Unit

  @InterfaceMethod(164)
  public fun add_DoubleTapped(handler: DoubleTappedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(165)
  public fun remove_DoubleTapped(token: EventRegistrationToken?): Unit

  @InterfaceMethod(166)
  public fun add_Holding(handler: HoldingEventHandler?): EventRegistrationToken?

  @InterfaceMethod(167)
  public fun remove_Holding(token: EventRegistrationToken?): Unit

  @InterfaceMethod(168)
  public fun add_ContextRequested(handler: TypedEventHandler<UIElement?,
      ContextRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(169)
  public fun remove_ContextRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(170)
  public fun add_ContextCanceled(handler: TypedEventHandler<UIElement?, RoutedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(171)
  public fun remove_ContextCanceled(token: EventRegistrationToken?): Unit

  @InterfaceMethod(172)
  public fun add_RightTapped(handler: RightTappedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(173)
  public fun remove_RightTapped(token: EventRegistrationToken?): Unit

  @InterfaceMethod(174)
  public fun add_ManipulationStarting(handler: ManipulationStartingEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(175)
  public fun remove_ManipulationStarting(token: EventRegistrationToken?): Unit

  @InterfaceMethod(176)
  public fun add_ManipulationInertiaStarting(handler: ManipulationInertiaStartingEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(177)
  public fun remove_ManipulationInertiaStarting(token: EventRegistrationToken?): Unit

  @InterfaceMethod(178)
  public fun add_ManipulationStarted(handler: ManipulationStartedEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(179)
  public fun remove_ManipulationStarted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(180)
  public fun add_ManipulationDelta(handler: ManipulationDeltaEventHandler?): EventRegistrationToken?

  @InterfaceMethod(181)
  public fun remove_ManipulationDelta(token: EventRegistrationToken?): Unit

  @InterfaceMethod(182)
  public fun add_ManipulationCompleted(handler: ManipulationCompletedEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(183)
  public fun remove_ManipulationCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(184)
  public fun add_AccessKeyDisplayRequested(handler: TypedEventHandler<UIElement?,
      AccessKeyDisplayRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(185)
  public fun remove_AccessKeyDisplayRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(186)
  public fun add_AccessKeyDisplayDismissed(handler: TypedEventHandler<UIElement?,
      AccessKeyDisplayDismissedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(187)
  public fun remove_AccessKeyDisplayDismissed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(188)
  public fun add_AccessKeyInvoked(handler: TypedEventHandler<UIElement?,
      AccessKeyInvokedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(189)
  public fun remove_AccessKeyInvoked(token: EventRegistrationToken?): Unit

  @InterfaceMethod(190)
  public fun add_ProcessKeyboardAccelerators(handler: TypedEventHandler<UIElement?,
      ProcessKeyboardAcceleratorEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(191)
  public fun remove_ProcessKeyboardAccelerators(token: EventRegistrationToken?): Unit

  @InterfaceMethod(192)
  public fun add_GettingFocus(handler: TypedEventHandler<UIElement?, GettingFocusEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(193)
  public fun remove_GettingFocus(token: EventRegistrationToken?): Unit

  @InterfaceMethod(194)
  public fun add_LosingFocus(handler: TypedEventHandler<UIElement?, LosingFocusEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(195)
  public fun remove_LosingFocus(token: EventRegistrationToken?): Unit

  @InterfaceMethod(196)
  public fun add_NoFocusCandidateFound(handler: TypedEventHandler<UIElement?,
      NoFocusCandidateFoundEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(197)
  public fun remove_NoFocusCandidateFound(token: EventRegistrationToken?): Unit

  @InterfaceMethod(198)
  public fun add_PreviewKeyDown(handler: KeyEventHandler?): EventRegistrationToken?

  @InterfaceMethod(199)
  public fun remove_PreviewKeyDown(token: EventRegistrationToken?): Unit

  @InterfaceMethod(200)
  public fun add_PreviewKeyUp(handler: KeyEventHandler?): EventRegistrationToken?

  @InterfaceMethod(201)
  public fun remove_PreviewKeyUp(token: EventRegistrationToken?): Unit

  @InterfaceMethod(202)
  public fun add_BringIntoViewRequested(handler: TypedEventHandler<UIElement?,
      BringIntoViewRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(203)
  public fun remove_BringIntoViewRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(204)
  public fun Measure(availableSize: Size?): Unit

  @InterfaceMethod(205)
  public fun Arrange(finalRect: Rect?): Unit

  @InterfaceMethod(206)
  public fun CapturePointer(value: Pointer?): Boolean

  @InterfaceMethod(207)
  public fun ReleasePointerCapture(value: Pointer?): Unit

  @InterfaceMethod(208)
  public fun ReleasePointerCaptures(): Unit

  @InterfaceMethod(209)
  public fun AddHandler(
    routedEvent: RoutedEvent?,
    handler: IUnknown?,
    handledEventsToo: Boolean
  ): Unit

  @InterfaceMethod(210)
  public fun RemoveHandler(routedEvent: RoutedEvent?, handler: IUnknown?): Unit

  @InterfaceMethod(211)
  public fun TransformToVisual(visual: UIElement?): GeneralTransform?

  @InterfaceMethod(212)
  public fun InvalidateMeasure(): Unit

  @InterfaceMethod(213)
  public fun InvalidateArrange(): Unit

  @InterfaceMethod(214)
  public fun UpdateLayout(): Unit

  @InterfaceMethod(215)
  public fun CancelDirectManipulations(): Boolean

  @InterfaceMethod(216)
  public fun StartDragAsync(pointerPoint: PointerPoint?): IAsyncOperation<DataPackageOperation?>?

  @InterfaceMethod(217)
  public fun StartBringIntoView(): Unit

  @InterfaceMethod(218)
  public fun StartBringIntoView(options: BringIntoViewOptions?): Unit

  @InterfaceMethod(219)
  public fun TryInvokeKeyboardAccelerator(args: ProcessKeyboardAcceleratorEventArgs?): Unit

  @InterfaceMethod(220)
  public fun Focus(value: FocusState?): Boolean

  @InterfaceMethod(221)
  public fun StartAnimation(animation: ICompositionAnimationBase?): Unit

  @InterfaceMethod(222)
  public fun StopAnimation(animation: ICompositionAnimationBase?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUIElement> {
    public override fun getValue() = ABI.makeIUIElement(pointer.getPointer(0))

    public fun setValue(value: IUIElement_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIElement {
    public val __320529793_Ptr: com.sun.jna.Pointer?

    public val _320529793_VtblPtr: com.sun.jna.Pointer?
      get() = __320529793_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DesiredSize(): Size? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AllowDrop(): Boolean {
      val fnPtr = _320529793_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_AllowDrop(value: Boolean): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Opacity(): Double {
      val fnPtr = _320529793_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_Opacity(value: Double): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Clip(): RectangleGeometry? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RectangleGeometry>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RectangleGeometry>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_Clip(value: RectangleGeometry?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_RenderTransform(): Transform? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Transform>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Transform>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_RenderTransform(value: Transform?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_Projection(): Projection? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Projection>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Projection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_Projection(value: Projection?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_Transform3D(): Transform3D? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Transform3D>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Transform3D>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun put_Transform3D(value: Transform3D?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_RenderTransformOrigin(): Point? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_RenderTransformOrigin(value: Point?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_IsHitTestVisible(): Boolean {
      val fnPtr = _320529793_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun put_IsHitTestVisible(value: Boolean): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_Visibility(): Visibility? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Visibility>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Visibility>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun put_Visibility(value: Visibility?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun get_RenderSize(): Size? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun get_UseLayoutRounding(): Boolean {
      val fnPtr = _320529793_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun put_UseLayoutRounding(value: Boolean): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_Transitions(): TransitionCollection? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TransitionCollection>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TransitionCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_Transitions(value: TransitionCollection?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_CacheMode(): CacheMode? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CacheMode>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CacheMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun put_CacheMode(value: CacheMode?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_IsTapEnabled(): Boolean {
      val fnPtr = _320529793_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(27)
    public override fun put_IsTapEnabled(value: Boolean): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_IsDoubleTapEnabled(): Boolean {
      val fnPtr = _320529793_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(29)
    public override fun put_IsDoubleTapEnabled(value: Boolean): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_CanDrag(): Boolean {
      val fnPtr = _320529793_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(31)
    public override fun put_CanDrag(value: Boolean): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun get_IsRightTapEnabled(): Boolean {
      val fnPtr = _320529793_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(33)
    public override fun put_IsRightTapEnabled(value: Boolean): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun get_IsHoldingEnabled(): Boolean {
      val fnPtr = _320529793_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(35)
    public override fun put_IsHoldingEnabled(value: Boolean): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun get_ManipulationMode(): ManipulationModes? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ManipulationModes>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ManipulationModes>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun put_ManipulationMode(value: ManipulationModes?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun get_PointerCaptures(): IVectorView<Pointer?>? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Pointer?>>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Pointer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun get_ContextFlyout(): FlyoutBase? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlyoutBase>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlyoutBase>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(40)
    public override fun put_ContextFlyout(value: FlyoutBase?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(41)
    public override fun get_CompositeMode(): ElementCompositeMode? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ElementCompositeMode>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ElementCompositeMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(42)
    public override fun put_CompositeMode(value: ElementCompositeMode?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(43)
    public override fun get_Lights(): IVector<XamlLight?>? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<XamlLight?>>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<XamlLight?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(44)
    public override fun get_CanBeScrollAnchor(): Boolean {
      val fnPtr = _320529793_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(45)
    public override fun put_CanBeScrollAnchor(value: Boolean): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(46)
    public override fun get_ExitDisplayModeOnAccessKeyInvoked(): Boolean {
      val fnPtr = _320529793_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(47)
    public override fun put_ExitDisplayModeOnAccessKeyInvoked(value: Boolean): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(48)
    public override fun get_IsAccessKeyScope(): Boolean {
      val fnPtr = _320529793_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(49)
    public override fun put_IsAccessKeyScope(value: Boolean): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(50)
    public override fun get_AccessKeyScopeOwner(): DependencyObject? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(51)
    public override fun put_AccessKeyScopeOwner(value: DependencyObject?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(52)
    public override fun get_AccessKey(): String? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(53)
    public override fun put_AccessKey(value: String?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(54)
    public override fun get_KeyTipPlacementMode(): KeyTipPlacementMode? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(60L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeyTipPlacementMode>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeyTipPlacementMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(55)
    public override fun put_KeyTipPlacementMode(value: KeyTipPlacementMode?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(61L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(56)
    public override fun get_KeyTipHorizontalOffset(): Double {
      val fnPtr = _320529793_VtblPtr!!.getPointer(62L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(57)
    public override fun put_KeyTipHorizontalOffset(value: Double): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(63L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(58)
    public override fun get_KeyTipVerticalOffset(): Double {
      val fnPtr = _320529793_VtblPtr!!.getPointer(64L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(59)
    public override fun put_KeyTipVerticalOffset(value: Double): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(65L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(60)
    public override fun get_KeyTipTarget(): DependencyObject? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(66L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(61)
    public override fun put_KeyTipTarget(value: DependencyObject?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(67L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(62)
    public override fun get_XYFocusKeyboardNavigation(): XYFocusKeyboardNavigationMode? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(68L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XYFocusKeyboardNavigationMode>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XYFocusKeyboardNavigationMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(63)
    public override fun put_XYFocusKeyboardNavigation(value: XYFocusKeyboardNavigationMode?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(69L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(64)
    public override fun get_XYFocusUpNavigationStrategy(): XYFocusNavigationStrategy? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(70L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XYFocusNavigationStrategy>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XYFocusNavigationStrategy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(65)
    public override fun put_XYFocusUpNavigationStrategy(value: XYFocusNavigationStrategy?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(71L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(66)
    public override fun get_XYFocusDownNavigationStrategy(): XYFocusNavigationStrategy? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(72L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XYFocusNavigationStrategy>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XYFocusNavigationStrategy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(67)
    public override fun put_XYFocusDownNavigationStrategy(value: XYFocusNavigationStrategy?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(73L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(68)
    public override fun get_XYFocusLeftNavigationStrategy(): XYFocusNavigationStrategy? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(74L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XYFocusNavigationStrategy>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XYFocusNavigationStrategy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(69)
    public override fun put_XYFocusLeftNavigationStrategy(value: XYFocusNavigationStrategy?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(75L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(70)
    public override fun get_XYFocusRightNavigationStrategy(): XYFocusNavigationStrategy? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(76L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XYFocusNavigationStrategy>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XYFocusNavigationStrategy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(71)
    public override fun put_XYFocusRightNavigationStrategy(value: XYFocusNavigationStrategy?):
        Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(77L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(72)
    public override fun get_KeyboardAccelerators(): IVector<KeyboardAccelerator?>? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(78L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<KeyboardAccelerator?>>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<KeyboardAccelerator?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(73)
    public override fun get_KeyboardAcceleratorPlacementTarget(): DependencyObject? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(79L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(74)
    public override fun put_KeyboardAcceleratorPlacementTarget(value: DependencyObject?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(80L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(75)
    public override fun get_KeyboardAcceleratorPlacementMode(): KeyboardAcceleratorPlacementMode? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(81L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeyboardAcceleratorPlacementMode>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeyboardAcceleratorPlacementMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(76)
    public override
        fun put_KeyboardAcceleratorPlacementMode(value: KeyboardAcceleratorPlacementMode?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(82L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(77)
    public override fun get_HighContrastAdjustment(): ElementHighContrastAdjustment? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(83L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ElementHighContrastAdjustment>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ElementHighContrastAdjustment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(78)
    public override fun put_HighContrastAdjustment(value: ElementHighContrastAdjustment?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(84L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(79)
    public override fun get_TabFocusNavigation(): KeyboardNavigationMode? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(85L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeyboardNavigationMode>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeyboardNavigationMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(80)
    public override fun put_TabFocusNavigation(value: KeyboardNavigationMode?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(86L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(81)
    public override fun get_OpacityTransition(): ScalarTransition? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(87L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScalarTransition>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScalarTransition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(82)
    public override fun put_OpacityTransition(value: ScalarTransition?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(88L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(83)
    public override fun get_Translation(): Vector3? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(89L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(84)
    public override fun put_Translation(value: Vector3?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(90L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(85)
    public override fun get_TranslationTransition(): Vector3Transition? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(91L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3Transition>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3Transition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(86)
    public override fun put_TranslationTransition(value: Vector3Transition?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(92L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(87)
    public override fun get_Rotation(): Float {
      val fnPtr = _320529793_VtblPtr!!.getPointer(93L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(88)
    public override fun put_Rotation(value: Float): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(94L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(89)
    public override fun get_RotationTransition(): ScalarTransition? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(95L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScalarTransition>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScalarTransition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(90)
    public override fun put_RotationTransition(value: ScalarTransition?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(96L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(91)
    public override fun get_Scale(): Vector3? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(97L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(92)
    public override fun put_Scale(value: Vector3?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(98L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(93)
    public override fun get_ScaleTransition(): Vector3Transition? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(99L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3Transition>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3Transition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(94)
    public override fun put_ScaleTransition(value: Vector3Transition?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(100L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(95)
    public override fun get_TransformMatrix(): Matrix4x4? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(101L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Matrix4x4>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Matrix4x4>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(96)
    public override fun put_TransformMatrix(value: Matrix4x4?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(102L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(97)
    public override fun get_CenterPoint(): Vector3? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(103L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(98)
    public override fun put_CenterPoint(value: Vector3?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(104L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(99)
    public override fun get_RotationAxis(): Vector3? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(105L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(100)
    public override fun put_RotationAxis(value: Vector3?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(106L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(101)
    public override fun get_ActualOffset(): Vector3? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(107L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(102)
    public override fun get_ActualSize(): Vector2? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(108L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(103)
    public override fun get_XamlRoot(): XamlRoot? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(109L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XamlRoot>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XamlRoot>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(104)
    public override fun put_XamlRoot(value: XamlRoot?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(110L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(105)
    public override fun get_Shadow(): Shadow? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(111L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Shadow>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Shadow>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(106)
    public override fun put_Shadow(value: Shadow?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(112L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(107)
    public override fun get_RasterizationScale(): Double {
      val fnPtr = _320529793_VtblPtr!!.getPointer(113L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(108)
    public override fun put_RasterizationScale(value: Double): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(114L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(109)
    public override fun get_FocusState(): FocusState? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(115L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FocusState>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FocusState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(110)
    public override fun get_UseSystemFocusVisuals(): Boolean {
      val fnPtr = _320529793_VtblPtr!!.getPointer(116L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(111)
    public override fun put_UseSystemFocusVisuals(value: Boolean): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(117L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(112)
    public override fun get_XYFocusLeft(): DependencyObject? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(118L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(113)
    public override fun put_XYFocusLeft(value: DependencyObject?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(119L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(114)
    public override fun get_XYFocusRight(): DependencyObject? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(120L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(115)
    public override fun put_XYFocusRight(value: DependencyObject?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(121L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(116)
    public override fun get_XYFocusUp(): DependencyObject? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(122L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(117)
    public override fun put_XYFocusUp(value: DependencyObject?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(123L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(118)
    public override fun get_XYFocusDown(): DependencyObject? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(124L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(119)
    public override fun put_XYFocusDown(value: DependencyObject?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(125L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(120)
    public override fun get_IsTabStop(): Boolean {
      val fnPtr = _320529793_VtblPtr!!.getPointer(126L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(121)
    public override fun put_IsTabStop(value: Boolean): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(127L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(122)
    public override fun get_TabIndex(): Int {
      val fnPtr = _320529793_VtblPtr!!.getPointer(128L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(123)
    public override fun put_TabIndex(value: Int): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(129L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(124)
    public override fun add_KeyUp(handler: KeyEventHandler?): EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(130L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(125)
    public override fun remove_KeyUp(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(131L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(126)
    public override fun add_KeyDown(handler: KeyEventHandler?): EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(132L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(127)
    public override fun remove_KeyDown(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(133L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(128)
    public override fun add_GotFocus(handler: RoutedEventHandler?): EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(134L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(129)
    public override fun remove_GotFocus(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(135L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(130)
    public override fun add_LostFocus(handler: RoutedEventHandler?): EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(136L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(131)
    public override fun remove_LostFocus(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(137L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(132)
    public override fun add_DragStarting(handler: TypedEventHandler<UIElement?,
        DragStartingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(138L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(133)
    public override fun remove_DragStarting(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(139L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(134)
    public override fun add_DropCompleted(handler: TypedEventHandler<UIElement?,
        DropCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(140L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(135)
    public override fun remove_DropCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(141L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(136)
    public override fun add_CharacterReceived(handler: TypedEventHandler<UIElement?,
        CharacterReceivedRoutedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(142L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(137)
    public override fun remove_CharacterReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(143L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(138)
    public override fun add_DragEnter(handler: DragEventHandler?): EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(144L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(139)
    public override fun remove_DragEnter(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(145L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(140)
    public override fun add_DragLeave(handler: DragEventHandler?): EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(146L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(141)
    public override fun remove_DragLeave(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(147L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(142)
    public override fun add_DragOver(handler: DragEventHandler?): EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(148L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(143)
    public override fun remove_DragOver(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(149L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(144)
    public override fun add_Drop(handler: DragEventHandler?): EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(150L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(145)
    public override fun remove_Drop(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(151L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(146)
    public override fun add_PointerPressed(handler: PointerEventHandler?): EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(152L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(147)
    public override fun remove_PointerPressed(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(153L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(148)
    public override fun add_PointerMoved(handler: PointerEventHandler?): EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(154L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(149)
    public override fun remove_PointerMoved(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(155L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(150)
    public override fun add_PointerReleased(handler: PointerEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(156L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(151)
    public override fun remove_PointerReleased(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(157L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(152)
    public override fun add_PointerEntered(handler: PointerEventHandler?): EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(158L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(153)
    public override fun remove_PointerEntered(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(159L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(154)
    public override fun add_PointerExited(handler: PointerEventHandler?): EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(160L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(155)
    public override fun remove_PointerExited(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(161L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(156)
    public override fun add_PointerCaptureLost(handler: PointerEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(162L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(157)
    public override fun remove_PointerCaptureLost(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(163L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(158)
    public override fun add_PointerCanceled(handler: PointerEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(164L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(159)
    public override fun remove_PointerCanceled(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(165L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(160)
    public override fun add_PointerWheelChanged(handler: PointerEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(166L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(161)
    public override fun remove_PointerWheelChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(167L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(162)
    public override fun add_Tapped(handler: TappedEventHandler?): EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(168L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(163)
    public override fun remove_Tapped(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(169L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(164)
    public override fun add_DoubleTapped(handler: DoubleTappedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(170L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(165)
    public override fun remove_DoubleTapped(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(171L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(166)
    public override fun add_Holding(handler: HoldingEventHandler?): EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(172L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(167)
    public override fun remove_Holding(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(173L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(168)
    public override fun add_ContextRequested(handler: TypedEventHandler<UIElement?,
        ContextRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(174L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(169)
    public override fun remove_ContextRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(175L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(170)
    public override fun add_ContextCanceled(handler: TypedEventHandler<UIElement?,
        RoutedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(176L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(171)
    public override fun remove_ContextCanceled(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(177L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(172)
    public override fun add_RightTapped(handler: RightTappedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(178L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(173)
    public override fun remove_RightTapped(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(179L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(174)
    public override fun add_ManipulationStarting(handler: ManipulationStartingEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(180L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(175)
    public override fun remove_ManipulationStarting(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(181L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(176)
    public override
        fun add_ManipulationInertiaStarting(handler: ManipulationInertiaStartingEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(182L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(177)
    public override fun remove_ManipulationInertiaStarting(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(183L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(178)
    public override fun add_ManipulationStarted(handler: ManipulationStartedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(184L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(179)
    public override fun remove_ManipulationStarted(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(185L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(180)
    public override fun add_ManipulationDelta(handler: ManipulationDeltaEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(186L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(181)
    public override fun remove_ManipulationDelta(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(187L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(182)
    public override fun add_ManipulationCompleted(handler: ManipulationCompletedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(188L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(183)
    public override fun remove_ManipulationCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(189L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(184)
    public override fun add_AccessKeyDisplayRequested(handler: TypedEventHandler<UIElement?,
        AccessKeyDisplayRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(190L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(185)
    public override fun remove_AccessKeyDisplayRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(191L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(186)
    public override fun add_AccessKeyDisplayDismissed(handler: TypedEventHandler<UIElement?,
        AccessKeyDisplayDismissedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(192L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(187)
    public override fun remove_AccessKeyDisplayDismissed(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(193L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(188)
    public override fun add_AccessKeyInvoked(handler: TypedEventHandler<UIElement?,
        AccessKeyInvokedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(194L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(189)
    public override fun remove_AccessKeyInvoked(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(195L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(190)
    public override fun add_ProcessKeyboardAccelerators(handler: TypedEventHandler<UIElement?,
        ProcessKeyboardAcceleratorEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(196L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(191)
    public override fun remove_ProcessKeyboardAccelerators(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(197L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(192)
    public override fun add_GettingFocus(handler: TypedEventHandler<UIElement?,
        GettingFocusEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(198L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(193)
    public override fun remove_GettingFocus(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(199L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(194)
    public override fun add_LosingFocus(handler: TypedEventHandler<UIElement?,
        LosingFocusEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(200L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(195)
    public override fun remove_LosingFocus(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(201L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(196)
    public override fun add_NoFocusCandidateFound(handler: TypedEventHandler<UIElement?,
        NoFocusCandidateFoundEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(202L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(197)
    public override fun remove_NoFocusCandidateFound(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(203L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(198)
    public override fun add_PreviewKeyDown(handler: KeyEventHandler?): EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(204L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(199)
    public override fun remove_PreviewKeyDown(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(205L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(200)
    public override fun add_PreviewKeyUp(handler: KeyEventHandler?): EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(206L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(201)
    public override fun remove_PreviewKeyUp(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(207L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(202)
    public override fun add_BringIntoViewRequested(handler: TypedEventHandler<UIElement?,
        BringIntoViewRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(208L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(203)
    public override fun remove_BringIntoViewRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(209L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(204)
    public override fun Measure(availableSize: Size?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(210L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(availableSize),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(205)
    public override fun Arrange(finalRect: Rect?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(211L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(finalRect),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(206)
    public override fun CapturePointer(value: Pointer?): Boolean {
      val fnPtr = _320529793_VtblPtr!!.getPointer(212L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(207)
    public override fun ReleasePointerCapture(value: Pointer?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(213L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(208)
    public override fun ReleasePointerCaptures(): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(214L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(209)
    public override fun AddHandler(
      routedEvent: RoutedEvent?,
      handler: IUnknown?,
      handledEventsToo: Boolean
    ): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(215L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(routedEvent),
          marshalToNative(handler), handledEventsToo,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(210)
    public override fun RemoveHandler(routedEvent: RoutedEvent?, handler: IUnknown?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(216L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(routedEvent),
          marshalToNative(handler),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(211)
    public override fun TransformToVisual(visual: UIElement?): GeneralTransform? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(217L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GeneralTransform>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(visual), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GeneralTransform>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(212)
    public override fun InvalidateMeasure(): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(218L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(213)
    public override fun InvalidateArrange(): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(219L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(214)
    public override fun UpdateLayout(): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(220L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(215)
    public override fun CancelDirectManipulations(): Boolean {
      val fnPtr = _320529793_VtblPtr!!.getPointer(221L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(216)
    public override fun StartDragAsync(pointerPoint: PointerPoint?):
        IAsyncOperation<DataPackageOperation?>? {
      val fnPtr = _320529793_VtblPtr!!.getPointer(222L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DataPackageOperation?>>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(pointerPoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DataPackageOperation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(217)
    public override fun StartBringIntoView(): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(223L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(218)
    public override fun StartBringIntoView(options: BringIntoViewOptions?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(224L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(options),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(219)
    public override fun TryInvokeKeyboardAccelerator(args: ProcessKeyboardAcceleratorEventArgs?):
        Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(225L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(args),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(220)
    public override fun Focus(value: FocusState?): Boolean {
      val fnPtr = _320529793_VtblPtr!!.getPointer(226L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(221)
    public override fun StartAnimation(animation: ICompositionAnimationBase?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(227L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(animation),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(222)
    public override fun StopAnimation(animation: ICompositionAnimationBase?): Unit {
      val fnPtr = _320529793_VtblPtr!!.getPointer(228L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320529793_Ptr, marshalToNative(animation),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUIElement_Impl(
    ptr: com.sun.jna.Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __320529793_Ptr: com.sun.jna.Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIElement, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c3c01020320c5cf69d24d396bbfa4d8b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIElement(ptr: com.sun.jna.Pointer?): WithDefault = IUIElement_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIElement {
      val address = segment.toRawLongValue()
      return makeIUIElement(com.sun.jna.Pointer(address))
    }

    public override fun toNative(obj: IUIElement): MemoryAddress =
        MemoryAddress.ofLong(com.sun.jna.Pointer.nativeValue((obj as WithDefault).__320529793_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIElement): Array<IUIElement?> = (elements as
        Array<IUIElement?>).castToImpl<IUIElement,IUIElement_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIElement?> = arrayOfNulls<IUIElement_Impl>(size)
        as Array<IUIElement?>
  }
}
