package Windows.UI.Xaml.Controls

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

@ABIMarker(HandwritingPanelPlacementAlignment.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.HandwritingPanelPlacementAlignment;i4)")
@WinRTByReference(brClass = HandwritingPanelPlacementAlignment.ByReference::class)
public enum class HandwritingPanelPlacementAlignment(
  public val value: Int
) : NativeMapped {
  Auto(0),
  TopLeft(1),
  TopRight(2),
  BottomLeft(3),
  BottomRight(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      HandwritingPanelPlacementAlignment {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Auto
      1 -> TopLeft
      2 -> TopRight
      3 -> BottomLeft
      4 -> BottomRight
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<HandwritingPanelPlacementAlignment> {
    public fun setValue(newValue: HandwritingPanelPlacementAlignment): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): HandwritingPanelPlacementAlignment =
        HandwritingPanelPlacementAlignment.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<HandwritingPanelPlacementAlignment, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): HandwritingPanelPlacementAlignment =
        HandwritingPanelPlacementAlignment.values()[0].fromNative(value, null)

    public override fun toNative(obj: HandwritingPanelPlacementAlignment): Int = obj.value
  }
}
