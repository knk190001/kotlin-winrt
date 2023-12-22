package Windows.Networking.Connectivity

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

@ABIMarker(NetworkStateChangeEventDetails.ABI::class)
@Signature("rc(Windows.Networking.Connectivity.NetworkStateChangeEventDetails;{1f0cf333-d7a6-44dd-a4e9-687c476b903d})")
@WinRTByReference(brClass = NetworkStateChangeEventDetails.ByReference::class)
public class NetworkStateChangeEventDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INetworkStateChangeEventDetails.WithDefault,
    INetworkStateChangeEventDetails2.WithDefault, IWinRTObject {
  private val __1455934338_Interface: INetworkStateChangeEventDetails.WithDefault by lazy {
    as_1455934338()
  }


  private val __2110675828_Interface: INetworkStateChangeEventDetails2.WithDefault by lazy {
    as_2110675828()
  }


  public override val __1455934338_Ptr: JNAPointer? by lazy {
    __1455934338_Interface.__1455934338_Ptr
  }


  public override val __2110675828_Ptr: JNAPointer? by lazy {
    __2110675828_Interface.__2110675828_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1455934338_Interface, __2110675828_Interface)

  private fun as_1455934338(): INetworkStateChangeEventDetails.WithDefault {
    if(pointer == NULL) {
      return(INetworkStateChangeEventDetails.ABI.makeINetworkStateChangeEventDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INetworkStateChangeEventDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INetworkStateChangeEventDetails.ABI.makeINetworkStateChangeEventDetails(ref.value))
  }

  private fun as_2110675828(): INetworkStateChangeEventDetails2.WithDefault {
    if(pointer == NULL) {
      return(INetworkStateChangeEventDetails2.ABI.makeINetworkStateChangeEventDetails2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INetworkStateChangeEventDetails2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INetworkStateChangeEventDetails2.ABI.makeINetworkStateChangeEventDetails2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NetworkStateChangeEventDetails> {
    public override fun getValue() = NetworkStateChangeEventDetails(pointer.getPointer(0))

    public fun setValue(value: NetworkStateChangeEventDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NetworkStateChangeEventDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): NetworkStateChangeEventDetails {
      val address = segment.toRawLongValue()
      return NetworkStateChangeEventDetails(Pointer(address))
    }

    public override fun toNative(obj: NetworkStateChangeEventDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
