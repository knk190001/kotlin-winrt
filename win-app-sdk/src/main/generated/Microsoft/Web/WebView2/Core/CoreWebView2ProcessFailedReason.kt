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

@ABIMarker(CoreWebView2ProcessFailedReason.ABI::class)
@Signature("enum(Microsoft.Web.WebView2.Core.CoreWebView2ProcessFailedReason;i4)")
@WinRTByReference(brClass = CoreWebView2ProcessFailedReason.ByReference::class)
public enum class CoreWebView2ProcessFailedReason(
  public val value: Int
) : NativeMapped {
  Unexpected(0),
  Unresponsive(1),
  Terminated(2),
  Crashed(3),
  LaunchFailed(4),
  OutOfMemory(5),
  ProfileDeleted(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CoreWebView2ProcessFailedReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unexpected
      1 -> Unresponsive
      2 -> Terminated
      3 -> Crashed
      4 -> LaunchFailed
      5 -> OutOfMemory
      6 -> ProfileDeleted
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CoreWebView2ProcessFailedReason> {
    public fun setValue(newValue: CoreWebView2ProcessFailedReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CoreWebView2ProcessFailedReason =
        CoreWebView2ProcessFailedReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CoreWebView2ProcessFailedReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CoreWebView2ProcessFailedReason =
        CoreWebView2ProcessFailedReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: CoreWebView2ProcessFailedReason): Int = obj.value
  }
}
