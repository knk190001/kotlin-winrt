package Microsoft.Web.WebView2.Core

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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2HttpResponseHeaders.ABI::class)
@Signature("{f3d383e9-747f-5574-8662-9a6b920cecd4}")
@Guid("f3d383e9747f557486629a6b920cecd4")
@WinRTInterface("f3d383e9747f557486629a6b920cecd4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2HttpResponseHeaders.ByReference::class)
public interface ICoreWebView2HttpResponseHeaders : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AppendHeader(name: String?, value: String?): Unit

  @InterfaceMethod(1)
  public fun Contains(name: String?): Boolean

  @InterfaceMethod(2)
  public fun GetHeader(name: String?): String?

  @InterfaceMethod(3)
  public fun GetHeaders(name: String?): CoreWebView2HttpHeadersCollectionIterator?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2HttpResponseHeaders> {
    public override fun getValue() = ABI.makeICoreWebView2HttpResponseHeaders(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2HttpResponseHeaders_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2HttpResponseHeaders {
    public val __212976490_Ptr: Pointer?

    public val _212976490_VtblPtr: Pointer?
      get() = __212976490_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AppendHeader(name: String?, value: String?): Unit {
      val fnPtr = _212976490_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__212976490_Ptr, marshalToNative(name), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Contains(name: String?): Boolean {
      val fnPtr = _212976490_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__212976490_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun GetHeader(name: String?): String? {
      val fnPtr = _212976490_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__212976490_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetHeaders(name: String?): CoreWebView2HttpHeadersCollectionIterator? {
      val fnPtr = _212976490_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2HttpHeadersCollectionIterator>()
      val hr = fn.invokeHR(arrayOf(__212976490_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<CoreWebView2HttpHeadersCollectionIterator>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2HttpResponseHeaders_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __212976490_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2HttpResponseHeaders, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f3d383e9747f557486629a6b920cecd4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2HttpResponseHeaders(ptr: Pointer?): WithDefault =
        ICoreWebView2HttpResponseHeaders_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2HttpResponseHeaders {
      val address = segment.toRawLongValue()
      return makeICoreWebView2HttpResponseHeaders(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2HttpResponseHeaders): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__212976490_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2HttpResponseHeaders):
        Array<ICoreWebView2HttpResponseHeaders?> = (elements as
        Array<ICoreWebView2HttpResponseHeaders?>).castToImpl<ICoreWebView2HttpResponseHeaders,ICoreWebView2HttpResponseHeaders_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2HttpResponseHeaders?> =
        arrayOfNulls<ICoreWebView2HttpResponseHeaders_Impl>(size) as
        Array<ICoreWebView2HttpResponseHeaders?>
  }
}
