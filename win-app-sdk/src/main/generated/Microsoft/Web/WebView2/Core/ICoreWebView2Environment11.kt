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

@ABIMarker(ICoreWebView2Environment11.ABI::class)
@Signature("{da23d64c-8b61-5b6c-8581-f6a688abd7cd}")
@Guid("da23d64c8b615b6c8581f6a688abd7cd")
@WinRTInterface("da23d64c8b615b6c8581f6a688abd7cd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2Environment11.ByReference::class)
public interface ICoreWebView2Environment11 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FailureReportFolderPath(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2Environment11> {
    public override fun getValue() = ABI.makeICoreWebView2Environment11(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2Environment11_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2Environment11 {
    public val __1129133164_Ptr: Pointer?

    public val _1129133164_VtblPtr: Pointer?
      get() = __1129133164_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FailureReportFolderPath(): String? {
      val fnPtr = _1129133164_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1129133164_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2Environment11_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1129133164_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2Environment11, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("da23d64c8b615b6c8581f6a688abd7cd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2Environment11(ptr: Pointer?): WithDefault =
        ICoreWebView2Environment11_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2Environment11 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2Environment11(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2Environment11): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1129133164_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2Environment11):
        Array<ICoreWebView2Environment11?> = (elements as
        Array<ICoreWebView2Environment11?>).castToImpl<ICoreWebView2Environment11,ICoreWebView2Environment11_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2Environment11?> =
        arrayOfNulls<ICoreWebView2Environment11_Impl>(size) as Array<ICoreWebView2Environment11?>
  }
}
