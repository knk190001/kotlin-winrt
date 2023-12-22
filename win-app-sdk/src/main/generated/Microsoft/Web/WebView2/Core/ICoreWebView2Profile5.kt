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

@ABIMarker(ICoreWebView2Profile5.ABI::class)
@Signature("{c9aac8f7-e502-5485-b033-99e4940ee0f1}")
@Guid("c9aac8f7e5025485b03399e4940ee0f1")
@WinRTInterface("c9aac8f7e5025485b03399e4940ee0f1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2Profile5.ByReference::class)
public interface ICoreWebView2Profile5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CookieManager(): CoreWebView2CookieManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2Profile5> {
    public override fun getValue() = ABI.makeICoreWebView2Profile5(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2Profile5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2Profile5 {
    public val __1990099181_Ptr: Pointer?

    public val _1990099181_VtblPtr: Pointer?
      get() = __1990099181_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CookieManager(): CoreWebView2CookieManager? {
      val fnPtr = _1990099181_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2CookieManager>()
      val hr = fn.invokeHR(arrayOf(__1990099181_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2CookieManager>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2Profile5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1990099181_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2Profile5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c9aac8f7e5025485b03399e4940ee0f1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2Profile5(ptr: Pointer?): WithDefault =
        ICoreWebView2Profile5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2Profile5 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2Profile5(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2Profile5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1990099181_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2Profile5): Array<ICoreWebView2Profile5?> =
        (elements as
        Array<ICoreWebView2Profile5?>).castToImpl<ICoreWebView2Profile5,ICoreWebView2Profile5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2Profile5?> =
        arrayOfNulls<ICoreWebView2Profile5_Impl>(size) as Array<ICoreWebView2Profile5?>
  }
}
