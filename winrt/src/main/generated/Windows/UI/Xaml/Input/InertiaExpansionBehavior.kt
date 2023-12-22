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

@ABIMarker(InertiaExpansionBehavior.ABI::class)
@Signature("rc(Windows.UI.Xaml.Input.InertiaExpansionBehavior;{751d87e5-8d42-44c5-965e-3cd30cc9d6f7})")
@WinRTByReference(brClass = InertiaExpansionBehavior.ByReference::class)
public class InertiaExpansionBehavior(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInertiaExpansionBehavior.WithDefault, IWinRTObject {
  private val __1419168109_Interface: IInertiaExpansionBehavior.WithDefault by lazy {
    as_1419168109()
  }


  public override val __1419168109_Ptr: JNAPointer? by lazy {
    __1419168109_Interface.__1419168109_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1419168109_Interface)

  private fun as_1419168109(): IInertiaExpansionBehavior.WithDefault {
    if(pointer == NULL) {
      return(IInertiaExpansionBehavior.ABI.makeIInertiaExpansionBehavior(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInertiaExpansionBehavior>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInertiaExpansionBehavior.ABI.makeIInertiaExpansionBehavior(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InertiaExpansionBehavior> {
    public override fun getValue() = InertiaExpansionBehavior(pointer.getPointer(0))

    public fun setValue(value: InertiaExpansionBehavior): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InertiaExpansionBehavior, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InertiaExpansionBehavior {
      val address = segment.toRawLongValue()
      return InertiaExpansionBehavior(Pointer(address))
    }

    public override fun toNative(obj: InertiaExpansionBehavior): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
