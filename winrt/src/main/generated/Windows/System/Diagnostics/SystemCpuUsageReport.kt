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

@ABIMarker(SystemCpuUsageReport.ABI::class)
@Signature("rc(Windows.System.Diagnostics.SystemCpuUsageReport;{2c26d0b2-9483-4f62-ab57-82b29d9719b8})")
@WinRTByReference(brClass = SystemCpuUsageReport.ByReference::class)
public class SystemCpuUsageReport(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISystemCpuUsageReport.WithDefault, IWinRTObject {
  private val __523565427_Interface: ISystemCpuUsageReport.WithDefault by lazy {
    as_523565427()
  }


  public override val __523565427_Ptr: JNAPointer? by lazy {
    __523565427_Interface.__523565427_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__523565427_Interface)

  private fun as_523565427(): ISystemCpuUsageReport.WithDefault {
    if(pointer == NULL) {
      return(ISystemCpuUsageReport.ABI.makeISystemCpuUsageReport(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemCpuUsageReport>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemCpuUsageReport.ABI.makeISystemCpuUsageReport(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemCpuUsageReport> {
    public override fun getValue() = SystemCpuUsageReport(pointer.getPointer(0))

    public fun setValue(value: SystemCpuUsageReport): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemCpuUsageReport, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SystemCpuUsageReport {
      val address = segment.toRawLongValue()
      return SystemCpuUsageReport(Pointer(address))
    }

    public override fun toNative(obj: SystemCpuUsageReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
