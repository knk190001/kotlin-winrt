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

@ABIMarker(PlaybackCommand.ABI::class)
@Signature("enum(Windows.Phone.Notification.Management.PlaybackCommand;i4)")
@WinRTByReference(brClass = PlaybackCommand.ByReference::class)
public enum class PlaybackCommand(
  public val value: Int
) : NativeMapped {
  Play(0),
  Pause(1),
  Stop(2),
  Record(3),
  FastForward(4),
  Rewind(5),
  Next(6),
  Previous(7),
  ChannelUp(8),
  ChannelDown(9),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PlaybackCommand {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Play
      1 -> Pause
      2 -> Stop
      3 -> Record
      4 -> FastForward
      5 -> Rewind
      6 -> Next
      7 -> Previous
      8 -> ChannelUp
      9 -> ChannelDown
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PlaybackCommand> {
    public fun setValue(newValue: PlaybackCommand): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PlaybackCommand =
        PlaybackCommand.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PlaybackCommand, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PlaybackCommand =
        PlaybackCommand.values()[0].fromNative(value, null)

    public override fun toNative(obj: PlaybackCommand): Int = obj.value
  }
}
