package Microsoft.Web.WebView2.Core

import Windows.Foundation.Deferral
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

@ABIMarker(ICoreWebView2WebResourceRequestedEventArgs.ABI::class)
@Signature("{577f1fc4-c943-54a9-9700-bd469b48bd41}")
@Guid("577f1fc4c94354a99700bd469b48bd41")
@WinRTInterface("577f1fc4c94354a99700bd469b48bd41")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2WebResourceRequestedEventArgs.ByReference::class)
public interface ICoreWebView2WebResourceRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): CoreWebView2WebResourceRequest?

  @InterfaceMethod(1)
  public fun get_Response(): CoreWebView2WebResourceResponse?

  @InterfaceMethod(2)
  public fun put_Response(value: CoreWebView2WebResourceResponse?): Unit

  @InterfaceMethod(3)
  public fun get_ResourceContext(): CoreWebView2WebResourceContext?

  @InterfaceMethod(4)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2WebResourceRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeICoreWebView2WebResourceRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2WebResourceRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2WebResourceRequestedEventArgs {
    public val __1984364772_Ptr: Pointer?

    public val _1984364772_VtblPtr: Pointer?
      get() = __1984364772_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): CoreWebView2WebResourceRequest? {
      val fnPtr = _1984364772_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2WebResourceRequest>()
      val hr = fn.invokeHR(arrayOf(__1984364772_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2WebResourceRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Response(): CoreWebView2WebResourceResponse? {
      val fnPtr = _1984364772_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2WebResourceResponse>()
      val hr = fn.invokeHR(arrayOf(__1984364772_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2WebResourceResponse>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Response(value: CoreWebView2WebResourceResponse?): Unit {
      val fnPtr = _1984364772_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1984364772_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_ResourceContext(): CoreWebView2WebResourceContext? {
      val fnPtr = _1984364772_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2WebResourceContext>()
      val hr = fn.invokeHR(arrayOf(__1984364772_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2WebResourceContext>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1984364772_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1984364772_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2WebResourceRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1984364772_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2WebResourceRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("577f1fc4c94354a99700bd469b48bd41")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2WebResourceRequestedEventArgs(ptr: Pointer?): WithDefault =
        ICoreWebView2WebResourceRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreWebView2WebResourceRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreWebView2WebResourceRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2WebResourceRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1984364772_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2WebResourceRequestedEventArgs):
        Array<ICoreWebView2WebResourceRequestedEventArgs?> = (elements as
        Array<ICoreWebView2WebResourceRequestedEventArgs?>).castToImpl<ICoreWebView2WebResourceRequestedEventArgs,ICoreWebView2WebResourceRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2WebResourceRequestedEventArgs?> =
        arrayOfNulls<ICoreWebView2WebResourceRequestedEventArgs_Impl>(size) as
        Array<ICoreWebView2WebResourceRequestedEventArgs?>
  }
}
