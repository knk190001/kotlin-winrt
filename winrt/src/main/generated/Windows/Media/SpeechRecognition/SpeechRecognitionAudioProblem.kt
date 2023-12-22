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

@ABIMarker(SpeechRecognitionAudioProblem.ABI::class)
@Signature("enum(Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem;i4)")
@WinRTByReference(brClass = SpeechRecognitionAudioProblem.ByReference::class)
public enum class SpeechRecognitionAudioProblem(
  public val value: Int
) : NativeMapped {
  None(0),
  TooNoisy(1),
  NoSignal(2),
  TooLoud(3),
  TooQuiet(4),
  TooFast(5),
  TooSlow(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SpeechRecognitionAudioProblem {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> TooNoisy
      2 -> NoSignal
      3 -> TooLoud
      4 -> TooQuiet
      5 -> TooFast
      6 -> TooSlow
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SpeechRecognitionAudioProblem> {
    public fun setValue(newValue: SpeechRecognitionAudioProblem): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SpeechRecognitionAudioProblem =
        SpeechRecognitionAudioProblem.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SpeechRecognitionAudioProblem, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SpeechRecognitionAudioProblem =
        SpeechRecognitionAudioProblem.values()[0].fromNative(value, null)

    public override fun toNative(obj: SpeechRecognitionAudioProblem): Int = obj.value
  }
}
