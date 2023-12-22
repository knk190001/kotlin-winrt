package Windows.UI.Input

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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRadialController.ABI::class)
@Signature("{3055d1c8-df51-43d4-b23b-0e1037467a09}")
@Guid("3055d1c8df5143d4b23b0e1037467a09")
@WinRTInterface("3055d1c8df5143d4b23b0e1037467a09")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadialController.ByReference::class)
public interface IRadialController : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Menu(): RadialControllerMenu?

  @InterfaceMethod(1)
  public fun get_RotationResolutionInDegrees(): Double

  @InterfaceMethod(2)
  public fun put_RotationResolutionInDegrees(value: Double): Unit

  @InterfaceMethod(3)
  public fun get_UseAutomaticHapticFeedback(): Boolean

  @InterfaceMethod(4)
  public fun put_UseAutomaticHapticFeedback(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun add_ScreenContactStarted(handler: TypedEventHandler<RadialController?,
      RadialControllerScreenContactStartedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_ScreenContactStarted(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public fun add_ScreenContactEnded(handler: TypedEventHandler<RadialController?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_ScreenContactEnded(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(9)
  public fun add_ScreenContactContinued(handler: TypedEventHandler<RadialController?,
      RadialControllerScreenContactContinuedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_ScreenContactContinued(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun add_ControlLost(handler: TypedEventHandler<RadialController?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_ControlLost(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(13)
  public fun add_RotationChanged(handler: TypedEventHandler<RadialController?,
      RadialControllerRotationChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(14)
  public fun remove_RotationChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(15)
  public fun add_ButtonClicked(handler: TypedEventHandler<RadialController?,
      RadialControllerButtonClickedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(16)
  public fun remove_ButtonClicked(token: EventRegistrationToken?): Unit

  @InterfaceMethod(17)
  public fun add_ControlAcquired(handler: TypedEventHandler<RadialController?,
      RadialControllerControlAcquiredEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(18)
  public fun remove_ControlAcquired(cookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadialController> {
    public override fun getValue() = ABI.makeIRadialController(pointer.getPointer(0))

    public fun setValue(value: IRadialController_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadialController {
    public val __987103255_Ptr: Pointer?

    public val _987103255_VtblPtr: Pointer?
      get() = __987103255_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Menu(): RadialControllerMenu? {
      val fnPtr = _987103255_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RadialControllerMenu>()
      val hr = fn.invokeHR(arrayOf(__987103255_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RadialControllerMenu>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RotationResolutionInDegrees(): Double {
      val fnPtr = _987103255_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__987103255_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_RotationResolutionInDegrees(value: Double): Unit {
      val fnPtr = _987103255_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__987103255_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_UseAutomaticHapticFeedback(): Boolean {
      val fnPtr = _987103255_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__987103255_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_UseAutomaticHapticFeedback(value: Boolean): Unit {
      val fnPtr = _987103255_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__987103255_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_ScreenContactStarted(handler: TypedEventHandler<RadialController?,
        RadialControllerScreenContactStartedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _987103255_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__987103255_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_ScreenContactStarted(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _987103255_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__987103255_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun add_ScreenContactEnded(handler: TypedEventHandler<RadialController?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _987103255_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__987103255_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_ScreenContactEnded(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _987103255_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__987103255_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun add_ScreenContactContinued(handler: TypedEventHandler<RadialController?,
        RadialControllerScreenContactContinuedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _987103255_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__987103255_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_ScreenContactContinued(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _987103255_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__987103255_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun add_ControlLost(handler: TypedEventHandler<RadialController?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _987103255_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__987103255_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_ControlLost(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _987103255_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__987103255_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun add_RotationChanged(handler: TypedEventHandler<RadialController?,
        RadialControllerRotationChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _987103255_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__987103255_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun remove_RotationChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _987103255_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__987103255_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun add_ButtonClicked(handler: TypedEventHandler<RadialController?,
        RadialControllerButtonClickedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _987103255_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__987103255_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun remove_ButtonClicked(token: EventRegistrationToken?): Unit {
      val fnPtr = _987103255_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__987103255_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun add_ControlAcquired(handler: TypedEventHandler<RadialController?,
        RadialControllerControlAcquiredEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _987103255_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__987103255_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun remove_ControlAcquired(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _987103255_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__987103255_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRadialController_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __987103255_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadialController, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3055d1c8df5143d4b23b0e1037467a09")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadialController(ptr: Pointer?): WithDefault = IRadialController_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRadialController {
      val address = segment.toRawLongValue()
      return makeIRadialController(Pointer(address))
    }

    public override fun toNative(obj: IRadialController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__987103255_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadialController): Array<IRadialController?> = (elements
        as Array<IRadialController?>).castToImpl<IRadialController,IRadialController_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadialController?> =
        arrayOfNulls<IRadialController_Impl>(size) as Array<IRadialController?>
  }
}
