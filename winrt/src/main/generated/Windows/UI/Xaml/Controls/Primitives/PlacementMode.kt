package Windows.UI.Xaml.Controls.Primitives

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

@ABIMarker(PlacementMode.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.Primitives.PlacementMode;i4)")
@WinRTByReference(brClass = PlacementMode.ByReference::class)
public enum class PlacementMode(
  public val value: Int
) : NativeMapped {
  Bottom(2),
  Left(9),
  Mouse(7),
  Right(4),
  Top(10),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PlacementMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      2 -> Bottom
      9 -> Left
      7 -> Mouse
      4 -> Right
      10 -> Top
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PlacementMode> {
    public fun setValue(newValue: PlacementMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PlacementMode =
        PlacementMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PlacementMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PlacementMode =
        PlacementMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: PlacementMode): Int = obj.value
  }
}
