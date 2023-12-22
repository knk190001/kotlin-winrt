package Windows.Graphics.Printing.Workflow

import Windows.Graphics.Printing.Workflow.IPrintWorkflowObjectModelSourceFileContentFactory.ABI.IID
import Windows.Storage.Streams.IInputStream
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(PrintWorkflowObjectModelSourceFileContent.ABI::class)
@Signature("rc(Windows.Graphics.Printing.Workflow.PrintWorkflowObjectModelSourceFileContent;{c36c8a6a-8a2a-419a-b3c3-2090e6bfab2f})")
@WinRTByReference(brClass = PrintWorkflowObjectModelSourceFileContent.ByReference::class)
public class PrintWorkflowObjectModelSourceFileContent(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintWorkflowObjectModelSourceFileContent.WithDefault, IWinRTObject {
  private val __1901746427_Interface: IPrintWorkflowObjectModelSourceFileContent.WithDefault by
      lazy {
    as_1901746427()
  }


  public override val __1901746427_Ptr: JNAPointer? by lazy {
    __1901746427_Interface.__1901746427_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1901746427_Interface)

  public constructor(xpsStream: IInputStream) : this(ABI.activate(xpsStream))

  private fun as_1901746427(): IPrintWorkflowObjectModelSourceFileContent.WithDefault {
    if(pointer == NULL) {
      return(IPrintWorkflowObjectModelSourceFileContent.ABI.makeIPrintWorkflowObjectModelSourceFileContent(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintWorkflowObjectModelSourceFileContent>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintWorkflowObjectModelSourceFileContent.ABI.makeIPrintWorkflowObjectModelSourceFileContent(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintWorkflowObjectModelSourceFileContent> {
    public override fun getValue() =
        PrintWorkflowObjectModelSourceFileContent(pointer.getPointer(0))

    public fun setValue(value: PrintWorkflowObjectModelSourceFileContent): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintWorkflowObjectModelSourceFileContent, MemoryAddress> {
    public val IPrintWorkflowObjectModelSourceFileContentFactory_Instance:
        IPrintWorkflowObjectModelSourceFileContentFactory by lazy {
      createIPrintWorkflowObjectModelSourceFileContentFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPrintWorkflowObjectModelSourceFileContentFactory():
        IPrintWorkflowObjectModelSourceFileContentFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Printing.Workflow.PrintWorkflowObjectModelSourceFileContent".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPrintWorkflowObjectModelSourceFileContentFactory.ABI.makeIPrintWorkflowObjectModelSourceFileContentFactory(factoryActivatorPtr.value))
    }

    public fun activate(xpsStream: IInputStream): JNAPointer? =
        IPrintWorkflowObjectModelSourceFileContentFactory_Instance.CreateInstance(xpsStream)?.pointer

    public override fun fromNative(segment: MemoryAddress):
        PrintWorkflowObjectModelSourceFileContent {
      val address = segment.toRawLongValue()
      return PrintWorkflowObjectModelSourceFileContent(Pointer(address))
    }

    public override fun toNative(obj: PrintWorkflowObjectModelSourceFileContent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
