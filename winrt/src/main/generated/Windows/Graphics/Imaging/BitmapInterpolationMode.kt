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

@ABIMarker(BitmapInterpolationMode.ABI::class)
@Signature("enum(Windows.Graphics.Imaging.BitmapInterpolationMode;i4)")
@WinRTByReference(brClass = BitmapInterpolationMode.ByReference::class)
public enum class BitmapInterpolationMode(
  public val value: Int
) : NativeMapped {
  NearestNeighbor(0),
  Linear(1),
  Cubic(2),
  Fant(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      BitmapInterpolationMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NearestNeighbor
      1 -> Linear
      2 -> Cubic
      3 -> Fant
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<BitmapInterpolationMode> {
    public fun setValue(newValue: BitmapInterpolationMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): BitmapInterpolationMode =
        BitmapInterpolationMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<BitmapInterpolationMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): BitmapInterpolationMode =
        BitmapInterpolationMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: BitmapInterpolationMode): Int = obj.value
  }
}
