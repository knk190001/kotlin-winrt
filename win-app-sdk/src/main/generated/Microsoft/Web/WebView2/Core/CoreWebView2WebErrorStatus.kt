package Microsoft.Web.WebView2.Core

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

@ABIMarker(CoreWebView2WebErrorStatus.ABI::class)
@Signature("enum(Microsoft.Web.WebView2.Core.CoreWebView2WebErrorStatus;i4)")
@WinRTByReference(brClass = CoreWebView2WebErrorStatus.ByReference::class)
public enum class CoreWebView2WebErrorStatus(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  CertificateCommonNameIsIncorrect(1),
  CertificateExpired(2),
  ClientCertificateContainsErrors(3),
  CertificateRevoked(4),
  CertificateIsInvalid(5),
  ServerUnreachable(6),
  Timeout(7),
  ErrorHttpInvalidServerResponse(8),
  ConnectionAborted(9),
  ConnectionReset(10),
  Disconnected(11),
  CannotConnect(12),
  HostNameNotResolved(13),
  OperationCanceled(14),
  RedirectFailed(15),
  UnexpectedError(16),
  ValidAuthenticationCredentialsRequired(17),
  ValidProxyAuthenticationRequired(18),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CoreWebView2WebErrorStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> CertificateCommonNameIsIncorrect
      2 -> CertificateExpired
      3 -> ClientCertificateContainsErrors
      4 -> CertificateRevoked
      5 -> CertificateIsInvalid
      6 -> ServerUnreachable
      7 -> Timeout
      8 -> ErrorHttpInvalidServerResponse
      9 -> ConnectionAborted
      10 -> ConnectionReset
      11 -> Disconnected
      12 -> CannotConnect
      13 -> HostNameNotResolved
      14 -> OperationCanceled
      15 -> RedirectFailed
      16 -> UnexpectedError
      17 -> ValidAuthenticationCredentialsRequired
      18 -> ValidProxyAuthenticationRequired
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CoreWebView2WebErrorStatus> {
    public fun setValue(newValue: CoreWebView2WebErrorStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CoreWebView2WebErrorStatus =
        CoreWebView2WebErrorStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CoreWebView2WebErrorStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CoreWebView2WebErrorStatus =
        CoreWebView2WebErrorStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: CoreWebView2WebErrorStatus): Int = obj.value
  }
}
