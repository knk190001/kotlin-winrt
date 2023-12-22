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

@ABIMarker(PrintWorkflowJobBackgroundSession.ABI::class)
@Signature("rc(Windows.Graphics.Printing.Workflow.PrintWorkflowJobBackgroundSession;{c5ec6ad8-20c9-5d51-8507-2734b46f96c5})")
@WinRTByReference(brClass = PrintWorkflowJobBackgroundSession.ByReference::class)
public class PrintWorkflowJobBackgroundSession(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintWorkflowJobBackgroundSession.WithDefault, IWinRTObject {
  private val __262058254_Interface: IPrintWorkflowJobBackgroundSession.WithDefault by lazy {
    as_262058254()
  }


  public override val __262058254_Ptr: JNAPointer? by lazy {
    __262058254_Interface.__262058254_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__262058254_Interface)

  private fun as_262058254(): IPrintWorkflowJobBackgroundSession.WithDefault {
    if(pointer == NULL) {
      return(IPrintWorkflowJobBackgroundSession.ABI.makeIPrintWorkflowJobBackgroundSession(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintWorkflowJobBackgroundSession>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintWorkflowJobBackgroundSession.ABI.makeIPrintWorkflowJobBackgroundSession(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintWorkflowJobBackgroundSession> {
    public override fun getValue() = PrintWorkflowJobBackgroundSession(pointer.getPointer(0))

    public fun setValue(value: PrintWorkflowJobBackgroundSession): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintWorkflowJobBackgroundSession, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintWorkflowJobBackgroundSession {
      val address = segment.toRawLongValue()
      return PrintWorkflowJobBackgroundSession(Pointer(address))
    }

    public override fun toNative(obj: PrintWorkflowJobBackgroundSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
