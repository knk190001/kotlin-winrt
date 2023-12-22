package Windows.UI.Xaml

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Point
import Windows.Foundation.Rect
import Windows.Foundation.Size
import Windows.UI.Xaml.Input.DoubleTappedEventHandler
import Windows.UI.Xaml.Input.HoldingEventHandler
import Windows.UI.Xaml.Input.KeyEventHandler
import Windows.UI.Xaml.Input.ManipulationCompletedEventHandler
import Windows.UI.Xaml.Input.ManipulationDeltaEventHandler
import Windows.UI.Xaml.Input.ManipulationInertiaStartingEventHandler
import Windows.UI.Xaml.Input.ManipulationModes
import Windows.UI.Xaml.Input.ManipulationStartedEventHandler
import Windows.UI.Xaml.Input.ManipulationStartingEventHandler
import Windows.UI.Xaml.Input.Pointer
import Windows.UI.Xaml.Input.PointerEventHandler
import Windows.UI.Xaml.Input.RightTappedEventHandler
import Windows.UI.Xaml.Input.TappedEventHandler
import Windows.UI.Xaml.Media.Animation.TransitionCollection
import Windows.UI.Xaml.Media.CacheMode
import Windows.UI.Xaml.Media.GeneralTransform
import Windows.UI.Xaml.Media.Projection
import Windows.UI.Xaml.Media.RectangleGeometry
import Windows.UI.Xaml.Media.Transform
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUIElement.ABI::class)
@Signature("{676d0be9-b65c-41c6-ba40-58cf87f201c1}")
@Guid("676d0be9b65c41c6ba4058cf87f201c1")
@WinRTInterface("676d0be9b65c41c6ba4058cf87f201c1")
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
  public fun get_RenderTransformOrigin(): Point?

  @InterfaceMethod(12)
  public fun put_RenderTransformOrigin(value: Point?): Unit

  @InterfaceMethod(13)
  public fun get_IsHitTestVisible(): Boolean

  @InterfaceMethod(14)
  public fun put_IsHitTestVisible(value: Boolean): Unit

  @InterfaceMethod(15)
  public fun get_Visibility(): Visibility?

  @InterfaceMethod(16)
  public fun put_Visibility(value: Visibility?): Unit

  @InterfaceMethod(17)
  public fun get_RenderSize(): Size?

  @InterfaceMethod(18)
  public fun get_UseLayoutRounding(): Boolean

  @InterfaceMethod(19)
  public fun put_UseLayoutRounding(value: Boolean): Unit

  @InterfaceMethod(20)
  public fun get_Transitions(): TransitionCollection?

  @InterfaceMethod(21)
  public fun put_Transitions(value: TransitionCollection?): Unit

  @InterfaceMethod(22)
  public fun get_CacheMode(): CacheMode?

  @InterfaceMethod(23)
  public fun put_CacheMode(value: CacheMode?): Unit

  @InterfaceMethod(24)
  public fun get_IsTapEnabled(): Boolean

  @InterfaceMethod(25)
  public fun put_IsTapEnabled(value: Boolean): Unit

  @InterfaceMethod(26)
  public fun get_IsDoubleTapEnabled(): Boolean

  @InterfaceMethod(27)
  public fun put_IsDoubleTapEnabled(value: Boolean): Unit

  @InterfaceMethod(28)
  public fun get_IsRightTapEnabled(): Boolean

  @InterfaceMethod(29)
  public fun put_IsRightTapEnabled(value: Boolean): Unit

  @InterfaceMethod(30)
  public fun get_IsHoldingEnabled(): Boolean

  @InterfaceMethod(31)
  public fun put_IsHoldingEnabled(value: Boolean): Unit

  @InterfaceMethod(32)
  public fun get_ManipulationMode(): ManipulationModes?

  @InterfaceMethod(33)
  public fun put_ManipulationMode(value: ManipulationModes?): Unit

  @InterfaceMethod(34)
  public fun get_PointerCaptures(): IVectorView<Pointer?>?

  @InterfaceMethod(35)
  public fun add_KeyUp(handler: KeyEventHandler?): EventRegistrationToken?

  @InterfaceMethod(36)
  public fun remove_KeyUp(token: EventRegistrationToken?): Unit

  @InterfaceMethod(37)
  public fun add_KeyDown(handler: KeyEventHandler?): EventRegistrationToken?

  @InterfaceMethod(38)
  public fun remove_KeyDown(token: EventRegistrationToken?): Unit

  @InterfaceMethod(39)
  public fun add_GotFocus(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(40)
  public fun remove_GotFocus(token: EventRegistrationToken?): Unit

  @InterfaceMethod(41)
  public fun add_LostFocus(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(42)
  public fun remove_LostFocus(token: EventRegistrationToken?): Unit

  @InterfaceMethod(43)
  public fun add_DragEnter(handler: DragEventHandler?): EventRegistrationToken?

  @InterfaceMethod(44)
  public fun remove_DragEnter(token: EventRegistrationToken?): Unit

  @InterfaceMethod(45)
  public fun add_DragLeave(handler: DragEventHandler?): EventRegistrationToken?

  @InterfaceMethod(46)
  public fun remove_DragLeave(token: EventRegistrationToken?): Unit

  @InterfaceMethod(47)
  public fun add_DragOver(handler: DragEventHandler?): EventRegistrationToken?

  @InterfaceMethod(48)
  public fun remove_DragOver(token: EventRegistrationToken?): Unit

  @InterfaceMethod(49)
  public fun add_Drop(handler: DragEventHandler?): EventRegistrationToken?

  @InterfaceMethod(50)
  public fun remove_Drop(token: EventRegistrationToken?): Unit

  @InterfaceMethod(51)
  public fun add_PointerPressed(handler: PointerEventHandler?): EventRegistrationToken?

  @InterfaceMethod(52)
  public fun remove_PointerPressed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(53)
  public fun add_PointerMoved(handler: PointerEventHandler?): EventRegistrationToken?

  @InterfaceMethod(54)
  public fun remove_PointerMoved(token: EventRegistrationToken?): Unit

  @InterfaceMethod(55)
  public fun add_PointerReleased(handler: PointerEventHandler?): EventRegistrationToken?

  @InterfaceMethod(56)
  public fun remove_PointerReleased(token: EventRegistrationToken?): Unit

  @InterfaceMethod(57)
  public fun add_PointerEntered(handler: PointerEventHandler?): EventRegistrationToken?

  @InterfaceMethod(58)
  public fun remove_PointerEntered(token: EventRegistrationToken?): Unit

  @InterfaceMethod(59)
  public fun add_PointerExited(handler: PointerEventHandler?): EventRegistrationToken?

  @InterfaceMethod(60)
  public fun remove_PointerExited(token: EventRegistrationToken?): Unit

  @InterfaceMethod(61)
  public fun add_PointerCaptureLost(handler: PointerEventHandler?): EventRegistrationToken?

  @InterfaceMethod(62)
  public fun remove_PointerCaptureLost(token: EventRegistrationToken?): Unit

  @InterfaceMethod(63)
  public fun add_PointerCanceled(handler: PointerEventHandler?): EventRegistrationToken?

  @InterfaceMethod(64)
  public fun remove_PointerCanceled(token: EventRegistrationToken?): Unit

  @InterfaceMethod(65)
  public fun add_PointerWheelChanged(handler: PointerEventHandler?): EventRegistrationToken?

  @InterfaceMethod(66)
  public fun remove_PointerWheelChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(67)
  public fun add_Tapped(handler: TappedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(68)
  public fun remove_Tapped(token: EventRegistrationToken?): Unit

  @InterfaceMethod(69)
  public fun add_DoubleTapped(handler: DoubleTappedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(70)
  public fun remove_DoubleTapped(token: EventRegistrationToken?): Unit

  @InterfaceMethod(71)
  public fun add_Holding(handler: HoldingEventHandler?): EventRegistrationToken?

  @InterfaceMethod(72)
  public fun remove_Holding(token: EventRegistrationToken?): Unit

  @InterfaceMethod(73)
  public fun add_RightTapped(handler: RightTappedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(74)
  public fun remove_RightTapped(token: EventRegistrationToken?): Unit

  @InterfaceMethod(75)
  public fun add_ManipulationStarting(handler: ManipulationStartingEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(76)
  public fun remove_ManipulationStarting(token: EventRegistrationToken?): Unit

  @InterfaceMethod(77)
  public fun add_ManipulationInertiaStarting(handler: ManipulationInertiaStartingEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(78)
  public fun remove_ManipulationInertiaStarting(token: EventRegistrationToken?): Unit

  @InterfaceMethod(79)
  public fun add_ManipulationStarted(handler: ManipulationStartedEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(80)
  public fun remove_ManipulationStarted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(81)
  public fun add_ManipulationDelta(handler: ManipulationDeltaEventHandler?): EventRegistrationToken?

  @InterfaceMethod(82)
  public fun remove_ManipulationDelta(token: EventRegistrationToken?): Unit

  @InterfaceMethod(83)
  public fun add_ManipulationCompleted(handler: ManipulationCompletedEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(84)
  public fun remove_ManipulationCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(85)
  public fun Measure(availableSize: Size?): Unit

  @InterfaceMethod(86)
  public fun Arrange(finalRect: Rect?): Unit

  @InterfaceMethod(87)
  public fun CapturePointer(value: Pointer?): Boolean

  @InterfaceMethod(88)
  public fun ReleasePointerCapture(value: Pointer?): Unit

  @InterfaceMethod(89)
  public fun ReleasePointerCaptures(): Unit

  @InterfaceMethod(90)
  public fun AddHandler(
    routedEvent: RoutedEvent?,
    handler: IUnknown?,
    handledEventsToo: Boolean
  ): Unit

  @InterfaceMethod(91)
  public fun RemoveHandler(routedEvent: RoutedEvent?, handler: IUnknown?): Unit

  @InterfaceMethod(92)
  public fun TransformToVisual(visual: UIElement?): GeneralTransform?

  @InterfaceMethod(93)
  public fun InvalidateMeasure(): Unit

  @InterfaceMethod(94)
  public fun InvalidateArrange(): Unit

  @InterfaceMethod(95)
  public fun UpdateLayout(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUIElement> {
    public override fun getValue() = ABI.makeIUIElement(pointer.getPointer(0))

    public fun setValue(value: IUIElement_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIElement {
    public val __1834054614_Ptr: com.sun.jna.Pointer?

    public val _1834054614_VtblPtr: com.sun.jna.Pointer?
      get() = __1834054614_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DesiredSize(): Size? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AllowDrop(): Boolean {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_AllowDrop(value: Boolean): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Opacity(): Double {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_Opacity(value: Double): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Clip(): RectangleGeometry? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RectangleGeometry>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RectangleGeometry>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_Clip(value: RectangleGeometry?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_RenderTransform(): Transform? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Transform>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Transform>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_RenderTransform(value: Transform?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_Projection(): Projection? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Projection>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Projection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_Projection(value: Projection?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_RenderTransformOrigin(): Point? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun put_RenderTransformOrigin(value: Point?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_IsHitTestVisible(): Boolean {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun put_IsHitTestVisible(value: Boolean): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_Visibility(): Visibility? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Visibility>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Visibility>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun put_Visibility(value: Visibility?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_RenderSize(): Size? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_UseLayoutRounding(): Boolean {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_UseLayoutRounding(value: Boolean): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_Transitions(): TransitionCollection? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TransitionCollection>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TransitionCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_Transitions(value: TransitionCollection?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_CacheMode(): CacheMode? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CacheMode>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CacheMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_CacheMode(value: CacheMode?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_IsTapEnabled(): Boolean {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(25)
    public override fun put_IsTapEnabled(value: Boolean): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_IsDoubleTapEnabled(): Boolean {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(27)
    public override fun put_IsDoubleTapEnabled(value: Boolean): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_IsRightTapEnabled(): Boolean {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(29)
    public override fun put_IsRightTapEnabled(value: Boolean): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_IsHoldingEnabled(): Boolean {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(31)
    public override fun put_IsHoldingEnabled(value: Boolean): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun get_ManipulationMode(): ManipulationModes? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ManipulationModes>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ManipulationModes>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun put_ManipulationMode(value: ManipulationModes?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun get_PointerCaptures(): IVectorView<Pointer?>? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Pointer?>>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Pointer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun add_KeyUp(handler: KeyEventHandler?): EventRegistrationToken? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(36)
    public override fun remove_KeyUp(token: EventRegistrationToken?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(37)
    public override fun add_KeyDown(handler: KeyEventHandler?): EventRegistrationToken? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(38)
    public override fun remove_KeyDown(token: EventRegistrationToken?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(39)
    public override fun add_GotFocus(handler: RoutedEventHandler?): EventRegistrationToken? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(40)
    public override fun remove_GotFocus(token: EventRegistrationToken?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(41)
    public override fun add_LostFocus(handler: RoutedEventHandler?): EventRegistrationToken? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(42)
    public override fun remove_LostFocus(token: EventRegistrationToken?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(43)
    public override fun add_DragEnter(handler: DragEventHandler?): EventRegistrationToken? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(44)
    public override fun remove_DragEnter(token: EventRegistrationToken?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(45)
    public override fun add_DragLeave(handler: DragEventHandler?): EventRegistrationToken? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(46)
    public override fun remove_DragLeave(token: EventRegistrationToken?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(47)
    public override fun add_DragOver(handler: DragEventHandler?): EventRegistrationToken? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(48)
    public override fun remove_DragOver(token: EventRegistrationToken?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(49)
    public override fun add_Drop(handler: DragEventHandler?): EventRegistrationToken? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(50)
    public override fun remove_Drop(token: EventRegistrationToken?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(51)
    public override fun add_PointerPressed(handler: PointerEventHandler?): EventRegistrationToken? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(52)
    public override fun remove_PointerPressed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(53)
    public override fun add_PointerMoved(handler: PointerEventHandler?): EventRegistrationToken? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(54)
    public override fun remove_PointerMoved(token: EventRegistrationToken?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(60L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(55)
    public override fun add_PointerReleased(handler: PointerEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(61L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(56)
    public override fun remove_PointerReleased(token: EventRegistrationToken?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(62L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(57)
    public override fun add_PointerEntered(handler: PointerEventHandler?): EventRegistrationToken? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(63L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(58)
    public override fun remove_PointerEntered(token: EventRegistrationToken?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(64L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(59)
    public override fun add_PointerExited(handler: PointerEventHandler?): EventRegistrationToken? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(65L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(60)
    public override fun remove_PointerExited(token: EventRegistrationToken?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(66L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(61)
    public override fun add_PointerCaptureLost(handler: PointerEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(67L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(62)
    public override fun remove_PointerCaptureLost(token: EventRegistrationToken?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(68L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(63)
    public override fun add_PointerCanceled(handler: PointerEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(69L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(64)
    public override fun remove_PointerCanceled(token: EventRegistrationToken?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(70L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(65)
    public override fun add_PointerWheelChanged(handler: PointerEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(71L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(66)
    public override fun remove_PointerWheelChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(72L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(67)
    public override fun add_Tapped(handler: TappedEventHandler?): EventRegistrationToken? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(73L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(68)
    public override fun remove_Tapped(token: EventRegistrationToken?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(74L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(69)
    public override fun add_DoubleTapped(handler: DoubleTappedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(75L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(70)
    public override fun remove_DoubleTapped(token: EventRegistrationToken?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(76L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(71)
    public override fun add_Holding(handler: HoldingEventHandler?): EventRegistrationToken? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(77L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(72)
    public override fun remove_Holding(token: EventRegistrationToken?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(78L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(73)
    public override fun add_RightTapped(handler: RightTappedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(79L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(74)
    public override fun remove_RightTapped(token: EventRegistrationToken?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(80L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(75)
    public override fun add_ManipulationStarting(handler: ManipulationStartingEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(81L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(76)
    public override fun remove_ManipulationStarting(token: EventRegistrationToken?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(82L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(77)
    public override
        fun add_ManipulationInertiaStarting(handler: ManipulationInertiaStartingEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(83L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(78)
    public override fun remove_ManipulationInertiaStarting(token: EventRegistrationToken?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(84L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(79)
    public override fun add_ManipulationStarted(handler: ManipulationStartedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(85L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(80)
    public override fun remove_ManipulationStarted(token: EventRegistrationToken?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(86L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(81)
    public override fun add_ManipulationDelta(handler: ManipulationDeltaEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(87L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(82)
    public override fun remove_ManipulationDelta(token: EventRegistrationToken?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(88L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(83)
    public override fun add_ManipulationCompleted(handler: ManipulationCompletedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(89L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(84)
    public override fun remove_ManipulationCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(90L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(85)
    public override fun Measure(availableSize: Size?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(91L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(availableSize),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(86)
    public override fun Arrange(finalRect: Rect?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(92L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(finalRect),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(87)
    public override fun CapturePointer(value: Pointer?): Boolean {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(93L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(88)
    public override fun ReleasePointerCapture(value: Pointer?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(94L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(89)
    public override fun ReleasePointerCaptures(): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(95L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(90)
    public override fun AddHandler(
      routedEvent: RoutedEvent?,
      handler: IUnknown?,
      handledEventsToo: Boolean
    ): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(96L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(routedEvent),
          marshalToNative(handler), handledEventsToo,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(91)
    public override fun RemoveHandler(routedEvent: RoutedEvent?, handler: IUnknown?): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(97L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(routedEvent),
          marshalToNative(handler),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(92)
    public override fun TransformToVisual(visual: UIElement?): GeneralTransform? {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(98L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GeneralTransform>()
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, marshalToNative(visual), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GeneralTransform>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(93)
    public override fun InvalidateMeasure(): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(99L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(94)
    public override fun InvalidateArrange(): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(100L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(95)
    public override fun UpdateLayout(): Unit {
      val fnPtr = _1834054614_VtblPtr!!.getPointer(101L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834054614_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUIElement_Impl(
    ptr: com.sun.jna.Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1834054614_Ptr: com.sun.jna.Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIElement, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("676d0be9b65c41c6ba4058cf87f201c1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIElement(ptr: com.sun.jna.Pointer?): WithDefault = IUIElement_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIElement {
      val address = segment.toRawLongValue()
      return makeIUIElement(com.sun.jna.Pointer(address))
    }

    public override fun toNative(obj: IUIElement): MemoryAddress =
        MemoryAddress.ofLong(com.sun.jna.Pointer.nativeValue((obj as WithDefault).__1834054614_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIElement): Array<IUIElement?> = (elements as
        Array<IUIElement?>).castToImpl<IUIElement,IUIElement_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIElement?> = arrayOfNulls<IUIElement_Impl>(size)
        as Array<IUIElement?>
  }
}
