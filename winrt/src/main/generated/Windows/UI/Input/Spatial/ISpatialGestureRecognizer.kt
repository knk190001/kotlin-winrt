package Windows.UI.Input.Spatial

import Windows.Foundation.EventRegistrationToken
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpatialGestureRecognizer.ABI::class)
@Signature("{71605bcc-0c35-4673-adbd-cc04caa6ef45}")
@Guid("71605bcc0c354673adbdcc04caa6ef45")
@WinRTInterface("71605bcc0c354673adbdcc04caa6ef45")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialGestureRecognizer.ByReference::class)
public interface ISpatialGestureRecognizer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_RecognitionStarted(handler: TypedEventHandler<SpatialGestureRecognizer?,
      SpatialRecognitionStartedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_RecognitionStarted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_RecognitionEnded(handler: TypedEventHandler<SpatialGestureRecognizer?,
      SpatialRecognitionEndedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_RecognitionEnded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_Tapped(handler: TypedEventHandler<SpatialGestureRecognizer?,
      SpatialTappedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_Tapped(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_HoldStarted(handler: TypedEventHandler<SpatialGestureRecognizer?,
      SpatialHoldStartedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_HoldStarted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_HoldCompleted(handler: TypedEventHandler<SpatialGestureRecognizer?,
      SpatialHoldCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_HoldCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun add_HoldCanceled(handler: TypedEventHandler<SpatialGestureRecognizer?,
      SpatialHoldCanceledEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_HoldCanceled(token: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public fun add_ManipulationStarted(handler: TypedEventHandler<SpatialGestureRecognizer?,
      SpatialManipulationStartedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_ManipulationStarted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(14)
  public fun add_ManipulationUpdated(handler: TypedEventHandler<SpatialGestureRecognizer?,
      SpatialManipulationUpdatedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(15)
  public fun remove_ManipulationUpdated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(16)
  public fun add_ManipulationCompleted(handler: TypedEventHandler<SpatialGestureRecognizer?,
      SpatialManipulationCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(17)
  public fun remove_ManipulationCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(18)
  public fun add_ManipulationCanceled(handler: TypedEventHandler<SpatialGestureRecognizer?,
      SpatialManipulationCanceledEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(19)
  public fun remove_ManipulationCanceled(token: EventRegistrationToken?): Unit

  @InterfaceMethod(20)
  public fun add_NavigationStarted(handler: TypedEventHandler<SpatialGestureRecognizer?,
      SpatialNavigationStartedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(21)
  public fun remove_NavigationStarted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(22)
  public fun add_NavigationUpdated(handler: TypedEventHandler<SpatialGestureRecognizer?,
      SpatialNavigationUpdatedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(23)
  public fun remove_NavigationUpdated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(24)
  public fun add_NavigationCompleted(handler: TypedEventHandler<SpatialGestureRecognizer?,
      SpatialNavigationCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(25)
  public fun remove_NavigationCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(26)
  public fun add_NavigationCanceled(handler: TypedEventHandler<SpatialGestureRecognizer?,
      SpatialNavigationCanceledEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(27)
  public fun remove_NavigationCanceled(token: EventRegistrationToken?): Unit

  @InterfaceMethod(28)
  public fun CaptureInteraction(interaction: SpatialInteraction?): Unit

  @InterfaceMethod(29)
  public fun CancelPendingGestures(): Unit

  @InterfaceMethod(30)
  public fun TrySetGestureSettings(settings: SpatialGestureSettings?): Boolean

  @InterfaceMethod(31)
  public fun get_GestureSettings(): SpatialGestureSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialGestureRecognizer> {
    public override fun getValue() = ABI.makeISpatialGestureRecognizer(pointer.getPointer(0))

    public fun setValue(value: ISpatialGestureRecognizer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialGestureRecognizer {
    public val __985673921_Ptr: Pointer?

    public val _985673921_VtblPtr: Pointer?
      get() = __985673921_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_RecognitionStarted(handler: TypedEventHandler<SpatialGestureRecognizer?,
        SpatialRecognitionStartedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _985673921_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_RecognitionStarted(token: EventRegistrationToken?): Unit {
      val fnPtr = _985673921_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_RecognitionEnded(handler: TypedEventHandler<SpatialGestureRecognizer?,
        SpatialRecognitionEndedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _985673921_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_RecognitionEnded(token: EventRegistrationToken?): Unit {
      val fnPtr = _985673921_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_Tapped(handler: TypedEventHandler<SpatialGestureRecognizer?,
        SpatialTappedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _985673921_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_Tapped(token: EventRegistrationToken?): Unit {
      val fnPtr = _985673921_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_HoldStarted(handler: TypedEventHandler<SpatialGestureRecognizer?,
        SpatialHoldStartedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _985673921_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_HoldStarted(token: EventRegistrationToken?): Unit {
      val fnPtr = _985673921_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_HoldCompleted(handler: TypedEventHandler<SpatialGestureRecognizer?,
        SpatialHoldCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _985673921_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_HoldCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _985673921_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun add_HoldCanceled(handler: TypedEventHandler<SpatialGestureRecognizer?,
        SpatialHoldCanceledEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _985673921_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_HoldCanceled(token: EventRegistrationToken?): Unit {
      val fnPtr = _985673921_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override
        fun add_ManipulationStarted(handler: TypedEventHandler<SpatialGestureRecognizer?,
        SpatialManipulationStartedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _985673921_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_ManipulationStarted(token: EventRegistrationToken?): Unit {
      val fnPtr = _985673921_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override
        fun add_ManipulationUpdated(handler: TypedEventHandler<SpatialGestureRecognizer?,
        SpatialManipulationUpdatedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _985673921_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun remove_ManipulationUpdated(token: EventRegistrationToken?): Unit {
      val fnPtr = _985673921_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override
        fun add_ManipulationCompleted(handler: TypedEventHandler<SpatialGestureRecognizer?,
        SpatialManipulationCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _985673921_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun remove_ManipulationCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _985673921_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override
        fun add_ManipulationCanceled(handler: TypedEventHandler<SpatialGestureRecognizer?,
        SpatialManipulationCanceledEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _985673921_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun remove_ManipulationCanceled(token: EventRegistrationToken?): Unit {
      val fnPtr = _985673921_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun add_NavigationStarted(handler: TypedEventHandler<SpatialGestureRecognizer?,
        SpatialNavigationStartedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _985673921_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun remove_NavigationStarted(token: EventRegistrationToken?): Unit {
      val fnPtr = _985673921_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun add_NavigationUpdated(handler: TypedEventHandler<SpatialGestureRecognizer?,
        SpatialNavigationUpdatedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _985673921_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun remove_NavigationUpdated(token: EventRegistrationToken?): Unit {
      val fnPtr = _985673921_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override
        fun add_NavigationCompleted(handler: TypedEventHandler<SpatialGestureRecognizer?,
        SpatialNavigationCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _985673921_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun remove_NavigationCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _985673921_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun add_NavigationCanceled(handler: TypedEventHandler<SpatialGestureRecognizer?,
        SpatialNavigationCanceledEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _985673921_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun remove_NavigationCanceled(token: EventRegistrationToken?): Unit {
      val fnPtr = _985673921_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun CaptureInteraction(interaction: SpatialInteraction?): Unit {
      val fnPtr = _985673921_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, marshalToNative(interaction),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(29)
    public override fun CancelPendingGestures(): Unit {
      val fnPtr = _985673921_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun TrySetGestureSettings(settings: SpatialGestureSettings?): Boolean {
      val fnPtr = _985673921_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr, marshalToNative(settings), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(31)
    public override fun get_GestureSettings(): SpatialGestureSettings? {
      val fnPtr = _985673921_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialGestureSettings>()
      val hr = fn.invokeHR(arrayOf(__985673921_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialGestureSettings>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialGestureRecognizer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __985673921_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialGestureRecognizer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("71605bcc0c354673adbdcc04caa6ef45")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialGestureRecognizer(ptr: Pointer?): WithDefault =
        ISpatialGestureRecognizer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialGestureRecognizer {
      val address = segment.toRawLongValue()
      return makeISpatialGestureRecognizer(Pointer(address))
    }

    public override fun toNative(obj: ISpatialGestureRecognizer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__985673921_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialGestureRecognizer):
        Array<ISpatialGestureRecognizer?> = (elements as
        Array<ISpatialGestureRecognizer?>).castToImpl<ISpatialGestureRecognizer,ISpatialGestureRecognizer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialGestureRecognizer?> =
        arrayOfNulls<ISpatialGestureRecognizer_Impl>(size) as Array<ISpatialGestureRecognizer?>
  }
}
