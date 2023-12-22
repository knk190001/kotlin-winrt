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

@ABIMarker(PrintWorkflowObjectModelTargetPackage.ABI::class)
@Signature("rc(Windows.Graphics.Printing.Workflow.PrintWorkflowObjectModelTargetPackage;{7d96bc74-9b54-4ca1-ad3a-979c3d44ddac})")
@WinRTByReference(brClass = PrintWorkflowObjectModelTargetPackage.ByReference::class)
public class PrintWorkflowObjectModelTargetPackage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintWorkflowObjectModelTargetPackage.WithDefault, IWinRTObject {
  private val __1209295186_Interface: IPrintWorkflowObjectModelTargetPackage.WithDefault by lazy {
    as_1209295186()
  }


  public override val __1209295186_Ptr: JNAPointer? by lazy {
    __1209295186_Interface.__1209295186_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1209295186_Interface)

  private fun as_1209295186(): IPrintWorkflowObjectModelTargetPackage.WithDefault {
    if(pointer == NULL) {
      return(IPrintWorkflowObjectModelTargetPackage.ABI.makeIPrintWorkflowObjectModelTargetPackage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintWorkflowObjectModelTargetPackage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintWorkflowObjectModelTargetPackage.ABI.makeIPrintWorkflowObjectModelTargetPackage(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintWorkflowObjectModelTargetPackage> {
    public override fun getValue() = PrintWorkflowObjectModelTargetPackage(pointer.getPointer(0))

    public fun setValue(value: PrintWorkflowObjectModelTargetPackage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintWorkflowObjectModelTargetPackage, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintWorkflowObjectModelTargetPackage {
      val address = segment.toRawLongValue()
      return PrintWorkflowObjectModelTargetPackage(Pointer(address))
    }

    public override fun toNative(obj: PrintWorkflowObjectModelTargetPackage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
