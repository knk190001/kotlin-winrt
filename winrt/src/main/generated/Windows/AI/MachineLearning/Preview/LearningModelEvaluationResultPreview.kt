package Windows.AI.MachineLearning.Preview

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

@ABIMarker(LearningModelEvaluationResultPreview.ABI::class)
@Signature("rc(Windows.AI.MachineLearning.Preview.LearningModelEvaluationResultPreview;{df25ea9f-9863-4088-8498-87a1f4686f92})")
@WinRTByReference(brClass = LearningModelEvaluationResultPreview.ByReference::class)
public class LearningModelEvaluationResultPreview(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILearningModelEvaluationResultPreview.WithDefault, IWinRTObject {
  private val __1523942263_Interface: ILearningModelEvaluationResultPreview.WithDefault by lazy {
    as_1523942263()
  }


  public override val __1523942263_Ptr: JNAPointer? by lazy {
    __1523942263_Interface.__1523942263_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1523942263_Interface)

  private fun as_1523942263(): ILearningModelEvaluationResultPreview.WithDefault {
    if(pointer == NULL) {
      return(ILearningModelEvaluationResultPreview.ABI.makeILearningModelEvaluationResultPreview(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILearningModelEvaluationResultPreview>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILearningModelEvaluationResultPreview.ABI.makeILearningModelEvaluationResultPreview(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LearningModelEvaluationResultPreview> {
    public override fun getValue() = LearningModelEvaluationResultPreview(pointer.getPointer(0))

    public fun setValue(value: LearningModelEvaluationResultPreview): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LearningModelEvaluationResultPreview, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LearningModelEvaluationResultPreview {
      val address = segment.toRawLongValue()
      return LearningModelEvaluationResultPreview(Pointer(address))
    }

    public override fun toNative(obj: LearningModelEvaluationResultPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
