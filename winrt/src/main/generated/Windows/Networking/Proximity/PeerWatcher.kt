package Windows.Networking.Proximity

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

@ABIMarker(PeerWatcher.ABI::class)
@Signature("rc(Windows.Networking.Proximity.PeerWatcher;{3cee21f8-2fa6-4679-9691-03c94a420f34})")
@WinRTByReference(brClass = PeerWatcher.ByReference::class)
public class PeerWatcher(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPeerWatcher.WithDefault, IWinRTObject {
  private val __1255187105_Interface: IPeerWatcher.WithDefault by lazy {
    as_1255187105()
  }


  public override val __1255187105_Ptr: JNAPointer? by lazy {
    __1255187105_Interface.__1255187105_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1255187105_Interface)

  private fun as_1255187105(): IPeerWatcher.WithDefault {
    if(pointer == NULL) {
      return(IPeerWatcher.ABI.makeIPeerWatcher(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPeerWatcher>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPeerWatcher.ABI.makeIPeerWatcher(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PeerWatcher> {
    public override fun getValue() = PeerWatcher(pointer.getPointer(0))

    public fun setValue(value: PeerWatcher): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PeerWatcher, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PeerWatcher {
      val address = segment.toRawLongValue()
      return PeerWatcher(Pointer(address))
    }

    public override fun toNative(obj: PeerWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
