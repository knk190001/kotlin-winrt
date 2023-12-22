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

@ABIMarker(AppointmentParticipantRole.ABI::class)
@Signature("enum(Windows.ApplicationModel.Appointments.AppointmentParticipantRole;i4)")
@WinRTByReference(brClass = AppointmentParticipantRole.ByReference::class)
public enum class AppointmentParticipantRole(
  public val value: Int
) : NativeMapped {
  RequiredAttendee(0),
  OptionalAttendee(1),
  Resource(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppointmentParticipantRole {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> RequiredAttendee
      1 -> OptionalAttendee
      2 -> Resource
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AppointmentParticipantRole> {
    public fun setValue(newValue: AppointmentParticipantRole): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppointmentParticipantRole =
        AppointmentParticipantRole.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppointmentParticipantRole, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppointmentParticipantRole =
        AppointmentParticipantRole.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppointmentParticipantRole): Int = obj.value
  }
}
