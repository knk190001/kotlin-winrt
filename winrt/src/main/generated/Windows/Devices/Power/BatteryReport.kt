package Windows.Devices.Power

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

@ABIMarker(BatteryReport.ABI::class)
@Signature("rc(Windows.Devices.Power.BatteryReport;{c9858c3a-4e13-420a-a8d0-24f18f395401})")
@WinRTByReference(brClass = BatteryReport.ByReference::class)
public class BatteryReport(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBatteryReport.WithDefault, IWinRTObject {
  private val __445233217_Interface: IBatteryReport.WithDefault by lazy {
    as_445233217()
  }


  public override val __445233217_Ptr: JNAPointer? by lazy {
    __445233217_Interface.__445233217_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__445233217_Interface)

  private fun as_445233217(): IBatteryReport.WithDefault {
    if(pointer == NULL) {
      return(IBatteryReport.ABI.makeIBatteryReport(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBatteryReport>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBatteryReport.ABI.makeIBatteryReport(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<BatteryReport>
      {
    public override fun getValue() = BatteryReport(pointer.getPointer(0))

    public fun setValue(value: BatteryReport): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BatteryReport, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BatteryReport {
      val address = segment.toRawLongValue()
      return BatteryReport(Pointer(address))
    }

    public override fun toNative(obj: BatteryReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
