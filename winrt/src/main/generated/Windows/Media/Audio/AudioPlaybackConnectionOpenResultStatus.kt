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

@ABIMarker(AudioPlaybackConnectionOpenResultStatus.ABI::class)
@Signature("enum(Windows.Media.Audio.AudioPlaybackConnectionOpenResultStatus;i4)")
@WinRTByReference(brClass = AudioPlaybackConnectionOpenResultStatus.ByReference::class)
public enum class AudioPlaybackConnectionOpenResultStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  RequestTimedOut(1),
  DeniedBySystem(2),
  UnknownFailure(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AudioPlaybackConnectionOpenResultStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> RequestTimedOut
      2 -> DeniedBySystem
      3 -> UnknownFailure
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AudioPlaybackConnectionOpenResultStatus> {
    public fun setValue(newValue: AudioPlaybackConnectionOpenResultStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AudioPlaybackConnectionOpenResultStatus =
        AudioPlaybackConnectionOpenResultStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AudioPlaybackConnectionOpenResultStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AudioPlaybackConnectionOpenResultStatus =
        AudioPlaybackConnectionOpenResultStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: AudioPlaybackConnectionOpenResultStatus): Int = obj.value
  }
}
