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

@ABIMarker(NotificationKinds.ABI::class)
@Signature("enum(Windows.UI.Notifications.NotificationKinds;u4)")
@WinRTByReference(brClass = NotificationKinds.ByReference::class)
public enum class NotificationKinds(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Toast(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      NotificationKinds {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Toast
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<NotificationKinds> {
    public fun setValue(newValue: NotificationKinds): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): NotificationKinds =
        NotificationKinds.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<NotificationKinds, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): NotificationKinds =
        NotificationKinds.values()[0].fromNative(value, null)

    public override fun toNative(obj: NotificationKinds): Int = obj.value
  }
}
