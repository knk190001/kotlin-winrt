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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2WebResourceResponseReceivedEventArgs.ABI::class)
@Signature("{12424671-9711-54f4-bcdf-5f307add6ec2}")
@Guid("12424671971154f4bcdf5f307add6ec2")
@WinRTInterface("12424671971154f4bcdf5f307add6ec2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2WebResourceResponseReceivedEventArgs.ByReference::class)
public interface ICoreWebView2WebResourceResponseReceivedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): CoreWebView2WebResourceRequest?

  @InterfaceMethod(1)
  public fun get_Response(): CoreWebView2WebResourceResponseView?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2WebResourceResponseReceivedEventArgs> {
    public override fun getValue() =
        ABI.makeICoreWebView2WebResourceResponseReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2WebResourceResponseReceivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2WebResourceResponseReceivedEventArgs {
    public val __605745926_Ptr: Pointer?

    public val _605745926_VtblPtr: Pointer?
      get() = __605745926_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): CoreWebView2WebResourceRequest? {
      val fnPtr = _605745926_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2WebResourceRequest>()
      val hr = fn.invokeHR(arrayOf(__605745926_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2WebResourceRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Response(): CoreWebView2WebResourceResponseView? {
      val fnPtr = _605745926_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2WebResourceResponseView>()
      val hr = fn.invokeHR(arrayOf(__605745926_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2WebResourceResponseView>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2WebResourceResponseReceivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __605745926_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2WebResourceResponseReceivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("12424671971154f4bcdf5f307add6ec2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2WebResourceResponseReceivedEventArgs(ptr: Pointer?): WithDefault =
        ICoreWebView2WebResourceResponseReceivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreWebView2WebResourceResponseReceivedEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreWebView2WebResourceResponseReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2WebResourceResponseReceivedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__605745926_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2WebResourceResponseReceivedEventArgs):
        Array<ICoreWebView2WebResourceResponseReceivedEventArgs?> = (elements as
        Array<ICoreWebView2WebResourceResponseReceivedEventArgs?>).castToImpl<ICoreWebView2WebResourceResponseReceivedEventArgs,ICoreWebView2WebResourceResponseReceivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<ICoreWebView2WebResourceResponseReceivedEventArgs?> =
        arrayOfNulls<ICoreWebView2WebResourceResponseReceivedEventArgs_Impl>(size) as
        Array<ICoreWebView2WebResourceResponseReceivedEventArgs?>
  }
}
