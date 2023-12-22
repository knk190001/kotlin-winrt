package Windows.Networking.NetworkOperators

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

@ABIMarker(ESimPolicy.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.ESimPolicy;{41e1b99d-cf7e-4315-882b-6f1e74b0d38f})")
@WinRTByReference(brClass = ESimPolicy.ByReference::class)
public class ESimPolicy(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IESimPolicy.WithDefault, IWinRTObject {
  private val __251224253_Interface: IESimPolicy.WithDefault by lazy {
    as_251224253()
  }


  public override val __251224253_Ptr: JNAPointer? by lazy {
    __251224253_Interface.__251224253_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__251224253_Interface)

  private fun as_251224253(): IESimPolicy.WithDefault {
    if(pointer == NULL) {
      return(IESimPolicy.ABI.makeIESimPolicy(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IESimPolicy>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IESimPolicy.ABI.makeIESimPolicy(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ESimPolicy> {
    public override fun getValue() = ESimPolicy(pointer.getPointer(0))

    public fun setValue(value: ESimPolicy): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ESimPolicy, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ESimPolicy {
      val address = segment.toRawLongValue()
      return ESimPolicy(Pointer(address))
    }

    public override fun toNative(obj: ESimPolicy): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
