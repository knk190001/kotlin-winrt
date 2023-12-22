package Microsoft.Web.WebView2.Core

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2_2.ABI::class)
@Signature("{578cb133-2873-5408-bd9e-389bbe9fa7fa}")
@Guid("578cb13328735408bd9e389bbe9fa7fa")
@WinRTInterface("578cb13328735408bd9e389bbe9fa7fa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2_2.ByReference::class)
public interface ICoreWebView2_2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CookieManager(): CoreWebView2CookieManager?

  @InterfaceMethod(1)
  public fun get_Environment(): CoreWebView2Environment?

  @InterfaceMethod(2)
  public fun add_WebResourceResponseReceived(handler: TypedEventHandler<CoreWebView2?,
      CoreWebView2WebResourceResponseReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_WebResourceResponseReceived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_DOMContentLoaded(handler: TypedEventHandler<CoreWebView2?,
      CoreWebView2DOMContentLoadedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_DOMContentLoaded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun NavigateWithWebResourceRequest(Request: CoreWebView2WebResourceRequest?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2_2> {
    public override fun getValue() = ABI.makeICoreWebView2_2(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2_2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2_2 {
    public val __335594438_Ptr: Pointer?

    public val _335594438_VtblPtr: Pointer?
      get() = __335594438_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CookieManager(): CoreWebView2CookieManager? {
      val fnPtr = _335594438_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2CookieManager>()
      val hr = fn.invokeHR(arrayOf(__335594438_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2CookieManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Environment(): CoreWebView2Environment? {
      val fnPtr = _335594438_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2Environment>()
      val hr = fn.invokeHR(arrayOf(__335594438_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2Environment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun add_WebResourceResponseReceived(handler: TypedEventHandler<CoreWebView2?,
        CoreWebView2WebResourceResponseReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _335594438_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__335594438_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_WebResourceResponseReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _335594438_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__335594438_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_DOMContentLoaded(handler: TypedEventHandler<CoreWebView2?,
        CoreWebView2DOMContentLoadedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _335594438_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__335594438_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_DOMContentLoaded(token: EventRegistrationToken?): Unit {
      val fnPtr = _335594438_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__335594438_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun NavigateWithWebResourceRequest(Request: CoreWebView2WebResourceRequest?):
        Unit {
      val fnPtr = _335594438_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__335594438_Ptr, marshalToNative(Request),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2_2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __335594438_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2_2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("578cb13328735408bd9e389bbe9fa7fa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2_2(ptr: Pointer?): WithDefault = ICoreWebView2_2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2_2 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2_2(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2_2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__335594438_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2_2): Array<ICoreWebView2_2?> = (elements as
        Array<ICoreWebView2_2?>).castToImpl<ICoreWebView2_2,ICoreWebView2_2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2_2?> =
        arrayOfNulls<ICoreWebView2_2_Impl>(size) as Array<ICoreWebView2_2?>
  }
}
