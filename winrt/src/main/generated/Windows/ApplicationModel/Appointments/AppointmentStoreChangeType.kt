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

@ABIMarker(AppointmentStoreChangeType.ABI::class)
@Signature("enum(Windows.ApplicationModel.Appointments.AppointmentStoreChangeType;i4)")
@WinRTByReference(brClass = AppointmentStoreChangeType.ByReference::class)
public enum class AppointmentStoreChangeType(
  public val value: Int
) : NativeMapped {
  AppointmentCreated(0),
  AppointmentModified(1),
  AppointmentDeleted(2),
  ChangeTrackingLost(3),
  CalendarCreated(4),
  CalendarModified(5),
  CalendarDeleted(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppointmentStoreChangeType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> AppointmentCreated
      1 -> AppointmentModified
      2 -> AppointmentDeleted
      3 -> ChangeTrackingLost
      4 -> CalendarCreated
      5 -> CalendarModified
      6 -> CalendarDeleted
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AppointmentStoreChangeType> {
    public fun setValue(newValue: AppointmentStoreChangeType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppointmentStoreChangeType =
        AppointmentStoreChangeType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppointmentStoreChangeType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppointmentStoreChangeType =
        AppointmentStoreChangeType.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppointmentStoreChangeType): Int = obj.value
  }
}
