package Windows.UI.Notifications

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

@ABIMarker(ToastDismissalReason.ABI::class)
@Signature("enum(Windows.UI.Notifications.ToastDismissalReason;i4)")
@WinRTByReference(brClass = ToastDismissalReason.ByReference::class)
public enum class ToastDismissalReason(
  public val value: Int
) : NativeMapped {
  UserCanceled(0),
  ApplicationHidden(1),
  TimedOut(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ToastDismissalReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> UserCanceled
      1 -> ApplicationHidden
      2 -> TimedOut
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ToastDismissalReason> {
    public fun setValue(newValue: ToastDismissalReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ToastDismissalReason =
        ToastDismissalReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ToastDismissalReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ToastDismissalReason =
        ToastDismissalReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: ToastDismissalReason): Int = obj.value
  }
}
