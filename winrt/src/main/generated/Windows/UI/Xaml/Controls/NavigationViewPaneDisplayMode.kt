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

@ABIMarker(NavigationViewPaneDisplayMode.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.NavigationViewPaneDisplayMode;i4)")
@WinRTByReference(brClass = NavigationViewPaneDisplayMode.ByReference::class)
public enum class NavigationViewPaneDisplayMode(
  public val value: Int
) : NativeMapped {
  Auto(0),
  Left(1),
  Top(2),
  LeftCompact(3),
  LeftMinimal(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      NavigationViewPaneDisplayMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Auto
      1 -> Left
      2 -> Top
      3 -> LeftCompact
      4 -> LeftMinimal
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<NavigationViewPaneDisplayMode> {
    public fun setValue(newValue: NavigationViewPaneDisplayMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): NavigationViewPaneDisplayMode =
        NavigationViewPaneDisplayMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<NavigationViewPaneDisplayMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): NavigationViewPaneDisplayMode =
        NavigationViewPaneDisplayMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: NavigationViewPaneDisplayMode): Int = obj.value
  }
}
