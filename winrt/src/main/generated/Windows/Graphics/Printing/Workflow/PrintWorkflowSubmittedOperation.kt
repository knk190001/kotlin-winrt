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

@ABIMarker(PrintWorkflowSubmittedOperation.ABI::class)
@Signature("rc(Windows.Graphics.Printing.Workflow.PrintWorkflowSubmittedOperation;{2e4e6216-3be1-5f0f-5c81-a5a2bd4eab0e})")
@WinRTByReference(brClass = PrintWorkflowSubmittedOperation.ByReference::class)
public class PrintWorkflowSubmittedOperation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintWorkflowSubmittedOperation.WithDefault, IWinRTObject {
  private val __1453953327_Interface: IPrintWorkflowSubmittedOperation.WithDefault by lazy {
    as_1453953327()
  }


  public override val __1453953327_Ptr: JNAPointer? by lazy {
    __1453953327_Interface.__1453953327_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1453953327_Interface)

  private fun as_1453953327(): IPrintWorkflowSubmittedOperation.WithDefault {
    if(pointer == NULL) {
      return(IPrintWorkflowSubmittedOperation.ABI.makeIPrintWorkflowSubmittedOperation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintWorkflowSubmittedOperation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintWorkflowSubmittedOperation.ABI.makeIPrintWorkflowSubmittedOperation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintWorkflowSubmittedOperation> {
    public override fun getValue() = PrintWorkflowSubmittedOperation(pointer.getPointer(0))

    public fun setValue(value: PrintWorkflowSubmittedOperation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintWorkflowSubmittedOperation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintWorkflowSubmittedOperation {
      val address = segment.toRawLongValue()
      return PrintWorkflowSubmittedOperation(Pointer(address))
    }

    public override fun toNative(obj: PrintWorkflowSubmittedOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
