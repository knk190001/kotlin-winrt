package Windows.Media.Audio

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

@ABIMarker(AudioGraphUnrecoverableError.ABI::class)
@Signature("enum(Windows.Media.Audio.AudioGraphUnrecoverableError;i4)")
@WinRTByReference(brClass = AudioGraphUnrecoverableError.ByReference::class)
public enum class AudioGraphUnrecoverableError(
  public val value: Int
) : NativeMapped {
  None(0),
  AudioDeviceLost(1),
  AudioSessionDisconnected(2),
  UnknownFailure(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AudioGraphUnrecoverableError {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> AudioDeviceLost
      2 -> AudioSessionDisconnected
      3 -> UnknownFailure
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AudioGraphUnrecoverableError> {
    public fun setValue(newValue: AudioGraphUnrecoverableError): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AudioGraphUnrecoverableError =
        AudioGraphUnrecoverableError.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AudioGraphUnrecoverableError, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AudioGraphUnrecoverableError =
        AudioGraphUnrecoverableError.values()[0].fromNative(value, null)

    public override fun toNative(obj: AudioGraphUnrecoverableError): Int = obj.value
  }
}
