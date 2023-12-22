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

@ABIMarker(PrintWorkflowSourceContent.ABI::class)
@Signature("rc(Windows.Graphics.Printing.Workflow.PrintWorkflowSourceContent;{1a28c641-ceb1-4533-bb73-fbe63eefdb18})")
@WinRTByReference(brClass = PrintWorkflowSourceContent.ByReference::class)
public class PrintWorkflowSourceContent(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintWorkflowSourceContent.WithDefault, IWinRTObject {
  private val __609238907_Interface: IPrintWorkflowSourceContent.WithDefault by lazy {
    as_609238907()
  }


  public override val __609238907_Ptr: JNAPointer? by lazy {
    __609238907_Interface.__609238907_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__609238907_Interface)

  private fun as_609238907(): IPrintWorkflowSourceContent.WithDefault {
    if(pointer == NULL) {
      return(IPrintWorkflowSourceContent.ABI.makeIPrintWorkflowSourceContent(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintWorkflowSourceContent>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintWorkflowSourceContent.ABI.makeIPrintWorkflowSourceContent(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintWorkflowSourceContent> {
    public override fun getValue() = PrintWorkflowSourceContent(pointer.getPointer(0))

    public fun setValue(value: PrintWorkflowSourceContent): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintWorkflowSourceContent, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintWorkflowSourceContent {
      val address = segment.toRawLongValue()
      return PrintWorkflowSourceContent(Pointer(address))
    }

    public override fun toNative(obj: PrintWorkflowSourceContent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
