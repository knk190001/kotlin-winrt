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

@ABIMarker(GradientSpreadMethod.ABI::class)
@Signature("enum(Windows.UI.Xaml.Media.GradientSpreadMethod;i4)")
@WinRTByReference(brClass = GradientSpreadMethod.ByReference::class)
public enum class GradientSpreadMethod(
  public val value: Int
) : NativeMapped {
  Pad(0),
  Reflect(1),
  Repeat(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GradientSpreadMethod {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Pad
      1 -> Reflect
      2 -> Repeat
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<GradientSpreadMethod> {
    public fun setValue(newValue: GradientSpreadMethod): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GradientSpreadMethod =
        GradientSpreadMethod.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GradientSpreadMethod, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GradientSpreadMethod =
        GradientSpreadMethod.values()[0].fromNative(value, null)

    public override fun toNative(obj: GradientSpreadMethod): Int = obj.value
  }
}
