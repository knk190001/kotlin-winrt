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

@ABIMarker(AutomationNotificationProcessing.ABI::class)
@Signature("enum(Windows.UI.Xaml.Automation.Peers.AutomationNotificationProcessing;i4)")
@WinRTByReference(brClass = AutomationNotificationProcessing.ByReference::class)
public enum class AutomationNotificationProcessing(
  public val value: Int
) : NativeMapped {
  ImportantAll(0),
  ImportantMostRecent(1),
  All(2),
  MostRecent(3),
  CurrentThenMostRecent(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AutomationNotificationProcessing {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> ImportantAll
      1 -> ImportantMostRecent
      2 -> All
      3 -> MostRecent
      4 -> CurrentThenMostRecent
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AutomationNotificationProcessing> {
    public fun setValue(newValue: AutomationNotificationProcessing): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AutomationNotificationProcessing =
        AutomationNotificationProcessing.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AutomationNotificationProcessing, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AutomationNotificationProcessing =
        AutomationNotificationProcessing.values()[0].fromNative(value, null)

    public override fun toNative(obj: AutomationNotificationProcessing): Int = obj.value
  }
}
