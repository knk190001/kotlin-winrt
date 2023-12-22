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

@ABIMarker(CoreWebView2ProcessKind.ABI::class)
@Signature("enum(Microsoft.Web.WebView2.Core.CoreWebView2ProcessKind;i4)")
@WinRTByReference(brClass = CoreWebView2ProcessKind.ByReference::class)
public enum class CoreWebView2ProcessKind(
  public val value: Int
) : NativeMapped {
  Browser(0),
  Renderer(1),
  Utility(2),
  SandboxHelper(3),
  Gpu(4),
  PpapiPlugin(5),
  PpapiBroker(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CoreWebView2ProcessKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Browser
      1 -> Renderer
      2 -> Utility
      3 -> SandboxHelper
      4 -> Gpu
      5 -> PpapiPlugin
      6 -> PpapiBroker
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CoreWebView2ProcessKind> {
    public fun setValue(newValue: CoreWebView2ProcessKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CoreWebView2ProcessKind =
        CoreWebView2ProcessKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CoreWebView2ProcessKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CoreWebView2ProcessKind =
        CoreWebView2ProcessKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: CoreWebView2ProcessKind): Int = obj.value
  }
}
