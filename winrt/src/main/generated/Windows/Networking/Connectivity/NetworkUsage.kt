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

@ABIMarker(NetworkUsage.ABI::class)
@Signature("rc(Windows.Networking.Connectivity.NetworkUsage;{49da8fce-9985-4927-bf5b-072b5c65f8d9})")
@WinRTByReference(brClass = NetworkUsage.ByReference::class)
public class NetworkUsage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INetworkUsage.WithDefault, IWinRTObject {
  private val __1639571242_Interface: INetworkUsage.WithDefault by lazy {
    as_1639571242()
  }


  public override val __1639571242_Ptr: JNAPointer? by lazy {
    __1639571242_Interface.__1639571242_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1639571242_Interface)

  private fun as_1639571242(): INetworkUsage.WithDefault {
    if(pointer == NULL) {
      return(INetworkUsage.ABI.makeINetworkUsage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INetworkUsage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INetworkUsage.ABI.makeINetworkUsage(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<NetworkUsage> {
    public override fun getValue() = NetworkUsage(pointer.getPointer(0))

    public fun setValue(value: NetworkUsage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NetworkUsage, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): NetworkUsage {
      val address = segment.toRawLongValue()
      return NetworkUsage(Pointer(address))
    }

    public override fun toNative(obj: NetworkUsage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
