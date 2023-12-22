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

@ABIMarker(Stretch.ABI::class)
@Signature("enum(Windows.UI.Xaml.Media.Stretch;i4)")
@WinRTByReference(brClass = Stretch.ByReference::class)
public enum class Stretch(
  public val value: Int
) : NativeMapped {
  None(0),
  Fill(1),
  Uniform(2),
  UniformToFill(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?): Stretch {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Fill
      2 -> Uniform
      3 -> UniformToFill
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<Stretch> {
    public fun setValue(newValue: Stretch): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): Stretch = Stretch.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<Stretch, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): Stretch =
        Stretch.values()[0].fromNative(value, null)

    public override fun toNative(obj: Stretch): Int = obj.value
  }
}
