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

@ABIMarker(NavigationViewSelectionFollowsFocus.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.NavigationViewSelectionFollowsFocus;i4)")
@WinRTByReference(brClass = NavigationViewSelectionFollowsFocus.ByReference::class)
public enum class NavigationViewSelectionFollowsFocus(
  public val value: Int
) : NativeMapped {
  Disabled(0),
  Enabled(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      NavigationViewSelectionFollowsFocus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Disabled
      1 -> Enabled
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<NavigationViewSelectionFollowsFocus> {
    public fun setValue(newValue: NavigationViewSelectionFollowsFocus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): NavigationViewSelectionFollowsFocus =
        NavigationViewSelectionFollowsFocus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<NavigationViewSelectionFollowsFocus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): NavigationViewSelectionFollowsFocus =
        NavigationViewSelectionFollowsFocus.values()[0].fromNative(value, null)

    public override fun toNative(obj: NavigationViewSelectionFollowsFocus): Int = obj.value
  }
}
