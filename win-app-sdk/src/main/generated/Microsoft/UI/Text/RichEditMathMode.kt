package Microsoft.UI.Text

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

@ABIMarker(RichEditMathMode.ABI::class)
@Signature("enum(Microsoft.UI.Text.RichEditMathMode;i4)")
@WinRTByReference(brClass = RichEditMathMode.ByReference::class)
public enum class RichEditMathMode(
  public val value: Int
) : NativeMapped {
  NoMath(0),
  MathOnly(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      RichEditMathMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NoMath
      1 -> MathOnly
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<RichEditMathMode> {
    public fun setValue(newValue: RichEditMathMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): RichEditMathMode =
        RichEditMathMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<RichEditMathMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): RichEditMathMode =
        RichEditMathMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: RichEditMathMode): Int = obj.value
  }
}
