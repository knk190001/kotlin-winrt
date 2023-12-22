package Windows.UI.Input

import Windows.Foundation.Collections.IVector
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Point
import Windows.Foundation.TypedEventHandler
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
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGestureRecognizer.ABI::class)
@Signature("{b47a37bf-3d6b-4f88-83e8-6dcb4012ffb0}")
@Guid("b47a37bf3d6b4f8883e86dcb4012ffb0")
@WinRTInterface("b47a37bf3d6b4f8883e86dcb4012ffb0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGestureRecognizer.ByReference::class)
public interface IGestureRecognizer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_GestureSettings(): GestureSettings?

  @InterfaceMethod(1)
  public fun put_GestureSettings(value: GestureSettings?): Unit

  @InterfaceMethod(2)
  public fun get_IsInertial(): Boolean

  @InterfaceMethod(3)
  public fun get_IsActive(): Boolean

  @InterfaceMethod(4)
  public fun get_ShowGestureFeedback(): Boolean

  @InterfaceMethod(5)
  public fun put_ShowGestureFeedback(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_PivotCenter(): Point?

  @InterfaceMethod(7)
  public fun put_PivotCenter(value: Point?): Unit

  @InterfaceMethod(8)
  public fun get_PivotRadius(): Float

  @InterfaceMethod(9)
  public fun put_PivotRadius(value: Float): Unit

  @InterfaceMethod(10)
  public fun get_InertiaTranslationDeceleration(): Float

  @InterfaceMethod(11)
  public fun put_InertiaTranslationDeceleration(value: Float): Unit

  @InterfaceMethod(12)
  public fun get_InertiaRotationDeceleration(): Float

  @InterfaceMethod(13)
  public fun put_InertiaRotationDeceleration(value: Float): Unit

  @InterfaceMethod(14)
  public fun get_InertiaExpansionDeceleration(): Float

  @InterfaceMethod(15)
  public fun put_InertiaExpansionDeceleration(value: Float): Unit

  @InterfaceMethod(16)
  public fun get_InertiaTranslationDisplacement(): Float

  @InterfaceMethod(17)
  public fun put_InertiaTranslationDisplacement(value: Float): Unit

  @InterfaceMethod(18)
  public fun get_InertiaRotationAngle(): Float

  @InterfaceMethod(19)
  public fun put_InertiaRotationAngle(value: Float): Unit

  @InterfaceMethod(20)
  public fun get_InertiaExpansion(): Float

  @InterfaceMethod(21)
  public fun put_InertiaExpansion(value: Float): Unit

  @InterfaceMethod(22)
  public fun get_ManipulationExact(): Boolean

  @InterfaceMethod(23)
  public fun put_ManipulationExact(value: Boolean): Unit

  @InterfaceMethod(24)
  public fun get_CrossSlideThresholds(): CrossSlideThresholds?

  @InterfaceMethod(25)
  public fun put_CrossSlideThresholds(value: CrossSlideThresholds?): Unit

  @InterfaceMethod(26)
  public fun get_CrossSlideHorizontally(): Boolean

  @InterfaceMethod(27)
  public fun put_CrossSlideHorizontally(value: Boolean): Unit

  @InterfaceMethod(28)
  public fun get_CrossSlideExact(): Boolean

  @InterfaceMethod(29)
  public fun put_CrossSlideExact(value: Boolean): Unit

  @InterfaceMethod(30)
  public fun get_AutoProcessInertia(): Boolean

  @InterfaceMethod(31)
  public fun put_AutoProcessInertia(value: Boolean): Unit

  @InterfaceMethod(32)
  public fun get_MouseWheelParameters(): MouseWheelParameters?

  @InterfaceMethod(33)
  public fun CanBeDoubleTap(value: PointerPoint?): Boolean

  @InterfaceMethod(34)
  public fun ProcessDownEvent(value: PointerPoint?): Unit

  @InterfaceMethod(35)
  public fun ProcessMoveEvents(value: IVector<PointerPoint?>?): Unit

  @InterfaceMethod(36)
  public fun ProcessUpEvent(value: PointerPoint?): Unit

  @InterfaceMethod(37)
  public fun ProcessMouseWheelEvent(
    value: PointerPoint?,
    isShiftKeyDown: Boolean,
    isControlKeyDown: Boolean
  ): Unit

  @InterfaceMethod(38)
  public fun ProcessInertia(): Unit

  @InterfaceMethod(39)
  public fun CompleteGesture(): Unit

  @InterfaceMethod(40)
  public fun add_Tapped(handler: TypedEventHandler<GestureRecognizer?, TappedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(41)
  public fun remove_Tapped(token: EventRegistrationToken?): Unit

  @InterfaceMethod(42)
  public fun add_RightTapped(handler: TypedEventHandler<GestureRecognizer?,
      RightTappedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(43)
  public fun remove_RightTapped(token: EventRegistrationToken?): Unit

  @InterfaceMethod(44)
  public fun add_Holding(handler: TypedEventHandler<GestureRecognizer?, HoldingEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(45)
  public fun remove_Holding(token: EventRegistrationToken?): Unit

  @InterfaceMethod(46)
  public fun add_Dragging(handler: TypedEventHandler<GestureRecognizer?, DraggingEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(47)
  public fun remove_Dragging(token: EventRegistrationToken?): Unit

  @InterfaceMethod(48)
  public fun add_ManipulationStarted(handler: TypedEventHandler<GestureRecognizer?,
      ManipulationStartedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(49)
  public fun remove_ManipulationStarted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(50)
  public fun add_ManipulationUpdated(handler: TypedEventHandler<GestureRecognizer?,
      ManipulationUpdatedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(51)
  public fun remove_ManipulationUpdated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(52)
  public fun add_ManipulationInertiaStarting(handler: TypedEventHandler<GestureRecognizer?,
      ManipulationInertiaStartingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(53)
  public fun remove_ManipulationInertiaStarting(token: EventRegistrationToken?): Unit

  @InterfaceMethod(54)
  public fun add_ManipulationCompleted(handler: TypedEventHandler<GestureRecognizer?,
      ManipulationCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(55)
  public fun remove_ManipulationCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(56)
  public fun add_CrossSliding(handler: TypedEventHandler<GestureRecognizer?,
      CrossSlidingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(57)
  public fun remove_CrossSliding(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGestureRecognizer> {
    public override fun getValue() = ABI.makeIGestureRecognizer(pointer.getPointer(0))

    public fun setValue(value: IGestureRecognizer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGestureRecognizer {
    public val __156099775_Ptr: Pointer?

    public val _156099775_VtblPtr: Pointer?
      get() = __156099775_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_GestureSettings(): GestureSettings? {
      val fnPtr = _156099775_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GestureSettings>()
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GestureSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_GestureSettings(value: GestureSettings?): Unit {
      val fnPtr = _156099775_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsInertial(): Boolean {
      val fnPtr = _156099775_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsActive(): Boolean {
      val fnPtr = _156099775_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_ShowGestureFeedback(): Boolean {
      val fnPtr = _156099775_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_ShowGestureFeedback(value: Boolean): Unit {
      val fnPtr = _156099775_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_PivotCenter(): Point? {
      val fnPtr = _156099775_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_PivotCenter(value: Point?): Unit {
      val fnPtr = _156099775_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_PivotRadius(): Float {
      val fnPtr = _156099775_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_PivotRadius(value: Float): Unit {
      val fnPtr = _156099775_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_InertiaTranslationDeceleration(): Float {
      val fnPtr = _156099775_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_InertiaTranslationDeceleration(value: Float): Unit {
      val fnPtr = _156099775_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_InertiaRotationDeceleration(): Float {
      val fnPtr = _156099775_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_InertiaRotationDeceleration(value: Float): Unit {
      val fnPtr = _156099775_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_InertiaExpansionDeceleration(): Float {
      val fnPtr = _156099775_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_InertiaExpansionDeceleration(value: Float): Unit {
      val fnPtr = _156099775_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_InertiaTranslationDisplacement(): Float {
      val fnPtr = _156099775_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_InertiaTranslationDisplacement(value: Float): Unit {
      val fnPtr = _156099775_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_InertiaRotationAngle(): Float {
      val fnPtr = _156099775_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_InertiaRotationAngle(value: Float): Unit {
      val fnPtr = _156099775_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_InertiaExpansion(): Float {
      val fnPtr = _156099775_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun put_InertiaExpansion(value: Float): Unit {
      val fnPtr = _156099775_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_ManipulationExact(): Boolean {
      val fnPtr = _156099775_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(23)
    public override fun put_ManipulationExact(value: Boolean): Unit {
      val fnPtr = _156099775_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_CrossSlideThresholds(): CrossSlideThresholds? {
      val fnPtr = _156099775_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CrossSlideThresholds>()
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CrossSlideThresholds>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun put_CrossSlideThresholds(value: CrossSlideThresholds?): Unit {
      val fnPtr = _156099775_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_CrossSlideHorizontally(): Boolean {
      val fnPtr = _156099775_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(27)
    public override fun put_CrossSlideHorizontally(value: Boolean): Unit {
      val fnPtr = _156099775_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_CrossSlideExact(): Boolean {
      val fnPtr = _156099775_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(29)
    public override fun put_CrossSlideExact(value: Boolean): Unit {
      val fnPtr = _156099775_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_AutoProcessInertia(): Boolean {
      val fnPtr = _156099775_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(31)
    public override fun put_AutoProcessInertia(value: Boolean): Unit {
      val fnPtr = _156099775_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun get_MouseWheelParameters(): MouseWheelParameters? {
      val fnPtr = _156099775_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MouseWheelParameters>()
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MouseWheelParameters>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun CanBeDoubleTap(value: PointerPoint?): Boolean {
      val fnPtr = _156099775_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(34)
    public override fun ProcessDownEvent(value: PointerPoint?): Unit {
      val fnPtr = _156099775_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(35)
    public override fun ProcessMoveEvents(value: IVector<PointerPoint?>?): Unit {
      val fnPtr = _156099775_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun ProcessUpEvent(value: PointerPoint?): Unit {
      val fnPtr = _156099775_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(37)
    public override fun ProcessMouseWheelEvent(
      value: PointerPoint?,
      isShiftKeyDown: Boolean,
      isControlKeyDown: Boolean
    ): Unit {
      val fnPtr = _156099775_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, marshalToNative(value), isShiftKeyDown,
          isControlKeyDown,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun ProcessInertia(): Unit {
      val fnPtr = _156099775_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(39)
    public override fun CompleteGesture(): Unit {
      val fnPtr = _156099775_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun add_Tapped(handler: TypedEventHandler<GestureRecognizer?,
        TappedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _156099775_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(41)
    public override fun remove_Tapped(token: EventRegistrationToken?): Unit {
      val fnPtr = _156099775_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(42)
    public override fun add_RightTapped(handler: TypedEventHandler<GestureRecognizer?,
        RightTappedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _156099775_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(43)
    public override fun remove_RightTapped(token: EventRegistrationToken?): Unit {
      val fnPtr = _156099775_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(44)
    public override fun add_Holding(handler: TypedEventHandler<GestureRecognizer?,
        HoldingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _156099775_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(45)
    public override fun remove_Holding(token: EventRegistrationToken?): Unit {
      val fnPtr = _156099775_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(46)
    public override fun add_Dragging(handler: TypedEventHandler<GestureRecognizer?,
        DraggingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _156099775_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(47)
    public override fun remove_Dragging(token: EventRegistrationToken?): Unit {
      val fnPtr = _156099775_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(48)
    public override fun add_ManipulationStarted(handler: TypedEventHandler<GestureRecognizer?,
        ManipulationStartedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _156099775_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(49)
    public override fun remove_ManipulationStarted(token: EventRegistrationToken?): Unit {
      val fnPtr = _156099775_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(50)
    public override fun add_ManipulationUpdated(handler: TypedEventHandler<GestureRecognizer?,
        ManipulationUpdatedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _156099775_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(51)
    public override fun remove_ManipulationUpdated(token: EventRegistrationToken?): Unit {
      val fnPtr = _156099775_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(52)
    public override
        fun add_ManipulationInertiaStarting(handler: TypedEventHandler<GestureRecognizer?,
        ManipulationInertiaStartingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _156099775_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(53)
    public override fun remove_ManipulationInertiaStarting(token: EventRegistrationToken?): Unit {
      val fnPtr = _156099775_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(54)
    public override fun add_ManipulationCompleted(handler: TypedEventHandler<GestureRecognizer?,
        ManipulationCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _156099775_VtblPtr!!.getPointer(60L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(55)
    public override fun remove_ManipulationCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _156099775_VtblPtr!!.getPointer(61L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(56)
    public override fun add_CrossSliding(handler: TypedEventHandler<GestureRecognizer?,
        CrossSlidingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _156099775_VtblPtr!!.getPointer(62L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(57)
    public override fun remove_CrossSliding(token: EventRegistrationToken?): Unit {
      val fnPtr = _156099775_VtblPtr!!.getPointer(63L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156099775_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGestureRecognizer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __156099775_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGestureRecognizer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b47a37bf3d6b4f8883e86dcb4012ffb0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGestureRecognizer(ptr: Pointer?): WithDefault = IGestureRecognizer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGestureRecognizer {
      val address = segment.toRawLongValue()
      return makeIGestureRecognizer(Pointer(address))
    }

    public override fun toNative(obj: IGestureRecognizer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__156099775_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGestureRecognizer): Array<IGestureRecognizer?> =
        (elements as
        Array<IGestureRecognizer?>).castToImpl<IGestureRecognizer,IGestureRecognizer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGestureRecognizer?> =
        arrayOfNulls<IGestureRecognizer_Impl>(size) as Array<IGestureRecognizer?>
  }
}
