package Windows.Media

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

@ABIMarker(MediaPlaybackType.ABI::class)
@Signature("enum(Windows.Media.MediaPlaybackType;i4)")
@WinRTByReference(brClass = MediaPlaybackType.ByReference::class)
public enum class MediaPlaybackType(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Music(1),
  Video(2),
  Image(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MediaPlaybackType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Music
      2 -> Video
      3 -> Image
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MediaPlaybackType> {
    public fun setValue(newValue: MediaPlaybackType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MediaPlaybackType =
        MediaPlaybackType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MediaPlaybackType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MediaPlaybackType =
        MediaPlaybackType.values()[0].fromNative(value, null)

    public override fun toNative(obj: MediaPlaybackType): Int = obj.value
  }
}
