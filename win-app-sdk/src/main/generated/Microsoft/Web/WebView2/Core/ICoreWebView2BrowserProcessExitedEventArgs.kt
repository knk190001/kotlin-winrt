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

@ABIMarker(ICoreWebView2BrowserProcessExitedEventArgs.ABI::class)
@Signature("{79963f77-1484-5a46-b91f-dfc5c1a0ce14}")
@Guid("79963f7714845a46b91fdfc5c1a0ce14")
@WinRTInterface("79963f7714845a46b91fdfc5c1a0ce14")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2BrowserProcessExitedEventArgs.ByReference::class)
public interface ICoreWebView2BrowserProcessExitedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BrowserProcessExitKind(): CoreWebView2BrowserProcessExitKind?

  @InterfaceMethod(1)
  public fun get_BrowserProcessId(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2BrowserProcessExitedEventArgs> {
    public override fun getValue() =
        ABI.makeICoreWebView2BrowserProcessExitedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2BrowserProcessExitedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2BrowserProcessExitedEventArgs {
    public val __144477524_Ptr: Pointer?

    public val _144477524_VtblPtr: Pointer?
      get() = __144477524_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BrowserProcessExitKind(): CoreWebView2BrowserProcessExitKind? {
      val fnPtr = _144477524_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2BrowserProcessExitKind>()
      val hr = fn.invokeHR(arrayOf(__144477524_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2BrowserProcessExitKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_BrowserProcessId(): WinDef.UINT {
      val fnPtr = _144477524_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__144477524_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class ICoreWebView2BrowserProcessExitedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __144477524_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2BrowserProcessExitedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("79963f7714845a46b91fdfc5c1a0ce14")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2BrowserProcessExitedEventArgs(ptr: Pointer?): WithDefault =
        ICoreWebView2BrowserProcessExitedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreWebView2BrowserProcessExitedEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreWebView2BrowserProcessExitedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2BrowserProcessExitedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__144477524_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2BrowserProcessExitedEventArgs):
        Array<ICoreWebView2BrowserProcessExitedEventArgs?> = (elements as
        Array<ICoreWebView2BrowserProcessExitedEventArgs?>).castToImpl<ICoreWebView2BrowserProcessExitedEventArgs,ICoreWebView2BrowserProcessExitedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2BrowserProcessExitedEventArgs?> =
        arrayOfNulls<ICoreWebView2BrowserProcessExitedEventArgs_Impl>(size) as
        Array<ICoreWebView2BrowserProcessExitedEventArgs?>
  }
}
