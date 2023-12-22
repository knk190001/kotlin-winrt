package Windows.Graphics.Printing

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

@ABIMarker(PrintTask.ABI::class)
@Signature("rc(Windows.Graphics.Printing.PrintTask;{61d80247-6cf6-4fad-84e2-a5e82e2d4ceb})")
@WinRTByReference(brClass = PrintTask.ByReference::class)
public class PrintTask(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintTask.WithDefault, IPrintTaskTargetDeviceSupport.WithDefault,
    IPrintTask2.WithDefault, IWinRTObject {
  private val __1422700182_Interface: IPrintTask.WithDefault by lazy {
    as_1422700182()
  }


  private val __1489578990_Interface: IPrintTaskTargetDeviceSupport.WithDefault by lazy {
    as_1489578990()
  }


  private val __1154032732_Interface: IPrintTask2.WithDefault by lazy {
    as_1154032732()
  }


  public override val __1422700182_Ptr: JNAPointer? by lazy {
    __1422700182_Interface.__1422700182_Ptr
  }


  public override val __1489578990_Ptr: JNAPointer? by lazy {
    __1489578990_Interface.__1489578990_Ptr
  }


  public override val __1154032732_Ptr: JNAPointer? by lazy {
    __1154032732_Interface.__1154032732_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1422700182_Interface, __1489578990_Interface, __1154032732_Interface)

  private fun as_1422700182(): IPrintTask.WithDefault {
    if(pointer == NULL) {
      return(IPrintTask.ABI.makeIPrintTask(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintTask>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintTask.ABI.makeIPrintTask(ref.value))
  }

  private fun as_1489578990(): IPrintTaskTargetDeviceSupport.WithDefault {
    if(pointer == NULL) {
      return(IPrintTaskTargetDeviceSupport.ABI.makeIPrintTaskTargetDeviceSupport(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintTaskTargetDeviceSupport>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintTaskTargetDeviceSupport.ABI.makeIPrintTaskTargetDeviceSupport(ref.value))
  }

  private fun as_1154032732(): IPrintTask2.WithDefault {
    if(pointer == NULL) {
      return(IPrintTask2.ABI.makeIPrintTask2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintTask2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintTask2.ABI.makeIPrintTask2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PrintTask> {
    public override fun getValue() = PrintTask(pointer.getPointer(0))

    public fun setValue(value: PrintTask): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintTask, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintTask {
      val address = segment.toRawLongValue()
      return PrintTask(Pointer(address))
    }

    public override fun toNative(obj: PrintTask): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
