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

@ABIMarker(AudioFileNodeCreationStatus.ABI::class)
@Signature("enum(Windows.Media.Audio.AudioFileNodeCreationStatus;i4)")
@WinRTByReference(brClass = AudioFileNodeCreationStatus.ByReference::class)
public enum class AudioFileNodeCreationStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  FileNotFound(1),
  InvalidFileType(2),
  FormatNotSupported(3),
  UnknownFailure(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AudioFileNodeCreationStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> FileNotFound
      2 -> InvalidFileType
      3 -> FormatNotSupported
      4 -> UnknownFailure
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AudioFileNodeCreationStatus> {
    public fun setValue(newValue: AudioFileNodeCreationStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AudioFileNodeCreationStatus =
        AudioFileNodeCreationStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AudioFileNodeCreationStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AudioFileNodeCreationStatus =
        AudioFileNodeCreationStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: AudioFileNodeCreationStatus): Int = obj.value
  }
}
