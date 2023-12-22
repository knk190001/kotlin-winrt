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

@ABIMarker(MediaDecoderStatus.ABI::class)
@Signature("enum(Windows.Media.Core.MediaDecoderStatus;i4)")
@WinRTByReference(brClass = MediaDecoderStatus.ByReference::class)
public enum class MediaDecoderStatus(
  public val value: Int
) : NativeMapped {
  FullySupported(0),
  UnsupportedSubtype(1),
  UnsupportedEncoderProperties(2),
  Degraded(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MediaDecoderStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> FullySupported
      1 -> UnsupportedSubtype
      2 -> UnsupportedEncoderProperties
      3 -> Degraded
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MediaDecoderStatus> {
    public fun setValue(newValue: MediaDecoderStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MediaDecoderStatus =
        MediaDecoderStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MediaDecoderStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MediaDecoderStatus =
        MediaDecoderStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: MediaDecoderStatus): Int = obj.value
  }
}
