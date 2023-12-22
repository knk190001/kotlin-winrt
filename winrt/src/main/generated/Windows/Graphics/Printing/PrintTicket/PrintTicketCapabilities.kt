package Windows.Graphics.Printing.PrintTicket

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

@ABIMarker(PrintTicketCapabilities.ABI::class)
@Signature("rc(Windows.Graphics.Printing.PrintTicket.PrintTicketCapabilities;{8c45508b-bbdc-4256-a142-2fd615ecb416})")
@WinRTByReference(brClass = PrintTicketCapabilities.ByReference::class)
public class PrintTicketCapabilities(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintTicketCapabilities.WithDefault, IWinRTObject {
  private val __263559870_Interface: IPrintTicketCapabilities.WithDefault by lazy {
    as_263559870()
  }


  public override val __263559870_Ptr: JNAPointer? by lazy {
    __263559870_Interface.__263559870_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__263559870_Interface)

  private fun as_263559870(): IPrintTicketCapabilities.WithDefault {
    if(pointer == NULL) {
      return(IPrintTicketCapabilities.ABI.makeIPrintTicketCapabilities(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintTicketCapabilities>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintTicketCapabilities.ABI.makeIPrintTicketCapabilities(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintTicketCapabilities> {
    public override fun getValue() = PrintTicketCapabilities(pointer.getPointer(0))

    public fun setValue(value: PrintTicketCapabilities): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintTicketCapabilities, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintTicketCapabilities {
      val address = segment.toRawLongValue()
      return PrintTicketCapabilities(Pointer(address))
    }

    public override fun toNative(obj: PrintTicketCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
