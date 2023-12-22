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

@ABIMarker(AppointmentWeekOfMonth.ABI::class)
@Signature("enum(Windows.ApplicationModel.Appointments.AppointmentWeekOfMonth;i4)")
@WinRTByReference(brClass = AppointmentWeekOfMonth.ByReference::class)
public enum class AppointmentWeekOfMonth(
  public val value: Int
) : NativeMapped {
  First(0),
  Second(1),
  Third(2),
  Fourth(3),
  Last(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppointmentWeekOfMonth {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> First
      1 -> Second
      2 -> Third
      3 -> Fourth
      4 -> Last
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AppointmentWeekOfMonth> {
    public fun setValue(newValue: AppointmentWeekOfMonth): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppointmentWeekOfMonth =
        AppointmentWeekOfMonth.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppointmentWeekOfMonth, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppointmentWeekOfMonth =
        AppointmentWeekOfMonth.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppointmentWeekOfMonth): Int = obj.value
  }
}
