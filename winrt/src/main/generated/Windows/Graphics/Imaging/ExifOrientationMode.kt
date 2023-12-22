package Windows.Graphics.Imaging

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

@ABIMarker(ExifOrientationMode.ABI::class)
@Signature("enum(Windows.Graphics.Imaging.ExifOrientationMode;i4)")
@WinRTByReference(brClass = ExifOrientationMode.ByReference::class)
public enum class ExifOrientationMode(
  public val value: Int
) : NativeMapped {
  IgnoreExifOrientation(0),
  RespectExifOrientation(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ExifOrientationMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> IgnoreExifOrientation
      1 -> RespectExifOrientation
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ExifOrientationMode> {
    public fun setValue(newValue: ExifOrientationMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ExifOrientationMode =
        ExifOrientationMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ExifOrientationMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ExifOrientationMode =
        ExifOrientationMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: ExifOrientationMode): Int = obj.value
  }
}
