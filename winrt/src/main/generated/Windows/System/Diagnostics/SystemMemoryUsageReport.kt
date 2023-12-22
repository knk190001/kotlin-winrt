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

@ABIMarker(SystemMemoryUsageReport.ABI::class)
@Signature("rc(Windows.System.Diagnostics.SystemMemoryUsageReport;{38663c87-2a9f-403a-bd19-2cf3e8169500})")
@WinRTByReference(brClass = SystemMemoryUsageReport.ByReference::class)
public class SystemMemoryUsageReport(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISystemMemoryUsageReport.WithDefault, IWinRTObject {
  private val __1223088300_Interface: ISystemMemoryUsageReport.WithDefault by lazy {
    as_1223088300()
  }


  public override val __1223088300_Ptr: JNAPointer? by lazy {
    __1223088300_Interface.__1223088300_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1223088300_Interface)

  private fun as_1223088300(): ISystemMemoryUsageReport.WithDefault {
    if(pointer == NULL) {
      return(ISystemMemoryUsageReport.ABI.makeISystemMemoryUsageReport(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemMemoryUsageReport>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemMemoryUsageReport.ABI.makeISystemMemoryUsageReport(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemMemoryUsageReport> {
    public override fun getValue() = SystemMemoryUsageReport(pointer.getPointer(0))

    public fun setValue(value: SystemMemoryUsageReport): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemMemoryUsageReport, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SystemMemoryUsageReport {
      val address = segment.toRawLongValue()
      return SystemMemoryUsageReport(Pointer(address))
    }

    public override fun toNative(obj: SystemMemoryUsageReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
