package Microsoft.Windows.AppNotifications.Builder

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

@ABIMarker(AppNotificationScenario.ABI::class)
@Signature("enum(Microsoft.Windows.AppNotifications.Builder.AppNotificationScenario;i4)")
@WinRTByReference(brClass = AppNotificationScenario.ByReference::class)
public enum class AppNotificationScenario(
  public val value: Int
) : NativeMapped {
  Default(0),
  Reminder(1),
  Alarm(2),
  IncomingCall(3),
  Urgent(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppNotificationScenario {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> Reminder
      2 -> Alarm
      3 -> IncomingCall
      4 -> Urgent
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AppNotificationScenario> {
    public fun setValue(newValue: AppNotificationScenario): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppNotificationScenario =
        AppNotificationScenario.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppNotificationScenario, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppNotificationScenario =
        AppNotificationScenario.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppNotificationScenario): Int = obj.value
  }
}
