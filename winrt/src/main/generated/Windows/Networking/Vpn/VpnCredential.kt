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

@ABIMarker(VpnCredential.ABI::class)
@Signature("rc(Windows.Networking.Vpn.VpnCredential;{b7e78af3-a46d-404b-8729-1832522853ac})")
@WinRTByReference(brClass = VpnCredential.ByReference::class)
public class VpnCredential(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVpnCredential.WithDefault, IWinRTObject {
  private val __1054432313_Interface: IVpnCredential.WithDefault by lazy {
    as_1054432313()
  }


  public override val __1054432313_Ptr: JNAPointer? by lazy {
    __1054432313_Interface.__1054432313_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1054432313_Interface)

  private fun as_1054432313(): IVpnCredential.WithDefault {
    if(pointer == NULL) {
      return(IVpnCredential.ABI.makeIVpnCredential(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnCredential>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnCredential.ABI.makeIVpnCredential(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<VpnCredential>
      {
    public override fun getValue() = VpnCredential(pointer.getPointer(0))

    public fun setValue(value: VpnCredential): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VpnCredential, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VpnCredential {
      val address = segment.toRawLongValue()
      return VpnCredential(Pointer(address))
    }

    public override fun toNative(obj: VpnCredential): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
