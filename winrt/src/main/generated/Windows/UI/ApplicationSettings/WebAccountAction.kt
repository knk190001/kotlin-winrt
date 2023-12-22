package Windows.UI.ApplicationSettings

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

@ABIMarker(WebAccountAction.ABI::class)
@Signature("enum(Windows.UI.ApplicationSettings.WebAccountAction;i4)")
@WinRTByReference(brClass = WebAccountAction.ByReference::class)
public enum class WebAccountAction(
  public val value: Int
) : NativeMapped {
  Reconnect(0),
  Remove(1),
  ViewDetails(2),
  Manage(3),
  More(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WebAccountAction {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Reconnect
      1 -> Remove
      2 -> ViewDetails
      3 -> Manage
      4 -> More
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<WebAccountAction> {
    public fun setValue(newValue: WebAccountAction): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WebAccountAction =
        WebAccountAction.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WebAccountAction, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WebAccountAction =
        WebAccountAction.values()[0].fromNative(value, null)

    public override fun toNative(obj: WebAccountAction): Int = obj.value
  }
}
