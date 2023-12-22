package Microsoft.UI.Xaml.Automation

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

@ABIMarker(AutomationTextDecorationLineStyle.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Automation.AutomationTextDecorationLineStyle;i4)")
@WinRTByReference(brClass = AutomationTextDecorationLineStyle.ByReference::class)
public enum class AutomationTextDecorationLineStyle(
  public val value: Int
) : NativeMapped {
  None(0),
  Single(1),
  WordsOnly(2),
  Double(3),
  Dot(4),
  Dash(5),
  DashDot(6),
  DashDotDot(7),
  Wavy(8),
  ThickSingle(9),
  DoubleWavy(10),
  ThickWavy(11),
  LongDash(12),
  ThickDash(13),
  ThickDashDot(14),
  ThickDashDotDot(15),
  ThickDot(16),
  ThickLongDash(17),
  Other(18),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AutomationTextDecorationLineStyle {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Single
      2 -> WordsOnly
      3 -> Double
      4 -> Dot
      5 -> Dash
      6 -> DashDot
      7 -> DashDotDot
      8 -> Wavy
      9 -> ThickSingle
      10 -> DoubleWavy
      11 -> ThickWavy
      12 -> LongDash
      13 -> ThickDash
      14 -> ThickDashDot
      15 -> ThickDashDotDot
      16 -> ThickDot
      17 -> ThickLongDash
      18 -> Other
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AutomationTextDecorationLineStyle> {
    public fun setValue(newValue: AutomationTextDecorationLineStyle): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AutomationTextDecorationLineStyle =
        AutomationTextDecorationLineStyle.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AutomationTextDecorationLineStyle, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AutomationTextDecorationLineStyle =
        AutomationTextDecorationLineStyle.values()[0].fromNative(value, null)

    public override fun toNative(obj: AutomationTextDecorationLineStyle): Int = obj.value
  }
}
