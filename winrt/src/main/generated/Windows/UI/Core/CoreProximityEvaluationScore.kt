package Windows.UI.Core

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

@ABIMarker(CoreProximityEvaluationScore.ABI::class)
@Signature("enum(Windows.UI.Core.CoreProximityEvaluationScore;i4)")
@WinRTByReference(brClass = CoreProximityEvaluationScore.ByReference::class)
public enum class CoreProximityEvaluationScore(
  public val value: Int
) : NativeMapped {
  Closest(0),
  Farthest(2147483647),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CoreProximityEvaluationScore {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Closest
      2147483647 -> Farthest
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CoreProximityEvaluationScore> {
    public fun setValue(newValue: CoreProximityEvaluationScore): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CoreProximityEvaluationScore =
        CoreProximityEvaluationScore.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CoreProximityEvaluationScore, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CoreProximityEvaluationScore =
        CoreProximityEvaluationScore.values()[0].fromNative(value, null)

    public override fun toNative(obj: CoreProximityEvaluationScore): Int = obj.value
  }
}
