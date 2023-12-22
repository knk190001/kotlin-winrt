package Windows.Web.UI

import Windows.ApplicationModel.DataTransfer.DataPackage
import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import Windows.Foundation.Uri
import Windows.Storage.Streams.IRandomAccessStream
import Windows.UI.Color
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IWebViewControl.ABI::class)
@Signature("{3f921316-bc70-4bda-9136-c94370899fab}")
@Guid("3f921316bc704bda9136c94370899fab")
@WinRTInterface("3f921316bc704bda9136c94370899fab")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewControl.ByReference::class)
public interface IWebViewControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Source(): Uri?

  @InterfaceMethod(1)
  public fun put_Source(source: Uri?): Unit

  @InterfaceMethod(2)
  public fun get_DocumentTitle(): String?

  @InterfaceMethod(3)
  public fun get_CanGoBack(): Boolean

  @InterfaceMethod(4)
  public fun get_CanGoForward(): Boolean

  @InterfaceMethod(5)
  public fun put_DefaultBackgroundColor(value: Color?): Unit

  @InterfaceMethod(6)
  public fun get_DefaultBackgroundColor(): Color?

  @InterfaceMethod(7)
  public fun get_ContainsFullScreenElement(): Boolean

  @InterfaceMethod(8)
  public fun get_Settings(): WebViewControlSettings?

  @InterfaceMethod(9)
  public fun get_DeferredPermissionRequests():
      IVectorView<WebViewControlDeferredPermissionRequest?>?

  @InterfaceMethod(10)
  public fun GoForward(): Unit

  @InterfaceMethod(11)
  public fun GoBack(): Unit

  @InterfaceMethod(12)
  public fun Refresh(): Unit

  @InterfaceMethod(13)
  public fun Stop(): Unit

  @InterfaceMethod(14)
  public fun Navigate(source: Uri?): Unit

  @InterfaceMethod(15)
  public fun NavigateToString(text: String?): Unit

  @InterfaceMethod(16)
  public fun NavigateToLocalStreamUri(source: Uri?, streamResolver: IUriToStreamResolver?): Unit

  @InterfaceMethod(17)
  public fun NavigateWithHttpRequestMessage(requestMessage: HttpRequestMessage?): Unit

  @InterfaceMethod(18)
  public fun InvokeScriptAsync(scriptName: String?, arguments: IIterable<String?>?):
      IAsyncOperation<String?>?

  @InterfaceMethod(19)
  public fun CapturePreviewToStreamAsync(stream: IRandomAccessStream?): IAsyncAction?

  @InterfaceMethod(20)
  public fun CaptureSelectedContentToDataPackageAsync(): IAsyncOperation<DataPackage?>?

  @InterfaceMethod(21)
  public fun BuildLocalStreamUri(contentIdentifier: String?, relativePath: String?): Uri?

  @InterfaceMethod(22)
  public fun GetDeferredPermissionRequestById(id: WinDef.UINT,
      result: Windows.Web.UI.WebViewControlDeferredPermissionRequest.ByReference?): Unit

  @InterfaceMethod(23)
  public fun add_NavigationStarting(handler: TypedEventHandler<IWebViewControl?,
      WebViewControlNavigationStartingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(24)
  public fun remove_NavigationStarting(token: EventRegistrationToken?): Unit

  @InterfaceMethod(25)
  public fun add_ContentLoading(handler: TypedEventHandler<IWebViewControl?,
      WebViewControlContentLoadingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(26)
  public fun remove_ContentLoading(token: EventRegistrationToken?): Unit

  @InterfaceMethod(27)
  public fun add_DOMContentLoaded(handler: TypedEventHandler<IWebViewControl?,
      WebViewControlDOMContentLoadedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(28)
  public fun remove_DOMContentLoaded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(29)
  public fun add_NavigationCompleted(handler: TypedEventHandler<IWebViewControl?,
      WebViewControlNavigationCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(30)
  public fun remove_NavigationCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(31)
  public fun add_FrameNavigationStarting(handler: TypedEventHandler<IWebViewControl?,
      WebViewControlNavigationStartingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(32)
  public fun remove_FrameNavigationStarting(token: EventRegistrationToken?): Unit

  @InterfaceMethod(33)
  public fun add_FrameContentLoading(handler: TypedEventHandler<IWebViewControl?,
      WebViewControlContentLoadingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(34)
  public fun remove_FrameContentLoading(token: EventRegistrationToken?): Unit

  @InterfaceMethod(35)
  public fun add_FrameDOMContentLoaded(handler: TypedEventHandler<IWebViewControl?,
      WebViewControlDOMContentLoadedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(36)
  public fun remove_FrameDOMContentLoaded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(37)
  public fun add_FrameNavigationCompleted(handler: TypedEventHandler<IWebViewControl?,
      WebViewControlNavigationCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(38)
  public fun remove_FrameNavigationCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(39)
  public fun add_ScriptNotify(handler: TypedEventHandler<IWebViewControl?,
      WebViewControlScriptNotifyEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(40)
  public fun remove_ScriptNotify(token: EventRegistrationToken?): Unit

  @InterfaceMethod(41)
  public fun add_LongRunningScriptDetected(handler: TypedEventHandler<IWebViewControl?,
      WebViewControlLongRunningScriptDetectedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(42)
  public fun remove_LongRunningScriptDetected(token: EventRegistrationToken?): Unit

  @InterfaceMethod(43)
  public fun add_UnsafeContentWarningDisplaying(handler: TypedEventHandler<IWebViewControl?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(44)
  public fun remove_UnsafeContentWarningDisplaying(token: EventRegistrationToken?): Unit

  @InterfaceMethod(45)
  public fun add_UnviewableContentIdentified(handler: TypedEventHandler<IWebViewControl?,
      WebViewControlUnviewableContentIdentifiedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(46)
  public fun remove_UnviewableContentIdentified(token: EventRegistrationToken?): Unit

  @InterfaceMethod(47)
  public fun add_PermissionRequested(handler: TypedEventHandler<IWebViewControl?,
      WebViewControlPermissionRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(48)
  public fun remove_PermissionRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(49)
  public fun add_UnsupportedUriSchemeIdentified(handler: TypedEventHandler<IWebViewControl?,
      WebViewControlUnsupportedUriSchemeIdentifiedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(50)
  public fun remove_UnsupportedUriSchemeIdentified(token: EventRegistrationToken?): Unit

  @InterfaceMethod(51)
  public fun add_NewWindowRequested(handler: TypedEventHandler<IWebViewControl?,
      WebViewControlNewWindowRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(52)
  public fun remove_NewWindowRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(53)
  public fun add_ContainsFullScreenElementChanged(handler: TypedEventHandler<IWebViewControl?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(54)
  public fun remove_ContainsFullScreenElementChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(55)
  public fun add_WebResourceRequested(handler: TypedEventHandler<IWebViewControl?,
      WebViewControlWebResourceRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(56)
  public fun remove_WebResourceRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewControl> {
    public override fun getValue() = ABI.makeIWebViewControl(pointer.getPointer(0))

    public fun setValue(value: IWebViewControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewControl {
    public val __66234092_Ptr: Pointer?

    public val _66234092_VtblPtr: Pointer?
      get() = __66234092_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Source(): Uri? {
      val fnPtr = _66234092_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Source(source: Uri?): Unit {
      val fnPtr = _66234092_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(source),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DocumentTitle(): String? {
      val fnPtr = _66234092_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CanGoBack(): Boolean {
      val fnPtr = _66234092_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_CanGoForward(): Boolean {
      val fnPtr = _66234092_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_DefaultBackgroundColor(value: Color?): Unit {
      val fnPtr = _66234092_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_DefaultBackgroundColor(): Color? {
      val fnPtr = _66234092_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_ContainsFullScreenElement(): Boolean {
      val fnPtr = _66234092_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_Settings(): WebViewControlSettings? {
      val fnPtr = _66234092_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebViewControlSettings>()
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebViewControlSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_DeferredPermissionRequests():
        IVectorView<WebViewControlDeferredPermissionRequest?>? {
      val fnPtr = _66234092_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WebViewControlDeferredPermissionRequest?>>()
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<WebViewControlDeferredPermissionRequest?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun GoForward(): Unit {
      val fnPtr = _66234092_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun GoBack(): Unit {
      val fnPtr = _66234092_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun Refresh(): Unit {
      val fnPtr = _66234092_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun Stop(): Unit {
      val fnPtr = _66234092_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun Navigate(source: Uri?): Unit {
      val fnPtr = _66234092_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(source),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun NavigateToString(text: String?): Unit {
      val fnPtr = _66234092_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(text),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun NavigateToLocalStreamUri(source: Uri?,
        streamResolver: IUriToStreamResolver?): Unit {
      val fnPtr = _66234092_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(source),
          marshalToNative(streamResolver),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun NavigateWithHttpRequestMessage(requestMessage: HttpRequestMessage?): Unit {
      val fnPtr = _66234092_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(requestMessage),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun InvokeScriptAsync(scriptName: String?, arguments: IIterable<String?>?):
        IAsyncOperation<String?>? {
      val fnPtr = _66234092_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(scriptName),
          marshalToNative(arguments), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun CapturePreviewToStreamAsync(stream: IRandomAccessStream?): IAsyncAction? {
      val fnPtr = _66234092_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(stream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun CaptureSelectedContentToDataPackageAsync(): IAsyncOperation<DataPackage?>? {
      val fnPtr = _66234092_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DataPackage?>>()
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DataPackage?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun BuildLocalStreamUri(contentIdentifier: String?, relativePath: String?):
        Uri? {
      val fnPtr = _66234092_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(contentIdentifier),
          marshalToNative(relativePath), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun GetDeferredPermissionRequestById(id: WinDef.UINT,
        result: Windows.Web.UI.WebViewControlDeferredPermissionRequest.ByReference?): Unit {
      val fnPtr = _66234092_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, id, marshalToNative(result),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun add_NavigationStarting(handler: TypedEventHandler<IWebViewControl?,
        WebViewControlNavigationStartingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _66234092_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun remove_NavigationStarting(token: EventRegistrationToken?): Unit {
      val fnPtr = _66234092_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun add_ContentLoading(handler: TypedEventHandler<IWebViewControl?,
        WebViewControlContentLoadingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _66234092_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun remove_ContentLoading(token: EventRegistrationToken?): Unit {
      val fnPtr = _66234092_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun add_DOMContentLoaded(handler: TypedEventHandler<IWebViewControl?,
        WebViewControlDOMContentLoadedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _66234092_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun remove_DOMContentLoaded(token: EventRegistrationToken?): Unit {
      val fnPtr = _66234092_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(29)
    public override fun add_NavigationCompleted(handler: TypedEventHandler<IWebViewControl?,
        WebViewControlNavigationCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _66234092_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun remove_NavigationCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _66234092_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(31)
    public override fun add_FrameNavigationStarting(handler: TypedEventHandler<IWebViewControl?,
        WebViewControlNavigationStartingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _66234092_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun remove_FrameNavigationStarting(token: EventRegistrationToken?): Unit {
      val fnPtr = _66234092_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(33)
    public override fun add_FrameContentLoading(handler: TypedEventHandler<IWebViewControl?,
        WebViewControlContentLoadingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _66234092_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(34)
    public override fun remove_FrameContentLoading(token: EventRegistrationToken?): Unit {
      val fnPtr = _66234092_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(35)
    public override fun add_FrameDOMContentLoaded(handler: TypedEventHandler<IWebViewControl?,
        WebViewControlDOMContentLoadedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _66234092_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(36)
    public override fun remove_FrameDOMContentLoaded(token: EventRegistrationToken?): Unit {
      val fnPtr = _66234092_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(37)
    public override fun add_FrameNavigationCompleted(handler: TypedEventHandler<IWebViewControl?,
        WebViewControlNavigationCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _66234092_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(38)
    public override fun remove_FrameNavigationCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _66234092_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(39)
    public override fun add_ScriptNotify(handler: TypedEventHandler<IWebViewControl?,
        WebViewControlScriptNotifyEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _66234092_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(40)
    public override fun remove_ScriptNotify(token: EventRegistrationToken?): Unit {
      val fnPtr = _66234092_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(41)
    public override fun add_LongRunningScriptDetected(handler: TypedEventHandler<IWebViewControl?,
        WebViewControlLongRunningScriptDetectedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _66234092_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(42)
    public override fun remove_LongRunningScriptDetected(token: EventRegistrationToken?): Unit {
      val fnPtr = _66234092_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(43)
    public override
        fun add_UnsafeContentWarningDisplaying(handler: TypedEventHandler<IWebViewControl?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _66234092_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(44)
    public override fun remove_UnsafeContentWarningDisplaying(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _66234092_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(45)
    public override fun add_UnviewableContentIdentified(handler: TypedEventHandler<IWebViewControl?,
        WebViewControlUnviewableContentIdentifiedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _66234092_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(46)
    public override fun remove_UnviewableContentIdentified(token: EventRegistrationToken?): Unit {
      val fnPtr = _66234092_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(47)
    public override fun add_PermissionRequested(handler: TypedEventHandler<IWebViewControl?,
        WebViewControlPermissionRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _66234092_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(48)
    public override fun remove_PermissionRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _66234092_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(49)
    public override
        fun add_UnsupportedUriSchemeIdentified(handler: TypedEventHandler<IWebViewControl?,
        WebViewControlUnsupportedUriSchemeIdentifiedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _66234092_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(50)
    public override fun remove_UnsupportedUriSchemeIdentified(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _66234092_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(51)
    public override fun add_NewWindowRequested(handler: TypedEventHandler<IWebViewControl?,
        WebViewControlNewWindowRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _66234092_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(52)
    public override fun remove_NewWindowRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _66234092_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(53)
    public override
        fun add_ContainsFullScreenElementChanged(handler: TypedEventHandler<IWebViewControl?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _66234092_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(54)
    public override fun remove_ContainsFullScreenElementChanged(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _66234092_VtblPtr!!.getPointer(60L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(55)
    public override fun add_WebResourceRequested(handler: TypedEventHandler<IWebViewControl?,
        WebViewControlWebResourceRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _66234092_VtblPtr!!.getPointer(61L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(56)
    public override fun remove_WebResourceRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _66234092_VtblPtr!!.getPointer(62L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__66234092_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebViewControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __66234092_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3f921316bc704bda9136c94370899fab")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewControl(ptr: Pointer?): WithDefault = IWebViewControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebViewControl {
      val address = segment.toRawLongValue()
      return makeIWebViewControl(Pointer(address))
    }

    public override fun toNative(obj: IWebViewControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__66234092_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewControl): Array<IWebViewControl?> = (elements as
        Array<IWebViewControl?>).castToImpl<IWebViewControl,IWebViewControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewControl?> =
        arrayOfNulls<IWebViewControl_Impl>(size) as Array<IWebViewControl?>
  }
}
