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

@ABIMarker(AdaptiveMediaSourceCreationStatus.ABI::class)
@Signature("enum(Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationStatus;i4)")
@WinRTByReference(brClass = AdaptiveMediaSourceCreationStatus.ByReference::class)
public enum class AdaptiveMediaSourceCreationStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  ManifestDownloadFailure(1),
  ManifestParseFailure(2),
  UnsupportedManifestContentType(3),
  UnsupportedManifestVersion(4),
  UnsupportedManifestProfile(5),
  UnknownFailure(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AdaptiveMediaSourceCreationStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> ManifestDownloadFailure
      2 -> ManifestParseFailure
      3 -> UnsupportedManifestContentType
      4 -> UnsupportedManifestVersion
      5 -> UnsupportedManifestProfile
      6 -> UnknownFailure
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AdaptiveMediaSourceCreationStatus> {
    public fun setValue(newValue: AdaptiveMediaSourceCreationStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AdaptiveMediaSourceCreationStatus =
        AdaptiveMediaSourceCreationStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AdaptiveMediaSourceCreationStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AdaptiveMediaSourceCreationStatus =
        AdaptiveMediaSourceCreationStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: AdaptiveMediaSourceCreationStatus): Int = obj.value
  }
}
