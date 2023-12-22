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

@ABIMarker(PrintWorkflowSubmittedEventArgs.ABI::class)
@Signature("rc(Windows.Graphics.Printing.Workflow.PrintWorkflowSubmittedEventArgs;{3add0a41-3794-5569-5c87-40e8ff720f83})")
@WinRTByReference(brClass = PrintWorkflowSubmittedEventArgs.ByReference::class)
public class PrintWorkflowSubmittedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintWorkflowSubmittedEventArgs.WithDefault, IWinRTObject {
  private val __177891745_Interface: IPrintWorkflowSubmittedEventArgs.WithDefault by lazy {
    as_177891745()
  }


  public override val __177891745_Ptr: JNAPointer? by lazy {
    __177891745_Interface.__177891745_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__177891745_Interface)

  private fun as_177891745(): IPrintWorkflowSubmittedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPrintWorkflowSubmittedEventArgs.ABI.makeIPrintWorkflowSubmittedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintWorkflowSubmittedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintWorkflowSubmittedEventArgs.ABI.makeIPrintWorkflowSubmittedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintWorkflowSubmittedEventArgs> {
    public override fun getValue() = PrintWorkflowSubmittedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PrintWorkflowSubmittedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintWorkflowSubmittedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintWorkflowSubmittedEventArgs {
      val address = segment.toRawLongValue()
      return PrintWorkflowSubmittedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PrintWorkflowSubmittedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
