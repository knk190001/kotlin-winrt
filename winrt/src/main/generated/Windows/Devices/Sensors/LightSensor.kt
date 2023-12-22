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

@ABIMarker(LightSensor.ABI::class)
@Signature("rc(Windows.Devices.Sensors.LightSensor;{f84c0718-0c54-47ae-922e-789f57fb03a0})")
@WinRTByReference(brClass = LightSensor.ByReference::class)
public class LightSensor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILightSensor.WithDefault, ILightSensorDeviceId.WithDefault,
    ILightSensor2.WithDefault, ILightSensor3.WithDefault, IWinRTObject {
  private val __1287303420_Interface: ILightSensor.WithDefault by lazy {
    as_1287303420()
  }


  private val __1401903413_Interface: ILightSensorDeviceId.WithDefault by lazy {
    as_1401903413()
  }


  private val __1251700306_Interface: ILightSensor2.WithDefault by lazy {
    as_1251700306()
  }


  private val __1251700305_Interface: ILightSensor3.WithDefault by lazy {
    as_1251700305()
  }


  public override val __1287303420_Ptr: JNAPointer? by lazy {
    __1287303420_Interface.__1287303420_Ptr
  }


  public override val __1401903413_Ptr: JNAPointer? by lazy {
    __1401903413_Interface.__1401903413_Ptr
  }


  public override val __1251700306_Ptr: JNAPointer? by lazy {
    __1251700306_Interface.__1251700306_Ptr
  }


  public override val __1251700305_Ptr: JNAPointer? by lazy {
    __1251700305_Interface.__1251700305_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1287303420_Interface, __1401903413_Interface, __1251700306_Interface,
        __1251700305_Interface)

  private fun as_1287303420(): ILightSensor.WithDefault {
    if(pointer == NULL) {
      return(ILightSensor.ABI.makeILightSensor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILightSensor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILightSensor.ABI.makeILightSensor(ref.value))
  }

  private fun as_1401903413(): ILightSensorDeviceId.WithDefault {
    if(pointer == NULL) {
      return(ILightSensorDeviceId.ABI.makeILightSensorDeviceId(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILightSensorDeviceId>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILightSensorDeviceId.ABI.makeILightSensorDeviceId(ref.value))
  }

  private fun as_1251700306(): ILightSensor2.WithDefault {
    if(pointer == NULL) {
      return(ILightSensor2.ABI.makeILightSensor2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILightSensor2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILightSensor2.ABI.makeILightSensor2(ref.value))
  }

  private fun as_1251700305(): ILightSensor3.WithDefault {
    if(pointer == NULL) {
      return(ILightSensor3.ABI.makeILightSensor3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILightSensor3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILightSensor3.ABI.makeILightSensor3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<LightSensor> {
    public override fun getValue() = LightSensor(pointer.getPointer(0))

    public fun setValue(value: LightSensor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LightSensor, MemoryAddress> {
    public val ILightSensorStatics2_Instance: ILightSensorStatics2 by lazy {
      createILightSensorStatics2()
    }


    public val ILightSensorStatics_Instance: ILightSensorStatics by lazy {
      createILightSensorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILightSensorStatics2(): ILightSensorStatics2 {
      val refiid = Guid.REFIID(ILightSensorStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.LightSensor".toHandle(),refiid,interfacePtr)
      val result = ILightSensorStatics2.ABI.makeILightSensorStatics2(interfacePtr.value)
      return result
    }

    public fun createILightSensorStatics(): ILightSensorStatics {
      val refiid = Guid.REFIID(ILightSensorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.LightSensor".toHandle(),refiid,interfacePtr)
      val result = ILightSensorStatics.ABI.makeILightSensorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): LightSensor {
      val address = segment.toRawLongValue()
      return LightSensor(Pointer(address))
    }

    public override fun toNative(obj: LightSensor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDeviceSelector() = ABI.ILightSensorStatics2_Instance.GetDeviceSelector()

    public fun FromIdAsync(deviceId: String) =
        ABI.ILightSensorStatics2_Instance.FromIdAsync(deviceId)

    public fun GetDefault() = ABI.ILightSensorStatics_Instance.GetDefault()
  }
}
