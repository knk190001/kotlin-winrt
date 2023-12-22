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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebViewControlUnsupportedUriSchemeIdentifiedEventArgs.ABI::class)
@Signature("{e3b81944-e4fc-43dc-94ca-f980f30bc51d}")
@Guid("e3b81944e4fc43dc94caf980f30bc51d")
@WinRTInterface("e3b81944e4fc43dc94caf980f30bc51d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    IWebViewControlUnsupportedUriSchemeIdentifiedEventArgs.ByReference::class)
public interface IWebViewControlUnsupportedUriSchemeIdentifiedEventArgs : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uri(): Uri?

  @InterfaceMethod(1)
  public fun get_Handled(): Boolean

  @InterfaceMethod(2)
  public fun put_Handled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewControlUnsupportedUriSchemeIdentifiedEventArgs> {
    public override fun getValue() =
        ABI.makeIWebViewControlUnsupportedUriSchemeIdentifiedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWebViewControlUnsupportedUriSchemeIdentifiedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewControlUnsupportedUriSchemeIdentifiedEventArgs {
    public val __818490220_Ptr: Pointer?

    public val _818490220_VtblPtr: Pointer?
      get() = __818490220_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uri(): Uri? {
      val fnPtr = _818490220_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__818490220_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Handled(): Boolean {
      val fnPtr = _818490220_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__818490220_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _818490220_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__818490220_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebViewControlUnsupportedUriSchemeIdentifiedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __818490220_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewControlUnsupportedUriSchemeIdentifiedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e3b81944e4fc43dc94caf980f30bc51d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewControlUnsupportedUriSchemeIdentifiedEventArgs(ptr: Pointer?):
        WithDefault = IWebViewControlUnsupportedUriSchemeIdentifiedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IWebViewControlUnsupportedUriSchemeIdentifiedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWebViewControlUnsupportedUriSchemeIdentifiedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWebViewControlUnsupportedUriSchemeIdentifiedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__818490220_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewControlUnsupportedUriSchemeIdentifiedEventArgs):
        Array<IWebViewControlUnsupportedUriSchemeIdentifiedEventArgs?> = (elements as
        Array<IWebViewControlUnsupportedUriSchemeIdentifiedEventArgs?>).castToImpl<IWebViewControlUnsupportedUriSchemeIdentifiedEventArgs,IWebViewControlUnsupportedUriSchemeIdentifiedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IWebViewControlUnsupportedUriSchemeIdentifiedEventArgs?> =
        arrayOfNulls<IWebViewControlUnsupportedUriSchemeIdentifiedEventArgs_Impl>(size) as
        Array<IWebViewControlUnsupportedUriSchemeIdentifiedEventArgs?>
  }
}
