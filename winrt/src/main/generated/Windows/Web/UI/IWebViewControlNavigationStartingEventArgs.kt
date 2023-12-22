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

@ABIMarker(IWebViewControlNavigationStartingEventArgs.ABI::class)
@Signature("{0c9057c5-0a08-41c7-863b-71e3a9549137}")
@Guid("0c9057c50a0841c7863b71e3a9549137")
@WinRTInterface("0c9057c50a0841c7863b71e3a9549137")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewControlNavigationStartingEventArgs.ByReference::class)
public interface IWebViewControlNavigationStartingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uri(): Uri?

  @InterfaceMethod(1)
  public fun get_Cancel(): Boolean

  @InterfaceMethod(2)
  public fun put_Cancel(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewControlNavigationStartingEventArgs> {
    public override fun getValue() =
        ABI.makeIWebViewControlNavigationStartingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWebViewControlNavigationStartingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewControlNavigationStartingEventArgs {
    public val __135068465_Ptr: Pointer?

    public val _135068465_VtblPtr: Pointer?
      get() = __135068465_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uri(): Uri? {
      val fnPtr = _135068465_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__135068465_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Cancel(): Boolean {
      val fnPtr = _135068465_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__135068465_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_Cancel(value: Boolean): Unit {
      val fnPtr = _135068465_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__135068465_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebViewControlNavigationStartingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __135068465_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewControlNavigationStartingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0c9057c50a0841c7863b71e3a9549137")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewControlNavigationStartingEventArgs(ptr: Pointer?): WithDefault =
        IWebViewControlNavigationStartingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IWebViewControlNavigationStartingEventArgs {
      val address = segment.toRawLongValue()
      return makeIWebViewControlNavigationStartingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWebViewControlNavigationStartingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__135068465_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewControlNavigationStartingEventArgs):
        Array<IWebViewControlNavigationStartingEventArgs?> = (elements as
        Array<IWebViewControlNavigationStartingEventArgs?>).castToImpl<IWebViewControlNavigationStartingEventArgs,IWebViewControlNavigationStartingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewControlNavigationStartingEventArgs?> =
        arrayOfNulls<IWebViewControlNavigationStartingEventArgs_Impl>(size) as
        Array<IWebViewControlNavigationStartingEventArgs?>
  }
}
