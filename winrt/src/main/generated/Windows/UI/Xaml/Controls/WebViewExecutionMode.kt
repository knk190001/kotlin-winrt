package Windows.UI.Xaml.Controls

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

@ABIMarker(WebViewExecutionMode.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.WebViewExecutionMode;i4)")
@WinRTByReference(brClass = WebViewExecutionMode.ByReference::class)
public enum class WebViewExecutionMode(
  public val value: Int
) : NativeMapped {
  SameThread(0),
  SeparateThread(1),
  SeparateProcess(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WebViewExecutionMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> SameThread
      1 -> SeparateThread
      2 -> SeparateProcess
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<WebViewExecutionMode> {
    public fun setValue(newValue: WebViewExecutionMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WebViewExecutionMode =
        WebViewExecutionMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WebViewExecutionMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WebViewExecutionMode =
        WebViewExecutionMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: WebViewExecutionMode): Int = obj.value
  }
}
