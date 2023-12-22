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

@ABIMarker(CompositionShape.ABI::class)
@Signature("rc(Windows.UI.Composition.CompositionShape;{b47ce2f7-9a88-42c4-9e87-2e500ca8688c})")
@WinRTByReference(brClass = CompositionShape.ByReference::class)
public open class CompositionShape(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ICompositionShape.WithDefault, IWinRTObject {
  private val __1344496699_Interface: ICompositionShape.WithDefault by lazy {
    as_1344496699()
  }


  public override val __1344496699_Ptr: JNAPointer? by lazy {
    __1344496699_Interface.__1344496699_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1344496699_Interface)

  private fun as_1344496699(): ICompositionShape.WithDefault {
    if(pointer == NULL) {
      return(ICompositionShape.ABI.makeICompositionShape(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionShape>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionShape.ABI.makeICompositionShape(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionShape> {
    public override fun getValue() = CompositionShape(pointer.getPointer(0))

    public fun setValue(value: CompositionShape): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionShape, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionShape {
      val address = segment.toRawLongValue()
      return CompositionShape(Pointer(address))
    }

    public override fun toNative(obj: CompositionShape): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
