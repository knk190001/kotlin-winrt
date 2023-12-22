package Windows.Devices.Sensors

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

@ABIMarker(ActivitySensorReadingChangeReport.ABI::class)
@Signature("rc(Windows.Devices.Sensors.ActivitySensorReadingChangeReport;{4f3c2915-d93b-47bd-960a-f20fb2f322b9})")
@WinRTByReference(brClass = ActivitySensorReadingChangeReport.ByReference::class)
public class ActivitySensorReadingChangeReport(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IActivitySensorReadingChangeReport.WithDefault, IWinRTObject {
  private val __1540284709_Interface: IActivitySensorReadingChangeReport.WithDefault by lazy {
    as_1540284709()
  }


  public override val __1540284709_Ptr: JNAPointer? by lazy {
    __1540284709_Interface.__1540284709_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1540284709_Interface)

  private fun as_1540284709(): IActivitySensorReadingChangeReport.WithDefault {
    if(pointer == NULL) {
      return(IActivitySensorReadingChangeReport.ABI.makeIActivitySensorReadingChangeReport(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IActivitySensorReadingChangeReport>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IActivitySensorReadingChangeReport.ABI.makeIActivitySensorReadingChangeReport(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ActivitySensorReadingChangeReport> {
    public override fun getValue() = ActivitySensorReadingChangeReport(pointer.getPointer(0))

    public fun setValue(value: ActivitySensorReadingChangeReport): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ActivitySensorReadingChangeReport, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ActivitySensorReadingChangeReport {
      val address = segment.toRawLongValue()
      return ActivitySensorReadingChangeReport(Pointer(address))
    }

    public override fun toNative(obj: ActivitySensorReadingChangeReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
