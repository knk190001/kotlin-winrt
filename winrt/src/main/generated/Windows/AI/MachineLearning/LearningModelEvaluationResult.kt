package Windows.AI.MachineLearning

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

@ABIMarker(LearningModelEvaluationResult.ABI::class)
@Signature("rc(Windows.AI.MachineLearning.LearningModelEvaluationResult;{b2f9bfcd-960e-49c0-8593-eb190ae3eee2})")
@WinRTByReference(brClass = LearningModelEvaluationResult.ByReference::class)
public class LearningModelEvaluationResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILearningModelEvaluationResult.WithDefault, IWinRTObject {
  private val __1135880709_Interface: ILearningModelEvaluationResult.WithDefault by lazy {
    as_1135880709()
  }


  public override val __1135880709_Ptr: JNAPointer? by lazy {
    __1135880709_Interface.__1135880709_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1135880709_Interface)

  private fun as_1135880709(): ILearningModelEvaluationResult.WithDefault {
    if(pointer == NULL) {
      return(ILearningModelEvaluationResult.ABI.makeILearningModelEvaluationResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILearningModelEvaluationResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILearningModelEvaluationResult.ABI.makeILearningModelEvaluationResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LearningModelEvaluationResult> {
    public override fun getValue() = LearningModelEvaluationResult(pointer.getPointer(0))

    public fun setValue(value: LearningModelEvaluationResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LearningModelEvaluationResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LearningModelEvaluationResult {
      val address = segment.toRawLongValue()
      return LearningModelEvaluationResult(Pointer(address))
    }

    public override fun toNative(obj: LearningModelEvaluationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
