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

@ABIMarker(AutomationFlowDirections.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Automation.AutomationFlowDirections;i4)")
@WinRTByReference(brClass = AutomationFlowDirections.ByReference::class)
public enum class AutomationFlowDirections(
  public val value: Int
) : NativeMapped {
  Default(0),
  RightToLeft(1),
  BottomToTop(2),
  Vertical(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AutomationFlowDirections {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> RightToLeft
      2 -> BottomToTop
      3 -> Vertical
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AutomationFlowDirections>
      {
    public fun setValue(newValue: AutomationFlowDirections): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AutomationFlowDirections =
        AutomationFlowDirections.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AutomationFlowDirections, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AutomationFlowDirections =
        AutomationFlowDirections.values()[0].fromNative(value, null)

    public override fun toNative(obj: AutomationFlowDirections): Int = obj.value
  }
}
