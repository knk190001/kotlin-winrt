package Windows.Web.UI

import Windows.Foundation.Uri
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

@ABIMarker(IWebViewControlDOMContentLoadedEventArgs.ABI::class)
@Signature("{be8bc008-9541-4545-9ff2-2df585b29f7d}")
@Guid("be8bc008954145459ff22df585b29f7d")
@WinRTInterface("be8bc008954145459ff22df585b29f7d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewControlDOMContentLoadedEventArgs.ByReference::class)
public interface IWebViewControlDOMContentLoadedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uri(): Uri?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewControlDOMContentLoadedEventArgs> {
    public override fun getValue() =
        ABI.makeIWebViewControlDOMContentLoadedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWebViewControlDOMContentLoadedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewControlDOMContentLoadedEventArgs {
    public val __334395271_Ptr: Pointer?

    public val _334395271_VtblPtr: Pointer?
      get() = __334395271_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uri(): Uri? {
      val fnPtr = _334395271_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__334395271_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }
  }

  public class IWebViewControlDOMContentLoadedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __334395271_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewControlDOMContentLoadedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("be8bc008954145459ff22df585b29f7d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewControlDOMContentLoadedEventArgs(ptr: Pointer?): WithDefault =
        IWebViewControlDOMContentLoadedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IWebViewControlDOMContentLoadedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWebViewControlDOMContentLoadedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWebViewControlDOMContentLoadedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__334395271_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewControlDOMContentLoadedEventArgs):
        Array<IWebViewControlDOMContentLoadedEventArgs?> = (elements as
        Array<IWebViewControlDOMContentLoadedEventArgs?>).castToImpl<IWebViewControlDOMContentLoadedEventArgs,IWebViewControlDOMContentLoadedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewControlDOMContentLoadedEventArgs?> =
        arrayOfNulls<IWebViewControlDOMContentLoadedEventArgs_Impl>(size) as
        Array<IWebViewControlDOMContentLoadedEventArgs?>
  }
}
