package Windows.Media.Capture

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

@ABIMarker(VideoDeviceCharacteristic.ABI::class)
@Signature("enum(Windows.Media.Capture.VideoDeviceCharacteristic;i4)")
@WinRTByReference(brClass = VideoDeviceCharacteristic.ByReference::class)
public enum class VideoDeviceCharacteristic(
  public val value: Int
) : NativeMapped {
  AllStreamsIndependent(0),
  PreviewRecordStreamsIdentical(1),
  PreviewPhotoStreamsIdentical(2),
  RecordPhotoStreamsIdentical(3),
  AllStreamsIdentical(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      VideoDeviceCharacteristic {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> AllStreamsIndependent
      1 -> PreviewRecordStreamsIdentical
      2 -> PreviewPhotoStreamsIdentical
      3 -> RecordPhotoStreamsIdentical
      4 -> AllStreamsIdentical
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<VideoDeviceCharacteristic>
      {
    public fun setValue(newValue: VideoDeviceCharacteristic): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): VideoDeviceCharacteristic =
        VideoDeviceCharacteristic.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<VideoDeviceCharacteristic, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): VideoDeviceCharacteristic =
        VideoDeviceCharacteristic.values()[0].fromNative(value, null)

    public override fun toNative(obj: VideoDeviceCharacteristic): Int = obj.value
  }
}
