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

@ABIMarker(IOnlineIdServiceTicketRequestFactory.ABI::class)
@Signature("{bebb0a08-9e73-4077-9614-08614c0bc245}")
@Guid("bebb0a089e734077961408614c0bc245")
@WinRTInterface("bebb0a089e734077961408614c0bc245")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOnlineIdServiceTicketRequestFactory.ByReference::class)
public interface IOnlineIdServiceTicketRequestFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateOnlineIdServiceTicketRequest(service: String?, policy: String?):
      OnlineIdServiceTicketRequest?

  @InterfaceMethod(1)
  public fun CreateOnlineIdServiceTicketRequestAdvanced(service: String?):
      OnlineIdServiceTicketRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOnlineIdServiceTicketRequestFactory> {
    public override fun getValue() =
        ABI.makeIOnlineIdServiceTicketRequestFactory(pointer.getPointer(0))

    public fun setValue(value: IOnlineIdServiceTicketRequestFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOnlineIdServiceTicketRequestFactory {
    public val __394412570_Ptr: Pointer?

    public val _394412570_VtblPtr: Pointer?
      get() = __394412570_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateOnlineIdServiceTicketRequest(service: String?, policy: String?):
        OnlineIdServiceTicketRequest? {
      val fnPtr = _394412570_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<OnlineIdServiceTicketRequest>()
      val hr = fn.invokeHR(arrayOf(__394412570_Ptr, marshalToNative(service),
          marshalToNative(policy), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<OnlineIdServiceTicketRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateOnlineIdServiceTicketRequestAdvanced(service: String?):
        OnlineIdServiceTicketRequest? {
      val fnPtr = _394412570_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<OnlineIdServiceTicketRequest>()
      val hr = fn.invokeHR(arrayOf(__394412570_Ptr, marshalToNative(service), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<OnlineIdServiceTicketRequest>(result.getValue())
      return resultValue
    }
  }

  public class IOnlineIdServiceTicketRequestFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __394412570_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOnlineIdServiceTicketRequestFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bebb0a089e734077961408614c0bc245")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOnlineIdServiceTicketRequestFactory(ptr: Pointer?): WithDefault =
        IOnlineIdServiceTicketRequestFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOnlineIdServiceTicketRequestFactory {
      val address = segment.toRawLongValue()
      return makeIOnlineIdServiceTicketRequestFactory(Pointer(address))
    }

    public override fun toNative(obj: IOnlineIdServiceTicketRequestFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__394412570_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOnlineIdServiceTicketRequestFactory):
        Array<IOnlineIdServiceTicketRequestFactory?> = (elements as
        Array<IOnlineIdServiceTicketRequestFactory?>).castToImpl<IOnlineIdServiceTicketRequestFactory,IOnlineIdServiceTicketRequestFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOnlineIdServiceTicketRequestFactory?> =
        arrayOfNulls<IOnlineIdServiceTicketRequestFactory_Impl>(size) as
        Array<IOnlineIdServiceTicketRequestFactory?>
  }
}
