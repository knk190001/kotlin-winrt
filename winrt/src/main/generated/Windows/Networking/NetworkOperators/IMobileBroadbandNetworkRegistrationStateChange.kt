package Windows.Networking.NetworkOperators

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

@ABIMarker(IMobileBroadbandNetworkRegistrationStateChange.ABI::class)
@Signature("{beaf94e1-960f-49b4-a08d-7d85e968c7ec}")
@Guid("beaf94e1960f49b4a08d7d85e968c7ec")
@WinRTInterface("beaf94e1960f49b4a08d7d85e968c7ec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandNetworkRegistrationStateChange.ByReference::class)
public interface IMobileBroadbandNetworkRegistrationStateChange : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_Network(): MobileBroadbandNetwork?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandNetworkRegistrationStateChange> {
    public override fun getValue() =
        ABI.makeIMobileBroadbandNetworkRegistrationStateChange(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandNetworkRegistrationStateChange_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandNetworkRegistrationStateChange {
    public val __1611122774_Ptr: Pointer?

    public val _1611122774_VtblPtr: Pointer?
      get() = __1611122774_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1611122774_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1611122774_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Network(): MobileBroadbandNetwork? {
      val fnPtr = _1611122774_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandNetwork>()
      val hr = fn.invokeHR(arrayOf(__1611122774_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandNetwork>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandNetworkRegistrationStateChange_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1611122774_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandNetworkRegistrationStateChange, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("beaf94e1960f49b4a08d7d85e968c7ec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandNetworkRegistrationStateChange(ptr: Pointer?): WithDefault =
        IMobileBroadbandNetworkRegistrationStateChange_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMobileBroadbandNetworkRegistrationStateChange {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandNetworkRegistrationStateChange(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandNetworkRegistrationStateChange): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1611122774_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandNetworkRegistrationStateChange):
        Array<IMobileBroadbandNetworkRegistrationStateChange?> = (elements as
        Array<IMobileBroadbandNetworkRegistrationStateChange?>).castToImpl<IMobileBroadbandNetworkRegistrationStateChange,IMobileBroadbandNetworkRegistrationStateChange_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandNetworkRegistrationStateChange?> =
        arrayOfNulls<IMobileBroadbandNetworkRegistrationStateChange_Impl>(size) as
        Array<IMobileBroadbandNetworkRegistrationStateChange?>
  }
}
