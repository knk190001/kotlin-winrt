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

@ABIMarker(CoreWebView2CookieSameSiteKind.ABI::class)
@Signature("enum(Microsoft.Web.WebView2.Core.CoreWebView2CookieSameSiteKind;i4)")
@WinRTByReference(brClass = CoreWebView2CookieSameSiteKind.ByReference::class)
public enum class CoreWebView2CookieSameSiteKind(
  public val value: Int
) : NativeMapped {
  None(0),
  Lax(1),
  Strict(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CoreWebView2CookieSameSiteKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Lax
      2 -> Strict
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CoreWebView2CookieSameSiteKind> {
    public fun setValue(newValue: CoreWebView2CookieSameSiteKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CoreWebView2CookieSameSiteKind =
        CoreWebView2CookieSameSiteKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CoreWebView2CookieSameSiteKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CoreWebView2CookieSameSiteKind =
        CoreWebView2CookieSameSiteKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: CoreWebView2CookieSameSiteKind): Int = obj.value
  }
}
