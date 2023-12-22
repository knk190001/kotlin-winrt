package Windows.Devices.WiFiDirect

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

@ABIMarker(WiFiDirectDevice.ABI::class)
@Signature("rc(Windows.Devices.WiFiDirect.WiFiDirectDevice;{72deaaa8-72eb-4dae-8a28-8513355d2777})")
@WinRTByReference(brClass = WiFiDirectDevice.ByReference::class)
public class WiFiDirectDevice(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWiFiDirectDevice.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1435830851_Interface: IWiFiDirectDevice.WithDefault by lazy {
    as_1435830851()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1435830851_Ptr: JNAPointer? by lazy {
    __1435830851_Interface.__1435830851_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1435830851_Interface, __1260617006_Interface)

  private fun as_1435830851(): IWiFiDirectDevice.WithDefault {
    if(pointer == NULL) {
      return(IWiFiDirectDevice.ABI.makeIWiFiDirectDevice(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWiFiDirectDevice>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWiFiDirectDevice.ABI.makeIWiFiDirectDevice(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WiFiDirectDevice> {
    public override fun getValue() = WiFiDirectDevice(pointer.getPointer(0))

    public fun setValue(value: WiFiDirectDevice): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WiFiDirectDevice, MemoryAddress> {
    public val IWiFiDirectDeviceStatics2_Instance: IWiFiDirectDeviceStatics2 by lazy {
      createIWiFiDirectDeviceStatics2()
    }


    public val IWiFiDirectDeviceStatics_Instance: IWiFiDirectDeviceStatics by lazy {
      createIWiFiDirectDeviceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWiFiDirectDeviceStatics2(): IWiFiDirectDeviceStatics2 {
      val refiid = Guid.REFIID(IWiFiDirectDeviceStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.WiFiDirect.WiFiDirectDevice".toHandle(),refiid,interfacePtr)
      val result = IWiFiDirectDeviceStatics2.ABI.makeIWiFiDirectDeviceStatics2(interfacePtr.value)
      return result
    }

    public fun createIWiFiDirectDeviceStatics(): IWiFiDirectDeviceStatics {
      val refiid = Guid.REFIID(IWiFiDirectDeviceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.WiFiDirect.WiFiDirectDevice".toHandle(),refiid,interfacePtr)
      val result = IWiFiDirectDeviceStatics.ABI.makeIWiFiDirectDeviceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): WiFiDirectDevice {
      val address = segment.toRawLongValue()
      return WiFiDirectDevice(Pointer(address))
    }

    public override fun toNative(obj: WiFiDirectDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDeviceSelector(type: WiFiDirectDeviceSelectorType) =
        ABI.IWiFiDirectDeviceStatics2_Instance.GetDeviceSelector(type)

    public fun FromIdAsync(deviceId: String, connectionParameters: WiFiDirectConnectionParameters) =
        ABI.IWiFiDirectDeviceStatics2_Instance.FromIdAsync(deviceId, connectionParameters)

    public fun GetDeviceSelector() = ABI.IWiFiDirectDeviceStatics_Instance.GetDeviceSelector()

    public fun FromIdAsync(deviceId: String) =
        ABI.IWiFiDirectDeviceStatics_Instance.FromIdAsync(deviceId)
  }
}
