package Windows.Media.Capture

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

@ABIMarker(GameBarCommand.ABI::class)
@Signature("enum(Windows.Media.Capture.GameBarCommand;i4)")
@WinRTByReference(brClass = GameBarCommand.ByReference::class)
public enum class GameBarCommand(
  public val value: Int
) : NativeMapped {
  OpenGameBar(0),
  RecordHistoricalBuffer(1),
  ToggleStartStopRecord(2),
  StartRecord(3),
  StopRecord(4),
  TakeScreenshot(5),
  StartBroadcast(6),
  StopBroadcast(7),
  PauseBroadcast(8),
  ResumeBroadcast(9),
  ToggleStartStopBroadcast(10),
  ToggleMicrophoneCapture(11),
  ToggleCameraCapture(12),
  ToggleRecordingIndicator(13),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GameBarCommand {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> OpenGameBar
      1 -> RecordHistoricalBuffer
      2 -> ToggleStartStopRecord
      3 -> StartRecord
      4 -> StopRecord
      5 -> TakeScreenshot
      6 -> StartBroadcast
      7 -> StopBroadcast
      8 -> PauseBroadcast
      9 -> ResumeBroadcast
      10 -> ToggleStartStopBroadcast
      11 -> ToggleMicrophoneCapture
      12 -> ToggleCameraCapture
      13 -> ToggleRecordingIndicator
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<GameBarCommand> {
    public fun setValue(newValue: GameBarCommand): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GameBarCommand =
        GameBarCommand.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GameBarCommand, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GameBarCommand =
        GameBarCommand.values()[0].fromNative(value, null)

    public override fun toNative(obj: GameBarCommand): Int = obj.value
  }
}
