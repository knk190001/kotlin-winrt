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

@ABIMarker(AutomationNavigationDirection.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Automation.Peers.AutomationNavigationDirection;i4)")
@WinRTByReference(brClass = AutomationNavigationDirection.ByReference::class)
public enum class AutomationNavigationDirection(
  public val value: Int
) : NativeMapped {
  Parent(0),
  NextSibling(1),
  PreviousSibling(2),
  FirstChild(3),
  LastChild(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AutomationNavigationDirection {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Parent
      1 -> NextSibling
      2 -> PreviousSibling
      3 -> FirstChild
      4 -> LastChild
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AutomationNavigationDirection> {
    public fun setValue(newValue: AutomationNavigationDirection): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AutomationNavigationDirection =
        AutomationNavigationDirection.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AutomationNavigationDirection, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AutomationNavigationDirection =
        AutomationNavigationDirection.values()[0].fromNative(value, null)

    public override fun toNative(obj: AutomationNavigationDirection): Int = obj.value
  }
}
