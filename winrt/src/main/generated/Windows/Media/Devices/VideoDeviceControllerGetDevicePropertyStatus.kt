package Windows.Media.Devices

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

@ABIMarker(VideoDeviceControllerGetDevicePropertyStatus.ABI::class)
@Signature("enum(Windows.Media.Devices.VideoDeviceControllerGetDevicePropertyStatus;i4)")
@WinRTByReference(brClass = VideoDeviceControllerGetDevicePropertyStatus.ByReference::class)
public enum class VideoDeviceControllerGetDevicePropertyStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  UnknownFailure(1),
  BufferTooSmall(2),
  NotSupported(3),
  DeviceNotAvailable(4),
  MaxPropertyValueSizeTooSmall(5),
  MaxPropertyValueSizeRequired(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      VideoDeviceControllerGetDevicePropertyStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> UnknownFailure
      2 -> BufferTooSmall
      3 -> NotSupported
      4 -> DeviceNotAvailable
      5 -> MaxPropertyValueSizeTooSmall
      6 -> MaxPropertyValueSizeRequired
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<VideoDeviceControllerGetDevicePropertyStatus> {
    public fun setValue(newValue: VideoDeviceControllerGetDevicePropertyStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): VideoDeviceControllerGetDevicePropertyStatus =
        VideoDeviceControllerGetDevicePropertyStatus.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<VideoDeviceControllerGetDevicePropertyStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): VideoDeviceControllerGetDevicePropertyStatus =
        VideoDeviceControllerGetDevicePropertyStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: VideoDeviceControllerGetDevicePropertyStatus): Int = obj.value
  }
}
