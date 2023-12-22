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

@ABIMarker(PlaybackStatus.ABI::class)
@Signature("enum(Windows.Phone.Notification.Management.PlaybackStatus;i4)")
@WinRTByReference(brClass = PlaybackStatus.ByReference::class)
public enum class PlaybackStatus(
  public val value: Int
) : NativeMapped {
  None(0),
  TrackChanged(1),
  Stopped(2),
  Playing(3),
  Paused(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PlaybackStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> TrackChanged
      2 -> Stopped
      3 -> Playing
      4 -> Paused
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PlaybackStatus> {
    public fun setValue(newValue: PlaybackStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PlaybackStatus =
        PlaybackStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PlaybackStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PlaybackStatus =
        PlaybackStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: PlaybackStatus): Int = obj.value
  }
}
