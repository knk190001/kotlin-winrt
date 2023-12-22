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

@ABIMarker(NetworkOperatorTetheringClient.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.NetworkOperatorTetheringClient;{709d254c-595f-4847-bb30-646935542918})")
@WinRTByReference(brClass = NetworkOperatorTetheringClient.ByReference::class)
public class NetworkOperatorTetheringClient(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INetworkOperatorTetheringClient.WithDefault, IWinRTObject {
  private val __943117154_Interface: INetworkOperatorTetheringClient.WithDefault by lazy {
    as_943117154()
  }


  public override val __943117154_Ptr: JNAPointer? by lazy {
    __943117154_Interface.__943117154_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__943117154_Interface)

  private fun as_943117154(): INetworkOperatorTetheringClient.WithDefault {
    if(pointer == NULL) {
      return(INetworkOperatorTetheringClient.ABI.makeINetworkOperatorTetheringClient(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INetworkOperatorTetheringClient>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INetworkOperatorTetheringClient.ABI.makeINetworkOperatorTetheringClient(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NetworkOperatorTetheringClient> {
    public override fun getValue() = NetworkOperatorTetheringClient(pointer.getPointer(0))

    public fun setValue(value: NetworkOperatorTetheringClient): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NetworkOperatorTetheringClient, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): NetworkOperatorTetheringClient {
      val address = segment.toRawLongValue()
      return NetworkOperatorTetheringClient(Pointer(address))
    }

    public override fun toNative(obj: NetworkOperatorTetheringClient): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
