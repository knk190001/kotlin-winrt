package Windows.UI.Xaml

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

@ABIMarker(IUIElementStatics.ABI::class)
@Signature("{58d3573b-f52c-45be-988b-a5869564873c}")
@Guid("58d3573bf52c45be988ba5869564873c")
@WinRTInterface("58d3573bf52c45be988ba5869564873c")
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
  public fun get_AllowDropProperty(): DependencyProperty?

  @InterfaceMethod(24)
  public fun get_OpacityProperty(): DependencyProperty?

  @InterfaceMethod(25)
  public fun get_ClipProperty(): DependencyProperty?

  @InterfaceMethod(26)
  public fun get_RenderTransformProperty(): DependencyProperty?

  @InterfaceMethod(27)
  public fun get_ProjectionProperty(): DependencyProperty?

  @InterfaceMethod(28)
  public fun get_RenderTransformOriginProperty(): DependencyProperty?

  @InterfaceMethod(29)
  public fun get_IsHitTestVisibleProperty(): DependencyProperty?

  @InterfaceMethod(30)
  public fun get_VisibilityProperty(): DependencyProperty?

  @InterfaceMethod(31)
  public fun get_UseLayoutRoundingProperty(): DependencyProperty?

  @InterfaceMethod(32)
  public fun get_TransitionsProperty(): DependencyProperty?

  @InterfaceMethod(33)
  public fun get_CacheModeProperty(): DependencyProperty?

  @InterfaceMethod(34)
  public fun get_IsTapEnabledProperty(): DependencyProperty?

  @InterfaceMethod(35)
  public fun get_IsDoubleTapEnabledProperty(): DependencyProperty?

  @InterfaceMethod(36)
  public fun get_IsRightTapEnabledProperty(): DependencyProperty?

  @InterfaceMethod(37)
  public fun get_IsHoldingEnabledProperty(): DependencyProperty?

  @InterfaceMethod(38)
  public fun get_ManipulationModeProperty(): DependencyProperty?

  @InterfaceMethod(39)
  public fun get_PointerCapturesProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUIElementStatics> {
    public override fun getValue() = ABI.makeIUIElementStatics(pointer.getPointer(0))

    public fun setValue(value: IUIElementStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIElementStatics {
    public val __353847055_Ptr: Pointer?

    public val _353847055_VtblPtr: Pointer?
      get() = __353847055_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeyDownEvent(): RoutedEvent? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_KeyUpEvent(): RoutedEvent? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PointerEnteredEvent(): RoutedEvent? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PointerPressedEvent(): RoutedEvent? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_PointerMovedEvent(): RoutedEvent? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_PointerReleasedEvent(): RoutedEvent? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_PointerExitedEvent(): RoutedEvent? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_PointerCaptureLostEvent(): RoutedEvent? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_PointerCanceledEvent(): RoutedEvent? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_PointerWheelChangedEvent(): RoutedEvent? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_TappedEvent(): RoutedEvent? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_DoubleTappedEvent(): RoutedEvent? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_HoldingEvent(): RoutedEvent? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_RightTappedEvent(): RoutedEvent? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_ManipulationStartingEvent(): RoutedEvent? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_ManipulationInertiaStartingEvent(): RoutedEvent? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_ManipulationStartedEvent(): RoutedEvent? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_ManipulationDeltaEvent(): RoutedEvent? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_ManipulationCompletedEvent(): RoutedEvent? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun get_DragEnterEvent(): RoutedEvent? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun get_DragLeaveEvent(): RoutedEvent? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun get_DragOverEvent(): RoutedEvent? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun get_DropEvent(): RoutedEvent? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun get_AllowDropProperty(): DependencyProperty? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun get_OpacityProperty(): DependencyProperty? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun get_ClipProperty(): DependencyProperty? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun get_RenderTransformProperty(): DependencyProperty? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun get_ProjectionProperty(): DependencyProperty? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun get_RenderTransformOriginProperty(): DependencyProperty? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun get_IsHitTestVisibleProperty(): DependencyProperty? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun get_VisibilityProperty(): DependencyProperty? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun get_UseLayoutRoundingProperty(): DependencyProperty? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun get_TransitionsProperty(): DependencyProperty? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun get_CacheModeProperty(): DependencyProperty? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(34)
    public override fun get_IsTapEnabledProperty(): DependencyProperty? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun get_IsDoubleTapEnabledProperty(): DependencyProperty? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(36)
    public override fun get_IsRightTapEnabledProperty(): DependencyProperty? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun get_IsHoldingEnabledProperty(): DependencyProperty? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(38)
    public override fun get_ManipulationModeProperty(): DependencyProperty? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun get_PointerCapturesProperty(): DependencyProperty? {
      val fnPtr = _353847055_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__353847055_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IUIElementStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __353847055_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIElementStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("58d3573bf52c45be988ba5869564873c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIElementStatics(ptr: Pointer?): WithDefault = IUIElementStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIElementStatics {
      val address = segment.toRawLongValue()
      return makeIUIElementStatics(Pointer(address))
    }

    public override fun toNative(obj: IUIElementStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__353847055_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIElementStatics): Array<IUIElementStatics?> = (elements
        as Array<IUIElementStatics?>).castToImpl<IUIElementStatics,IUIElementStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIElementStatics?> =
        arrayOfNulls<IUIElementStatics_Impl>(size) as Array<IUIElementStatics?>
  }
}
