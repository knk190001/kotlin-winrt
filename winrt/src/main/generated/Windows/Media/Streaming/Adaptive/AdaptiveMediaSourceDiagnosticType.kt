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

@ABIMarker(AdaptiveMediaSourceDiagnosticType.ABI::class)
@Signature("enum(Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDiagnosticType;i4)")
@WinRTByReference(brClass = AdaptiveMediaSourceDiagnosticType.ByReference::class)
public enum class AdaptiveMediaSourceDiagnosticType(
  public val value: Int
) : NativeMapped {
  ManifestUnchangedUponReload(0),
  ManifestMismatchUponReload(1),
  ManifestSignaledEndOfLiveEventUponReload(2),
  MediaSegmentSkipped(3),
  ResourceNotFound(4),
  ResourceTimedOut(5),
  ResourceParsingError(6),
  BitrateDisabled(7),
  FatalMediaSourceError(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AdaptiveMediaSourceDiagnosticType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> ManifestUnchangedUponReload
      1 -> ManifestMismatchUponReload
      2 -> ManifestSignaledEndOfLiveEventUponReload
      3 -> MediaSegmentSkipped
      4 -> ResourceNotFound
      5 -> ResourceTimedOut
      6 -> ResourceParsingError
      7 -> BitrateDisabled
      8 -> FatalMediaSourceError
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AdaptiveMediaSourceDiagnosticType> {
    public fun setValue(newValue: AdaptiveMediaSourceDiagnosticType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AdaptiveMediaSourceDiagnosticType =
        AdaptiveMediaSourceDiagnosticType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AdaptiveMediaSourceDiagnosticType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AdaptiveMediaSourceDiagnosticType =
        AdaptiveMediaSourceDiagnosticType.values()[0].fromNative(value, null)

    public override fun toNative(obj: AdaptiveMediaSourceDiagnosticType): Int = obj.value
  }
}
