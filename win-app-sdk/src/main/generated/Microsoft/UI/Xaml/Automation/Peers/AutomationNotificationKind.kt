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

@ABIMarker(AutomationNotificationKind.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Automation.Peers.AutomationNotificationKind;i4)")
@WinRTByReference(brClass = AutomationNotificationKind.ByReference::class)
public enum class AutomationNotificationKind(
  public val value: Int
) : NativeMapped {
  ItemAdded(0),
  ItemRemoved(1),
  ActionCompleted(2),
  ActionAborted(3),
  Other(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AutomationNotificationKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> ItemAdded
      1 -> ItemRemoved
      2 -> ActionCompleted
      3 -> ActionAborted
      4 -> Other
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AutomationNotificationKind> {
    public fun setValue(newValue: AutomationNotificationKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AutomationNotificationKind =
        AutomationNotificationKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AutomationNotificationKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AutomationNotificationKind =
        AutomationNotificationKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: AutomationNotificationKind): Int = obj.value
  }
}
