package Windows.System.RemoteSystems

import Windows.System.User
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

@ABIMarker(IRemoteSystemAppRegistrationStatics.ABI::class)
@Signature("{01b99840-cfd2-453f-ae25-c2539f086afd}")
@Guid("01b99840cfd2453fae25c2539f086afd")
@WinRTInterface("01b99840cfd2453fae25c2539f086afd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemAppRegistrationStatics.ByReference::class)
public interface IRemoteSystemAppRegistrationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): RemoteSystemAppRegistration?

  @InterfaceMethod(1)
  public fun GetForUser(user: User?): RemoteSystemAppRegistration?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemAppRegistrationStatics> {
    public override fun getValue() =
        ABI.makeIRemoteSystemAppRegistrationStatics(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemAppRegistrationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemAppRegistrationStatics {
    public val __292018913_Ptr: Pointer?

    public val _292018913_VtblPtr: Pointer?
      get() = __292018913_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): RemoteSystemAppRegistration? {
      val fnPtr = _292018913_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemAppRegistration>()
      val hr = fn.invokeHR(arrayOf(__292018913_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemAppRegistration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetForUser(user: User?): RemoteSystemAppRegistration? {
      val fnPtr = _292018913_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemAppRegistration>()
      val hr = fn.invokeHR(arrayOf(__292018913_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemAppRegistration>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemAppRegistrationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __292018913_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemAppRegistrationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("01b99840cfd2453fae25c2539f086afd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemAppRegistrationStatics(ptr: Pointer?): WithDefault =
        IRemoteSystemAppRegistrationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemAppRegistrationStatics {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemAppRegistrationStatics(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemAppRegistrationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__292018913_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemAppRegistrationStatics):
        Array<IRemoteSystemAppRegistrationStatics?> = (elements as
        Array<IRemoteSystemAppRegistrationStatics?>).castToImpl<IRemoteSystemAppRegistrationStatics,IRemoteSystemAppRegistrationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemAppRegistrationStatics?> =
        arrayOfNulls<IRemoteSystemAppRegistrationStatics_Impl>(size) as
        Array<IRemoteSystemAppRegistrationStatics?>
  }
}
