package Windows.Networking.NetworkOperators

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

@ABIMarker(ESimOperationStatus.ABI::class)
@Signature("enum(Windows.Networking.NetworkOperators.ESimOperationStatus;i4)")
@WinRTByReference(brClass = ESimOperationStatus.ByReference::class)
public enum class ESimOperationStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  NotAuthorized(1),
  NotFound(2),
  PolicyViolation(3),
  InsufficientSpaceOnCard(4),
  ServerFailure(5),
  ServerNotReachable(6),
  TimeoutWaitingForUserConsent(7),
  IncorrectConfirmationCode(8),
  ConfirmationCodeMaxRetriesExceeded(9),
  CardRemoved(10),
  CardBusy(11),
  Other(12),
  CardGeneralFailure(13),
  ConfirmationCodeMissing(14),
  InvalidMatchingId(15),
  NoEligibleProfileForThisDevice(16),
  OperationAborted(17),
  EidMismatch(18),
  ProfileNotAvailableForNewBinding(19),
  ProfileNotReleasedByOperator(20),
  OperationProhibitedByProfileClass(21),
  ProfileNotPresent(22),
  NoCorrespondingRequest(23),
  TimeoutWaitingForResponse(24),
  IccidAlreadyExists(25),
  ProfileProcessingError(26),
  ServerNotTrusted(27),
  ProfileDownloadMaxRetriesExceeded(28),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ESimOperationStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> NotAuthorized
      2 -> NotFound
      3 -> PolicyViolation
      4 -> InsufficientSpaceOnCard
      5 -> ServerFailure
      6 -> ServerNotReachable
      7 -> TimeoutWaitingForUserConsent
      8 -> IncorrectConfirmationCode
      9 -> ConfirmationCodeMaxRetriesExceeded
      10 -> CardRemoved
      11 -> CardBusy
      12 -> Other
      13 -> CardGeneralFailure
      14 -> ConfirmationCodeMissing
      15 -> InvalidMatchingId
      16 -> NoEligibleProfileForThisDevice
      17 -> OperationAborted
      18 -> EidMismatch
      19 -> ProfileNotAvailableForNewBinding
      20 -> ProfileNotReleasedByOperator
      21 -> OperationProhibitedByProfileClass
      22 -> ProfileNotPresent
      23 -> NoCorrespondingRequest
      24 -> TimeoutWaitingForResponse
      25 -> IccidAlreadyExists
      26 -> ProfileProcessingError
      27 -> ServerNotTrusted
      28 -> ProfileDownloadMaxRetriesExceeded
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ESimOperationStatus> {
    public fun setValue(newValue: ESimOperationStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ESimOperationStatus =
        ESimOperationStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ESimOperationStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ESimOperationStatus =
        ESimOperationStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: ESimOperationStatus): Int = obj.value
  }
}
