package Windows.Networking.NetworkOperators

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IMobileBroadbandNetworkRegistrationStateChangeTriggerDetails.ABI::class)
@Signature("{89135cff-28b8-46aa-b137-1c4b0f21edfe}")
@Guid("89135cff28b846aab1371c4b0f21edfe")
@WinRTInterface("89135cff28b846aab1371c4b0f21edfe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    IMobileBroadbandNetworkRegistrationStateChangeTriggerDetails.ByReference::class)
public interface IMobileBroadbandNetworkRegistrationStateChangeTriggerDetails : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NetworkRegistrationStateChanges():
      IVectorView<MobileBroadbandNetworkRegistrationStateChange?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandNetworkRegistrationStateChangeTriggerDetails> {
    public override fun getValue() =
        ABI.makeIMobileBroadbandNetworkRegistrationStateChangeTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandNetworkRegistrationStateChangeTriggerDetails_Impl):
        Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandNetworkRegistrationStateChangeTriggerDetails {
    public val __274930528_Ptr: Pointer?

    public val _274930528_VtblPtr: Pointer?
      get() = __274930528_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NetworkRegistrationStateChanges():
        IVectorView<MobileBroadbandNetworkRegistrationStateChange?>? {
      val fnPtr = _274930528_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IVectorView<MobileBroadbandNetworkRegistrationStateChange?>>()
      val hr = fn.invokeHR(arrayOf(__274930528_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<MobileBroadbandNetworkRegistrationStateChange?>>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandNetworkRegistrationStateChangeTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __274930528_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandNetworkRegistrationStateChangeTriggerDetails,
      MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("89135cff28b846aab1371c4b0f21edfe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandNetworkRegistrationStateChangeTriggerDetails(ptr: Pointer?):
        WithDefault = IMobileBroadbandNetworkRegistrationStateChangeTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMobileBroadbandNetworkRegistrationStateChangeTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandNetworkRegistrationStateChangeTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandNetworkRegistrationStateChangeTriggerDetails):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__274930528_Ptr))
  }

  public companion object {
    public fun makeArray(vararg
        elements: IMobileBroadbandNetworkRegistrationStateChangeTriggerDetails):
        Array<IMobileBroadbandNetworkRegistrationStateChangeTriggerDetails?> = (elements as
        Array<IMobileBroadbandNetworkRegistrationStateChangeTriggerDetails?>).castToImpl<IMobileBroadbandNetworkRegistrationStateChangeTriggerDetails,IMobileBroadbandNetworkRegistrationStateChangeTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IMobileBroadbandNetworkRegistrationStateChangeTriggerDetails?> =
        arrayOfNulls<IMobileBroadbandNetworkRegistrationStateChangeTriggerDetails_Impl>(size) as
        Array<IMobileBroadbandNetworkRegistrationStateChangeTriggerDetails?>
  }
}
