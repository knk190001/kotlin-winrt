package Windows.UI.Composition

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

@ABIMarker(CompositionContainerShape.ABI::class)
@Signature("rc(Windows.UI.Composition.CompositionContainerShape;{4f5e859b-2e5b-44a8-982c-aa0f69c16059})")
@WinRTByReference(brClass = CompositionContainerShape.ByReference::class)
public class CompositionContainerShape(
  ptr: JNAPointer? = NULL
) : CompositionShape(ptr), ICompositionContainerShape.WithDefault, IWinRTObject {
  private val __1120131068_Interface: ICompositionContainerShape.WithDefault by lazy {
    as_1120131068()
  }


  public override val __1120131068_Ptr: JNAPointer? by lazy {
    __1120131068_Interface.__1120131068_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1120131068_Interface)

  private fun as_1120131068(): ICompositionContainerShape.WithDefault {
    if(pointer == NULL) {
      return(ICompositionContainerShape.ABI.makeICompositionContainerShape(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionContainerShape>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionContainerShape.ABI.makeICompositionContainerShape(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionContainerShape> {
    public override fun getValue() = CompositionContainerShape(pointer.getPointer(0))

    public fun setValue(value: CompositionContainerShape): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionContainerShape, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionContainerShape {
      val address = segment.toRawLongValue()
      return CompositionContainerShape(Pointer(address))
    }

    public override fun toNative(obj: CompositionContainerShape): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
