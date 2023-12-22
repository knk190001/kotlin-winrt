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

@ABIMarker(CoreWebView2WebResourceContext.ABI::class)
@Signature("enum(Microsoft.Web.WebView2.Core.CoreWebView2WebResourceContext;i4)")
@WinRTByReference(brClass = CoreWebView2WebResourceContext.ByReference::class)
public enum class CoreWebView2WebResourceContext(
  public val value: Int
) : NativeMapped {
  All(0),
  Document(1),
  Stylesheet(2),
  Image(3),
  Media(4),
  Font(5),
  Script(6),
  XmlHttpRequest(7),
  Fetch(8),
  TextTrack(9),
  EventSource(10),
  Websocket(11),
  Manifest(12),
  SignedExchange(13),
  Ping(14),
  CspViolationReport(15),
  Other(16),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CoreWebView2WebResourceContext {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> All
      1 -> Document
      2 -> Stylesheet
      3 -> Image
      4 -> Media
      5 -> Font
      6 -> Script
      7 -> XmlHttpRequest
      8 -> Fetch
      9 -> TextTrack
      10 -> EventSource
      11 -> Websocket
      12 -> Manifest
      13 -> SignedExchange
      14 -> Ping
      15 -> CspViolationReport
      16 -> Other
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CoreWebView2WebResourceContext> {
    public fun setValue(newValue: CoreWebView2WebResourceContext): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CoreWebView2WebResourceContext =
        CoreWebView2WebResourceContext.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CoreWebView2WebResourceContext, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CoreWebView2WebResourceContext =
        CoreWebView2WebResourceContext.values()[0].fromNative(value, null)

    public override fun toNative(obj: CoreWebView2WebResourceContext): Int = obj.value
  }
}
