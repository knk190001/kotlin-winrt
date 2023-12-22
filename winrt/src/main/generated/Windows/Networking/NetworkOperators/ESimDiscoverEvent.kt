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

@ABIMarker(ESimDiscoverEvent.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.ESimDiscoverEvent;{e59ac3e3-39bc-5f6f-9321-0d4a182d261b})")
@WinRTByReference(brClass = ESimDiscoverEvent.ByReference::class)
public class ESimDiscoverEvent(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IESimDiscoverEvent.WithDefault, IWinRTObject {
  private val __1445320262_Interface: IESimDiscoverEvent.WithDefault by lazy {
    as_1445320262()
  }


  public override val __1445320262_Ptr: JNAPointer? by lazy {
    __1445320262_Interface.__1445320262_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1445320262_Interface)

  private fun as_1445320262(): IESimDiscoverEvent.WithDefault {
    if(pointer == NULL) {
      return(IESimDiscoverEvent.ABI.makeIESimDiscoverEvent(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IESimDiscoverEvent>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IESimDiscoverEvent.ABI.makeIESimDiscoverEvent(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ESimDiscoverEvent> {
    public override fun getValue() = ESimDiscoverEvent(pointer.getPointer(0))

    public fun setValue(value: ESimDiscoverEvent): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ESimDiscoverEvent, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ESimDiscoverEvent {
      val address = segment.toRawLongValue()
      return ESimDiscoverEvent(Pointer(address))
    }

    public override fun toNative(obj: ESimDiscoverEvent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
