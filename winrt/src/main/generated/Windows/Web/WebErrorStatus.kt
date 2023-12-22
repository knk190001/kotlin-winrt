package Windows.Web

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

@ABIMarker(WebErrorStatus.ABI::class)
@Signature("enum(Windows.Web.WebErrorStatus;i4)")
@WinRTByReference(brClass = WebErrorStatus.ByReference::class)
public enum class WebErrorStatus(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  CertificateCommonNameIsIncorrect(1),
  CertificateExpired(2),
  CertificateContainsErrors(3),
  CertificateRevoked(4),
  CertificateIsInvalid(5),
  ServerUnreachable(6),
  Timeout(7),
  ErrorHttpInvalidServerResponse(8),
  ConnectionAborted(9),
  ConnectionReset(10),
  Disconnected(11),
  HttpToHttpsOnRedirection(12),
  HttpsToHttpOnRedirection(13),
  CannotConnect(14),
  HostNameNotResolved(15),
  OperationCanceled(16),
  RedirectFailed(17),
  UnexpectedStatusCode(18),
  UnexpectedRedirection(19),
  UnexpectedClientError(20),
  UnexpectedServerError(21),
  InsufficientRangeSupport(22),
  MissingContentLengthSupport(23),
  MultipleChoices(300),
  MovedPermanently(301),
  Found(302),
  SeeOther(303),
  NotModified(304),
  UseProxy(305),
  TemporaryRedirect(307),
  BadRequest(400),
  Unauthorized(401),
  PaymentRequired(402),
  Forbidden(403),
  NotFound(404),
  MethodNotAllowed(405),
  NotAcceptable(406),
  ProxyAuthenticationRequired(407),
  RequestTimeout(408),
  Conflict(409),
  Gone(410),
  LengthRequired(411),
  PreconditionFailed(412),
  RequestEntityTooLarge(413),
  RequestUriTooLong(414),
  UnsupportedMediaType(415),
  RequestedRangeNotSatisfiable(416),
  ExpectationFailed(417),
  InternalServerError(500),
  NotImplemented(501),
  BadGateway(502),
  ServiceUnavailable(503),
  GatewayTimeout(504),
  HttpVersionNotSupported(505),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WebErrorStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> CertificateCommonNameIsIncorrect
      2 -> CertificateExpired
      3 -> CertificateContainsErrors
      4 -> CertificateRevoked
      5 -> CertificateIsInvalid
      6 -> ServerUnreachable
      7 -> Timeout
      8 -> ErrorHttpInvalidServerResponse
      9 -> ConnectionAborted
      10 -> ConnectionReset
      11 -> Disconnected
      12 -> HttpToHttpsOnRedirection
      13 -> HttpsToHttpOnRedirection
      14 -> CannotConnect
      15 -> HostNameNotResolved
      16 -> OperationCanceled
      17 -> RedirectFailed
      18 -> UnexpectedStatusCode
      19 -> UnexpectedRedirection
      20 -> UnexpectedClientError
      21 -> UnexpectedServerError
      22 -> InsufficientRangeSupport
      23 -> MissingContentLengthSupport
      300 -> MultipleChoices
      301 -> MovedPermanently
      302 -> Found
      303 -> SeeOther
      304 -> NotModified
      305 -> UseProxy
      307 -> TemporaryRedirect
      400 -> BadRequest
      401 -> Unauthorized
      402 -> PaymentRequired
      403 -> Forbidden
      404 -> NotFound
      405 -> MethodNotAllowed
      406 -> NotAcceptable
      407 -> ProxyAuthenticationRequired
      408 -> RequestTimeout
      409 -> Conflict
      410 -> Gone
      411 -> LengthRequired
      412 -> PreconditionFailed
      413 -> RequestEntityTooLarge
      414 -> RequestUriTooLong
      415 -> UnsupportedMediaType
      416 -> RequestedRangeNotSatisfiable
      417 -> ExpectationFailed
      500 -> InternalServerError
      501 -> NotImplemented
      502 -> BadGateway
      503 -> ServiceUnavailable
      504 -> GatewayTimeout
      505 -> HttpVersionNotSupported
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<WebErrorStatus> {
    public fun setValue(newValue: WebErrorStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WebErrorStatus =
        WebErrorStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WebErrorStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WebErrorStatus =
        WebErrorStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: WebErrorStatus): Int = obj.value
  }
}
