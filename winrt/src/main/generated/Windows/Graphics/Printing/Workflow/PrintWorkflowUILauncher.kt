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

@ABIMarker(PrintWorkflowUILauncher.ABI::class)
@Signature("rc(Windows.Graphics.Printing.Workflow.PrintWorkflowUILauncher;{64e9e22f-14cc-5828-96fb-39163fb6c378})")
@WinRTByReference(brClass = PrintWorkflowUILauncher.ByReference::class)
public class PrintWorkflowUILauncher(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintWorkflowUILauncher.WithDefault, IWinRTObject {
  private val __1687428023_Interface: IPrintWorkflowUILauncher.WithDefault by lazy {
    as_1687428023()
  }


  public override val __1687428023_Ptr: JNAPointer? by lazy {
    __1687428023_Interface.__1687428023_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1687428023_Interface)

  private fun as_1687428023(): IPrintWorkflowUILauncher.WithDefault {
    if(pointer == NULL) {
      return(IPrintWorkflowUILauncher.ABI.makeIPrintWorkflowUILauncher(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintWorkflowUILauncher>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintWorkflowUILauncher.ABI.makeIPrintWorkflowUILauncher(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintWorkflowUILauncher> {
    public override fun getValue() = PrintWorkflowUILauncher(pointer.getPointer(0))

    public fun setValue(value: PrintWorkflowUILauncher): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintWorkflowUILauncher, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintWorkflowUILauncher {
      val address = segment.toRawLongValue()
      return PrintWorkflowUILauncher(Pointer(address))
    }

    public override fun toNative(obj: PrintWorkflowUILauncher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
