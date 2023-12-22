package Windows.Devices.Bluetooth

import Windows.Foundation.IClosable
import Windows.Networking.HostName
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

@ABIMarker(BluetoothDevice.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.BluetoothDevice;{2335b156-90d2-4a04-aef5-0e20b9e6b707})")
@WinRTByReference(brClass = BluetoothDevice.ByReference::class)
public class BluetoothDevice(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBluetoothDevice.WithDefault, IBluetoothDevice2.WithDefault,
    IBluetoothDevice3.WithDefault, IBluetoothDevice4.WithDefault, IBluetoothDevice5.WithDefault,
    IClosable.WithDefault, IWinRTObject {
  private val __618248467_Interface: IBluetoothDevice.WithDefault by lazy {
    as_618248467()
  }


  private val __1985833243_Interface: IBluetoothDevice2.WithDefault by lazy {
    as_1985833243()
  }


  private val __1985833242_Interface: IBluetoothDevice3.WithDefault by lazy {
    as_1985833242()
  }


  private val __1985833241_Interface: IBluetoothDevice4.WithDefault by lazy {
    as_1985833241()
  }


  private val __1985833240_Interface: IBluetoothDevice5.WithDefault by lazy {
    as_1985833240()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __618248467_Ptr: JNAPointer? by lazy {
    __618248467_Interface.__618248467_Ptr
  }


  public override val __1985833243_Ptr: JNAPointer? by lazy {
    __1985833243_Interface.__1985833243_Ptr
  }


  public override val __1985833242_Ptr: JNAPointer? by lazy {
    __1985833242_Interface.__1985833242_Ptr
  }


  public override val __1985833241_Ptr: JNAPointer? by lazy {
    __1985833241_Interface.__1985833241_Ptr
  }


  public override val __1985833240_Ptr: JNAPointer? by lazy {
    __1985833240_Interface.__1985833240_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__618248467_Interface, __1985833243_Interface, __1985833242_Interface,
        __1985833241_Interface, __1985833240_Interface, __1260617006_Interface)

  private fun as_618248467(): IBluetoothDevice.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothDevice.ABI.makeIBluetoothDevice(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothDevice>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothDevice.ABI.makeIBluetoothDevice(ref.value))
  }

  private fun as_1985833243(): IBluetoothDevice2.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothDevice2.ABI.makeIBluetoothDevice2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothDevice2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothDevice2.ABI.makeIBluetoothDevice2(ref.value))
  }

  private fun as_1985833242(): IBluetoothDevice3.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothDevice3.ABI.makeIBluetoothDevice3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothDevice3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothDevice3.ABI.makeIBluetoothDevice3(ref.value))
  }

  private fun as_1985833241(): IBluetoothDevice4.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothDevice4.ABI.makeIBluetoothDevice4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothDevice4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothDevice4.ABI.makeIBluetoothDevice4(ref.value))
  }

  private fun as_1985833240(): IBluetoothDevice5.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothDevice5.ABI.makeIBluetoothDevice5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothDevice5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothDevice5.ABI.makeIBluetoothDevice5(ref.value))
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
      IByReference<BluetoothDevice> {
    public override fun getValue() = BluetoothDevice(pointer.getPointer(0))

    public fun setValue(value: BluetoothDevice): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BluetoothDevice, MemoryAddress> {
    public val IBluetoothDeviceStatics2_Instance: IBluetoothDeviceStatics2 by lazy {
      createIBluetoothDeviceStatics2()
    }


    public val IBluetoothDeviceStatics_Instance: IBluetoothDeviceStatics by lazy {
      createIBluetoothDeviceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBluetoothDeviceStatics2(): IBluetoothDeviceStatics2 {
      val refiid = Guid.REFIID(IBluetoothDeviceStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.BluetoothDevice".toHandle(),refiid,interfacePtr)
      val result = IBluetoothDeviceStatics2.ABI.makeIBluetoothDeviceStatics2(interfacePtr.value)
      return result
    }

    public fun createIBluetoothDeviceStatics(): IBluetoothDeviceStatics {
      val refiid = Guid.REFIID(IBluetoothDeviceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.BluetoothDevice".toHandle(),refiid,interfacePtr)
      val result = IBluetoothDeviceStatics.ABI.makeIBluetoothDeviceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): BluetoothDevice {
      val address = segment.toRawLongValue()
      return BluetoothDevice(Pointer(address))
    }

    public override fun toNative(obj: BluetoothDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDeviceSelectorFromPairingState(pairingState: Boolean) =
        ABI.IBluetoothDeviceStatics2_Instance.GetDeviceSelectorFromPairingState(pairingState)

    public fun GetDeviceSelectorFromConnectionStatus(connectionStatus: BluetoothConnectionStatus) =
        ABI.IBluetoothDeviceStatics2_Instance.GetDeviceSelectorFromConnectionStatus(connectionStatus)

    public fun GetDeviceSelectorFromDeviceName(deviceName: String) =
        ABI.IBluetoothDeviceStatics2_Instance.GetDeviceSelectorFromDeviceName(deviceName)

    public fun GetDeviceSelectorFromBluetoothAddress(bluetoothAddress: WinDef.ULONG) =
        ABI.IBluetoothDeviceStatics2_Instance.GetDeviceSelectorFromBluetoothAddress(bluetoothAddress)

    public fun GetDeviceSelectorFromClassOfDevice(classOfDevice: BluetoothClassOfDevice) =
        ABI.IBluetoothDeviceStatics2_Instance.GetDeviceSelectorFromClassOfDevice(classOfDevice)

    public fun FromIdAsync(deviceId: String) =
        ABI.IBluetoothDeviceStatics_Instance.FromIdAsync(deviceId)

    public fun FromHostNameAsync(hostName: HostName) =
        ABI.IBluetoothDeviceStatics_Instance.FromHostNameAsync(hostName)

    public fun FromBluetoothAddressAsync(address: WinDef.ULONG) =
        ABI.IBluetoothDeviceStatics_Instance.FromBluetoothAddressAsync(address)

    public fun GetDeviceSelector() = ABI.IBluetoothDeviceStatics_Instance.GetDeviceSelector()
  }
}
