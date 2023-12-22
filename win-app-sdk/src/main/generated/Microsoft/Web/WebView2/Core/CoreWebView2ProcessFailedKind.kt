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

@ABIMarker(CoreWebView2ProcessFailedKind.ABI::class)
@Signature("enum(Microsoft.Web.WebView2.Core.CoreWebView2ProcessFailedKind;i4)")
@WinRTByReference(brClass = CoreWebView2ProcessFailedKind.ByReference::class)
public enum class CoreWebView2ProcessFailedKind(
  public val value: Int
) : NativeMapped {
  BrowserProcessExited(0),
  RenderProcessExited(1),
  RenderProcessUnresponsive(2),
  FrameRenderProcessExited(3),
  UtilityProcessExited(4),
  SandboxHelperProcessExited(5),
  GpuProcessExited(6),
  PpapiPluginProcessExited(7),
  PpapiBrokerProcessExited(8),
  UnknownProcessExited(9),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CoreWebView2ProcessFailedKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> BrowserProcessExited
      1 -> RenderProcessExited
      2 -> RenderProcessUnresponsive
      3 -> FrameRenderProcessExited
      4 -> UtilityProcessExited
      5 -> SandboxHelperProcessExited
      6 -> GpuProcessExited
      7 -> PpapiPluginProcessExited
      8 -> PpapiBrokerProcessExited
      9 -> UnknownProcessExited
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CoreWebView2ProcessFailedKind> {
    public fun setValue(newValue: CoreWebView2ProcessFailedKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CoreWebView2ProcessFailedKind =
        CoreWebView2ProcessFailedKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CoreWebView2ProcessFailedKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CoreWebView2ProcessFailedKind =
        CoreWebView2ProcessFailedKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: CoreWebView2ProcessFailedKind): Int = obj.value
  }
}
