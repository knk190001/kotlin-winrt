package Windows.Devices.Sensors.Custom

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

@ABIMarker(CustomSensor.ABI::class)
@Signature("rc(Windows.Devices.Sensors.Custom.CustomSensor;{a136f9ad-4034-4b4d-99dd-531aac649c09})")
@WinRTByReference(brClass = CustomSensor.ByReference::class)
public class CustomSensor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICustomSensor.WithDefault, ICustomSensor2.WithDefault, IWinRTObject {
  private val __197478450_Interface: ICustomSensor.WithDefault by lazy {
    as_197478450()
  }


  private val __1826864704_Interface: ICustomSensor2.WithDefault by lazy {
    as_1826864704()
  }


  public override val __197478450_Ptr: JNAPointer? by lazy {
    __197478450_Interface.__197478450_Ptr
  }


  public override val __1826864704_Ptr: JNAPointer? by lazy {
    __1826864704_Interface.__1826864704_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__197478450_Interface, __1826864704_Interface)

  private fun as_197478450(): ICustomSensor.WithDefault {
    if(pointer == NULL) {
      return(ICustomSensor.ABI.makeICustomSensor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICustomSensor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICustomSensor.ABI.makeICustomSensor(ref.value))
  }

  private fun as_1826864704(): ICustomSensor2.WithDefault {
    if(pointer == NULL) {
      return(ICustomSensor2.ABI.makeICustomSensor2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICustomSensor2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICustomSensor2.ABI.makeICustomSensor2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<CustomSensor> {
    public override fun getValue() = CustomSensor(pointer.getPointer(0))

    public fun setValue(value: CustomSensor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CustomSensor, MemoryAddress> {
    public val ICustomSensorStatics_Instance: ICustomSensorStatics by lazy {
      createICustomSensorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICustomSensorStatics(): ICustomSensorStatics {
      val refiid = Guid.REFIID(ICustomSensorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.Custom.CustomSensor".toHandle(),refiid,interfacePtr)
      val result = ICustomSensorStatics.ABI.makeICustomSensorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CustomSensor {
      val address = segment.toRawLongValue()
      return CustomSensor(Pointer(address))
    }

    public override fun toNative(obj: CustomSensor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDeviceSelector(interfaceId: Guid.GUID) =
        ABI.ICustomSensorStatics_Instance.GetDeviceSelector(interfaceId)

    public fun FromIdAsync(sensorId: String) =
        ABI.ICustomSensorStatics_Instance.FromIdAsync(sensorId)
  }
}
