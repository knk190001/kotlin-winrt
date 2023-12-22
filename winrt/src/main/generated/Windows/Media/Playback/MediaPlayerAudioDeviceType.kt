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

@ABIMarker(MediaPlayerAudioDeviceType.ABI::class)
@Signature("enum(Windows.Media.Playback.MediaPlayerAudioDeviceType;i4)")
@WinRTByReference(brClass = MediaPlayerAudioDeviceType.ByReference::class)
public enum class MediaPlayerAudioDeviceType(
  public val value: Int
) : NativeMapped {
  Console(0),
  Multimedia(1),
  Communications(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MediaPlayerAudioDeviceType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Console
      1 -> Multimedia
      2 -> Communications
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<MediaPlayerAudioDeviceType> {
    public fun setValue(newValue: MediaPlayerAudioDeviceType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MediaPlayerAudioDeviceType =
        MediaPlayerAudioDeviceType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MediaPlayerAudioDeviceType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MediaPlayerAudioDeviceType =
        MediaPlayerAudioDeviceType.values()[0].fromNative(value, null)

    public override fun toNative(obj: MediaPlayerAudioDeviceType): Int = obj.value
  }
}
