package Windows.Web.UI

import Windows.Foundation.Uri
import Windows.Web.WebErrorStatus
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

@ABIMarker(IWebViewControlNavigationCompletedEventArgs.ABI::class)
@Signature("{20409918-4a15-4c46-a55d-f79edb0bde8b}")
@Guid("204099184a154c46a55df79edb0bde8b")
@WinRTInterface("204099184a154c46a55df79edb0bde8b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewControlNavigationCompletedEventArgs.ByReference::class)
public interface IWebViewControlNavigationCompletedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uri(): Uri?

  @InterfaceMethod(1)
  public fun get_IsSuccess(): Boolean

  @InterfaceMethod(2)
  public fun get_WebErrorStatus(): WebErrorStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewControlNavigationCompletedEventArgs> {
    public override fun getValue() =
        ABI.makeIWebViewControlNavigationCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWebViewControlNavigationCompletedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewControlNavigationCompletedEventArgs {
    public val __2057738484_Ptr: Pointer?

    public val _2057738484_VtblPtr: Pointer?
      get() = __2057738484_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uri(): Uri? {
      val fnPtr = _2057738484_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__2057738484_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsSuccess(): Boolean {
      val fnPtr = _2057738484_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2057738484_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_WebErrorStatus(): WebErrorStatus? {
      val fnPtr = _2057738484_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebErrorStatus>()
      val hr = fn.invokeHR(arrayOf(__2057738484_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebErrorStatus>(result.getValue())
      return resultValue
    }
  }

  public class IWebViewControlNavigationCompletedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2057738484_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewControlNavigationCompletedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("204099184a154c46a55df79edb0bde8b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewControlNavigationCompletedEventArgs(ptr: Pointer?): WithDefault =
        IWebViewControlNavigationCompletedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IWebViewControlNavigationCompletedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWebViewControlNavigationCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWebViewControlNavigationCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2057738484_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewControlNavigationCompletedEventArgs):
        Array<IWebViewControlNavigationCompletedEventArgs?> = (elements as
        Array<IWebViewControlNavigationCompletedEventArgs?>).castToImpl<IWebViewControlNavigationCompletedEventArgs,IWebViewControlNavigationCompletedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewControlNavigationCompletedEventArgs?> =
        arrayOfNulls<IWebViewControlNavigationCompletedEventArgs_Impl>(size) as
        Array<IWebViewControlNavigationCompletedEventArgs?>
  }
}
