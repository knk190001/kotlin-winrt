package Windows.Media.Capture.Frames

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

@ABIMarker(MediaFrameReaderStartStatus.ABI::class)
@Signature("enum(Windows.Media.Capture.Frames.MediaFrameReaderStartStatus;i4)")
@WinRTByReference(brClass = MediaFrameReaderStartStatus.ByReference::class)
public enum class MediaFrameReaderStartStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  UnknownFailure(1),
  DeviceNotAvailable(2),
  OutputFormatNotSupported(3),
  ExclusiveControlNotAvailable(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MediaFrameReaderStartStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> UnknownFailure
      2 -> DeviceNotAvailable
      3 -> OutputFormatNotSupported
      4 -> ExclusiveControlNotAvailable
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<MediaFrameReaderStartStatus> {
    public fun setValue(newValue: MediaFrameReaderStartStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MediaFrameReaderStartStatus =
        MediaFrameReaderStartStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MediaFrameReaderStartStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MediaFrameReaderStartStatus =
        MediaFrameReaderStartStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: MediaFrameReaderStartStatus): Int = obj.value
  }
}
