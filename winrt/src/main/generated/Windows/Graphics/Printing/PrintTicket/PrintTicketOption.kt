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

@ABIMarker(PrintTicketOption.ABI::class)
@Signature("rc(Windows.Graphics.Printing.PrintTicket.PrintTicketOption;{b086cf90-b367-4e4b-bd48-9c78a0bb31ce})")
@WinRTByReference(brClass = PrintTicketOption.ByReference::class)
public class PrintTicketOption(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintTicketOption.WithDefault, IWinRTObject {
  private val __166594179_Interface: IPrintTicketOption.WithDefault by lazy {
    as_166594179()
  }


  public override val __166594179_Ptr: JNAPointer? by lazy {
    __166594179_Interface.__166594179_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__166594179_Interface)

  private fun as_166594179(): IPrintTicketOption.WithDefault {
    if(pointer == NULL) {
      return(IPrintTicketOption.ABI.makeIPrintTicketOption(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintTicketOption>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintTicketOption.ABI.makeIPrintTicketOption(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintTicketOption> {
    public override fun getValue() = PrintTicketOption(pointer.getPointer(0))

    public fun setValue(value: PrintTicketOption): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintTicketOption, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintTicketOption {
      val address = segment.toRawLongValue()
      return PrintTicketOption(Pointer(address))
    }

    public override fun toNative(obj: PrintTicketOption): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
