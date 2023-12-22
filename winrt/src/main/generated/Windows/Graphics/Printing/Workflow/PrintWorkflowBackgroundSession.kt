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

@ABIMarker(PrintWorkflowBackgroundSession.ABI::class)
@Signature("rc(Windows.Graphics.Printing.Workflow.PrintWorkflowBackgroundSession;{5b7913ba-0c5e-528a-7458-86a46cbddc45})")
@WinRTByReference(brClass = PrintWorkflowBackgroundSession.ByReference::class)
public class PrintWorkflowBackgroundSession(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintWorkflowBackgroundSession.WithDefault, IWinRTObject {
  private val __188727643_Interface: IPrintWorkflowBackgroundSession.WithDefault by lazy {
    as_188727643()
  }


  public override val __188727643_Ptr: JNAPointer? by lazy {
    __188727643_Interface.__188727643_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__188727643_Interface)

  private fun as_188727643(): IPrintWorkflowBackgroundSession.WithDefault {
    if(pointer == NULL) {
      return(IPrintWorkflowBackgroundSession.ABI.makeIPrintWorkflowBackgroundSession(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintWorkflowBackgroundSession>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintWorkflowBackgroundSession.ABI.makeIPrintWorkflowBackgroundSession(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintWorkflowBackgroundSession> {
    public override fun getValue() = PrintWorkflowBackgroundSession(pointer.getPointer(0))

    public fun setValue(value: PrintWorkflowBackgroundSession): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintWorkflowBackgroundSession, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintWorkflowBackgroundSession {
      val address = segment.toRawLongValue()
      return PrintWorkflowBackgroundSession(Pointer(address))
    }

    public override fun toNative(obj: PrintWorkflowBackgroundSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
