package Windows.UI.Xaml.Controls

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

@ABIMarker(IWebViewFactory4.ABI::class)
@Signature("{82edac58-ee6a-4c9b-a3a0-9347a7d0ef4c}")
@Guid("82edac58ee6a4c9ba3a09347a7d0ef4c")
@WinRTInterface("82edac58ee6a4c9ba3a09347a7d0ef4c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewFactory4.ByReference::class)
public interface IWebViewFactory4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithExecutionMode(executionMode: WebViewExecutionMode?): WebView?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewFactory4> {
    public override fun getValue() = ABI.makeIWebViewFactory4(pointer.getPointer(0))

    public fun setValue(value: IWebViewFactory4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewFactory4 {
    public val __11748359_Ptr: Pointer?

    public val _11748359_VtblPtr: Pointer?
      get() = __11748359_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithExecutionMode(executionMode: WebViewExecutionMode?):
        WebView? {
      val fnPtr = _11748359_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebView>()
      val hr = fn.invokeHR(arrayOf(__11748359_Ptr, marshalToNative(executionMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebView>(result.getValue())
      return resultValue
    }
  }

  public class IWebViewFactory4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __11748359_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewFactory4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("82edac58ee6a4c9ba3a09347a7d0ef4c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewFactory4(ptr: Pointer?): WithDefault = IWebViewFactory4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebViewFactory4 {
      val address = segment.toRawLongValue()
      return makeIWebViewFactory4(Pointer(address))
    }

    public override fun toNative(obj: IWebViewFactory4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__11748359_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewFactory4): Array<IWebViewFactory4?> = (elements as
        Array<IWebViewFactory4?>).castToImpl<IWebViewFactory4,IWebViewFactory4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewFactory4?> =
        arrayOfNulls<IWebViewFactory4_Impl>(size) as Array<IWebViewFactory4?>
  }
}
