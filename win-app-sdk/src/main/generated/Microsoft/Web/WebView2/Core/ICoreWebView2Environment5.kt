package Microsoft.Web.WebView2.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(ICoreWebView2Environment5.ABI::class)
@Signature("{f33399af-e4d3-59dc-ac38-8397aadcedb1}")
@Guid("f33399afe4d359dcac388397aadcedb1")
@WinRTInterface("f33399afe4d359dcac388397aadcedb1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2Environment5.ByReference::class)
public interface ICoreWebView2Environment5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_BrowserProcessExited(handler: TypedEventHandler<CoreWebView2Environment?,
      CoreWebView2BrowserProcessExitedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_BrowserProcessExited(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2Environment5> {
    public override fun getValue() = ABI.makeICoreWebView2Environment5(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2Environment5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2Environment5 {
    public val __174970985_Ptr: Pointer?

    public val _174970985_VtblPtr: Pointer?
      get() = __174970985_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_BrowserProcessExited(handler: TypedEventHandler<CoreWebView2Environment?,
        CoreWebView2BrowserProcessExitedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _174970985_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__174970985_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_BrowserProcessExited(token: EventRegistrationToken?): Unit {
      val fnPtr = _174970985_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__174970985_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2Environment5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __174970985_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2Environment5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f33399afe4d359dcac388397aadcedb1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2Environment5(ptr: Pointer?): WithDefault =
        ICoreWebView2Environment5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2Environment5 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2Environment5(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2Environment5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__174970985_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2Environment5):
        Array<ICoreWebView2Environment5?> = (elements as
        Array<ICoreWebView2Environment5?>).castToImpl<ICoreWebView2Environment5,ICoreWebView2Environment5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2Environment5?> =
        arrayOfNulls<ICoreWebView2Environment5_Impl>(size) as Array<ICoreWebView2Environment5?>
  }
}
