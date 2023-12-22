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

@ABIMarker(ActivitySensorReading.ABI::class)
@Signature("rc(Windows.Devices.Sensors.ActivitySensorReading;{85125a96-1472-40a2-b2ae-e1ef29226c78})")
@WinRTByReference(brClass = ActivitySensorReading.ByReference::class)
public class ActivitySensorReading(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IActivitySensorReading.WithDefault, IWinRTObject {
  private val __1115253705_Interface: IActivitySensorReading.WithDefault by lazy {
    as_1115253705()
  }


  public override val __1115253705_Ptr: JNAPointer? by lazy {
    __1115253705_Interface.__1115253705_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1115253705_Interface)

  private fun as_1115253705(): IActivitySensorReading.WithDefault {
    if(pointer == NULL) {
      return(IActivitySensorReading.ABI.makeIActivitySensorReading(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IActivitySensorReading>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IActivitySensorReading.ABI.makeIActivitySensorReading(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ActivitySensorReading> {
    public override fun getValue() = ActivitySensorReading(pointer.getPointer(0))

    public fun setValue(value: ActivitySensorReading): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ActivitySensorReading, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ActivitySensorReading {
      val address = segment.toRawLongValue()
      return ActivitySensorReading(Pointer(address))
    }

    public override fun toNative(obj: ActivitySensorReading): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
