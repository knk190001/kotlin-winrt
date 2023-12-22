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

@ABIMarker(CoreWebView2DownloadInterruptReason.ABI::class)
@Signature("enum(Microsoft.Web.WebView2.Core.CoreWebView2DownloadInterruptReason;i4)")
@WinRTByReference(brClass = CoreWebView2DownloadInterruptReason.ByReference::class)
public enum class CoreWebView2DownloadInterruptReason(
  public val value: Int
) : NativeMapped {
  None(0),
  FileFailed(1),
  FileAccessDenied(2),
  FileNoSpace(3),
  FileNameTooLong(4),
  FileTooLarge(5),
  FileMalicious(6),
  FileTransientError(7),
  FileBlockedByPolicy(8),
  FileSecurityCheckFailed(9),
  FileTooShort(10),
  FileHashMismatch(11),
  NetworkFailed(12),
  NetworkTimeout(13),
  NetworkDisconnected(14),
  NetworkServerDown(15),
  NetworkInvalidRequest(16),
  ServerFailed(17),
  ServerNoRange(18),
  ServerBadContent(19),
  ServerUnauthorized(20),
  ServerCertificateProblem(21),
  ServerForbidden(22),
  ServerUnexpectedResponse(23),
  ServerContentLengthMismatch(24),
  ServerCrossOriginRedirect(25),
  UserCanceled(26),
  UserShutdown(27),
  UserPaused(28),
  DownloadProcessCrashed(29),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CoreWebView2DownloadInterruptReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> FileFailed
      2 -> FileAccessDenied
      3 -> FileNoSpace
      4 -> FileNameTooLong
      5 -> FileTooLarge
      6 -> FileMalicious
      7 -> FileTransientError
      8 -> FileBlockedByPolicy
      9 -> FileSecurityCheckFailed
      10 -> FileTooShort
      11 -> FileHashMismatch
      12 -> NetworkFailed
      13 -> NetworkTimeout
      14 -> NetworkDisconnected
      15 -> NetworkServerDown
      16 -> NetworkInvalidRequest
      17 -> ServerFailed
      18 -> ServerNoRange
      19 -> ServerBadContent
      20 -> ServerUnauthorized
      21 -> ServerCertificateProblem
      22 -> ServerForbidden
      23 -> ServerUnexpectedResponse
      24 -> ServerContentLengthMismatch
      25 -> ServerCrossOriginRedirect
      26 -> UserCanceled
      27 -> UserShutdown
      28 -> UserPaused
      29 -> DownloadProcessCrashed
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CoreWebView2DownloadInterruptReason> {
    public fun setValue(newValue: CoreWebView2DownloadInterruptReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CoreWebView2DownloadInterruptReason =
        CoreWebView2DownloadInterruptReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CoreWebView2DownloadInterruptReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CoreWebView2DownloadInterruptReason =
        CoreWebView2DownloadInterruptReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: CoreWebView2DownloadInterruptReason): Int = obj.value
  }
}
