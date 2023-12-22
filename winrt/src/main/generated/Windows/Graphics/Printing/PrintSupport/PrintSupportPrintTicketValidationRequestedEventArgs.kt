package Windows.Graphics.Printing.PrintSupport

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

@ABIMarker(PrintSupportPrintTicketValidationRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Graphics.Printing.PrintSupport.PrintSupportPrintTicketValidationRequestedEventArgs;{338e4e69-db55-55c7-8338-ef64680a8f90})")
@WinRTByReference(brClass = PrintSupportPrintTicketValidationRequestedEventArgs.ByReference::class)
public class PrintSupportPrintTicketValidationRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintSupportPrintTicketValidationRequestedEventArgs.WithDefault, IWinRTObject
    {
  private val __865208301_Interface:
      IPrintSupportPrintTicketValidationRequestedEventArgs.WithDefault by lazy {
    as_865208301()
  }


  public override val __865208301_Ptr: JNAPointer? by lazy {
    __865208301_Interface.__865208301_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__865208301_Interface)

  private fun as_865208301(): IPrintSupportPrintTicketValidationRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPrintSupportPrintTicketValidationRequestedEventArgs.ABI.makeIPrintSupportPrintTicketValidationRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintSupportPrintTicketValidationRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintSupportPrintTicketValidationRequestedEventArgs.ABI.makeIPrintSupportPrintTicketValidationRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintSupportPrintTicketValidationRequestedEventArgs> {
    public override fun getValue() =
        PrintSupportPrintTicketValidationRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PrintSupportPrintTicketValidationRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintSupportPrintTicketValidationRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        PrintSupportPrintTicketValidationRequestedEventArgs {
      val address = segment.toRawLongValue()
      return PrintSupportPrintTicketValidationRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PrintSupportPrintTicketValidationRequestedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
