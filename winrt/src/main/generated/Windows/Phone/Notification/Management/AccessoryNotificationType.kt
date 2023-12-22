package Windows.Phone.Notification.Management

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

@ABIMarker(AccessoryNotificationType.ABI::class)
@Signature("enum(Windows.Phone.Notification.Management.AccessoryNotificationType;u4)")
@WinRTByReference(brClass = AccessoryNotificationType.ByReference::class)
public enum class AccessoryNotificationType(
  public val value: Int
) : NativeMapped {
  None(0),
  Phone(1),
  Email(2),
  Reminder(4),
  Alarm(8),
  Toast(16),
  AppUninstalled(32),
  Dnd(64),
  DrivingMode(128),
  BatterySaver(256),
  Media(512),
  CortanaTile(1024),
  ToastCleared(2048),
  CalendarChanged(4096),
  VolumeChanged(8192),
  EmailReadStatusChanged(16384),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AccessoryNotificationType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Phone
      2 -> Email
      4 -> Reminder
      8 -> Alarm
      16 -> Toast
      32 -> AppUninstalled
      64 -> Dnd
      128 -> DrivingMode
      256 -> BatterySaver
      512 -> Media
      1024 -> CortanaTile
      2048 -> ToastCleared
      4096 -> CalendarChanged
      8192 -> VolumeChanged
      16384 -> EmailReadStatusChanged
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AccessoryNotificationType>
      {
    public fun setValue(newValue: AccessoryNotificationType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AccessoryNotificationType =
        AccessoryNotificationType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AccessoryNotificationType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AccessoryNotificationType =
        AccessoryNotificationType.values()[0].fromNative(value, null)

    public override fun toNative(obj: AccessoryNotificationType): Int = obj.value
  }
}
