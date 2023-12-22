package Windows.ApplicationModel.Email

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

@ABIMarker(EmailMeetingResponseType.ABI::class)
@Signature("enum(Windows.ApplicationModel.Email.EmailMeetingResponseType;i4)")
@WinRTByReference(brClass = EmailMeetingResponseType.ByReference::class)
public enum class EmailMeetingResponseType(
  public val value: Int
) : NativeMapped {
  Accept(0),
  Decline(1),
  Tentative(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EmailMeetingResponseType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Accept
      1 -> Decline
      2 -> Tentative
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<EmailMeetingResponseType>
      {
    public fun setValue(newValue: EmailMeetingResponseType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EmailMeetingResponseType =
        EmailMeetingResponseType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EmailMeetingResponseType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EmailMeetingResponseType =
        EmailMeetingResponseType.values()[0].fromNative(value, null)

    public override fun toNative(obj: EmailMeetingResponseType): Int = obj.value
  }
}
