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

@ABIMarker(KnownVideoProfile.ABI::class)
@Signature("enum(Windows.Media.Capture.KnownVideoProfile;i4)")
@WinRTByReference(brClass = KnownVideoProfile.ByReference::class)
public enum class KnownVideoProfile(
  public val value: Int
) : NativeMapped {
  VideoRecording(0),
  HighQualityPhoto(1),
  BalancedVideoAndPhoto(2),
  VideoConferencing(3),
  PhotoSequence(4),
  HighFrameRate(5),
  VariablePhotoSequence(6),
  HdrWithWcgVideo(7),
  HdrWithWcgPhoto(8),
  VideoHdr8(9),
  CompressedCamera(10),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      KnownVideoProfile {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> VideoRecording
      1 -> HighQualityPhoto
      2 -> BalancedVideoAndPhoto
      3 -> VideoConferencing
      4 -> PhotoSequence
      5 -> HighFrameRate
      6 -> VariablePhotoSequence
      7 -> HdrWithWcgVideo
      8 -> HdrWithWcgPhoto
      9 -> VideoHdr8
      10 -> CompressedCamera
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<KnownVideoProfile> {
    public fun setValue(newValue: KnownVideoProfile): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): KnownVideoProfile =
        KnownVideoProfile.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<KnownVideoProfile, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): KnownVideoProfile =
        KnownVideoProfile.values()[0].fromNative(value, null)

    public override fun toNative(obj: KnownVideoProfile): Int = obj.value
  }
}
