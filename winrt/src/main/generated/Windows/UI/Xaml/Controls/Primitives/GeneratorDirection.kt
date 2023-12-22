package Windows.UI.Xaml.Controls.Primitives

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

@ABIMarker(GeneratorDirection.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.Primitives.GeneratorDirection;i4)")
@WinRTByReference(brClass = GeneratorDirection.ByReference::class)
public enum class GeneratorDirection(
  public val value: Int
) : NativeMapped {
  Forward(0),
  Backward(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GeneratorDirection {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Forward
      1 -> Backward
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<GeneratorDirection> {
    public fun setValue(newValue: GeneratorDirection): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GeneratorDirection =
        GeneratorDirection.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GeneratorDirection, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GeneratorDirection =
        GeneratorDirection.values()[0].fromNative(value, null)

    public override fun toNative(obj: GeneratorDirection): Int = obj.value
  }
}
