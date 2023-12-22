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

@ABIMarker(MediaPlaybackItemChangedReason.ABI::class)
@Signature("enum(Windows.Media.Playback.MediaPlaybackItemChangedReason;i4)")
@WinRTByReference(brClass = MediaPlaybackItemChangedReason.ByReference::class)
public enum class MediaPlaybackItemChangedReason(
  public val value: Int
) : NativeMapped {
  InitialItem(0),
  EndOfStream(1),
  Error(2),
  AppRequested(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MediaPlaybackItemChangedReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> InitialItem
      1 -> EndOfStream
      2 -> Error
      3 -> AppRequested
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<MediaPlaybackItemChangedReason> {
    public fun setValue(newValue: MediaPlaybackItemChangedReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MediaPlaybackItemChangedReason =
        MediaPlaybackItemChangedReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MediaPlaybackItemChangedReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MediaPlaybackItemChangedReason =
        MediaPlaybackItemChangedReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: MediaPlaybackItemChangedReason): Int = obj.value
  }
}
