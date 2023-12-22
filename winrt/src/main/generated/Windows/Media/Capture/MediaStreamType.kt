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

@ABIMarker(MediaStreamType.ABI::class)
@Signature("enum(Windows.Media.Capture.MediaStreamType;i4)")
@WinRTByReference(brClass = MediaStreamType.ByReference::class)
public enum class MediaStreamType(
  public val value: Int
) : NativeMapped {
  VideoPreview(0),
  VideoRecord(1),
  Audio(2),
  Photo(3),
  Metadata(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MediaStreamType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> VideoPreview
      1 -> VideoRecord
      2 -> Audio
      3 -> Photo
      4 -> Metadata
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MediaStreamType> {
    public fun setValue(newValue: MediaStreamType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MediaStreamType =
        MediaStreamType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MediaStreamType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MediaStreamType =
        MediaStreamType.values()[0].fromNative(value, null)

    public override fun toNative(obj: MediaStreamType): Int = obj.value
  }
}
