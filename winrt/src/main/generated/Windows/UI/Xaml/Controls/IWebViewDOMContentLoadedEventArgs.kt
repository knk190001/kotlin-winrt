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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebViewDOMContentLoadedEventArgs.ABI::class)
@Signature("{c47eba15-dc6b-4b36-9d80-82fb8817b988}")
@Guid("c47eba15dc6b4b369d8082fb8817b988")
@WinRTInterface("c47eba15dc6b4b369d8082fb8817b988")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewDOMContentLoadedEventArgs.ByReference::class)
public interface IWebViewDOMContentLoadedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uri(): Uri?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewDOMContentLoadedEventArgs> {
    public override fun getValue() =
        ABI.makeIWebViewDOMContentLoadedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWebViewDOMContentLoadedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewDOMContentLoadedEventArgs {
    public val __652964802_Ptr: Pointer?

    public val _652964802_VtblPtr: Pointer?
      get() = __652964802_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uri(): Uri? {
      val fnPtr = _652964802_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__652964802_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }
  }

  public class IWebViewDOMContentLoadedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __652964802_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewDOMContentLoadedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c47eba15dc6b4b369d8082fb8817b988")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewDOMContentLoadedEventArgs(ptr: Pointer?): WithDefault =
        IWebViewDOMContentLoadedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebViewDOMContentLoadedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWebViewDOMContentLoadedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWebViewDOMContentLoadedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__652964802_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewDOMContentLoadedEventArgs):
        Array<IWebViewDOMContentLoadedEventArgs?> = (elements as
        Array<IWebViewDOMContentLoadedEventArgs?>).castToImpl<IWebViewDOMContentLoadedEventArgs,IWebViewDOMContentLoadedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewDOMContentLoadedEventArgs?> =
        arrayOfNulls<IWebViewDOMContentLoadedEventArgs_Impl>(size) as
        Array<IWebViewDOMContentLoadedEventArgs?>
  }
}
