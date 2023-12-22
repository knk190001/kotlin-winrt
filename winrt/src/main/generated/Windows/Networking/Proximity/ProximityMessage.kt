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

@ABIMarker(ProximityMessage.ABI::class)
@Signature("rc(Windows.Networking.Proximity.ProximityMessage;{efab0782-f6e1-4675-a045-d8e320c24808})")
@WinRTByReference(brClass = ProximityMessage.ByReference::class)
public class ProximityMessage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProximityMessage.WithDefault, IWinRTObject {
  private val __875857473_Interface: IProximityMessage.WithDefault by lazy {
    as_875857473()
  }


  public override val __875857473_Ptr: JNAPointer? by lazy {
    __875857473_Interface.__875857473_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__875857473_Interface)

  private fun as_875857473(): IProximityMessage.WithDefault {
    if(pointer == NULL) {
      return(IProximityMessage.ABI.makeIProximityMessage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProximityMessage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProximityMessage.ABI.makeIProximityMessage(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProximityMessage> {
    public override fun getValue() = ProximityMessage(pointer.getPointer(0))

    public fun setValue(value: ProximityMessage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProximityMessage, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ProximityMessage {
      val address = segment.toRawLongValue()
      return ProximityMessage(Pointer(address))
    }

    public override fun toNative(obj: ProximityMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
