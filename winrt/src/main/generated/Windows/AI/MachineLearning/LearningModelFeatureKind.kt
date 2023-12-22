package Windows.AI.MachineLearning

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

@ABIMarker(LearningModelFeatureKind.ABI::class)
@Signature("enum(Windows.AI.MachineLearning.LearningModelFeatureKind;i4)")
@WinRTByReference(brClass = LearningModelFeatureKind.ByReference::class)
public enum class LearningModelFeatureKind(
  public val value: Int
) : NativeMapped {
  Tensor(0),
  Sequence(1),
  Map(2),
  Image(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      LearningModelFeatureKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Tensor
      1 -> Sequence
      2 -> Map
      3 -> Image
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<LearningModelFeatureKind>
      {
    public fun setValue(newValue: LearningModelFeatureKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): LearningModelFeatureKind =
        LearningModelFeatureKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<LearningModelFeatureKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): LearningModelFeatureKind =
        LearningModelFeatureKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: LearningModelFeatureKind): Int = obj.value
  }
}
