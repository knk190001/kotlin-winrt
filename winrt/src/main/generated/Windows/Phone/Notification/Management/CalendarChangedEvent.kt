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

@ABIMarker(CalendarChangedEvent.ABI::class)
@Signature("enum(Windows.Phone.Notification.Management.CalendarChangedEvent;i4)")
@WinRTByReference(brClass = CalendarChangedEvent.ByReference::class)
public enum class CalendarChangedEvent(
  public val value: Int
) : NativeMapped {
  LostEvents(0),
  AppointmentAdded(1),
  AppointmentChanged(2),
  AppointmentDeleted(3),
  CalendarAdded(4),
  CalendarChanged(5),
  CalendarDeleted(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CalendarChangedEvent {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> LostEvents
      1 -> AppointmentAdded
      2 -> AppointmentChanged
      3 -> AppointmentDeleted
      4 -> CalendarAdded
      5 -> CalendarChanged
      6 -> CalendarDeleted
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CalendarChangedEvent> {
    public fun setValue(newValue: CalendarChangedEvent): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CalendarChangedEvent =
        CalendarChangedEvent.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CalendarChangedEvent, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CalendarChangedEvent =
        CalendarChangedEvent.values()[0].fromNative(value, null)

    public override fun toNative(obj: CalendarChangedEvent): Int = obj.value
  }
}
