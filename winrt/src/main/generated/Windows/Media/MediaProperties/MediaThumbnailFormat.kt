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

@ABIMarker(MediaThumbnailFormat.ABI::class)
@Signature("enum(Windows.Media.MediaProperties.MediaThumbnailFormat;i4)")
@WinRTByReference(brClass = MediaThumbnailFormat.ByReference::class)
public enum class MediaThumbnailFormat(
  public val value: Int
) : NativeMapped {
  Bmp(0),
  Bgra8(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MediaThumbnailFormat {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Bmp
      1 -> Bgra8
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MediaThumbnailFormat> {
    public fun setValue(newValue: MediaThumbnailFormat): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MediaThumbnailFormat =
        MediaThumbnailFormat.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MediaThumbnailFormat, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MediaThumbnailFormat =
        MediaThumbnailFormat.values()[0].fromNative(value, null)

    public override fun toNative(obj: MediaThumbnailFormat): Int = obj.value
  }
}
