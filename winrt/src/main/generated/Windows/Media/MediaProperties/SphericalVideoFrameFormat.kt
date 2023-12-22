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

@ABIMarker(SphericalVideoFrameFormat.ABI::class)
@Signature("enum(Windows.Media.MediaProperties.SphericalVideoFrameFormat;i4)")
@WinRTByReference(brClass = SphericalVideoFrameFormat.ByReference::class)
public enum class SphericalVideoFrameFormat(
  public val value: Int
) : NativeMapped {
  None(0),
  Unsupported(1),
  Equirectangular(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SphericalVideoFrameFormat {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Unsupported
      2 -> Equirectangular
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SphericalVideoFrameFormat>
      {
    public fun setValue(newValue: SphericalVideoFrameFormat): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SphericalVideoFrameFormat =
        SphericalVideoFrameFormat.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SphericalVideoFrameFormat, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SphericalVideoFrameFormat =
        SphericalVideoFrameFormat.values()[0].fromNative(value, null)

    public override fun toNative(obj: SphericalVideoFrameFormat): Int = obj.value
  }
}
