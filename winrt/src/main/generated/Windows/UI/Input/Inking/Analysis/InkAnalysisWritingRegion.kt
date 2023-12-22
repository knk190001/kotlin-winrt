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

@ABIMarker(InkAnalysisWritingRegion.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.Analysis.InkAnalysisWritingRegion;{dd6d6231-bd16-4663-b5ae-941d3043ef5b})")
@WinRTByReference(brClass = InkAnalysisWritingRegion.ByReference::class)
public class InkAnalysisWritingRegion(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInkAnalysisWritingRegion.WithDefault, IInkAnalysisNode.WithDefault,
    IWinRTObject {
  private val __2014524004_Interface: IInkAnalysisWritingRegion.WithDefault by lazy {
    as_2014524004()
  }


  private val __323983914_Interface: IInkAnalysisNode.WithDefault by lazy {
    as_323983914()
  }


  public override val __2014524004_Ptr: JNAPointer? by lazy {
    __2014524004_Interface.__2014524004_Ptr
  }


  public override val __323983914_Ptr: JNAPointer? by lazy {
    __323983914_Interface.__323983914_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2014524004_Interface, __323983914_Interface)

  private fun as_2014524004(): IInkAnalysisWritingRegion.WithDefault {
    if(pointer == NULL) {
      return(IInkAnalysisWritingRegion.ABI.makeIInkAnalysisWritingRegion(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkAnalysisWritingRegion>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkAnalysisWritingRegion.ABI.makeIInkAnalysisWritingRegion(ref.value))
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
      IByReference<InkAnalysisWritingRegion> {
    public override fun getValue() = InkAnalysisWritingRegion(pointer.getPointer(0))

    public fun setValue(value: InkAnalysisWritingRegion): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkAnalysisWritingRegion, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InkAnalysisWritingRegion {
      val address = segment.toRawLongValue()
      return InkAnalysisWritingRegion(Pointer(address))
    }

    public override fun toNative(obj: InkAnalysisWritingRegion): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
