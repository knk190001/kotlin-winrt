package Windows.Devices.Bluetooth

import Windows.Foundation.IClosable
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(BluetoothLEDevice.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.BluetoothLEDevice;{b5ee2f7b-4ad8-4642-ac48-80a0b500e887})")
@WinRTByReference(brClass = BluetoothLEDevice.ByReference::class)
public class BluetoothLEDevice(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBluetoothLEDevice.WithDefault, IBluetoothLEDevice2.WithDefault,
    IBluetoothLEDevice3.WithDefault, IBluetoothLEDevice4.WithDefault,
    IBluetoothLEDevice5.WithDefault, IBluetoothLEDevice6.WithDefault, IClosable.WithDefault,
    IWinRTObject {
  private val __143634458_Interface: IBluetoothLEDevice.WithDefault by lazy {
    as_143634458()
  }


  private val __157700852_Interface: IBluetoothLEDevice2.WithDefault by lazy {
    as_157700852()
  }


  private val __157700851_Interface: IBluetoothLEDevice3.WithDefault by lazy {
    as_157700851()
  }


  private val __157700850_Interface: IBluetoothLEDevice4.WithDefault by lazy {
    as_157700850()
  }


  private val __157700849_Interface: IBluetoothLEDevice5.WithDefault by lazy {
    as_157700849()
  }


  private val __157700848_Interface: IBluetoothLEDevice6.WithDefault by lazy {
    as_157700848()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __143634458_Ptr: JNAPointer? by lazy {
    __143634458_Interface.__143634458_Ptr
  }


  public override val __157700852_Ptr: JNAPointer? by lazy {
    __157700852_Interface.__157700852_Ptr
  }


  public override val __157700851_Ptr: JNAPointer? by lazy {
    __157700851_Interface.__157700851_Ptr
  }


  public override val __157700850_Ptr: JNAPointer? by lazy {
    __157700850_Interface.__157700850_Ptr
  }


  public override val __157700849_Ptr: JNAPointer? by lazy {
    __157700849_Interface.__157700849_Ptr
  }


  public override val __157700848_Ptr: JNAPointer? by lazy {
    __157700848_Interface.__157700848_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__143634458_Interface, __157700852_Interface, __157700851_Interface,
        __157700850_Interface, __157700849_Interface, __157700848_Interface, __1260617006_Interface)

  private fun as_143634458(): IBluetoothLEDevice.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothLEDevice.ABI.makeIBluetoothLEDevice(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothLEDevice>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothLEDevice.ABI.makeIBluetoothLEDevice(ref.value))
  }

  private fun as_157700852(): IBluetoothLEDevice2.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothLEDevice2.ABI.makeIBluetoothLEDevice2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothLEDevice2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothLEDevice2.ABI.makeIBluetoothLEDevice2(ref.value))
  }

  private fun as_157700851(): IBluetoothLEDevice3.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothLEDevice3.ABI.makeIBluetoothLEDevice3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothLEDevice3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothLEDevice3.ABI.makeIBluetoothLEDevice3(ref.value))
  }

  private fun as_157700850(): IBluetoothLEDevice4.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothLEDevice4.ABI.makeIBluetoothLEDevice4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothLEDevice4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothLEDevice4.ABI.makeIBluetoothLEDevice4(ref.value))
  }

  private fun as_157700849(): IBluetoothLEDevice5.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothLEDevice5.ABI.makeIBluetoothLEDevice5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothLEDevice5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothLEDevice5.ABI.makeIBluetoothLEDevice5(ref.value))
  }

  private fun as_157700848(): IBluetoothLEDevice6.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothLEDevice6.ABI.makeIBluetoothLEDevice6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothLEDevice6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothLEDevice6.ABI.makeIBluetoothLEDevice6(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BluetoothLEDevice> {
    public override fun getValue() = BluetoothLEDevice(pointer.getPointer(0))

    public fun setValue(value: BluetoothLEDevice): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BluetoothLEDevice, MemoryAddress> {
    public val IBluetoothLEDeviceStatics_Instance: IBluetoothLEDeviceStatics by lazy {
      createIBluetoothLEDeviceStatics()
    }


    public val IBluetoothLEDeviceStatics2_Instance: IBluetoothLEDeviceStatics2 by lazy {
      createIBluetoothLEDeviceStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBluetoothLEDeviceStatics(): IBluetoothLEDeviceStatics {
      val refiid = Guid.REFIID(IBluetoothLEDeviceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.BluetoothLEDevice".toHandle(),refiid,interfacePtr)
      val result = IBluetoothLEDeviceStatics.ABI.makeIBluetoothLEDeviceStatics(interfacePtr.value)
      return result
    }

    public fun createIBluetoothLEDeviceStatics2(): IBluetoothLEDeviceStatics2 {
      val refiid = Guid.REFIID(IBluetoothLEDeviceStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.BluetoothLEDevice".toHandle(),refiid,interfacePtr)
      val result = IBluetoothLEDeviceStatics2.ABI.makeIBluetoothLEDeviceStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): BluetoothLEDevice {
      val address = segment.toRawLongValue()
      return BluetoothLEDevice(Pointer(address))
    }

    public override fun toNative(obj: BluetoothLEDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromIdAsync(deviceId: String) =
        ABI.IBluetoothLEDeviceStatics_Instance.FromIdAsync(deviceId)

    public fun FromBluetoothAddressAsync(bluetoothAddress: WinDef.ULONG) =
        ABI.IBluetoothLEDeviceStatics_Instance.FromBluetoothAddressAsync(bluetoothAddress)

    public fun GetDeviceSelector() = ABI.IBluetoothLEDeviceStatics_Instance.GetDeviceSelector()

    public fun GetDeviceSelectorFromPairingState(pairingState: Boolean) =
        ABI.IBluetoothLEDeviceStatics2_Instance.GetDeviceSelectorFromPairingState(pairingState)

    public fun GetDeviceSelectorFromConnectionStatus(connectionStatus: BluetoothConnectionStatus) =
        ABI.IBluetoothLEDeviceStatics2_Instance.GetDeviceSelectorFromConnectionStatus(connectionStatus)

    public fun GetDeviceSelectorFromDeviceName(deviceName: String) =
        ABI.IBluetoothLEDeviceStatics2_Instance.GetDeviceSelectorFromDeviceName(deviceName)

    public fun GetDeviceSelectorFromBluetoothAddress(bluetoothAddress: WinDef.ULONG) =
        ABI.IBluetoothLEDeviceStatics2_Instance.GetDeviceSelectorFromBluetoothAddress(bluetoothAddress)

    public fun GetDeviceSelectorFromBluetoothAddress(bluetoothAddress: WinDef.ULONG,
        bluetoothAddressType: BluetoothAddressType) =
        ABI.IBluetoothLEDeviceStatics2_Instance.GetDeviceSelectorFromBluetoothAddress(bluetoothAddress,
        bluetoothAddressType)

    public fun GetDeviceSelectorFromAppearance(appearance: BluetoothLEAppearance) =
        ABI.IBluetoothLEDeviceStatics2_Instance.GetDeviceSelectorFromAppearance(appearance)

    public fun FromBluetoothAddressAsync(bluetoothAddress: WinDef.ULONG,
        bluetoothAddressType: BluetoothAddressType) =
        ABI.IBluetoothLEDeviceStatics2_Instance.FromBluetoothAddressAsync(bluetoothAddress,
        bluetoothAddressType)
  }
}
