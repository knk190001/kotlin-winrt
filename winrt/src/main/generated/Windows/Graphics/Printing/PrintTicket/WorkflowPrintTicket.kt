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

@ABIMarker(WorkflowPrintTicket.ABI::class)
@Signature("rc(Windows.Graphics.Printing.PrintTicket.WorkflowPrintTicket;{41d52285-35e8-448e-a8c5-e4b6a2cf826c})")
@WinRTByReference(brClass = WorkflowPrintTicket.ByReference::class)
public class WorkflowPrintTicket(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWorkflowPrintTicket.WithDefault, IWinRTObject {
  private val __911599273_Interface: IWorkflowPrintTicket.WithDefault by lazy {
    as_911599273()
  }


  public override val __911599273_Ptr: JNAPointer? by lazy {
    __911599273_Interface.__911599273_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__911599273_Interface)

  private fun as_911599273(): IWorkflowPrintTicket.WithDefault {
    if(pointer == NULL) {
      return(IWorkflowPrintTicket.ABI.makeIWorkflowPrintTicket(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWorkflowPrintTicket>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWorkflowPrintTicket.ABI.makeIWorkflowPrintTicket(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WorkflowPrintTicket> {
    public override fun getValue() = WorkflowPrintTicket(pointer.getPointer(0))

    public fun setValue(value: WorkflowPrintTicket): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WorkflowPrintTicket, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WorkflowPrintTicket {
      val address = segment.toRawLongValue()
      return WorkflowPrintTicket(Pointer(address))
    }

    public override fun toNative(obj: WorkflowPrintTicket): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
