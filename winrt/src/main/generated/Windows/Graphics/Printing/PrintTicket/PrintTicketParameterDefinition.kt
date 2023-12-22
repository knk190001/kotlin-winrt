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

@ABIMarker(PrintTicketParameterDefinition.ABI::class)
@Signature("rc(Windows.Graphics.Printing.PrintTicket.PrintTicketParameterDefinition;{d6bab4e4-2962-4c01-b7f3-9a9294eb8335})")
@WinRTByReference(brClass = PrintTicketParameterDefinition.ByReference::class)
public class PrintTicketParameterDefinition(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintTicketParameterDefinition.WithDefault, IWinRTObject {
  private val __883523116_Interface: IPrintTicketParameterDefinition.WithDefault by lazy {
    as_883523116()
  }


  public override val __883523116_Ptr: JNAPointer? by lazy {
    __883523116_Interface.__883523116_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__883523116_Interface)

  private fun as_883523116(): IPrintTicketParameterDefinition.WithDefault {
    if(pointer == NULL) {
      return(IPrintTicketParameterDefinition.ABI.makeIPrintTicketParameterDefinition(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintTicketParameterDefinition>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintTicketParameterDefinition.ABI.makeIPrintTicketParameterDefinition(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintTicketParameterDefinition> {
    public override fun getValue() = PrintTicketParameterDefinition(pointer.getPointer(0))

    public fun setValue(value: PrintTicketParameterDefinition): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintTicketParameterDefinition, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintTicketParameterDefinition {
      val address = segment.toRawLongValue()
      return PrintTicketParameterDefinition(Pointer(address))
    }

    public override fun toNative(obj: PrintTicketParameterDefinition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
