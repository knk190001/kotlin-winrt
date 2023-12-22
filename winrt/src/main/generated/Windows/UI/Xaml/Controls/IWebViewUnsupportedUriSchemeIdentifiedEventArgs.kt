package Windows.UI.Xaml.Controls

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

@ABIMarker(IWebViewUnsupportedUriSchemeIdentifiedEventArgs.ABI::class)
@Signature("{b9c9e1a7-620f-4895-935d-10fbac6fd29e}")
@Guid("b9c9e1a7620f4895935d10fbac6fd29e")
@WinRTInterface("b9c9e1a7620f4895935d10fbac6fd29e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewUnsupportedUriSchemeIdentifiedEventArgs.ByReference::class)
public interface IWebViewUnsupportedUriSchemeIdentifiedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uri(): Uri?

  @InterfaceMethod(1)
  public fun get_Handled(): Boolean

  @InterfaceMethod(2)
  public fun put_Handled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewUnsupportedUriSchemeIdentifiedEventArgs> {
    public override fun getValue() =
        ABI.makeIWebViewUnsupportedUriSchemeIdentifiedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWebViewUnsupportedUriSchemeIdentifiedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewUnsupportedUriSchemeIdentifiedEventArgs {
    public val __1536504803_Ptr: Pointer?

    public val _1536504803_VtblPtr: Pointer?
      get() = __1536504803_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uri(): Uri? {
      val fnPtr = _1536504803_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1536504803_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1536504803_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1536504803_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1536504803_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1536504803_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebViewUnsupportedUriSchemeIdentifiedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1536504803_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewUnsupportedUriSchemeIdentifiedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b9c9e1a7620f4895935d10fbac6fd29e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewUnsupportedUriSchemeIdentifiedEventArgs(ptr: Pointer?): WithDefault =
        IWebViewUnsupportedUriSchemeIdentifiedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IWebViewUnsupportedUriSchemeIdentifiedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWebViewUnsupportedUriSchemeIdentifiedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWebViewUnsupportedUriSchemeIdentifiedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1536504803_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewUnsupportedUriSchemeIdentifiedEventArgs):
        Array<IWebViewUnsupportedUriSchemeIdentifiedEventArgs?> = (elements as
        Array<IWebViewUnsupportedUriSchemeIdentifiedEventArgs?>).castToImpl<IWebViewUnsupportedUriSchemeIdentifiedEventArgs,IWebViewUnsupportedUriSchemeIdentifiedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewUnsupportedUriSchemeIdentifiedEventArgs?>
        = arrayOfNulls<IWebViewUnsupportedUriSchemeIdentifiedEventArgs_Impl>(size) as
        Array<IWebViewUnsupportedUriSchemeIdentifiedEventArgs?>
  }
}
