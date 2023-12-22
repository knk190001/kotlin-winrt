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

@ABIMarker(NavigationViewBackButtonVisible.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.NavigationViewBackButtonVisible;i4)")
@WinRTByReference(brClass = NavigationViewBackButtonVisible.ByReference::class)
public enum class NavigationViewBackButtonVisible(
  public val value: Int
) : NativeMapped {
  Collapsed(0),
  Visible(1),
  Auto(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      NavigationViewBackButtonVisible {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Collapsed
      1 -> Visible
      2 -> Auto
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<NavigationViewBackButtonVisible> {
    public fun setValue(newValue: NavigationViewBackButtonVisible): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): NavigationViewBackButtonVisible =
        NavigationViewBackButtonVisible.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<NavigationViewBackButtonVisible, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): NavigationViewBackButtonVisible =
        NavigationViewBackButtonVisible.values()[0].fromNative(value, null)

    public override fun toNative(obj: NavigationViewBackButtonVisible): Int = obj.value
  }
}
