package Windows.UI.Xaml.Controls

import Windows.Foundation.Collections.IVector
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IWebView4.ABI::class)
@Signature("{e28243bc-67f3-462a-b4e0-3bbf6c3dab0b}")
@Guid("e28243bc67f3462ab4e03bbf6c3dab0b")
@WinRTInterface("e28243bc67f3462ab4e03bbf6c3dab0b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebView4.ByReference::class)
public interface IWebView4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExecutionMode(): WebViewExecutionMode?

  @InterfaceMethod(1)
  public fun get_DeferredPermissionRequests(): IVector<WebViewDeferredPermissionRequest?>?

  @InterfaceMethod(2)
  public fun get_Settings(): WebViewSettings?

  @InterfaceMethod(3)
  public fun add_UnsupportedUriSchemeIdentified(handler: TypedEventHandler<WebView?,
      WebViewUnsupportedUriSchemeIdentifiedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_UnsupportedUriSchemeIdentified(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun add_NewWindowRequested(handler: TypedEventHandler<WebView?,
      WebViewNewWindowRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_NewWindowRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public fun add_PermissionRequested(handler: TypedEventHandler<WebView?,
      WebViewPermissionRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_PermissionRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(9)
  public fun AddWebAllowedObject(name: String?, pObject: IUnknown?): Unit

  @InterfaceMethod(10)
  public fun DeferredPermissionRequestById(id: WinDef.UINT): WebViewDeferredPermissionRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IWebView4> {
    public override fun getValue() = ABI.makeIWebView4(pointer.getPointer(0))

    public fun setValue(value: IWebView4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebView4 {
    public val __1215835305_Ptr: Pointer?

    public val _1215835305_VtblPtr: Pointer?
      get() = __1215835305_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExecutionMode(): WebViewExecutionMode? {
      val fnPtr = _1215835305_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebViewExecutionMode>()
      val hr = fn.invokeHR(arrayOf(__1215835305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebViewExecutionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DeferredPermissionRequests():
        IVector<WebViewDeferredPermissionRequest?>? {
      val fnPtr = _1215835305_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<WebViewDeferredPermissionRequest?>>()
      val hr = fn.invokeHR(arrayOf(__1215835305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVector<WebViewDeferredPermissionRequest?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Settings(): WebViewSettings? {
      val fnPtr = _1215835305_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebViewSettings>()
      val hr = fn.invokeHR(arrayOf(__1215835305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebViewSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun add_UnsupportedUriSchemeIdentified(handler: TypedEventHandler<WebView?,
        WebViewUnsupportedUriSchemeIdentifiedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1215835305_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1215835305_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_UnsupportedUriSchemeIdentified(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _1215835305_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215835305_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_NewWindowRequested(handler: TypedEventHandler<WebView?,
        WebViewNewWindowRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1215835305_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1215835305_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_NewWindowRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1215835305_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215835305_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun add_PermissionRequested(handler: TypedEventHandler<WebView?,
        WebViewPermissionRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1215835305_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1215835305_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_PermissionRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1215835305_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215835305_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun AddWebAllowedObject(name: String?, pObject: IUnknown?): Unit {
      val fnPtr = _1215835305_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215835305_Ptr, marshalToNative(name),
          marshalToNative(pObject),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun DeferredPermissionRequestById(id: WinDef.UINT):
        WebViewDeferredPermissionRequest? {
      val fnPtr = _1215835305_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebViewDeferredPermissionRequest>()
      val hr = fn.invokeHR(arrayOf(__1215835305_Ptr, id, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebViewDeferredPermissionRequest>(result.getValue())
      return resultValue
    }
  }

  public class IWebView4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1215835305_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebView4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e28243bc67f3462ab4e03bbf6c3dab0b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebView4(ptr: Pointer?): WithDefault = IWebView4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebView4 {
      val address = segment.toRawLongValue()
      return makeIWebView4(Pointer(address))
    }

    public override fun toNative(obj: IWebView4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1215835305_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebView4): Array<IWebView4?> = (elements as
        Array<IWebView4?>).castToImpl<IWebView4,IWebView4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebView4?> = arrayOfNulls<IWebView4_Impl>(size)
        as Array<IWebView4?>
  }
}
