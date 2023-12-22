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

@ABIMarker(PrintWorkflowJobStartingEventArgs.ABI::class)
@Signature("rc(Windows.Graphics.Printing.Workflow.PrintWorkflowJobStartingEventArgs;{e3d99ba8-31ad-5e09-b0d7-601b97f161ad})")
@WinRTByReference(brClass = PrintWorkflowJobStartingEventArgs.ByReference::class)
public class PrintWorkflowJobStartingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintWorkflowJobStartingEventArgs.WithDefault, IWinRTObject {
  private val __554312259_Interface: IPrintWorkflowJobStartingEventArgs.WithDefault by lazy {
    as_554312259()
  }


  public override val __554312259_Ptr: JNAPointer? by lazy {
    __554312259_Interface.__554312259_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__554312259_Interface)

  private fun as_554312259(): IPrintWorkflowJobStartingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPrintWorkflowJobStartingEventArgs.ABI.makeIPrintWorkflowJobStartingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintWorkflowJobStartingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintWorkflowJobStartingEventArgs.ABI.makeIPrintWorkflowJobStartingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintWorkflowJobStartingEventArgs> {
    public override fun getValue() = PrintWorkflowJobStartingEventArgs(pointer.getPointer(0))

    public fun setValue(value: PrintWorkflowJobStartingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintWorkflowJobStartingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintWorkflowJobStartingEventArgs {
      val address = segment.toRawLongValue()
      return PrintWorkflowJobStartingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PrintWorkflowJobStartingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
