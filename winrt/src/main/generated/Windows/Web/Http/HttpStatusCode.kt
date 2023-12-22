package Windows.Web.Http

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

@ABIMarker(HttpStatusCode.ABI::class)
@Signature("enum(Windows.Web.Http.HttpStatusCode;i4)")
@WinRTByReference(brClass = HttpStatusCode.ByReference::class)
public enum class HttpStatusCode(
  public val value: Int
) : NativeMapped {
  None(0),
  Continue(100),
  SwitchingProtocols(101),
  Processing(102),
  Ok(200),
  Created(201),
  Accepted(202),
  NonAuthoritativeInformation(203),
  NoContent(204),
  ResetContent(205),
  PartialContent(206),
  MultiStatus(207),
  AlreadyReported(208),
  IMUsed(226),
  MultipleChoices(300),
  MovedPermanently(301),
  Found(302),
  SeeOther(303),
  NotModified(304),
  UseProxy(305),
  TemporaryRedirect(307),
  PermanentRedirect(308),
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
  UnprocessableEntity(422),
  Locked(423),
  FailedDependency(424),
  UpgradeRequired(426),
  PreconditionRequired(428),
  TooManyRequests(429),
  RequestHeaderFieldsTooLarge(431),
  InternalServerError(500),
  NotImplemented(501),
  BadGateway(502),
  ServiceUnavailable(503),
  GatewayTimeout(504),
  HttpVersionNotSupported(505),
  VariantAlsoNegotiates(506),
  InsufficientStorage(507),
  LoopDetected(508),
  NotExtended(510),
  NetworkAuthenticationRequired(511),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      HttpStatusCode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      100 -> Continue
      101 -> SwitchingProtocols
      102 -> Processing
      200 -> Ok
      201 -> Created
      202 -> Accepted
      203 -> NonAuthoritativeInformation
      204 -> NoContent
      205 -> ResetContent
      206 -> PartialContent
      207 -> MultiStatus
      208 -> AlreadyReported
      226 -> IMUsed
      300 -> MultipleChoices
      301 -> MovedPermanently
      302 -> Found
      303 -> SeeOther
      304 -> NotModified
      305 -> UseProxy
      307 -> TemporaryRedirect
      308 -> PermanentRedirect
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
      422 -> UnprocessableEntity
      423 -> Locked
      424 -> FailedDependency
      426 -> UpgradeRequired
      428 -> PreconditionRequired
      429 -> TooManyRequests
      431 -> RequestHeaderFieldsTooLarge
      500 -> InternalServerError
      501 -> NotImplemented
      502 -> BadGateway
      503 -> ServiceUnavailable
      504 -> GatewayTimeout
      505 -> HttpVersionNotSupported
      506 -> VariantAlsoNegotiates
      507 -> InsufficientStorage
      508 -> LoopDetected
      510 -> NotExtended
      511 -> NetworkAuthenticationRequired
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<HttpStatusCode> {
    public fun setValue(newValue: HttpStatusCode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): HttpStatusCode =
        HttpStatusCode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<HttpStatusCode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): HttpStatusCode =
        HttpStatusCode.values()[0].fromNative(value, null)

    public override fun toNative(obj: HttpStatusCode): Int = obj.value
  }
}
