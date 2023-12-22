package Microsoft.UI.Xaml.Controls

import Microsoft.Web.WebView2.Core.CoreWebView2
import Microsoft.Web.WebView2.Core.CoreWebView2NavigationCompletedEventArgs
import Microsoft.Web.WebView2.Core.CoreWebView2NavigationStartingEventArgs
import Microsoft.Web.WebView2.Core.CoreWebView2ProcessFailedEventArgs
import Microsoft.Web.WebView2.Core.CoreWebView2WebMessageReceivedEventArgs
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import Windows.Foundation.Uri
import Windows.UI.Color
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebView2.ABI::class)
@Signature("{2b2c76c2-997c-5069-a8f0-9b84cd7e624b}")
@Guid("2b2c76c2997c5069a8f09b84cd7e624b")
@WinRTInterface("2b2c76c2997c5069a8f09b84cd7e624b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebView2.ByReference::class)
public interface IWebView2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CoreWebView2(): CoreWebView2?

  @InterfaceMethod(1)
  public fun EnsureCoreWebView2Async(): IAsyncAction?

  @InterfaceMethod(2)
  public fun ExecuteScriptAsync(javascriptCode: String?): IAsyncOperation<String?>?

  @InterfaceMethod(3)
  public fun get_Source(): Uri?

  @InterfaceMethod(4)
  public fun put_Source(value: Uri?): Unit

  @InterfaceMethod(5)
  public fun get_CanGoForward(): Boolean

  @InterfaceMethod(6)
  public fun put_CanGoForward(value: Boolean): Unit

  @InterfaceMethod(7)
  public fun get_CanGoBack(): Boolean

  @InterfaceMethod(8)
  public fun put_CanGoBack(value: Boolean): Unit

  @InterfaceMethod(9)
  public fun get_DefaultBackgroundColor(): Color?

  @InterfaceMethod(10)
  public fun put_DefaultBackgroundColor(value: Color?): Unit

  @InterfaceMethod(11)
  public fun Reload(): Unit

  @InterfaceMethod(12)
  public fun GoForward(): Unit

  @InterfaceMethod(13)
  public fun GoBack(): Unit

  @InterfaceMethod(14)
  public fun NavigateToString(htmlContent: String?): Unit

  @InterfaceMethod(15)
  public fun Close(): Unit

  @InterfaceMethod(16)
  public fun add_NavigationCompleted(handler: TypedEventHandler<WebView2?,
      CoreWebView2NavigationCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(17)
  public fun remove_NavigationCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(18)
  public fun add_WebMessageReceived(handler: TypedEventHandler<WebView2?,
      CoreWebView2WebMessageReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(19)
  public fun remove_WebMessageReceived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(20)
  public fun add_NavigationStarting(handler: TypedEventHandler<WebView2?,
      CoreWebView2NavigationStartingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(21)
  public fun remove_NavigationStarting(token: EventRegistrationToken?): Unit

  @InterfaceMethod(22)
  public fun add_CoreProcessFailed(handler: TypedEventHandler<WebView2?,
      CoreWebView2ProcessFailedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(23)
  public fun remove_CoreProcessFailed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(24)
  public fun add_CoreWebView2Initialized(handler: TypedEventHandler<WebView2?,
      CoreWebView2InitializedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(25)
  public fun remove_CoreWebView2Initialized(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IWebView2> {
    public override fun getValue() = ABI.makeIWebView2(pointer.getPointer(0))

    public fun setValue(value: IWebView2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebView2 {
    public val __1022989824_Ptr: Pointer?

    public val _1022989824_VtblPtr: Pointer?
      get() = __1022989824_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CoreWebView2(): CoreWebView2? {
      val fnPtr = _1022989824_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2>()
      val hr = fn.invokeHR(arrayOf(__1022989824_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun EnsureCoreWebView2Async(): IAsyncAction? {
      val fnPtr = _1022989824_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1022989824_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ExecuteScriptAsync(javascriptCode: String?): IAsyncOperation<String?>? {
      val fnPtr = _1022989824_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__1022989824_Ptr, marshalToNative(javascriptCode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Source(): Uri? {
      val fnPtr = _1022989824_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1022989824_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_Source(value: Uri?): Unit {
      val fnPtr = _1022989824_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1022989824_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_CanGoForward(): Boolean {
      val fnPtr = _1022989824_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1022989824_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_CanGoForward(value: Boolean): Unit {
      val fnPtr = _1022989824_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1022989824_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_CanGoBack(): Boolean {
      val fnPtr = _1022989824_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1022989824_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_CanGoBack(value: Boolean): Unit {
      val fnPtr = _1022989824_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1022989824_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_DefaultBackgroundColor(): Color? {
      val fnPtr = _1022989824_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__1022989824_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_DefaultBackgroundColor(value: Color?): Unit {
      val fnPtr = _1022989824_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1022989824_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun Reload(): Unit {
      val fnPtr = _1022989824_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1022989824_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun GoForward(): Unit {
      val fnPtr = _1022989824_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1022989824_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun GoBack(): Unit {
      val fnPtr = _1022989824_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1022989824_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun NavigateToString(htmlContent: String?): Unit {
      val fnPtr = _1022989824_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1022989824_Ptr, marshalToNative(htmlContent),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun Close(): Unit {
      val fnPtr = _1022989824_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1022989824_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun add_NavigationCompleted(handler: TypedEventHandler<WebView2?,
        CoreWebView2NavigationCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1022989824_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1022989824_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun remove_NavigationCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _1022989824_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1022989824_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun add_WebMessageReceived(handler: TypedEventHandler<WebView2?,
        CoreWebView2WebMessageReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1022989824_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1022989824_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun remove_WebMessageReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _1022989824_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1022989824_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun add_NavigationStarting(handler: TypedEventHandler<WebView2?,
        CoreWebView2NavigationStartingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1022989824_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1022989824_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun remove_NavigationStarting(token: EventRegistrationToken?): Unit {
      val fnPtr = _1022989824_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1022989824_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun add_CoreProcessFailed(handler: TypedEventHandler<WebView2?,
        CoreWebView2ProcessFailedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1022989824_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1022989824_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun remove_CoreProcessFailed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1022989824_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1022989824_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun add_CoreWebView2Initialized(handler: TypedEventHandler<WebView2?,
        CoreWebView2InitializedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1022989824_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1022989824_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun remove_CoreWebView2Initialized(token: EventRegistrationToken?): Unit {
      val fnPtr = _1022989824_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1022989824_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebView2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1022989824_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebView2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2b2c76c2997c5069a8f09b84cd7e624b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebView2(ptr: Pointer?): WithDefault = IWebView2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebView2 {
      val address = segment.toRawLongValue()
      return makeIWebView2(Pointer(address))
    }

    public override fun toNative(obj: IWebView2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1022989824_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebView2): Array<IWebView2?> = (elements as
        Array<IWebView2?>).castToImpl<IWebView2,IWebView2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebView2?> = arrayOfNulls<IWebView2_Impl>(size)
        as Array<IWebView2?>
  }
}
