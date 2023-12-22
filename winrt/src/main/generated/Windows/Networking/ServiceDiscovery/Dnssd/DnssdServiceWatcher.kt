package Windows.Networking.ServiceDiscovery.Dnssd

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

@ABIMarker(DnssdServiceWatcher.ABI::class)
@Signature("rc(Windows.Networking.ServiceDiscovery.Dnssd.DnssdServiceWatcher;{cc34d9c1-db7d-4b69-983d-c6f83f205682})")
@WinRTByReference(brClass = DnssdServiceWatcher.ByReference::class)
public class DnssdServiceWatcher(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDnssdServiceWatcher.WithDefault, IWinRTObject {
  private val __335571566_Interface: IDnssdServiceWatcher.WithDefault by lazy {
    as_335571566()
  }


  public override val __335571566_Ptr: JNAPointer? by lazy {
    __335571566_Interface.__335571566_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__335571566_Interface)

  private fun as_335571566(): IDnssdServiceWatcher.WithDefault {
    if(pointer == NULL) {
      return(IDnssdServiceWatcher.ABI.makeIDnssdServiceWatcher(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDnssdServiceWatcher>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDnssdServiceWatcher.ABI.makeIDnssdServiceWatcher(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DnssdServiceWatcher> {
    public override fun getValue() = DnssdServiceWatcher(pointer.getPointer(0))

    public fun setValue(value: DnssdServiceWatcher): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DnssdServiceWatcher, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DnssdServiceWatcher {
      val address = segment.toRawLongValue()
      return DnssdServiceWatcher(Pointer(address))
    }

    public override fun toNative(obj: DnssdServiceWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
