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

@ABIMarker(CompositionEffectBrush.ABI::class)
@Signature("rc(Windows.UI.Composition.CompositionEffectBrush;{bf7f795e-83cc-44bf-a447-3e3c071789ec})")
@WinRTByReference(brClass = CompositionEffectBrush.ByReference::class)
public class CompositionEffectBrush(
  ptr: JNAPointer? = NULL
) : CompositionBrush(ptr), ICompositionEffectBrush.WithDefault, IWinRTObject {
  private val __930734413_Interface: ICompositionEffectBrush.WithDefault by lazy {
    as_930734413()
  }


  public override val __930734413_Ptr: JNAPointer? by lazy {
    __930734413_Interface.__930734413_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__930734413_Interface)

  private fun as_930734413(): ICompositionEffectBrush.WithDefault {
    if(pointer == NULL) {
      return(ICompositionEffectBrush.ABI.makeICompositionEffectBrush(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionEffectBrush>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionEffectBrush.ABI.makeICompositionEffectBrush(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionEffectBrush> {
    public override fun getValue() = CompositionEffectBrush(pointer.getPointer(0))

    public fun setValue(value: CompositionEffectBrush): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionEffectBrush, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionEffectBrush {
      val address = segment.toRawLongValue()
      return CompositionEffectBrush(Pointer(address))
    }

    public override fun toNative(obj: CompositionEffectBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
