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

@ABIMarker(IRemoteSystemSessionParticipantRemovedEventArgs.ABI::class)
@Signature("{866ef088-de68-4abf-88a1-f90d16274192}")
@Guid("866ef088de684abf88a1f90d16274192")
@WinRTInterface("866ef088de684abf88a1f90d16274192")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemSessionParticipantRemovedEventArgs.ByReference::class)
public interface IRemoteSystemSessionParticipantRemovedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Participant(): RemoteSystemSessionParticipant?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemSessionParticipantRemovedEventArgs> {
    public override fun getValue() =
        ABI.makeIRemoteSystemSessionParticipantRemovedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemSessionParticipantRemovedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemSessionParticipantRemovedEventArgs {
    public val __1072684328_Ptr: Pointer?

    public val _1072684328_VtblPtr: Pointer?
      get() = __1072684328_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Participant(): RemoteSystemSessionParticipant? {
      val fnPtr = _1072684328_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemSessionParticipant>()
      val hr = fn.invokeHR(arrayOf(__1072684328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemSessionParticipant>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemSessionParticipantRemovedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1072684328_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemSessionParticipantRemovedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("866ef088de684abf88a1f90d16274192")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemSessionParticipantRemovedEventArgs(ptr: Pointer?): WithDefault =
        IRemoteSystemSessionParticipantRemovedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IRemoteSystemSessionParticipantRemovedEventArgs {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemSessionParticipantRemovedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemSessionParticipantRemovedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1072684328_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemSessionParticipantRemovedEventArgs):
        Array<IRemoteSystemSessionParticipantRemovedEventArgs?> = (elements as
        Array<IRemoteSystemSessionParticipantRemovedEventArgs?>).castToImpl<IRemoteSystemSessionParticipantRemovedEventArgs,IRemoteSystemSessionParticipantRemovedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemSessionParticipantRemovedEventArgs?>
        = arrayOfNulls<IRemoteSystemSessionParticipantRemovedEventArgs_Impl>(size) as
        Array<IRemoteSystemSessionParticipantRemovedEventArgs?>
  }
}
