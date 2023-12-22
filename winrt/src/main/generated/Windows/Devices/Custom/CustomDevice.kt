package Windows.Devices.Custom

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

@ABIMarker(CustomDevice.ABI::class)
@Signature("rc(Windows.Devices.Custom.CustomDevice;{dd30251f-c48b-43bd-bcb1-dec88f15143e})")
@WinRTByReference(brClass = CustomDevice.ByReference::class)
public class CustomDevice(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICustomDevice.WithDefault, IWinRTObject {
  private val __333626467_Interface: ICustomDevice.WithDefault by lazy {
    as_333626467()
  }


  public override val __333626467_Ptr: JNAPointer? by lazy {
    __333626467_Interface.__333626467_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__333626467_Interface)

  private fun as_333626467(): ICustomDevice.WithDefault {
    if(pointer == NULL) {
      return(ICustomDevice.ABI.makeICustomDevice(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICustomDevice>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICustomDevice.ABI.makeICustomDevice(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<CustomDevice> {
    public override fun getValue() = CustomDevice(pointer.getPointer(0))

    public fun setValue(value: CustomDevice): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CustomDevice, MemoryAddress> {
    public val ICustomDeviceStatics_Instance: ICustomDeviceStatics by lazy {
      createICustomDeviceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICustomDeviceStatics(): ICustomDeviceStatics {
      val refiid = Guid.REFIID(ICustomDeviceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Custom.CustomDevice".toHandle(),refiid,interfacePtr)
      val result = ICustomDeviceStatics.ABI.makeICustomDeviceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CustomDevice {
      val address = segment.toRawLongValue()
      return CustomDevice(Pointer(address))
    }

    public override fun toNative(obj: CustomDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDeviceSelector(classGuid: Guid.GUID) =
        ABI.ICustomDeviceStatics_Instance.GetDeviceSelector(classGuid)

    public fun FromIdAsync(
      deviceId: String,
      desiredAccess: DeviceAccessMode,
      sharingMode: DeviceSharingMode
    ) = ABI.ICustomDeviceStatics_Instance.FromIdAsync(deviceId, desiredAccess, sharingMode)
  }
}
