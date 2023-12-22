package Windows.Devices.WiFiDirect

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

@ABIMarker(WiFiDirectLegacySettings.ABI::class)
@Signature("rc(Windows.Devices.WiFiDirect.WiFiDirectLegacySettings;{a64fdbba-f2fd-4567-a91b-f5c2f5321057})")
@WinRTByReference(brClass = WiFiDirectLegacySettings.ByReference::class)
public class WiFiDirectLegacySettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWiFiDirectLegacySettings.WithDefault, IWinRTObject {
  private val __1307175417_Interface: IWiFiDirectLegacySettings.WithDefault by lazy {
    as_1307175417()
  }


  public override val __1307175417_Ptr: JNAPointer? by lazy {
    __1307175417_Interface.__1307175417_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1307175417_Interface)

  private fun as_1307175417(): IWiFiDirectLegacySettings.WithDefault {
    if(pointer == NULL) {
      return(IWiFiDirectLegacySettings.ABI.makeIWiFiDirectLegacySettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWiFiDirectLegacySettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWiFiDirectLegacySettings.ABI.makeIWiFiDirectLegacySettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WiFiDirectLegacySettings> {
    public override fun getValue() = WiFiDirectLegacySettings(pointer.getPointer(0))

    public fun setValue(value: WiFiDirectLegacySettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WiFiDirectLegacySettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WiFiDirectLegacySettings {
      val address = segment.toRawLongValue()
      return WiFiDirectLegacySettings(Pointer(address))
    }

    public override fun toNative(obj: WiFiDirectLegacySettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
