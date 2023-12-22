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

@ABIMarker(SpeechRecognizerState.ABI::class)
@Signature("enum(Windows.Media.SpeechRecognition.SpeechRecognizerState;i4)")
@WinRTByReference(brClass = SpeechRecognizerState.ByReference::class)
public enum class SpeechRecognizerState(
  public val value: Int
) : NativeMapped {
  Idle(0),
  Capturing(1),
  Processing(2),
  SoundStarted(3),
  SoundEnded(4),
  SpeechDetected(5),
  Paused(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SpeechRecognizerState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Idle
      1 -> Capturing
      2 -> Processing
      3 -> SoundStarted
      4 -> SoundEnded
      5 -> SpeechDetected
      6 -> Paused
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SpeechRecognizerState> {
    public fun setValue(newValue: SpeechRecognizerState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SpeechRecognizerState =
        SpeechRecognizerState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SpeechRecognizerState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SpeechRecognizerState =
        SpeechRecognizerState.values()[0].fromNative(value, null)

    public override fun toNative(obj: SpeechRecognizerState): Int = obj.value
  }
}
