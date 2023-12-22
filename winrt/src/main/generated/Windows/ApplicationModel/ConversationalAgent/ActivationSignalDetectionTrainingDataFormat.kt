package Windows.ApplicationModel.ConversationalAgent

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

@ABIMarker(ActivationSignalDetectionTrainingDataFormat.ABI::class)
@Signature("enum(Windows.ApplicationModel.ConversationalAgent.ActivationSignalDetectionTrainingDataFormat;i4)")
@WinRTByReference(brClass = ActivationSignalDetectionTrainingDataFormat.ByReference::class)
public enum class ActivationSignalDetectionTrainingDataFormat(
  public val value: Int
) : NativeMapped {
  Voice8kHz8BitMono(0),
  Voice8kHz16BitMono(1),
  Voice16kHz8BitMono(2),
  Voice16kHz16BitMono(3),
  VoiceOEMDefined(4),
  Audio44kHz8BitMono(5),
  Audio44kHz16BitMono(6),
  Audio48kHz8BitMono(7),
  Audio48kHz16BitMono(8),
  AudioOEMDefined(9),
  OtherOEMDefined(10),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ActivationSignalDetectionTrainingDataFormat {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Voice8kHz8BitMono
      1 -> Voice8kHz16BitMono
      2 -> Voice16kHz8BitMono
      3 -> Voice16kHz16BitMono
      4 -> VoiceOEMDefined
      5 -> Audio44kHz8BitMono
      6 -> Audio44kHz16BitMono
      7 -> Audio48kHz8BitMono
      8 -> Audio48kHz16BitMono
      9 -> AudioOEMDefined
      10 -> OtherOEMDefined
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ActivationSignalDetectionTrainingDataFormat> {
    public fun setValue(newValue: ActivationSignalDetectionTrainingDataFormat): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ActivationSignalDetectionTrainingDataFormat =
        ActivationSignalDetectionTrainingDataFormat.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<ActivationSignalDetectionTrainingDataFormat, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ActivationSignalDetectionTrainingDataFormat =
        ActivationSignalDetectionTrainingDataFormat.values()[0].fromNative(value, null)

    public override fun toNative(obj: ActivationSignalDetectionTrainingDataFormat): Int = obj.value
  }
}
