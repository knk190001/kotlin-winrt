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

@ABIMarker(IWebViewControlContentLoadingEventArgs.ABI::class)
@Signature("{9a3fccb2-b9bb-404b-a22b-66dccd1250c6}")
@Guid("9a3fccb2b9bb404ba22b66dccd1250c6")
@WinRTInterface("9a3fccb2b9bb404ba22b66dccd1250c6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewControlContentLoadingEventArgs.ByReference::class)
public interface IWebViewControlContentLoadingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uri(): Uri?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewControlContentLoadingEventArgs> {
    public override fun getValue() =
        ABI.makeIWebViewControlContentLoadingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWebViewControlContentLoadingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewControlContentLoadingEventArgs {
    public val __660362336_Ptr: Pointer?

    public val _660362336_VtblPtr: Pointer?
      get() = __660362336_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uri(): Uri? {
      val fnPtr = _660362336_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__660362336_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }
  }

  public class IWebViewControlContentLoadingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __660362336_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewControlContentLoadingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9a3fccb2b9bb404ba22b66dccd1250c6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewControlContentLoadingEventArgs(ptr: Pointer?): WithDefault =
        IWebViewControlContentLoadingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebViewControlContentLoadingEventArgs {
      val address = segment.toRawLongValue()
      return makeIWebViewControlContentLoadingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWebViewControlContentLoadingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__660362336_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewControlContentLoadingEventArgs):
        Array<IWebViewControlContentLoadingEventArgs?> = (elements as
        Array<IWebViewControlContentLoadingEventArgs?>).castToImpl<IWebViewControlContentLoadingEventArgs,IWebViewControlContentLoadingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewControlContentLoadingEventArgs?> =
        arrayOfNulls<IWebViewControlContentLoadingEventArgs_Impl>(size) as
        Array<IWebViewControlContentLoadingEventArgs?>
  }
}
