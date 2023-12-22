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

@ABIMarker(NetworkAdapter.ABI::class)
@Signature("rc(Windows.Networking.Connectivity.NetworkAdapter;{3b542e03-5388-496c-a8a3-affd39aec2e6})")
@WinRTByReference(brClass = NetworkAdapter.ByReference::class)
public class NetworkAdapter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INetworkAdapter.WithDefault, IWinRTObject {
  private val __374321852_Interface: INetworkAdapter.WithDefault by lazy {
    as_374321852()
  }


  public override val __374321852_Ptr: JNAPointer? by lazy {
    __374321852_Interface.__374321852_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__374321852_Interface)

  private fun as_374321852(): INetworkAdapter.WithDefault {
    if(pointer == NULL) {
      return(INetworkAdapter.ABI.makeINetworkAdapter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INetworkAdapter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INetworkAdapter.ABI.makeINetworkAdapter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<NetworkAdapter>
      {
    public override fun getValue() = NetworkAdapter(pointer.getPointer(0))

    public fun setValue(value: NetworkAdapter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NetworkAdapter, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): NetworkAdapter {
      val address = segment.toRawLongValue()
      return NetworkAdapter(Pointer(address))
    }

    public override fun toNative(obj: NetworkAdapter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
