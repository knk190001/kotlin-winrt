package Windows.Devices.Usb

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(UsbDeviceClasses.ABI::class)
@Signature("rc(Windows.Devices.Usb.UsbDeviceClasses;{686f955d-9b92-4b30-9781-c22c55ac35cb})")
@WinRTByReference(brClass = UsbDeviceClasses.ByReference::class)
public class UsbDeviceClasses(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUsbDeviceClasses.WithDefault, IWinRTObject {
  private val __333337485_Interface: IUsbDeviceClasses.WithDefault by lazy {
    as_333337485()
  }


  public override val __333337485_Ptr: JNAPointer? by lazy {
    __333337485_Interface.__333337485_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__333337485_Interface)

  private fun as_333337485(): IUsbDeviceClasses.WithDefault {
    if(pointer == NULL) {
      return(IUsbDeviceClasses.ABI.makeIUsbDeviceClasses(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUsbDeviceClasses>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUsbDeviceClasses.ABI.makeIUsbDeviceClasses(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UsbDeviceClasses> {
    public override fun getValue() = UsbDeviceClasses(pointer.getPointer(0))

    public fun setValue(value: UsbDeviceClasses): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UsbDeviceClasses, MemoryAddress> {
    public val IUsbDeviceClassesStatics_Instance: IUsbDeviceClassesStatics by lazy {
      createIUsbDeviceClassesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUsbDeviceClassesStatics(): IUsbDeviceClassesStatics {
      val refiid = Guid.REFIID(IUsbDeviceClassesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Usb.UsbDeviceClasses".toHandle(),refiid,interfacePtr)
      val result = IUsbDeviceClassesStatics.ABI.makeIUsbDeviceClassesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): UsbDeviceClasses {
      val address = segment.toRawLongValue()
      return UsbDeviceClasses(Pointer(address))
    }

    public override fun toNative(obj: UsbDeviceClasses): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CdcControl() = ABI.IUsbDeviceClassesStatics_Instance.get_CdcControl()

    public fun get_Physical() = ABI.IUsbDeviceClassesStatics_Instance.get_Physical()

    public fun get_PersonalHealthcare() =
        ABI.IUsbDeviceClassesStatics_Instance.get_PersonalHealthcare()

    public fun get_ActiveSync() = ABI.IUsbDeviceClassesStatics_Instance.get_ActiveSync()

    public fun get_PalmSync() = ABI.IUsbDeviceClassesStatics_Instance.get_PalmSync()

    public fun get_DeviceFirmwareUpdate() =
        ABI.IUsbDeviceClassesStatics_Instance.get_DeviceFirmwareUpdate()

    public fun get_Irda() = ABI.IUsbDeviceClassesStatics_Instance.get_Irda()

    public fun get_Measurement() = ABI.IUsbDeviceClassesStatics_Instance.get_Measurement()

    public fun get_VendorSpecific() = ABI.IUsbDeviceClassesStatics_Instance.get_VendorSpecific()
  }
}
