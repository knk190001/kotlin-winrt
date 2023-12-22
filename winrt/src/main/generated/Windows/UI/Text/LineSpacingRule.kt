package Windows.UI.Text

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

@ABIMarker(LineSpacingRule.ABI::class)
@Signature("enum(Windows.UI.Text.LineSpacingRule;i4)")
@WinRTByReference(brClass = LineSpacingRule.ByReference::class)
public enum class LineSpacingRule(
  public val value: Int
) : NativeMapped {
  Undefined(0),
  Single(1),
  OneAndHalf(2),
  Double(3),
  AtLeast(4),
  Exactly(5),
  Multiple(6),
  Percent(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      LineSpacingRule {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Undefined
      1 -> Single
      2 -> OneAndHalf
      3 -> Double
      4 -> AtLeast
      5 -> Exactly
      6 -> Multiple
      7 -> Percent
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<LineSpacingRule> {
    public fun setValue(newValue: LineSpacingRule): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): LineSpacingRule =
        LineSpacingRule.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<LineSpacingRule, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): LineSpacingRule =
        LineSpacingRule.values()[0].fromNative(value, null)

    public override fun toNative(obj: LineSpacingRule): Int = obj.value
  }
}
