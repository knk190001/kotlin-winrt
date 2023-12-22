package Windows.Security.Authentication.OnlineId

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

@ABIMarker(IOnlineIdServiceTicketRequest.ABI::class)
@Signature("{297445d3-fb63-4135-8909-4e354c061466}")
@Guid("297445d3fb63413589094e354c061466")
@WinRTInterface("297445d3fb63413589094e354c061466")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOnlineIdServiceTicketRequest.ByReference::class)
public interface IOnlineIdServiceTicketRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Service(): String?

  @InterfaceMethod(1)
  public fun get_Policy(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOnlineIdServiceTicketRequest> {
    public override fun getValue() = ABI.makeIOnlineIdServiceTicketRequest(pointer.getPointer(0))

    public fun setValue(value: IOnlineIdServiceTicketRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOnlineIdServiceTicketRequest {
    public val __585723524_Ptr: Pointer?

    public val _585723524_VtblPtr: Pointer?
      get() = __585723524_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Service(): String? {
      val fnPtr = _585723524_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__585723524_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Policy(): String? {
      val fnPtr = _585723524_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__585723524_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IOnlineIdServiceTicketRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __585723524_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOnlineIdServiceTicketRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("297445d3fb63413589094e354c061466")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOnlineIdServiceTicketRequest(ptr: Pointer?): WithDefault =
        IOnlineIdServiceTicketRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOnlineIdServiceTicketRequest {
      val address = segment.toRawLongValue()
      return makeIOnlineIdServiceTicketRequest(Pointer(address))
    }

    public override fun toNative(obj: IOnlineIdServiceTicketRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__585723524_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOnlineIdServiceTicketRequest):
        Array<IOnlineIdServiceTicketRequest?> = (elements as
        Array<IOnlineIdServiceTicketRequest?>).castToImpl<IOnlineIdServiceTicketRequest,IOnlineIdServiceTicketRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOnlineIdServiceTicketRequest?> =
        arrayOfNulls<IOnlineIdServiceTicketRequest_Impl>(size) as
        Array<IOnlineIdServiceTicketRequest?>
  }
}
