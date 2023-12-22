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

@ABIMarker(ICoreWebView2_18.ABI::class)
@Signature("{94f52e61-9d75-5a81-acd3-830ff29ce6f7}")
@Guid("94f52e619d755a81acd3830ff29ce6f7")
@WinRTInterface("94f52e619d755a81acd3830ff29ce6f7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2_18.ByReference::class)
public interface ICoreWebView2_18 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_LaunchingExternalUriScheme(handler: TypedEventHandler<CoreWebView2?,
      CoreWebView2LaunchingExternalUriSchemeEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_LaunchingExternalUriScheme(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2_18> {
    public override fun getValue() = ABI.makeICoreWebView2_18(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2_18_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2_18 {
    public val __1813492961_Ptr: Pointer?

    public val _1813492961_VtblPtr: Pointer?
      get() = __1813492961_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_LaunchingExternalUriScheme(handler: TypedEventHandler<CoreWebView2?,
        CoreWebView2LaunchingExternalUriSchemeEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1813492961_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1813492961_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_LaunchingExternalUriScheme(token: EventRegistrationToken?): Unit {
      val fnPtr = _1813492961_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1813492961_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2_18_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1813492961_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2_18, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("94f52e619d755a81acd3830ff29ce6f7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2_18(ptr: Pointer?): WithDefault = ICoreWebView2_18_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2_18 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2_18(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2_18): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1813492961_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2_18): Array<ICoreWebView2_18?> = (elements as
        Array<ICoreWebView2_18?>).castToImpl<ICoreWebView2_18,ICoreWebView2_18_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2_18?> =
        arrayOfNulls<ICoreWebView2_18_Impl>(size) as Array<ICoreWebView2_18?>
  }
}
