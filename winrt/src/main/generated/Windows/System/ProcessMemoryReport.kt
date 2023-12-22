package Windows.System

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

@ABIMarker(ProcessMemoryReport.ABI::class)
@Signature("rc(Windows.System.ProcessMemoryReport;{087305a8-9b70-4782-8741-3a982b6ce5e4})")
@WinRTByReference(brClass = ProcessMemoryReport.ByReference::class)
public class ProcessMemoryReport(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProcessMemoryReport.WithDefault, IWinRTObject {
  private val __1281218091_Interface: IProcessMemoryReport.WithDefault by lazy {
    as_1281218091()
  }


  public override val __1281218091_Ptr: JNAPointer? by lazy {
    __1281218091_Interface.__1281218091_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1281218091_Interface)

  private fun as_1281218091(): IProcessMemoryReport.WithDefault {
    if(pointer == NULL) {
      return(IProcessMemoryReport.ABI.makeIProcessMemoryReport(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProcessMemoryReport>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProcessMemoryReport.ABI.makeIProcessMemoryReport(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProcessMemoryReport> {
    public override fun getValue() = ProcessMemoryReport(pointer.getPointer(0))

    public fun setValue(value: ProcessMemoryReport): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProcessMemoryReport, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ProcessMemoryReport {
      val address = segment.toRawLongValue()
      return ProcessMemoryReport(Pointer(address))
    }

    public override fun toNative(obj: ProcessMemoryReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
