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

@ABIMarker(AutomationActiveEnd.ABI::class)
@Signature("enum(Windows.UI.Xaml.Automation.AutomationActiveEnd;i4)")
@WinRTByReference(brClass = AutomationActiveEnd.ByReference::class)
public enum class AutomationActiveEnd(
  public val value: Int
) : NativeMapped {
  None(0),
  Start(1),
  End(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AutomationActiveEnd {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Start
      2 -> End
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AutomationActiveEnd> {
    public fun setValue(newValue: AutomationActiveEnd): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AutomationActiveEnd =
        AutomationActiveEnd.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AutomationActiveEnd, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AutomationActiveEnd =
        AutomationActiveEnd.values()[0].fromNative(value, null)

    public override fun toNative(obj: AutomationActiveEnd): Int = obj.value
  }
}
