package Microsoft.UI.Composition

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

@ABIMarker(CompositionNineGridBrush.ABI::class)
@Signature("rc(Microsoft.UI.Composition.CompositionNineGridBrush;{c77a3d21-c7ee-517a-98f4-ad9a7202bc86})")
@WinRTByReference(brClass = CompositionNineGridBrush.ByReference::class)
public class CompositionNineGridBrush(
  ptr: JNAPointer? = NULL
) : CompositionBrush(ptr), ICompositionNineGridBrush.WithDefault, IWinRTObject {
  private val __78750063_Interface: ICompositionNineGridBrush.WithDefault by lazy {
    as_78750063()
  }


  public override val __78750063_Ptr: JNAPointer? by lazy {
    __78750063_Interface.__78750063_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__78750063_Interface)

  private fun as_78750063(): ICompositionNineGridBrush.WithDefault {
    if(pointer == NULL) {
      return(ICompositionNineGridBrush.ABI.makeICompositionNineGridBrush(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionNineGridBrush>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionNineGridBrush.ABI.makeICompositionNineGridBrush(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionNineGridBrush> {
    public override fun getValue() = CompositionNineGridBrush(pointer.getPointer(0))

    public fun setValue(value: CompositionNineGridBrush): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionNineGridBrush, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionNineGridBrush {
      val address = segment.toRawLongValue()
      return CompositionNineGridBrush(Pointer(address))
    }

    public override fun toNative(obj: CompositionNineGridBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
