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

@ABIMarker(ICoreWebView2Environment6.ABI::class)
@Signature("{965d538f-5958-5d98-8972-f622021df402}")
@Guid("965d538f59585d988972f622021df402")
@WinRTInterface("965d538f59585d988972f622021df402")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2Environment6.ByReference::class)
public interface ICoreWebView2Environment6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreatePrintSettings(): CoreWebView2PrintSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2Environment6> {
    public override fun getValue() = ABI.makeICoreWebView2Environment6(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2Environment6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2Environment6 {
    public val __174970986_Ptr: Pointer?

    public val _174970986_VtblPtr: Pointer?
      get() = __174970986_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreatePrintSettings(): CoreWebView2PrintSettings? {
      val fnPtr = _174970986_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2PrintSettings>()
      val hr = fn.invokeHR(arrayOf(__174970986_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2PrintSettings>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2Environment6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __174970986_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2Environment6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("965d538f59585d988972f622021df402")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2Environment6(ptr: Pointer?): WithDefault =
        ICoreWebView2Environment6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2Environment6 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2Environment6(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2Environment6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__174970986_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2Environment6):
        Array<ICoreWebView2Environment6?> = (elements as
        Array<ICoreWebView2Environment6?>).castToImpl<ICoreWebView2Environment6,ICoreWebView2Environment6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2Environment6?> =
        arrayOfNulls<ICoreWebView2Environment6_Impl>(size) as Array<ICoreWebView2Environment6?>
  }
}
