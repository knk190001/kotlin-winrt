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

@ABIMarker(PrintWorkflowXpsDataAvailableEventArgs.ABI::class)
@Signature("rc(Windows.Graphics.Printing.Workflow.PrintWorkflowXpsDataAvailableEventArgs;{4d11c331-54d1-434e-be0e-82c5fa58e5b2})")
@WinRTByReference(brClass = PrintWorkflowXpsDataAvailableEventArgs.ByReference::class)
public class PrintWorkflowXpsDataAvailableEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintWorkflowXpsDataAvailableEventArgs.WithDefault, IWinRTObject {
  private val __1772360080_Interface: IPrintWorkflowXpsDataAvailableEventArgs.WithDefault by lazy {
    as_1772360080()
  }


  public override val __1772360080_Ptr: JNAPointer? by lazy {
    __1772360080_Interface.__1772360080_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1772360080_Interface)

  private fun as_1772360080(): IPrintWorkflowXpsDataAvailableEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPrintWorkflowXpsDataAvailableEventArgs.ABI.makeIPrintWorkflowXpsDataAvailableEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintWorkflowXpsDataAvailableEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintWorkflowXpsDataAvailableEventArgs.ABI.makeIPrintWorkflowXpsDataAvailableEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintWorkflowXpsDataAvailableEventArgs> {
    public override fun getValue() = PrintWorkflowXpsDataAvailableEventArgs(pointer.getPointer(0))

    public fun setValue(value: PrintWorkflowXpsDataAvailableEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintWorkflowXpsDataAvailableEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintWorkflowXpsDataAvailableEventArgs {
      val address = segment.toRawLongValue()
      return PrintWorkflowXpsDataAvailableEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PrintWorkflowXpsDataAvailableEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
