package Windows.Media.Streaming.Adaptive

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

@ABIMarker(AdaptiveMediaSourceDownloadBitrateChangedReason.ABI::class)
@Signature("enum(Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadBitrateChangedReason;i4)")
@WinRTByReference(brClass = AdaptiveMediaSourceDownloadBitrateChangedReason.ByReference::class)
public enum class AdaptiveMediaSourceDownloadBitrateChangedReason(
  public val value: Int
) : NativeMapped {
  SufficientInboundBitsPerSecond(0),
  InsufficientInboundBitsPerSecond(1),
  LowBufferLevel(2),
  PositionChanged(3),
  TrackSelectionChanged(4),
  DesiredBitratesChanged(5),
  ErrorInPreviousBitrate(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AdaptiveMediaSourceDownloadBitrateChangedReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> SufficientInboundBitsPerSecond
      1 -> InsufficientInboundBitsPerSecond
      2 -> LowBufferLevel
      3 -> PositionChanged
      4 -> TrackSelectionChanged
      5 -> DesiredBitratesChanged
      6 -> ErrorInPreviousBitrate
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AdaptiveMediaSourceDownloadBitrateChangedReason> {
    public fun setValue(newValue: AdaptiveMediaSourceDownloadBitrateChangedReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AdaptiveMediaSourceDownloadBitrateChangedReason =
        AdaptiveMediaSourceDownloadBitrateChangedReason.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<AdaptiveMediaSourceDownloadBitrateChangedReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AdaptiveMediaSourceDownloadBitrateChangedReason =
        AdaptiveMediaSourceDownloadBitrateChangedReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: AdaptiveMediaSourceDownloadBitrateChangedReason): Int =
        obj.value
  }
}
