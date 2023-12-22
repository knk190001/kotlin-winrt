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

@ABIMarker(NetworkOperatorDataUsageTriggerDetails.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.NetworkOperatorDataUsageTriggerDetails;{50e3126d-a465-4eeb-9317-28a167630cea})")
@WinRTByReference(brClass = NetworkOperatorDataUsageTriggerDetails.ByReference::class)
public class NetworkOperatorDataUsageTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INetworkOperatorDataUsageTriggerDetails.WithDefault, IWinRTObject {
  private val __1541749944_Interface: INetworkOperatorDataUsageTriggerDetails.WithDefault by lazy {
    as_1541749944()
  }


  public override val __1541749944_Ptr: JNAPointer? by lazy {
    __1541749944_Interface.__1541749944_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1541749944_Interface)

  private fun as_1541749944(): INetworkOperatorDataUsageTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(INetworkOperatorDataUsageTriggerDetails.ABI.makeINetworkOperatorDataUsageTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INetworkOperatorDataUsageTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INetworkOperatorDataUsageTriggerDetails.ABI.makeINetworkOperatorDataUsageTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NetworkOperatorDataUsageTriggerDetails> {
    public override fun getValue() = NetworkOperatorDataUsageTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: NetworkOperatorDataUsageTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NetworkOperatorDataUsageTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): NetworkOperatorDataUsageTriggerDetails {
      val address = segment.toRawLongValue()
      return NetworkOperatorDataUsageTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: NetworkOperatorDataUsageTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
