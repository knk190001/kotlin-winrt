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

@ABIMarker(CompositionColorBrush.ABI::class)
@Signature("rc(Microsoft.UI.Composition.CompositionColorBrush;{3f8ffb69-3e71-55a7-8e79-f27a214c56ae})")
@WinRTByReference(brClass = CompositionColorBrush.ByReference::class)
public class CompositionColorBrush(
  ptr: JNAPointer? = NULL
) : CompositionBrush(ptr), ICompositionColorBrush.WithDefault, IWinRTObject {
  private val __2107807640_Interface: ICompositionColorBrush.WithDefault by lazy {
    as_2107807640()
  }


  public override val __2107807640_Ptr: JNAPointer? by lazy {
    __2107807640_Interface.__2107807640_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2107807640_Interface)

  private fun as_2107807640(): ICompositionColorBrush.WithDefault {
    if(pointer == NULL) {
      return(ICompositionColorBrush.ABI.makeICompositionColorBrush(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionColorBrush>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionColorBrush.ABI.makeICompositionColorBrush(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionColorBrush> {
    public override fun getValue() = CompositionColorBrush(pointer.getPointer(0))

    public fun setValue(value: CompositionColorBrush): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionColorBrush, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionColorBrush {
      val address = segment.toRawLongValue()
      return CompositionColorBrush(Pointer(address))
    }

    public override fun toNative(obj: CompositionColorBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
