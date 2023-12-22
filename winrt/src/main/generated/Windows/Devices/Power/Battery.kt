package Windows.Devices.Power

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

@ABIMarker(Battery.ABI::class)
@Signature("rc(Windows.Devices.Power.Battery;{bc894fc6-0072-47c8-8b5d-614aaa7a437e})")
@WinRTByReference(brClass = Battery.ByReference::class)
public class Battery(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBattery.WithDefault, IWinRTObject {
  private val __696030035_Interface: IBattery.WithDefault by lazy {
    as_696030035()
  }


  public override val __696030035_Ptr: JNAPointer? by lazy {
    __696030035_Interface.__696030035_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__696030035_Interface)

  private fun as_696030035(): IBattery.WithDefault {
    if(pointer == NULL) {
      return(IBattery.ABI.makeIBattery(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBattery>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBattery.ABI.makeIBattery(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Battery> {
    public override fun getValue() = Battery(pointer.getPointer(0))

    public fun setValue(value: Battery): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Battery, MemoryAddress> {
    public val IBatteryStatics_Instance: IBatteryStatics by lazy {
      createIBatteryStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBatteryStatics(): IBatteryStatics {
      val refiid = Guid.REFIID(IBatteryStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Power.Battery".toHandle(),refiid,interfacePtr)
      val result = IBatteryStatics.ABI.makeIBatteryStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Battery {
      val address = segment.toRawLongValue()
      return Battery(Pointer(address))
    }

    public override fun toNative(obj: Battery): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_AggregateBattery() = ABI.IBatteryStatics_Instance.get_AggregateBattery()

    public fun FromIdAsync(deviceId: String) = ABI.IBatteryStatics_Instance.FromIdAsync(deviceId)

    public fun GetDeviceSelector() = ABI.IBatteryStatics_Instance.GetDeviceSelector()
  }
}
