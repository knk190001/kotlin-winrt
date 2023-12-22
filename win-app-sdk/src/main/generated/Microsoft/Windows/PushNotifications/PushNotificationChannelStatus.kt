package Microsoft.Windows.PushNotifications

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

@ABIMarker(PushNotificationChannelStatus.ABI::class)
@Signature("enum(Microsoft.Windows.PushNotifications.PushNotificationChannelStatus;i4)")
@WinRTByReference(brClass = PushNotificationChannelStatus.ByReference::class)
public enum class PushNotificationChannelStatus(
  public val value: Int
) : NativeMapped {
  InProgress(0),
  InProgressRetry(1),
  CompletedSuccess(2),
  CompletedFailure(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PushNotificationChannelStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> InProgress
      1 -> InProgressRetry
      2 -> CompletedSuccess
      3 -> CompletedFailure
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PushNotificationChannelStatus> {
    public fun setValue(newValue: PushNotificationChannelStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PushNotificationChannelStatus =
        PushNotificationChannelStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PushNotificationChannelStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PushNotificationChannelStatus =
        PushNotificationChannelStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: PushNotificationChannelStatus): Int = obj.value
  }
}
