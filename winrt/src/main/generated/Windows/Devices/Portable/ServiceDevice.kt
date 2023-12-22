package Windows.Devices.Portable

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(ServiceDevice.ABI::class)
@WinRTByReference(brClass = ServiceDevice.ByReference::class)
public class ServiceDevice(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ServiceDevice>
      {
    public override fun getValue() = ServiceDevice(pointer.getPointer(0))

    public fun setValue(value: ServiceDevice): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ServiceDevice, MemoryAddress> {
    public val IServiceDeviceStatics_Instance: IServiceDeviceStatics by lazy {
      createIServiceDeviceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIServiceDeviceStatics(): IServiceDeviceStatics {
      val refiid = Guid.REFIID(IServiceDeviceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Portable.ServiceDevice".toHandle(),refiid,interfacePtr)
      val result = IServiceDeviceStatics.ABI.makeIServiceDeviceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ServiceDevice {
      val address = segment.toRawLongValue()
      return ServiceDevice(Pointer(address))
    }

    public override fun toNative(obj: ServiceDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDeviceSelector(serviceType: ServiceDeviceType) =
        ABI.IServiceDeviceStatics_Instance.GetDeviceSelector(serviceType)

    public fun GetDeviceSelectorFromServiceId(serviceId: Guid.GUID) =
        ABI.IServiceDeviceStatics_Instance.GetDeviceSelectorFromServiceId(serviceId)
  }
}
