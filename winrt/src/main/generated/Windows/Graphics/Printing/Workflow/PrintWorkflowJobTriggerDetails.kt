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

@ABIMarker(PrintWorkflowJobTriggerDetails.ABI::class)
@Signature("rc(Windows.Graphics.Printing.Workflow.PrintWorkflowJobTriggerDetails;{ff296129-60e2-51db-ba8c-e2ccddb516b9})")
@WinRTByReference(brClass = PrintWorkflowJobTriggerDetails.ByReference::class)
public class PrintWorkflowJobTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintWorkflowJobTriggerDetails.WithDefault, IWinRTObject {
  private val __2132117596_Interface: IPrintWorkflowJobTriggerDetails.WithDefault by lazy {
    as_2132117596()
  }


  public override val __2132117596_Ptr: JNAPointer? by lazy {
    __2132117596_Interface.__2132117596_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2132117596_Interface)

  private fun as_2132117596(): IPrintWorkflowJobTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IPrintWorkflowJobTriggerDetails.ABI.makeIPrintWorkflowJobTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintWorkflowJobTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintWorkflowJobTriggerDetails.ABI.makeIPrintWorkflowJobTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintWorkflowJobTriggerDetails> {
    public override fun getValue() = PrintWorkflowJobTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: PrintWorkflowJobTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintWorkflowJobTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintWorkflowJobTriggerDetails {
      val address = segment.toRawLongValue()
      return PrintWorkflowJobTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: PrintWorkflowJobTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
