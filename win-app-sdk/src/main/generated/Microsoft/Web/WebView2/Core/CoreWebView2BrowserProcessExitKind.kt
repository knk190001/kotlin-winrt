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

@ABIMarker(CoreWebView2BrowserProcessExitKind.ABI::class)
@Signature("enum(Microsoft.Web.WebView2.Core.CoreWebView2BrowserProcessExitKind;i4)")
@WinRTByReference(brClass = CoreWebView2BrowserProcessExitKind.ByReference::class)
public enum class CoreWebView2BrowserProcessExitKind(
  public val value: Int
) : NativeMapped {
  Normal(0),
  Failed(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CoreWebView2BrowserProcessExitKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Normal
      1 -> Failed
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CoreWebView2BrowserProcessExitKind> {
    public fun setValue(newValue: CoreWebView2BrowserProcessExitKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CoreWebView2BrowserProcessExitKind =
        CoreWebView2BrowserProcessExitKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CoreWebView2BrowserProcessExitKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CoreWebView2BrowserProcessExitKind =
        CoreWebView2BrowserProcessExitKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: CoreWebView2BrowserProcessExitKind): Int = obj.value
  }
}
