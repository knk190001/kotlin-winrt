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

@ABIMarker(IRemoteSystemSessionInvitationReceivedEventArgs.ABI::class)
@Signature("{5e964a2d-a10d-4edb-8dea-54d20ac19543}")
@Guid("5e964a2da10d4edb8dea54d20ac19543")
@WinRTInterface("5e964a2da10d4edb8dea54d20ac19543")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemSessionInvitationReceivedEventArgs.ByReference::class)
public interface IRemoteSystemSessionInvitationReceivedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Invitation(): RemoteSystemSessionInvitation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemSessionInvitationReceivedEventArgs> {
    public override fun getValue() =
        ABI.makeIRemoteSystemSessionInvitationReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemSessionInvitationReceivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemSessionInvitationReceivedEventArgs {
    public val __1217105115_Ptr: Pointer?

    public val _1217105115_VtblPtr: Pointer?
      get() = __1217105115_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Invitation(): RemoteSystemSessionInvitation? {
      val fnPtr = _1217105115_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemSessionInvitation>()
      val hr = fn.invokeHR(arrayOf(__1217105115_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemSessionInvitation>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemSessionInvitationReceivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1217105115_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemSessionInvitationReceivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5e964a2da10d4edb8dea54d20ac19543")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemSessionInvitationReceivedEventArgs(ptr: Pointer?): WithDefault =
        IRemoteSystemSessionInvitationReceivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IRemoteSystemSessionInvitationReceivedEventArgs {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemSessionInvitationReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemSessionInvitationReceivedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1217105115_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemSessionInvitationReceivedEventArgs):
        Array<IRemoteSystemSessionInvitationReceivedEventArgs?> = (elements as
        Array<IRemoteSystemSessionInvitationReceivedEventArgs?>).castToImpl<IRemoteSystemSessionInvitationReceivedEventArgs,IRemoteSystemSessionInvitationReceivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemSessionInvitationReceivedEventArgs?>
        = arrayOfNulls<IRemoteSystemSessionInvitationReceivedEventArgs_Impl>(size) as
        Array<IRemoteSystemSessionInvitationReceivedEventArgs?>
  }
}
