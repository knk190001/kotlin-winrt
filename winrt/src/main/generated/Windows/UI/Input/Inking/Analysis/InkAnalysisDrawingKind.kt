package Windows.UI.Input.Inking.Analysis

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

@ABIMarker(InkAnalysisDrawingKind.ABI::class)
@Signature("enum(Windows.UI.Input.Inking.Analysis.InkAnalysisDrawingKind;i4)")
@WinRTByReference(brClass = InkAnalysisDrawingKind.ByReference::class)
public enum class InkAnalysisDrawingKind(
  public val value: Int
) : NativeMapped {
  Drawing(0),
  Circle(1),
  Ellipse(2),
  Triangle(3),
  IsoscelesTriangle(4),
  EquilateralTriangle(5),
  RightTriangle(6),
  Quadrilateral(7),
  Rectangle(8),
  Square(9),
  Diamond(10),
  Trapezoid(11),
  Parallelogram(12),
  Pentagon(13),
  Hexagon(14),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      InkAnalysisDrawingKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Drawing
      1 -> Circle
      2 -> Ellipse
      3 -> Triangle
      4 -> IsoscelesTriangle
      5 -> EquilateralTriangle
      6 -> RightTriangle
      7 -> Quadrilateral
      8 -> Rectangle
      9 -> Square
      10 -> Diamond
      11 -> Trapezoid
      12 -> Parallelogram
      13 -> Pentagon
      14 -> Hexagon
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<InkAnalysisDrawingKind> {
    public fun setValue(newValue: InkAnalysisDrawingKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): InkAnalysisDrawingKind =
        InkAnalysisDrawingKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<InkAnalysisDrawingKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): InkAnalysisDrawingKind =
        InkAnalysisDrawingKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: InkAnalysisDrawingKind): Int = obj.value
  }
}
