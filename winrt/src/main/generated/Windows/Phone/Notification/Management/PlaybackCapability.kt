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

@ABIMarker(PlaybackCapability.ABI::class)
@Signature("enum(Windows.Phone.Notification.Management.PlaybackCapability;u4)")
@WinRTByReference(brClass = PlaybackCapability.ByReference::class)
public enum class PlaybackCapability(
  public val value: Int
) : NativeMapped {
  None(0),
  Play(1),
  Pause(2),
  Stop(4),
  Record(8),
  FastForward(16),
  Rewind(32),
  Next(64),
  Previous(128),
  ChannelUp(256),
  ChannelDown(512),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PlaybackCapability {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Play
      2 -> Pause
      4 -> Stop
      8 -> Record
      16 -> FastForward
      32 -> Rewind
      64 -> Next
      128 -> Previous
      256 -> ChannelUp
      512 -> ChannelDown
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PlaybackCapability> {
    public fun setValue(newValue: PlaybackCapability): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PlaybackCapability =
        PlaybackCapability.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PlaybackCapability, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PlaybackCapability =
        PlaybackCapability.values()[0].fromNative(value, null)

    public override fun toNative(obj: PlaybackCapability): Int = obj.value
  }
}
