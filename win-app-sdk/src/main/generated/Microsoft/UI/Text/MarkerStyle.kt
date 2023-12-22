package Microsoft.UI.Text

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

@ABIMarker(MarkerStyle.ABI::class)
@Signature("enum(Microsoft.UI.Text.MarkerStyle;i4)")
@WinRTByReference(brClass = MarkerStyle.ByReference::class)
public enum class MarkerStyle(
  public val value: Int
) : NativeMapped {
  Undefined(0),
  Parenthesis(1),
  Parentheses(2),
  Period(3),
  Plain(4),
  Minus(5),
  NoNumber(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MarkerStyle {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Undefined
      1 -> Parenthesis
      2 -> Parentheses
      3 -> Period
      4 -> Plain
      5 -> Minus
      6 -> NoNumber
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MarkerStyle> {
    public fun setValue(newValue: MarkerStyle): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MarkerStyle =
        MarkerStyle.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MarkerStyle, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MarkerStyle =
        MarkerStyle.values()[0].fromNative(value, null)

    public override fun toNative(obj: MarkerStyle): Int = obj.value
  }
}
