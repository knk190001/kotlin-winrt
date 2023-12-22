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

@ABIMarker(EmailCertificateValidationStatus.ABI::class)
@Signature("enum(Windows.ApplicationModel.Email.EmailCertificateValidationStatus;i4)")
@WinRTByReference(brClass = EmailCertificateValidationStatus.ByReference::class)
public enum class EmailCertificateValidationStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  NoMatch(1),
  InvalidUsage(2),
  InvalidCertificate(3),
  Revoked(4),
  ChainRevoked(5),
  RevocationServerFailure(6),
  Expired(7),
  Untrusted(8),
  ServerError(9),
  UnknownFailure(10),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EmailCertificateValidationStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> NoMatch
      2 -> InvalidUsage
      3 -> InvalidCertificate
      4 -> Revoked
      5 -> ChainRevoked
      6 -> RevocationServerFailure
      7 -> Expired
      8 -> Untrusted
      9 -> ServerError
      10 -> UnknownFailure
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<EmailCertificateValidationStatus> {
    public fun setValue(newValue: EmailCertificateValidationStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EmailCertificateValidationStatus =
        EmailCertificateValidationStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EmailCertificateValidationStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EmailCertificateValidationStatus =
        EmailCertificateValidationStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: EmailCertificateValidationStatus): Int = obj.value
  }
}
