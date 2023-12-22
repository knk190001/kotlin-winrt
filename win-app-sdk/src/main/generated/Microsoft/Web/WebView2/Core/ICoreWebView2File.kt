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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2File.ABI::class)
@Signature("{cab45512-9594-50f1-ac3c-9cc103b574a3}")
@Guid("cab45512959450f1ac3c9cc103b574a3")
@WinRTInterface("cab45512959450f1ac3c9cc103b574a3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2File.ByReference::class)
public interface ICoreWebView2File : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Path(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2File> {
    public override fun getValue() = ABI.makeICoreWebView2File(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2File_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2File {
    public val __384396189_Ptr: Pointer?

    public val _384396189_VtblPtr: Pointer?
      get() = __384396189_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Path(): String? {
      val fnPtr = _384396189_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__384396189_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2File_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __384396189_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2File, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cab45512959450f1ac3c9cc103b574a3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2File(ptr: Pointer?): WithDefault = ICoreWebView2File_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2File {
      val address = segment.toRawLongValue()
      return makeICoreWebView2File(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2File): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__384396189_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2File): Array<ICoreWebView2File?> = (elements
        as Array<ICoreWebView2File?>).castToImpl<ICoreWebView2File,ICoreWebView2File_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2File?> =
        arrayOfNulls<ICoreWebView2File_Impl>(size) as Array<ICoreWebView2File?>
  }
}
