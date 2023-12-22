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

@ABIMarker(ICoreWebView2ProcessFailedEventArgs.ABI::class)
@Signature("{25a8f8c9-d944-539d-afa3-24172b48ef47}")
@Guid("25a8f8c9d944539dafa324172b48ef47")
@WinRTInterface("25a8f8c9d944539dafa324172b48ef47")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2ProcessFailedEventArgs.ByReference::class)
public interface ICoreWebView2ProcessFailedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProcessFailedKind(): CoreWebView2ProcessFailedKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2ProcessFailedEventArgs> {
    public override fun getValue() =
        ABI.makeICoreWebView2ProcessFailedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2ProcessFailedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2ProcessFailedEventArgs {
    public val __478725230_Ptr: Pointer?

    public val _478725230_VtblPtr: Pointer?
      get() = __478725230_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProcessFailedKind(): CoreWebView2ProcessFailedKind? {
      val fnPtr = _478725230_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2ProcessFailedKind>()
      val hr = fn.invokeHR(arrayOf(__478725230_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2ProcessFailedKind>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2ProcessFailedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __478725230_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2ProcessFailedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("25a8f8c9d944539dafa324172b48ef47")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2ProcessFailedEventArgs(ptr: Pointer?): WithDefault =
        ICoreWebView2ProcessFailedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2ProcessFailedEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreWebView2ProcessFailedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2ProcessFailedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__478725230_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2ProcessFailedEventArgs):
        Array<ICoreWebView2ProcessFailedEventArgs?> = (elements as
        Array<ICoreWebView2ProcessFailedEventArgs?>).castToImpl<ICoreWebView2ProcessFailedEventArgs,ICoreWebView2ProcessFailedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2ProcessFailedEventArgs?> =
        arrayOfNulls<ICoreWebView2ProcessFailedEventArgs_Impl>(size) as
        Array<ICoreWebView2ProcessFailedEventArgs?>
  }
}
