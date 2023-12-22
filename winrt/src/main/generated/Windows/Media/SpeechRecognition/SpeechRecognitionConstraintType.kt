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

@ABIMarker(SpeechRecognitionConstraintType.ABI::class)
@Signature("enum(Windows.Media.SpeechRecognition.SpeechRecognitionConstraintType;i4)")
@WinRTByReference(brClass = SpeechRecognitionConstraintType.ByReference::class)
public enum class SpeechRecognitionConstraintType(
  public val value: Int
) : NativeMapped {
  Topic(0),
  List(1),
  Grammar(2),
  VoiceCommandDefinition(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SpeechRecognitionConstraintType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Topic
      1 -> List
      2 -> Grammar
      3 -> VoiceCommandDefinition
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SpeechRecognitionConstraintType> {
    public fun setValue(newValue: SpeechRecognitionConstraintType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SpeechRecognitionConstraintType =
        SpeechRecognitionConstraintType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SpeechRecognitionConstraintType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SpeechRecognitionConstraintType =
        SpeechRecognitionConstraintType.values()[0].fromNative(value, null)

    public override fun toNative(obj: SpeechRecognitionConstraintType): Int = obj.value
  }
}
