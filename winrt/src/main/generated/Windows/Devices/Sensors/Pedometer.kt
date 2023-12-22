package Windows.Devices.Sensors

import Windows.Foundation.DateTime
import Windows.Foundation.TimeSpan
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(Pedometer.ABI::class)
@Signature("rc(Windows.Devices.Sensors.Pedometer;{9a1e013d-3d98-45f8-8920-8e4ecaca5f97})")
@WinRTByReference(brClass = Pedometer.ByReference::class)
public class Pedometer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPedometer.WithDefault, IPedometer2.WithDefault, IWinRTObject {
  private val __178723293_Interface: IPedometer.WithDefault by lazy {
    as_178723293()
  }


  private val __1245454837_Interface: IPedometer2.WithDefault by lazy {
    as_1245454837()
  }


  public override val __178723293_Ptr: JNAPointer? by lazy {
    __178723293_Interface.__178723293_Ptr
  }


  public override val __1245454837_Ptr: JNAPointer? by lazy {
    __1245454837_Interface.__1245454837_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__178723293_Interface, __1245454837_Interface)

  private fun as_178723293(): IPedometer.WithDefault {
    if(pointer == NULL) {
      return(IPedometer.ABI.makeIPedometer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPedometer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPedometer.ABI.makeIPedometer(ref.value))
  }

  private fun as_1245454837(): IPedometer2.WithDefault {
    if(pointer == NULL) {
      return(IPedometer2.ABI.makeIPedometer2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPedometer2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPedometer2.ABI.makeIPedometer2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Pedometer> {
    public override fun getValue() = Pedometer(pointer.getPointer(0))

    public fun setValue(value: Pedometer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Pedometer, MemoryAddress> {
    public val IPedometerStatics2_Instance: IPedometerStatics2 by lazy {
      createIPedometerStatics2()
    }


    public val IPedometerStatics_Instance: IPedometerStatics by lazy {
      createIPedometerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPedometerStatics2(): IPedometerStatics2 {
      val refiid = Guid.REFIID(IPedometerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.Pedometer".toHandle(),refiid,interfacePtr)
      val result = IPedometerStatics2.ABI.makeIPedometerStatics2(interfacePtr.value)
      return result
    }

    public fun createIPedometerStatics(): IPedometerStatics {
      val refiid = Guid.REFIID(IPedometerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.Pedometer".toHandle(),refiid,interfacePtr)
      val result = IPedometerStatics.ABI.makeIPedometerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Pedometer {
      val address = segment.toRawLongValue()
      return Pedometer(Pointer(address))
    }

    public override fun toNative(obj: Pedometer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetReadingsFromTriggerDetails(triggerDetails: SensorDataThresholdTriggerDetails) =
        ABI.IPedometerStatics2_Instance.GetReadingsFromTriggerDetails(triggerDetails)

    public fun FromIdAsync(deviceId: String) = ABI.IPedometerStatics_Instance.FromIdAsync(deviceId)

    public fun GetDefaultAsync() = ABI.IPedometerStatics_Instance.GetDefaultAsync()

    public fun GetDeviceSelector() = ABI.IPedometerStatics_Instance.GetDeviceSelector()

    public fun GetSystemHistoryAsync(fromTime: DateTime) =
        ABI.IPedometerStatics_Instance.GetSystemHistoryAsync(fromTime)

    public fun GetSystemHistoryAsync(fromTime: DateTime, duration: TimeSpan) =
        ABI.IPedometerStatics_Instance.GetSystemHistoryAsync(fromTime, duration)
  }
}
