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

@ABIMarker(TwoPaneViewMode.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.TwoPaneViewMode;i4)")
@WinRTByReference(brClass = TwoPaneViewMode.ByReference::class)
public enum class TwoPaneViewMode(
  public val value: Int
) : NativeMapped {
  SinglePane(0),
  Wide(1),
  Tall(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TwoPaneViewMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> SinglePane
      1 -> Wide
      2 -> Tall
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TwoPaneViewMode> {
    public fun setValue(newValue: TwoPaneViewMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TwoPaneViewMode =
        TwoPaneViewMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TwoPaneViewMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TwoPaneViewMode =
        TwoPaneViewMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: TwoPaneViewMode): Int = obj.value
  }
}
