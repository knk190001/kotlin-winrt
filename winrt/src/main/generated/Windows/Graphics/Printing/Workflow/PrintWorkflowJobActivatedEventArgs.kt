package Windows.Graphics.Printing.Workflow

import Windows.ApplicationModel.Activation.IActivatedEventArgs
import Windows.ApplicationModel.Activation.IActivatedEventArgsWithUser
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

@ABIMarker(PrintWorkflowJobActivatedEventArgs.ABI::class)
@Signature("rc(Windows.Graphics.Printing.Workflow.PrintWorkflowJobActivatedEventArgs;{d4bd5e6d-034e-5e00-a616-f961a033dcc8})")
@WinRTByReference(brClass = PrintWorkflowJobActivatedEventArgs.ByReference::class)
public class PrintWorkflowJobActivatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintWorkflowJobActivatedEventArgs.WithDefault,
    IActivatedEventArgs.WithDefault, IActivatedEventArgsWithUser.WithDefault, IWinRTObject {
  private val __243293952_Interface: IPrintWorkflowJobActivatedEventArgs.WithDefault by lazy {
    as_243293952()
  }


  private val __1721660047_Interface: IActivatedEventArgs.WithDefault by lazy {
    as_1721660047()
  }


  private val __988512_Interface: IActivatedEventArgsWithUser.WithDefault by lazy {
    as_988512()
  }


  public override val __243293952_Ptr: JNAPointer? by lazy {
    __243293952_Interface.__243293952_Ptr
  }


  public override val __1721660047_Ptr: JNAPointer? by lazy {
    __1721660047_Interface.__1721660047_Ptr
  }


  public override val __988512_Ptr: JNAPointer? by lazy {
    __988512_Interface.__988512_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__243293952_Interface, __1721660047_Interface, __988512_Interface)

  private fun as_243293952(): IPrintWorkflowJobActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPrintWorkflowJobActivatedEventArgs.ABI.makeIPrintWorkflowJobActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintWorkflowJobActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintWorkflowJobActivatedEventArgs.ABI.makeIPrintWorkflowJobActivatedEventArgs(ref.value))
  }

  private fun as_1721660047(): IActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IActivatedEventArgs.ABI.makeIActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IActivatedEventArgs.ABI.makeIActivatedEventArgs(ref.value))
  }

  private fun as_988512(): IActivatedEventArgsWithUser.WithDefault {
    if(pointer == NULL) {
      return(IActivatedEventArgsWithUser.ABI.makeIActivatedEventArgsWithUser(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IActivatedEventArgsWithUser>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IActivatedEventArgsWithUser.ABI.makeIActivatedEventArgsWithUser(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintWorkflowJobActivatedEventArgs> {
    public override fun getValue() = PrintWorkflowJobActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PrintWorkflowJobActivatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintWorkflowJobActivatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintWorkflowJobActivatedEventArgs {
      val address = segment.toRawLongValue()
      return PrintWorkflowJobActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PrintWorkflowJobActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
