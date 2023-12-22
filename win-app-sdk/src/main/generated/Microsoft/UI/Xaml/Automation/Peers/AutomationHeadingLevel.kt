package Microsoft.UI.Xaml.Automation.Peers

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

@ABIMarker(AutomationHeadingLevel.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Automation.Peers.AutomationHeadingLevel;i4)")
@WinRTByReference(brClass = AutomationHeadingLevel.ByReference::class)
public enum class AutomationHeadingLevel(
  public val value: Int
) : NativeMapped {
  None(0),
  Level1(1),
  Level2(2),
  Level3(3),
  Level4(4),
  Level5(5),
  Level6(6),
  Level7(7),
  Level8(8),
  Level9(9),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AutomationHeadingLevel {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Level1
      2 -> Level2
      3 -> Level3
      4 -> Level4
      5 -> Level5
      6 -> Level6
      7 -> Level7
      8 -> Level8
      9 -> Level9
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AutomationHeadingLevel> {
    public fun setValue(newValue: AutomationHeadingLevel): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AutomationHeadingLevel =
        AutomationHeadingLevel.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AutomationHeadingLevel, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AutomationHeadingLevel =
        AutomationHeadingLevel.values()[0].fromNative(value, null)

    public override fun toNative(obj: AutomationHeadingLevel): Int = obj.value
  }
}
