package Windows.Web.UI.Interop

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

@ABIMarker(IWebViewControlSite.ABI::class)
@Signature("{133f47c6-12dc-4898-bd47-04967de648ba}")
@Guid("133f47c612dc4898bd4704967de648ba")
@WinRTInterface("133f47c612dc4898bd4704967de648ba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewControlSite.ByReference::class)
public interface IWebViewControlSite : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Process(): WebViewControlProcess?

  @InterfaceMethod(1)
  public fun put_Scale(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_Scale(): Double

  @InterfaceMethod(3)
  public fun put_Bounds(value: Rect?): Unit

  @InterfaceMethod(4)
  public fun get_Bounds(): Rect?

  @InterfaceMethod(5)
  public fun put_IsVisible(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_IsVisible(): Boolean

  @InterfaceMethod(7)
  public fun Close(): Unit

  @InterfaceMethod(8)
  public fun MoveFocus(reason: WebViewControlMoveFocusReason?): Unit

  @InterfaceMethod(9)
  public fun add_MoveFocusRequested(handler: TypedEventHandler<WebViewControl?,
      WebViewControlMoveFocusRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_MoveFocusRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun add_AcceleratorKeyPressed(handler: TypedEventHandler<WebViewControl?,
      WebViewControlAcceleratorKeyPressedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_AcceleratorKeyPressed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewControlSite> {
    public override fun getValue() = ABI.makeIWebViewControlSite(pointer.getPointer(0))

    public fun setValue(value: IWebViewControlSite_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewControlSite {
    public val __1834777748_Ptr: Pointer?

    public val _1834777748_VtblPtr: Pointer?
      get() = __1834777748_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Process(): WebViewControlProcess? {
      val fnPtr = _1834777748_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebViewControlProcess>()
      val hr = fn.invokeHR(arrayOf(__1834777748_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebViewControlProcess>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Scale(value: Double): Unit {
      val fnPtr = _1834777748_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834777748_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Scale(): Double {
      val fnPtr = _1834777748_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1834777748_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Bounds(value: Rect?): Unit {
      val fnPtr = _1834777748_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834777748_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Bounds(): Rect? {
      val fnPtr = _1834777748_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1834777748_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_IsVisible(value: Boolean): Unit {
      val fnPtr = _1834777748_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834777748_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IsVisible(): Boolean {
      val fnPtr = _1834777748_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1834777748_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun Close(): Unit {
      val fnPtr = _1834777748_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834777748_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun MoveFocus(reason: WebViewControlMoveFocusReason?): Unit {
      val fnPtr = _1834777748_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834777748_Ptr, marshalToNative(reason),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun add_MoveFocusRequested(handler: TypedEventHandler<WebViewControl?,
        WebViewControlMoveFocusRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1834777748_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1834777748_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_MoveFocusRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1834777748_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834777748_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun add_AcceleratorKeyPressed(handler: TypedEventHandler<WebViewControl?,
        WebViewControlAcceleratorKeyPressedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1834777748_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1834777748_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_AcceleratorKeyPressed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1834777748_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1834777748_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebViewControlSite_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1834777748_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewControlSite, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("133f47c612dc4898bd4704967de648ba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewControlSite(ptr: Pointer?): WithDefault = IWebViewControlSite_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebViewControlSite {
      val address = segment.toRawLongValue()
      return makeIWebViewControlSite(Pointer(address))
    }

    public override fun toNative(obj: IWebViewControlSite): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1834777748_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewControlSite): Array<IWebViewControlSite?> =
        (elements as
        Array<IWebViewControlSite?>).castToImpl<IWebViewControlSite,IWebViewControlSite_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewControlSite?> =
        arrayOfNulls<IWebViewControlSite_Impl>(size) as Array<IWebViewControlSite?>
  }
}
