package Windows.Graphics.Printing.Workflow

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

@ABIMarker(PrintWorkflowPrinterJob.ABI::class)
@Signature("rc(Windows.Graphics.Printing.Workflow.PrintWorkflowPrinterJob;{12009f94-0d14-5443-bc09-250311ce570b})")
@WinRTByReference(brClass = PrintWorkflowPrinterJob.ByReference::class)
public class PrintWorkflowPrinterJob(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintWorkflowPrinterJob.WithDefault, IWinRTObject {
  private val __803177786_Interface: IPrintWorkflowPrinterJob.WithDefault by lazy {
    as_803177786()
  }


  public override val __803177786_Ptr: JNAPointer? by lazy {
    __803177786_Interface.__803177786_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__803177786_Interface)

  private fun as_803177786(): IPrintWorkflowPrinterJob.WithDefault {
    if(pointer == NULL) {
      return(IPrintWorkflowPrinterJob.ABI.makeIPrintWorkflowPrinterJob(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintWorkflowPrinterJob>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintWorkflowPrinterJob.ABI.makeIPrintWorkflowPrinterJob(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintWorkflowPrinterJob> {
    public override fun getValue() = PrintWorkflowPrinterJob(pointer.getPointer(0))

    public fun setValue(value: PrintWorkflowPrinterJob): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintWorkflowPrinterJob, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintWorkflowPrinterJob {
      val address = segment.toRawLongValue()
      return PrintWorkflowPrinterJob(Pointer(address))
    }

    public override fun toNative(obj: PrintWorkflowPrinterJob): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
