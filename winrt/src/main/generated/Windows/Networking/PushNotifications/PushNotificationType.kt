package Windows.Networking.PushNotifications

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

@ABIMarker(PushNotificationType.ABI::class)
@Signature("enum(Windows.Networking.PushNotifications.PushNotificationType;i4)")
@WinRTByReference(brClass = PushNotificationType.ByReference::class)
public enum class PushNotificationType(
  public val value: Int
) : NativeMapped {
  Toast(0),
  Tile(1),
  Badge(2),
  Raw(3),
  TileFlyout(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PushNotificationType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Toast
      1 -> Tile
      2 -> Badge
      3 -> Raw
      4 -> TileFlyout
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PushNotificationType> {
    public fun setValue(newValue: PushNotificationType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PushNotificationType =
        PushNotificationType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PushNotificationType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PushNotificationType =
        PushNotificationType.values()[0].fromNative(value, null)

    public override fun toNative(obj: PushNotificationType): Int = obj.value
  }
}
