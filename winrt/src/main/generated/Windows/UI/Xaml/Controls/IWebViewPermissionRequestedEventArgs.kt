package Windows.UI.Xaml.Controls

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

@ABIMarker(IWebViewPermissionRequestedEventArgs.ABI::class)
@Signature("{dadecfd0-6e1e-473f-b0be-b02404d6a86d}")
@Guid("dadecfd06e1e473fb0beb02404d6a86d")
@WinRTInterface("dadecfd06e1e473fb0beb02404d6a86d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewPermissionRequestedEventArgs.ByReference::class)
public interface IWebViewPermissionRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PermissionRequest(): WebViewPermissionRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewPermissionRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIWebViewPermissionRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWebViewPermissionRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewPermissionRequestedEventArgs {
    public val __503607787_Ptr: Pointer?

    public val _503607787_VtblPtr: Pointer?
      get() = __503607787_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PermissionRequest(): WebViewPermissionRequest? {
      val fnPtr = _503607787_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebViewPermissionRequest>()
      val hr = fn.invokeHR(arrayOf(__503607787_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebViewPermissionRequest>(result.getValue())
      return resultValue
    }
  }

  public class IWebViewPermissionRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __503607787_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewPermissionRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dadecfd06e1e473fb0beb02404d6a86d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewPermissionRequestedEventArgs(ptr: Pointer?): WithDefault =
        IWebViewPermissionRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebViewPermissionRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWebViewPermissionRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWebViewPermissionRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__503607787_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewPermissionRequestedEventArgs):
        Array<IWebViewPermissionRequestedEventArgs?> = (elements as
        Array<IWebViewPermissionRequestedEventArgs?>).castToImpl<IWebViewPermissionRequestedEventArgs,IWebViewPermissionRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewPermissionRequestedEventArgs?> =
        arrayOfNulls<IWebViewPermissionRequestedEventArgs_Impl>(size) as
        Array<IWebViewPermissionRequestedEventArgs?>
  }
}
