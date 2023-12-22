package Windows.Devices.Enumeration

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

@ABIMarker(DeviceAccessInformation.ABI::class)
@Signature("rc(Windows.Devices.Enumeration.DeviceAccessInformation;{0baa9a73-6de5-4915-8ddd-9a0554a6f545})")
@WinRTByReference(brClass = DeviceAccessInformation.ByReference::class)
public class DeviceAccessInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDeviceAccessInformation.WithDefault, IWinRTObject {
  private val __944789420_Interface: IDeviceAccessInformation.WithDefault by lazy {
    as_944789420()
  }


  public override val __944789420_Ptr: JNAPointer? by lazy {
    __944789420_Interface.__944789420_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__944789420_Interface)

  private fun as_944789420(): IDeviceAccessInformation.WithDefault {
    if(pointer == NULL) {
      return(IDeviceAccessInformation.ABI.makeIDeviceAccessInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeviceAccessInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeviceAccessInformation.ABI.makeIDeviceAccessInformation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DeviceAccessInformation> {
    public override fun getValue() = DeviceAccessInformation(pointer.getPointer(0))

    public fun setValue(value: DeviceAccessInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DeviceAccessInformation, MemoryAddress> {
    public val IDeviceAccessInformationStatics_Instance: IDeviceAccessInformationStatics by lazy {
      createIDeviceAccessInformationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDeviceAccessInformationStatics(): IDeviceAccessInformationStatics {
      val refiid = Guid.REFIID(IDeviceAccessInformationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Enumeration.DeviceAccessInformation".toHandle(),refiid,interfacePtr)
      val result =
          IDeviceAccessInformationStatics.ABI.makeIDeviceAccessInformationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DeviceAccessInformation {
      val address = segment.toRawLongValue()
      return DeviceAccessInformation(Pointer(address))
    }

    public override fun toNative(obj: DeviceAccessInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateFromId(deviceId: String) =
        ABI.IDeviceAccessInformationStatics_Instance.CreateFromId(deviceId)

    public fun CreateFromDeviceClassId(deviceClassId: Guid.GUID) =
        ABI.IDeviceAccessInformationStatics_Instance.CreateFromDeviceClassId(deviceClassId)

    public fun CreateFromDeviceClass(deviceClass: DeviceClass) =
        ABI.IDeviceAccessInformationStatics_Instance.CreateFromDeviceClass(deviceClass)
  }
}
