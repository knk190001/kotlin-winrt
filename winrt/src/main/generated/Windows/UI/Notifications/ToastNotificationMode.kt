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

@ABIMarker(ToastNotificationMode.ABI::class)
@Signature("enum(Windows.UI.Notifications.ToastNotificationMode;i4)")
@WinRTByReference(brClass = ToastNotificationMode.ByReference::class)
public enum class ToastNotificationMode(
  public val value: Int
) : NativeMapped {
  Unrestricted(0),
  PriorityOnly(1),
  AlarmsOnly(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ToastNotificationMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unrestricted
      1 -> PriorityOnly
      2 -> AlarmsOnly
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ToastNotificationMode> {
    public fun setValue(newValue: ToastNotificationMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ToastNotificationMode =
        ToastNotificationMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ToastNotificationMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ToastNotificationMode =
        ToastNotificationMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: ToastNotificationMode): Int = obj.value
  }
}
