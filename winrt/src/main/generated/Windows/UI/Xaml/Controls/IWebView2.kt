package Windows.UI.Xaml.Controls

import Windows.ApplicationModel.DataTransfer.DataPackage
import Windows.Foundation.Collections.IIterable
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import Windows.Foundation.Uri
import Windows.Storage.Streams.IRandomAccessStream
import Windows.UI.Color
import Windows.UI.Xaml.FocusState
import Windows.Web.Http.HttpRequestMessage
import Windows.Web.IUriToStreamResolver
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebView2.ABI::class)
@Signature("{d481759e-3eff-4462-823d-fd52f9ba4cc8}")
@Guid("d481759e3eff4462823dfd52f9ba4cc8")
@WinRTInterface("d481759e3eff4462823dfd52f9ba4cc8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebView2.ByReference::class)
public interface IWebView2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanGoBack(): Boolean

  @InterfaceMethod(1)
  public fun get_CanGoForward(): Boolean

  @InterfaceMethod(2)
  public fun get_DocumentTitle(): String?

  @InterfaceMethod(3)
  public fun add_NavigationStarting(handler: TypedEventHandler<WebView?,
      WebViewNavigationStartingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_NavigationStarting(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun add_ContentLoading(handler: TypedEventHandler<WebView?,
      WebViewContentLoadingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_ContentLoading(token: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public fun add_DOMContentLoaded(handler: TypedEventHandler<WebView?,
      WebViewDOMContentLoadedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_DOMContentLoaded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(9)
  public fun GoForward(): Unit

  @InterfaceMethod(10)
  public fun GoBack(): Unit

  @InterfaceMethod(11)
  public fun Refresh(): Unit

  @InterfaceMethod(12)
  public fun Stop(): Unit

  @InterfaceMethod(13)
  public fun CapturePreviewToStreamAsync(stream: IRandomAccessStream?): IAsyncAction?

  @InterfaceMethod(14)
  public fun InvokeScriptAsync(scriptName: String?, arguments: IIterable<String?>?):
      IAsyncOperation<String?>?

  @InterfaceMethod(15)
  public fun CaptureSelectedContentToDataPackageAsync(): IAsyncOperation<DataPackage?>?

  @InterfaceMethod(16)
  public fun NavigateToLocalStreamUri(source: Uri?, streamResolver: IUriToStreamResolver?): Unit

  @InterfaceMethod(17)
  public fun BuildLocalStreamUri(contentIdentifier: String?, relativePath: String?): Uri?

  @InterfaceMethod(18)
  public fun get_DefaultBackgroundColor(): Color?

  @InterfaceMethod(19)
  public fun put_DefaultBackgroundColor(value: Color?): Unit

  @InterfaceMethod(20)
  public fun add_NavigationCompleted(handler: TypedEventHandler<WebView?,
      WebViewNavigationCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(21)
  public fun remove_NavigationCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(22)
  public fun add_FrameNavigationStarting(handler: TypedEventHandler<WebView?,
      WebViewNavigationStartingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(23)
  public fun remove_FrameNavigationStarting(token: EventRegistrationToken?): Unit

  @InterfaceMethod(24)
  public fun add_FrameContentLoading(handler: TypedEventHandler<WebView?,
      WebViewContentLoadingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(25)
  public fun remove_FrameContentLoading(token: EventRegistrationToken?): Unit

  @InterfaceMethod(26)
  public fun add_FrameDOMContentLoaded(handler: TypedEventHandler<WebView?,
      WebViewDOMContentLoadedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(27)
  public fun remove_FrameDOMContentLoaded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(28)
  public fun add_FrameNavigationCompleted(handler: TypedEventHandler<WebView?,
      WebViewNavigationCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(29)
  public fun remove_FrameNavigationCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(30)
  public fun add_LongRunningScriptDetected(handler: TypedEventHandler<WebView?,
      WebViewLongRunningScriptDetectedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(31)
  public fun remove_LongRunningScriptDetected(token: EventRegistrationToken?): Unit

  @InterfaceMethod(32)
  public fun add_UnsafeContentWarningDisplaying(handler: TypedEventHandler<WebView?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(33)
  public fun remove_UnsafeContentWarningDisplaying(token: EventRegistrationToken?): Unit

  @InterfaceMethod(34)
  public fun add_UnviewableContentIdentified(handler: TypedEventHandler<WebView?,
      WebViewUnviewableContentIdentifiedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(35)
  public fun remove_UnviewableContentIdentified(token: EventRegistrationToken?): Unit

  @InterfaceMethod(36)
  public fun NavigateWithHttpRequestMessage(requestMessage: HttpRequestMessage?): Unit

  @InterfaceMethod(37)
  public fun Focus(value: FocusState?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IWebView2> {
    public override fun getValue() = ABI.makeIWebView2(pointer.getPointer(0))

    public fun setValue(value: IWebView2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebView2 {
    public val __1215835307_Ptr: Pointer?

    public val _1215835307_VtblPtr: Pointer?
      get() = __1215835307_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanGoBack(): Boolean {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_CanGoForward(): Boolean {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_DocumentTitle(): String? {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun add_NavigationStarting(handler: TypedEventHandler<WebView?,
        WebViewNavigationStartingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_NavigationStarting(token: EventRegistrationToken?): Unit {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_ContentLoading(handler: TypedEventHandler<WebView?,
        WebViewContentLoadingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_ContentLoading(token: EventRegistrationToken?): Unit {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun add_DOMContentLoaded(handler: TypedEventHandler<WebView?,
        WebViewDOMContentLoadedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_DOMContentLoaded(token: EventRegistrationToken?): Unit {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun GoForward(): Unit {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun GoBack(): Unit {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun Refresh(): Unit {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun Stop(): Unit {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun CapturePreviewToStreamAsync(stream: IRandomAccessStream?): IAsyncAction? {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, marshalToNative(stream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun InvokeScriptAsync(scriptName: String?, arguments: IIterable<String?>?):
        IAsyncOperation<String?>? {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, marshalToNative(scriptName),
          marshalToNative(arguments), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun CaptureSelectedContentToDataPackageAsync(): IAsyncOperation<DataPackage?>? {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DataPackage?>>()
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DataPackage?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun NavigateToLocalStreamUri(source: Uri?,
        streamResolver: IUriToStreamResolver?): Unit {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, marshalToNative(source),
          marshalToNative(streamResolver),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun BuildLocalStreamUri(contentIdentifier: String?, relativePath: String?):
        Uri? {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, marshalToNative(contentIdentifier),
          marshalToNative(relativePath), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_DefaultBackgroundColor(): Color? {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_DefaultBackgroundColor(value: Color?): Unit {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun add_NavigationCompleted(handler: TypedEventHandler<WebView?,
        WebViewNavigationCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun remove_NavigationCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun add_FrameNavigationStarting(handler: TypedEventHandler<WebView?,
        WebViewNavigationStartingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun remove_FrameNavigationStarting(token: EventRegistrationToken?): Unit {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun add_FrameContentLoading(handler: TypedEventHandler<WebView?,
        WebViewContentLoadingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun remove_FrameContentLoading(token: EventRegistrationToken?): Unit {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun add_FrameDOMContentLoaded(handler: TypedEventHandler<WebView?,
        WebViewDOMContentLoadedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun remove_FrameDOMContentLoaded(token: EventRegistrationToken?): Unit {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun add_FrameNavigationCompleted(handler: TypedEventHandler<WebView?,
        WebViewNavigationCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun remove_FrameNavigationCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun add_LongRunningScriptDetected(handler: TypedEventHandler<WebView?,
        WebViewLongRunningScriptDetectedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun remove_LongRunningScriptDetected(token: EventRegistrationToken?): Unit {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun add_UnsafeContentWarningDisplaying(handler: TypedEventHandler<WebView?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun remove_UnsafeContentWarningDisplaying(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun add_UnviewableContentIdentified(handler: TypedEventHandler<WebView?,
        WebViewUnviewableContentIdentifiedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun remove_UnviewableContentIdentified(token: EventRegistrationToken?): Unit {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun NavigateWithHttpRequestMessage(requestMessage: HttpRequestMessage?): Unit {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, marshalToNative(requestMessage),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(37)
    public override fun Focus(value: FocusState?): Boolean {
      val fnPtr = _1215835307_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1215835307_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IWebView2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1215835307_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebView2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d481759e3eff4462823dfd52f9ba4cc8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebView2(ptr: Pointer?): WithDefault = IWebView2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebView2 {
      val address = segment.toRawLongValue()
      return makeIWebView2(Pointer(address))
    }

    public override fun toNative(obj: IWebView2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1215835307_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebView2): Array<IWebView2?> = (elements as
        Array<IWebView2?>).castToImpl<IWebView2,IWebView2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebView2?> = arrayOfNulls<IWebView2_Impl>(size)
        as Array<IWebView2?>
  }
}
