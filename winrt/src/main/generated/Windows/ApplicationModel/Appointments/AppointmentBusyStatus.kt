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

@ABIMarker(AppointmentBusyStatus.ABI::class)
@Signature("enum(Windows.ApplicationModel.Appointments.AppointmentBusyStatus;i4)")
@WinRTByReference(brClass = AppointmentBusyStatus.ByReference::class)
public enum class AppointmentBusyStatus(
  public val value: Int
) : NativeMapped {
  Busy(0),
  Tentative(1),
  Free(2),
  OutOfOffice(3),
  WorkingElsewhere(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppointmentBusyStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Busy
      1 -> Tentative
      2 -> Free
      3 -> OutOfOffice
      4 -> WorkingElsewhere
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AppointmentBusyStatus> {
    public fun setValue(newValue: AppointmentBusyStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppointmentBusyStatus =
        AppointmentBusyStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppointmentBusyStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppointmentBusyStatus =
        AppointmentBusyStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppointmentBusyStatus): Int = obj.value
  }
}
