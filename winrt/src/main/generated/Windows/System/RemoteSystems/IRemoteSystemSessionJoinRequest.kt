package Windows.System.RemoteSystems

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

@ABIMarker(IRemoteSystemSessionJoinRequest.ABI::class)
@Signature("{20600068-7994-4331-86d1-d89d882585ee}")
@Guid("206000687994433186d1d89d882585ee")
@WinRTInterface("206000687994433186d1d89d882585ee")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemSessionJoinRequest.ByReference::class)
public interface IRemoteSystemSessionJoinRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Participant(): RemoteSystemSessionParticipant?

  @InterfaceMethod(1)
  public fun Accept(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemSessionJoinRequest> {
    public override fun getValue() = ABI.makeIRemoteSystemSessionJoinRequest(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemSessionJoinRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemSessionJoinRequest {
    public val __1046100029_Ptr: Pointer?

    public val _1046100029_VtblPtr: Pointer?
      get() = __1046100029_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Participant(): RemoteSystemSessionParticipant? {
      val fnPtr = _1046100029_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemSessionParticipant>()
      val hr = fn.invokeHR(arrayOf(__1046100029_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemSessionParticipant>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Accept(): Unit {
      val fnPtr = _1046100029_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1046100029_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRemoteSystemSessionJoinRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1046100029_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemSessionJoinRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("206000687994433186d1d89d882585ee")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemSessionJoinRequest(ptr: Pointer?): WithDefault =
        IRemoteSystemSessionJoinRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemSessionJoinRequest {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemSessionJoinRequest(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemSessionJoinRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1046100029_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemSessionJoinRequest):
        Array<IRemoteSystemSessionJoinRequest?> = (elements as
        Array<IRemoteSystemSessionJoinRequest?>).castToImpl<IRemoteSystemSessionJoinRequest,IRemoteSystemSessionJoinRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemSessionJoinRequest?> =
        arrayOfNulls<IRemoteSystemSessionJoinRequest_Impl>(size) as
        Array<IRemoteSystemSessionJoinRequest?>
  }
}
