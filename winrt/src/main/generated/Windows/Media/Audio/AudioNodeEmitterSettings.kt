package Windows.Media.Audio

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

@ABIMarker(AudioNodeEmitterSettings.ABI::class)
@Signature("enum(Windows.Media.Audio.AudioNodeEmitterSettings;u4)")
@WinRTByReference(brClass = AudioNodeEmitterSettings.ByReference::class)
public enum class AudioNodeEmitterSettings(
  public val value: Int
) : NativeMapped {
  None(0),
  DisableDoppler(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AudioNodeEmitterSettings {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> DisableDoppler
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AudioNodeEmitterSettings>
      {
    public fun setValue(newValue: AudioNodeEmitterSettings): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AudioNodeEmitterSettings =
        AudioNodeEmitterSettings.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AudioNodeEmitterSettings, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AudioNodeEmitterSettings =
        AudioNodeEmitterSettings.values()[0].fromNative(value, null)

    public override fun toNative(obj: AudioNodeEmitterSettings): Int = obj.value
  }
}
