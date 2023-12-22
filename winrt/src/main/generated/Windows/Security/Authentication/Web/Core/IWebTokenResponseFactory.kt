package Windows.Security.Authentication.Web.Core

import Windows.Security.Credentials.WebAccount
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

@ABIMarker(IWebTokenResponseFactory.ABI::class)
@Signature("{ab6bf7f8-5450-4ef6-97f7-052b0431c0f0}")
@Guid("ab6bf7f854504ef697f7052b0431c0f0")
@WinRTInterface("ab6bf7f854504ef697f7052b0431c0f0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebTokenResponseFactory.ByReference::class)
public interface IWebTokenResponseFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWithToken(token: String?): WebTokenResponse?

  @InterfaceMethod(1)
  public fun CreateWithTokenAndAccount(token: String?, webAccount: WebAccount?): WebTokenResponse?

  @InterfaceMethod(2)
  public fun CreateWithTokenAccountAndError(
    token: String?,
    webAccount: WebAccount?,
    error: WebProviderError?
  ): WebTokenResponse?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebTokenResponseFactory> {
    public override fun getValue() = ABI.makeIWebTokenResponseFactory(pointer.getPointer(0))

    public fun setValue(value: IWebTokenResponseFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebTokenResponseFactory {
    public val __1346276263_Ptr: Pointer?

    public val _1346276263_VtblPtr: Pointer?
      get() = __1346276263_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWithToken(token: String?): WebTokenResponse? {
      val fnPtr = _1346276263_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebTokenResponse>()
      val hr = fn.invokeHR(arrayOf(__1346276263_Ptr, marshalToNative(token), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebTokenResponse>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithTokenAndAccount(token: String?, webAccount: WebAccount?):
        WebTokenResponse? {
      val fnPtr = _1346276263_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebTokenResponse>()
      val hr = fn.invokeHR(arrayOf(__1346276263_Ptr, marshalToNative(token),
          marshalToNative(webAccount), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebTokenResponse>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateWithTokenAccountAndError(
      token: String?,
      webAccount: WebAccount?,
      error: WebProviderError?
    ): WebTokenResponse? {
      val fnPtr = _1346276263_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebTokenResponse>()
      val hr = fn.invokeHR(arrayOf(__1346276263_Ptr, marshalToNative(token),
          marshalToNative(webAccount), marshalToNative(error), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebTokenResponse>(result.getValue())
      return resultValue
    }
  }

  public class IWebTokenResponseFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1346276263_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebTokenResponseFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ab6bf7f854504ef697f7052b0431c0f0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebTokenResponseFactory(ptr: Pointer?): WithDefault =
        IWebTokenResponseFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebTokenResponseFactory {
      val address = segment.toRawLongValue()
      return makeIWebTokenResponseFactory(Pointer(address))
    }

    public override fun toNative(obj: IWebTokenResponseFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1346276263_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebTokenResponseFactory):
        Array<IWebTokenResponseFactory?> = (elements as
        Array<IWebTokenResponseFactory?>).castToImpl<IWebTokenResponseFactory,IWebTokenResponseFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebTokenResponseFactory?> =
        arrayOfNulls<IWebTokenResponseFactory_Impl>(size) as Array<IWebTokenResponseFactory?>
  }
}
