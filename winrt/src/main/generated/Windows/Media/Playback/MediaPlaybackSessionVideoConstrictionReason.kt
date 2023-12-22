package Windows.Media.Playback

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

@ABIMarker(MediaPlaybackSessionVideoConstrictionReason.ABI::class)
@Signature("enum(Windows.Media.Playback.MediaPlaybackSessionVideoConstrictionReason;i4)")
@WinRTByReference(brClass = MediaPlaybackSessionVideoConstrictionReason.ByReference::class)
public enum class MediaPlaybackSessionVideoConstrictionReason(
  public val value: Int
) : NativeMapped {
  None(0),
  VirtualMachine(1),
  UnsupportedDisplayAdapter(2),
  UnsignedDriver(3),
  FrameServerEnabled(4),
  OutputProtectionFailed(5),
  Unknown(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MediaPlaybackSessionVideoConstrictionReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> VirtualMachine
      2 -> UnsupportedDisplayAdapter
      3 -> UnsignedDriver
      4 -> FrameServerEnabled
      5 -> OutputProtectionFailed
      6 -> Unknown
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<MediaPlaybackSessionVideoConstrictionReason> {
    public fun setValue(newValue: MediaPlaybackSessionVideoConstrictionReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MediaPlaybackSessionVideoConstrictionReason =
        MediaPlaybackSessionVideoConstrictionReason.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<MediaPlaybackSessionVideoConstrictionReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MediaPlaybackSessionVideoConstrictionReason =
        MediaPlaybackSessionVideoConstrictionReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: MediaPlaybackSessionVideoConstrictionReason): Int = obj.value
  }
}
