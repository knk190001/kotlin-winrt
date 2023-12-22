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

@ABIMarker(DetectionConfigurationTrainingStatus.ABI::class)
@Signature("enum(Windows.ApplicationModel.ConversationalAgent.DetectionConfigurationTrainingStatus;i4)")
@WinRTByReference(brClass = DetectionConfigurationTrainingStatus.ByReference::class)
public enum class DetectionConfigurationTrainingStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  FormatNotSupported(1),
  VoiceTooQuiet(2),
  VoiceTooLoud(3),
  VoiceTooFast(4),
  VoiceTooSlow(5),
  VoiceQualityProblem(6),
  TrainingSystemInternalError(7),
  TrainingTimedOut(8),
  ConfigurationNotFound(9),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DetectionConfigurationTrainingStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> FormatNotSupported
      2 -> VoiceTooQuiet
      3 -> VoiceTooLoud
      4 -> VoiceTooFast
      5 -> VoiceTooSlow
      6 -> VoiceQualityProblem
      7 -> TrainingSystemInternalError
      8 -> TrainingTimedOut
      9 -> ConfigurationNotFound
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<DetectionConfigurationTrainingStatus> {
    public fun setValue(newValue: DetectionConfigurationTrainingStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DetectionConfigurationTrainingStatus =
        DetectionConfigurationTrainingStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DetectionConfigurationTrainingStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DetectionConfigurationTrainingStatus =
        DetectionConfigurationTrainingStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: DetectionConfigurationTrainingStatus): Int = obj.value
  }
}
