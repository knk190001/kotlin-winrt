package Windows.Devices.Bluetooth.Advertisement

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

@ABIMarker(BluetoothLEAdvertisementDataTypes.ABI::class)
@WinRTByReference(brClass = BluetoothLEAdvertisementDataTypes.ByReference::class)
public class BluetoothLEAdvertisementDataTypes(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BluetoothLEAdvertisementDataTypes> {
    public override fun getValue() = BluetoothLEAdvertisementDataTypes(pointer.getPointer(0))

    public fun setValue(value: BluetoothLEAdvertisementDataTypes): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BluetoothLEAdvertisementDataTypes, MemoryAddress> {
    public val IBluetoothLEAdvertisementDataTypesStatics_Instance:
        IBluetoothLEAdvertisementDataTypesStatics by lazy {
      createIBluetoothLEAdvertisementDataTypesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBluetoothLEAdvertisementDataTypesStatics():
        IBluetoothLEAdvertisementDataTypesStatics {
      val refiid = Guid.REFIID(IBluetoothLEAdvertisementDataTypesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataTypes".toHandle(),refiid,interfacePtr)
      val result =
          IBluetoothLEAdvertisementDataTypesStatics.ABI.makeIBluetoothLEAdvertisementDataTypesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): BluetoothLEAdvertisementDataTypes {
      val address = segment.toRawLongValue()
      return BluetoothLEAdvertisementDataTypes(Pointer(address))
    }

    public override fun toNative(obj: BluetoothLEAdvertisementDataTypes): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Flags() = ABI.IBluetoothLEAdvertisementDataTypesStatics_Instance.get_Flags()

    public fun get_IncompleteService16BitUuids() =
        ABI.IBluetoothLEAdvertisementDataTypesStatics_Instance.get_IncompleteService16BitUuids()

    public fun get_CompleteService16BitUuids() =
        ABI.IBluetoothLEAdvertisementDataTypesStatics_Instance.get_CompleteService16BitUuids()

    public fun get_IncompleteService32BitUuids() =
        ABI.IBluetoothLEAdvertisementDataTypesStatics_Instance.get_IncompleteService32BitUuids()

    public fun get_CompleteService32BitUuids() =
        ABI.IBluetoothLEAdvertisementDataTypesStatics_Instance.get_CompleteService32BitUuids()

    public fun get_IncompleteService128BitUuids() =
        ABI.IBluetoothLEAdvertisementDataTypesStatics_Instance.get_IncompleteService128BitUuids()

    public fun get_CompleteService128BitUuids() =
        ABI.IBluetoothLEAdvertisementDataTypesStatics_Instance.get_CompleteService128BitUuids()

    public fun get_ShortenedLocalName() =
        ABI.IBluetoothLEAdvertisementDataTypesStatics_Instance.get_ShortenedLocalName()

    public fun get_CompleteLocalName() =
        ABI.IBluetoothLEAdvertisementDataTypesStatics_Instance.get_CompleteLocalName()

    public fun get_TxPowerLevel() =
        ABI.IBluetoothLEAdvertisementDataTypesStatics_Instance.get_TxPowerLevel()

    public fun get_SlaveConnectionIntervalRange() =
        ABI.IBluetoothLEAdvertisementDataTypesStatics_Instance.get_SlaveConnectionIntervalRange()

    public fun get_ServiceSolicitation16BitUuids() =
        ABI.IBluetoothLEAdvertisementDataTypesStatics_Instance.get_ServiceSolicitation16BitUuids()

    public fun get_ServiceSolicitation32BitUuids() =
        ABI.IBluetoothLEAdvertisementDataTypesStatics_Instance.get_ServiceSolicitation32BitUuids()

    public fun get_ServiceSolicitation128BitUuids() =
        ABI.IBluetoothLEAdvertisementDataTypesStatics_Instance.get_ServiceSolicitation128BitUuids()

    public fun get_ServiceData16BitUuids() =
        ABI.IBluetoothLEAdvertisementDataTypesStatics_Instance.get_ServiceData16BitUuids()

    public fun get_ServiceData32BitUuids() =
        ABI.IBluetoothLEAdvertisementDataTypesStatics_Instance.get_ServiceData32BitUuids()

    public fun get_ServiceData128BitUuids() =
        ABI.IBluetoothLEAdvertisementDataTypesStatics_Instance.get_ServiceData128BitUuids()

    public fun get_PublicTargetAddress() =
        ABI.IBluetoothLEAdvertisementDataTypesStatics_Instance.get_PublicTargetAddress()

    public fun get_RandomTargetAddress() =
        ABI.IBluetoothLEAdvertisementDataTypesStatics_Instance.get_RandomTargetAddress()

    public fun get_Appearance() =
        ABI.IBluetoothLEAdvertisementDataTypesStatics_Instance.get_Appearance()

    public fun get_AdvertisingInterval() =
        ABI.IBluetoothLEAdvertisementDataTypesStatics_Instance.get_AdvertisingInterval()

    public fun get_ManufacturerSpecificData() =
        ABI.IBluetoothLEAdvertisementDataTypesStatics_Instance.get_ManufacturerSpecificData()
  }
}
