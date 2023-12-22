package Windows.Networking.NetworkOperators

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MobileBroadbandNetworkRegistrationStateChangeTriggerDetails.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandNetworkRegistrationStateChangeTriggerDetails;{89135cff-28b8-46aa-b137-1c4b0f21edfe})")
@WinRTByReference(brClass =
    MobileBroadbandNetworkRegistrationStateChangeTriggerDetails.ByReference::class)
public class MobileBroadbandNetworkRegistrationStateChangeTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandNetworkRegistrationStateChangeTriggerDetails.WithDefault,
    IWinRTObject {
  private val __274930528_Interface:
      IMobileBroadbandNetworkRegistrationStateChangeTriggerDetails.WithDefault by lazy {
    as_274930528()
  }


  public override val __274930528_Ptr: JNAPointer? by lazy {
    __274930528_Interface.__274930528_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__274930528_Interface)

  private fun as_274930528():
      IMobileBroadbandNetworkRegistrationStateChangeTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandNetworkRegistrationStateChangeTriggerDetails.ABI.makeIMobileBroadbandNetworkRegistrationStateChangeTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandNetworkRegistrationStateChangeTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandNetworkRegistrationStateChangeTriggerDetails.ABI.makeIMobileBroadbandNetworkRegistrationStateChangeTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandNetworkRegistrationStateChangeTriggerDetails> {
    public override fun getValue() =
        MobileBroadbandNetworkRegistrationStateChangeTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandNetworkRegistrationStateChangeTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandNetworkRegistrationStateChangeTriggerDetails,
      MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MobileBroadbandNetworkRegistrationStateChangeTriggerDetails {
      val address = segment.toRawLongValue()
      return MobileBroadbandNetworkRegistrationStateChangeTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandNetworkRegistrationStateChangeTriggerDetails):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
