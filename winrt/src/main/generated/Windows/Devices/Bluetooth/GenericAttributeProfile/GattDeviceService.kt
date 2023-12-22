package Windows.Devices.Bluetooth.GenericAttributeProfile

import Windows.Devices.Bluetooth.BluetoothCacheMode
import Windows.Devices.Bluetooth.BluetoothDeviceId
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(GattDeviceService.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.GenericAttributeProfile.GattDeviceService;{ac7b7c05-b33c-47cf-990f-6b8f5577df71})")
@WinRTByReference(brClass = GattDeviceService.ByReference::class)
public class GattDeviceService(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattDeviceService.WithDefault, IClosable.WithDefault,
    IGattDeviceService2.WithDefault, IGattDeviceService3.WithDefault, IWinRTObject {
  private val __247464612_Interface: IGattDeviceService.WithDefault by lazy {
    as_247464612()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __918531570_Interface: IGattDeviceService2.WithDefault by lazy {
    as_918531570()
  }


  private val __918531569_Interface: IGattDeviceService3.WithDefault by lazy {
    as_918531569()
  }


  public override val __247464612_Ptr: JNAPointer? by lazy {
    __247464612_Interface.__247464612_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __918531570_Ptr: JNAPointer? by lazy {
    __918531570_Interface.__918531570_Ptr
  }


  public override val __918531569_Ptr: JNAPointer? by lazy {
    __918531569_Interface.__918531569_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__247464612_Interface, __1260617006_Interface, __918531570_Interface,
        __918531569_Interface)

  private fun as_247464612(): IGattDeviceService.WithDefault {
    if(pointer == NULL) {
      return(IGattDeviceService.ABI.makeIGattDeviceService(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattDeviceService>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattDeviceService.ABI.makeIGattDeviceService(ref.value))
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

  private fun as_918531570(): IGattDeviceService2.WithDefault {
    if(pointer == NULL) {
      return(IGattDeviceService2.ABI.makeIGattDeviceService2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattDeviceService2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattDeviceService2.ABI.makeIGattDeviceService2(ref.value))
  }

  private fun as_918531569(): IGattDeviceService3.WithDefault {
    if(pointer == NULL) {
      return(IGattDeviceService3.ABI.makeIGattDeviceService3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattDeviceService3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattDeviceService3.ABI.makeIGattDeviceService3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattDeviceService> {
    public override fun getValue() = GattDeviceService(pointer.getPointer(0))

    public fun setValue(value: GattDeviceService): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattDeviceService, MemoryAddress> {
    public val IGattDeviceServiceStatics_Instance: IGattDeviceServiceStatics by lazy {
      createIGattDeviceServiceStatics()
    }


    public val IGattDeviceServiceStatics2_Instance: IGattDeviceServiceStatics2 by lazy {
      createIGattDeviceServiceStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGattDeviceServiceStatics(): IGattDeviceServiceStatics {
      val refiid = Guid.REFIID(IGattDeviceServiceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.GenericAttributeProfile.GattDeviceService".toHandle(),refiid,interfacePtr)
      val result = IGattDeviceServiceStatics.ABI.makeIGattDeviceServiceStatics(interfacePtr.value)
      return result
    }

    public fun createIGattDeviceServiceStatics2(): IGattDeviceServiceStatics2 {
      val refiid = Guid.REFIID(IGattDeviceServiceStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.GenericAttributeProfile.GattDeviceService".toHandle(),refiid,interfacePtr)
      val result = IGattDeviceServiceStatics2.ABI.makeIGattDeviceServiceStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GattDeviceService {
      val address = segment.toRawLongValue()
      return GattDeviceService(Pointer(address))
    }

    public override fun toNative(obj: GattDeviceService): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromIdAsync(deviceId: String) =
        ABI.IGattDeviceServiceStatics_Instance.FromIdAsync(deviceId)

    public fun GetDeviceSelectorFromUuid(serviceUuid: Guid.GUID) =
        ABI.IGattDeviceServiceStatics_Instance.GetDeviceSelectorFromUuid(serviceUuid)

    public fun GetDeviceSelectorFromShortId(serviceShortId: WinDef.USHORT) =
        ABI.IGattDeviceServiceStatics_Instance.GetDeviceSelectorFromShortId(serviceShortId)

    public fun ConvertShortIdToUuid(shortId: WinDef.USHORT) =
        ABI.IGattDeviceServiceStatics_Instance.ConvertShortIdToUuid(shortId)

    public fun FromIdAsync(deviceId: String, sharingMode: GattSharingMode) =
        ABI.IGattDeviceServiceStatics2_Instance.FromIdAsync(deviceId, sharingMode)

    public fun GetDeviceSelectorForBluetoothDeviceId(bluetoothDeviceId: BluetoothDeviceId) =
        ABI.IGattDeviceServiceStatics2_Instance.GetDeviceSelectorForBluetoothDeviceId(bluetoothDeviceId)

    public fun GetDeviceSelectorForBluetoothDeviceId(bluetoothDeviceId: BluetoothDeviceId,
        cacheMode: BluetoothCacheMode) =
        ABI.IGattDeviceServiceStatics2_Instance.GetDeviceSelectorForBluetoothDeviceId(bluetoothDeviceId,
        cacheMode)

    public fun GetDeviceSelectorForBluetoothDeviceIdAndUuid(bluetoothDeviceId: BluetoothDeviceId,
        serviceUuid: Guid.GUID) =
        ABI.IGattDeviceServiceStatics2_Instance.GetDeviceSelectorForBluetoothDeviceIdAndUuid(bluetoothDeviceId,
        serviceUuid)

    public fun GetDeviceSelectorForBluetoothDeviceIdAndUuid(
      bluetoothDeviceId: BluetoothDeviceId,
      serviceUuid: Guid.GUID,
      cacheMode: BluetoothCacheMode
    ) =
        ABI.IGattDeviceServiceStatics2_Instance.GetDeviceSelectorForBluetoothDeviceIdAndUuid(bluetoothDeviceId,
        serviceUuid, cacheMode)
  }
}
