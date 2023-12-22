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

@ABIMarker(SimpleOrientationSensor.ABI::class)
@Signature("rc(Windows.Devices.Sensors.SimpleOrientationSensor;{5ff53856-214a-4dee-a3f9-616f1ab06ffd})")
@WinRTByReference(brClass = SimpleOrientationSensor.ByReference::class)
public class SimpleOrientationSensor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISimpleOrientationSensor.WithDefault,
    ISimpleOrientationSensorDeviceId.WithDefault, ISimpleOrientationSensor2.WithDefault,
    IWinRTObject {
  private val __1536968364_Interface: ISimpleOrientationSensor.WithDefault by lazy {
    as_1536968364()
  }


  private val __1712838435_Interface: ISimpleOrientationSensorDeviceId.WithDefault by lazy {
    as_1712838435()
  }


  private val __401379078_Interface: ISimpleOrientationSensor2.WithDefault by lazy {
    as_401379078()
  }


  public override val __1536968364_Ptr: JNAPointer? by lazy {
    __1536968364_Interface.__1536968364_Ptr
  }


  public override val __1712838435_Ptr: JNAPointer? by lazy {
    __1712838435_Interface.__1712838435_Ptr
  }


  public override val __401379078_Ptr: JNAPointer? by lazy {
    __401379078_Interface.__401379078_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1536968364_Interface, __1712838435_Interface, __401379078_Interface)

  private fun as_1536968364(): ISimpleOrientationSensor.WithDefault {
    if(pointer == NULL) {
      return(ISimpleOrientationSensor.ABI.makeISimpleOrientationSensor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISimpleOrientationSensor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISimpleOrientationSensor.ABI.makeISimpleOrientationSensor(ref.value))
  }

  private fun as_1712838435(): ISimpleOrientationSensorDeviceId.WithDefault {
    if(pointer == NULL) {
      return(ISimpleOrientationSensorDeviceId.ABI.makeISimpleOrientationSensorDeviceId(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISimpleOrientationSensorDeviceId>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISimpleOrientationSensorDeviceId.ABI.makeISimpleOrientationSensorDeviceId(ref.value))
  }

  private fun as_401379078(): ISimpleOrientationSensor2.WithDefault {
    if(pointer == NULL) {
      return(ISimpleOrientationSensor2.ABI.makeISimpleOrientationSensor2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISimpleOrientationSensor2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISimpleOrientationSensor2.ABI.makeISimpleOrientationSensor2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SimpleOrientationSensor> {
    public override fun getValue() = SimpleOrientationSensor(pointer.getPointer(0))

    public fun setValue(value: SimpleOrientationSensor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SimpleOrientationSensor, MemoryAddress> {
    public val ISimpleOrientationSensorStatics2_Instance: ISimpleOrientationSensorStatics2 by lazy {
      createISimpleOrientationSensorStatics2()
    }


    public val ISimpleOrientationSensorStatics_Instance: ISimpleOrientationSensorStatics by lazy {
      createISimpleOrientationSensorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISimpleOrientationSensorStatics2(): ISimpleOrientationSensorStatics2 {
      val refiid = Guid.REFIID(ISimpleOrientationSensorStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.SimpleOrientationSensor".toHandle(),refiid,interfacePtr)
      val result =
          ISimpleOrientationSensorStatics2.ABI.makeISimpleOrientationSensorStatics2(interfacePtr.value)
      return result
    }

    public fun createISimpleOrientationSensorStatics(): ISimpleOrientationSensorStatics {
      val refiid = Guid.REFIID(ISimpleOrientationSensorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.SimpleOrientationSensor".toHandle(),refiid,interfacePtr)
      val result =
          ISimpleOrientationSensorStatics.ABI.makeISimpleOrientationSensorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SimpleOrientationSensor {
      val address = segment.toRawLongValue()
      return SimpleOrientationSensor(Pointer(address))
    }

    public override fun toNative(obj: SimpleOrientationSensor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDeviceSelector() =
        ABI.ISimpleOrientationSensorStatics2_Instance.GetDeviceSelector()

    public fun FromIdAsync(deviceId: String) =
        ABI.ISimpleOrientationSensorStatics2_Instance.FromIdAsync(deviceId)

    public fun GetDefault() = ABI.ISimpleOrientationSensorStatics_Instance.GetDefault()
  }
}
