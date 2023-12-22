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

@ABIMarker(InkAnalysisResult.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.Analysis.InkAnalysisResult;{8948ba79-a243-4aa3-a294-1f98bd0ff580})")
@WinRTByReference(brClass = InkAnalysisResult.ByReference::class)
public class InkAnalysisResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInkAnalysisResult.WithDefault, IWinRTObject {
  private val __2005148943_Interface: IInkAnalysisResult.WithDefault by lazy {
    as_2005148943()
  }


  public override val __2005148943_Ptr: JNAPointer? by lazy {
    __2005148943_Interface.__2005148943_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2005148943_Interface)

  private fun as_2005148943(): IInkAnalysisResult.WithDefault {
    if(pointer == NULL) {
      return(IInkAnalysisResult.ABI.makeIInkAnalysisResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkAnalysisResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkAnalysisResult.ABI.makeIInkAnalysisResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkAnalysisResult> {
    public override fun getValue() = InkAnalysisResult(pointer.getPointer(0))

    public fun setValue(value: InkAnalysisResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkAnalysisResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InkAnalysisResult {
      val address = segment.toRawLongValue()
      return InkAnalysisResult(Pointer(address))
    }

    public override fun toNative(obj: InkAnalysisResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
