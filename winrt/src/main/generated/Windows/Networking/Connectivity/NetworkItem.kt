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

@ABIMarker(NetworkItem.ABI::class)
@Signature("rc(Windows.Networking.Connectivity.NetworkItem;{01bc4d39-f5e0-4567-a28c-42080c831b2b})")
@WinRTByReference(brClass = NetworkItem.ByReference::class)
public class NetworkItem(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INetworkItem.WithDefault, IWinRTObject {
  private val __1193680190_Interface: INetworkItem.WithDefault by lazy {
    as_1193680190()
  }


  public override val __1193680190_Ptr: JNAPointer? by lazy {
    __1193680190_Interface.__1193680190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1193680190_Interface)

  private fun as_1193680190(): INetworkItem.WithDefault {
    if(pointer == NULL) {
      return(INetworkItem.ABI.makeINetworkItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INetworkItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INetworkItem.ABI.makeINetworkItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<NetworkItem> {
    public override fun getValue() = NetworkItem(pointer.getPointer(0))

    public fun setValue(value: NetworkItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NetworkItem, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): NetworkItem {
      val address = segment.toRawLongValue()
      return NetworkItem(Pointer(address))
    }

    public override fun toNative(obj: NetworkItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
