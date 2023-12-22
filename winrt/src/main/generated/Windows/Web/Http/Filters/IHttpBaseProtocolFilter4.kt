package Windows.Web.Http.Filters

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IHttpBaseProtocolFilter4.ABI::class)
@Signature("{9fe36ccf-2983-4893-941f-eb518ca8cef9}")
@Guid("9fe36ccf29834893941feb518ca8cef9")
@WinRTInterface("9fe36ccf29834893941feb518ca8cef9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpBaseProtocolFilter4.ByReference::class)
public interface IHttpBaseProtocolFilter4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_ServerCustomValidationRequested(handler: TypedEventHandler<HttpBaseProtocolFilter?,
      HttpServerCustomValidationRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_ServerCustomValidationRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun ClearAuthenticationCache(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpBaseProtocolFilter4> {
    public override fun getValue() = ABI.makeIHttpBaseProtocolFilter4(pointer.getPointer(0))

    public fun setValue(value: IHttpBaseProtocolFilter4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpBaseProtocolFilter4 {
    public val __2000684548_Ptr: Pointer?

    public val _2000684548_VtblPtr: Pointer?
      get() = __2000684548_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_ServerCustomValidationRequested(handler: TypedEventHandler<HttpBaseProtocolFilter?,
        HttpServerCustomValidationRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2000684548_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2000684548_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_ServerCustomValidationRequested(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _2000684548_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2000684548_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun ClearAuthenticationCache(): Unit {
      val fnPtr = _2000684548_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2000684548_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHttpBaseProtocolFilter4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2000684548_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpBaseProtocolFilter4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9fe36ccf29834893941feb518ca8cef9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpBaseProtocolFilter4(ptr: Pointer?): WithDefault =
        IHttpBaseProtocolFilter4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpBaseProtocolFilter4 {
      val address = segment.toRawLongValue()
      return makeIHttpBaseProtocolFilter4(Pointer(address))
    }

    public override fun toNative(obj: IHttpBaseProtocolFilter4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2000684548_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpBaseProtocolFilter4):
        Array<IHttpBaseProtocolFilter4?> = (elements as
        Array<IHttpBaseProtocolFilter4?>).castToImpl<IHttpBaseProtocolFilter4,IHttpBaseProtocolFilter4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpBaseProtocolFilter4?> =
        arrayOfNulls<IHttpBaseProtocolFilter4_Impl>(size) as Array<IHttpBaseProtocolFilter4?>
  }
}
