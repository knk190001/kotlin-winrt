package Windows.Web.UI.Interop

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

@ABIMarker(IWebViewControlProcessFactory.ABI::class)
@Signature("{47b65cf9-a2d2-453c-b097-f6779d4b8e02}")
@Guid("47b65cf9a2d2453cb097f6779d4b8e02")
@WinRTInterface("47b65cf9a2d2453cb097f6779d4b8e02")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewControlProcessFactory.ByReference::class)
public interface IWebViewControlProcessFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWithOptions(processOptions: WebViewControlProcessOptions?):
      WebViewControlProcess?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewControlProcessFactory> {
    public override fun getValue() = ABI.makeIWebViewControlProcessFactory(pointer.getPointer(0))

    public fun setValue(value: IWebViewControlProcessFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewControlProcessFactory {
    public val __275129984_Ptr: Pointer?

    public val _275129984_VtblPtr: Pointer?
      get() = __275129984_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWithOptions(processOptions: WebViewControlProcessOptions?):
        WebViewControlProcess? {
      val fnPtr = _275129984_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebViewControlProcess>()
      val hr = fn.invokeHR(arrayOf(__275129984_Ptr, marshalToNative(processOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebViewControlProcess>(result.getValue())
      return resultValue
    }
  }

  public class IWebViewControlProcessFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __275129984_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewControlProcessFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("47b65cf9a2d2453cb097f6779d4b8e02")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewControlProcessFactory(ptr: Pointer?): WithDefault =
        IWebViewControlProcessFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebViewControlProcessFactory {
      val address = segment.toRawLongValue()
      return makeIWebViewControlProcessFactory(Pointer(address))
    }

    public override fun toNative(obj: IWebViewControlProcessFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__275129984_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewControlProcessFactory):
        Array<IWebViewControlProcessFactory?> = (elements as
        Array<IWebViewControlProcessFactory?>).castToImpl<IWebViewControlProcessFactory,IWebViewControlProcessFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewControlProcessFactory?> =
        arrayOfNulls<IWebViewControlProcessFactory_Impl>(size) as
        Array<IWebViewControlProcessFactory?>
  }
}
