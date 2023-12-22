package Windows.UI.Xaml.Media

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

@ABIMarker(StyleSimulations.ABI::class)
@Signature("enum(Windows.UI.Xaml.Media.StyleSimulations;i4)")
@WinRTByReference(brClass = StyleSimulations.ByReference::class)
public enum class StyleSimulations(
  public val value: Int
) : NativeMapped {
  None(0),
  BoldSimulation(1),
  ItalicSimulation(2),
  BoldItalicSimulation(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      StyleSimulations {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> BoldSimulation
      2 -> ItalicSimulation
      3 -> BoldItalicSimulation
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<StyleSimulations> {
    public fun setValue(newValue: StyleSimulations): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): StyleSimulations =
        StyleSimulations.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<StyleSimulations, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): StyleSimulations =
        StyleSimulations.values()[0].fromNative(value, null)

    public override fun toNative(obj: StyleSimulations): Int = obj.value
  }
}
