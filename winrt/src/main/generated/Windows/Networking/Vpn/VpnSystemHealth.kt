package Windows.Networking.Vpn

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

@ABIMarker(VpnSystemHealth.ABI::class)
@Signature("rc(Windows.Networking.Vpn.VpnSystemHealth;{99a8f8af-c0ee-4e75-817a-f231aee5123d})")
@WinRTByReference(brClass = VpnSystemHealth.ByReference::class)
public class VpnSystemHealth(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVpnSystemHealth.WithDefault, IWinRTObject {
  private val __1082171173_Interface: IVpnSystemHealth.WithDefault by lazy {
    as_1082171173()
  }


  public override val __1082171173_Ptr: JNAPointer? by lazy {
    __1082171173_Interface.__1082171173_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1082171173_Interface)

  private fun as_1082171173(): IVpnSystemHealth.WithDefault {
    if(pointer == NULL) {
      return(IVpnSystemHealth.ABI.makeIVpnSystemHealth(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnSystemHealth>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnSystemHealth.ABI.makeIVpnSystemHealth(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VpnSystemHealth> {
    public override fun getValue() = VpnSystemHealth(pointer.getPointer(0))

    public fun setValue(value: VpnSystemHealth): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VpnSystemHealth, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VpnSystemHealth {
      val address = segment.toRawLongValue()
      return VpnSystemHealth(Pointer(address))
    }

    public override fun toNative(obj: VpnSystemHealth): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
