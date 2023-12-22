package Windows.Phone.Speech.Recognition

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

@ABIMarker(SpeechRecognitionUIStatus.ABI::class)
@Signature("enum(Windows.Phone.Speech.Recognition.SpeechRecognitionUIStatus;i4)")
@WinRTByReference(brClass = SpeechRecognitionUIStatus.ByReference::class)
public enum class SpeechRecognitionUIStatus(
  public val value: Int
) : NativeMapped {
  Succeeded(0),
  Busy(1),
  Cancelled(2),
  Preempted(3),
  PrivacyPolicyDeclined(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SpeechRecognitionUIStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Succeeded
      1 -> Busy
      2 -> Cancelled
      3 -> Preempted
      4 -> PrivacyPolicyDeclined
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SpeechRecognitionUIStatus>
      {
    public fun setValue(newValue: SpeechRecognitionUIStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SpeechRecognitionUIStatus =
        SpeechRecognitionUIStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SpeechRecognitionUIStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SpeechRecognitionUIStatus =
        SpeechRecognitionUIStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: SpeechRecognitionUIStatus): Int = obj.value
  }
}
