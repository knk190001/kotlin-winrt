package Windows.Media

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

@ABIMarker(MediaTimelineControllerState.ABI::class)
@Signature("enum(Windows.Media.MediaTimelineControllerState;i4)")
@WinRTByReference(brClass = MediaTimelineControllerState.ByReference::class)
public enum class MediaTimelineControllerState(
  public val value: Int
) : NativeMapped {
  Paused(0),
  Running(1),
  Stalled(2),
  Error(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MediaTimelineControllerState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Paused
      1 -> Running
      2 -> Stalled
      3 -> Error
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<MediaTimelineControllerState> {
    public fun setValue(newValue: MediaTimelineControllerState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MediaTimelineControllerState =
        MediaTimelineControllerState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MediaTimelineControllerState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MediaTimelineControllerState =
        MediaTimelineControllerState.values()[0].fromNative(value, null)

    public override fun toNative(obj: MediaTimelineControllerState): Int = obj.value
  }
}
