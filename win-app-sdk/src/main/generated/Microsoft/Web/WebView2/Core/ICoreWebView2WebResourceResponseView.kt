package Microsoft.Web.WebView2.Core

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(ICoreWebView2WebResourceResponseView.ABI::class)
@Signature("{33ee060b-b578-5698-b541-fef87fe7fe72}")
@Guid("33ee060bb5785698b541fef87fe7fe72")
@WinRTInterface("33ee060bb5785698b541fef87fe7fe72")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2WebResourceResponseView.ByReference::class)
public interface ICoreWebView2WebResourceResponseView : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Headers(): CoreWebView2HttpResponseHeaders?

  @InterfaceMethod(1)
  public fun get_StatusCode(): Int

  @InterfaceMethod(2)
  public fun get_ReasonPhrase(): String?

  @InterfaceMethod(3)
  public fun GetContentAsync(): IAsyncOperation<IRandomAccessStream?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2WebResourceResponseView> {
    public override fun getValue() =
        ABI.makeICoreWebView2WebResourceResponseView(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2WebResourceResponseView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2WebResourceResponseView {
    public val __2084942623_Ptr: Pointer?

    public val _2084942623_VtblPtr: Pointer?
      get() = __2084942623_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Headers(): CoreWebView2HttpResponseHeaders? {
      val fnPtr = _2084942623_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2HttpResponseHeaders>()
      val hr = fn.invokeHR(arrayOf(__2084942623_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2HttpResponseHeaders>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_StatusCode(): Int {
      val fnPtr = _2084942623_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2084942623_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ReasonPhrase(): String? {
      val fnPtr = _2084942623_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2084942623_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetContentAsync(): IAsyncOperation<IRandomAccessStream?>? {
      val fnPtr = _2084942623_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IRandomAccessStream?>>()
      val hr = fn.invokeHR(arrayOf(__2084942623_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IRandomAccessStream?>>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2WebResourceResponseView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2084942623_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2WebResourceResponseView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("33ee060bb5785698b541fef87fe7fe72")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2WebResourceResponseView(ptr: Pointer?): WithDefault =
        ICoreWebView2WebResourceResponseView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2WebResourceResponseView {
      val address = segment.toRawLongValue()
      return makeICoreWebView2WebResourceResponseView(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2WebResourceResponseView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2084942623_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2WebResourceResponseView):
        Array<ICoreWebView2WebResourceResponseView?> = (elements as
        Array<ICoreWebView2WebResourceResponseView?>).castToImpl<ICoreWebView2WebResourceResponseView,ICoreWebView2WebResourceResponseView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2WebResourceResponseView?> =
        arrayOfNulls<ICoreWebView2WebResourceResponseView_Impl>(size) as
        Array<ICoreWebView2WebResourceResponseView?>
  }
}
