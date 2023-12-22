package Windows.Devices.Sensors

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

@ABIMarker(OrientationSensor.ABI::class)
@Signature("rc(Windows.Devices.Sensors.OrientationSensor;{5e354635-cf6b-4c63-abd8-10252b0bf6ec})")
@WinRTByReference(brClass = OrientationSensor.ByReference::class)
public class OrientationSensor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IOrientationSensor.WithDefault, IOrientationSensorDeviceId.WithDefault,
    IOrientationSensor2.WithDefault, IOrientationSensor3.WithDefault, IWinRTObject {
  private val __71508674_Interface: IOrientationSensor.WithDefault by lazy {
    as_71508674()
  }


  private val __1038480017_Interface: IOrientationSensorDeviceId.WithDefault by lazy {
    as_1038480017()
  }


  private val __2078198452_Interface: IOrientationSensor2.WithDefault by lazy {
    as_2078198452()
  }


  private val __2078198453_Interface: IOrientationSensor3.WithDefault by lazy {
    as_2078198453()
  }


  public override val __71508674_Ptr: JNAPointer? by lazy {
    __71508674_Interface.__71508674_Ptr
  }


  public override val __1038480017_Ptr: JNAPointer? by lazy {
    __1038480017_Interface.__1038480017_Ptr
  }


  public override val __2078198452_Ptr: JNAPointer? by lazy {
    __2078198452_Interface.__2078198452_Ptr
  }


  public override val __2078198453_Ptr: JNAPointer? by lazy {
    __2078198453_Interface.__2078198453_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__71508674_Interface, __1038480017_Interface, __2078198452_Interface,
        __2078198453_Interface)

  private fun as_71508674(): IOrientationSensor.WithDefault {
    if(pointer == NULL) {
      return(IOrientationSensor.ABI.makeIOrientationSensor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IOrientationSensor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IOrientationSensor.ABI.makeIOrientationSensor(ref.value))
  }

  private fun as_1038480017(): IOrientationSensorDeviceId.WithDefault {
    if(pointer == NULL) {
      return(IOrientationSensorDeviceId.ABI.makeIOrientationSensorDeviceId(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IOrientationSensorDeviceId>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IOrientationSensorDeviceId.ABI.makeIOrientationSensorDeviceId(ref.value))
  }

  private fun as_2078198452(): IOrientationSensor2.WithDefault {
    if(pointer == NULL) {
      return(IOrientationSensor2.ABI.makeIOrientationSensor2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IOrientationSensor2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IOrientationSensor2.ABI.makeIOrientationSensor2(ref.value))
  }

  private fun as_2078198453(): IOrientationSensor3.WithDefault {
    if(pointer == NULL) {
      return(IOrientationSensor3.ABI.makeIOrientationSensor3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IOrientationSensor3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IOrientationSensor3.ABI.makeIOrientationSensor3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<OrientationSensor> {
    public override fun getValue() = OrientationSensor(pointer.getPointer(0))

    public fun setValue(value: OrientationSensor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<OrientationSensor, MemoryAddress> {
    public val IOrientationSensorStatics_Instance: IOrientationSensorStatics by lazy {
      createIOrientationSensorStatics()
    }


    public val IOrientationSensorStatics2_Instance: IOrientationSensorStatics2 by lazy {
      createIOrientationSensorStatics2()
    }


    public val IOrientationSensorStatics3_Instance: IOrientationSensorStatics3 by lazy {
      createIOrientationSensorStatics3()
    }


    public val IOrientationSensorStatics4_Instance: IOrientationSensorStatics4 by lazy {
      createIOrientationSensorStatics4()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIOrientationSensorStatics(): IOrientationSensorStatics {
      val refiid = Guid.REFIID(IOrientationSensorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.OrientationSensor".toHandle(),refiid,interfacePtr)
      val result = IOrientationSensorStatics.ABI.makeIOrientationSensorStatics(interfacePtr.value)
      return result
    }

    public fun createIOrientationSensorStatics2(): IOrientationSensorStatics2 {
      val refiid = Guid.REFIID(IOrientationSensorStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.OrientationSensor".toHandle(),refiid,interfacePtr)
      val result = IOrientationSensorStatics2.ABI.makeIOrientationSensorStatics2(interfacePtr.value)
      return result
    }

    public fun createIOrientationSensorStatics3(): IOrientationSensorStatics3 {
      val refiid = Guid.REFIID(IOrientationSensorStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.OrientationSensor".toHandle(),refiid,interfacePtr)
      val result = IOrientationSensorStatics3.ABI.makeIOrientationSensorStatics3(interfacePtr.value)
      return result
    }

    public fun createIOrientationSensorStatics4(): IOrientationSensorStatics4 {
      val refiid = Guid.REFIID(IOrientationSensorStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.OrientationSensor".toHandle(),refiid,interfacePtr)
      val result = IOrientationSensorStatics4.ABI.makeIOrientationSensorStatics4(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): OrientationSensor {
      val address = segment.toRawLongValue()
      return OrientationSensor(Pointer(address))
    }

    public override fun toNative(obj: OrientationSensor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IOrientationSensorStatics_Instance.GetDefault()

    public fun GetDefaultForRelativeReadings() =
        ABI.IOrientationSensorStatics2_Instance.GetDefaultForRelativeReadings()

    public fun GetDefault(sensorReadingtype: SensorReadingType) =
        ABI.IOrientationSensorStatics3_Instance.GetDefault(sensorReadingtype)

    public fun GetDefault(sensorReadingType: SensorReadingType,
        optimizationGoal: SensorOptimizationGoal) =
        ABI.IOrientationSensorStatics3_Instance.GetDefault(sensorReadingType, optimizationGoal)

    public fun GetDeviceSelector(readingType: SensorReadingType) =
        ABI.IOrientationSensorStatics4_Instance.GetDeviceSelector(readingType)

    public fun GetDeviceSelector(readingType: SensorReadingType,
        optimizationGoal: SensorOptimizationGoal) =
        ABI.IOrientationSensorStatics4_Instance.GetDeviceSelector(readingType, optimizationGoal)

    public fun FromIdAsync(deviceId: String) =
        ABI.IOrientationSensorStatics4_Instance.FromIdAsync(deviceId)
  }
}
