package Windows.UI.Xaml.Media

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

@ABIMarker(AudioCategory.ABI::class)
@Signature("enum(Windows.UI.Xaml.Media.AudioCategory;i4)")
@WinRTByReference(brClass = AudioCategory.ByReference::class)
public enum class AudioCategory(
  public val value: Int
) : NativeMapped {
  Other(0),
  ForegroundOnlyMedia(1),
  BackgroundCapableMedia(2),
  Communications(3),
  Alerts(4),
  SoundEffects(5),
  GameEffects(6),
  GameMedia(7),
  GameChat(8),
  Speech(9),
  Movie(10),
  Media(11),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AudioCategory {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Other
      1 -> ForegroundOnlyMedia
      2 -> BackgroundCapableMedia
      3 -> Communications
      4 -> Alerts
      5 -> SoundEffects
      6 -> GameEffects
      7 -> GameMedia
      8 -> GameChat
      9 -> Speech
      10 -> Movie
      11 -> Media
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AudioCategory> {
    public fun setValue(newValue: AudioCategory): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AudioCategory =
        AudioCategory.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AudioCategory, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AudioCategory =
        AudioCategory.values()[0].fromNative(value, null)

    public override fun toNative(obj: AudioCategory): Int = obj.value
  }
}
