package Microsoft.Web.WebView2.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
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

@ABIMarker(ICoreWebView2_14.ABI::class)
@Signature("{a7647b24-3b1e-50a9-be24-6e8ac63fe491}")
@Guid("a7647b243b1e50a9be246e8ac63fe491")
@WinRTInterface("a7647b243b1e50a9be246e8ac63fe491")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2_14.ByReference::class)
public interface ICoreWebView2_14 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_ServerCertificateErrorDetected(handler: TypedEventHandler<CoreWebView2?,
      CoreWebView2ServerCertificateErrorDetectedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_ServerCertificateErrorDetected(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun ClearServerCertificateErrorActionsAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2_14> {
    public override fun getValue() = ABI.makeICoreWebView2_14(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2_14_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2_14 {
    public val __1813492965_Ptr: Pointer?

    public val _1813492965_VtblPtr: Pointer?
      get() = __1813492965_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_ServerCertificateErrorDetected(handler: TypedEventHandler<CoreWebView2?,
        CoreWebView2ServerCertificateErrorDetectedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1813492965_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1813492965_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_ServerCertificateErrorDetected(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _1813492965_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1813492965_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun ClearServerCertificateErrorActionsAsync(): IAsyncAction? {
      val fnPtr = _1813492965_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1813492965_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2_14_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1813492965_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2_14, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a7647b243b1e50a9be246e8ac63fe491")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2_14(ptr: Pointer?): WithDefault = ICoreWebView2_14_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2_14 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2_14(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2_14): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1813492965_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2_14): Array<ICoreWebView2_14?> = (elements as
        Array<ICoreWebView2_14?>).castToImpl<ICoreWebView2_14,ICoreWebView2_14_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2_14?> =
        arrayOfNulls<ICoreWebView2_14_Impl>(size) as Array<ICoreWebView2_14?>
  }
}
