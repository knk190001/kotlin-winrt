package Windows.Security.Authentication.Web.Core

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

@ABIMarker(IWebTokenRequestFactory.ABI::class)
@Signature("{6cf2141c-0ff0-4c67-b84f-99ddbe4a72c9}")
@Guid("6cf2141c0ff04c67b84f99ddbe4a72c9")
@WinRTInterface("6cf2141c0ff04c67b84f99ddbe4a72c9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebTokenRequestFactory.ByReference::class)
public interface IWebTokenRequestFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(
    provider: WebAccountProvider?,
    scope: String?,
    clientId: String?
  ): WebTokenRequest?

  @InterfaceMethod(1)
  public fun CreateWithPromptType(
    provider: WebAccountProvider?,
    scope: String?,
    clientId: String?,
    promptType: WebTokenRequestPromptType?
  ): WebTokenRequest?

  @InterfaceMethod(2)
  public fun CreateWithProvider(provider: WebAccountProvider?): WebTokenRequest?

  @InterfaceMethod(3)
  public fun CreateWithScope(provider: WebAccountProvider?, scope: String?): WebTokenRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebTokenRequestFactory> {
    public override fun getValue() = ABI.makeIWebTokenRequestFactory(pointer.getPointer(0))

    public fun setValue(value: IWebTokenRequestFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebTokenRequestFactory {
    public val __990837149_Ptr: Pointer?

    public val _990837149_VtblPtr: Pointer?
      get() = __990837149_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(
      provider: WebAccountProvider?,
      scope: String?,
      clientId: String?
    ): WebTokenRequest? {
      val fnPtr = _990837149_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebTokenRequest>()
      val hr = fn.invokeHR(arrayOf(__990837149_Ptr, marshalToNative(provider),
          marshalToNative(scope), marshalToNative(clientId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebTokenRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithPromptType(
      provider: WebAccountProvider?,
      scope: String?,
      clientId: String?,
      promptType: WebTokenRequestPromptType?
    ): WebTokenRequest? {
      val fnPtr = _990837149_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebTokenRequest>()
      val hr = fn.invokeHR(arrayOf(__990837149_Ptr, marshalToNative(provider),
          marshalToNative(scope), marshalToNative(clientId), marshalToNative(promptType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebTokenRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateWithProvider(provider: WebAccountProvider?): WebTokenRequest? {
      val fnPtr = _990837149_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebTokenRequest>()
      val hr = fn.invokeHR(arrayOf(__990837149_Ptr, marshalToNative(provider), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebTokenRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateWithScope(provider: WebAccountProvider?, scope: String?):
        WebTokenRequest? {
      val fnPtr = _990837149_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebTokenRequest>()
      val hr = fn.invokeHR(arrayOf(__990837149_Ptr, marshalToNative(provider),
          marshalToNative(scope), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebTokenRequest>(result.getValue())
      return resultValue
    }
  }

  public class IWebTokenRequestFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __990837149_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebTokenRequestFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6cf2141c0ff04c67b84f99ddbe4a72c9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebTokenRequestFactory(ptr: Pointer?): WithDefault =
        IWebTokenRequestFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebTokenRequestFactory {
      val address = segment.toRawLongValue()
      return makeIWebTokenRequestFactory(Pointer(address))
    }

    public override fun toNative(obj: IWebTokenRequestFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__990837149_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebTokenRequestFactory): Array<IWebTokenRequestFactory?>
        = (elements as
        Array<IWebTokenRequestFactory?>).castToImpl<IWebTokenRequestFactory,IWebTokenRequestFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebTokenRequestFactory?> =
        arrayOfNulls<IWebTokenRequestFactory_Impl>(size) as Array<IWebTokenRequestFactory?>
  }
}
