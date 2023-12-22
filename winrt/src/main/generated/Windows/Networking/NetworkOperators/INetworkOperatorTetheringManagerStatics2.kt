package Windows.Networking.NetworkOperators

import Windows.Networking.Connectivity.ConnectionProfile
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

@ABIMarker(INetworkOperatorTetheringManagerStatics2.ABI::class)
@Signature("{5b235412-35f0-49e7-9b08-16d278fbaa42}")
@Guid("5b23541235f049e79b0816d278fbaa42")
@WinRTInterface("5b23541235f049e79b0816d278fbaa42")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INetworkOperatorTetheringManagerStatics2.ByReference::class)
public interface INetworkOperatorTetheringManagerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetTetheringCapabilityFromConnectionProfile(profile: ConnectionProfile?):
      TetheringCapability?

  @InterfaceMethod(1)
  public fun CreateFromConnectionProfile(profile: ConnectionProfile?):
      NetworkOperatorTetheringManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INetworkOperatorTetheringManagerStatics2> {
    public override fun getValue() =
        ABI.makeINetworkOperatorTetheringManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: INetworkOperatorTetheringManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INetworkOperatorTetheringManagerStatics2 {
    public val __15717853_Ptr: Pointer?

    public val _15717853_VtblPtr: Pointer?
      get() = __15717853_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetTetheringCapabilityFromConnectionProfile(profile: ConnectionProfile?):
        TetheringCapability? {
      val fnPtr = _15717853_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TetheringCapability>()
      val hr = fn.invokeHR(arrayOf(__15717853_Ptr, marshalToNative(profile), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TetheringCapability>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromConnectionProfile(profile: ConnectionProfile?):
        NetworkOperatorTetheringManager? {
      val fnPtr = _15717853_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NetworkOperatorTetheringManager>()
      val hr = fn.invokeHR(arrayOf(__15717853_Ptr, marshalToNative(profile), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NetworkOperatorTetheringManager>(result.getValue())
      return resultValue
    }
  }

  public class INetworkOperatorTetheringManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __15717853_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INetworkOperatorTetheringManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5b23541235f049e79b0816d278fbaa42")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINetworkOperatorTetheringManagerStatics2(ptr: Pointer?): WithDefault =
        INetworkOperatorTetheringManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        INetworkOperatorTetheringManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeINetworkOperatorTetheringManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: INetworkOperatorTetheringManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__15717853_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INetworkOperatorTetheringManagerStatics2):
        Array<INetworkOperatorTetheringManagerStatics2?> = (elements as
        Array<INetworkOperatorTetheringManagerStatics2?>).castToImpl<INetworkOperatorTetheringManagerStatics2,INetworkOperatorTetheringManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INetworkOperatorTetheringManagerStatics2?> =
        arrayOfNulls<INetworkOperatorTetheringManagerStatics2_Impl>(size) as
        Array<INetworkOperatorTetheringManagerStatics2?>
  }
}
