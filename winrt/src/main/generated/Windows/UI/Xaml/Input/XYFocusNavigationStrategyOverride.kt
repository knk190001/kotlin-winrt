package Windows.UI.Xaml.Input

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

@ABIMarker(XYFocusNavigationStrategyOverride.ABI::class)
@Signature("enum(Windows.UI.Xaml.Input.XYFocusNavigationStrategyOverride;i4)")
@WinRTByReference(brClass = XYFocusNavigationStrategyOverride.ByReference::class)
public enum class XYFocusNavigationStrategyOverride(
  public val value: Int
) : NativeMapped {
  None(0),
  Auto(1),
  Projection(2),
  NavigationDirectionDistance(3),
  RectilinearDistance(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      XYFocusNavigationStrategyOverride {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Auto
      2 -> Projection
      3 -> NavigationDirectionDistance
      4 -> RectilinearDistance
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<XYFocusNavigationStrategyOverride> {
    public fun setValue(newValue: XYFocusNavigationStrategyOverride): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): XYFocusNavigationStrategyOverride =
        XYFocusNavigationStrategyOverride.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<XYFocusNavigationStrategyOverride, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): XYFocusNavigationStrategyOverride =
        XYFocusNavigationStrategyOverride.values()[0].fromNative(value, null)

    public override fun toNative(obj: XYFocusNavigationStrategyOverride): Int = obj.value
  }
}
