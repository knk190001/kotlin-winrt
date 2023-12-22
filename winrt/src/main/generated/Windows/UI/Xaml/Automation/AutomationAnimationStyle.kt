package Windows.UI.Xaml.Automation

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

@ABIMarker(AutomationAnimationStyle.ABI::class)
@Signature("enum(Windows.UI.Xaml.Automation.AutomationAnimationStyle;i4)")
@WinRTByReference(brClass = AutomationAnimationStyle.ByReference::class)
public enum class AutomationAnimationStyle(
  public val value: Int
) : NativeMapped {
  None(0),
  LasVegasLights(1),
  BlinkingBackground(2),
  SparkleText(3),
  MarchingBlackAnts(4),
  MarchingRedAnts(5),
  Shimmer(6),
  Other(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AutomationAnimationStyle {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> LasVegasLights
      2 -> BlinkingBackground
      3 -> SparkleText
      4 -> MarchingBlackAnts
      5 -> MarchingRedAnts
      6 -> Shimmer
      7 -> Other
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AutomationAnimationStyle>
      {
    public fun setValue(newValue: AutomationAnimationStyle): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AutomationAnimationStyle =
        AutomationAnimationStyle.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AutomationAnimationStyle, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AutomationAnimationStyle =
        AutomationAnimationStyle.values()[0].fromNative(value, null)

    public override fun toNative(obj: AutomationAnimationStyle): Int = obj.value
  }
}
