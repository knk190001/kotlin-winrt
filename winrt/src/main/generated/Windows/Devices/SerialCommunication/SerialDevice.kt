package Windows.Devices.SerialCommunication

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

@ABIMarker(SerialDevice.ABI::class)
@Signature("rc(Windows.Devices.SerialCommunication.SerialDevice;{e187ccc6-2210-414f-b65a-f5553a03372a})")
@WinRTByReference(brClass = SerialDevice.ByReference::class)
public class SerialDevice(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISerialDevice.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1401519021_Interface: ISerialDevice.WithDefault by lazy {
    as_1401519021()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1401519021_Ptr: JNAPointer? by lazy {
    __1401519021_Interface.__1401519021_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1401519021_Interface, __1260617006_Interface)

  private fun as_1401519021(): ISerialDevice.WithDefault {
    if(pointer == NULL) {
      return(ISerialDevice.ABI.makeISerialDevice(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISerialDevice>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISerialDevice.ABI.makeISerialDevice(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SerialDevice> {
    public override fun getValue() = SerialDevice(pointer.getPointer(0))

    public fun setValue(value: SerialDevice): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SerialDevice, MemoryAddress> {
    public val ISerialDeviceStatics_Instance: ISerialDeviceStatics by lazy {
      createISerialDeviceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISerialDeviceStatics(): ISerialDeviceStatics {
      val refiid = Guid.REFIID(ISerialDeviceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.SerialCommunication.SerialDevice".toHandle(),refiid,interfacePtr)
      val result = ISerialDeviceStatics.ABI.makeISerialDeviceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SerialDevice {
      val address = segment.toRawLongValue()
      return SerialDevice(Pointer(address))
    }

    public override fun toNative(obj: SerialDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDeviceSelector() = ABI.ISerialDeviceStatics_Instance.GetDeviceSelector()

    public fun GetDeviceSelector(portName: String) =
        ABI.ISerialDeviceStatics_Instance.GetDeviceSelector(portName)

    public fun GetDeviceSelectorFromUsbVidPid(vendorId: WinDef.USHORT, productId: WinDef.USHORT) =
        ABI.ISerialDeviceStatics_Instance.GetDeviceSelectorFromUsbVidPid(vendorId, productId)

    public fun FromIdAsync(deviceId: String) =
        ABI.ISerialDeviceStatics_Instance.FromIdAsync(deviceId)
  }
}
