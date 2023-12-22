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

@ABIMarker(PrintWorkflowJobUISession.ABI::class)
@Signature("rc(Windows.Graphics.Printing.Workflow.PrintWorkflowJobUISession;{00c8736b-7637-5687-a302-0f664d2aac65})")
@WinRTByReference(brClass = PrintWorkflowJobUISession.ByReference::class)
public class PrintWorkflowJobUISession(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintWorkflowJobUISession.WithDefault, IWinRTObject {
  private val __176815352_Interface: IPrintWorkflowJobUISession.WithDefault by lazy {
    as_176815352()
  }


  public override val __176815352_Ptr: JNAPointer? by lazy {
    __176815352_Interface.__176815352_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__176815352_Interface)

  private fun as_176815352(): IPrintWorkflowJobUISession.WithDefault {
    if(pointer == NULL) {
      return(IPrintWorkflowJobUISession.ABI.makeIPrintWorkflowJobUISession(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintWorkflowJobUISession>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintWorkflowJobUISession.ABI.makeIPrintWorkflowJobUISession(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintWorkflowJobUISession> {
    public override fun getValue() = PrintWorkflowJobUISession(pointer.getPointer(0))

    public fun setValue(value: PrintWorkflowJobUISession): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintWorkflowJobUISession, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintWorkflowJobUISession {
      val address = segment.toRawLongValue()
      return PrintWorkflowJobUISession(Pointer(address))
    }

    public override fun toNative(obj: PrintWorkflowJobUISession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
