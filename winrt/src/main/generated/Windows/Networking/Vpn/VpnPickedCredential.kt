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

@ABIMarker(VpnPickedCredential.ABI::class)
@Signature("rc(Windows.Networking.Vpn.VpnPickedCredential;{9a793ac7-8854-4e52-ad97-24dd9a842bce})")
@WinRTByReference(brClass = VpnPickedCredential.ByReference::class)
public class VpnPickedCredential(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVpnPickedCredential.WithDefault, IWinRTObject {
  private val __549546905_Interface: IVpnPickedCredential.WithDefault by lazy {
    as_549546905()
  }


  public override val __549546905_Ptr: JNAPointer? by lazy {
    __549546905_Interface.__549546905_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__549546905_Interface)

  private fun as_549546905(): IVpnPickedCredential.WithDefault {
    if(pointer == NULL) {
      return(IVpnPickedCredential.ABI.makeIVpnPickedCredential(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnPickedCredential>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnPickedCredential.ABI.makeIVpnPickedCredential(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VpnPickedCredential> {
    public override fun getValue() = VpnPickedCredential(pointer.getPointer(0))

    public fun setValue(value: VpnPickedCredential): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VpnPickedCredential, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VpnPickedCredential {
      val address = segment.toRawLongValue()
      return VpnPickedCredential(Pointer(address))
    }

    public override fun toNative(obj: VpnPickedCredential): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
