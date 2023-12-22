package Windows.Media.MediaProperties

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

@ABIMarker(VideoEncodingQuality.ABI::class)
@Signature("enum(Windows.Media.MediaProperties.VideoEncodingQuality;i4)")
@WinRTByReference(brClass = VideoEncodingQuality.ByReference::class)
public enum class VideoEncodingQuality(
  public val value: Int
) : NativeMapped {
  Auto(0),
  HD1080p(1),
  HD720p(2),
  Wvga(3),
  Ntsc(4),
  Pal(5),
  Vga(6),
  Qvga(7),
  Uhd2160p(8),
  Uhd4320p(9),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      VideoEncodingQuality {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Auto
      1 -> HD1080p
      2 -> HD720p
      3 -> Wvga
      4 -> Ntsc
      5 -> Pal
      6 -> Vga
      7 -> Qvga
      8 -> Uhd2160p
      9 -> Uhd4320p
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<VideoEncodingQuality> {
    public fun setValue(newValue: VideoEncodingQuality): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): VideoEncodingQuality =
        VideoEncodingQuality.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<VideoEncodingQuality, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): VideoEncodingQuality =
        VideoEncodingQuality.values()[0].fromNative(value, null)

    public override fun toNative(obj: VideoEncodingQuality): Int = obj.value
  }
}
