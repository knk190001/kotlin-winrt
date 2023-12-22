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

@ABIMarker(BitmapPixelFormat.ABI::class)
@Signature("enum(Windows.Graphics.Imaging.BitmapPixelFormat;i4)")
@WinRTByReference(brClass = BitmapPixelFormat.ByReference::class)
public enum class BitmapPixelFormat(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Rgba16(12),
  Rgba8(30),
  Gray16(57),
  Gray8(62),
  Bgra8(87),
  Nv12(103),
  P010(104),
  Yuy2(107),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      BitmapPixelFormat {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      12 -> Rgba16
      30 -> Rgba8
      57 -> Gray16
      62 -> Gray8
      87 -> Bgra8
      103 -> Nv12
      104 -> P010
      107 -> Yuy2
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<BitmapPixelFormat> {
    public fun setValue(newValue: BitmapPixelFormat): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): BitmapPixelFormat =
        BitmapPixelFormat.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<BitmapPixelFormat, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): BitmapPixelFormat =
        BitmapPixelFormat.values()[0].fromNative(value, null)

    public override fun toNative(obj: BitmapPixelFormat): Int = obj.value
  }
}
