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

@ABIMarker(AudioDeviceNodeCreationStatus.ABI::class)
@Signature("enum(Windows.Media.Audio.AudioDeviceNodeCreationStatus;i4)")
@WinRTByReference(brClass = AudioDeviceNodeCreationStatus.ByReference::class)
public enum class AudioDeviceNodeCreationStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  DeviceNotAvailable(1),
  FormatNotSupported(2),
  UnknownFailure(3),
  AccessDenied(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AudioDeviceNodeCreationStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> DeviceNotAvailable
      2 -> FormatNotSupported
      3 -> UnknownFailure
      4 -> AccessDenied
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AudioDeviceNodeCreationStatus> {
    public fun setValue(newValue: AudioDeviceNodeCreationStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AudioDeviceNodeCreationStatus =
        AudioDeviceNodeCreationStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AudioDeviceNodeCreationStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AudioDeviceNodeCreationStatus =
        AudioDeviceNodeCreationStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: AudioDeviceNodeCreationStatus): Int = obj.value
  }
}
