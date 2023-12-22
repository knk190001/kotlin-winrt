package Microsoft.UI.Xaml.Controls

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebView2Factory.ABI::class)
@Signature("{fb4ec2ce-3074-5c42-b655-64fb81fbd040}")
@Guid("fb4ec2ce30745c42b65564fb81fbd040")
@WinRTInterface("fb4ec2ce30745c42b65564fb81fbd040")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebView2Factory.ByReference::class)
public interface IWebView2Factory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): WebView2?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebView2Factory> {
    public override fun getValue() = ABI.makeIWebView2Factory(pointer.getPointer(0))

    public fun setValue(value: IWebView2Factory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebView2Factory {
    public val __1223827178_Ptr: Pointer?

    public val _1223827178_VtblPtr: Pointer?
      get() = __1223827178_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        WebView2? {
      val fnPtr = _1223827178_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebView2>()
      val hr = fn.invokeHR(arrayOf(__1223827178_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebView2>(result.getValue())
      return resultValue
    }
  }

  public class IWebView2Factory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1223827178_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebView2Factory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fb4ec2ce30745c42b65564fb81fbd040")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebView2Factory(ptr: Pointer?): WithDefault = IWebView2Factory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebView2Factory {
      val address = segment.toRawLongValue()
      return makeIWebView2Factory(Pointer(address))
    }

    public override fun toNative(obj: IWebView2Factory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1223827178_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebView2Factory): Array<IWebView2Factory?> = (elements as
        Array<IWebView2Factory?>).castToImpl<IWebView2Factory,IWebView2Factory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebView2Factory?> =
        arrayOfNulls<IWebView2Factory_Impl>(size) as Array<IWebView2Factory?>
  }
}
