package Windows.Web.UI.Interop

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

@ABIMarker(WebViewControlAcceleratorKeyRoutingStage.ABI::class)
@Signature("enum(Windows.Web.UI.Interop.WebViewControlAcceleratorKeyRoutingStage;i4)")
@WinRTByReference(brClass = WebViewControlAcceleratorKeyRoutingStage.ByReference::class)
public enum class WebViewControlAcceleratorKeyRoutingStage(
  public val value: Int
) : NativeMapped {
  Tunneling(0),
  Bubbling(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WebViewControlAcceleratorKeyRoutingStage {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Tunneling
      1 -> Bubbling
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<WebViewControlAcceleratorKeyRoutingStage> {
    public fun setValue(newValue: WebViewControlAcceleratorKeyRoutingStage): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WebViewControlAcceleratorKeyRoutingStage =
        WebViewControlAcceleratorKeyRoutingStage.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<WebViewControlAcceleratorKeyRoutingStage, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WebViewControlAcceleratorKeyRoutingStage =
        WebViewControlAcceleratorKeyRoutingStage.values()[0].fromNative(value, null)

    public override fun toNative(obj: WebViewControlAcceleratorKeyRoutingStage): Int = obj.value
  }
}
