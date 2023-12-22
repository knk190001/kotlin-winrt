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

@ABIMarker(BluetoothLEAppearanceCategories.ABI::class)
@WinRTByReference(brClass = BluetoothLEAppearanceCategories.ByReference::class)
public class BluetoothLEAppearanceCategories(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BluetoothLEAppearanceCategories> {
    public override fun getValue() = BluetoothLEAppearanceCategories(pointer.getPointer(0))

    public fun setValue(value: BluetoothLEAppearanceCategories): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BluetoothLEAppearanceCategories, MemoryAddress> {
    public val IBluetoothLEAppearanceCategoriesStatics_Instance:
        IBluetoothLEAppearanceCategoriesStatics by lazy {
      createIBluetoothLEAppearanceCategoriesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBluetoothLEAppearanceCategoriesStatics():
        IBluetoothLEAppearanceCategoriesStatics {
      val refiid = Guid.REFIID(IBluetoothLEAppearanceCategoriesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.BluetoothLEAppearanceCategories".toHandle(),refiid,interfacePtr)
      val result =
          IBluetoothLEAppearanceCategoriesStatics.ABI.makeIBluetoothLEAppearanceCategoriesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): BluetoothLEAppearanceCategories {
      val address = segment.toRawLongValue()
      return BluetoothLEAppearanceCategories(Pointer(address))
    }

    public override fun toNative(obj: BluetoothLEAppearanceCategories): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Uncategorized() =
        ABI.IBluetoothLEAppearanceCategoriesStatics_Instance.get_Uncategorized()

    public fun get_Phone() = ABI.IBluetoothLEAppearanceCategoriesStatics_Instance.get_Phone()

    public fun get_Computer() = ABI.IBluetoothLEAppearanceCategoriesStatics_Instance.get_Computer()

    public fun get_Watch() = ABI.IBluetoothLEAppearanceCategoriesStatics_Instance.get_Watch()

    public fun get_Clock() = ABI.IBluetoothLEAppearanceCategoriesStatics_Instance.get_Clock()

    public fun get_Display() = ABI.IBluetoothLEAppearanceCategoriesStatics_Instance.get_Display()

    public fun get_RemoteControl() =
        ABI.IBluetoothLEAppearanceCategoriesStatics_Instance.get_RemoteControl()

    public fun get_EyeGlasses() =
        ABI.IBluetoothLEAppearanceCategoriesStatics_Instance.get_EyeGlasses()

    public fun get_Tag() = ABI.IBluetoothLEAppearanceCategoriesStatics_Instance.get_Tag()

    public fun get_Keyring() = ABI.IBluetoothLEAppearanceCategoriesStatics_Instance.get_Keyring()

    public fun get_MediaPlayer() =
        ABI.IBluetoothLEAppearanceCategoriesStatics_Instance.get_MediaPlayer()

    public fun get_BarcodeScanner() =
        ABI.IBluetoothLEAppearanceCategoriesStatics_Instance.get_BarcodeScanner()

    public fun get_Thermometer() =
        ABI.IBluetoothLEAppearanceCategoriesStatics_Instance.get_Thermometer()

    public fun get_HeartRate() =
        ABI.IBluetoothLEAppearanceCategoriesStatics_Instance.get_HeartRate()

    public fun get_BloodPressure() =
        ABI.IBluetoothLEAppearanceCategoriesStatics_Instance.get_BloodPressure()

    public fun get_HumanInterfaceDevice() =
        ABI.IBluetoothLEAppearanceCategoriesStatics_Instance.get_HumanInterfaceDevice()

    public fun get_GlucoseMeter() =
        ABI.IBluetoothLEAppearanceCategoriesStatics_Instance.get_GlucoseMeter()

    public fun get_RunningWalking() =
        ABI.IBluetoothLEAppearanceCategoriesStatics_Instance.get_RunningWalking()

    public fun get_Cycling() = ABI.IBluetoothLEAppearanceCategoriesStatics_Instance.get_Cycling()

    public fun get_PulseOximeter() =
        ABI.IBluetoothLEAppearanceCategoriesStatics_Instance.get_PulseOximeter()

    public fun get_WeightScale() =
        ABI.IBluetoothLEAppearanceCategoriesStatics_Instance.get_WeightScale()

    public fun get_OutdoorSportActivity() =
        ABI.IBluetoothLEAppearanceCategoriesStatics_Instance.get_OutdoorSportActivity()
  }
}
