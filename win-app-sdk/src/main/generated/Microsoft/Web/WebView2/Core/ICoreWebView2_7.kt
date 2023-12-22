package Microsoft.Web.WebView2.Core

import Windows.Foundation.IAsyncOperation
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2_7.ABI::class)
@Signature("{f9b7107a-2e09-5596-a033-911ba12315f7}")
@Guid("f9b7107a2e095596a033911ba12315f7")
@WinRTInterface("f9b7107a2e095596a033911ba12315f7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2_7.ByReference::class)
public interface ICoreWebView2_7 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun PrintToPdfAsync(ResultFilePath: String?, printSettings: CoreWebView2PrintSettings?):
      IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2_7> {
    public override fun getValue() = ABI.makeICoreWebView2_7(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2_7_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2_7 {
    public val __335594433_Ptr: Pointer?

    public val _335594433_VtblPtr: Pointer?
      get() = __335594433_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun PrintToPdfAsync(ResultFilePath: String?,
        printSettings: CoreWebView2PrintSettings?): IAsyncOperation<Boolean>? {
      val fnPtr = _335594433_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__335594433_Ptr, marshalToNative(ResultFilePath),
          marshalToNative(printSettings), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2_7_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __335594433_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2_7, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f9b7107a2e095596a033911ba12315f7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2_7(ptr: Pointer?): WithDefault = ICoreWebView2_7_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2_7 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2_7(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2_7): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__335594433_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2_7): Array<ICoreWebView2_7?> = (elements as
        Array<ICoreWebView2_7?>).castToImpl<ICoreWebView2_7,ICoreWebView2_7_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2_7?> =
        arrayOfNulls<ICoreWebView2_7_Impl>(size) as Array<ICoreWebView2_7?>
  }
}
