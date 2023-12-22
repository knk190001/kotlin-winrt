package Windows.Security.Authentication.Web.Core

import Windows.Foundation.Collections.IMap
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

@ABIMarker(IWebTokenRequest.ABI::class)
@Signature("{b77b4d68-adcb-4673-b364-0cf7b35caf97}")
@Guid("b77b4d68adcb4673b3640cf7b35caf97")
@WinRTInterface("b77b4d68adcb4673b3640cf7b35caf97")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebTokenRequest.ByReference::class)
public interface IWebTokenRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_WebAccountProvider(): WebAccountProvider?

  @InterfaceMethod(1)
  public fun get_Scope(): String?

  @InterfaceMethod(2)
  public fun get_ClientId(): String?

  @InterfaceMethod(3)
  public fun get_PromptType(): WebTokenRequestPromptType?

  @InterfaceMethod(4)
  public fun get_Properties(): IMap<String?, String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebTokenRequest> {
    public override fun getValue() = ABI.makeIWebTokenRequest(pointer.getPointer(0))

    public fun setValue(value: IWebTokenRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebTokenRequest {
    public val __180493651_Ptr: Pointer?

    public val _180493651_VtblPtr: Pointer?
      get() = __180493651_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_WebAccountProvider(): WebAccountProvider? {
      val fnPtr = _180493651_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebAccountProvider>()
      val hr = fn.invokeHR(arrayOf(__180493651_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebAccountProvider>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Scope(): String? {
      val fnPtr = _180493651_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__180493651_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ClientId(): String? {
      val fnPtr = _180493651_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__180493651_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PromptType(): WebTokenRequestPromptType? {
      val fnPtr = _180493651_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebTokenRequestPromptType>()
      val hr = fn.invokeHR(arrayOf(__180493651_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebTokenRequestPromptType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Properties(): IMap<String?, String?>? {
      val fnPtr = _180493651_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, String?>>()
      val hr = fn.invokeHR(arrayOf(__180493651_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?, String?>>(result.getValue())
      return resultValue
    }
  }

  public class IWebTokenRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __180493651_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebTokenRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b77b4d68adcb4673b3640cf7b35caf97")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebTokenRequest(ptr: Pointer?): WithDefault = IWebTokenRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebTokenRequest {
      val address = segment.toRawLongValue()
      return makeIWebTokenRequest(Pointer(address))
    }

    public override fun toNative(obj: IWebTokenRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__180493651_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebTokenRequest): Array<IWebTokenRequest?> = (elements as
        Array<IWebTokenRequest?>).castToImpl<IWebTokenRequest,IWebTokenRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebTokenRequest?> =
        arrayOfNulls<IWebTokenRequest_Impl>(size) as Array<IWebTokenRequest?>
  }
}
