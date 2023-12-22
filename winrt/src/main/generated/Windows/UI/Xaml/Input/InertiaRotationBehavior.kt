package Windows.UI.Xaml.Input

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

@ABIMarker(InertiaRotationBehavior.ABI::class)
@Signature("rc(Windows.UI.Xaml.Input.InertiaRotationBehavior;{424cfb2e-bbfd-4625-ae78-20c65bf1efaf})")
@WinRTByReference(brClass = InertiaRotationBehavior.ByReference::class)
public class InertiaRotationBehavior(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInertiaRotationBehavior.WithDefault, IWinRTObject {
  private val __828237004_Interface: IInertiaRotationBehavior.WithDefault by lazy {
    as_828237004()
  }


  public override val __828237004_Ptr: JNAPointer? by lazy {
    __828237004_Interface.__828237004_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__828237004_Interface)

  private fun as_828237004(): IInertiaRotationBehavior.WithDefault {
    if(pointer == NULL) {
      return(IInertiaRotationBehavior.ABI.makeIInertiaRotationBehavior(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInertiaRotationBehavior>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInertiaRotationBehavior.ABI.makeIInertiaRotationBehavior(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InertiaRotationBehavior> {
    public override fun getValue() = InertiaRotationBehavior(pointer.getPointer(0))

    public fun setValue(value: InertiaRotationBehavior): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InertiaRotationBehavior, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InertiaRotationBehavior {
      val address = segment.toRawLongValue()
      return InertiaRotationBehavior(Pointer(address))
    }

    public override fun toNative(obj: InertiaRotationBehavior): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
