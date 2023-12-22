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

@ABIMarker(ICoreWebView2Environment2.ABI::class)
@Signature("{0b634668-1017-5fc7-9921-f1f51866a8c0}")
@Guid("0b63466810175fc79921f1f51866a8c0")
@WinRTInterface("0b63466810175fc79921f1f51866a8c0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2Environment2.ByReference::class)
public interface ICoreWebView2Environment2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWebResourceRequest(
    uri: String?,
    Method: String?,
    postData: IRandomAccessStream?,
    Headers: String?
  ): CoreWebView2WebResourceRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2Environment2> {
    public override fun getValue() = ABI.makeICoreWebView2Environment2(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2Environment2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2Environment2 {
    public val __174970982_Ptr: Pointer?

    public val _174970982_VtblPtr: Pointer?
      get() = __174970982_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWebResourceRequest(
      uri: String?,
      Method: String?,
      postData: IRandomAccessStream?,
      Headers: String?
    ): CoreWebView2WebResourceRequest? {
      val fnPtr = _174970982_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2WebResourceRequest>()
      val hr = fn.invokeHR(arrayOf(__174970982_Ptr, marshalToNative(uri), marshalToNative(Method),
          marshalToNative(postData), marshalToNative(Headers), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2WebResourceRequest>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2Environment2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __174970982_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2Environment2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0b63466810175fc79921f1f51866a8c0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2Environment2(ptr: Pointer?): WithDefault =
        ICoreWebView2Environment2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2Environment2 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2Environment2(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2Environment2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__174970982_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2Environment2):
        Array<ICoreWebView2Environment2?> = (elements as
        Array<ICoreWebView2Environment2?>).castToImpl<ICoreWebView2Environment2,ICoreWebView2Environment2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2Environment2?> =
        arrayOfNulls<ICoreWebView2Environment2_Impl>(size) as Array<ICoreWebView2Environment2?>
  }
}
