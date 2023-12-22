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

@ABIMarker(TwoPaneViewTallModeConfiguration.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.TwoPaneViewTallModeConfiguration;i4)")
@WinRTByReference(brClass = TwoPaneViewTallModeConfiguration.ByReference::class)
public enum class TwoPaneViewTallModeConfiguration(
  public val value: Int
) : NativeMapped {
  SinglePane(0),
  TopBottom(1),
  BottomTop(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TwoPaneViewTallModeConfiguration {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> SinglePane
      1 -> TopBottom
      2 -> BottomTop
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<TwoPaneViewTallModeConfiguration> {
    public fun setValue(newValue: TwoPaneViewTallModeConfiguration): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TwoPaneViewTallModeConfiguration =
        TwoPaneViewTallModeConfiguration.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TwoPaneViewTallModeConfiguration, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TwoPaneViewTallModeConfiguration =
        TwoPaneViewTallModeConfiguration.values()[0].fromNative(value, null)

    public override fun toNative(obj: TwoPaneViewTallModeConfiguration): Int = obj.value
  }
}
