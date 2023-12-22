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

@ABIMarker(AppointmentParticipantResponse.ABI::class)
@Signature("enum(Windows.ApplicationModel.Appointments.AppointmentParticipantResponse;i4)")
@WinRTByReference(brClass = AppointmentParticipantResponse.ByReference::class)
public enum class AppointmentParticipantResponse(
  public val value: Int
) : NativeMapped {
  None(0),
  Tentative(1),
  Accepted(2),
  Declined(3),
  Unknown(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppointmentParticipantResponse {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Tentative
      2 -> Accepted
      3 -> Declined
      4 -> Unknown
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AppointmentParticipantResponse> {
    public fun setValue(newValue: AppointmentParticipantResponse): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppointmentParticipantResponse =
        AppointmentParticipantResponse.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppointmentParticipantResponse, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppointmentParticipantResponse =
        AppointmentParticipantResponse.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppointmentParticipantResponse): Int = obj.value
  }
}
