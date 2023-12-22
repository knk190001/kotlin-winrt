package Windows.Web.UI

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

@ABIMarker(WebViewControlPermissionState.ABI::class)
@Signature("enum(Windows.Web.UI.WebViewControlPermissionState;i4)")
@WinRTByReference(brClass = WebViewControlPermissionState.ByReference::class)
public enum class WebViewControlPermissionState(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Defer(1),
  Allow(2),
  Deny(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WebViewControlPermissionState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Defer
      2 -> Allow
      3 -> Deny
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<WebViewControlPermissionState> {
    public fun setValue(newValue: WebViewControlPermissionState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WebViewControlPermissionState =
        WebViewControlPermissionState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WebViewControlPermissionState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WebViewControlPermissionState =
        WebViewControlPermissionState.values()[0].fromNative(value, null)

    public override fun toNative(obj: WebViewControlPermissionState): Int = obj.value
  }
}
