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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ICoreWebView2DOMContentLoadedEventArgs.ABI::class)
@Signature("{c474d0a3-24ac-59fc-b78b-da7562a6a052}")
@Guid("c474d0a324ac59fcb78bda7562a6a052")
@WinRTInterface("c474d0a324ac59fcb78bda7562a6a052")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2DOMContentLoadedEventArgs.ByReference::class)
public interface ICoreWebView2DOMContentLoadedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NavigationId(): WinDef.ULONG

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2DOMContentLoadedEventArgs> {
    public override fun getValue() =
        ABI.makeICoreWebView2DOMContentLoadedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2DOMContentLoadedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2DOMContentLoadedEventArgs {
    public val __650618444_Ptr: Pointer?

    public val _650618444_VtblPtr: Pointer?
      get() = __650618444_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NavigationId(): WinDef.ULONG {
      val fnPtr = _650618444_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__650618444_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }
  }

  public class ICoreWebView2DOMContentLoadedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __650618444_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2DOMContentLoadedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c474d0a324ac59fcb78bda7562a6a052")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2DOMContentLoadedEventArgs(ptr: Pointer?): WithDefault =
        ICoreWebView2DOMContentLoadedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2DOMContentLoadedEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreWebView2DOMContentLoadedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2DOMContentLoadedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__650618444_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2DOMContentLoadedEventArgs):
        Array<ICoreWebView2DOMContentLoadedEventArgs?> = (elements as
        Array<ICoreWebView2DOMContentLoadedEventArgs?>).castToImpl<ICoreWebView2DOMContentLoadedEventArgs,ICoreWebView2DOMContentLoadedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2DOMContentLoadedEventArgs?> =
        arrayOfNulls<ICoreWebView2DOMContentLoadedEventArgs_Impl>(size) as
        Array<ICoreWebView2DOMContentLoadedEventArgs?>
  }
}
