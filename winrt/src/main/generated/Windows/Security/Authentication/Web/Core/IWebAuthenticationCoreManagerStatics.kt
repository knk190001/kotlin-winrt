package Windows.Security.Authentication.Web.Core

import Windows.Foundation.IAsyncOperation
import Windows.Security.Credentials.WebAccount
import Windows.Security.Credentials.WebAccountProvider
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebAuthenticationCoreManagerStatics.ABI::class)
@Signature("{6aca7c92-a581-4479-9c10-752eff44fd34}")
@Guid("6aca7c92a58144799c10752eff44fd34")
@WinRTInterface("6aca7c92a58144799c10752eff44fd34")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAuthenticationCoreManagerStatics.ByReference::class)
public interface IWebAuthenticationCoreManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetTokenSilentlyAsync(request: WebTokenRequest?):
      IAsyncOperation<WebTokenRequestResult?>?

  @InterfaceMethod(1)
  public fun GetTokenSilentlyAsync(request: WebTokenRequest?, webAccount: WebAccount?):
      IAsyncOperation<WebTokenRequestResult?>?

  @InterfaceMethod(2)
  public fun RequestTokenAsync(request: WebTokenRequest?): IAsyncOperation<WebTokenRequestResult?>?

  @InterfaceMethod(3)
  public fun RequestTokenAsync(request: WebTokenRequest?, webAccount: WebAccount?):
      IAsyncOperation<WebTokenRequestResult?>?

  @InterfaceMethod(4)
  public fun FindAccountAsync(provider: WebAccountProvider?, webAccountId: String?):
      IAsyncOperation<WebAccount?>?

  @InterfaceMethod(5)
  public fun FindAccountProviderAsync(webAccountProviderId: String?):
      IAsyncOperation<WebAccountProvider?>?

  @InterfaceMethod(6)
  public fun FindAccountProviderAsync(webAccountProviderId: String?, authority: String?):
      IAsyncOperation<WebAccountProvider?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAuthenticationCoreManagerStatics> {
    public override fun getValue() =
        ABI.makeIWebAuthenticationCoreManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IWebAuthenticationCoreManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAuthenticationCoreManagerStatics {
    public val __1838358598_Ptr: Pointer?

    public val _1838358598_VtblPtr: Pointer?
      get() = __1838358598_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetTokenSilentlyAsync(request: WebTokenRequest?):
        IAsyncOperation<WebTokenRequestResult?>? {
      val fnPtr = _1838358598_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WebTokenRequestResult?>>()
      val hr = fn.invokeHR(arrayOf(__1838358598_Ptr, marshalToNative(request), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<WebTokenRequestResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetTokenSilentlyAsync(request: WebTokenRequest?, webAccount: WebAccount?):
        IAsyncOperation<WebTokenRequestResult?>? {
      val fnPtr = _1838358598_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WebTokenRequestResult?>>()
      val hr = fn.invokeHR(arrayOf(__1838358598_Ptr, marshalToNative(request),
          marshalToNative(webAccount), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<WebTokenRequestResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun RequestTokenAsync(request: WebTokenRequest?):
        IAsyncOperation<WebTokenRequestResult?>? {
      val fnPtr = _1838358598_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WebTokenRequestResult?>>()
      val hr = fn.invokeHR(arrayOf(__1838358598_Ptr, marshalToNative(request), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<WebTokenRequestResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun RequestTokenAsync(request: WebTokenRequest?, webAccount: WebAccount?):
        IAsyncOperation<WebTokenRequestResult?>? {
      val fnPtr = _1838358598_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WebTokenRequestResult?>>()
      val hr = fn.invokeHR(arrayOf(__1838358598_Ptr, marshalToNative(request),
          marshalToNative(webAccount), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<WebTokenRequestResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun FindAccountAsync(provider: WebAccountProvider?, webAccountId: String?):
        IAsyncOperation<WebAccount?>? {
      val fnPtr = _1838358598_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WebAccount?>>()
      val hr = fn.invokeHR(arrayOf(__1838358598_Ptr, marshalToNative(provider),
          marshalToNative(webAccountId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WebAccount?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun FindAccountProviderAsync(webAccountProviderId: String?):
        IAsyncOperation<WebAccountProvider?>? {
      val fnPtr = _1838358598_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WebAccountProvider?>>()
      val hr = fn.invokeHR(arrayOf(__1838358598_Ptr, marshalToNative(webAccountProviderId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WebAccountProvider?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun FindAccountProviderAsync(webAccountProviderId: String?, authority: String?):
        IAsyncOperation<WebAccountProvider?>? {
      val fnPtr = _1838358598_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WebAccountProvider?>>()
      val hr = fn.invokeHR(arrayOf(__1838358598_Ptr, marshalToNative(webAccountProviderId),
          marshalToNative(authority), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WebAccountProvider?>>(result.getValue())
      return resultValue
    }
  }

  public class IWebAuthenticationCoreManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1838358598_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAuthenticationCoreManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6aca7c92a58144799c10752eff44fd34")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAuthenticationCoreManagerStatics(ptr: Pointer?): WithDefault =
        IWebAuthenticationCoreManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAuthenticationCoreManagerStatics {
      val address = segment.toRawLongValue()
      return makeIWebAuthenticationCoreManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IWebAuthenticationCoreManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1838358598_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAuthenticationCoreManagerStatics):
        Array<IWebAuthenticationCoreManagerStatics?> = (elements as
        Array<IWebAuthenticationCoreManagerStatics?>).castToImpl<IWebAuthenticationCoreManagerStatics,IWebAuthenticationCoreManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAuthenticationCoreManagerStatics?> =
        arrayOfNulls<IWebAuthenticationCoreManagerStatics_Impl>(size) as
        Array<IWebAuthenticationCoreManagerStatics?>
  }
}
