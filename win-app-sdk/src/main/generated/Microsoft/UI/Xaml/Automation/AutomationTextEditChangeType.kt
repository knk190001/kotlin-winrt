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

@ABIMarker(AutomationTextEditChangeType.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Automation.AutomationTextEditChangeType;i4)")
@WinRTByReference(brClass = AutomationTextEditChangeType.ByReference::class)
public enum class AutomationTextEditChangeType(
  public val value: Int
) : NativeMapped {
  None(0),
  AutoCorrect(1),
  Composition(2),
  CompositionFinalized(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AutomationTextEditChangeType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> AutoCorrect
      2 -> Composition
      3 -> CompositionFinalized
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AutomationTextEditChangeType> {
    public fun setValue(newValue: AutomationTextEditChangeType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AutomationTextEditChangeType =
        AutomationTextEditChangeType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AutomationTextEditChangeType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AutomationTextEditChangeType =
        AutomationTextEditChangeType.values()[0].fromNative(value, null)

    public override fun toNative(obj: AutomationTextEditChangeType): Int = obj.value
  }
}
