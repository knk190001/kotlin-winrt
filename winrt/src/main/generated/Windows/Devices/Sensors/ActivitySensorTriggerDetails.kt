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

@ABIMarker(ActivitySensorTriggerDetails.ABI::class)
@Signature("rc(Windows.Devices.Sensors.ActivitySensorTriggerDetails;{2c9e6612-b9ca-4677-b263-243297f79d3a})")
@WinRTByReference(brClass = ActivitySensorTriggerDetails.ByReference::class)
public class ActivitySensorTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IActivitySensorTriggerDetails.WithDefault, IWinRTObject {
  private val __1821546145_Interface: IActivitySensorTriggerDetails.WithDefault by lazy {
    as_1821546145()
  }


  public override val __1821546145_Ptr: JNAPointer? by lazy {
    __1821546145_Interface.__1821546145_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1821546145_Interface)

  private fun as_1821546145(): IActivitySensorTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IActivitySensorTriggerDetails.ABI.makeIActivitySensorTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IActivitySensorTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IActivitySensorTriggerDetails.ABI.makeIActivitySensorTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ActivitySensorTriggerDetails> {
    public override fun getValue() = ActivitySensorTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: ActivitySensorTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ActivitySensorTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ActivitySensorTriggerDetails {
      val address = segment.toRawLongValue()
      return ActivitySensorTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: ActivitySensorTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
