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

@ABIMarker(PrintWorkflowPdlSourceContent.ABI::class)
@Signature("rc(Windows.Graphics.Printing.Workflow.PrintWorkflowPdlSourceContent;{92f7fc41-32b8-56ab-845e-b1e68b3aedd5})")
@WinRTByReference(brClass = PrintWorkflowPdlSourceContent.ByReference::class)
public class PrintWorkflowPdlSourceContent(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintWorkflowPdlSourceContent.WithDefault, IWinRTObject {
  private val __1572458761_Interface: IPrintWorkflowPdlSourceContent.WithDefault by lazy {
    as_1572458761()
  }


  public override val __1572458761_Ptr: JNAPointer? by lazy {
    __1572458761_Interface.__1572458761_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1572458761_Interface)

  private fun as_1572458761(): IPrintWorkflowPdlSourceContent.WithDefault {
    if(pointer == NULL) {
      return(IPrintWorkflowPdlSourceContent.ABI.makeIPrintWorkflowPdlSourceContent(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintWorkflowPdlSourceContent>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintWorkflowPdlSourceContent.ABI.makeIPrintWorkflowPdlSourceContent(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintWorkflowPdlSourceContent> {
    public override fun getValue() = PrintWorkflowPdlSourceContent(pointer.getPointer(0))

    public fun setValue(value: PrintWorkflowPdlSourceContent): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintWorkflowPdlSourceContent, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintWorkflowPdlSourceContent {
      val address = segment.toRawLongValue()
      return PrintWorkflowPdlSourceContent(Pointer(address))
    }

    public override fun toNative(obj: PrintWorkflowPdlSourceContent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
