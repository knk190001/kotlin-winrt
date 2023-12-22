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

@ABIMarker(MediaPlayerState.ABI::class)
@Signature("enum(Windows.Media.Playback.MediaPlayerState;i4)")
@WinRTByReference(brClass = MediaPlayerState.ByReference::class)
public enum class MediaPlayerState(
  public val value: Int
) : NativeMapped {
  Closed(0),
  Opening(1),
  Buffering(2),
  Playing(3),
  Paused(4),
  Stopped(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MediaPlayerState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Closed
      1 -> Opening
      2 -> Buffering
      3 -> Playing
      4 -> Paused
      5 -> Stopped
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MediaPlayerState> {
    public fun setValue(newValue: MediaPlayerState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MediaPlayerState =
        MediaPlayerState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MediaPlayerState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MediaPlayerState =
        MediaPlayerState.values()[0].fromNative(value, null)

    public override fun toNative(obj: MediaPlayerState): Int = obj.value
  }
}
