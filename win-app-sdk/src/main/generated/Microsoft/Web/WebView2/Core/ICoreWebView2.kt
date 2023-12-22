package Microsoft.Web.WebView2.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import Windows.Storage.Streams.IRandomAccessStream
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

@ABIMarker(ICoreWebView2.ABI::class)
@Signature("{3a3f559a-e5e9-5338-bb67-4eb0504a4f14}")
@Guid("3a3f559ae5e95338bb674eb0504a4f14")
@WinRTInterface("3a3f559ae5e95338bb674eb0504a4f14")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2.ByReference::class)
public interface ICoreWebView2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Settings(): CoreWebView2Settings?

  @InterfaceMethod(1)
  public fun get_Source(): String?

  @InterfaceMethod(2)
  public fun get_BrowserProcessId(): WinDef.UINT

  @InterfaceMethod(3)
  public fun get_CanGoBack(): Boolean

  @InterfaceMethod(4)
  public fun get_CanGoForward(): Boolean

  @InterfaceMethod(5)
  public fun get_DocumentTitle(): String?

  @InterfaceMethod(6)
  public fun get_ContainsFullScreenElement(): Boolean

  @InterfaceMethod(7)
  public fun add_NavigationStarting(handler: TypedEventHandler<CoreWebView2?,
      CoreWebView2NavigationStartingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_NavigationStarting(token: EventRegistrationToken?): Unit

  @InterfaceMethod(9)
  public fun add_ContentLoading(handler: TypedEventHandler<CoreWebView2?,
      CoreWebView2ContentLoadingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_ContentLoading(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun add_SourceChanged(handler: TypedEventHandler<CoreWebView2?,
      CoreWebView2SourceChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_SourceChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(13)
  public fun add_HistoryChanged(handler: TypedEventHandler<CoreWebView2?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(14)
  public fun remove_HistoryChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(15)
  public fun add_NavigationCompleted(handler: TypedEventHandler<CoreWebView2?,
      CoreWebView2NavigationCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(16)
  public fun remove_NavigationCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(17)
  public fun add_FrameNavigationStarting(handler: TypedEventHandler<CoreWebView2?,
      CoreWebView2NavigationStartingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(18)
  public fun remove_FrameNavigationStarting(token: EventRegistrationToken?): Unit

  @InterfaceMethod(19)
  public fun add_FrameNavigationCompleted(handler: TypedEventHandler<CoreWebView2?,
      CoreWebView2NavigationCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(20)
  public fun remove_FrameNavigationCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(21)
  public fun add_ScriptDialogOpening(handler: TypedEventHandler<CoreWebView2?,
      CoreWebView2ScriptDialogOpeningEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(22)
  public fun remove_ScriptDialogOpening(token: EventRegistrationToken?): Unit

  @InterfaceMethod(23)
  public fun add_PermissionRequested(handler: TypedEventHandler<CoreWebView2?,
      CoreWebView2PermissionRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(24)
  public fun remove_PermissionRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(25)
  public fun add_ProcessFailed(handler: TypedEventHandler<CoreWebView2?,
      CoreWebView2ProcessFailedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(26)
  public fun remove_ProcessFailed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(27)
  public fun add_WebMessageReceived(handler: TypedEventHandler<CoreWebView2?,
      CoreWebView2WebMessageReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(28)
  public fun remove_WebMessageReceived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(29)
  public fun add_NewWindowRequested(handler: TypedEventHandler<CoreWebView2?,
      CoreWebView2NewWindowRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(30)
  public fun remove_NewWindowRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(31)
  public fun add_DocumentTitleChanged(handler: TypedEventHandler<CoreWebView2?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(32)
  public fun remove_DocumentTitleChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(33)
  public fun add_ContainsFullScreenElementChanged(handler: TypedEventHandler<CoreWebView2?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(34)
  public fun remove_ContainsFullScreenElementChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(35)
  public fun add_WebResourceRequested(handler: TypedEventHandler<CoreWebView2?,
      CoreWebView2WebResourceRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(36)
  public fun remove_WebResourceRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(37)
  public fun add_WindowCloseRequested(handler: TypedEventHandler<CoreWebView2?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(38)
  public fun remove_WindowCloseRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(39)
  public fun Navigate(uri: String?): Unit

  @InterfaceMethod(40)
  public fun NavigateToString(htmlContent: String?): Unit

  @InterfaceMethod(41)
  public fun AddScriptToExecuteOnDocumentCreatedAsync(javaScript: String?):
      IAsyncOperation<String?>?

  @InterfaceMethod(42)
  public fun RemoveScriptToExecuteOnDocumentCreated(id: String?): Unit

  @InterfaceMethod(43)
  public fun ExecuteScriptAsync(javaScript: String?): IAsyncOperation<String?>?

  @InterfaceMethod(44)
  public fun CapturePreviewAsync(imageFormat: CoreWebView2CapturePreviewImageFormat?,
      imageStream: IRandomAccessStream?): IAsyncAction?

  @InterfaceMethod(45)
  public fun Reload(): Unit

  @InterfaceMethod(46)
  public fun PostWebMessageAsJson(webMessageAsJson: String?): Unit

  @InterfaceMethod(47)
  public fun PostWebMessageAsString(webMessageAsString: String?): Unit

  @InterfaceMethod(48)
  public fun CallDevToolsProtocolMethodAsync(methodName: String?, parametersAsJson: String?):
      IAsyncOperation<String?>?

  @InterfaceMethod(49)
  public fun GoBack(): Unit

  @InterfaceMethod(50)
  public fun GoForward(): Unit

  @InterfaceMethod(51)
  public fun GetDevToolsProtocolEventReceiver(eventName: String?):
      CoreWebView2DevToolsProtocolEventReceiver?

  @InterfaceMethod(52)
  public fun Stop(): Unit

  @InterfaceMethod(53)
  public fun AddHostObjectToScript(name: String?, rawObject: IUnknown?): Unit

  @InterfaceMethod(54)
  public fun RemoveHostObjectFromScript(name: String?): Unit

  @InterfaceMethod(55)
  public fun OpenDevToolsWindow(): Unit

  @InterfaceMethod(56)
  public fun AddWebResourceRequestedFilter(uri: String?,
      ResourceContext: CoreWebView2WebResourceContext?): Unit

  @InterfaceMethod(57)
  public fun RemoveWebResourceRequestedFilter(uri: String?,
      ResourceContext: CoreWebView2WebResourceContext?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICoreWebView2>
      {
    public override fun getValue() = ABI.makeICoreWebView2(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2 {
    public val __21997127_Ptr: Pointer?

    public val _21997127_VtblPtr: Pointer?
      get() = __21997127_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Settings(): CoreWebView2Settings? {
      val fnPtr = _21997127_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2Settings>()
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2Settings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Source(): String? {
      val fnPtr = _21997127_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_BrowserProcessId(): WinDef.UINT {
      val fnPtr = _21997127_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_CanGoBack(): Boolean {
      val fnPtr = _21997127_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_CanGoForward(): Boolean {
      val fnPtr = _21997127_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_DocumentTitle(): String? {
      val fnPtr = _21997127_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_ContainsFullScreenElement(): Boolean {
      val fnPtr = _21997127_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun add_NavigationStarting(handler: TypedEventHandler<CoreWebView2?,
        CoreWebView2NavigationStartingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _21997127_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_NavigationStarting(token: EventRegistrationToken?): Unit {
      val fnPtr = _21997127_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun add_ContentLoading(handler: TypedEventHandler<CoreWebView2?,
        CoreWebView2ContentLoadingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _21997127_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_ContentLoading(token: EventRegistrationToken?): Unit {
      val fnPtr = _21997127_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun add_SourceChanged(handler: TypedEventHandler<CoreWebView2?,
        CoreWebView2SourceChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _21997127_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_SourceChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _21997127_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun add_HistoryChanged(handler: TypedEventHandler<CoreWebView2?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _21997127_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun remove_HistoryChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _21997127_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun add_NavigationCompleted(handler: TypedEventHandler<CoreWebView2?,
        CoreWebView2NavigationCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _21997127_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun remove_NavigationCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _21997127_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun add_FrameNavigationStarting(handler: TypedEventHandler<CoreWebView2?,
        CoreWebView2NavigationStartingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _21997127_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun remove_FrameNavigationStarting(token: EventRegistrationToken?): Unit {
      val fnPtr = _21997127_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun add_FrameNavigationCompleted(handler: TypedEventHandler<CoreWebView2?,
        CoreWebView2NavigationCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _21997127_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun remove_FrameNavigationCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _21997127_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun add_ScriptDialogOpening(handler: TypedEventHandler<CoreWebView2?,
        CoreWebView2ScriptDialogOpeningEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _21997127_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun remove_ScriptDialogOpening(token: EventRegistrationToken?): Unit {
      val fnPtr = _21997127_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun add_PermissionRequested(handler: TypedEventHandler<CoreWebView2?,
        CoreWebView2PermissionRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _21997127_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun remove_PermissionRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _21997127_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun add_ProcessFailed(handler: TypedEventHandler<CoreWebView2?,
        CoreWebView2ProcessFailedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _21997127_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun remove_ProcessFailed(token: EventRegistrationToken?): Unit {
      val fnPtr = _21997127_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun add_WebMessageReceived(handler: TypedEventHandler<CoreWebView2?,
        CoreWebView2WebMessageReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _21997127_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun remove_WebMessageReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _21997127_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(29)
    public override fun add_NewWindowRequested(handler: TypedEventHandler<CoreWebView2?,
        CoreWebView2NewWindowRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _21997127_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun remove_NewWindowRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _21997127_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(31)
    public override fun add_DocumentTitleChanged(handler: TypedEventHandler<CoreWebView2?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _21997127_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun remove_DocumentTitleChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _21997127_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(33)
    public override
        fun add_ContainsFullScreenElementChanged(handler: TypedEventHandler<CoreWebView2?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _21997127_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(34)
    public override fun remove_ContainsFullScreenElementChanged(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _21997127_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(35)
    public override fun add_WebResourceRequested(handler: TypedEventHandler<CoreWebView2?,
        CoreWebView2WebResourceRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _21997127_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(36)
    public override fun remove_WebResourceRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _21997127_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(37)
    public override fun add_WindowCloseRequested(handler: TypedEventHandler<CoreWebView2?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _21997127_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(38)
    public override fun remove_WindowCloseRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _21997127_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(39)
    public override fun Navigate(uri: String?): Unit {
      val fnPtr = _21997127_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(uri),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun NavigateToString(htmlContent: String?): Unit {
      val fnPtr = _21997127_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(htmlContent),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(41)
    public override fun AddScriptToExecuteOnDocumentCreatedAsync(javaScript: String?):
        IAsyncOperation<String?>? {
      val fnPtr = _21997127_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(javaScript), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(42)
    public override fun RemoveScriptToExecuteOnDocumentCreated(id: String?): Unit {
      val fnPtr = _21997127_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(id),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(43)
    public override fun ExecuteScriptAsync(javaScript: String?): IAsyncOperation<String?>? {
      val fnPtr = _21997127_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(javaScript), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(44)
    public override fun CapturePreviewAsync(imageFormat: CoreWebView2CapturePreviewImageFormat?,
        imageStream: IRandomAccessStream?): IAsyncAction? {
      val fnPtr = _21997127_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(imageFormat),
          marshalToNative(imageStream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(45)
    public override fun Reload(): Unit {
      val fnPtr = _21997127_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(46)
    public override fun PostWebMessageAsJson(webMessageAsJson: String?): Unit {
      val fnPtr = _21997127_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(webMessageAsJson),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(47)
    public override fun PostWebMessageAsString(webMessageAsString: String?): Unit {
      val fnPtr = _21997127_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(webMessageAsString),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(48)
    public override fun CallDevToolsProtocolMethodAsync(methodName: String?,
        parametersAsJson: String?): IAsyncOperation<String?>? {
      val fnPtr = _21997127_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(methodName),
          marshalToNative(parametersAsJson), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(49)
    public override fun GoBack(): Unit {
      val fnPtr = _21997127_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(50)
    public override fun GoForward(): Unit {
      val fnPtr = _21997127_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(51)
    public override fun GetDevToolsProtocolEventReceiver(eventName: String?):
        CoreWebView2DevToolsProtocolEventReceiver? {
      val fnPtr = _21997127_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2DevToolsProtocolEventReceiver>()
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(eventName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<CoreWebView2DevToolsProtocolEventReceiver>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(52)
    public override fun Stop(): Unit {
      val fnPtr = _21997127_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(53)
    public override fun AddHostObjectToScript(name: String?, rawObject: IUnknown?): Unit {
      val fnPtr = _21997127_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(name),
          marshalToNative(rawObject),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(54)
    public override fun RemoveHostObjectFromScript(name: String?): Unit {
      val fnPtr = _21997127_VtblPtr!!.getPointer(60L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(name),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(55)
    public override fun OpenDevToolsWindow(): Unit {
      val fnPtr = _21997127_VtblPtr!!.getPointer(61L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(56)
    public override fun AddWebResourceRequestedFilter(uri: String?,
        ResourceContext: CoreWebView2WebResourceContext?): Unit {
      val fnPtr = _21997127_VtblPtr!!.getPointer(62L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(uri),
          marshalToNative(ResourceContext),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(57)
    public override fun RemoveWebResourceRequestedFilter(uri: String?,
        ResourceContext: CoreWebView2WebResourceContext?): Unit {
      val fnPtr = _21997127_VtblPtr!!.getPointer(63L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__21997127_Ptr, marshalToNative(uri),
          marshalToNative(ResourceContext),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __21997127_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3a3f559ae5e95338bb674eb0504a4f14")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2(ptr: Pointer?): WithDefault = ICoreWebView2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__21997127_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2): Array<ICoreWebView2?> = (elements as
        Array<ICoreWebView2?>).castToImpl<ICoreWebView2,ICoreWebView2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2?> =
        arrayOfNulls<ICoreWebView2_Impl>(size) as Array<ICoreWebView2?>
  }
}
