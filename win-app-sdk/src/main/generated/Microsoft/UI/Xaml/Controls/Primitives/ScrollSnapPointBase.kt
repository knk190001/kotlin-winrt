package Microsoft.UI.Xaml.Controls.Primitives

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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ScrollSnapPointBase.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.ScrollSnapPointBase;{45d7319d-c9eb-5109-9668-ff3fc6ccdf11})")
@WinRTByReference(brClass = ScrollSnapPointBase.ByReference::class)
public open class ScrollSnapPointBase(
  ptr: JNAPointer? = NULL
) : SnapPointBase(ptr), IScrollSnapPointBase.WithDefault, IWinRTObject {
  private val __356515353_Interface: IScrollSnapPointBase.WithDefault by lazy {
    as_356515353()
  }


  public override val __356515353_Ptr: JNAPointer? by lazy {
    __356515353_Interface.__356515353_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__356515353_Interface)

  private fun as_356515353(): IScrollSnapPointBase.WithDefault {
    if(pointer == NULL) {
      return(IScrollSnapPointBase.ABI.makeIScrollSnapPointBase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollSnapPointBase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollSnapPointBase.ABI.makeIScrollSnapPointBase(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScrollSnapPointBase> {
    public override fun getValue() = ScrollSnapPointBase(pointer.getPointer(0))

    public fun setValue(value: ScrollSnapPointBase): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScrollSnapPointBase, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ScrollSnapPointBase {
      val address = segment.toRawLongValue()
      return ScrollSnapPointBase(Pointer(address))
    }

    public override fun toNative(obj: ScrollSnapPointBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
