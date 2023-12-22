package Windows.Media.Core

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

@ABIMarker(VideoStabilizationEffectEnabledChangedReason.ABI::class)
@Signature("enum(Windows.Media.Core.VideoStabilizationEffectEnabledChangedReason;i4)")
@WinRTByReference(brClass = VideoStabilizationEffectEnabledChangedReason.ByReference::class)
public enum class VideoStabilizationEffectEnabledChangedReason(
  public val value: Int
) : NativeMapped {
  Programmatic(0),
  PixelRateTooHigh(1),
  RunningSlowly(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      VideoStabilizationEffectEnabledChangedReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Programmatic
      1 -> PixelRateTooHigh
      2 -> RunningSlowly
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<VideoStabilizationEffectEnabledChangedReason> {
    public fun setValue(newValue: VideoStabilizationEffectEnabledChangedReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): VideoStabilizationEffectEnabledChangedReason =
        VideoStabilizationEffectEnabledChangedReason.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<VideoStabilizationEffectEnabledChangedReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): VideoStabilizationEffectEnabledChangedReason =
        VideoStabilizationEffectEnabledChangedReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: VideoStabilizationEffectEnabledChangedReason): Int = obj.value
  }
}
