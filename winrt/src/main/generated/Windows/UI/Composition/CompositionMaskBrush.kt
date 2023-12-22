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

@ABIMarker(CompositionMaskBrush.ABI::class)
@Signature("rc(Windows.UI.Composition.CompositionMaskBrush;{522cf09e-be6b-4f41-be49-f9226d471b4a})")
@WinRTByReference(brClass = CompositionMaskBrush.ByReference::class)
public class CompositionMaskBrush(
  ptr: JNAPointer? = NULL
) : CompositionBrush(ptr), ICompositionMaskBrush.WithDefault, IWinRTObject {
  private val __1377611218_Interface: ICompositionMaskBrush.WithDefault by lazy {
    as_1377611218()
  }


  public override val __1377611218_Ptr: JNAPointer? by lazy {
    __1377611218_Interface.__1377611218_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1377611218_Interface)

  private fun as_1377611218(): ICompositionMaskBrush.WithDefault {
    if(pointer == NULL) {
      return(ICompositionMaskBrush.ABI.makeICompositionMaskBrush(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionMaskBrush>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionMaskBrush.ABI.makeICompositionMaskBrush(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionMaskBrush> {
    public override fun getValue() = CompositionMaskBrush(pointer.getPointer(0))

    public fun setValue(value: CompositionMaskBrush): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionMaskBrush, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionMaskBrush {
      val address = segment.toRawLongValue()
      return CompositionMaskBrush(Pointer(address))
    }

    public override fun toNative(obj: CompositionMaskBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
