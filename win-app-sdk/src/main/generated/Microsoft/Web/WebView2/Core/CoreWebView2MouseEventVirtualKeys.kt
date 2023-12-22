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

@ABIMarker(CoreWebView2MouseEventVirtualKeys.ABI::class)
@Signature("enum(Microsoft.Web.WebView2.Core.CoreWebView2MouseEventVirtualKeys;u4)")
@WinRTByReference(brClass = CoreWebView2MouseEventVirtualKeys.ByReference::class)
public enum class CoreWebView2MouseEventVirtualKeys(
  public val value: Int
) : NativeMapped {
  None(0),
  LeftButton(1),
  RightButton(2),
  Shift(4),
  Control(8),
  MiddleButton(16),
  XButton1(32),
  XButton2(64),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CoreWebView2MouseEventVirtualKeys {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> LeftButton
      2 -> RightButton
      4 -> Shift
      8 -> Control
      16 -> MiddleButton
      32 -> XButton1
      64 -> XButton2
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CoreWebView2MouseEventVirtualKeys> {
    public fun setValue(newValue: CoreWebView2MouseEventVirtualKeys): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CoreWebView2MouseEventVirtualKeys =
        CoreWebView2MouseEventVirtualKeys.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CoreWebView2MouseEventVirtualKeys, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CoreWebView2MouseEventVirtualKeys =
        CoreWebView2MouseEventVirtualKeys.values()[0].fromNative(value, null)

    public override fun toNative(obj: CoreWebView2MouseEventVirtualKeys): Int = obj.value
  }
}
