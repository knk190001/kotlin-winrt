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

@ABIMarker(GuidanceAudioNotificationKind.ABI::class)
@Signature("enum(Windows.Services.Maps.Guidance.GuidanceAudioNotificationKind;i4)")
@WinRTByReference(brClass = GuidanceAudioNotificationKind.ByReference::class)
public enum class GuidanceAudioNotificationKind(
  public val value: Int
) : NativeMapped {
  Maneuver(0),
  Route(1),
  Gps(2),
  SpeedLimit(3),
  Traffic(4),
  TrafficCamera(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GuidanceAudioNotificationKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Maneuver
      1 -> Route
      2 -> Gps
      3 -> SpeedLimit
      4 -> Traffic
      5 -> TrafficCamera
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<GuidanceAudioNotificationKind> {
    public fun setValue(newValue: GuidanceAudioNotificationKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GuidanceAudioNotificationKind =
        GuidanceAudioNotificationKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GuidanceAudioNotificationKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GuidanceAudioNotificationKind =
        GuidanceAudioNotificationKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: GuidanceAudioNotificationKind): Int = obj.value
  }
}
