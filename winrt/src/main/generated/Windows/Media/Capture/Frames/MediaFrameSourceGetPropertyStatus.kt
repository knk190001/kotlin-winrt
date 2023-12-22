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

@ABIMarker(MediaFrameSourceGetPropertyStatus.ABI::class)
@Signature("enum(Windows.Media.Capture.Frames.MediaFrameSourceGetPropertyStatus;i4)")
@WinRTByReference(brClass = MediaFrameSourceGetPropertyStatus.ByReference::class)
public enum class MediaFrameSourceGetPropertyStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  UnknownFailure(1),
  NotSupported(2),
  DeviceNotAvailable(3),
  MaxPropertyValueSizeTooSmall(4),
  MaxPropertyValueSizeRequired(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MediaFrameSourceGetPropertyStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> UnknownFailure
      2 -> NotSupported
      3 -> DeviceNotAvailable
      4 -> MaxPropertyValueSizeTooSmall
      5 -> MaxPropertyValueSizeRequired
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<MediaFrameSourceGetPropertyStatus> {
    public fun setValue(newValue: MediaFrameSourceGetPropertyStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MediaFrameSourceGetPropertyStatus =
        MediaFrameSourceGetPropertyStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MediaFrameSourceGetPropertyStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MediaFrameSourceGetPropertyStatus =
        MediaFrameSourceGetPropertyStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: MediaFrameSourceGetPropertyStatus): Int = obj.value
  }
}
