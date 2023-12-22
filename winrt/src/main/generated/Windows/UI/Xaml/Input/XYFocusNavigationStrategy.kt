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

@ABIMarker(XYFocusNavigationStrategy.ABI::class)
@Signature("enum(Windows.UI.Xaml.Input.XYFocusNavigationStrategy;i4)")
@WinRTByReference(brClass = XYFocusNavigationStrategy.ByReference::class)
public enum class XYFocusNavigationStrategy(
  public val value: Int
) : NativeMapped {
  Auto(0),
  Projection(1),
  NavigationDirectionDistance(2),
  RectilinearDistance(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      XYFocusNavigationStrategy {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Auto
      1 -> Projection
      2 -> NavigationDirectionDistance
      3 -> RectilinearDistance
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<XYFocusNavigationStrategy>
      {
    public fun setValue(newValue: XYFocusNavigationStrategy): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): XYFocusNavigationStrategy =
        XYFocusNavigationStrategy.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<XYFocusNavigationStrategy, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): XYFocusNavigationStrategy =
        XYFocusNavigationStrategy.values()[0].fromNative(value, null)

    public override fun toNative(obj: XYFocusNavigationStrategy): Int = obj.value
  }
}
