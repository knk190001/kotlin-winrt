package Windows.ApplicationModel.Appointments

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

@ABIMarker(AppointmentDaysOfWeek.ABI::class)
@Signature("enum(Windows.ApplicationModel.Appointments.AppointmentDaysOfWeek;u4)")
@WinRTByReference(brClass = AppointmentDaysOfWeek.ByReference::class)
public enum class AppointmentDaysOfWeek(
  public val value: Int
) : NativeMapped {
  None(0),
  Sunday(1),
  Monday(2),
  Tuesday(4),
  Wednesday(8),
  Thursday(16),
  Friday(32),
  Saturday(64),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppointmentDaysOfWeek {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Sunday
      2 -> Monday
      4 -> Tuesday
      8 -> Wednesday
      16 -> Thursday
      32 -> Friday
      64 -> Saturday
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AppointmentDaysOfWeek> {
    public fun setValue(newValue: AppointmentDaysOfWeek): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppointmentDaysOfWeek =
        AppointmentDaysOfWeek.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppointmentDaysOfWeek, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppointmentDaysOfWeek =
        AppointmentDaysOfWeek.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppointmentDaysOfWeek): Int = obj.value
  }
}
