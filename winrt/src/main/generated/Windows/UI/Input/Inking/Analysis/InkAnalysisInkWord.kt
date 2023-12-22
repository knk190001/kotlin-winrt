package Windows.UI.Input.Inking.Analysis

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(InkAnalysisInkWord.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.Analysis.InkAnalysisInkWord;{4bd228ad-83af-4034-8f3b-f8687dfff436})")
@WinRTByReference(brClass = InkAnalysisInkWord.ByReference::class)
public class InkAnalysisInkWord(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInkAnalysisInkWord.WithDefault, IInkAnalysisNode.WithDefault, IWinRTObject {
  private val __1178290244_Interface: IInkAnalysisInkWord.WithDefault by lazy {
    as_1178290244()
  }


  private val __323983914_Interface: IInkAnalysisNode.WithDefault by lazy {
    as_323983914()
  }


  public override val __1178290244_Ptr: JNAPointer? by lazy {
    __1178290244_Interface.__1178290244_Ptr
  }


  public override val __323983914_Ptr: JNAPointer? by lazy {
    __323983914_Interface.__323983914_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1178290244_Interface, __323983914_Interface)

  private fun as_1178290244(): IInkAnalysisInkWord.WithDefault {
    if(pointer == NULL) {
      return(IInkAnalysisInkWord.ABI.makeIInkAnalysisInkWord(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkAnalysisInkWord>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkAnalysisInkWord.ABI.makeIInkAnalysisInkWord(ref.value))
  }

  private fun as_323983914(): IInkAnalysisNode.WithDefault {
    if(pointer == NULL) {
      return(IInkAnalysisNode.ABI.makeIInkAnalysisNode(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkAnalysisNode>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkAnalysisNode.ABI.makeIInkAnalysisNode(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkAnalysisInkWord> {
    public override fun getValue() = InkAnalysisInkWord(pointer.getPointer(0))

    public fun setValue(value: InkAnalysisInkWord): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkAnalysisInkWord, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InkAnalysisInkWord {
      val address = segment.toRawLongValue()
      return InkAnalysisInkWord(Pointer(address))
    }

    public override fun toNative(obj: InkAnalysisInkWord): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
