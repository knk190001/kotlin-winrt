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

@ABIMarker(CompositionColorSpace.ABI::class)
@Signature("enum(Windows.UI.Composition.CompositionColorSpace;i4)")
@WinRTByReference(brClass = CompositionColorSpace.ByReference::class)
public enum class CompositionColorSpace(
  public val value: Int
) : NativeMapped {
  Auto(0),
  Hsl(1),
  Rgb(2),
  HslLinear(3),
  RgbLinear(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CompositionColorSpace {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Auto
      1 -> Hsl
      2 -> Rgb
      3 -> HslLinear
      4 -> RgbLinear
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CompositionColorSpace> {
    public fun setValue(newValue: CompositionColorSpace): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CompositionColorSpace =
        CompositionColorSpace.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CompositionColorSpace, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CompositionColorSpace =
        CompositionColorSpace.values()[0].fromNative(value, null)

    public override fun toNative(obj: CompositionColorSpace): Int = obj.value
  }
}
