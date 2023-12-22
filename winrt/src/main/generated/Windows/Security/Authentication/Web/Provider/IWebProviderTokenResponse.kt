package Windows.Security.Authentication.Web.Provider

import Windows.Security.Authentication.Web.Core.WebTokenResponse
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

@ABIMarker(IWebProviderTokenResponse.ABI::class)
@Signature("{ef213793-ef55-4186-b7ce-8cb2e7f9849e}")
@Guid("ef213793ef554186b7ce8cb2e7f9849e")
@WinRTInterface("ef213793ef554186b7ce8cb2e7f9849e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebProviderTokenResponse.ByReference::class)
public interface IWebProviderTokenResponse : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ClientResponse(): WebTokenResponse?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebProviderTokenResponse> {
    public override fun getValue() = ABI.makeIWebProviderTokenResponse(pointer.getPointer(0))

    public fun setValue(value: IWebProviderTokenResponse_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebProviderTokenResponse {
    public val __777687264_Ptr: Pointer?

    public val _777687264_VtblPtr: Pointer?
      get() = __777687264_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ClientResponse(): WebTokenResponse? {
      val fnPtr = _777687264_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebTokenResponse>()
      val hr = fn.invokeHR(arrayOf(__777687264_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebTokenResponse>(result.getValue())
      return resultValue
    }
  }

  public class IWebProviderTokenResponse_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __777687264_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebProviderTokenResponse, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ef213793ef554186b7ce8cb2e7f9849e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebProviderTokenResponse(ptr: Pointer?): WithDefault =
        IWebProviderTokenResponse_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebProviderTokenResponse {
      val address = segment.toRawLongValue()
      return makeIWebProviderTokenResponse(Pointer(address))
    }

    public override fun toNative(obj: IWebProviderTokenResponse): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__777687264_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebProviderTokenResponse):
        Array<IWebProviderTokenResponse?> = (elements as
        Array<IWebProviderTokenResponse?>).castToImpl<IWebProviderTokenResponse,IWebProviderTokenResponse_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebProviderTokenResponse?> =
        arrayOfNulls<IWebProviderTokenResponse_Impl>(size) as Array<IWebProviderTokenResponse?>
  }
}
