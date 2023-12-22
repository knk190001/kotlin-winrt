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

@ABIMarker(CoreWebView2PrintColorMode.ABI::class)
@Signature("enum(Microsoft.Web.WebView2.Core.CoreWebView2PrintColorMode;i4)")
@WinRTByReference(brClass = CoreWebView2PrintColorMode.ByReference::class)
public enum class CoreWebView2PrintColorMode(
  public val value: Int
) : NativeMapped {
  Default(0),
  Color(1),
  Grayscale(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CoreWebView2PrintColorMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> Color
      2 -> Grayscale
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CoreWebView2PrintColorMode> {
    public fun setValue(newValue: CoreWebView2PrintColorMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CoreWebView2PrintColorMode =
        CoreWebView2PrintColorMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CoreWebView2PrintColorMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CoreWebView2PrintColorMode =
        CoreWebView2PrintColorMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: CoreWebView2PrintColorMode): Int = obj.value
  }
}
