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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebViewNavigationFailedEventArgs.ABI::class)
@Signature("{af09609a-129c-4170-9e9c-e2cdf025dca4}")
@Guid("af09609a129c41709e9ce2cdf025dca4")
@WinRTInterface("af09609a129c41709e9ce2cdf025dca4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewNavigationFailedEventArgs.ByReference::class)
public interface IWebViewNavigationFailedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uri(): Uri?

  @InterfaceMethod(1)
  public fun get_WebErrorStatus(): WebErrorStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewNavigationFailedEventArgs> {
    public override fun getValue() =
        ABI.makeIWebViewNavigationFailedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWebViewNavigationFailedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewNavigationFailedEventArgs {
    public val __1027254231_Ptr: Pointer?

    public val _1027254231_VtblPtr: Pointer?
      get() = __1027254231_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uri(): Uri? {
      val fnPtr = _1027254231_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1027254231_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_WebErrorStatus(): WebErrorStatus? {
      val fnPtr = _1027254231_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebErrorStatus>()
      val hr = fn.invokeHR(arrayOf(__1027254231_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebErrorStatus>(result.getValue())
      return resultValue
    }
  }

  public class IWebViewNavigationFailedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1027254231_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewNavigationFailedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("af09609a129c41709e9ce2cdf025dca4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewNavigationFailedEventArgs(ptr: Pointer?): WithDefault =
        IWebViewNavigationFailedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebViewNavigationFailedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWebViewNavigationFailedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWebViewNavigationFailedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1027254231_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewNavigationFailedEventArgs):
        Array<IWebViewNavigationFailedEventArgs?> = (elements as
        Array<IWebViewNavigationFailedEventArgs?>).castToImpl<IWebViewNavigationFailedEventArgs,IWebViewNavigationFailedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewNavigationFailedEventArgs?> =
        arrayOfNulls<IWebViewNavigationFailedEventArgs_Impl>(size) as
        Array<IWebViewNavigationFailedEventArgs?>
  }
}
