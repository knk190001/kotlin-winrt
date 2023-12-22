package Windows.Devices.Usb

import Windows.Foundation.IClosable
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

@ABIMarker(UsbDevice.ABI::class)
@Signature("rc(Windows.Devices.Usb.UsbDevice;{5249b992-c456-44d5-ad5e-24f5a089f63b})")
@WinRTByReference(brClass = UsbDevice.ByReference::class)
public class UsbDevice(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUsbDevice.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1488410201_Interface: IUsbDevice.WithDefault by lazy {
    as_1488410201()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1488410201_Ptr: JNAPointer? by lazy {
    __1488410201_Interface.__1488410201_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1488410201_Interface, __1260617006_Interface)

  private fun as_1488410201(): IUsbDevice.WithDefault {
    if(pointer == NULL) {
      return(IUsbDevice.ABI.makeIUsbDevice(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUsbDevice>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUsbDevice.ABI.makeIUsbDevice(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<UsbDevice> {
    public override fun getValue() = UsbDevice(pointer.getPointer(0))

    public fun setValue(value: UsbDevice): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UsbDevice, MemoryAddress> {
    public val IUsbDeviceStatics_Instance: IUsbDeviceStatics by lazy {
      createIUsbDeviceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUsbDeviceStatics(): IUsbDeviceStatics {
      val refiid = Guid.REFIID(IUsbDeviceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Usb.UsbDevice".toHandle(),refiid,interfacePtr)
      val result = IUsbDeviceStatics.ABI.makeIUsbDeviceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): UsbDevice {
      val address = segment.toRawLongValue()
      return UsbDevice(Pointer(address))
    }

    public override fun toNative(obj: UsbDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDeviceSelector(
      vendorId: WinDef.UINT,
      productId: WinDef.UINT,
      winUsbInterfaceClass: Guid.GUID
    ) = ABI.IUsbDeviceStatics_Instance.GetDeviceSelector(vendorId, productId, winUsbInterfaceClass)

    public fun GetDeviceSelector(winUsbInterfaceClass: Guid.GUID) =
        ABI.IUsbDeviceStatics_Instance.GetDeviceSelector(winUsbInterfaceClass)

    public fun GetDeviceSelector(vendorId: WinDef.UINT, productId: WinDef.UINT) =
        ABI.IUsbDeviceStatics_Instance.GetDeviceSelector(vendorId, productId)

    public fun GetDeviceClassSelector(usbClass: UsbDeviceClass) =
        ABI.IUsbDeviceStatics_Instance.GetDeviceClassSelector(usbClass)

    public fun FromIdAsync(deviceId: String) = ABI.IUsbDeviceStatics_Instance.FromIdAsync(deviceId)
  }
}
