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

@ABIMarker(MediaRotation.ABI::class)
@Signature("enum(Windows.Media.MediaProperties.MediaRotation;i4)")
@WinRTByReference(brClass = MediaRotation.ByReference::class)
public enum class MediaRotation(
  public val value: Int
) : NativeMapped {
  None(0),
  Clockwise90Degrees(1),
  Clockwise180Degrees(2),
  Clockwise270Degrees(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MediaRotation {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Clockwise90Degrees
      2 -> Clockwise180Degrees
      3 -> Clockwise270Degrees
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MediaRotation> {
    public fun setValue(newValue: MediaRotation): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MediaRotation =
        MediaRotation.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MediaRotation, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MediaRotation =
        MediaRotation.values()[0].fromNative(value, null)

    public override fun toNative(obj: MediaRotation): Int = obj.value
  }
}
