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

@ABIMarker(LinedFlowLayoutItemsJustification.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.LinedFlowLayoutItemsJustification;i4)")
@WinRTByReference(brClass = LinedFlowLayoutItemsJustification.ByReference::class)
public enum class LinedFlowLayoutItemsJustification(
  public val value: Int
) : NativeMapped {
  Start(0),
  Center(1),
  End(2),
  SpaceAround(3),
  SpaceBetween(4),
  SpaceEvenly(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      LinedFlowLayoutItemsJustification {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Start
      1 -> Center
      2 -> End
      3 -> SpaceAround
      4 -> SpaceBetween
      5 -> SpaceEvenly
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<LinedFlowLayoutItemsJustification> {
    public fun setValue(newValue: LinedFlowLayoutItemsJustification): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): LinedFlowLayoutItemsJustification =
        LinedFlowLayoutItemsJustification.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<LinedFlowLayoutItemsJustification, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): LinedFlowLayoutItemsJustification =
        LinedFlowLayoutItemsJustification.values()[0].fromNative(value, null)

    public override fun toNative(obj: LinedFlowLayoutItemsJustification): Int = obj.value
  }
}
