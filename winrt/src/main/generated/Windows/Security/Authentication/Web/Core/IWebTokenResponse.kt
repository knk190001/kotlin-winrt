package Windows.Security.Authentication.Web.Core

import Windows.Foundation.Collections.IMap
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

@ABIMarker(IWebTokenResponse.ABI::class)
@Signature("{67a7c5ca-83f6-44c6-a3b1-0eb69e41fa8a}")
@Guid("67a7c5ca83f644c6a3b10eb69e41fa8a")
@WinRTInterface("67a7c5ca83f644c6a3b10eb69e41fa8a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebTokenResponse.ByReference::class)
public interface IWebTokenResponse : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Token(): String?

  @InterfaceMethod(1)
  public fun get_ProviderError(): WebProviderError?

  @InterfaceMethod(2)
  public fun get_WebAccount(): WebAccount?

  @InterfaceMethod(3)
  public fun get_Properties(): IMap<String?, String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebTokenResponse> {
    public override fun getValue() = ABI.makeIWebTokenResponse(pointer.getPointer(0))

    public fun setValue(value: IWebTokenResponse_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebTokenResponse {
    public val __1247402013_Ptr: Pointer?

    public val _1247402013_VtblPtr: Pointer?
      get() = __1247402013_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Token(): String? {
      val fnPtr = _1247402013_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1247402013_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ProviderError(): WebProviderError? {
      val fnPtr = _1247402013_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebProviderError>()
      val hr = fn.invokeHR(arrayOf(__1247402013_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebProviderError>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_WebAccount(): WebAccount? {
      val fnPtr = _1247402013_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebAccount>()
      val hr = fn.invokeHR(arrayOf(__1247402013_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebAccount>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Properties(): IMap<String?, String?>? {
      val fnPtr = _1247402013_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, String?>>()
      val hr = fn.invokeHR(arrayOf(__1247402013_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?, String?>>(result.getValue())
      return resultValue
    }
  }

  public class IWebTokenResponse_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1247402013_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebTokenResponse, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("67a7c5ca83f644c6a3b10eb69e41fa8a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebTokenResponse(ptr: Pointer?): WithDefault = IWebTokenResponse_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebTokenResponse {
      val address = segment.toRawLongValue()
      return makeIWebTokenResponse(Pointer(address))
    }

    public override fun toNative(obj: IWebTokenResponse): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1247402013_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebTokenResponse): Array<IWebTokenResponse?> = (elements
        as Array<IWebTokenResponse?>).castToImpl<IWebTokenResponse,IWebTokenResponse_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebTokenResponse?> =
        arrayOfNulls<IWebTokenResponse_Impl>(size) as Array<IWebTokenResponse?>
  }
}
