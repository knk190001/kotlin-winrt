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

@ABIMarker(AutomationCaretPosition.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Automation.AutomationCaretPosition;i4)")
@WinRTByReference(brClass = AutomationCaretPosition.ByReference::class)
public enum class AutomationCaretPosition(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  EndOfLine(1),
  BeginningOfLine(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AutomationCaretPosition {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> EndOfLine
      2 -> BeginningOfLine
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AutomationCaretPosition> {
    public fun setValue(newValue: AutomationCaretPosition): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AutomationCaretPosition =
        AutomationCaretPosition.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AutomationCaretPosition, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AutomationCaretPosition =
        AutomationCaretPosition.values()[0].fromNative(value, null)

    public override fun toNative(obj: AutomationCaretPosition): Int = obj.value
  }
}
