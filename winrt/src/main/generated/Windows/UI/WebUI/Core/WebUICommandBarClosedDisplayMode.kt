package Windows.UI.WebUI.Core

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

@ABIMarker(WebUICommandBarClosedDisplayMode.ABI::class)
@Signature("enum(Windows.UI.WebUI.Core.WebUICommandBarClosedDisplayMode;i4)")
@WinRTByReference(brClass = WebUICommandBarClosedDisplayMode.ByReference::class)
public enum class WebUICommandBarClosedDisplayMode(
  public val value: Int
) : NativeMapped {
  Default(0),
  Minimal(1),
  Compact(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WebUICommandBarClosedDisplayMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> Minimal
      2 -> Compact
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<WebUICommandBarClosedDisplayMode> {
    public fun setValue(newValue: WebUICommandBarClosedDisplayMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WebUICommandBarClosedDisplayMode =
        WebUICommandBarClosedDisplayMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WebUICommandBarClosedDisplayMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WebUICommandBarClosedDisplayMode =
        WebUICommandBarClosedDisplayMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: WebUICommandBarClosedDisplayMode): Int = obj.value
  }
}
