package Windows.Services.Maps.Guidance

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

@ABIMarker(GuidanceAudioNotifications.ABI::class)
@Signature("enum(Windows.Services.Maps.Guidance.GuidanceAudioNotifications;u4)")
@WinRTByReference(brClass = GuidanceAudioNotifications.ByReference::class)
public enum class GuidanceAudioNotifications(
  public val value: Int
) : NativeMapped {
  None(0),
  Maneuver(1),
  Route(2),
  Gps(4),
  SpeedLimit(8),
  Traffic(16),
  TrafficCamera(32),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GuidanceAudioNotifications {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Maneuver
      2 -> Route
      4 -> Gps
      8 -> SpeedLimit
      16 -> Traffic
      32 -> TrafficCamera
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<GuidanceAudioNotifications> {
    public fun setValue(newValue: GuidanceAudioNotifications): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GuidanceAudioNotifications =
        GuidanceAudioNotifications.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GuidanceAudioNotifications, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GuidanceAudioNotifications =
        GuidanceAudioNotifications.values()[0].fromNative(value, null)

    public override fun toNative(obj: GuidanceAudioNotifications): Int = obj.value
  }
}
