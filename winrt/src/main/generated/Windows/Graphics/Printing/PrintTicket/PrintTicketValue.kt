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

@ABIMarker(PrintTicketValue.ABI::class)
@Signature("rc(Windows.Graphics.Printing.PrintTicket.PrintTicketValue;{66b30a32-244d-4e22-a98b-bb3cf1f2dd91})")
@WinRTByReference(brClass = PrintTicketValue.ByReference::class)
public class PrintTicketValue(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintTicketValue.WithDefault, IWinRTObject {
  private val __1800478871_Interface: IPrintTicketValue.WithDefault by lazy {
    as_1800478871()
  }


  public override val __1800478871_Ptr: JNAPointer? by lazy {
    __1800478871_Interface.__1800478871_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1800478871_Interface)

  private fun as_1800478871(): IPrintTicketValue.WithDefault {
    if(pointer == NULL) {
      return(IPrintTicketValue.ABI.makeIPrintTicketValue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintTicketValue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintTicketValue.ABI.makeIPrintTicketValue(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintTicketValue> {
    public override fun getValue() = PrintTicketValue(pointer.getPointer(0))

    public fun setValue(value: PrintTicketValue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintTicketValue, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintTicketValue {
      val address = segment.toRawLongValue()
      return PrintTicketValue(Pointer(address))
    }

    public override fun toNative(obj: PrintTicketValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
