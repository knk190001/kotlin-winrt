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

@ABIMarker(CompositionBackdropBrush.ABI::class)
@Signature("rc(Windows.UI.Composition.CompositionBackdropBrush;{c5acae58-3898-499e-8d7f-224e91286a5d})")
@WinRTByReference(brClass = CompositionBackdropBrush.ByReference::class)
public class CompositionBackdropBrush(
  ptr: JNAPointer? = NULL
) : CompositionBrush(ptr), ICompositionBackdropBrush.WithDefault, IWinRTObject {
  private val __1414655144_Interface: ICompositionBackdropBrush.WithDefault by lazy {
    as_1414655144()
  }


  public override val __1414655144_Ptr: JNAPointer? by lazy {
    __1414655144_Interface.__1414655144_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1414655144_Interface)

  private fun as_1414655144(): ICompositionBackdropBrush.WithDefault {
    if(pointer == NULL) {
      return(ICompositionBackdropBrush.ABI.makeICompositionBackdropBrush(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionBackdropBrush>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionBackdropBrush.ABI.makeICompositionBackdropBrush(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionBackdropBrush> {
    public override fun getValue() = CompositionBackdropBrush(pointer.getPointer(0))

    public fun setValue(value: CompositionBackdropBrush): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionBackdropBrush, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionBackdropBrush {
      val address = segment.toRawLongValue()
      return CompositionBackdropBrush(Pointer(address))
    }

    public override fun toNative(obj: CompositionBackdropBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
