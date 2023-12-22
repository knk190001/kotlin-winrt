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
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ICoreWebView2_12.ABI::class)
@Signature("{dbbbe9a1-18d3-5f67-b362-0f4ae937d754}")
@Guid("dbbbe9a118d35f67b3620f4ae937d754")
@WinRTInterface("dbbbe9a118d35f67b3620f4ae937d754")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2_12.ByReference::class)
public interface ICoreWebView2_12 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StatusBarText(): String?

  @InterfaceMethod(1)
  public fun add_StatusBarTextChanged(handler: TypedEventHandler<CoreWebView2?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_StatusBarTextChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2_12> {
    public override fun getValue() = ABI.makeICoreWebView2_12(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2_12_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2_12 {
    public val __1813492967_Ptr: Pointer?

    public val _1813492967_VtblPtr: Pointer?
      get() = __1813492967_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StatusBarText(): String? {
      val fnPtr = _1813492967_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1813492967_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_StatusBarTextChanged(handler: TypedEventHandler<CoreWebView2?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1813492967_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1813492967_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_StatusBarTextChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1813492967_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1813492967_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2_12_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1813492967_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2_12, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dbbbe9a118d35f67b3620f4ae937d754")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2_12(ptr: Pointer?): WithDefault = ICoreWebView2_12_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2_12 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2_12(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2_12): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1813492967_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2_12): Array<ICoreWebView2_12?> = (elements as
        Array<ICoreWebView2_12?>).castToImpl<ICoreWebView2_12,ICoreWebView2_12_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2_12?> =
        arrayOfNulls<ICoreWebView2_12_Impl>(size) as Array<ICoreWebView2_12?>
  }
}
