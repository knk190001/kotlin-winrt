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

@ABIMarker(SpeechRecognitionScenario.ABI::class)
@Signature("enum(Windows.Media.SpeechRecognition.SpeechRecognitionScenario;i4)")
@WinRTByReference(brClass = SpeechRecognitionScenario.ByReference::class)
public enum class SpeechRecognitionScenario(
  public val value: Int
) : NativeMapped {
  WebSearch(0),
  Dictation(1),
  FormFilling(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SpeechRecognitionScenario {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> WebSearch
      1 -> Dictation
      2 -> FormFilling
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SpeechRecognitionScenario>
      {
    public fun setValue(newValue: SpeechRecognitionScenario): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SpeechRecognitionScenario =
        SpeechRecognitionScenario.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SpeechRecognitionScenario, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SpeechRecognitionScenario =
        SpeechRecognitionScenario.values()[0].fromNative(value, null)

    public override fun toNative(obj: SpeechRecognitionScenario): Int = obj.value
  }
}
