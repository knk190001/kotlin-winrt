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

@ABIMarker(StreamingCaptureMode.ABI::class)
@Signature("enum(Windows.Media.Capture.StreamingCaptureMode;i4)")
@WinRTByReference(brClass = StreamingCaptureMode.ByReference::class)
public enum class StreamingCaptureMode(
  public val value: Int
) : NativeMapped {
  AudioAndVideo(0),
  Audio(1),
  Video(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      StreamingCaptureMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> AudioAndVideo
      1 -> Audio
      2 -> Video
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<StreamingCaptureMode> {
    public fun setValue(newValue: StreamingCaptureMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): StreamingCaptureMode =
        StreamingCaptureMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<StreamingCaptureMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): StreamingCaptureMode =
        StreamingCaptureMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: StreamingCaptureMode): Int = obj.value
  }
}
