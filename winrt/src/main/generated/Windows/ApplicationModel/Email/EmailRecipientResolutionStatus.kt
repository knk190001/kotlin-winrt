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

@ABIMarker(EmailRecipientResolutionStatus.ABI::class)
@Signature("enum(Windows.ApplicationModel.Email.EmailRecipientResolutionStatus;i4)")
@WinRTByReference(brClass = EmailRecipientResolutionStatus.ByReference::class)
public enum class EmailRecipientResolutionStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  RecipientNotFound(1),
  AmbiguousRecipient(2),
  NoCertificate(3),
  CertificateRequestLimitReached(4),
  CannotResolveDistributionList(5),
  ServerError(6),
  UnknownFailure(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EmailRecipientResolutionStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> RecipientNotFound
      2 -> AmbiguousRecipient
      3 -> NoCertificate
      4 -> CertificateRequestLimitReached
      5 -> CannotResolveDistributionList
      6 -> ServerError
      7 -> UnknownFailure
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<EmailRecipientResolutionStatus> {
    public fun setValue(newValue: EmailRecipientResolutionStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EmailRecipientResolutionStatus =
        EmailRecipientResolutionStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EmailRecipientResolutionStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EmailRecipientResolutionStatus =
        EmailRecipientResolutionStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: EmailRecipientResolutionStatus): Int = obj.value
  }
}
