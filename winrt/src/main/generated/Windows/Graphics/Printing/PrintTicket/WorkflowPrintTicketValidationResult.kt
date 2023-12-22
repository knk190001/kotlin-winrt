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

@ABIMarker(WorkflowPrintTicketValidationResult.ABI::class)
@Signature("rc(Windows.Graphics.Printing.PrintTicket.WorkflowPrintTicketValidationResult;{0ad1f392-da7b-4a36-bf36-6a99a62e2059})")
@WinRTByReference(brClass = WorkflowPrintTicketValidationResult.ByReference::class)
public class WorkflowPrintTicketValidationResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWorkflowPrintTicketValidationResult.WithDefault, IWinRTObject {
  private val __16271681_Interface: IWorkflowPrintTicketValidationResult.WithDefault by lazy {
    as_16271681()
  }


  public override val __16271681_Ptr: JNAPointer? by lazy {
    __16271681_Interface.__16271681_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__16271681_Interface)

  private fun as_16271681(): IWorkflowPrintTicketValidationResult.WithDefault {
    if(pointer == NULL) {
      return(IWorkflowPrintTicketValidationResult.ABI.makeIWorkflowPrintTicketValidationResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWorkflowPrintTicketValidationResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWorkflowPrintTicketValidationResult.ABI.makeIWorkflowPrintTicketValidationResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WorkflowPrintTicketValidationResult> {
    public override fun getValue() = WorkflowPrintTicketValidationResult(pointer.getPointer(0))

    public fun setValue(value: WorkflowPrintTicketValidationResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WorkflowPrintTicketValidationResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WorkflowPrintTicketValidationResult {
      val address = segment.toRawLongValue()
      return WorkflowPrintTicketValidationResult(Pointer(address))
    }

    public override fun toNative(obj: WorkflowPrintTicketValidationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
