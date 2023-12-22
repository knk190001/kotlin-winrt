package Windows.Devices.WiFiDirect.Services

import Windows.Storage.Streams.IBuffer
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

@ABIMarker(WiFiDirectService.ABI::class)
@Signature("rc(Windows.Devices.WiFiDirect.Services.WiFiDirectService;{50aabbb8-5f71-45ec-84f1-a1e4fc7879a3})")
@WinRTByReference(brClass = WiFiDirectService.ByReference::class)
public class WiFiDirectService(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWiFiDirectService.WithDefault, IWinRTObject {
  private val __1491717984_Interface: IWiFiDirectService.WithDefault by lazy {
    as_1491717984()
  }


  public override val __1491717984_Ptr: JNAPointer? by lazy {
    __1491717984_Interface.__1491717984_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1491717984_Interface)

  private fun as_1491717984(): IWiFiDirectService.WithDefault {
    if(pointer == NULL) {
      return(IWiFiDirectService.ABI.makeIWiFiDirectService(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWiFiDirectService>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWiFiDirectService.ABI.makeIWiFiDirectService(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WiFiDirectService> {
    public override fun getValue() = WiFiDirectService(pointer.getPointer(0))

    public fun setValue(value: WiFiDirectService): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WiFiDirectService, MemoryAddress> {
    public val IWiFiDirectServiceStatics_Instance: IWiFiDirectServiceStatics by lazy {
      createIWiFiDirectServiceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWiFiDirectServiceStatics(): IWiFiDirectServiceStatics {
      val refiid = Guid.REFIID(IWiFiDirectServiceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.WiFiDirect.Services.WiFiDirectService".toHandle(),refiid,interfacePtr)
      val result = IWiFiDirectServiceStatics.ABI.makeIWiFiDirectServiceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): WiFiDirectService {
      val address = segment.toRawLongValue()
      return WiFiDirectService(Pointer(address))
    }

    public override fun toNative(obj: WiFiDirectService): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetSelector(serviceName: String) =
        ABI.IWiFiDirectServiceStatics_Instance.GetSelector(serviceName)

    public fun GetSelector(serviceName: String, serviceInfoFilter: IBuffer) =
        ABI.IWiFiDirectServiceStatics_Instance.GetSelector(serviceName, serviceInfoFilter)

    public fun FromIdAsync(deviceId: String) =
        ABI.IWiFiDirectServiceStatics_Instance.FromIdAsync(deviceId)
  }
}
