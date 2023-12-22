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

@ABIMarker(PrintWorkflowPdlDataAvailableEventArgs.ABI::class)
@Signature("rc(Windows.Graphics.Printing.Workflow.PrintWorkflowPdlDataAvailableEventArgs;{d4ad6b50-1547-5991-a0ef-e2ee20211518})")
@WinRTByReference(brClass = PrintWorkflowPdlDataAvailableEventArgs.ByReference::class)
public class PrintWorkflowPdlDataAvailableEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintWorkflowPdlDataAvailableEventArgs.WithDefault, IWinRTObject {
  private val __1890829901_Interface: IPrintWorkflowPdlDataAvailableEventArgs.WithDefault by lazy {
    as_1890829901()
  }


  public override val __1890829901_Ptr: JNAPointer? by lazy {
    __1890829901_Interface.__1890829901_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1890829901_Interface)

  private fun as_1890829901(): IPrintWorkflowPdlDataAvailableEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPrintWorkflowPdlDataAvailableEventArgs.ABI.makeIPrintWorkflowPdlDataAvailableEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintWorkflowPdlDataAvailableEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintWorkflowPdlDataAvailableEventArgs.ABI.makeIPrintWorkflowPdlDataAvailableEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintWorkflowPdlDataAvailableEventArgs> {
    public override fun getValue() = PrintWorkflowPdlDataAvailableEventArgs(pointer.getPointer(0))

    public fun setValue(value: PrintWorkflowPdlDataAvailableEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintWorkflowPdlDataAvailableEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintWorkflowPdlDataAvailableEventArgs {
      val address = segment.toRawLongValue()
      return PrintWorkflowPdlDataAvailableEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PrintWorkflowPdlDataAvailableEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
