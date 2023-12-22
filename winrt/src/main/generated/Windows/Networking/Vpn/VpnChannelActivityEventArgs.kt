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

@ABIMarker(VpnChannelActivityEventArgs.ABI::class)
@Signature("rc(Windows.Networking.Vpn.VpnChannelActivityEventArgs;{a36c88f2-afdc-4775-855d-d4ac0a35fc55})")
@WinRTByReference(brClass = VpnChannelActivityEventArgs.ByReference::class)
public class VpnChannelActivityEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVpnChannelActivityEventArgs.WithDefault, IWinRTObject {
  private val __1287517963_Interface: IVpnChannelActivityEventArgs.WithDefault by lazy {
    as_1287517963()
  }


  public override val __1287517963_Ptr: JNAPointer? by lazy {
    __1287517963_Interface.__1287517963_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1287517963_Interface)

  private fun as_1287517963(): IVpnChannelActivityEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IVpnChannelActivityEventArgs.ABI.makeIVpnChannelActivityEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnChannelActivityEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnChannelActivityEventArgs.ABI.makeIVpnChannelActivityEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VpnChannelActivityEventArgs> {
    public override fun getValue() = VpnChannelActivityEventArgs(pointer.getPointer(0))

    public fun setValue(value: VpnChannelActivityEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VpnChannelActivityEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VpnChannelActivityEventArgs {
      val address = segment.toRawLongValue()
      return VpnChannelActivityEventArgs(Pointer(address))
    }

    public override fun toNative(obj: VpnChannelActivityEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
