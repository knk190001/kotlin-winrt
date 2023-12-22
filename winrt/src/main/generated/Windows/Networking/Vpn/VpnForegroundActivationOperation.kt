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

@ABIMarker(VpnForegroundActivationOperation.ABI::class)
@Signature("rc(Windows.Networking.Vpn.VpnForegroundActivationOperation;{9e010d57-f17a-4bd5-9b6d-f984f1297d3c})")
@WinRTByReference(brClass = VpnForegroundActivationOperation.ByReference::class)
public class VpnForegroundActivationOperation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVpnForegroundActivationOperation.WithDefault, IWinRTObject {
  private val __1164596542_Interface: IVpnForegroundActivationOperation.WithDefault by lazy {
    as_1164596542()
  }


  public override val __1164596542_Ptr: JNAPointer? by lazy {
    __1164596542_Interface.__1164596542_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1164596542_Interface)

  private fun as_1164596542(): IVpnForegroundActivationOperation.WithDefault {
    if(pointer == NULL) {
      return(IVpnForegroundActivationOperation.ABI.makeIVpnForegroundActivationOperation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnForegroundActivationOperation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnForegroundActivationOperation.ABI.makeIVpnForegroundActivationOperation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VpnForegroundActivationOperation> {
    public override fun getValue() = VpnForegroundActivationOperation(pointer.getPointer(0))

    public fun setValue(value: VpnForegroundActivationOperation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VpnForegroundActivationOperation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VpnForegroundActivationOperation {
      val address = segment.toRawLongValue()
      return VpnForegroundActivationOperation(Pointer(address))
    }

    public override fun toNative(obj: VpnForegroundActivationOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
