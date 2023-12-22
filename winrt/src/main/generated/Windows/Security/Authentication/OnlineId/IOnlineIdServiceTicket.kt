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

@ABIMarker(IOnlineIdServiceTicket.ABI::class)
@Signature("{c95c547f-d781-4a94-acb8-c59874238c26}")
@Guid("c95c547fd7814a94acb8c59874238c26")
@WinRTInterface("c95c547fd7814a94acb8c59874238c26")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOnlineIdServiceTicket.ByReference::class)
public interface IOnlineIdServiceTicket : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Value(): String?

  @InterfaceMethod(1)
  public fun get_Request(): OnlineIdServiceTicketRequest?

  @InterfaceMethod(2)
  public fun get_ErrorCode(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOnlineIdServiceTicket> {
    public override fun getValue() = ABI.makeIOnlineIdServiceTicket(pointer.getPointer(0))

    public fun setValue(value: IOnlineIdServiceTicket_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOnlineIdServiceTicket {
    public val __1293638027_Ptr: Pointer?

    public val _1293638027_VtblPtr: Pointer?
      get() = __1293638027_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Value(): String? {
      val fnPtr = _1293638027_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1293638027_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Request(): OnlineIdServiceTicketRequest? {
      val fnPtr = _1293638027_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<OnlineIdServiceTicketRequest>()
      val hr = fn.invokeHR(arrayOf(__1293638027_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<OnlineIdServiceTicketRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ErrorCode(): Int {
      val fnPtr = _1293638027_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1293638027_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IOnlineIdServiceTicket_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1293638027_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOnlineIdServiceTicket, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c95c547fd7814a94acb8c59874238c26")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOnlineIdServiceTicket(ptr: Pointer?): WithDefault =
        IOnlineIdServiceTicket_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOnlineIdServiceTicket {
      val address = segment.toRawLongValue()
      return makeIOnlineIdServiceTicket(Pointer(address))
    }

    public override fun toNative(obj: IOnlineIdServiceTicket): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1293638027_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOnlineIdServiceTicket): Array<IOnlineIdServiceTicket?> =
        (elements as
        Array<IOnlineIdServiceTicket?>).castToImpl<IOnlineIdServiceTicket,IOnlineIdServiceTicket_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOnlineIdServiceTicket?> =
        arrayOfNulls<IOnlineIdServiceTicket_Impl>(size) as Array<IOnlineIdServiceTicket?>
  }
}
