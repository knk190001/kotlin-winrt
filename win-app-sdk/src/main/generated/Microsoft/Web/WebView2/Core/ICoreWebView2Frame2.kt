package Microsoft.Web.WebView2.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2Frame2.ABI::class)
@Signature("{33dbc9c9-a103-56e3-b722-363814200320}")
@Guid("33dbc9c9a10356e3b722363814200320")
@WinRTInterface("33dbc9c9a10356e3b722363814200320")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2Frame2.ByReference::class)
public interface ICoreWebView2Frame2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_NavigationStarting(handler: TypedEventHandler<CoreWebView2Frame?,
      CoreWebView2NavigationStartingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_NavigationStarting(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_ContentLoading(handler: TypedEventHandler<CoreWebView2Frame?,
      CoreWebView2ContentLoadingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_ContentLoading(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_NavigationCompleted(handler: TypedEventHandler<CoreWebView2Frame?,
      CoreWebView2NavigationCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_NavigationCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_DOMContentLoaded(handler: TypedEventHandler<CoreWebView2Frame?,
      CoreWebView2DOMContentLoadedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_DOMContentLoaded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_WebMessageReceived(handler: TypedEventHandler<CoreWebView2Frame?,
      CoreWebView2WebMessageReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_WebMessageReceived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun ExecuteScriptAsync(javaScript: String?): IAsyncOperation<String?>?

  @InterfaceMethod(11)
  public fun PostWebMessageAsJson(webMessageAsJson: String?): Unit

  @InterfaceMethod(12)
  public fun PostWebMessageAsString(webMessageAsString: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2Frame2> {
    public override fun getValue() = ABI.makeICoreWebView2Frame2(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2Frame2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2Frame2 {
    public val __29555316_Ptr: Pointer?

    public val _29555316_VtblPtr: Pointer?
      get() = __29555316_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_NavigationStarting(handler: TypedEventHandler<CoreWebView2Frame?,
        CoreWebView2NavigationStartingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _29555316_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__29555316_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_NavigationStarting(token: EventRegistrationToken?): Unit {
      val fnPtr = _29555316_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__29555316_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_ContentLoading(handler: TypedEventHandler<CoreWebView2Frame?,
        CoreWebView2ContentLoadingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _29555316_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__29555316_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_ContentLoading(token: EventRegistrationToken?): Unit {
      val fnPtr = _29555316_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__29555316_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_NavigationCompleted(handler: TypedEventHandler<CoreWebView2Frame?,
        CoreWebView2NavigationCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _29555316_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__29555316_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_NavigationCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _29555316_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__29555316_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_DOMContentLoaded(handler: TypedEventHandler<CoreWebView2Frame?,
        CoreWebView2DOMContentLoadedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _29555316_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__29555316_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_DOMContentLoaded(token: EventRegistrationToken?): Unit {
      val fnPtr = _29555316_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__29555316_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_WebMessageReceived(handler: TypedEventHandler<CoreWebView2Frame?,
        CoreWebView2WebMessageReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _29555316_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__29555316_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_WebMessageReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _29555316_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__29555316_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun ExecuteScriptAsync(javaScript: String?): IAsyncOperation<String?>? {
      val fnPtr = _29555316_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__29555316_Ptr, marshalToNative(javaScript), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun PostWebMessageAsJson(webMessageAsJson: String?): Unit {
      val fnPtr = _29555316_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__29555316_Ptr, marshalToNative(webMessageAsJson),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun PostWebMessageAsString(webMessageAsString: String?): Unit {
      val fnPtr = _29555316_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__29555316_Ptr, marshalToNative(webMessageAsString),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2Frame2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __29555316_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2Frame2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("33dbc9c9a10356e3b722363814200320")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2Frame2(ptr: Pointer?): WithDefault = ICoreWebView2Frame2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2Frame2 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2Frame2(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2Frame2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__29555316_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2Frame2): Array<ICoreWebView2Frame2?> =
        (elements as
        Array<ICoreWebView2Frame2?>).castToImpl<ICoreWebView2Frame2,ICoreWebView2Frame2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2Frame2?> =
        arrayOfNulls<ICoreWebView2Frame2_Impl>(size) as Array<ICoreWebView2Frame2?>
  }
}
