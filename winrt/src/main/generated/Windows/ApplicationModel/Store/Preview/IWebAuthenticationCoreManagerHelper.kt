package Windows.ApplicationModel.Store.Preview

import Windows.Foundation.IAsyncOperation
import Windows.Security.Authentication.Web.Core.WebTokenRequest
import Windows.Security.Authentication.Web.Core.WebTokenRequestResult
import Windows.Security.Credentials.WebAccount
import Windows.UI.Xaml.UIElement
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

@ABIMarker(IWebAuthenticationCoreManagerHelper.ABI::class)
@Signature("{06a50525-e715-4123-9276-9d6f865ba55f}")
@Guid("06a50525e715412392769d6f865ba55f")
@WinRTInterface("06a50525e715412392769d6f865ba55f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAuthenticationCoreManagerHelper.ByReference::class)
public interface IWebAuthenticationCoreManagerHelper : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestTokenWithUIElementHostingAsync(request: WebTokenRequest?,
      uiElement: UIElement?): IAsyncOperation<WebTokenRequestResult?>?

  @InterfaceMethod(1)
  public fun RequestTokenWithUIElementHostingAsync(
    request: WebTokenRequest?,
    webAccount: WebAccount?,
    uiElement: UIElement?
  ): IAsyncOperation<WebTokenRequestResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAuthenticationCoreManagerHelper> {
    public override fun getValue() =
        ABI.makeIWebAuthenticationCoreManagerHelper(pointer.getPointer(0))

    public fun setValue(value: IWebAuthenticationCoreManagerHelper_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAuthenticationCoreManagerHelper {
    public val __302987336_Ptr: Pointer?

    public val _302987336_VtblPtr: Pointer?
      get() = __302987336_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestTokenWithUIElementHostingAsync(request: WebTokenRequest?,
        uiElement: UIElement?): IAsyncOperation<WebTokenRequestResult?>? {
      val fnPtr = _302987336_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WebTokenRequestResult?>>()
      val hr = fn.invokeHR(arrayOf(__302987336_Ptr, marshalToNative(request),
          marshalToNative(uiElement), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<WebTokenRequestResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RequestTokenWithUIElementHostingAsync(
      request: WebTokenRequest?,
      webAccount: WebAccount?,
      uiElement: UIElement?
    ): IAsyncOperation<WebTokenRequestResult?>? {
      val fnPtr = _302987336_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WebTokenRequestResult?>>()
      val hr = fn.invokeHR(arrayOf(__302987336_Ptr, marshalToNative(request),
          marshalToNative(webAccount), marshalToNative(uiElement), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<WebTokenRequestResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IWebAuthenticationCoreManagerHelper_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __302987336_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAuthenticationCoreManagerHelper, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("06a50525e715412392769d6f865ba55f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAuthenticationCoreManagerHelper(ptr: Pointer?): WithDefault =
        IWebAuthenticationCoreManagerHelper_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAuthenticationCoreManagerHelper {
      val address = segment.toRawLongValue()
      return makeIWebAuthenticationCoreManagerHelper(Pointer(address))
    }

    public override fun toNative(obj: IWebAuthenticationCoreManagerHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__302987336_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAuthenticationCoreManagerHelper):
        Array<IWebAuthenticationCoreManagerHelper?> = (elements as
        Array<IWebAuthenticationCoreManagerHelper?>).castToImpl<IWebAuthenticationCoreManagerHelper,IWebAuthenticationCoreManagerHelper_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAuthenticationCoreManagerHelper?> =
        arrayOfNulls<IWebAuthenticationCoreManagerHelper_Impl>(size) as
        Array<IWebAuthenticationCoreManagerHelper?>
  }
}
