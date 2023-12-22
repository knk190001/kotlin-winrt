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

@ABIMarker(Accelerometer.ABI::class)
@Signature("rc(Windows.Devices.Sensors.Accelerometer;{df184548-2711-4da7-8098-4b82205d3c7d})")
@WinRTByReference(brClass = Accelerometer.ByReference::class)
public class Accelerometer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAccelerometer.WithDefault, IAccelerometerDeviceId.WithDefault,
    IAccelerometer2.WithDefault, IAccelerometer3.WithDefault, IAccelerometer4.WithDefault,
    IAccelerometer5.WithDefault, IWinRTObject {
  private val __1246634525_Interface: IAccelerometer.WithDefault by lazy {
    as_1246634525()
  }


  private val __1193974036_Interface: IAccelerometerDeviceId.WithDefault by lazy {
    as_1193974036()
  }


  private val __9035439_Interface: IAccelerometer2.WithDefault by lazy {
    as_9035439()
  }


  private val __9035440_Interface: IAccelerometer3.WithDefault by lazy {
    as_9035440()
  }


  private val __9035441_Interface: IAccelerometer4.WithDefault by lazy {
    as_9035441()
  }


  private val __9035442_Interface: IAccelerometer5.WithDefault by lazy {
    as_9035442()
  }


  public override val __1246634525_Ptr: JNAPointer? by lazy {
    __1246634525_Interface.__1246634525_Ptr
  }


  public override val __1193974036_Ptr: JNAPointer? by lazy {
    __1193974036_Interface.__1193974036_Ptr
  }


  public override val __9035439_Ptr: JNAPointer? by lazy {
    __9035439_Interface.__9035439_Ptr
  }


  public override val __9035440_Ptr: JNAPointer? by lazy {
    __9035440_Interface.__9035440_Ptr
  }


  public override val __9035441_Ptr: JNAPointer? by lazy {
    __9035441_Interface.__9035441_Ptr
  }


  public override val __9035442_Ptr: JNAPointer? by lazy {
    __9035442_Interface.__9035442_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1246634525_Interface, __1193974036_Interface, __9035439_Interface,
        __9035440_Interface, __9035441_Interface, __9035442_Interface)

  private fun as_1246634525(): IAccelerometer.WithDefault {
    if(pointer == NULL) {
      return(IAccelerometer.ABI.makeIAccelerometer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAccelerometer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAccelerometer.ABI.makeIAccelerometer(ref.value))
  }

  private fun as_1193974036(): IAccelerometerDeviceId.WithDefault {
    if(pointer == NULL) {
      return(IAccelerometerDeviceId.ABI.makeIAccelerometerDeviceId(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAccelerometerDeviceId>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAccelerometerDeviceId.ABI.makeIAccelerometerDeviceId(ref.value))
  }

  private fun as_9035439(): IAccelerometer2.WithDefault {
    if(pointer == NULL) {
      return(IAccelerometer2.ABI.makeIAccelerometer2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAccelerometer2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAccelerometer2.ABI.makeIAccelerometer2(ref.value))
  }

  private fun as_9035440(): IAccelerometer3.WithDefault {
    if(pointer == NULL) {
      return(IAccelerometer3.ABI.makeIAccelerometer3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAccelerometer3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAccelerometer3.ABI.makeIAccelerometer3(ref.value))
  }

  private fun as_9035441(): IAccelerometer4.WithDefault {
    if(pointer == NULL) {
      return(IAccelerometer4.ABI.makeIAccelerometer4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAccelerometer4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAccelerometer4.ABI.makeIAccelerometer4(ref.value))
  }

  private fun as_9035442(): IAccelerometer5.WithDefault {
    if(pointer == NULL) {
      return(IAccelerometer5.ABI.makeIAccelerometer5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAccelerometer5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAccelerometer5.ABI.makeIAccelerometer5(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Accelerometer>
      {
    public override fun getValue() = Accelerometer(pointer.getPointer(0))

    public fun setValue(value: Accelerometer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Accelerometer, MemoryAddress> {
    public val IAccelerometerStatics2_Instance: IAccelerometerStatics2 by lazy {
      createIAccelerometerStatics2()
    }


    public val IAccelerometerStatics_Instance: IAccelerometerStatics by lazy {
      createIAccelerometerStatics()
    }


    public val IAccelerometerStatics3_Instance: IAccelerometerStatics3 by lazy {
      createIAccelerometerStatics3()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAccelerometerStatics2(): IAccelerometerStatics2 {
      val refiid = Guid.REFIID(IAccelerometerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.Accelerometer".toHandle(),refiid,interfacePtr)
      val result = IAccelerometerStatics2.ABI.makeIAccelerometerStatics2(interfacePtr.value)
      return result
    }

    public fun createIAccelerometerStatics(): IAccelerometerStatics {
      val refiid = Guid.REFIID(IAccelerometerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.Accelerometer".toHandle(),refiid,interfacePtr)
      val result = IAccelerometerStatics.ABI.makeIAccelerometerStatics(interfacePtr.value)
      return result
    }

    public fun createIAccelerometerStatics3(): IAccelerometerStatics3 {
      val refiid = Guid.REFIID(IAccelerometerStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.Accelerometer".toHandle(),refiid,interfacePtr)
      val result = IAccelerometerStatics3.ABI.makeIAccelerometerStatics3(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Accelerometer {
      val address = segment.toRawLongValue()
      return Accelerometer(Pointer(address))
    }

    public override fun toNative(obj: Accelerometer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault(readingType: AccelerometerReadingType) =
        ABI.IAccelerometerStatics2_Instance.GetDefault(readingType)

    public fun GetDefault() = ABI.IAccelerometerStatics_Instance.GetDefault()

    public fun FromIdAsync(deviceId: String) =
        ABI.IAccelerometerStatics3_Instance.FromIdAsync(deviceId)

    public fun GetDeviceSelector(readingType: AccelerometerReadingType) =
        ABI.IAccelerometerStatics3_Instance.GetDeviceSelector(readingType)
  }
}
