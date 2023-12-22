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

@ABIMarker(ICoreWebView2WebResourceRequest.ABI::class)
@Signature("{5c742259-67d2-5df2-8382-0f201b4d7197}")
@Guid("5c74225967d25df283820f201b4d7197")
@WinRTInterface("5c74225967d25df283820f201b4d7197")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2WebResourceRequest.ByReference::class)
public interface ICoreWebView2WebResourceRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uri(): String?

  @InterfaceMethod(1)
  public fun put_Uri(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Method(): String?

  @InterfaceMethod(3)
  public fun put_Method(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_Content(): IRandomAccessStream?

  @InterfaceMethod(5)
  public fun put_Content(value: IRandomAccessStream?): Unit

  @InterfaceMethod(6)
  public fun get_Headers(): CoreWebView2HttpRequestHeaders?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2WebResourceRequest> {
    public override fun getValue() = ABI.makeICoreWebView2WebResourceRequest(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2WebResourceRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2WebResourceRequest {
    public val __1755507884_Ptr: Pointer?

    public val _1755507884_VtblPtr: Pointer?
      get() = __1755507884_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uri(): String? {
      val fnPtr = _1755507884_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1755507884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Uri(value: String?): Unit {
      val fnPtr = _1755507884_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1755507884_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Method(): String? {
      val fnPtr = _1755507884_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1755507884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Method(value: String?): Unit {
      val fnPtr = _1755507884_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1755507884_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Content(): IRandomAccessStream? {
      val fnPtr = _1755507884_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStream>()
      val hr = fn.invokeHR(arrayOf(__1755507884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Content(value: IRandomAccessStream?): Unit {
      val fnPtr = _1755507884_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1755507884_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Headers(): CoreWebView2HttpRequestHeaders? {
      val fnPtr = _1755507884_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2HttpRequestHeaders>()
      val hr = fn.invokeHR(arrayOf(__1755507884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2HttpRequestHeaders>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2WebResourceRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1755507884_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2WebResourceRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5c74225967d25df283820f201b4d7197")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2WebResourceRequest(ptr: Pointer?): WithDefault =
        ICoreWebView2WebResourceRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2WebResourceRequest {
      val address = segment.toRawLongValue()
      return makeICoreWebView2WebResourceRequest(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2WebResourceRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1755507884_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2WebResourceRequest):
        Array<ICoreWebView2WebResourceRequest?> = (elements as
        Array<ICoreWebView2WebResourceRequest?>).castToImpl<ICoreWebView2WebResourceRequest,ICoreWebView2WebResourceRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2WebResourceRequest?> =
        arrayOfNulls<ICoreWebView2WebResourceRequest_Impl>(size) as
        Array<ICoreWebView2WebResourceRequest?>
  }
}
