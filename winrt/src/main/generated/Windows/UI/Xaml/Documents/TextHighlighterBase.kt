package Windows.UI.Xaml.Documents

import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(TextHighlighterBase.ABI::class)
@Signature("rc(Windows.UI.Xaml.Documents.TextHighlighterBase;{d957601a-5f0d-4cdf-9758-97e0eb95c8fa})")
@WinRTByReference(brClass = TextHighlighterBase.ByReference::class)
public class TextHighlighterBase(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), ITextHighlighterBase.WithDefault, IWinRTObject {
  private val __753990333_Interface: ITextHighlighterBase.WithDefault by lazy {
    as_753990333()
  }


  public override val __753990333_Ptr: JNAPointer? by lazy {
    __753990333_Interface.__753990333_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__753990333_Interface)

  private fun as_753990333(): ITextHighlighterBase.WithDefault {
    if(pointer == NULL) {
      return(ITextHighlighterBase.ABI.makeITextHighlighterBase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextHighlighterBase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextHighlighterBase.ABI.makeITextHighlighterBase(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TextHighlighterBase> {
    public override fun getValue() = TextHighlighterBase(pointer.getPointer(0))

    public fun setValue(value: TextHighlighterBase): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TextHighlighterBase, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TextHighlighterBase {
      val address = segment.toRawLongValue()
      return TextHighlighterBase(Pointer(address))
    }

    public override fun toNative(obj: TextHighlighterBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
