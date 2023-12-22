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

@ABIMarker(IWebViewControlMoveFocusRequestedEventArgs.ABI::class)
@Signature("{6b2a340d-4bd0-405e-b7c1-1e72a492f446}")
@Guid("6b2a340d4bd0405eb7c11e72a492f446")
@WinRTInterface("6b2a340d4bd0405eb7c11e72a492f446")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewControlMoveFocusRequestedEventArgs.ByReference::class)
public interface IWebViewControlMoveFocusRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reason(): WebViewControlMoveFocusReason?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewControlMoveFocusRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIWebViewControlMoveFocusRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWebViewControlMoveFocusRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewControlMoveFocusRequestedEventArgs {
    public val __1979724565_Ptr: Pointer?

    public val _1979724565_VtblPtr: Pointer?
      get() = __1979724565_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reason(): WebViewControlMoveFocusReason? {
      val fnPtr = _1979724565_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebViewControlMoveFocusReason>()
      val hr = fn.invokeHR(arrayOf(__1979724565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebViewControlMoveFocusReason>(result.getValue())
      return resultValue
    }
  }

  public class IWebViewControlMoveFocusRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1979724565_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewControlMoveFocusRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6b2a340d4bd0405eb7c11e72a492f446")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewControlMoveFocusRequestedEventArgs(ptr: Pointer?): WithDefault =
        IWebViewControlMoveFocusRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IWebViewControlMoveFocusRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWebViewControlMoveFocusRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWebViewControlMoveFocusRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1979724565_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewControlMoveFocusRequestedEventArgs):
        Array<IWebViewControlMoveFocusRequestedEventArgs?> = (elements as
        Array<IWebViewControlMoveFocusRequestedEventArgs?>).castToImpl<IWebViewControlMoveFocusRequestedEventArgs,IWebViewControlMoveFocusRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewControlMoveFocusRequestedEventArgs?> =
        arrayOfNulls<IWebViewControlMoveFocusRequestedEventArgs_Impl>(size) as
        Array<IWebViewControlMoveFocusRequestedEventArgs?>
  }
}
