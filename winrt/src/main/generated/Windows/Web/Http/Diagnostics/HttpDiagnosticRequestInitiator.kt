package Windows.Web.Http.Diagnostics

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

@ABIMarker(HttpDiagnosticRequestInitiator.ABI::class)
@Signature("enum(Windows.Web.Http.Diagnostics.HttpDiagnosticRequestInitiator;i4)")
@WinRTByReference(brClass = HttpDiagnosticRequestInitiator.ByReference::class)
public enum class HttpDiagnosticRequestInitiator(
  public val value: Int
) : NativeMapped {
  ParsedElement(0),
  Script(1),
  Image(2),
  Link(3),
  Style(4),
  XmlHttpRequest(5),
  Media(6),
  HtmlDownload(7),
  Prefetch(8),
  Other(9),
  CrossOriginPreFlight(10),
  Fetch(11),
  Beacon(12),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      HttpDiagnosticRequestInitiator {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> ParsedElement
      1 -> Script
      2 -> Image
      3 -> Link
      4 -> Style
      5 -> XmlHttpRequest
      6 -> Media
      7 -> HtmlDownload
      8 -> Prefetch
      9 -> Other
      10 -> CrossOriginPreFlight
      11 -> Fetch
      12 -> Beacon
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<HttpDiagnosticRequestInitiator> {
    public fun setValue(newValue: HttpDiagnosticRequestInitiator): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): HttpDiagnosticRequestInitiator =
        HttpDiagnosticRequestInitiator.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<HttpDiagnosticRequestInitiator, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): HttpDiagnosticRequestInitiator =
        HttpDiagnosticRequestInitiator.values()[0].fromNative(value, null)

    public override fun toNative(obj: HttpDiagnosticRequestInitiator): Int = obj.value
  }
}
