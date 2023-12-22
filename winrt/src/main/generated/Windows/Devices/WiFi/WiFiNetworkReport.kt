package Windows.Devices.WiFi

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

@ABIMarker(WiFiNetworkReport.ABI::class)
@Signature("rc(Windows.Devices.WiFi.WiFiNetworkReport;{9524ded2-5911-445e-8194-be4f1a704895})")
@WinRTByReference(brClass = WiFiNetworkReport.ByReference::class)
public class WiFiNetworkReport(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWiFiNetworkReport.WithDefault, IWinRTObject {
  private val __1360324565_Interface: IWiFiNetworkReport.WithDefault by lazy {
    as_1360324565()
  }


  public override val __1360324565_Ptr: JNAPointer? by lazy {
    __1360324565_Interface.__1360324565_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1360324565_Interface)

  private fun as_1360324565(): IWiFiNetworkReport.WithDefault {
    if(pointer == NULL) {
      return(IWiFiNetworkReport.ABI.makeIWiFiNetworkReport(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWiFiNetworkReport>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWiFiNetworkReport.ABI.makeIWiFiNetworkReport(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WiFiNetworkReport> {
    public override fun getValue() = WiFiNetworkReport(pointer.getPointer(0))

    public fun setValue(value: WiFiNetworkReport): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WiFiNetworkReport, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WiFiNetworkReport {
      val address = segment.toRawLongValue()
      return WiFiNetworkReport(Pointer(address))
    }

    public override fun toNative(obj: WiFiNetworkReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
