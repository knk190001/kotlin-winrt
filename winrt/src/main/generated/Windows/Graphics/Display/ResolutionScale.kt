package Windows.Graphics.Display

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

@ABIMarker(ResolutionScale.ABI::class)
@Signature("enum(Windows.Graphics.Display.ResolutionScale;i4)")
@WinRTByReference(brClass = ResolutionScale.ByReference::class)
public enum class ResolutionScale(
  public val value: Int
) : NativeMapped {
  Invalid(0),
  Scale100Percent(100),
  Scale120Percent(120),
  Scale125Percent(125),
  Scale140Percent(140),
  Scale150Percent(150),
  Scale160Percent(160),
  Scale175Percent(175),
  Scale180Percent(180),
  Scale200Percent(200),
  Scale225Percent(225),
  Scale250Percent(250),
  Scale300Percent(300),
  Scale350Percent(350),
  Scale400Percent(400),
  Scale450Percent(450),
  Scale500Percent(500),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ResolutionScale {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Invalid
      100 -> Scale100Percent
      120 -> Scale120Percent
      125 -> Scale125Percent
      140 -> Scale140Percent
      150 -> Scale150Percent
      160 -> Scale160Percent
      175 -> Scale175Percent
      180 -> Scale180Percent
      200 -> Scale200Percent
      225 -> Scale225Percent
      250 -> Scale250Percent
      300 -> Scale300Percent
      350 -> Scale350Percent
      400 -> Scale400Percent
      450 -> Scale450Percent
      500 -> Scale500Percent
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ResolutionScale> {
    public fun setValue(newValue: ResolutionScale): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ResolutionScale =
        ResolutionScale.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ResolutionScale, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ResolutionScale =
        ResolutionScale.values()[0].fromNative(value, null)

    public override fun toNative(obj: ResolutionScale): Int = obj.value
  }
}
