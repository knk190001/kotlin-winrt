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

@ABIMarker(RefreshVisualizerOrientation.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.RefreshVisualizerOrientation;i4)")
@WinRTByReference(brClass = RefreshVisualizerOrientation.ByReference::class)
public enum class RefreshVisualizerOrientation(
  public val value: Int
) : NativeMapped {
  Auto(0),
  Normal(1),
  Rotate90DegreesCounterclockwise(2),
  Rotate270DegreesCounterclockwise(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      RefreshVisualizerOrientation {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Auto
      1 -> Normal
      2 -> Rotate90DegreesCounterclockwise
      3 -> Rotate270DegreesCounterclockwise
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<RefreshVisualizerOrientation> {
    public fun setValue(newValue: RefreshVisualizerOrientation): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): RefreshVisualizerOrientation =
        RefreshVisualizerOrientation.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<RefreshVisualizerOrientation, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): RefreshVisualizerOrientation =
        RefreshVisualizerOrientation.values()[0].fromNative(value, null)

    public override fun toNative(obj: RefreshVisualizerOrientation): Int = obj.value
  }
}
