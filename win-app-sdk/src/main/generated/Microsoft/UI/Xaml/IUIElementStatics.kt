package Microsoft.UI.Xaml

import Microsoft.UI.Xaml.Input.Pointer
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
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUIElementStatics.ABI::class)
@Signature("{d2921d87-3584-5e22-8a3a-c2c78dab4f6e}")
@Guid("d2921d8735845e228a3ac2c78dab4f6e")
@WinRTInterface("d2921d8735845e228a3ac2c78dab4f6e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUIElementStatics.ByReference::class)
public interface IUIElementStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KeyDownEvent(): RoutedEvent?

  @InterfaceMethod(1)
  public fun get_KeyUpEvent(): RoutedEvent?

  @InterfaceMethod(2)
  public fun get_PointerEnteredEvent(): RoutedEvent?

  @InterfaceMethod(3)
  public fun get_PointerPressedEvent(): RoutedEvent?

  @InterfaceMethod(4)
  public fun get_PointerMovedEvent(): RoutedEvent?

  @InterfaceMethod(5)
  public fun get_PointerReleasedEvent(): RoutedEvent?

  @InterfaceMethod(6)
  public fun get_PointerExitedEvent(): RoutedEvent?

  @InterfaceMethod(7)
  public fun get_PointerCaptureLostEvent(): RoutedEvent?

  @InterfaceMethod(8)
  public fun get_PointerCanceledEvent(): RoutedEvent?

  @InterfaceMethod(9)
  public fun get_PointerWheelChangedEvent(): RoutedEvent?

  @InterfaceMethod(10)
  public fun get_TappedEvent(): RoutedEvent?

  @InterfaceMethod(11)
  public fun get_DoubleTappedEvent(): RoutedEvent?

  @InterfaceMethod(12)
  public fun get_HoldingEvent(): RoutedEvent?

  @InterfaceMethod(13)
  public fun get_RightTappedEvent(): RoutedEvent?

  @InterfaceMethod(14)
  public fun get_ManipulationStartingEvent(): RoutedEvent?

  @InterfaceMethod(15)
  public fun get_ManipulationInertiaStartingEvent(): RoutedEvent?

  @InterfaceMethod(16)
  public fun get_ManipulationStartedEvent(): RoutedEvent?

  @InterfaceMethod(17)
  public fun get_ManipulationDeltaEvent(): RoutedEvent?

  @InterfaceMethod(18)
  public fun get_ManipulationCompletedEvent(): RoutedEvent?

  @InterfaceMethod(19)
  public fun get_DragEnterEvent(): RoutedEvent?

  @InterfaceMethod(20)
  public fun get_DragLeaveEvent(): RoutedEvent?

  @InterfaceMethod(21)
  public fun get_DragOverEvent(): RoutedEvent?

  @InterfaceMethod(22)
  public fun get_DropEvent(): RoutedEvent?

  @InterfaceMethod(23)
  public fun get_GettingFocusEvent(): RoutedEvent?

  @InterfaceMethod(24)
  public fun get_LosingFocusEvent(): RoutedEvent?

  @InterfaceMethod(25)
  public fun get_NoFocusCandidateFoundEvent(): RoutedEvent?

  @InterfaceMethod(26)
  public fun get_PreviewKeyDownEvent(): RoutedEvent?

  @InterfaceMethod(27)
  public fun get_CharacterReceivedEvent(): RoutedEvent?

  @InterfaceMethod(28)
  public fun get_PreviewKeyUpEvent(): RoutedEvent?

  @InterfaceMethod(29)
  public fun get_BringIntoViewRequestedEvent(): RoutedEvent?

  @InterfaceMethod(30)
  public fun get_ContextRequestedEvent(): RoutedEvent?

  @InterfaceMethod(31)
  public fun get_AllowDropProperty(): DependencyProperty?

  @InterfaceMethod(32)
  public fun get_OpacityProperty(): DependencyProperty?

  @InterfaceMethod(33)
  public fun get_ClipProperty(): DependencyProperty?

  @InterfaceMethod(34)
  public fun get_RenderTransformProperty(): DependencyProperty?

  @InterfaceMethod(35)
  public fun get_ProjectionProperty(): DependencyProperty?

  @InterfaceMethod(36)
  public fun get_Transform3DProperty(): DependencyProperty?

  @InterfaceMethod(37)
  public fun get_RenderTransformOriginProperty(): DependencyProperty?

  @InterfaceMethod(38)
  public fun get_IsHitTestVisibleProperty(): DependencyProperty?

  @InterfaceMethod(39)
  public fun get_VisibilityProperty(): DependencyProperty?

  @InterfaceMethod(40)
  public fun get_UseLayoutRoundingProperty(): DependencyProperty?

  @InterfaceMethod(41)
  public fun get_TransitionsProperty(): DependencyProperty?

  @InterfaceMethod(42)
  public fun get_CacheModeProperty(): DependencyProperty?

  @InterfaceMethod(43)
  public fun get_IsTapEnabledProperty(): DependencyProperty?

  @InterfaceMethod(44)
  public fun get_IsDoubleTapEnabledProperty(): DependencyProperty?

  @InterfaceMethod(45)
  public fun get_CanDragProperty(): DependencyProperty?

  @InterfaceMethod(46)
  public fun get_IsRightTapEnabledProperty(): DependencyProperty?

  @InterfaceMethod(47)
  public fun get_IsHoldingEnabledProperty(): DependencyProperty?

  @InterfaceMethod(48)
  public fun get_ManipulationModeProperty(): DependencyProperty?

  @InterfaceMethod(49)
  public fun get_PointerCapturesProperty(): DependencyProperty?

  @InterfaceMethod(50)
  public fun get_ContextFlyoutProperty(): DependencyProperty?

  @InterfaceMethod(51)
  public fun get_CompositeModeProperty(): DependencyProperty?

  @InterfaceMethod(52)
  public fun get_LightsProperty(): DependencyProperty?

  @InterfaceMethod(53)
  public fun get_CanBeScrollAnchorProperty(): DependencyProperty?

  @InterfaceMethod(54)
  public fun get_ExitDisplayModeOnAccessKeyInvokedProperty(): DependencyProperty?

  @InterfaceMethod(55)
  public fun get_IsAccessKeyScopeProperty(): DependencyProperty?

  @InterfaceMethod(56)
  public fun get_AccessKeyScopeOwnerProperty(): DependencyProperty?

  @InterfaceMethod(57)
  public fun get_AccessKeyProperty(): DependencyProperty?

  @InterfaceMethod(58)
  public fun get_KeyTipPlacementModeProperty(): DependencyProperty?

  @InterfaceMethod(59)
  public fun get_KeyTipHorizontalOffsetProperty(): DependencyProperty?

  @InterfaceMethod(60)
  public fun get_KeyTipVerticalOffsetProperty(): DependencyProperty?

  @InterfaceMethod(61)
  public fun get_KeyTipTargetProperty(): DependencyProperty?

  @InterfaceMethod(62)
  public fun get_XYFocusKeyboardNavigationProperty(): DependencyProperty?

  @InterfaceMethod(63)
  public fun get_XYFocusUpNavigationStrategyProperty(): DependencyProperty?

  @InterfaceMethod(64)
  public fun get_XYFocusDownNavigationStrategyProperty(): DependencyProperty?

  @InterfaceMethod(65)
  public fun get_XYFocusLeftNavigationStrategyProperty(): DependencyProperty?

  @InterfaceMethod(66)
  public fun get_XYFocusRightNavigationStrategyProperty(): DependencyProperty?

  @InterfaceMethod(67)
  public fun get_KeyboardAcceleratorPlacementTargetProperty(): DependencyProperty?

  @InterfaceMethod(68)
  public fun get_KeyboardAcceleratorPlacementModeProperty(): DependencyProperty?

  @InterfaceMethod(69)
  public fun get_HighContrastAdjustmentProperty(): DependencyProperty?

  @InterfaceMethod(70)
  public fun get_TabFocusNavigationProperty(): DependencyProperty?

  @InterfaceMethod(71)
  public fun get_ShadowProperty(): DependencyProperty?

  @InterfaceMethod(72)
  public fun get_FocusStateProperty(): DependencyProperty?

  @InterfaceMethod(73)
  public fun get_UseSystemFocusVisualsProperty(): DependencyProperty?

  @InterfaceMethod(74)
  public fun get_XYFocusLeftProperty(): DependencyProperty?

  @InterfaceMethod(75)
  public fun get_XYFocusRightProperty(): DependencyProperty?

  @InterfaceMethod(76)
  public fun get_XYFocusUpProperty(): DependencyProperty?

  @InterfaceMethod(77)
  public fun get_XYFocusDownProperty(): DependencyProperty?

  @InterfaceMethod(78)
  public fun get_IsTabStopProperty(): DependencyProperty?

  @InterfaceMethod(79)
  public fun get_TabIndexProperty(): DependencyProperty?

  @InterfaceMethod(80)
  public fun TryStartDirectManipulation(value: Pointer?): Boolean

  @InterfaceMethod(81)
  public fun RegisterAsScrollPort(element: UIElement?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUIElementStatics> {
    public override fun getValue() = ABI.makeIUIElementStatics(pointer.getPointer(0))

    public fun setValue(value: IUIElementStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIElementStatics {
    public val __748310780_Ptr: com.sun.jna.Pointer?

    public val _748310780_VtblPtr: com.sun.jna.Pointer?
      get() = __748310780_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeyDownEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_KeyUpEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PointerEnteredEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PointerPressedEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_PointerMovedEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_PointerReleasedEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_PointerExitedEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_PointerCaptureLostEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_PointerCanceledEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_PointerWheelChangedEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_TappedEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_DoubleTappedEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_HoldingEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_RightTappedEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_ManipulationStartingEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_ManipulationInertiaStartingEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_ManipulationStartedEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_ManipulationDeltaEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_ManipulationCompletedEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun get_DragEnterEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun get_DragLeaveEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun get_DragOverEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun get_DropEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun get_GettingFocusEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun get_LosingFocusEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun get_NoFocusCandidateFoundEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun get_PreviewKeyDownEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun get_CharacterReceivedEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun get_PreviewKeyUpEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun get_BringIntoViewRequestedEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun get_ContextRequestedEvent(): RoutedEvent? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun get_AllowDropProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun get_OpacityProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun get_ClipProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(34)
    public override fun get_RenderTransformProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun get_ProjectionProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(36)
    public override fun get_Transform3DProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun get_RenderTransformOriginProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(38)
    public override fun get_IsHitTestVisibleProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun get_VisibilityProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(40)
    public override fun get_UseLayoutRoundingProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(41)
    public override fun get_TransitionsProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(42)
    public override fun get_CacheModeProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(43)
    public override fun get_IsTapEnabledProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(44)
    public override fun get_IsDoubleTapEnabledProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(45)
    public override fun get_CanDragProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(46)
    public override fun get_IsRightTapEnabledProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(47)
    public override fun get_IsHoldingEnabledProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(48)
    public override fun get_ManipulationModeProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(49)
    public override fun get_PointerCapturesProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(50)
    public override fun get_ContextFlyoutProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(51)
    public override fun get_CompositeModeProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(52)
    public override fun get_LightsProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(53)
    public override fun get_CanBeScrollAnchorProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(54)
    public override fun get_ExitDisplayModeOnAccessKeyInvokedProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(60L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(55)
    public override fun get_IsAccessKeyScopeProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(61L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(56)
    public override fun get_AccessKeyScopeOwnerProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(62L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(57)
    public override fun get_AccessKeyProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(63L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(58)
    public override fun get_KeyTipPlacementModeProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(64L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(59)
    public override fun get_KeyTipHorizontalOffsetProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(65L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(60)
    public override fun get_KeyTipVerticalOffsetProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(66L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(61)
    public override fun get_KeyTipTargetProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(67L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(62)
    public override fun get_XYFocusKeyboardNavigationProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(68L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(63)
    public override fun get_XYFocusUpNavigationStrategyProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(69L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(64)
    public override fun get_XYFocusDownNavigationStrategyProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(70L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(65)
    public override fun get_XYFocusLeftNavigationStrategyProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(71L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(66)
    public override fun get_XYFocusRightNavigationStrategyProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(72L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(67)
    public override fun get_KeyboardAcceleratorPlacementTargetProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(73L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(68)
    public override fun get_KeyboardAcceleratorPlacementModeProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(74L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(69)
    public override fun get_HighContrastAdjustmentProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(75L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(70)
    public override fun get_TabFocusNavigationProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(76L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(71)
    public override fun get_ShadowProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(77L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(72)
    public override fun get_FocusStateProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(78L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(73)
    public override fun get_UseSystemFocusVisualsProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(79L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(74)
    public override fun get_XYFocusLeftProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(80L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(75)
    public override fun get_XYFocusRightProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(81L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(76)
    public override fun get_XYFocusUpProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(82L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(77)
    public override fun get_XYFocusDownProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(83L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(78)
    public override fun get_IsTabStopProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(84L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(79)
    public override fun get_TabIndexProperty(): DependencyProperty? {
      val fnPtr = _748310780_VtblPtr!!.getPointer(85L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(80)
    public override fun TryStartDirectManipulation(value: Pointer?): Boolean {
      val fnPtr = _748310780_VtblPtr!!.getPointer(86L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(81)
    public override fun RegisterAsScrollPort(element: UIElement?): Unit {
      val fnPtr = _748310780_VtblPtr!!.getPointer(87L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__748310780_Ptr, marshalToNative(element),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUIElementStatics_Impl(
    ptr: com.sun.jna.Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __748310780_Ptr: com.sun.jna.Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIElementStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d2921d8735845e228a3ac2c78dab4f6e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIElementStatics(ptr: com.sun.jna.Pointer?): WithDefault =
        IUIElementStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIElementStatics {
      val address = segment.toRawLongValue()
      return makeIUIElementStatics(com.sun.jna.Pointer(address))
    }

    public override fun toNative(obj: IUIElementStatics): MemoryAddress =
        MemoryAddress.ofLong(com.sun.jna.Pointer.nativeValue((obj as WithDefault).__748310780_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIElementStatics): Array<IUIElementStatics?> = (elements
        as Array<IUIElementStatics?>).castToImpl<IUIElementStatics,IUIElementStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIElementStatics?> =
        arrayOfNulls<IUIElementStatics_Impl>(size) as Array<IUIElementStatics?>
  }
}
