package Windows.UI.Xaml.Controls

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

@ABIMarker(IWebViewNavigationCompletedEventArgs.ABI::class)
@Signature("{11e6f20b-eba7-44c0-889b-edeb6a064ddd}")
@Guid("11e6f20beba744c0889bedeb6a064ddd")
@WinRTInterface("11e6f20beba744c0889bedeb6a064ddd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewNavigationCompletedEventArgs.ByReference::class)
public interface IWebViewNavigationCompletedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uri(): Uri?

  @InterfaceMethod(1)
  public fun get_IsSuccess(): Boolean

  @InterfaceMethod(2)
  public fun get_WebErrorStatus(): WebErrorStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewNavigationCompletedEventArgs> {
    public override fun getValue() =
        ABI.makeIWebViewNavigationCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWebViewNavigationCompletedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewNavigationCompletedEventArgs {
    public val __450153251_Ptr: Pointer?

    public val _450153251_VtblPtr: Pointer?
      get() = __450153251_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uri(): Uri? {
      val fnPtr = _450153251_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__450153251_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsSuccess(): Boolean {
      val fnPtr = _450153251_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__450153251_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_WebErrorStatus(): WebErrorStatus? {
      val fnPtr = _450153251_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebErrorStatus>()
      val hr = fn.invokeHR(arrayOf(__450153251_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebErrorStatus>(result.getValue())
      return resultValue
    }
  }

  public class IWebViewNavigationCompletedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __450153251_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewNavigationCompletedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("11e6f20beba744c0889bedeb6a064ddd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewNavigationCompletedEventArgs(ptr: Pointer?): WithDefault =
        IWebViewNavigationCompletedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebViewNavigationCompletedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWebViewNavigationCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWebViewNavigationCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__450153251_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewNavigationCompletedEventArgs):
        Array<IWebViewNavigationCompletedEventArgs?> = (elements as
        Array<IWebViewNavigationCompletedEventArgs?>).castToImpl<IWebViewNavigationCompletedEventArgs,IWebViewNavigationCompletedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewNavigationCompletedEventArgs?> =
        arrayOfNulls<IWebViewNavigationCompletedEventArgs_Impl>(size) as
        Array<IWebViewNavigationCompletedEventArgs?>
  }
}
