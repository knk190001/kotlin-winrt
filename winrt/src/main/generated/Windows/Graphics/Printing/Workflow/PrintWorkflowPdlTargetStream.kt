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

@ABIMarker(PrintWorkflowPdlTargetStream.ABI::class)
@Signature("rc(Windows.Graphics.Printing.Workflow.PrintWorkflowPdlTargetStream;{a742dfe5-1ee3-52a9-9f9f-2e2043180fd1})")
@WinRTByReference(brClass = PrintWorkflowPdlTargetStream.ByReference::class)
public class PrintWorkflowPdlTargetStream(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintWorkflowPdlTargetStream.WithDefault, IWinRTObject {
  private val __1416067558_Interface: IPrintWorkflowPdlTargetStream.WithDefault by lazy {
    as_1416067558()
  }


  public override val __1416067558_Ptr: JNAPointer? by lazy {
    __1416067558_Interface.__1416067558_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1416067558_Interface)

  private fun as_1416067558(): IPrintWorkflowPdlTargetStream.WithDefault {
    if(pointer == NULL) {
      return(IPrintWorkflowPdlTargetStream.ABI.makeIPrintWorkflowPdlTargetStream(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintWorkflowPdlTargetStream>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintWorkflowPdlTargetStream.ABI.makeIPrintWorkflowPdlTargetStream(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintWorkflowPdlTargetStream> {
    public override fun getValue() = PrintWorkflowPdlTargetStream(pointer.getPointer(0))

    public fun setValue(value: PrintWorkflowPdlTargetStream): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintWorkflowPdlTargetStream, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintWorkflowPdlTargetStream {
      val address = segment.toRawLongValue()
      return PrintWorkflowPdlTargetStream(Pointer(address))
    }

    public override fun toNative(obj: PrintWorkflowPdlTargetStream): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
