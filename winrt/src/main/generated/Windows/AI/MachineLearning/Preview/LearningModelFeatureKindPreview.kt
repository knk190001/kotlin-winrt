package Windows.AI.MachineLearning.Preview

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.JAVA_INT
import kotlin.Any
import kotlin.Int
import kotlin.Unit

@ABIMarker(LearningModelFeatureKindPreview.ABI::class)
@Signature("enum(Windows.AI.MachineLearning.Preview.LearningModelFeatureKindPreview;i4)")
@WinRTByReference(brClass = LearningModelFeatureKindPreview.ByReference::class)
public enum class LearningModelFeatureKindPreview(
  public val value: Int
) : NativeMapped {
  Undefined(0),
  Tensor(1),
  Sequence(2),
  Map(3),
  Image(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      LearningModelFeatureKindPreview {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Undefined
      1 -> Tensor
      2 -> Sequence
      3 -> Map
      4 -> Image
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<LearningModelFeatureKindPreview> {
    public fun setValue(newValue: LearningModelFeatureKindPreview): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): LearningModelFeatureKindPreview =
        LearningModelFeatureKindPreview.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<LearningModelFeatureKindPreview, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): LearningModelFeatureKindPreview =
        LearningModelFeatureKindPreview.values()[0].fromNative(value, null)

    public override fun toNative(obj: LearningModelFeatureKindPreview): Int = obj.value
  }
}
