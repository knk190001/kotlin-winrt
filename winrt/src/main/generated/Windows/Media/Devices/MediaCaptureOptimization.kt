package Windows.Media.Devices

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

@ABIMarker(MediaCaptureOptimization.ABI::class)
@Signature("enum(Windows.Media.Devices.MediaCaptureOptimization;i4)")
@WinRTByReference(brClass = MediaCaptureOptimization.ByReference::class)
public enum class MediaCaptureOptimization(
  public val value: Int
) : NativeMapped {
  Default(0),
  Quality(1),
  Latency(2),
  Power(3),
  LatencyThenQuality(4),
  LatencyThenPower(5),
  PowerAndQuality(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MediaCaptureOptimization {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> Quality
      2 -> Latency
      3 -> Power
      4 -> LatencyThenQuality
      5 -> LatencyThenPower
      6 -> PowerAndQuality
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MediaCaptureOptimization>
      {
    public fun setValue(newValue: MediaCaptureOptimization): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MediaCaptureOptimization =
        MediaCaptureOptimization.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MediaCaptureOptimization, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MediaCaptureOptimization =
        MediaCaptureOptimization.values()[0].fromNative(value, null)

    public override fun toNative(obj: MediaCaptureOptimization): Int = obj.value
  }
}
