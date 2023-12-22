package Windows.Devices.Bluetooth.Rfcomm

import Windows.Devices.Bluetooth.BluetoothCacheMode
import Windows.Devices.Bluetooth.BluetoothDevice
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
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(RfcommDeviceService.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.Rfcomm.RfcommDeviceService;{ae81ff1f-c5a1-4c40-8c28-f3efd69062f3})")
@WinRTByReference(brClass = RfcommDeviceService.ByReference::class)
public class RfcommDeviceService(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRfcommDeviceService.WithDefault, IRfcommDeviceService2.WithDefault,
    IClosable.WithDefault, IRfcommDeviceService3.WithDefault, IWinRTObject {
  private val __1202125806_Interface: IRfcommDeviceService.WithDefault by lazy {
    as_1202125806()
  }


  private val __1388805728_Interface: IRfcommDeviceService2.WithDefault by lazy {
    as_1388805728()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __1388805729_Interface: IRfcommDeviceService3.WithDefault by lazy {
    as_1388805729()
  }


  public override val __1202125806_Ptr: JNAPointer? by lazy {
    __1202125806_Interface.__1202125806_Ptr
  }


  public override val __1388805728_Ptr: JNAPointer? by lazy {
    __1388805728_Interface.__1388805728_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __1388805729_Ptr: JNAPointer? by lazy {
    __1388805729_Interface.__1388805729_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1202125806_Interface, __1388805728_Interface, __1260617006_Interface,
        __1388805729_Interface)

  private fun as_1202125806(): IRfcommDeviceService.WithDefault {
    if(pointer == NULL) {
      return(IRfcommDeviceService.ABI.makeIRfcommDeviceService(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRfcommDeviceService>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRfcommDeviceService.ABI.makeIRfcommDeviceService(ref.value))
  }

  private fun as_1388805728(): IRfcommDeviceService2.WithDefault {
    if(pointer == NULL) {
      return(IRfcommDeviceService2.ABI.makeIRfcommDeviceService2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRfcommDeviceService2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRfcommDeviceService2.ABI.makeIRfcommDeviceService2(ref.value))
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

  private fun as_1388805729(): IRfcommDeviceService3.WithDefault {
    if(pointer == NULL) {
      return(IRfcommDeviceService3.ABI.makeIRfcommDeviceService3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRfcommDeviceService3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRfcommDeviceService3.ABI.makeIRfcommDeviceService3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RfcommDeviceService> {
    public override fun getValue() = RfcommDeviceService(pointer.getPointer(0))

    public fun setValue(value: RfcommDeviceService): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RfcommDeviceService, MemoryAddress> {
    public val IRfcommDeviceServiceStatics_Instance: IRfcommDeviceServiceStatics by lazy {
      createIRfcommDeviceServiceStatics()
    }


    public val IRfcommDeviceServiceStatics2_Instance: IRfcommDeviceServiceStatics2 by lazy {
      createIRfcommDeviceServiceStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRfcommDeviceServiceStatics(): IRfcommDeviceServiceStatics {
      val refiid = Guid.REFIID(IRfcommDeviceServiceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.Rfcomm.RfcommDeviceService".toHandle(),refiid,interfacePtr)
      val result =
          IRfcommDeviceServiceStatics.ABI.makeIRfcommDeviceServiceStatics(interfacePtr.value)
      return result
    }

    public fun createIRfcommDeviceServiceStatics2(): IRfcommDeviceServiceStatics2 {
      val refiid = Guid.REFIID(IRfcommDeviceServiceStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.Rfcomm.RfcommDeviceService".toHandle(),refiid,interfacePtr)
      val result =
          IRfcommDeviceServiceStatics2.ABI.makeIRfcommDeviceServiceStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RfcommDeviceService {
      val address = segment.toRawLongValue()
      return RfcommDeviceService(Pointer(address))
    }

    public override fun toNative(obj: RfcommDeviceService): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromIdAsync(deviceId: String) =
        ABI.IRfcommDeviceServiceStatics_Instance.FromIdAsync(deviceId)

    public fun GetDeviceSelector(serviceId: RfcommServiceId) =
        ABI.IRfcommDeviceServiceStatics_Instance.GetDeviceSelector(serviceId)

    public fun GetDeviceSelectorForBluetoothDevice(bluetoothDevice: BluetoothDevice) =
        ABI.IRfcommDeviceServiceStatics2_Instance.GetDeviceSelectorForBluetoothDevice(bluetoothDevice)

    public fun GetDeviceSelectorForBluetoothDevice(bluetoothDevice: BluetoothDevice,
        cacheMode: BluetoothCacheMode) =
        ABI.IRfcommDeviceServiceStatics2_Instance.GetDeviceSelectorForBluetoothDevice(bluetoothDevice,
        cacheMode)

    public fun GetDeviceSelectorForBluetoothDeviceAndServiceId(bluetoothDevice: BluetoothDevice,
        serviceId: RfcommServiceId) =
        ABI.IRfcommDeviceServiceStatics2_Instance.GetDeviceSelectorForBluetoothDeviceAndServiceId(bluetoothDevice,
        serviceId)

    public fun GetDeviceSelectorForBluetoothDeviceAndServiceId(
      bluetoothDevice: BluetoothDevice,
      serviceId: RfcommServiceId,
      cacheMode: BluetoothCacheMode
    ) =
        ABI.IRfcommDeviceServiceStatics2_Instance.GetDeviceSelectorForBluetoothDeviceAndServiceId(bluetoothDevice,
        serviceId, cacheMode)
  }
}
