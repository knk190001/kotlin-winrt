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

@ABIMarker(MediaCategory.ABI::class)
@Signature("enum(Windows.Media.Capture.MediaCategory;i4)")
@WinRTByReference(brClass = MediaCategory.ByReference::class)
public enum class MediaCategory(
  public val value: Int
) : NativeMapped {
  Other(0),
  Communications(1),
  Media(2),
  GameChat(3),
  Speech(4),
  FarFieldSpeech(5),
  UniformSpeech(6),
  VoiceTyping(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MediaCategory {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Other
      1 -> Communications
      2 -> Media
      3 -> GameChat
      4 -> Speech
      5 -> FarFieldSpeech
      6 -> UniformSpeech
      7 -> VoiceTyping
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MediaCategory> {
    public fun setValue(newValue: MediaCategory): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MediaCategory =
        MediaCategory.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MediaCategory, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MediaCategory =
        MediaCategory.values()[0].fromNative(value, null)

    public override fun toNative(obj: MediaCategory): Int = obj.value
  }
}
