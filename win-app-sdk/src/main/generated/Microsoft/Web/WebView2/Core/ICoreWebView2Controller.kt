package Microsoft.Web.WebView2.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Rect
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

@ABIMarker(ICoreWebView2Controller.ABI::class)
@Signature("{a588121c-53bf-590e-80e5-29d729cbd743}")
@Guid("a588121c53bf590e80e529d729cbd743")
@WinRTInterface("a588121c53bf590e80e529d729cbd743")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2Controller.ByReference::class)
public interface ICoreWebView2Controller : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsVisible(): Boolean

  @InterfaceMethod(1)
  public fun put_IsVisible(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_Bounds(): Rect?

  @InterfaceMethod(3)
  public fun put_Bounds(value: Rect?): Unit

  @InterfaceMethod(4)
  public fun get_ZoomFactor(): Double

  @InterfaceMethod(5)
  public fun put_ZoomFactor(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_ParentWindow(): CoreWebView2ControllerWindowReference?

  @InterfaceMethod(7)
  public fun put_ParentWindow(value: CoreWebView2ControllerWindowReference?): Unit

  @InterfaceMethod(8)
  public fun get_CoreWebView2(): CoreWebView2?

  @InterfaceMethod(9)
  public fun add_ZoomFactorChanged(handler: TypedEventHandler<CoreWebView2Controller?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_ZoomFactorChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun add_MoveFocusRequested(handler: TypedEventHandler<CoreWebView2Controller?,
      CoreWebView2MoveFocusRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_MoveFocusRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(13)
  public fun add_GotFocus(handler: TypedEventHandler<CoreWebView2Controller?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(14)
  public fun remove_GotFocus(token: EventRegistrationToken?): Unit

  @InterfaceMethod(15)
  public fun add_LostFocus(handler: TypedEventHandler<CoreWebView2Controller?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(16)
  public fun remove_LostFocus(token: EventRegistrationToken?): Unit

  @InterfaceMethod(17)
  public fun add_AcceleratorKeyPressed(handler: TypedEventHandler<CoreWebView2Controller?,
      CoreWebView2AcceleratorKeyPressedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(18)
  public fun remove_AcceleratorKeyPressed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(19)
  public fun SetBoundsAndZoomFactor(Bounds: Rect?, ZoomFactor: Double): Unit

  @InterfaceMethod(20)
  public fun MoveFocus(reason: CoreWebView2MoveFocusReason?): Unit

  @InterfaceMethod(21)
  public fun NotifyParentWindowPositionChanged(): Unit

  @InterfaceMethod(22)
  public fun Close(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2Controller> {
    public override fun getValue() = ABI.makeICoreWebView2Controller(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2Controller_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2Controller {
    public val __515242307_Ptr: Pointer?

    public val _515242307_VtblPtr: Pointer?
      get() = __515242307_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsVisible(): Boolean {
      val fnPtr = _515242307_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__515242307_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsVisible(value: Boolean): Unit {
      val fnPtr = _515242307_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__515242307_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Bounds(): Rect? {
      val fnPtr = _515242307_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__515242307_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Bounds(value: Rect?): Unit {
      val fnPtr = _515242307_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__515242307_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ZoomFactor(): Double {
      val fnPtr = _515242307_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__515242307_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_ZoomFactor(value: Double): Unit {
      val fnPtr = _515242307_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__515242307_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ParentWindow(): CoreWebView2ControllerWindowReference? {
      val fnPtr = _515242307_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2ControllerWindowReference>()
      val hr = fn.invokeHR(arrayOf(__515242307_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2ControllerWindowReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_ParentWindow(value: CoreWebView2ControllerWindowReference?): Unit {
      val fnPtr = _515242307_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__515242307_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_CoreWebView2(): CoreWebView2? {
      val fnPtr = _515242307_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2>()
      val hr = fn.invokeHR(arrayOf(__515242307_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun add_ZoomFactorChanged(handler: TypedEventHandler<CoreWebView2Controller?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _515242307_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__515242307_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_ZoomFactorChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _515242307_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__515242307_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun add_MoveFocusRequested(handler: TypedEventHandler<CoreWebView2Controller?,
        CoreWebView2MoveFocusRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _515242307_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__515242307_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_MoveFocusRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _515242307_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__515242307_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun add_GotFocus(handler: TypedEventHandler<CoreWebView2Controller?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _515242307_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__515242307_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun remove_GotFocus(token: EventRegistrationToken?): Unit {
      val fnPtr = _515242307_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__515242307_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun add_LostFocus(handler: TypedEventHandler<CoreWebView2Controller?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _515242307_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__515242307_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun remove_LostFocus(token: EventRegistrationToken?): Unit {
      val fnPtr = _515242307_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__515242307_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override
        fun add_AcceleratorKeyPressed(handler: TypedEventHandler<CoreWebView2Controller?,
        CoreWebView2AcceleratorKeyPressedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _515242307_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__515242307_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun remove_AcceleratorKeyPressed(token: EventRegistrationToken?): Unit {
      val fnPtr = _515242307_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__515242307_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun SetBoundsAndZoomFactor(Bounds: Rect?, ZoomFactor: Double): Unit {
      val fnPtr = _515242307_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__515242307_Ptr, marshalToNative(Bounds), ZoomFactor,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun MoveFocus(reason: CoreWebView2MoveFocusReason?): Unit {
      val fnPtr = _515242307_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__515242307_Ptr, marshalToNative(reason),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun NotifyParentWindowPositionChanged(): Unit {
      val fnPtr = _515242307_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__515242307_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun Close(): Unit {
      val fnPtr = _515242307_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__515242307_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2Controller_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __515242307_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2Controller, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a588121c53bf590e80e529d729cbd743")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2Controller(ptr: Pointer?): WithDefault =
        ICoreWebView2Controller_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2Controller {
      val address = segment.toRawLongValue()
      return makeICoreWebView2Controller(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2Controller): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__515242307_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2Controller): Array<ICoreWebView2Controller?>
        = (elements as
        Array<ICoreWebView2Controller?>).castToImpl<ICoreWebView2Controller,ICoreWebView2Controller_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2Controller?> =
        arrayOfNulls<ICoreWebView2Controller_Impl>(size) as Array<ICoreWebView2Controller?>
  }
}
