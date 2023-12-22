package Windows.System.Diagnostics

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

@ABIMarker(ProcessCpuUsageReport.ABI::class)
@Signature("rc(Windows.System.Diagnostics.ProcessCpuUsageReport;{8a6d9cac-3987-4e2f-a119-6b5fa214f1b4})")
@WinRTByReference(brClass = ProcessCpuUsageReport.ByReference::class)
public class ProcessCpuUsageReport(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProcessCpuUsageReport.WithDefault, IWinRTObject {
  private val __298923723_Interface: IProcessCpuUsageReport.WithDefault by lazy {
    as_298923723()
  }


  public override val __298923723_Ptr: JNAPointer? by lazy {
    __298923723_Interface.__298923723_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__298923723_Interface)

  private fun as_298923723(): IProcessCpuUsageReport.WithDefault {
    if(pointer == NULL) {
      return(IProcessCpuUsageReport.ABI.makeIProcessCpuUsageReport(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProcessCpuUsageReport>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProcessCpuUsageReport.ABI.makeIProcessCpuUsageReport(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProcessCpuUsageReport> {
    public override fun getValue() = ProcessCpuUsageReport(pointer.getPointer(0))

    public fun setValue(value: ProcessCpuUsageReport): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProcessCpuUsageReport, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ProcessCpuUsageReport {
      val address = segment.toRawLongValue()
      return ProcessCpuUsageReport(Pointer(address))
    }

    public override fun toNative(obj: ProcessCpuUsageReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
