package Windows.Media.Effects

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

@ABIMarker(AudioEffectType.ABI::class)
@Signature("enum(Windows.Media.Effects.AudioEffectType;i4)")
@WinRTByReference(brClass = AudioEffectType.ByReference::class)
public enum class AudioEffectType(
  public val value: Int
) : NativeMapped {
  Other(0),
  AcousticEchoCancellation(1),
  NoiseSuppression(2),
  AutomaticGainControl(3),
  BeamForming(4),
  ConstantToneRemoval(5),
  Equalizer(6),
  LoudnessEqualizer(7),
  BassBoost(8),
  VirtualSurround(9),
  VirtualHeadphones(10),
  SpeakerFill(11),
  RoomCorrection(12),
  BassManagement(13),
  EnvironmentalEffects(14),
  SpeakerProtection(15),
  SpeakerCompensation(16),
  DynamicRangeCompression(17),
  FarFieldBeamForming(18),
  DeepNoiseSuppression(19),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AudioEffectType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Other
      1 -> AcousticEchoCancellation
      2 -> NoiseSuppression
      3 -> AutomaticGainControl
      4 -> BeamForming
      5 -> ConstantToneRemoval
      6 -> Equalizer
      7 -> LoudnessEqualizer
      8 -> BassBoost
      9 -> VirtualSurround
      10 -> VirtualHeadphones
      11 -> SpeakerFill
      12 -> RoomCorrection
      13 -> BassManagement
      14 -> EnvironmentalEffects
      15 -> SpeakerProtection
      16 -> SpeakerCompensation
      17 -> DynamicRangeCompression
      18 -> FarFieldBeamForming
      19 -> DeepNoiseSuppression
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AudioEffectType> {
    public fun setValue(newValue: AudioEffectType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AudioEffectType =
        AudioEffectType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AudioEffectType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AudioEffectType =
        AudioEffectType.values()[0].fromNative(value, null)

    public override fun toNative(obj: AudioEffectType): Int = obj.value
  }
}
