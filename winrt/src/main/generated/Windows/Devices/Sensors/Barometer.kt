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

@ABIMarker(Barometer.ABI::class)
@Signature("rc(Windows.Devices.Sensors.Barometer;{934475a8-78bf-452f-b017-f0209ce6dab4})")
@WinRTByReference(brClass = Barometer.ByReference::class)
public class Barometer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBarometer.WithDefault, IBarometer2.WithDefault, IBarometer3.WithDefault,
    IWinRTObject {
  private val __872124897_Interface: IBarometer.WithDefault by lazy {
    as_872124897()
  }


  private val __1266068081_Interface: IBarometer2.WithDefault by lazy {
    as_1266068081()
  }


  private val __1266068082_Interface: IBarometer3.WithDefault by lazy {
    as_1266068082()
  }


  public override val __872124897_Ptr: JNAPointer? by lazy {
    __872124897_Interface.__872124897_Ptr
  }


  public override val __1266068081_Ptr: JNAPointer? by lazy {
    __1266068081_Interface.__1266068081_Ptr
  }


  public override val __1266068082_Ptr: JNAPointer? by lazy {
    __1266068082_Interface.__1266068082_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__872124897_Interface, __1266068081_Interface, __1266068082_Interface)

  private fun as_872124897(): IBarometer.WithDefault {
    if(pointer == NULL) {
      return(IBarometer.ABI.makeIBarometer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarometer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarometer.ABI.makeIBarometer(ref.value))
  }

  private fun as_1266068081(): IBarometer2.WithDefault {
    if(pointer == NULL) {
      return(IBarometer2.ABI.makeIBarometer2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarometer2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarometer2.ABI.makeIBarometer2(ref.value))
  }

  private fun as_1266068082(): IBarometer3.WithDefault {
    if(pointer == NULL) {
      return(IBarometer3.ABI.makeIBarometer3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarometer3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarometer3.ABI.makeIBarometer3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Barometer> {
    public override fun getValue() = Barometer(pointer.getPointer(0))

    public fun setValue(value: Barometer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Barometer, MemoryAddress> {
    public val IBarometerStatics_Instance: IBarometerStatics by lazy {
      createIBarometerStatics()
    }


    public val IBarometerStatics2_Instance: IBarometerStatics2 by lazy {
      createIBarometerStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBarometerStatics(): IBarometerStatics {
      val refiid = Guid.REFIID(IBarometerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.Barometer".toHandle(),refiid,interfacePtr)
      val result = IBarometerStatics.ABI.makeIBarometerStatics(interfacePtr.value)
      return result
    }

    public fun createIBarometerStatics2(): IBarometerStatics2 {
      val refiid = Guid.REFIID(IBarometerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.Barometer".toHandle(),refiid,interfacePtr)
      val result = IBarometerStatics2.ABI.makeIBarometerStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Barometer {
      val address = segment.toRawLongValue()
      return Barometer(Pointer(address))
    }

    public override fun toNative(obj: Barometer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IBarometerStatics_Instance.GetDefault()

    public fun FromIdAsync(deviceId: String) = ABI.IBarometerStatics2_Instance.FromIdAsync(deviceId)

    public fun GetDeviceSelector() = ABI.IBarometerStatics2_Instance.GetDeviceSelector()
  }
}
