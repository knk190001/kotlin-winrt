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

@ABIMarker(MediaFrameSourceKind.ABI::class)
@Signature("enum(Windows.Media.Capture.Frames.MediaFrameSourceKind;i4)")
@WinRTByReference(brClass = MediaFrameSourceKind.ByReference::class)
public enum class MediaFrameSourceKind(
  public val value: Int
) : NativeMapped {
  Custom(0),
  Color(1),
  Infrared(2),
  Depth(3),
  Audio(4),
  Image(5),
  Metadata(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MediaFrameSourceKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Custom
      1 -> Color
      2 -> Infrared
      3 -> Depth
      4 -> Audio
      5 -> Image
      6 -> Metadata
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MediaFrameSourceKind> {
    public fun setValue(newValue: MediaFrameSourceKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MediaFrameSourceKind =
        MediaFrameSourceKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MediaFrameSourceKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MediaFrameSourceKind =
        MediaFrameSourceKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: MediaFrameSourceKind): Int = obj.value
  }
}
