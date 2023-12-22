package Windows.Devices.Bluetooth

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(BluetoothLEAppearanceSubcategories.ABI::class)
@WinRTByReference(brClass = BluetoothLEAppearanceSubcategories.ByReference::class)
public class BluetoothLEAppearanceSubcategories(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BluetoothLEAppearanceSubcategories> {
    public override fun getValue() = BluetoothLEAppearanceSubcategories(pointer.getPointer(0))

    public fun setValue(value: BluetoothLEAppearanceSubcategories): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BluetoothLEAppearanceSubcategories, MemoryAddress> {
    public val IBluetoothLEAppearanceSubcategoriesStatics_Instance:
        IBluetoothLEAppearanceSubcategoriesStatics by lazy {
      createIBluetoothLEAppearanceSubcategoriesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBluetoothLEAppearanceSubcategoriesStatics():
        IBluetoothLEAppearanceSubcategoriesStatics {
      val refiid = Guid.REFIID(IBluetoothLEAppearanceSubcategoriesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.BluetoothLEAppearanceSubcategories".toHandle(),refiid,interfacePtr)
      val result =
          IBluetoothLEAppearanceSubcategoriesStatics.ABI.makeIBluetoothLEAppearanceSubcategoriesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): BluetoothLEAppearanceSubcategories {
      val address = segment.toRawLongValue()
      return BluetoothLEAppearanceSubcategories(Pointer(address))
    }

    public override fun toNative(obj: BluetoothLEAppearanceSubcategories): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Generic() = ABI.IBluetoothLEAppearanceSubcategoriesStatics_Instance.get_Generic()

    public fun get_SportsWatch() =
        ABI.IBluetoothLEAppearanceSubcategoriesStatics_Instance.get_SportsWatch()

    public fun get_ThermometerEar() =
        ABI.IBluetoothLEAppearanceSubcategoriesStatics_Instance.get_ThermometerEar()

    public fun get_HeartRateBelt() =
        ABI.IBluetoothLEAppearanceSubcategoriesStatics_Instance.get_HeartRateBelt()

    public fun get_BloodPressureArm() =
        ABI.IBluetoothLEAppearanceSubcategoriesStatics_Instance.get_BloodPressureArm()

    public fun get_BloodPressureWrist() =
        ABI.IBluetoothLEAppearanceSubcategoriesStatics_Instance.get_BloodPressureWrist()

    public fun get_Keyboard() =
        ABI.IBluetoothLEAppearanceSubcategoriesStatics_Instance.get_Keyboard()

    public fun get_Mouse() = ABI.IBluetoothLEAppearanceSubcategoriesStatics_Instance.get_Mouse()

    public fun get_Joystick() =
        ABI.IBluetoothLEAppearanceSubcategoriesStatics_Instance.get_Joystick()

    public fun get_Gamepad() = ABI.IBluetoothLEAppearanceSubcategoriesStatics_Instance.get_Gamepad()

    public fun get_DigitizerTablet() =
        ABI.IBluetoothLEAppearanceSubcategoriesStatics_Instance.get_DigitizerTablet()

    public fun get_CardReader() =
        ABI.IBluetoothLEAppearanceSubcategoriesStatics_Instance.get_CardReader()

    public fun get_DigitalPen() =
        ABI.IBluetoothLEAppearanceSubcategoriesStatics_Instance.get_DigitalPen()

    public fun get_BarcodeScanner() =
        ABI.IBluetoothLEAppearanceSubcategoriesStatics_Instance.get_BarcodeScanner()

    public fun get_RunningWalkingInShoe() =
        ABI.IBluetoothLEAppearanceSubcategoriesStatics_Instance.get_RunningWalkingInShoe()

    public fun get_RunningWalkingOnShoe() =
        ABI.IBluetoothLEAppearanceSubcategoriesStatics_Instance.get_RunningWalkingOnShoe()

    public fun get_RunningWalkingOnHip() =
        ABI.IBluetoothLEAppearanceSubcategoriesStatics_Instance.get_RunningWalkingOnHip()

    public fun get_CyclingComputer() =
        ABI.IBluetoothLEAppearanceSubcategoriesStatics_Instance.get_CyclingComputer()

    public fun get_CyclingSpeedSensor() =
        ABI.IBluetoothLEAppearanceSubcategoriesStatics_Instance.get_CyclingSpeedSensor()

    public fun get_CyclingCadenceSensor() =
        ABI.IBluetoothLEAppearanceSubcategoriesStatics_Instance.get_CyclingCadenceSensor()

    public fun get_CyclingPowerSensor() =
        ABI.IBluetoothLEAppearanceSubcategoriesStatics_Instance.get_CyclingPowerSensor()

    public fun get_CyclingSpeedCadenceSensor() =
        ABI.IBluetoothLEAppearanceSubcategoriesStatics_Instance.get_CyclingSpeedCadenceSensor()

    public fun get_OximeterFingertip() =
        ABI.IBluetoothLEAppearanceSubcategoriesStatics_Instance.get_OximeterFingertip()

    public fun get_OximeterWristWorn() =
        ABI.IBluetoothLEAppearanceSubcategoriesStatics_Instance.get_OximeterWristWorn()

    public fun get_LocationDisplay() =
        ABI.IBluetoothLEAppearanceSubcategoriesStatics_Instance.get_LocationDisplay()

    public fun get_LocationNavigationDisplay() =
        ABI.IBluetoothLEAppearanceSubcategoriesStatics_Instance.get_LocationNavigationDisplay()

    public fun get_LocationPod() =
        ABI.IBluetoothLEAppearanceSubcategoriesStatics_Instance.get_LocationPod()

    public fun get_LocationNavigationPod() =
        ABI.IBluetoothLEAppearanceSubcategoriesStatics_Instance.get_LocationNavigationPod()
  }
}
