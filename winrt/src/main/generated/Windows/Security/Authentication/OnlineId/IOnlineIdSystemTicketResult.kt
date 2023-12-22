package Windows.Security.Authentication.OnlineId

import Windows.Foundation.HResult
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

@ABIMarker(IOnlineIdSystemTicketResult.ABI::class)
@Signature("{db0a5ff8-b098-4acd-9d13-9e640652b5b6}")
@Guid("db0a5ff8b0984acd9d139e640652b5b6")
@WinRTInterface("db0a5ff8b0984acd9d139e640652b5b6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOnlineIdSystemTicketResult.ByReference::class)
public interface IOnlineIdSystemTicketResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Identity(): OnlineIdSystemIdentity?

  @InterfaceMethod(1)
  public fun get_Status(): OnlineIdSystemTicketStatus?

  @InterfaceMethod(2)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOnlineIdSystemTicketResult> {
    public override fun getValue() = ABI.makeIOnlineIdSystemTicketResult(pointer.getPointer(0))

    public fun setValue(value: IOnlineIdSystemTicketResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOnlineIdSystemTicketResult {
    public val __815408914_Ptr: Pointer?

    public val _815408914_VtblPtr: Pointer?
      get() = __815408914_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Identity(): OnlineIdSystemIdentity? {
      val fnPtr = _815408914_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<OnlineIdSystemIdentity>()
      val hr = fn.invokeHR(arrayOf(__815408914_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<OnlineIdSystemIdentity>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Status(): OnlineIdSystemTicketStatus? {
      val fnPtr = _815408914_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<OnlineIdSystemTicketStatus>()
      val hr = fn.invokeHR(arrayOf(__815408914_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<OnlineIdSystemTicketStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _815408914_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__815408914_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IOnlineIdSystemTicketResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __815408914_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOnlineIdSystemTicketResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("db0a5ff8b0984acd9d139e640652b5b6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOnlineIdSystemTicketResult(ptr: Pointer?): WithDefault =
        IOnlineIdSystemTicketResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOnlineIdSystemTicketResult {
      val address = segment.toRawLongValue()
      return makeIOnlineIdSystemTicketResult(Pointer(address))
    }

    public override fun toNative(obj: IOnlineIdSystemTicketResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__815408914_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOnlineIdSystemTicketResult):
        Array<IOnlineIdSystemTicketResult?> = (elements as
        Array<IOnlineIdSystemTicketResult?>).castToImpl<IOnlineIdSystemTicketResult,IOnlineIdSystemTicketResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOnlineIdSystemTicketResult?> =
        arrayOfNulls<IOnlineIdSystemTicketResult_Impl>(size) as Array<IOnlineIdSystemTicketResult?>
  }
}
