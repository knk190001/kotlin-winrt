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

@ABIMarker(PopupPlacementMode.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.Primitives.PopupPlacementMode;i4)")
@WinRTByReference(brClass = PopupPlacementMode.ByReference::class)
public enum class PopupPlacementMode(
  public val value: Int
) : NativeMapped {
  Auto(0),
  Top(1),
  Bottom(2),
  Left(3),
  Right(4),
  TopEdgeAlignedLeft(5),
  TopEdgeAlignedRight(6),
  BottomEdgeAlignedLeft(7),
  BottomEdgeAlignedRight(8),
  LeftEdgeAlignedTop(9),
  LeftEdgeAlignedBottom(10),
  RightEdgeAlignedTop(11),
  RightEdgeAlignedBottom(12),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PopupPlacementMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Auto
      1 -> Top
      2 -> Bottom
      3 -> Left
      4 -> Right
      5 -> TopEdgeAlignedLeft
      6 -> TopEdgeAlignedRight
      7 -> BottomEdgeAlignedLeft
      8 -> BottomEdgeAlignedRight
      9 -> LeftEdgeAlignedTop
      10 -> LeftEdgeAlignedBottom
      11 -> RightEdgeAlignedTop
      12 -> RightEdgeAlignedBottom
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PopupPlacementMode> {
    public fun setValue(newValue: PopupPlacementMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PopupPlacementMode =
        PopupPlacementMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PopupPlacementMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PopupPlacementMode =
        PopupPlacementMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: PopupPlacementMode): Int = obj.value
  }
}
