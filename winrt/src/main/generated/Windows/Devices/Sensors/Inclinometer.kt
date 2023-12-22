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

@ABIMarker(Inclinometer.ABI::class)
@Signature("rc(Windows.Devices.Sensors.Inclinometer;{2648ca6f-2286-406f-9161-f0c4bd806ebf})")
@WinRTByReference(brClass = Inclinometer.ByReference::class)
public class Inclinometer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInclinometer.WithDefault, IInclinometerDeviceId.WithDefault,
    IInclinometer2.WithDefault, IInclinometer3.WithDefault, IInclinometer4.WithDefault, IWinRTObject
    {
  private val __894073881_Interface: IInclinometer.WithDefault by lazy {
    as_894073881()
  }


  private val __833921354_Interface: IInclinometerDeviceId.WithDefault by lazy {
    as_833921354()
  }


  private val __1946486585_Interface: IInclinometer2.WithDefault by lazy {
    as_1946486585()
  }


  private val __1946486586_Interface: IInclinometer3.WithDefault by lazy {
    as_1946486586()
  }


  private val __1946486587_Interface: IInclinometer4.WithDefault by lazy {
    as_1946486587()
  }


  public override val __894073881_Ptr: JNAPointer? by lazy {
    __894073881_Interface.__894073881_Ptr
  }


  public override val __833921354_Ptr: JNAPointer? by lazy {
    __833921354_Interface.__833921354_Ptr
  }


  public override val __1946486585_Ptr: JNAPointer? by lazy {
    __1946486585_Interface.__1946486585_Ptr
  }


  public override val __1946486586_Ptr: JNAPointer? by lazy {
    __1946486586_Interface.__1946486586_Ptr
  }


  public override val __1946486587_Ptr: JNAPointer? by lazy {
    __1946486587_Interface.__1946486587_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__894073881_Interface, __833921354_Interface, __1946486585_Interface,
        __1946486586_Interface, __1946486587_Interface)

  private fun as_894073881(): IInclinometer.WithDefault {
    if(pointer == NULL) {
      return(IInclinometer.ABI.makeIInclinometer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInclinometer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInclinometer.ABI.makeIInclinometer(ref.value))
  }

  private fun as_833921354(): IInclinometerDeviceId.WithDefault {
    if(pointer == NULL) {
      return(IInclinometerDeviceId.ABI.makeIInclinometerDeviceId(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInclinometerDeviceId>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInclinometerDeviceId.ABI.makeIInclinometerDeviceId(ref.value))
  }

  private fun as_1946486585(): IInclinometer2.WithDefault {
    if(pointer == NULL) {
      return(IInclinometer2.ABI.makeIInclinometer2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInclinometer2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInclinometer2.ABI.makeIInclinometer2(ref.value))
  }

  private fun as_1946486586(): IInclinometer3.WithDefault {
    if(pointer == NULL) {
      return(IInclinometer3.ABI.makeIInclinometer3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInclinometer3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInclinometer3.ABI.makeIInclinometer3(ref.value))
  }

  private fun as_1946486587(): IInclinometer4.WithDefault {
    if(pointer == NULL) {
      return(IInclinometer4.ABI.makeIInclinometer4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInclinometer4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInclinometer4.ABI.makeIInclinometer4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Inclinometer> {
    public override fun getValue() = Inclinometer(pointer.getPointer(0))

    public fun setValue(value: Inclinometer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Inclinometer, MemoryAddress> {
    public val IInclinometerStatics2_Instance: IInclinometerStatics2 by lazy {
      createIInclinometerStatics2()
    }


    public val IInclinometerStatics_Instance: IInclinometerStatics by lazy {
      createIInclinometerStatics()
    }


    public val IInclinometerStatics4_Instance: IInclinometerStatics4 by lazy {
      createIInclinometerStatics4()
    }


    public val IInclinometerStatics3_Instance: IInclinometerStatics3 by lazy {
      createIInclinometerStatics3()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInclinometerStatics2(): IInclinometerStatics2 {
      val refiid = Guid.REFIID(IInclinometerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.Inclinometer".toHandle(),refiid,interfacePtr)
      val result = IInclinometerStatics2.ABI.makeIInclinometerStatics2(interfacePtr.value)
      return result
    }

    public fun createIInclinometerStatics(): IInclinometerStatics {
      val refiid = Guid.REFIID(IInclinometerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.Inclinometer".toHandle(),refiid,interfacePtr)
      val result = IInclinometerStatics.ABI.makeIInclinometerStatics(interfacePtr.value)
      return result
    }

    public fun createIInclinometerStatics4(): IInclinometerStatics4 {
      val refiid = Guid.REFIID(IInclinometerStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.Inclinometer".toHandle(),refiid,interfacePtr)
      val result = IInclinometerStatics4.ABI.makeIInclinometerStatics4(interfacePtr.value)
      return result
    }

    public fun createIInclinometerStatics3(): IInclinometerStatics3 {
      val refiid = Guid.REFIID(IInclinometerStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.Inclinometer".toHandle(),refiid,interfacePtr)
      val result = IInclinometerStatics3.ABI.makeIInclinometerStatics3(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Inclinometer {
      val address = segment.toRawLongValue()
      return Inclinometer(Pointer(address))
    }

    public override fun toNative(obj: Inclinometer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefaultForRelativeReadings() =
        ABI.IInclinometerStatics2_Instance.GetDefaultForRelativeReadings()

    public fun GetDefault() = ABI.IInclinometerStatics_Instance.GetDefault()

    public fun GetDeviceSelector(readingType: SensorReadingType) =
        ABI.IInclinometerStatics4_Instance.GetDeviceSelector(readingType)

    public fun FromIdAsync(deviceId: String) =
        ABI.IInclinometerStatics4_Instance.FromIdAsync(deviceId)

    public fun GetDefault(sensorReadingtype: SensorReadingType) =
        ABI.IInclinometerStatics3_Instance.GetDefault(sensorReadingtype)
  }
}
