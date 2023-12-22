package Windows.Media.Core

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

@ABIMarker(MediaTrackKind.ABI::class)
@Signature("enum(Windows.Media.Core.MediaTrackKind;i4)")
@WinRTByReference(brClass = MediaTrackKind.ByReference::class)
public enum class MediaTrackKind(
  public val value: Int
) : NativeMapped {
  Audio(0),
  Video(1),
  TimedMetadata(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MediaTrackKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Audio
      1 -> Video
      2 -> TimedMetadata
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MediaTrackKind> {
    public fun setValue(newValue: MediaTrackKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MediaTrackKind =
        MediaTrackKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MediaTrackKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MediaTrackKind =
        MediaTrackKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: MediaTrackKind): Int = obj.value
  }
}
