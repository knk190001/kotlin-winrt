package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Composition.CompositionPropertySet
import Microsoft.UI.Xaml.Controls.ScrollingAnchorRequestedEventArgs
import Microsoft.UI.Xaml.Controls.ScrollingBringingIntoViewEventArgs
import Microsoft.UI.Xaml.Controls.ScrollingChainMode
import Microsoft.UI.Xaml.Controls.ScrollingContentOrientation
import Microsoft.UI.Xaml.Controls.ScrollingInputKinds
import Microsoft.UI.Xaml.Controls.ScrollingInteractionState
import Microsoft.UI.Xaml.Controls.ScrollingRailMode
import Microsoft.UI.Xaml.Controls.ScrollingScrollAnimationStartingEventArgs
import Microsoft.UI.Xaml.Controls.ScrollingScrollCompletedEventArgs
import Microsoft.UI.Xaml.Controls.ScrollingScrollMode
import Microsoft.UI.Xaml.Controls.ScrollingScrollOptions
import Microsoft.UI.Xaml.Controls.ScrollingZoomAnimationStartingEventArgs
import Microsoft.UI.Xaml.Controls.ScrollingZoomCompletedEventArgs
import Microsoft.UI.Xaml.Controls.ScrollingZoomMode
import Microsoft.UI.Xaml.Controls.ScrollingZoomOptions
import Microsoft.UI.Xaml.Media.Brush
import Microsoft.UI.Xaml.UIElement
import Windows.Foundation.Collections.IVector
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IReference
import Windows.Foundation.Numerics.Vector2
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
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IScrollPresenter.ABI::class)
@Signature("{424b8afd-f7aa-5e5b-9d0b-5f0ea4e1a56e}")
@Guid("424b8afdf7aa5e5b9d0b5f0ea4e1a56e")
@WinRTInterface("424b8afdf7aa5e5b9d0b5f0ea4e1a56e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollPresenter.ByReference::class)
public interface IScrollPresenter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Background(): Brush?

  @InterfaceMethod(1)
  public fun put_Background(value: Brush?): Unit

  @InterfaceMethod(2)
  public fun get_Content(): UIElement?

  @InterfaceMethod(3)
  public fun put_Content(value: UIElement?): Unit

  @InterfaceMethod(4)
  public fun get_ExpressionAnimationSources(): CompositionPropertySet?

  @InterfaceMethod(5)
  public fun get_HorizontalOffset(): Double

  @InterfaceMethod(6)
  public fun get_VerticalOffset(): Double

  @InterfaceMethod(7)
  public fun get_ZoomFactor(): Float

  @InterfaceMethod(8)
  public fun get_ExtentWidth(): Double

  @InterfaceMethod(9)
  public fun get_ExtentHeight(): Double

  @InterfaceMethod(10)
  public fun get_ViewportWidth(): Double

  @InterfaceMethod(11)
  public fun get_ViewportHeight(): Double

  @InterfaceMethod(12)
  public fun get_ScrollableWidth(): Double

  @InterfaceMethod(13)
  public fun get_ScrollableHeight(): Double

  @InterfaceMethod(14)
  public fun get_ContentOrientation(): ScrollingContentOrientation?

  @InterfaceMethod(15)
  public fun put_ContentOrientation(value: ScrollingContentOrientation?): Unit

  @InterfaceMethod(16)
  public fun get_HorizontalScrollChainMode(): ScrollingChainMode?

  @InterfaceMethod(17)
  public fun put_HorizontalScrollChainMode(value: ScrollingChainMode?): Unit

  @InterfaceMethod(18)
  public fun get_VerticalScrollChainMode(): ScrollingChainMode?

  @InterfaceMethod(19)
  public fun put_VerticalScrollChainMode(value: ScrollingChainMode?): Unit

  @InterfaceMethod(20)
  public fun get_HorizontalScrollRailMode(): ScrollingRailMode?

  @InterfaceMethod(21)
  public fun put_HorizontalScrollRailMode(value: ScrollingRailMode?): Unit

  @InterfaceMethod(22)
  public fun get_VerticalScrollRailMode(): ScrollingRailMode?

  @InterfaceMethod(23)
  public fun put_VerticalScrollRailMode(value: ScrollingRailMode?): Unit

  @InterfaceMethod(24)
  public fun get_HorizontalScrollMode(): ScrollingScrollMode?

  @InterfaceMethod(25)
  public fun put_HorizontalScrollMode(value: ScrollingScrollMode?): Unit

  @InterfaceMethod(26)
  public fun get_VerticalScrollMode(): ScrollingScrollMode?

  @InterfaceMethod(27)
  public fun put_VerticalScrollMode(value: ScrollingScrollMode?): Unit

  @InterfaceMethod(28)
  public fun get_ComputedHorizontalScrollMode(): ScrollingScrollMode?

  @InterfaceMethod(29)
  public fun get_ComputedVerticalScrollMode(): ScrollingScrollMode?

  @InterfaceMethod(30)
  public fun get_ZoomChainMode(): ScrollingChainMode?

  @InterfaceMethod(31)
  public fun put_ZoomChainMode(value: ScrollingChainMode?): Unit

  @InterfaceMethod(32)
  public fun get_ZoomMode(): ScrollingZoomMode?

  @InterfaceMethod(33)
  public fun put_ZoomMode(value: ScrollingZoomMode?): Unit

  @InterfaceMethod(34)
  public fun get_IgnoredInputKinds(): ScrollingInputKinds?

  @InterfaceMethod(35)
  public fun put_IgnoredInputKinds(value: ScrollingInputKinds?): Unit

  @InterfaceMethod(36)
  public fun get_MinZoomFactor(): Double

  @InterfaceMethod(37)
  public fun put_MinZoomFactor(value: Double): Unit

  @InterfaceMethod(38)
  public fun get_MaxZoomFactor(): Double

  @InterfaceMethod(39)
  public fun put_MaxZoomFactor(value: Double): Unit

  @InterfaceMethod(40)
  public fun get_State(): ScrollingInteractionState?

  @InterfaceMethod(41)
  public fun get_HorizontalScrollController(): IScrollController?

  @InterfaceMethod(42)
  public fun put_HorizontalScrollController(value: IScrollController?): Unit

  @InterfaceMethod(43)
  public fun get_VerticalScrollController(): IScrollController?

  @InterfaceMethod(44)
  public fun put_VerticalScrollController(value: IScrollController?): Unit

  @InterfaceMethod(45)
  public fun get_HorizontalAnchorRatio(): Double

  @InterfaceMethod(46)
  public fun put_HorizontalAnchorRatio(value: Double): Unit

  @InterfaceMethod(47)
  public fun get_VerticalAnchorRatio(): Double

  @InterfaceMethod(48)
  public fun put_VerticalAnchorRatio(value: Double): Unit

  @InterfaceMethod(49)
  public fun get_HorizontalSnapPoints(): IVector<ScrollSnapPointBase?>?

  @InterfaceMethod(50)
  public fun get_VerticalSnapPoints(): IVector<ScrollSnapPointBase?>?

  @InterfaceMethod(51)
  public fun get_ZoomSnapPoints(): IVector<ZoomSnapPointBase?>?

  @InterfaceMethod(52)
  public fun ScrollTo(horizontalOffset: Double, verticalOffset: Double): Int

  @InterfaceMethod(53)
  public fun ScrollTo(
    horizontalOffset: Double,
    verticalOffset: Double,
    options: ScrollingScrollOptions?
  ): Int

  @InterfaceMethod(54)
  public fun ScrollBy(horizontalOffsetDelta: Double, verticalOffsetDelta: Double): Int

  @InterfaceMethod(55)
  public fun ScrollBy(
    horizontalOffsetDelta: Double,
    verticalOffsetDelta: Double,
    options: ScrollingScrollOptions?
  ): Int

  @InterfaceMethod(56)
  public fun AddScrollVelocity(offsetsVelocity: Vector2?, inertiaDecayRate: IReference<Vector2?>?):
      Int

  @InterfaceMethod(57)
  public fun ZoomTo(zoomFactor: Float, centerPoint: IReference<Vector2?>?): Int

  @InterfaceMethod(58)
  public fun ZoomTo(
    zoomFactor: Float,
    centerPoint: IReference<Vector2?>?,
    options: ScrollingZoomOptions?
  ): Int

  @InterfaceMethod(59)
  public fun ZoomBy(zoomFactorDelta: Float, centerPoint: IReference<Vector2?>?): Int

  @InterfaceMethod(60)
  public fun ZoomBy(
    zoomFactorDelta: Float,
    centerPoint: IReference<Vector2?>?,
    options: ScrollingZoomOptions?
  ): Int

  @InterfaceMethod(61)
  public fun AddZoomVelocity(
    zoomFactorVelocity: Float,
    centerPoint: IReference<Vector2?>?,
    inertiaDecayRate: IReference<Float>?
  ): Int

  @InterfaceMethod(62)
  public fun add_ExtentChanged(handler: TypedEventHandler<ScrollPresenter?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(63)
  public fun remove_ExtentChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(64)
  public fun add_StateChanged(handler: TypedEventHandler<ScrollPresenter?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(65)
  public fun remove_StateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(66)
  public fun add_ViewChanged(handler: TypedEventHandler<ScrollPresenter?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(67)
  public fun remove_ViewChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(68)
  public fun add_ScrollAnimationStarting(handler: TypedEventHandler<ScrollPresenter?,
      ScrollingScrollAnimationStartingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(69)
  public fun remove_ScrollAnimationStarting(token: EventRegistrationToken?): Unit

  @InterfaceMethod(70)
  public fun add_ZoomAnimationStarting(handler: TypedEventHandler<ScrollPresenter?,
      ScrollingZoomAnimationStartingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(71)
  public fun remove_ZoomAnimationStarting(token: EventRegistrationToken?): Unit

  @InterfaceMethod(72)
  public fun add_ScrollCompleted(handler: TypedEventHandler<ScrollPresenter?,
      ScrollingScrollCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(73)
  public fun remove_ScrollCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(74)
  public fun add_ZoomCompleted(handler: TypedEventHandler<ScrollPresenter?,
      ScrollingZoomCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(75)
  public fun remove_ZoomCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(76)
  public fun add_BringingIntoView(handler: TypedEventHandler<ScrollPresenter?,
      ScrollingBringingIntoViewEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(77)
  public fun remove_BringingIntoView(token: EventRegistrationToken?): Unit

  @InterfaceMethod(78)
  public fun add_AnchorRequested(handler: TypedEventHandler<ScrollPresenter?,
      ScrollingAnchorRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(79)
  public fun remove_AnchorRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollPresenter> {
    public override fun getValue() = ABI.makeIScrollPresenter(pointer.getPointer(0))

    public fun setValue(value: IScrollPresenter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollPresenter {
    public val __41495062_Ptr: Pointer?

    public val _41495062_VtblPtr: Pointer?
      get() = __41495062_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Background(): Brush? {
      val fnPtr = _41495062_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Background(value: Brush?): Unit {
      val fnPtr = _41495062_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Content(): UIElement? {
      val fnPtr = _41495062_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Content(value: UIElement?): Unit {
      val fnPtr = _41495062_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ExpressionAnimationSources(): CompositionPropertySet? {
      val fnPtr = _41495062_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionPropertySet>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionPropertySet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_HorizontalOffset(): Double {
      val fnPtr = _41495062_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_VerticalOffset(): Double {
      val fnPtr = _41495062_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_ZoomFactor(): Float {
      val fnPtr = _41495062_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_ExtentWidth(): Double {
      val fnPtr = _41495062_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_ExtentHeight(): Double {
      val fnPtr = _41495062_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun get_ViewportWidth(): Double {
      val fnPtr = _41495062_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun get_ViewportHeight(): Double {
      val fnPtr = _41495062_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun get_ScrollableWidth(): Double {
      val fnPtr = _41495062_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun get_ScrollableHeight(): Double {
      val fnPtr = _41495062_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun get_ContentOrientation(): ScrollingContentOrientation? {
      val fnPtr = _41495062_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollingContentOrientation>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollingContentOrientation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_ContentOrientation(value: ScrollingContentOrientation?): Unit {
      val fnPtr = _41495062_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_HorizontalScrollChainMode(): ScrollingChainMode? {
      val fnPtr = _41495062_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollingChainMode>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollingChainMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_HorizontalScrollChainMode(value: ScrollingChainMode?): Unit {
      val fnPtr = _41495062_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_VerticalScrollChainMode(): ScrollingChainMode? {
      val fnPtr = _41495062_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollingChainMode>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollingChainMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_VerticalScrollChainMode(value: ScrollingChainMode?): Unit {
      val fnPtr = _41495062_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_HorizontalScrollRailMode(): ScrollingRailMode? {
      val fnPtr = _41495062_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollingRailMode>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollingRailMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_HorizontalScrollRailMode(value: ScrollingRailMode?): Unit {
      val fnPtr = _41495062_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_VerticalScrollRailMode(): ScrollingRailMode? {
      val fnPtr = _41495062_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollingRailMode>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollingRailMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_VerticalScrollRailMode(value: ScrollingRailMode?): Unit {
      val fnPtr = _41495062_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_HorizontalScrollMode(): ScrollingScrollMode? {
      val fnPtr = _41495062_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollingScrollMode>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollingScrollMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun put_HorizontalScrollMode(value: ScrollingScrollMode?): Unit {
      val fnPtr = _41495062_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_VerticalScrollMode(): ScrollingScrollMode? {
      val fnPtr = _41495062_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollingScrollMode>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollingScrollMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun put_VerticalScrollMode(value: ScrollingScrollMode?): Unit {
      val fnPtr = _41495062_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_ComputedHorizontalScrollMode(): ScrollingScrollMode? {
      val fnPtr = _41495062_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollingScrollMode>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollingScrollMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun get_ComputedVerticalScrollMode(): ScrollingScrollMode? {
      val fnPtr = _41495062_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollingScrollMode>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollingScrollMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun get_ZoomChainMode(): ScrollingChainMode? {
      val fnPtr = _41495062_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollingChainMode>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollingChainMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun put_ZoomChainMode(value: ScrollingChainMode?): Unit {
      val fnPtr = _41495062_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun get_ZoomMode(): ScrollingZoomMode? {
      val fnPtr = _41495062_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollingZoomMode>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollingZoomMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun put_ZoomMode(value: ScrollingZoomMode?): Unit {
      val fnPtr = _41495062_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun get_IgnoredInputKinds(): ScrollingInputKinds? {
      val fnPtr = _41495062_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollingInputKinds>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollingInputKinds>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun put_IgnoredInputKinds(value: ScrollingInputKinds?): Unit {
      val fnPtr = _41495062_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun get_MinZoomFactor(): Double {
      val fnPtr = _41495062_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(37)
    public override fun put_MinZoomFactor(value: Double): Unit {
      val fnPtr = _41495062_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun get_MaxZoomFactor(): Double {
      val fnPtr = _41495062_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(39)
    public override fun put_MaxZoomFactor(value: Double): Unit {
      val fnPtr = _41495062_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun get_State(): ScrollingInteractionState? {
      val fnPtr = _41495062_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollingInteractionState>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollingInteractionState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(41)
    public override fun get_HorizontalScrollController(): IScrollController? {
      val fnPtr = _41495062_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IScrollController>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IScrollController>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(42)
    public override fun put_HorizontalScrollController(value: IScrollController?): Unit {
      val fnPtr = _41495062_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(43)
    public override fun get_VerticalScrollController(): IScrollController? {
      val fnPtr = _41495062_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IScrollController>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IScrollController>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(44)
    public override fun put_VerticalScrollController(value: IScrollController?): Unit {
      val fnPtr = _41495062_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(45)
    public override fun get_HorizontalAnchorRatio(): Double {
      val fnPtr = _41495062_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(46)
    public override fun put_HorizontalAnchorRatio(value: Double): Unit {
      val fnPtr = _41495062_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(47)
    public override fun get_VerticalAnchorRatio(): Double {
      val fnPtr = _41495062_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(48)
    public override fun put_VerticalAnchorRatio(value: Double): Unit {
      val fnPtr = _41495062_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(49)
    public override fun get_HorizontalSnapPoints(): IVector<ScrollSnapPointBase?>? {
      val fnPtr = _41495062_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<ScrollSnapPointBase?>>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<ScrollSnapPointBase?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(50)
    public override fun get_VerticalSnapPoints(): IVector<ScrollSnapPointBase?>? {
      val fnPtr = _41495062_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<ScrollSnapPointBase?>>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<ScrollSnapPointBase?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(51)
    public override fun get_ZoomSnapPoints(): IVector<ZoomSnapPointBase?>? {
      val fnPtr = _41495062_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<ZoomSnapPointBase?>>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<ZoomSnapPointBase?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(52)
    public override fun ScrollTo(horizontalOffset: Double, verticalOffset: Double): Int {
      val fnPtr = _41495062_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, horizontalOffset, verticalOffset, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(53)
    public override fun ScrollTo(
      horizontalOffset: Double,
      verticalOffset: Double,
      options: ScrollingScrollOptions?
    ): Int {
      val fnPtr = _41495062_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, horizontalOffset, verticalOffset,
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(54)
    public override fun ScrollBy(horizontalOffsetDelta: Double, verticalOffsetDelta: Double): Int {
      val fnPtr = _41495062_VtblPtr!!.getPointer(60L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, horizontalOffsetDelta, verticalOffsetDelta,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(55)
    public override fun ScrollBy(
      horizontalOffsetDelta: Double,
      verticalOffsetDelta: Double,
      options: ScrollingScrollOptions?
    ): Int {
      val fnPtr = _41495062_VtblPtr!!.getPointer(61L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, horizontalOffsetDelta, verticalOffsetDelta,
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(56)
    public override fun AddScrollVelocity(offsetsVelocity: Vector2?,
        inertiaDecayRate: IReference<Vector2?>?): Int {
      val fnPtr = _41495062_VtblPtr!!.getPointer(62L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(offsetsVelocity),
          marshalToNative(inertiaDecayRate), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(57)
    public override fun ZoomTo(zoomFactor: Float, centerPoint: IReference<Vector2?>?): Int {
      val fnPtr = _41495062_VtblPtr!!.getPointer(63L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, zoomFactor, marshalToNative(centerPoint),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(58)
    public override fun ZoomTo(
      zoomFactor: Float,
      centerPoint: IReference<Vector2?>?,
      options: ScrollingZoomOptions?
    ): Int {
      val fnPtr = _41495062_VtblPtr!!.getPointer(64L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, zoomFactor, marshalToNative(centerPoint),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(59)
    public override fun ZoomBy(zoomFactorDelta: Float, centerPoint: IReference<Vector2?>?): Int {
      val fnPtr = _41495062_VtblPtr!!.getPointer(65L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, zoomFactorDelta, marshalToNative(centerPoint),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(60)
    public override fun ZoomBy(
      zoomFactorDelta: Float,
      centerPoint: IReference<Vector2?>?,
      options: ScrollingZoomOptions?
    ): Int {
      val fnPtr = _41495062_VtblPtr!!.getPointer(66L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, zoomFactorDelta, marshalToNative(centerPoint),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(61)
    public override fun AddZoomVelocity(
      zoomFactorVelocity: Float,
      centerPoint: IReference<Vector2?>?,
      inertiaDecayRate: IReference<Float>?
    ): Int {
      val fnPtr = _41495062_VtblPtr!!.getPointer(67L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, zoomFactorVelocity, marshalToNative(centerPoint),
          marshalToNative(inertiaDecayRate), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(62)
    public override fun add_ExtentChanged(handler: TypedEventHandler<ScrollPresenter?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _41495062_VtblPtr!!.getPointer(68L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(63)
    public override fun remove_ExtentChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _41495062_VtblPtr!!.getPointer(69L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(64)
    public override fun add_StateChanged(handler: TypedEventHandler<ScrollPresenter?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _41495062_VtblPtr!!.getPointer(70L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(65)
    public override fun remove_StateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _41495062_VtblPtr!!.getPointer(71L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(66)
    public override fun add_ViewChanged(handler: TypedEventHandler<ScrollPresenter?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _41495062_VtblPtr!!.getPointer(72L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(67)
    public override fun remove_ViewChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _41495062_VtblPtr!!.getPointer(73L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(68)
    public override fun add_ScrollAnimationStarting(handler: TypedEventHandler<ScrollPresenter?,
        ScrollingScrollAnimationStartingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _41495062_VtblPtr!!.getPointer(74L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(69)
    public override fun remove_ScrollAnimationStarting(token: EventRegistrationToken?): Unit {
      val fnPtr = _41495062_VtblPtr!!.getPointer(75L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(70)
    public override fun add_ZoomAnimationStarting(handler: TypedEventHandler<ScrollPresenter?,
        ScrollingZoomAnimationStartingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _41495062_VtblPtr!!.getPointer(76L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(71)
    public override fun remove_ZoomAnimationStarting(token: EventRegistrationToken?): Unit {
      val fnPtr = _41495062_VtblPtr!!.getPointer(77L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(72)
    public override fun add_ScrollCompleted(handler: TypedEventHandler<ScrollPresenter?,
        ScrollingScrollCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _41495062_VtblPtr!!.getPointer(78L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(73)
    public override fun remove_ScrollCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _41495062_VtblPtr!!.getPointer(79L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(74)
    public override fun add_ZoomCompleted(handler: TypedEventHandler<ScrollPresenter?,
        ScrollingZoomCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _41495062_VtblPtr!!.getPointer(80L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(75)
    public override fun remove_ZoomCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _41495062_VtblPtr!!.getPointer(81L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(76)
    public override fun add_BringingIntoView(handler: TypedEventHandler<ScrollPresenter?,
        ScrollingBringingIntoViewEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _41495062_VtblPtr!!.getPointer(82L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(77)
    public override fun remove_BringingIntoView(token: EventRegistrationToken?): Unit {
      val fnPtr = _41495062_VtblPtr!!.getPointer(83L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(78)
    public override fun add_AnchorRequested(handler: TypedEventHandler<ScrollPresenter?,
        ScrollingAnchorRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _41495062_VtblPtr!!.getPointer(84L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(79)
    public override fun remove_AnchorRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _41495062_VtblPtr!!.getPointer(85L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__41495062_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IScrollPresenter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __41495062_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollPresenter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("424b8afdf7aa5e5b9d0b5f0ea4e1a56e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollPresenter(ptr: Pointer?): WithDefault = IScrollPresenter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollPresenter {
      val address = segment.toRawLongValue()
      return makeIScrollPresenter(Pointer(address))
    }

    public override fun toNative(obj: IScrollPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__41495062_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollPresenter): Array<IScrollPresenter?> = (elements as
        Array<IScrollPresenter?>).castToImpl<IScrollPresenter,IScrollPresenter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollPresenter?> =
        arrayOfNulls<IScrollPresenter_Impl>(size) as Array<IScrollPresenter?>
  }
}
