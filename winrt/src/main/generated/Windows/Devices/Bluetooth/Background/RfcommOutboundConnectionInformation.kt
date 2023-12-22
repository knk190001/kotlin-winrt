package Windows.Devices.Bluetooth.Background

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

@ABIMarker(RfcommOutboundConnectionInformation.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.Background.RfcommOutboundConnectionInformation;{b091227b-f434-4cb0-99b1-4ab8cedaedd7})")
@WinRTByReference(brClass = RfcommOutboundConnectionInformation.ByReference::class)
public class RfcommOutboundConnectionInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRfcommOutboundConnectionInformation.WithDefault, IWinRTObject {
  private val __2031844897_Interface: IRfcommOutboundConnectionInformation.WithDefault by lazy {
    as_2031844897()
  }


  public override val __2031844897_Ptr: JNAPointer? by lazy {
    __2031844897_Interface.__2031844897_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2031844897_Interface)

  private fun as_2031844897(): IRfcommOutboundConnectionInformation.WithDefault {
    if(pointer == NULL) {
      return(IRfcommOutboundConnectionInformation.ABI.makeIRfcommOutboundConnectionInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRfcommOutboundConnectionInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRfcommOutboundConnectionInformation.ABI.makeIRfcommOutboundConnectionInformation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RfcommOutboundConnectionInformation> {
    public override fun getValue() = RfcommOutboundConnectionInformation(pointer.getPointer(0))

    public fun setValue(value: RfcommOutboundConnectionInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RfcommOutboundConnectionInformation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RfcommOutboundConnectionInformation {
      val address = segment.toRawLongValue()
      return RfcommOutboundConnectionInformation(Pointer(address))
    }

    public override fun toNative(obj: RfcommOutboundConnectionInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
