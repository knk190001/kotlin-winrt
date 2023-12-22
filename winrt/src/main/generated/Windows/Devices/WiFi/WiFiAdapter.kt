package Windows.Devices.WiFi

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

@ABIMarker(WiFiAdapter.ABI::class)
@Signature("rc(Windows.Devices.WiFi.WiFiAdapter;{a6c4e423-3d75-43a4-b9de-11e26b72d9b0})")
@WinRTByReference(brClass = WiFiAdapter.ByReference::class)
public class WiFiAdapter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWiFiAdapter.WithDefault, IWiFiAdapter2.WithDefault, IWinRTObject {
  private val __810165346_Interface: IWiFiAdapter.WithDefault by lazy {
    as_810165346()
  }


  private val __654678000_Interface: IWiFiAdapter2.WithDefault by lazy {
    as_654678000()
  }


  public override val __810165346_Ptr: JNAPointer? by lazy {
    __810165346_Interface.__810165346_Ptr
  }


  public override val __654678000_Ptr: JNAPointer? by lazy {
    __654678000_Interface.__654678000_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__810165346_Interface, __654678000_Interface)

  private fun as_810165346(): IWiFiAdapter.WithDefault {
    if(pointer == NULL) {
      return(IWiFiAdapter.ABI.makeIWiFiAdapter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWiFiAdapter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWiFiAdapter.ABI.makeIWiFiAdapter(ref.value))
  }

  private fun as_654678000(): IWiFiAdapter2.WithDefault {
    if(pointer == NULL) {
      return(IWiFiAdapter2.ABI.makeIWiFiAdapter2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWiFiAdapter2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWiFiAdapter2.ABI.makeIWiFiAdapter2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<WiFiAdapter> {
    public override fun getValue() = WiFiAdapter(pointer.getPointer(0))

    public fun setValue(value: WiFiAdapter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WiFiAdapter, MemoryAddress> {
    public val IWiFiAdapterStatics_Instance: IWiFiAdapterStatics by lazy {
      createIWiFiAdapterStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWiFiAdapterStatics(): IWiFiAdapterStatics {
      val refiid = Guid.REFIID(IWiFiAdapterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.WiFi.WiFiAdapter".toHandle(),refiid,interfacePtr)
      val result = IWiFiAdapterStatics.ABI.makeIWiFiAdapterStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): WiFiAdapter {
      val address = segment.toRawLongValue()
      return WiFiAdapter(Pointer(address))
    }

    public override fun toNative(obj: WiFiAdapter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FindAllAdaptersAsync() = ABI.IWiFiAdapterStatics_Instance.FindAllAdaptersAsync()

    public fun GetDeviceSelector() = ABI.IWiFiAdapterStatics_Instance.GetDeviceSelector()

    public fun FromIdAsync(deviceId: String) =
        ABI.IWiFiAdapterStatics_Instance.FromIdAsync(deviceId)

    public fun RequestAccessAsync() = ABI.IWiFiAdapterStatics_Instance.RequestAccessAsync()
  }
}
