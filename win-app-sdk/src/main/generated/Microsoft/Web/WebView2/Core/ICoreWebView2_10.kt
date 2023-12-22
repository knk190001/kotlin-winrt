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

@ABIMarker(ICoreWebView2_10.ABI::class)
@Signature("{a7b20434-970f-54b1-aa63-3c42671fa9ab}")
@Guid("a7b20434970f54b1aa633c42671fa9ab")
@WinRTInterface("a7b20434970f54b1aa633c42671fa9ab")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2_10.ByReference::class)
public interface ICoreWebView2_10 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_BasicAuthenticationRequested(handler: TypedEventHandler<CoreWebView2?,
      CoreWebView2BasicAuthenticationRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_BasicAuthenticationRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2_10> {
    public override fun getValue() = ABI.makeICoreWebView2_10(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2_10_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2_10 {
    public val __1813492969_Ptr: Pointer?

    public val _1813492969_VtblPtr: Pointer?
      get() = __1813492969_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_BasicAuthenticationRequested(handler: TypedEventHandler<CoreWebView2?,
        CoreWebView2BasicAuthenticationRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1813492969_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1813492969_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_BasicAuthenticationRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1813492969_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1813492969_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2_10_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1813492969_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2_10, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a7b20434970f54b1aa633c42671fa9ab")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2_10(ptr: Pointer?): WithDefault = ICoreWebView2_10_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2_10 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2_10(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2_10): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1813492969_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2_10): Array<ICoreWebView2_10?> = (elements as
        Array<ICoreWebView2_10?>).castToImpl<ICoreWebView2_10,ICoreWebView2_10_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2_10?> =
        arrayOfNulls<ICoreWebView2_10_Impl>(size) as Array<ICoreWebView2_10?>
  }
}
