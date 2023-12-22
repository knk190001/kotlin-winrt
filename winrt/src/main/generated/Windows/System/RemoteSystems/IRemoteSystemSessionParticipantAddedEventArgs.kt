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

@ABIMarker(IRemoteSystemSessionParticipantAddedEventArgs.ABI::class)
@Signature("{d35a57d8-c9a1-4bb7-b6b0-79bb91adf93d}")
@Guid("d35a57d8c9a14bb7b6b079bb91adf93d")
@WinRTInterface("d35a57d8c9a14bb7b6b079bb91adf93d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemSessionParticipantAddedEventArgs.ByReference::class)
public interface IRemoteSystemSessionParticipantAddedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Participant(): RemoteSystemSessionParticipant?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemSessionParticipantAddedEventArgs> {
    public override fun getValue() =
        ABI.makeIRemoteSystemSessionParticipantAddedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemSessionParticipantAddedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemSessionParticipantAddedEventArgs {
    public val __544233672_Ptr: Pointer?

    public val _544233672_VtblPtr: Pointer?
      get() = __544233672_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Participant(): RemoteSystemSessionParticipant? {
      val fnPtr = _544233672_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemSessionParticipant>()
      val hr = fn.invokeHR(arrayOf(__544233672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemSessionParticipant>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemSessionParticipantAddedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __544233672_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemSessionParticipantAddedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d35a57d8c9a14bb7b6b079bb91adf93d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemSessionParticipantAddedEventArgs(ptr: Pointer?): WithDefault =
        IRemoteSystemSessionParticipantAddedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IRemoteSystemSessionParticipantAddedEventArgs {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemSessionParticipantAddedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemSessionParticipantAddedEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__544233672_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemSessionParticipantAddedEventArgs):
        Array<IRemoteSystemSessionParticipantAddedEventArgs?> = (elements as
        Array<IRemoteSystemSessionParticipantAddedEventArgs?>).castToImpl<IRemoteSystemSessionParticipantAddedEventArgs,IRemoteSystemSessionParticipantAddedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemSessionParticipantAddedEventArgs?> =
        arrayOfNulls<IRemoteSystemSessionParticipantAddedEventArgs_Impl>(size) as
        Array<IRemoteSystemSessionParticipantAddedEventArgs?>
  }
}
