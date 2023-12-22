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

@ABIMarker(SpeechRecognitionConstraintProbability.ABI::class)
@Signature("enum(Windows.Media.SpeechRecognition.SpeechRecognitionConstraintProbability;i4)")
@WinRTByReference(brClass = SpeechRecognitionConstraintProbability.ByReference::class)
public enum class SpeechRecognitionConstraintProbability(
  public val value: Int
) : NativeMapped {
  Default(0),
  Min(1),
  Max(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SpeechRecognitionConstraintProbability {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> Min
      2 -> Max
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SpeechRecognitionConstraintProbability> {
    public fun setValue(newValue: SpeechRecognitionConstraintProbability): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SpeechRecognitionConstraintProbability =
        SpeechRecognitionConstraintProbability.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SpeechRecognitionConstraintProbability, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SpeechRecognitionConstraintProbability =
        SpeechRecognitionConstraintProbability.values()[0].fromNative(value, null)

    public override fun toNative(obj: SpeechRecognitionConstraintProbability): Int = obj.value
  }
}
