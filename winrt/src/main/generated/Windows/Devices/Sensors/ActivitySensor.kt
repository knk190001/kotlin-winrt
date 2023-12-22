package Windows.Devices.Sensors

import Windows.Foundation.DateTime
import Windows.Foundation.TimeSpan
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ActivitySensor.ABI::class)
@Signature("rc(Windows.Devices.Sensors.ActivitySensor;{cd7a630c-fb5f-48eb-b09b-a2708d1c61ef})")
@WinRTByReference(brClass = ActivitySensor.ByReference::class)
public class ActivitySensor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IActivitySensor.WithDefault, IWinRTObject {
  private val __1731784853_Interface: IActivitySensor.WithDefault by lazy {
    as_1731784853()
  }


  public override val __1731784853_Ptr: JNAPointer? by lazy {
    __1731784853_Interface.__1731784853_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1731784853_Interface)

  private fun as_1731784853(): IActivitySensor.WithDefault {
    if(pointer == NULL) {
      return(IActivitySensor.ABI.makeIActivitySensor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IActivitySensor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IActivitySensor.ABI.makeIActivitySensor(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ActivitySensor>
      {
    public override fun getValue() = ActivitySensor(pointer.getPointer(0))

    public fun setValue(value: ActivitySensor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ActivitySensor, MemoryAddress> {
    public val IActivitySensorStatics_Instance: IActivitySensorStatics by lazy {
      createIActivitySensorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIActivitySensorStatics(): IActivitySensorStatics {
      val refiid = Guid.REFIID(IActivitySensorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.ActivitySensor".toHandle(),refiid,interfacePtr)
      val result = IActivitySensorStatics.ABI.makeIActivitySensorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ActivitySensor {
      val address = segment.toRawLongValue()
      return ActivitySensor(Pointer(address))
    }

    public override fun toNative(obj: ActivitySensor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefaultAsync() = ABI.IActivitySensorStatics_Instance.GetDefaultAsync()

    public fun GetDeviceSelector() = ABI.IActivitySensorStatics_Instance.GetDeviceSelector()

    public fun FromIdAsync(deviceId: String) =
        ABI.IActivitySensorStatics_Instance.FromIdAsync(deviceId)

    public fun GetSystemHistoryAsync(fromTime: DateTime) =
        ABI.IActivitySensorStatics_Instance.GetSystemHistoryAsync(fromTime)

    public fun GetSystemHistoryAsync(fromTime: DateTime, duration: TimeSpan) =
        ABI.IActivitySensorStatics_Instance.GetSystemHistoryAsync(fromTime, duration)
  }
}
