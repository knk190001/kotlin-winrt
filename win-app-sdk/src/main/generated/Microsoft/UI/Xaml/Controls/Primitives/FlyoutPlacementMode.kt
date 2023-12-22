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

@ABIMarker(FlyoutPlacementMode.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.Primitives.FlyoutPlacementMode;i4)")
@WinRTByReference(brClass = FlyoutPlacementMode.ByReference::class)
public enum class FlyoutPlacementMode(
  public val value: Int
) : NativeMapped {
  Top(0),
  Bottom(1),
  Left(2),
  Right(3),
  Full(4),
  TopEdgeAlignedLeft(5),
  TopEdgeAlignedRight(6),
  BottomEdgeAlignedLeft(7),
  BottomEdgeAlignedRight(8),
  LeftEdgeAlignedTop(9),
  LeftEdgeAlignedBottom(10),
  RightEdgeAlignedTop(11),
  RightEdgeAlignedBottom(12),
  Auto(13),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      FlyoutPlacementMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Top
      1 -> Bottom
      2 -> Left
      3 -> Right
      4 -> Full
      5 -> TopEdgeAlignedLeft
      6 -> TopEdgeAlignedRight
      7 -> BottomEdgeAlignedLeft
      8 -> BottomEdgeAlignedRight
      9 -> LeftEdgeAlignedTop
      10 -> LeftEdgeAlignedBottom
      11 -> RightEdgeAlignedTop
      12 -> RightEdgeAlignedBottom
      13 -> Auto
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<FlyoutPlacementMode> {
    public fun setValue(newValue: FlyoutPlacementMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): FlyoutPlacementMode =
        FlyoutPlacementMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<FlyoutPlacementMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): FlyoutPlacementMode =
        FlyoutPlacementMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: FlyoutPlacementMode): Int = obj.value
  }
}
