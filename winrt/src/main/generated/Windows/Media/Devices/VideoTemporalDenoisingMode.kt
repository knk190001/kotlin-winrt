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

@ABIMarker(VideoTemporalDenoisingMode.ABI::class)
@Signature("enum(Windows.Media.Devices.VideoTemporalDenoisingMode;i4)")
@WinRTByReference(brClass = VideoTemporalDenoisingMode.ByReference::class)
public enum class VideoTemporalDenoisingMode(
  public val value: Int
) : NativeMapped {
  Off(0),
  On(1),
  Auto(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      VideoTemporalDenoisingMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Off
      1 -> On
      2 -> Auto
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<VideoTemporalDenoisingMode> {
    public fun setValue(newValue: VideoTemporalDenoisingMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): VideoTemporalDenoisingMode =
        VideoTemporalDenoisingMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<VideoTemporalDenoisingMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): VideoTemporalDenoisingMode =
        VideoTemporalDenoisingMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: VideoTemporalDenoisingMode): Int = obj.value
  }
}
