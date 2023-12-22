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

@ABIMarker(WiFiAvailableNetwork.ABI::class)
@Signature("rc(Windows.Devices.WiFi.WiFiAvailableNetwork;{26e96246-183e-4704-9826-71b4a2f0f668})")
@WinRTByReference(brClass = WiFiAvailableNetwork.ByReference::class)
public class WiFiAvailableNetwork(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWiFiAvailableNetwork.WithDefault, IWinRTObject {
  private val __1427347598_Interface: IWiFiAvailableNetwork.WithDefault by lazy {
    as_1427347598()
  }


  public override val __1427347598_Ptr: JNAPointer? by lazy {
    __1427347598_Interface.__1427347598_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1427347598_Interface)

  private fun as_1427347598(): IWiFiAvailableNetwork.WithDefault {
    if(pointer == NULL) {
      return(IWiFiAvailableNetwork.ABI.makeIWiFiAvailableNetwork(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWiFiAvailableNetwork>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWiFiAvailableNetwork.ABI.makeIWiFiAvailableNetwork(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WiFiAvailableNetwork> {
    public override fun getValue() = WiFiAvailableNetwork(pointer.getPointer(0))

    public fun setValue(value: WiFiAvailableNetwork): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WiFiAvailableNetwork, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WiFiAvailableNetwork {
      val address = segment.toRawLongValue()
      return WiFiAvailableNetwork(Pointer(address))
    }

    public override fun toNative(obj: WiFiAvailableNetwork): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
