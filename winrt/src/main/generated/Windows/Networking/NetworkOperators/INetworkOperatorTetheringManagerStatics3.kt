package Windows.Networking.NetworkOperators

import Windows.Networking.Connectivity.ConnectionProfile
import Windows.Networking.Connectivity.NetworkAdapter
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

@ABIMarker(INetworkOperatorTetheringManagerStatics3.ABI::class)
@Signature("{8fdaadb6-4af9-4f21-9b58-d53e9f24231e}")
@Guid("8fdaadb64af94f219b58d53e9f24231e")
@WinRTInterface("8fdaadb64af94f219b58d53e9f24231e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INetworkOperatorTetheringManagerStatics3.ByReference::class)
public interface INetworkOperatorTetheringManagerStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromConnectionProfile(profile: ConnectionProfile?, adapter: NetworkAdapter?):
      NetworkOperatorTetheringManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INetworkOperatorTetheringManagerStatics3> {
    public override fun getValue() =
        ABI.makeINetworkOperatorTetheringManagerStatics3(pointer.getPointer(0))

    public fun setValue(value: INetworkOperatorTetheringManagerStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INetworkOperatorTetheringManagerStatics3 {
    public val __15717852_Ptr: Pointer?

    public val _15717852_VtblPtr: Pointer?
      get() = __15717852_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromConnectionProfile(profile: ConnectionProfile?,
        adapter: NetworkAdapter?): NetworkOperatorTetheringManager? {
      val fnPtr = _15717852_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NetworkOperatorTetheringManager>()
      val hr = fn.invokeHR(arrayOf(__15717852_Ptr, marshalToNative(profile),
          marshalToNative(adapter), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NetworkOperatorTetheringManager>(result.getValue())
      return resultValue
    }
  }

  public class INetworkOperatorTetheringManagerStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __15717852_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INetworkOperatorTetheringManagerStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8fdaadb64af94f219b58d53e9f24231e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINetworkOperatorTetheringManagerStatics3(ptr: Pointer?): WithDefault =
        INetworkOperatorTetheringManagerStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        INetworkOperatorTetheringManagerStatics3 {
      val address = segment.toRawLongValue()
      return makeINetworkOperatorTetheringManagerStatics3(Pointer(address))
    }

    public override fun toNative(obj: INetworkOperatorTetheringManagerStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__15717852_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INetworkOperatorTetheringManagerStatics3):
        Array<INetworkOperatorTetheringManagerStatics3?> = (elements as
        Array<INetworkOperatorTetheringManagerStatics3?>).castToImpl<INetworkOperatorTetheringManagerStatics3,INetworkOperatorTetheringManagerStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INetworkOperatorTetheringManagerStatics3?> =
        arrayOfNulls<INetworkOperatorTetheringManagerStatics3_Impl>(size) as
        Array<INetworkOperatorTetheringManagerStatics3?>
  }
}
