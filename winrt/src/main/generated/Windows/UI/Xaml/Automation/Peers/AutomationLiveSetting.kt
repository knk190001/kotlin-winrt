package Windows.UI.Xaml.Automation.Peers

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

@ABIMarker(AutomationLiveSetting.ABI::class)
@Signature("enum(Windows.UI.Xaml.Automation.Peers.AutomationLiveSetting;i4)")
@WinRTByReference(brClass = AutomationLiveSetting.ByReference::class)
public enum class AutomationLiveSetting(
  public val value: Int
) : NativeMapped {
  Off(0),
  Polite(1),
  Assertive(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AutomationLiveSetting {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Off
      1 -> Polite
      2 -> Assertive
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AutomationLiveSetting> {
    public fun setValue(newValue: AutomationLiveSetting): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AutomationLiveSetting =
        AutomationLiveSetting.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AutomationLiveSetting, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AutomationLiveSetting =
        AutomationLiveSetting.values()[0].fromNative(value, null)

    public override fun toNative(obj: AutomationLiveSetting): Int = obj.value
  }
}
