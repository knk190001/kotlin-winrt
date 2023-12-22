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

@ABIMarker(AppNotificationSoundEvent.ABI::class)
@Signature("enum(Microsoft.Windows.AppNotifications.Builder.AppNotificationSoundEvent;i4)")
@WinRTByReference(brClass = AppNotificationSoundEvent.ByReference::class)
public enum class AppNotificationSoundEvent(
  public val value: Int
) : NativeMapped {
  Default(0),
  IM(1),
  Mail(2),
  Reminder(3),
  SMS(4),
  Alarm(5),
  Alarm2(6),
  Alarm3(7),
  Alarm4(8),
  Alarm5(9),
  Alarm6(10),
  Alarm7(11),
  Alarm8(12),
  Alarm9(13),
  Alarm10(14),
  Call(15),
  Call2(16),
  Call3(17),
  Call4(18),
  Call5(19),
  Call6(20),
  Call7(21),
  Call8(22),
  Call9(23),
  Call10(24),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppNotificationSoundEvent {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> IM
      2 -> Mail
      3 -> Reminder
      4 -> SMS
      5 -> Alarm
      6 -> Alarm2
      7 -> Alarm3
      8 -> Alarm4
      9 -> Alarm5
      10 -> Alarm6
      11 -> Alarm7
      12 -> Alarm8
      13 -> Alarm9
      14 -> Alarm10
      15 -> Call
      16 -> Call2
      17 -> Call3
      18 -> Call4
      19 -> Call5
      20 -> Call6
      21 -> Call7
      22 -> Call8
      23 -> Call9
      24 -> Call10
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AppNotificationSoundEvent>
      {
    public fun setValue(newValue: AppNotificationSoundEvent): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppNotificationSoundEvent =
        AppNotificationSoundEvent.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppNotificationSoundEvent, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppNotificationSoundEvent =
        AppNotificationSoundEvent.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppNotificationSoundEvent): Int = obj.value
  }
}
