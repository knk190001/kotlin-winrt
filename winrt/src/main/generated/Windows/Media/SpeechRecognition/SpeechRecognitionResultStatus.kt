package Windows.Media.SpeechRecognition

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

@ABIMarker(SpeechRecognitionResultStatus.ABI::class)
@Signature("enum(Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus;i4)")
@WinRTByReference(brClass = SpeechRecognitionResultStatus.ByReference::class)
public enum class SpeechRecognitionResultStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  TopicLanguageNotSupported(1),
  GrammarLanguageMismatch(2),
  GrammarCompilationFailure(3),
  AudioQualityFailure(4),
  UserCanceled(5),
  Unknown(6),
  TimeoutExceeded(7),
  PauseLimitExceeded(8),
  NetworkFailure(9),
  MicrophoneUnavailable(10),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SpeechRecognitionResultStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> TopicLanguageNotSupported
      2 -> GrammarLanguageMismatch
      3 -> GrammarCompilationFailure
      4 -> AudioQualityFailure
      5 -> UserCanceled
      6 -> Unknown
      7 -> TimeoutExceeded
      8 -> PauseLimitExceeded
      9 -> NetworkFailure
      10 -> MicrophoneUnavailable
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SpeechRecognitionResultStatus> {
    public fun setValue(newValue: SpeechRecognitionResultStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SpeechRecognitionResultStatus =
        SpeechRecognitionResultStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SpeechRecognitionResultStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SpeechRecognitionResultStatus =
        SpeechRecognitionResultStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: SpeechRecognitionResultStatus): Int = obj.value
  }
}
