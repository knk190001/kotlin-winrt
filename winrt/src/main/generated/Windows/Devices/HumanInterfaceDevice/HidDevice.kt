package Windows.Devices.HumanInterfaceDevice

import Windows.Foundation.IClosable
import Windows.Storage.FileAccessMode
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

@ABIMarker(HidDevice.ABI::class)
@Signature("rc(Windows.Devices.HumanInterfaceDevice.HidDevice;{5f8a14e7-2200-432e-95da-d09b87d574a8})")
@WinRTByReference(brClass = HidDevice.ByReference::class)
public class HidDevice(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHidDevice.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __977888178_Interface: IHidDevice.WithDefault by lazy {
    as_977888178()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __977888178_Ptr: JNAPointer? by lazy {
    __977888178_Interface.__977888178_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__977888178_Interface, __1260617006_Interface)

  private fun as_977888178(): IHidDevice.WithDefault {
    if(pointer == NULL) {
      return(IHidDevice.ABI.makeIHidDevice(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHidDevice>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHidDevice.ABI.makeIHidDevice(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<HidDevice> {
    public override fun getValue() = HidDevice(pointer.getPointer(0))

    public fun setValue(value: HidDevice): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HidDevice, MemoryAddress> {
    public val IHidDeviceStatics_Instance: IHidDeviceStatics by lazy {
      createIHidDeviceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHidDeviceStatics(): IHidDeviceStatics {
      val refiid = Guid.REFIID(IHidDeviceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.HumanInterfaceDevice.HidDevice".toHandle(),refiid,interfacePtr)
      val result = IHidDeviceStatics.ABI.makeIHidDeviceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): HidDevice {
      val address = segment.toRawLongValue()
      return HidDevice(Pointer(address))
    }

    public override fun toNative(obj: HidDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDeviceSelector(usagePage: WinDef.USHORT, usageId: WinDef.USHORT) =
        ABI.IHidDeviceStatics_Instance.GetDeviceSelector(usagePage, usageId)

    public fun GetDeviceSelector(
      usagePage: WinDef.USHORT,
      usageId: WinDef.USHORT,
      vendorId: WinDef.USHORT,
      productId: WinDef.USHORT
    ) = ABI.IHidDeviceStatics_Instance.GetDeviceSelector(usagePage, usageId, vendorId, productId)

    public fun FromIdAsync(deviceId: String, accessMode: FileAccessMode) =
        ABI.IHidDeviceStatics_Instance.FromIdAsync(deviceId, accessMode)
  }
}
