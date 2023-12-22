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

@ABIMarker(AutomationCaretBidiMode.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Automation.AutomationCaretBidiMode;i4)")
@WinRTByReference(brClass = AutomationCaretBidiMode.ByReference::class)
public enum class AutomationCaretBidiMode(
  public val value: Int
) : NativeMapped {
  LTR(0),
  RTL(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AutomationCaretBidiMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> LTR
      1 -> RTL
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AutomationCaretBidiMode> {
    public fun setValue(newValue: AutomationCaretBidiMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AutomationCaretBidiMode =
        AutomationCaretBidiMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AutomationCaretBidiMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AutomationCaretBidiMode =
        AutomationCaretBidiMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: AutomationCaretBidiMode): Int = obj.value
  }
}
