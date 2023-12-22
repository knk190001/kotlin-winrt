package Windows.Devices.Bluetooth

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(BluetoothClassOfDevice.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.BluetoothClassOfDevice;{d640227e-d7d7-4661-9454-65039ca17a2b})")
@WinRTByReference(brClass = BluetoothClassOfDevice.ByReference::class)
public class BluetoothClassOfDevice(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBluetoothClassOfDevice.WithDefault, IWinRTObject {
  private val __1413316562_Interface: IBluetoothClassOfDevice.WithDefault by lazy {
    as_1413316562()
  }


  public override val __1413316562_Ptr: JNAPointer? by lazy {
    __1413316562_Interface.__1413316562_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1413316562_Interface)

  private fun as_1413316562(): IBluetoothClassOfDevice.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothClassOfDevice.ABI.makeIBluetoothClassOfDevice(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothClassOfDevice>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothClassOfDevice.ABI.makeIBluetoothClassOfDevice(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BluetoothClassOfDevice> {
    public override fun getValue() = BluetoothClassOfDevice(pointer.getPointer(0))

    public fun setValue(value: BluetoothClassOfDevice): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BluetoothClassOfDevice, MemoryAddress> {
    public val IBluetoothClassOfDeviceStatics_Instance: IBluetoothClassOfDeviceStatics by lazy {
      createIBluetoothClassOfDeviceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBluetoothClassOfDeviceStatics(): IBluetoothClassOfDeviceStatics {
      val refiid = Guid.REFIID(IBluetoothClassOfDeviceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.BluetoothClassOfDevice".toHandle(),refiid,interfacePtr)
      val result =
          IBluetoothClassOfDeviceStatics.ABI.makeIBluetoothClassOfDeviceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): BluetoothClassOfDevice {
      val address = segment.toRawLongValue()
      return BluetoothClassOfDevice(Pointer(address))
    }

    public override fun toNative(obj: BluetoothClassOfDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromRawValue(rawValue: WinDef.UINT) =
        ABI.IBluetoothClassOfDeviceStatics_Instance.FromRawValue(rawValue)

    public fun FromParts(
      majorClass: BluetoothMajorClass,
      minorClass: BluetoothMinorClass,
      serviceCapabilities: BluetoothServiceCapabilities
    ) = ABI.IBluetoothClassOfDeviceStatics_Instance.FromParts(majorClass, minorClass,
        serviceCapabilities)
  }
}
