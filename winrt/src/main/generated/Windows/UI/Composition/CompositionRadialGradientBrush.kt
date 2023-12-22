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

@ABIMarker(CompositionRadialGradientBrush.ABI::class)
@Signature("rc(Windows.UI.Composition.CompositionRadialGradientBrush;{3d3b50c5-e3fa-4ce2-b9fc-3ee12561788f})")
@WinRTByReference(brClass = CompositionRadialGradientBrush.ByReference::class)
public class CompositionRadialGradientBrush(
  ptr: JNAPointer? = NULL
) : CompositionGradientBrush(ptr), ICompositionRadialGradientBrush.WithDefault, IWinRTObject {
  private val __185574609_Interface: ICompositionRadialGradientBrush.WithDefault by lazy {
    as_185574609()
  }


  public override val __185574609_Ptr: JNAPointer? by lazy {
    __185574609_Interface.__185574609_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__185574609_Interface)

  private fun as_185574609(): ICompositionRadialGradientBrush.WithDefault {
    if(pointer == NULL) {
      return(ICompositionRadialGradientBrush.ABI.makeICompositionRadialGradientBrush(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionRadialGradientBrush>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionRadialGradientBrush.ABI.makeICompositionRadialGradientBrush(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionRadialGradientBrush> {
    public override fun getValue() = CompositionRadialGradientBrush(pointer.getPointer(0))

    public fun setValue(value: CompositionRadialGradientBrush): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionRadialGradientBrush, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionRadialGradientBrush {
      val address = segment.toRawLongValue()
      return CompositionRadialGradientBrush(Pointer(address))
    }

    public override fun toNative(obj: CompositionRadialGradientBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
