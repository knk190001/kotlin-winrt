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

@ABIMarker(PrintWorkflowPdlModificationRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Graphics.Printing.Workflow.PrintWorkflowPdlModificationRequestedEventArgs;{1a339a61-2e13-5edd-a707-ceec61d7333b})")
@WinRTByReference(brClass = PrintWorkflowPdlModificationRequestedEventArgs.ByReference::class)
public class PrintWorkflowPdlModificationRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintWorkflowPdlModificationRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1788532806_Interface: IPrintWorkflowPdlModificationRequestedEventArgs.WithDefault by
      lazy {
    as_1788532806()
  }


  public override val __1788532806_Ptr: JNAPointer? by lazy {
    __1788532806_Interface.__1788532806_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1788532806_Interface)

  private fun as_1788532806(): IPrintWorkflowPdlModificationRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPrintWorkflowPdlModificationRequestedEventArgs.ABI.makeIPrintWorkflowPdlModificationRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintWorkflowPdlModificationRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintWorkflowPdlModificationRequestedEventArgs.ABI.makeIPrintWorkflowPdlModificationRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintWorkflowPdlModificationRequestedEventArgs> {
    public override fun getValue() =
        PrintWorkflowPdlModificationRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PrintWorkflowPdlModificationRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintWorkflowPdlModificationRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        PrintWorkflowPdlModificationRequestedEventArgs {
      val address = segment.toRawLongValue()
      return PrintWorkflowPdlModificationRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PrintWorkflowPdlModificationRequestedEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
