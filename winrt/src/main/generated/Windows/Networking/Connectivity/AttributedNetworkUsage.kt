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

@ABIMarker(AttributedNetworkUsage.ABI::class)
@Signature("rc(Windows.Networking.Connectivity.AttributedNetworkUsage;{f769b039-eca2-45eb-ade1-b0368b756c49})")
@WinRTByReference(brClass = AttributedNetworkUsage.ByReference::class)
public class AttributedNetworkUsage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAttributedNetworkUsage.WithDefault, IWinRTObject {
  private val __1641571714_Interface: IAttributedNetworkUsage.WithDefault by lazy {
    as_1641571714()
  }


  public override val __1641571714_Ptr: JNAPointer? by lazy {
    __1641571714_Interface.__1641571714_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1641571714_Interface)

  private fun as_1641571714(): IAttributedNetworkUsage.WithDefault {
    if(pointer == NULL) {
      return(IAttributedNetworkUsage.ABI.makeIAttributedNetworkUsage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAttributedNetworkUsage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAttributedNetworkUsage.ABI.makeIAttributedNetworkUsage(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AttributedNetworkUsage> {
    public override fun getValue() = AttributedNetworkUsage(pointer.getPointer(0))

    public fun setValue(value: AttributedNetworkUsage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AttributedNetworkUsage, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AttributedNetworkUsage {
      val address = segment.toRawLongValue()
      return AttributedNetworkUsage(Pointer(address))
    }

    public override fun toNative(obj: AttributedNetworkUsage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
