package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.LightDismissOverlayMode
import Microsoft.UI.Xaml.Media.Animation.TransitionCollection
import Microsoft.UI.Xaml.UIElement
import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(IPopup.ABI::class)
@Signature("{4e3ab19d-2f95-579c-9535-906c58629437}")
@Guid("4e3ab19d2f95579c9535906c58629437")
@WinRTInterface("4e3ab19d2f95579c9535906c58629437")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPopup.ByReference::class)
public interface IPopup : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Child(): UIElement?

  @InterfaceMethod(1)
  public fun put_Child(value: UIElement?): Unit

  @InterfaceMethod(2)
  public fun get_IsOpen(): Boolean

  @InterfaceMethod(3)
  public fun put_IsOpen(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_HorizontalOffset(): Double

  @InterfaceMethod(5)
  public fun put_HorizontalOffset(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_VerticalOffset(): Double

  @InterfaceMethod(7)
  public fun put_VerticalOffset(value: Double): Unit

  @InterfaceMethod(8)
  public fun get_ChildTransitions(): TransitionCollection?

  @InterfaceMethod(9)
  public fun put_ChildTransitions(value: TransitionCollection?): Unit

  @InterfaceMethod(10)
  public fun get_IsLightDismissEnabled(): Boolean

  @InterfaceMethod(11)
  public fun put_IsLightDismissEnabled(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_LightDismissOverlayMode(): LightDismissOverlayMode?

  @InterfaceMethod(13)
  public fun put_LightDismissOverlayMode(value: LightDismissOverlayMode?): Unit

  @InterfaceMethod(14)
  public fun get_ShouldConstrainToRootBounds(): Boolean

  @InterfaceMethod(15)
  public fun put_ShouldConstrainToRootBounds(value: Boolean): Unit

  @InterfaceMethod(16)
  public fun get_IsConstrainedToRootBounds(): Boolean

  @InterfaceMethod(17)
  public fun add_Opened(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(18)
  public fun remove_Opened(token: EventRegistrationToken?): Unit

  @InterfaceMethod(19)
  public fun add_Closed(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(20)
  public fun remove_Closed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPopup> {
    public override fun getValue() = ABI.makeIPopup(pointer.getPointer(0))

    public fun setValue(value: IPopup_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPopup {
    public val __823118587_Ptr: Pointer?

    public val _823118587_VtblPtr: Pointer?
      get() = __823118587_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Child(): UIElement? {
      val fnPtr = _823118587_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__823118587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Child(value: UIElement?): Unit {
      val fnPtr = _823118587_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__823118587_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsOpen(): Boolean {
      val fnPtr = _823118587_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__823118587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsOpen(value: Boolean): Unit {
      val fnPtr = _823118587_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__823118587_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_HorizontalOffset(): Double {
      val fnPtr = _823118587_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__823118587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_HorizontalOffset(value: Double): Unit {
      val fnPtr = _823118587_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__823118587_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_VerticalOffset(): Double {
      val fnPtr = _823118587_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__823118587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_VerticalOffset(value: Double): Unit {
      val fnPtr = _823118587_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__823118587_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_ChildTransitions(): TransitionCollection? {
      val fnPtr = _823118587_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TransitionCollection>()
      val hr = fn.invokeHR(arrayOf(__823118587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TransitionCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_ChildTransitions(value: TransitionCollection?): Unit {
      val fnPtr = _823118587_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__823118587_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_IsLightDismissEnabled(): Boolean {
      val fnPtr = _823118587_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__823118587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_IsLightDismissEnabled(value: Boolean): Unit {
      val fnPtr = _823118587_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__823118587_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_LightDismissOverlayMode(): LightDismissOverlayMode? {
      val fnPtr = _823118587_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LightDismissOverlayMode>()
      val hr = fn.invokeHR(arrayOf(__823118587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LightDismissOverlayMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_LightDismissOverlayMode(value: LightDismissOverlayMode?): Unit {
      val fnPtr = _823118587_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__823118587_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_ShouldConstrainToRootBounds(): Boolean {
      val fnPtr = _823118587_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__823118587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_ShouldConstrainToRootBounds(value: Boolean): Unit {
      val fnPtr = _823118587_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__823118587_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_IsConstrainedToRootBounds(): Boolean {
      val fnPtr = _823118587_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__823118587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun add_Opened(handler: EventHandler<IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _823118587_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__823118587_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun remove_Opened(token: EventRegistrationToken?): Unit {
      val fnPtr = _823118587_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__823118587_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun add_Closed(handler: EventHandler<IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _823118587_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__823118587_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun remove_Closed(token: EventRegistrationToken?): Unit {
      val fnPtr = _823118587_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__823118587_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPopup_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __823118587_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPopup, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4e3ab19d2f95579c9535906c58629437")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPopup(ptr: Pointer?): WithDefault = IPopup_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPopup {
      val address = segment.toRawLongValue()
      return makeIPopup(Pointer(address))
    }

    public override fun toNative(obj: IPopup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__823118587_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPopup): Array<IPopup?> = (elements as
        Array<IPopup?>).castToImpl<IPopup,IPopup_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPopup?> = arrayOfNulls<IPopup_Impl>(size) as
        Array<IPopup?>
  }
}
