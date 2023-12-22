package Windows.Devices.WiFiDirect.Services

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

@ABIMarker(WiFiDirectServiceProvisioningInfo.ABI::class)
@Signature("rc(Windows.Devices.WiFiDirect.Services.WiFiDirectServiceProvisioningInfo;{8bdb7cfe-97d9-45a2-8e99-db50910fb6a6})")
@WinRTByReference(brClass = WiFiDirectServiceProvisioningInfo.ByReference::class)
public class WiFiDirectServiceProvisioningInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWiFiDirectServiceProvisioningInfo.WithDefault, IWinRTObject {
  private val __53304837_Interface: IWiFiDirectServiceProvisioningInfo.WithDefault by lazy {
    as_53304837()
  }


  public override val __53304837_Ptr: JNAPointer? by lazy {
    __53304837_Interface.__53304837_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__53304837_Interface)

  private fun as_53304837(): IWiFiDirectServiceProvisioningInfo.WithDefault {
    if(pointer == NULL) {
      return(IWiFiDirectServiceProvisioningInfo.ABI.makeIWiFiDirectServiceProvisioningInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWiFiDirectServiceProvisioningInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWiFiDirectServiceProvisioningInfo.ABI.makeIWiFiDirectServiceProvisioningInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WiFiDirectServiceProvisioningInfo> {
    public override fun getValue() = WiFiDirectServiceProvisioningInfo(pointer.getPointer(0))

    public fun setValue(value: WiFiDirectServiceProvisioningInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WiFiDirectServiceProvisioningInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WiFiDirectServiceProvisioningInfo {
      val address = segment.toRawLongValue()
      return WiFiDirectServiceProvisioningInfo(Pointer(address))
    }

    public override fun toNative(obj: WiFiDirectServiceProvisioningInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
