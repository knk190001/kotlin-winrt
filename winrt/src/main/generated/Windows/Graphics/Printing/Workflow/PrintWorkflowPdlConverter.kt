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

@ABIMarker(PrintWorkflowPdlConverter.ABI::class)
@Signature("rc(Windows.Graphics.Printing.Workflow.PrintWorkflowPdlConverter;{40604b62-0ae4-51f1-818f-731dc0b005ab})")
@WinRTByReference(brClass = PrintWorkflowPdlConverter.ByReference::class)
public class PrintWorkflowPdlConverter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintWorkflowPdlConverter.WithDefault, IWinRTObject {
  private val __137590709_Interface: IPrintWorkflowPdlConverter.WithDefault by lazy {
    as_137590709()
  }


  public override val __137590709_Ptr: JNAPointer? by lazy {
    __137590709_Interface.__137590709_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__137590709_Interface)

  private fun as_137590709(): IPrintWorkflowPdlConverter.WithDefault {
    if(pointer == NULL) {
      return(IPrintWorkflowPdlConverter.ABI.makeIPrintWorkflowPdlConverter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintWorkflowPdlConverter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintWorkflowPdlConverter.ABI.makeIPrintWorkflowPdlConverter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintWorkflowPdlConverter> {
    public override fun getValue() = PrintWorkflowPdlConverter(pointer.getPointer(0))

    public fun setValue(value: PrintWorkflowPdlConverter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintWorkflowPdlConverter, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintWorkflowPdlConverter {
      val address = segment.toRawLongValue()
      return PrintWorkflowPdlConverter(Pointer(address))
    }

    public override fun toNative(obj: PrintWorkflowPdlConverter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
