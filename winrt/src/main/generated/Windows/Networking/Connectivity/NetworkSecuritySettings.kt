package Windows.Networking.Connectivity

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

@ABIMarker(NetworkSecuritySettings.ABI::class)
@Signature("rc(Windows.Networking.Connectivity.NetworkSecuritySettings;{7ca07e8d-917b-4b5f-b84d-28f7a5ac5402})")
@WinRTByReference(brClass = NetworkSecuritySettings.ByReference::class)
public class NetworkSecuritySettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INetworkSecuritySettings.WithDefault, IWinRTObject {
  private val __867701038_Interface: INetworkSecuritySettings.WithDefault by lazy {
    as_867701038()
  }


  public override val __867701038_Ptr: JNAPointer? by lazy {
    __867701038_Interface.__867701038_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__867701038_Interface)

  private fun as_867701038(): INetworkSecuritySettings.WithDefault {
    if(pointer == NULL) {
      return(INetworkSecuritySettings.ABI.makeINetworkSecuritySettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INetworkSecuritySettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INetworkSecuritySettings.ABI.makeINetworkSecuritySettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NetworkSecuritySettings> {
    public override fun getValue() = NetworkSecuritySettings(pointer.getPointer(0))

    public fun setValue(value: NetworkSecuritySettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NetworkSecuritySettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): NetworkSecuritySettings {
      val address = segment.toRawLongValue()
      return NetworkSecuritySettings(Pointer(address))
    }

    public override fun toNative(obj: NetworkSecuritySettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
