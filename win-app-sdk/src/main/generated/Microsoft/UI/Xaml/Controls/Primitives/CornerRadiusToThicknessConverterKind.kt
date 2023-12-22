package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(CornerRadiusToThicknessConverterKind.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.Primitives.CornerRadiusToThicknessConverterKind;i4)")
@WinRTByReference(brClass = CornerRadiusToThicknessConverterKind.ByReference::class)
public enum class CornerRadiusToThicknessConverterKind(
  public val value: Int
) : NativeMapped {
  FilterTopAndBottomFromLeft(0),
  FilterTopAndBottomFromRight(1),
  FilterLeftAndRightFromTop(2),
  FilterLeftAndRightFromBottom(3),
  FilterTopFromTopLeft(4),
  FilterTopFromTopRight(5),
  FilterRightFromTopRight(6),
  FilterRightFromBottomRight(7),
  FilterBottomFromBottomRight(8),
  FilterBottomFromBottomLeft(9),
  FilterLeftFromBottomLeft(10),
  FilterLeftFromTopLeft(11),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CornerRadiusToThicknessConverterKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> FilterTopAndBottomFromLeft
      1 -> FilterTopAndBottomFromRight
      2 -> FilterLeftAndRightFromTop
      3 -> FilterLeftAndRightFromBottom
      4 -> FilterTopFromTopLeft
      5 -> FilterTopFromTopRight
      6 -> FilterRightFromTopRight
      7 -> FilterRightFromBottomRight
      8 -> FilterBottomFromBottomRight
      9 -> FilterBottomFromBottomLeft
      10 -> FilterLeftFromBottomLeft
      11 -> FilterLeftFromTopLeft
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CornerRadiusToThicknessConverterKind> {
    public fun setValue(newValue: CornerRadiusToThicknessConverterKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CornerRadiusToThicknessConverterKind =
        CornerRadiusToThicknessConverterKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CornerRadiusToThicknessConverterKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CornerRadiusToThicknessConverterKind =
        CornerRadiusToThicknessConverterKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: CornerRadiusToThicknessConverterKind): Int = obj.value
  }
}
