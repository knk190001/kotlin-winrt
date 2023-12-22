package Microsoft.Windows.AppNotifications.Builder

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

@ABIMarker(AppNotificationAudioLooping.ABI::class)
@Signature("enum(Microsoft.Windows.AppNotifications.Builder.AppNotificationAudioLooping;i4)")
@WinRTByReference(brClass = AppNotificationAudioLooping.ByReference::class)
public enum class AppNotificationAudioLooping(
  public val value: Int
) : NativeMapped {
  None(0),
  Loop(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppNotificationAudioLooping {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Loop
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AppNotificationAudioLooping> {
    public fun setValue(newValue: AppNotificationAudioLooping): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppNotificationAudioLooping =
        AppNotificationAudioLooping.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppNotificationAudioLooping, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppNotificationAudioLooping =
        AppNotificationAudioLooping.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppNotificationAudioLooping): Int = obj.value
  }
}
