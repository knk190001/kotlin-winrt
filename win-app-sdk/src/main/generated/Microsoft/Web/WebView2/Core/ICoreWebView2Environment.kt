package Microsoft.Web.WebView2.Core

import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(ICoreWebView2Environment.ABI::class)
@Signature("{d8cc7831-b783-556b-b9ce-899c1e95d585}")
@Guid("d8cc7831b783556bb9ce899c1e95d585")
@WinRTInterface("d8cc7831b783556bb9ce899c1e95d585")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2Environment.ByReference::class)
public interface ICoreWebView2Environment : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BrowserVersionString(): String?

  @InterfaceMethod(1)
  public fun add_NewBrowserVersionAvailable(handler: TypedEventHandler<CoreWebView2Environment?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_NewBrowserVersionAvailable(token: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public
      fun CreateCoreWebView2ControllerAsync(ParentWindow: CoreWebView2ControllerWindowReference?):
      IAsyncOperation<CoreWebView2Controller?>?

  @InterfaceMethod(4)
  public fun CreateWebResourceResponse(
    Content: IRandomAccessStream?,
    StatusCode: Int,
    ReasonPhrase: String?,
    Headers: String?
  ): CoreWebView2WebResourceResponse?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2Environment> {
    public override fun getValue() = ABI.makeICoreWebView2Environment(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2Environment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2Environment {
    public val __421286220_Ptr: Pointer?

    public val _421286220_VtblPtr: Pointer?
      get() = __421286220_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BrowserVersionString(): String? {
      val fnPtr = _421286220_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__421286220_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun add_NewBrowserVersionAvailable(handler: TypedEventHandler<CoreWebView2Environment?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _421286220_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__421286220_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_NewBrowserVersionAvailable(token: EventRegistrationToken?): Unit {
      val fnPtr = _421286220_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421286220_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override
        fun CreateCoreWebView2ControllerAsync(ParentWindow: CoreWebView2ControllerWindowReference?):
        IAsyncOperation<CoreWebView2Controller?>? {
      val fnPtr = _421286220_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CoreWebView2Controller?>>()
      val hr = fn.invokeHR(arrayOf(__421286220_Ptr, marshalToNative(ParentWindow), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<CoreWebView2Controller?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateWebResourceResponse(
      Content: IRandomAccessStream?,
      StatusCode: Int,
      ReasonPhrase: String?,
      Headers: String?
    ): CoreWebView2WebResourceResponse? {
      val fnPtr = _421286220_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2WebResourceResponse>()
      val hr = fn.invokeHR(arrayOf(__421286220_Ptr, marshalToNative(Content), StatusCode,
          marshalToNative(ReasonPhrase), marshalToNative(Headers), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2WebResourceResponse>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2Environment_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __421286220_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2Environment, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d8cc7831b783556bb9ce899c1e95d585")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2Environment(ptr: Pointer?): WithDefault =
        ICoreWebView2Environment_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2Environment {
      val address = segment.toRawLongValue()
      return makeICoreWebView2Environment(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2Environment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__421286220_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2Environment):
        Array<ICoreWebView2Environment?> = (elements as
        Array<ICoreWebView2Environment?>).castToImpl<ICoreWebView2Environment,ICoreWebView2Environment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2Environment?> =
        arrayOfNulls<ICoreWebView2Environment_Impl>(size) as Array<ICoreWebView2Environment?>
  }
}
