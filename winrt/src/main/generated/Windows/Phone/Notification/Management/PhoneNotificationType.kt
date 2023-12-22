package Windows.Phone.Notification.Management

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

@ABIMarker(PhoneNotificationType.ABI::class)
@Signature("enum(Windows.Phone.Notification.Management.PhoneNotificationType;i4)")
@WinRTByReference(brClass = PhoneNotificationType.ByReference::class)
public enum class PhoneNotificationType(
  public val value: Int
) : NativeMapped {
  NewCall(0),
  CallChanged(1),
  LineChanged(2),
  PhoneCallAudioEndpointChanged(3),
  PhoneMuteChanged(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhoneNotificationType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NewCall
      1 -> CallChanged
      2 -> LineChanged
      3 -> PhoneCallAudioEndpointChanged
      4 -> PhoneMuteChanged
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PhoneNotificationType> {
    public fun setValue(newValue: PhoneNotificationType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhoneNotificationType =
        PhoneNotificationType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhoneNotificationType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhoneNotificationType =
        PhoneNotificationType.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhoneNotificationType): Int = obj.value
  }
}
