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

@ABIMarker(PrintWorkflowTarget.ABI::class)
@Signature("rc(Windows.Graphics.Printing.Workflow.PrintWorkflowTarget;{29da276c-0a73-5aed-4f3d-970d3251f057})")
@WinRTByReference(brClass = PrintWorkflowTarget.ByReference::class)
public class PrintWorkflowTarget(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintWorkflowTarget.WithDefault, IWinRTObject {
  private val __938866836_Interface: IPrintWorkflowTarget.WithDefault by lazy {
    as_938866836()
  }


  public override val __938866836_Ptr: JNAPointer? by lazy {
    __938866836_Interface.__938866836_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__938866836_Interface)

  private fun as_938866836(): IPrintWorkflowTarget.WithDefault {
    if(pointer == NULL) {
      return(IPrintWorkflowTarget.ABI.makeIPrintWorkflowTarget(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintWorkflowTarget>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintWorkflowTarget.ABI.makeIPrintWorkflowTarget(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintWorkflowTarget> {
    public override fun getValue() = PrintWorkflowTarget(pointer.getPointer(0))

    public fun setValue(value: PrintWorkflowTarget): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintWorkflowTarget, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintWorkflowTarget {
      val address = segment.toRawLongValue()
      return PrintWorkflowTarget(Pointer(address))
    }

    public override fun toNative(obj: PrintWorkflowTarget): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
