package Windows.UI.Composition

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

@ABIMarker(CompositionBitmapInterpolationMode.ABI::class)
@Signature("enum(Windows.UI.Composition.CompositionBitmapInterpolationMode;i4)")
@WinRTByReference(brClass = CompositionBitmapInterpolationMode.ByReference::class)
public enum class CompositionBitmapInterpolationMode(
  public val value: Int
) : NativeMapped {
  NearestNeighbor(0),
  Linear(1),
  MagLinearMinLinearMipLinear(2),
  MagLinearMinLinearMipNearest(3),
  MagLinearMinNearestMipLinear(4),
  MagLinearMinNearestMipNearest(5),
  MagNearestMinLinearMipLinear(6),
  MagNearestMinLinearMipNearest(7),
  MagNearestMinNearestMipLinear(8),
  MagNearestMinNearestMipNearest(9),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CompositionBitmapInterpolationMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NearestNeighbor
      1 -> Linear
      2 -> MagLinearMinLinearMipLinear
      3 -> MagLinearMinLinearMipNearest
      4 -> MagLinearMinNearestMipLinear
      5 -> MagLinearMinNearestMipNearest
      6 -> MagNearestMinLinearMipLinear
      7 -> MagNearestMinLinearMipNearest
      8 -> MagNearestMinNearestMipLinear
      9 -> MagNearestMinNearestMipNearest
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CompositionBitmapInterpolationMode> {
    public fun setValue(newValue: CompositionBitmapInterpolationMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CompositionBitmapInterpolationMode =
        CompositionBitmapInterpolationMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CompositionBitmapInterpolationMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CompositionBitmapInterpolationMode =
        CompositionBitmapInterpolationMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: CompositionBitmapInterpolationMode): Int = obj.value
  }
}
