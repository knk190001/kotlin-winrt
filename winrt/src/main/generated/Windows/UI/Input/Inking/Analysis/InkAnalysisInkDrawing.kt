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

@ABIMarker(InkAnalysisInkDrawing.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.Analysis.InkAnalysisInkDrawing;{6a85ed1f-1fe4-4e15-898c-8e112377e021})")
@WinRTByReference(brClass = InkAnalysisInkDrawing.ByReference::class)
public class InkAnalysisInkDrawing(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInkAnalysisInkDrawing.WithDefault, IInkAnalysisNode.WithDefault, IWinRTObject
    {
  private val __711208492_Interface: IInkAnalysisInkDrawing.WithDefault by lazy {
    as_711208492()
  }


  private val __323983914_Interface: IInkAnalysisNode.WithDefault by lazy {
    as_323983914()
  }


  public override val __711208492_Ptr: JNAPointer? by lazy {
    __711208492_Interface.__711208492_Ptr
  }


  public override val __323983914_Ptr: JNAPointer? by lazy {
    __323983914_Interface.__323983914_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__711208492_Interface, __323983914_Interface)

  private fun as_711208492(): IInkAnalysisInkDrawing.WithDefault {
    if(pointer == NULL) {
      return(IInkAnalysisInkDrawing.ABI.makeIInkAnalysisInkDrawing(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkAnalysisInkDrawing>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkAnalysisInkDrawing.ABI.makeIInkAnalysisInkDrawing(ref.value))
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
      IByReference<InkAnalysisInkDrawing> {
    public override fun getValue() = InkAnalysisInkDrawing(pointer.getPointer(0))

    public fun setValue(value: InkAnalysisInkDrawing): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkAnalysisInkDrawing, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InkAnalysisInkDrawing {
      val address = segment.toRawLongValue()
      return InkAnalysisInkDrawing(Pointer(address))
    }

    public override fun toNative(obj: InkAnalysisInkDrawing): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
