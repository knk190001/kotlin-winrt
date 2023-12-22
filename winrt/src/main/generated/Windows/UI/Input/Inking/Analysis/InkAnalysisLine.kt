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

@ABIMarker(InkAnalysisLine.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.Analysis.InkAnalysisLine;{a06d048d-2b8d-4754-ad5a-d0871193a956})")
@WinRTByReference(brClass = InkAnalysisLine.ByReference::class)
public class InkAnalysisLine(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInkAnalysisLine.WithDefault, IInkAnalysisNode.WithDefault, IWinRTObject {
  private val __324048952_Interface: IInkAnalysisLine.WithDefault by lazy {
    as_324048952()
  }


  private val __323983914_Interface: IInkAnalysisNode.WithDefault by lazy {
    as_323983914()
  }


  public override val __324048952_Ptr: JNAPointer? by lazy {
    __324048952_Interface.__324048952_Ptr
  }


  public override val __323983914_Ptr: JNAPointer? by lazy {
    __323983914_Interface.__323983914_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__324048952_Interface, __323983914_Interface)

  private fun as_324048952(): IInkAnalysisLine.WithDefault {
    if(pointer == NULL) {
      return(IInkAnalysisLine.ABI.makeIInkAnalysisLine(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkAnalysisLine>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkAnalysisLine.ABI.makeIInkAnalysisLine(ref.value))
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
      IByReference<InkAnalysisLine> {
    public override fun getValue() = InkAnalysisLine(pointer.getPointer(0))

    public fun setValue(value: InkAnalysisLine): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkAnalysisLine, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InkAnalysisLine {
      val address = segment.toRawLongValue()
      return InkAnalysisLine(Pointer(address))
    }

    public override fun toNative(obj: InkAnalysisLine): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
