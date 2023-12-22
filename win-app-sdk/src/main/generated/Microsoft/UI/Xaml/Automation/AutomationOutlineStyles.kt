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

@ABIMarker(AutomationOutlineStyles.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Automation.AutomationOutlineStyles;i4)")
@WinRTByReference(brClass = AutomationOutlineStyles.ByReference::class)
public enum class AutomationOutlineStyles(
  public val value: Int
) : NativeMapped {
  None(0),
  Outline(1),
  Shadow(2),
  Engraved(3),
  Embossed(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AutomationOutlineStyles {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Outline
      2 -> Shadow
      3 -> Engraved
      4 -> Embossed
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AutomationOutlineStyles> {
    public fun setValue(newValue: AutomationOutlineStyles): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AutomationOutlineStyles =
        AutomationOutlineStyles.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AutomationOutlineStyles, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AutomationOutlineStyles =
        AutomationOutlineStyles.values()[0].fromNative(value, null)

    public override fun toNative(obj: AutomationOutlineStyles): Int = obj.value
  }
}
