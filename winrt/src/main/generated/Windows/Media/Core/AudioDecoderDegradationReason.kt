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

@ABIMarker(AudioDecoderDegradationReason.ABI::class)
@Signature("enum(Windows.Media.Core.AudioDecoderDegradationReason;i4)")
@WinRTByReference(brClass = AudioDecoderDegradationReason.ByReference::class)
public enum class AudioDecoderDegradationReason(
  public val value: Int
) : NativeMapped {
  None(0),
  LicensingRequirement(1),
  SpatialAudioNotSupported(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AudioDecoderDegradationReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> LicensingRequirement
      2 -> SpatialAudioNotSupported
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AudioDecoderDegradationReason> {
    public fun setValue(newValue: AudioDecoderDegradationReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AudioDecoderDegradationReason =
        AudioDecoderDegradationReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AudioDecoderDegradationReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AudioDecoderDegradationReason =
        AudioDecoderDegradationReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: AudioDecoderDegradationReason): Int = obj.value
  }
}
