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

@ABIMarker(CompositionSpriteShape.ABI::class)
@Signature("rc(Windows.UI.Composition.CompositionSpriteShape;{401b61bb-0007-4363-b1f3-6bcc003fb83e})")
@WinRTByReference(brClass = CompositionSpriteShape.ByReference::class)
public class CompositionSpriteShape(
  ptr: JNAPointer? = NULL
) : CompositionShape(ptr), ICompositionSpriteShape.WithDefault, IWinRTObject {
  private val __466620160_Interface: ICompositionSpriteShape.WithDefault by lazy {
    as_466620160()
  }


  public override val __466620160_Ptr: JNAPointer? by lazy {
    __466620160_Interface.__466620160_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__466620160_Interface)

  private fun as_466620160(): ICompositionSpriteShape.WithDefault {
    if(pointer == NULL) {
      return(ICompositionSpriteShape.ABI.makeICompositionSpriteShape(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionSpriteShape>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionSpriteShape.ABI.makeICompositionSpriteShape(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionSpriteShape> {
    public override fun getValue() = CompositionSpriteShape(pointer.getPointer(0))

    public fun setValue(value: CompositionSpriteShape): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionSpriteShape, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionSpriteShape {
      val address = segment.toRawLongValue()
      return CompositionSpriteShape(Pointer(address))
    }

    public override fun toNative(obj: CompositionSpriteShape): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
