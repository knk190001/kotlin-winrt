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

@ABIMarker(Gyrometer.ABI::class)
@Signature("rc(Windows.Devices.Sensors.Gyrometer;{fdb9a9c4-84b1-4ca2-9763-9b589506c70c})")
@WinRTByReference(brClass = Gyrometer.ByReference::class)
public class Gyrometer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGyrometer.WithDefault, IGyrometerDeviceId.WithDefault,
    IGyrometer2.WithDefault, IGyrometer3.WithDefault, IGyrometer4.WithDefault, IWinRTObject {
  private val __697437746_Interface: IGyrometer.WithDefault by lazy {
    as_697437746()
  }


  private val __452301311_Interface: IGyrometerDeviceId.WithDefault by lazy {
    as_452301311()
  }


  private val __145733596_Interface: IGyrometer2.WithDefault by lazy {
    as_145733596()
  }


  private val __145733595_Interface: IGyrometer3.WithDefault by lazy {
    as_145733595()
  }


  private val __145733594_Interface: IGyrometer4.WithDefault by lazy {
    as_145733594()
  }


  public override val __697437746_Ptr: JNAPointer? by lazy {
    __697437746_Interface.__697437746_Ptr
  }


  public override val __452301311_Ptr: JNAPointer? by lazy {
    __452301311_Interface.__452301311_Ptr
  }


  public override val __145733596_Ptr: JNAPointer? by lazy {
    __145733596_Interface.__145733596_Ptr
  }


  public override val __145733595_Ptr: JNAPointer? by lazy {
    __145733595_Interface.__145733595_Ptr
  }


  public override val __145733594_Ptr: JNAPointer? by lazy {
    __145733594_Interface.__145733594_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__697437746_Interface, __452301311_Interface, __145733596_Interface,
        __145733595_Interface, __145733594_Interface)

  private fun as_697437746(): IGyrometer.WithDefault {
    if(pointer == NULL) {
      return(IGyrometer.ABI.makeIGyrometer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGyrometer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGyrometer.ABI.makeIGyrometer(ref.value))
  }

  private fun as_452301311(): IGyrometerDeviceId.WithDefault {
    if(pointer == NULL) {
      return(IGyrometerDeviceId.ABI.makeIGyrometerDeviceId(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGyrometerDeviceId>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGyrometerDeviceId.ABI.makeIGyrometerDeviceId(ref.value))
  }

  private fun as_145733596(): IGyrometer2.WithDefault {
    if(pointer == NULL) {
      return(IGyrometer2.ABI.makeIGyrometer2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGyrometer2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGyrometer2.ABI.makeIGyrometer2(ref.value))
  }

  private fun as_145733595(): IGyrometer3.WithDefault {
    if(pointer == NULL) {
      return(IGyrometer3.ABI.makeIGyrometer3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGyrometer3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGyrometer3.ABI.makeIGyrometer3(ref.value))
  }

  private fun as_145733594(): IGyrometer4.WithDefault {
    if(pointer == NULL) {
      return(IGyrometer4.ABI.makeIGyrometer4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGyrometer4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGyrometer4.ABI.makeIGyrometer4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Gyrometer> {
    public override fun getValue() = Gyrometer(pointer.getPointer(0))

    public fun setValue(value: Gyrometer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Gyrometer, MemoryAddress> {
    public val IGyrometerStatics2_Instance: IGyrometerStatics2 by lazy {
      createIGyrometerStatics2()
    }


    public val IGyrometerStatics_Instance: IGyrometerStatics by lazy {
      createIGyrometerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGyrometerStatics2(): IGyrometerStatics2 {
      val refiid = Guid.REFIID(IGyrometerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.Gyrometer".toHandle(),refiid,interfacePtr)
      val result = IGyrometerStatics2.ABI.makeIGyrometerStatics2(interfacePtr.value)
      return result
    }

    public fun createIGyrometerStatics(): IGyrometerStatics {
      val refiid = Guid.REFIID(IGyrometerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.Gyrometer".toHandle(),refiid,interfacePtr)
      val result = IGyrometerStatics.ABI.makeIGyrometerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Gyrometer {
      val address = segment.toRawLongValue()
      return Gyrometer(Pointer(address))
    }

    public override fun toNative(obj: Gyrometer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDeviceSelector() = ABI.IGyrometerStatics2_Instance.GetDeviceSelector()

    public fun FromIdAsync(deviceId: String) = ABI.IGyrometerStatics2_Instance.FromIdAsync(deviceId)

    public fun GetDefault() = ABI.IGyrometerStatics_Instance.GetDefault()
  }
}
