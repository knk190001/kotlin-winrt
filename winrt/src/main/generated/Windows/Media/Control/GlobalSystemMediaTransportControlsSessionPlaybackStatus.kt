package Windows.Media.Control

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

@ABIMarker(GlobalSystemMediaTransportControlsSessionPlaybackStatus.ABI::class)
@Signature("enum(Windows.Media.Control.GlobalSystemMediaTransportControlsSessionPlaybackStatus;i4)")
@WinRTByReference(brClass =
    GlobalSystemMediaTransportControlsSessionPlaybackStatus.ByReference::class)
public enum class GlobalSystemMediaTransportControlsSessionPlaybackStatus(
  public val value: Int
) : NativeMapped {
  Closed(0),
  Opened(1),
  Changing(2),
  Stopped(3),
  Playing(4),
  Paused(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GlobalSystemMediaTransportControlsSessionPlaybackStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Closed
      1 -> Opened
      2 -> Changing
      3 -> Stopped
      4 -> Playing
      5 -> Paused
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<GlobalSystemMediaTransportControlsSessionPlaybackStatus> {
    public fun setValue(newValue: GlobalSystemMediaTransportControlsSessionPlaybackStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GlobalSystemMediaTransportControlsSessionPlaybackStatus =
        GlobalSystemMediaTransportControlsSessionPlaybackStatus.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<GlobalSystemMediaTransportControlsSessionPlaybackStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int):
        GlobalSystemMediaTransportControlsSessionPlaybackStatus =
        GlobalSystemMediaTransportControlsSessionPlaybackStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: GlobalSystemMediaTransportControlsSessionPlaybackStatus): Int
        = obj.value
  }
}
