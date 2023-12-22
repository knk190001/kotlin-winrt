package Windows.Media.Core

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

@ABIMarker(AudioDecoderDegradation.ABI::class)
@Signature("enum(Windows.Media.Core.AudioDecoderDegradation;i4)")
@WinRTByReference(brClass = AudioDecoderDegradation.ByReference::class)
public enum class AudioDecoderDegradation(
  public val value: Int
) : NativeMapped {
  None(0),
  DownmixTo2Channels(1),
  DownmixTo6Channels(2),
  DownmixTo8Channels(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AudioDecoderDegradation {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> DownmixTo2Channels
      2 -> DownmixTo6Channels
      3 -> DownmixTo8Channels
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AudioDecoderDegradation> {
    public fun setValue(newValue: AudioDecoderDegradation): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AudioDecoderDegradation =
        AudioDecoderDegradation.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AudioDecoderDegradation, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AudioDecoderDegradation =
        AudioDecoderDegradation.values()[0].fromNative(value, null)

    public override fun toNative(obj: AudioDecoderDegradation): Int = obj.value
  }
}
