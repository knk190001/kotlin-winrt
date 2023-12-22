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

@ABIMarker(PrintWorkflowBackgroundSetupRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Graphics.Printing.Workflow.PrintWorkflowBackgroundSetupRequestedEventArgs;{43e97342-1750-59c9-61fb-383748a20362})")
@WinRTByReference(brClass = PrintWorkflowBackgroundSetupRequestedEventArgs.ByReference::class)
public class PrintWorkflowBackgroundSetupRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintWorkflowBackgroundSetupRequestedEventArgs.WithDefault, IWinRTObject {
  private val __71315915_Interface: IPrintWorkflowBackgroundSetupRequestedEventArgs.WithDefault by
      lazy {
    as_71315915()
  }


  public override val __71315915_Ptr: JNAPointer? by lazy {
    __71315915_Interface.__71315915_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__71315915_Interface)

  private fun as_71315915(): IPrintWorkflowBackgroundSetupRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPrintWorkflowBackgroundSetupRequestedEventArgs.ABI.makeIPrintWorkflowBackgroundSetupRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintWorkflowBackgroundSetupRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintWorkflowBackgroundSetupRequestedEventArgs.ABI.makeIPrintWorkflowBackgroundSetupRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintWorkflowBackgroundSetupRequestedEventArgs> {
    public override fun getValue() =
        PrintWorkflowBackgroundSetupRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PrintWorkflowBackgroundSetupRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintWorkflowBackgroundSetupRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        PrintWorkflowBackgroundSetupRequestedEventArgs {
      val address = segment.toRawLongValue()
      return PrintWorkflowBackgroundSetupRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PrintWorkflowBackgroundSetupRequestedEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
