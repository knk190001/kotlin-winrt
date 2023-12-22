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

@ABIMarker(Magnetometer.ABI::class)
@Signature("rc(Windows.Devices.Sensors.Magnetometer;{484f626e-d3c9-4111-b3f6-2cf1faa418d5})")
@WinRTByReference(brClass = Magnetometer.ByReference::class)
public class Magnetometer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMagnetometer.WithDefault, IMagnetometerDeviceId.WithDefault,
    IMagnetometer2.WithDefault, IMagnetometer3.WithDefault, IMagnetometer4.WithDefault, IWinRTObject
    {
  private val __1543721040_Interface: IMagnetometer.WithDefault by lazy {
    as_1543721040()
  }


  private val __1492300159_Interface: IMagnetometerDeviceId.WithDefault by lazy {
    as_1492300159()
  }


  private val __610712034_Interface: IMagnetometer2.WithDefault by lazy {
    as_610712034()
  }


  private val __610712035_Interface: IMagnetometer3.WithDefault by lazy {
    as_610712035()
  }


  private val __610712036_Interface: IMagnetometer4.WithDefault by lazy {
    as_610712036()
  }


  public override val __1543721040_Ptr: JNAPointer? by lazy {
    __1543721040_Interface.__1543721040_Ptr
  }


  public override val __1492300159_Ptr: JNAPointer? by lazy {
    __1492300159_Interface.__1492300159_Ptr
  }


  public override val __610712034_Ptr: JNAPointer? by lazy {
    __610712034_Interface.__610712034_Ptr
  }


  public override val __610712035_Ptr: JNAPointer? by lazy {
    __610712035_Interface.__610712035_Ptr
  }


  public override val __610712036_Ptr: JNAPointer? by lazy {
    __610712036_Interface.__610712036_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1543721040_Interface, __1492300159_Interface, __610712034_Interface,
        __610712035_Interface, __610712036_Interface)

  private fun as_1543721040(): IMagnetometer.WithDefault {
    if(pointer == NULL) {
      return(IMagnetometer.ABI.makeIMagnetometer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMagnetometer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMagnetometer.ABI.makeIMagnetometer(ref.value))
  }

  private fun as_1492300159(): IMagnetometerDeviceId.WithDefault {
    if(pointer == NULL) {
      return(IMagnetometerDeviceId.ABI.makeIMagnetometerDeviceId(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMagnetometerDeviceId>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMagnetometerDeviceId.ABI.makeIMagnetometerDeviceId(ref.value))
  }

  private fun as_610712034(): IMagnetometer2.WithDefault {
    if(pointer == NULL) {
      return(IMagnetometer2.ABI.makeIMagnetometer2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMagnetometer2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMagnetometer2.ABI.makeIMagnetometer2(ref.value))
  }

  private fun as_610712035(): IMagnetometer3.WithDefault {
    if(pointer == NULL) {
      return(IMagnetometer3.ABI.makeIMagnetometer3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMagnetometer3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMagnetometer3.ABI.makeIMagnetometer3(ref.value))
  }

  private fun as_610712036(): IMagnetometer4.WithDefault {
    if(pointer == NULL) {
      return(IMagnetometer4.ABI.makeIMagnetometer4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMagnetometer4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMagnetometer4.ABI.makeIMagnetometer4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Magnetometer> {
    public override fun getValue() = Magnetometer(pointer.getPointer(0))

    public fun setValue(value: Magnetometer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Magnetometer, MemoryAddress> {
    public val IMagnetometerStatics_Instance: IMagnetometerStatics by lazy {
      createIMagnetometerStatics()
    }


    public val IMagnetometerStatics2_Instance: IMagnetometerStatics2 by lazy {
      createIMagnetometerStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMagnetometerStatics(): IMagnetometerStatics {
      val refiid = Guid.REFIID(IMagnetometerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.Magnetometer".toHandle(),refiid,interfacePtr)
      val result = IMagnetometerStatics.ABI.makeIMagnetometerStatics(interfacePtr.value)
      return result
    }

    public fun createIMagnetometerStatics2(): IMagnetometerStatics2 {
      val refiid = Guid.REFIID(IMagnetometerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.Magnetometer".toHandle(),refiid,interfacePtr)
      val result = IMagnetometerStatics2.ABI.makeIMagnetometerStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Magnetometer {
      val address = segment.toRawLongValue()
      return Magnetometer(Pointer(address))
    }

    public override fun toNative(obj: Magnetometer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IMagnetometerStatics_Instance.GetDefault()

    public fun GetDeviceSelector() = ABI.IMagnetometerStatics2_Instance.GetDeviceSelector()

    public fun FromIdAsync(deviceId: String) =
        ABI.IMagnetometerStatics2_Instance.FromIdAsync(deviceId)
  }
}
