package Microsoft.UI.Xaml.Controls

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

@ABIMarker(TeachingTipPlacementMode.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.TeachingTipPlacementMode;i4)")
@WinRTByReference(brClass = TeachingTipPlacementMode.ByReference::class)
public enum class TeachingTipPlacementMode(
  public val value: Int
) : NativeMapped {
  Auto(0),
  Top(1),
  Bottom(2),
  Left(3),
  Right(4),
  TopRight(5),
  TopLeft(6),
  BottomRight(7),
  BottomLeft(8),
  LeftTop(9),
  LeftBottom(10),
  RightTop(11),
  RightBottom(12),
  Center(13),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TeachingTipPlacementMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Auto
      1 -> Top
      2 -> Bottom
      3 -> Left
      4 -> Right
      5 -> TopRight
      6 -> TopLeft
      7 -> BottomRight
      8 -> BottomLeft
      9 -> LeftTop
      10 -> LeftBottom
      11 -> RightTop
      12 -> RightBottom
      13 -> Center
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TeachingTipPlacementMode>
      {
    public fun setValue(newValue: TeachingTipPlacementMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TeachingTipPlacementMode =
        TeachingTipPlacementMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TeachingTipPlacementMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TeachingTipPlacementMode =
        TeachingTipPlacementMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: TeachingTipPlacementMode): Int = obj.value
  }
}
