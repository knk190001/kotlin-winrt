package Microsoft.UI.Composition.Experimental

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

@ABIMarker(ExpExpressionNotificationProperty.ABI::class)
@Signature("enum(Microsoft.UI.Composition.Experimental.ExpExpressionNotificationProperty;i4)")
@WinRTByReference(brClass = ExpExpressionNotificationProperty.ByReference::class)
public enum class ExpExpressionNotificationProperty(
  public val value: Int
) : NativeMapped {
  Undefined(0),
  Clip(1),
  Offset(2),
  Opacity(3),
  Size(4),
  RelativeOffset(5),
  RelativeSize(6),
  AnchorPoint(7),
  CenterPoint(8),
  Orientation(9),
  RotationAngle(10),
  RotationAxis(11),
  Scale(12),
  TransformMatrix(13),
  BottomInset(14),
  LeftInset(15),
  RightInset(16),
  TopInset(17),
  LeftRadiusX(18),
  LeftRadiusY(19),
  BottomRightRadiusX(20),
  BottomRightRadiusY(21),
  TopLeftRadiusX(22),
  TopLeftRadiusY(23),
  TopRightRadiusX(24),
  TopRightRadiusY(25),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ExpExpressionNotificationProperty {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Undefined
      1 -> Clip
      2 -> Offset
      3 -> Opacity
      4 -> Size
      5 -> RelativeOffset
      6 -> RelativeSize
      7 -> AnchorPoint
      8 -> CenterPoint
      9 -> Orientation
      10 -> RotationAngle
      11 -> RotationAxis
      12 -> Scale
      13 -> TransformMatrix
      14 -> BottomInset
      15 -> LeftInset
      16 -> RightInset
      17 -> TopInset
      18 -> LeftRadiusX
      19 -> LeftRadiusY
      20 -> BottomRightRadiusX
      21 -> BottomRightRadiusY
      22 -> TopLeftRadiusX
      23 -> TopLeftRadiusY
      24 -> TopRightRadiusX
      25 -> TopRightRadiusY
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ExpExpressionNotificationProperty> {
    public fun setValue(newValue: ExpExpressionNotificationProperty): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ExpExpressionNotificationProperty =
        ExpExpressionNotificationProperty.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ExpExpressionNotificationProperty, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ExpExpressionNotificationProperty =
        ExpExpressionNotificationProperty.values()[0].fromNative(value, null)

    public override fun toNative(obj: ExpExpressionNotificationProperty): Int = obj.value
  }
}
