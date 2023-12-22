package Microsoft.Web.WebView2.Core

import Windows.Storage.Streams.IRandomAccessStream
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

@ABIMarker(ICoreWebView2WebResourceResponse.ABI::class)
@Signature("{14621923-e485-5f44-8f5d-bd4243bc398f}")
@Guid("14621923e4855f448f5dbd4243bc398f")
@WinRTInterface("14621923e4855f448f5dbd4243bc398f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2WebResourceResponse.ByReference::class)
public interface ICoreWebView2WebResourceResponse : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Content(): IRandomAccessStream?

  @InterfaceMethod(1)
  public fun put_Content(value: IRandomAccessStream?): Unit

  @InterfaceMethod(2)
  public fun get_Headers(): CoreWebView2HttpResponseHeaders?

  @InterfaceMethod(3)
  public fun get_StatusCode(): Int

  @InterfaceMethod(4)
  public fun put_StatusCode(value: Int): Unit

  @InterfaceMethod(5)
  public fun get_ReasonPhrase(): String?

  @InterfaceMethod(6)
  public fun put_ReasonPhrase(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2WebResourceResponse> {
    public override fun getValue() = ABI.makeICoreWebView2WebResourceResponse(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2WebResourceResponse_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2WebResourceResponse {
    public val __1466764316_Ptr: Pointer?

    public val _1466764316_VtblPtr: Pointer?
      get() = __1466764316_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Content(): IRandomAccessStream? {
      val fnPtr = _1466764316_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStream>()
      val hr = fn.invokeHR(arrayOf(__1466764316_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Content(value: IRandomAccessStream?): Unit {
      val fnPtr = _1466764316_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1466764316_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Headers(): CoreWebView2HttpResponseHeaders? {
      val fnPtr = _1466764316_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2HttpResponseHeaders>()
      val hr = fn.invokeHR(arrayOf(__1466764316_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2HttpResponseHeaders>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_StatusCode(): Int {
      val fnPtr = _1466764316_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1466764316_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_StatusCode(value: Int): Unit {
      val fnPtr = _1466764316_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1466764316_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_ReasonPhrase(): String? {
      val fnPtr = _1466764316_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1466764316_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_ReasonPhrase(value: String?): Unit {
      val fnPtr = _1466764316_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1466764316_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2WebResourceResponse_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1466764316_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2WebResourceResponse, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("14621923e4855f448f5dbd4243bc398f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2WebResourceResponse(ptr: Pointer?): WithDefault =
        ICoreWebView2WebResourceResponse_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2WebResourceResponse {
      val address = segment.toRawLongValue()
      return makeICoreWebView2WebResourceResponse(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2WebResourceResponse): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1466764316_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2WebResourceResponse):
        Array<ICoreWebView2WebResourceResponse?> = (elements as
        Array<ICoreWebView2WebResourceResponse?>).castToImpl<ICoreWebView2WebResourceResponse,ICoreWebView2WebResourceResponse_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2WebResourceResponse?> =
        arrayOfNulls<ICoreWebView2WebResourceResponse_Impl>(size) as
        Array<ICoreWebView2WebResourceResponse?>
  }
}
